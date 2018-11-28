package com.interswitch.paymentgateway.api.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class LoginRequest {
    @Length(min = 6,max = 50)
    @NotBlank(message = "Required")
    @Pattern(message = "The password's first character must be a letter, it must contain at least 4 characters and no more than 15 characters and no characters other than letters, numbers and the underscore may be used", regexp ="^[a-zA-Z]\\w{3,14}$")
    private String password;
    @Email
    @NotBlank(message="required")
    @Length(min = 6,max = 50)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
