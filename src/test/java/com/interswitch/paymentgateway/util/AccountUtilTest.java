package com.interswitch.paymentgateway.util;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountUtilTest {


    @Test
    public void TestGenerateAccountNo(){

        assertThat(AccountUtil.getAccountNo(10)).hasSize(10);
    }
}
