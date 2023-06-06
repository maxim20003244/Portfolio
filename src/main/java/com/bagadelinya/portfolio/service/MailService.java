package com.bagadelinya.portfolio.service;

import com.bagadelinya.portfolio.model.Person;
import org.springframework.context.annotation.Lazy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class MailService {

    private final ContactService contactService;
    private final JavaMailSender javaMailSender;

    public MailService(ContactService contactService, JavaMailSender javaMailSender) {
        this.contactService = contactService;
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification (Person person){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("maxim20003244@gmail.com");
        mail.setFrom("maxim200003244@gmail.com");
        mail.setSubject("New notification");
        mail.setText(person.toString());
        javaMailSender.send(mail);

    }
}
