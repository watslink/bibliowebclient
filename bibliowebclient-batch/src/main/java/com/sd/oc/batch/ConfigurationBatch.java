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
@PropertySource("classpath:batch.properties")
@ComponentScan("com.sd.oc.batch")
@Import(ConfigurationServiceAPI.class)
public class ConfigurationBatch {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    MailSenderTasklet mailSenderTasklet;

    @Value("${host}")
    static String host;
    @Value("${portSender}")
    static int portSender;

    @Value("${mail.username}")
    static String mailUsername;
    @Value("${mail.password}")
    static String mailPassword;

    @Value("${mail.transport.protocol}")
    static String protocol;
    @Value("$mail.smtp.auth}")
    static Boolean auth;
    @Value("${mail.smtp.starttls.enable}")
    static Boolean enable;
    @Value("${mail.debug}")
    static Boolean debug;

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
    public static JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("biblioocsender@gmail.com");
        mailSender.setPassword("biblioOC1234");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp" );
        props.put("mail.smtp.auth", true );
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.debug", true);

        return mailSender;
    }
}
