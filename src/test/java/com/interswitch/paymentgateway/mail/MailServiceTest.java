package com.interswitch.paymentgateway.mail;

import com.interswitch.paymentgateway.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MailServiceTest {
    @Autowired
    private MailService service;
    @Test
    public void send(){
        String to="olorunlexe@gmail.com";
        String subject="MailTest from the Dev Academy";
        String message="What you back vicky! Lolzz, 95er!";

        service.send(to,subject,message);
    }
}
