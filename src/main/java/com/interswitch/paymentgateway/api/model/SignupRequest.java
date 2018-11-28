package com.interswitch.paymentgateway.api.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class SignupRequest extends LoginRequest{
    @Length(min = 3,max = 50)
    @NotBlank(message = "Required")
    private String firstName;
    @Length(min = 3,max = 50)
    @NotBlank(message = "Required")
    private String lastName;
    @NotBlank(message="required")
    @Length(min = 11,max = 15)
    private String mobileNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "SignupRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + getPassword() + '\'' +
                ", email='" + getEmail()+ '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
