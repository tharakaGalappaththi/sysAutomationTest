package com.sysco.auto_test.pages;

import org.openqa.selenium.By;

public class PaymentInfoPage extends LoginPage {

    private By rdoCreditCard = By.xpath("//label[@for='p_method_braintree']");
    private By txtCreditCardNumber = By.xpath("//input[@id=\"braintree_cc_number\"]");
    private By txtCardExpiration = By.xpath("//select[@id='braintree_expiration']/../div");
    private By txtCvvNumber = By.xpath("//input[@id='braintree_cc_cid']");

    public void clickOnCcRdb() {
        syscoLabUI.sleep(2);
        syscoLabUI.click(rdoCreditCard);
    }

    public boolean isCardNumberFieldPresent() {
        return syscoLabUI.isDisplayed(txtCreditCardNumber);
    }

    public boolean isCardExpirationFieldPresent() {
        return syscoLabUI.isDisplayed(txtCardExpiration);
    }

    public boolean isCvvNumberFieldPresent() {
        return syscoLabUI.isDisplayed(txtCardExpiration);
    }
}
