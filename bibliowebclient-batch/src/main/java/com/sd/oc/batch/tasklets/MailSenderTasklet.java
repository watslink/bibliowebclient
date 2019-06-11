package com.sd.oc.batch.tasklets;

import com.sd.oc.batch.EmailService.EmailService;


import com.sd.oc.serviceproxy.generated.borrowingAPI.Borrowing;
import com.sd.oc.serviceproxy.generated.borrowingAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.userAPI.User;
import com.sd.oc.serviceproxy.generated.userAPI.UserServiceAPI;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MailSenderTasklet implements Tasklet {


    @Autowired
    BorrowingServiceAPI borrowingServiceAPI;

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    EmailService emailService;

    private String ls= System.lineSeparator();

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("Batch execute");

        List<User> listUser=userServiceAPI.findAllUsers();
        for (User user:listUser) {
            List<Borrowing> borrowingsWhoNeedRecallList=borrowingServiceAPI.findAllBorrowingOutOfTimeOfUser(user.getUserId());
            if(borrowingsWhoNeedRecallList!=null){
                String to=user.getMail();
                String subject="Fin de prêt";
                StringBuilder text= new StringBuilder("Bonjour " + user.getUsername() + "," + ls+ls
                        + "Merci de venir rendre rapidement ce(s) livre(s) à la bibliothéque:" + ls);
                for(Borrowing borrowing: borrowingsWhoNeedRecallList){
                    text.append("- ").append(borrowing.getBook().getTitle()).append(" (").append(borrowing.getBook().getAuthor()).append(")").append(ls);
                }
                text.append(ls).append(ls).append("Cordialement,").append(ls).append("BiblioOC.");

                emailService.sendSimpleMessage(to, subject, text.toString());
            }
        }
        return RepeatStatus.FINISHED;
    }
}
