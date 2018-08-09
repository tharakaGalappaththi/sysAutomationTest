package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.CheckoutPage;

public class Checkout {
    public static CheckoutPage checkoutPage = new CheckoutPage();

    public static void clickOnProceedToCheckout() {
        checkoutPage.clickOnBtnProceedToCheckout();
    }

    public static String actualFirstNameInBilling() {
        return checkoutPage.getTextFirstNameBilling();
    }

    public static String actualLastNameInBilling() {
        return checkoutPage.getTextLastNameBilling();
    }

    public static void validateReqFieldErrorMsg() {
        checkoutPage.clearLastNameTxtField();
        checkoutPage.clickOnContinue();
        checkoutPage.validateLastNameReqErrMsg();
        checkoutPage.typeLastName();
    }

    public static void addValueToThePostalCodeField() {
        if (!checkoutPage.isPostalCodeAdded()) {
            checkoutPage.selectPostalCode();
        }
    }

    public static void clickOnContinue() {
        checkoutPage.clickOnContinue();
    }
}
