package com.interswitch.paymentgateway.util;

import java.util.Random;

public class AccountUtil{

    public static String getAccountNo(int numDigits){
        int i=0;
        Random random=new Random();
        String accountNo= "";
        while (i<numDigits){
            int num=random.nextInt(10);
            accountNo+=String.valueOf(num);
            i++;
        }
        return accountNo;
    }
}
