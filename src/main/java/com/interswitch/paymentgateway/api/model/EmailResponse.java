package com.interswitch.paymentgateway.api.model;

import java.util.List;

public class EmailResponse extends Response {
    public EmailResponse(String code, String description, List<Error> errors) {
        super(code, description, errors);
    }
}
