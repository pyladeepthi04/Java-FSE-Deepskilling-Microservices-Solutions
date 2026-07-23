package com.cognizant.junit;

public class EmailManager {

    private EmailService emailService;

    public EmailManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public void send(String email) {
        emailService.sendEmail(email);
    }
}