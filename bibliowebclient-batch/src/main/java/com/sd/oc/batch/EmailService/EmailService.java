package com.sd.oc.batch.EmailService;

public interface EmailService {

    void sendSimpleMessage(String to, String subject, String text);
}
