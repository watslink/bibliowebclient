package com.sd.oc.batch;

import com.sd.oc.batch.tasklets.MailSenderTasklet;

import com.sd.oc.serviceproxy.ConfigurationServiceAPI;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

import java.util.Properties;


@Configuration
@EnableBatchProcessing
@EnableScheduling

@ComponentScan("com.sd.oc.batch")
@Import(ConfigurationServiceAPI.class)
public class ConfigurationBatch {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    MailSenderTasklet mailSenderTasklet;


    @Bean
    public Job mailsenderJob(final Step mailsenderStep) {
        return jobBuilderFactory.get("mailSenderJob").start(mailsenderStep).build();
    }

    @Bean
    public Step mailsenderStep(){
        return this.stepBuilderFactory.get("mailSenderStep")
                .tasklet(mailSenderTasklet).build();
    }

    @Bean
    public TaskScheduler taskScheduler() {
        return new ConcurrentTaskScheduler();
    }

    @Bean
    public JavaMailSender javaMailSender(final JavaMailSenderProperties jmsProp) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setPort(587);
        mailSender.setUsername(jmsProp.getMailUsername());
        mailSender.setPassword(jmsProp.getMailPassword());

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.host", jmsProp.getHost());
        props.put("mail.transport.protocol", jmsProp.getProtocol() );
        props.put("mail.smtp.ssl.trust", jmsProp.getHost());
        props.put("mail.smtp.auth", jmsProp.getAuth() );
        props.put("mail.smtp.starttls.enable", jmsProp.getEnable());
        props.put("mail.debug", jmsProp.getDebug());

        return mailSender;
    }
}
