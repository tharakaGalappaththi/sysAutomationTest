package com.sysco.auto_test.pages;

import org.openqa.selenium.By;

public class DeliveryOptionsPage extends LoginPage {

    private By lblDeliveryOptions = By.xpath("//h2[contains(text(), 'Delivery Options')]");
    private By btnContinue = By.xpath("//button[@id='shipping-method-button']");


    public boolean isDeliveryOptionsPresent(){
        return syscoLabUI.isDisplayed(lblDeliveryOptions);
    }

    public void clickOnContinue(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnContinue);
    }

}
