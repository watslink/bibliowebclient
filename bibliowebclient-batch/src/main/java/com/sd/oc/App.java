package com.sd.oc;

import com.sd.oc.batch.ConfigurationBatch;
import com.sd.oc.batch.launchers.MailSenderLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBatch.class);
    }
}
