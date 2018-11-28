package com.interswitch.paymentgateway.api;

import com.interswitch.paymentgateway.api.model.*;
import com.interswitch.paymentgateway.service.MailService;
import com.interswitch.paymentgateway.util.AccountUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class UserApi {

    @PostMapping("/signup")
    public Response signup(@Validated @RequestBody SignupRequest signupRequest){

        Response response=null;
        String accountNo = AccountUtil.getAccountNo(10);

        System.out.println(accountNo);

        response= new SignupResponse("00","Successful",null, accountNo);

        return response;
    }

    @PostMapping("/login")
    public Response login(@Validated LoginRequest request){
        Response response=null;

        System.out.println(response);


        return response;
   }
//    @Autowired MailService emailService;
//    @PostMapping("/email")
//    public Response email(@Validated @RequestBody EmailRequest request){
//
//        Response response=null;
////        EmailRequest request = new EmailRequest();
////        request.setSenderEmail("olorunlexe@gmail.com");
////        request.setReceiverEmail("olorunlexe001@gmail.com");
////        request.setSubject("Sending Simple Email with JavaMailSender Example");
////        request.setText("This is a test to check Email service");
//
//        emailService.send(request);
//        response= new EmailResponse("00","Email Sent Successfully!",null);
//        return response;
//    }





}
