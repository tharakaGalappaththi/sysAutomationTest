package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.PaymentInfoPage;

public class PaymentInfo {

    public static PaymentInfoPage paymentInfoPage = new PaymentInfoPage();

    public static void clickOnCcRdb(){
        paymentInfoPage.clickOnCcRdb();
    }

    public static boolean isCreditCardFieldsPresent(){
        return paymentInfoPage.isCardNumberFieldPresent()&&paymentInfoPage.isCardExpirationFieldPresent()&&paymentInfoPage.isCvvNumberFieldPresent();
    }
}
