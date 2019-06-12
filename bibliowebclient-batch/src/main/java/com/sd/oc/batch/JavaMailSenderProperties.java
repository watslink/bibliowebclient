package com.sd.oc.batch;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@PropertySource("classpath:batch.properties")
public class JavaMailSenderProperties {

    @Value("${host}")
    private String host;
    @Value("${portSender}")
    private int port;
    @Value("${mail.username}")
    private String mailUsername;
    @Value("${mail.password}")
    private String mailPassword;
    @Value("${mail.transport.protocol}")
    private String protocol;
    @Value("${mail.smtp.auth}")
    private Boolean auth;
    @Value("${mail.smtp.starttls.enable}")
    private Boolean enable;
    @Value("${mail.debug}")
    private Boolean debug;

}
