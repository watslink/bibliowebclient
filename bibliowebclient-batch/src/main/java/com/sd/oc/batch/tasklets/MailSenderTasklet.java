package com.sd.oc.batch.tasklets;

import com.sd.oc.batch.EmailService.EmailService;


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

//        List<User> listUser=userServiceAPI.findAllUsers();
//        for (User user:listUser) {
//
//        }
//        List<Borrowing> borrowingsWhoNeedRecallList=borrowingServiceAPI.findAllBorrowingOutOfTime();
//
//        for(Borrowing borrowing: borrowingsWhoNeedRecallList){
//            String to=borrowing.getUser().getMail();
//            String subject="Fin de prêt";
//            String text="Bonjour "+borrowing.getUser().getUsername()+","+ls
//                    +"Merci de venir rendre rapidement ce(s) livre(s) à la bibliothéque:"+ls
//                    +"- "+borrowing.getBook().getTitle()+" ("+borrowing.getBook().getAuthor()+")"+ls
//                    +ls+ls
//                    +"Cordialement,"+ls
//                    +"BiblioOC.";
//
//            emailService.sendSimpleMessage(to, subject, text);
//        }
        return RepeatStatus.FINISHED;
    }
}
