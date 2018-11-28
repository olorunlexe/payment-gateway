package com.interswitch.paymentgateway.service;

import com.interswitch.paymentgateway.api.model.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class MailService {
    @Autowired
    private JavaMailSender sender;
    public MailService(JavaMailSender sender){
        this.sender=sender;
    }

//    @Async
//    public void send(EmailRequest request){
//        SimpleMailMessage mailMessage= new SimpleMailMessage();
//        mailMessage.setTo(request.getReceiverEmail());
//        mailMessage.setFrom(request.getSenderEmail());
//        mailMessage.setSubject(request.getSubject());
//        mailMessage.setText(request.getText());
//        try {
//            System.out.println("Got to this Point");
//            sender.send(mailMessage);
//            System.out.println("Then Successful!");
//        }catch (MailException ex){
//            System.out.println("Then Failed");
//            System.out.println(ex.getMessage());
//        }
//    }

//@Async
public void send(String email,String subject, String message){
    SimpleMailMessage mailMessage= new SimpleMailMessage();
    mailMessage.setTo(email);
    mailMessage.setFrom("academy@interswitchgroup.com");
    mailMessage.setSubject(subject);
    mailMessage.setText(message);
    sender.send(mailMessage);
}
}
