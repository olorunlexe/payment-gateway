package com.interswitch.paymentgateway.api.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailRequest {

    @Email
    @NotBlank(message = "required")
    @Length(min = 6, max = 50)
    private String senderEmail;
    @Email
    @NotBlank(message = "required")
    @Length(min = 6, max = 50)
    private String receiverEmail;

    @Length(min = 3, max = 100)
    private String subject;
    @Length(min = 10, max = 350)
    @NotBlank(message = "Required")
    private String text;

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "EmailRequest{" +
                "senderEmail='" + senderEmail + '\'' +
                ", receiverEmail='" + receiverEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
