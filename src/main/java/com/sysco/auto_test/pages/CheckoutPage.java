package com.sysco.auto_test.pages;

import com.sysco.auto_test.data.LoginData;
import org.openqa.selenium.By;

public class CheckoutPage extends LoginPage {

    private By btnProceedToCheckout = By.xpath("//button[@title='Proceed to Checkout']");
    private By txtFirstNameBilling = By.xpath("//input[@id='billing:firstname']");
    private By txtLastNameBilling = By.xpath("//input[@id='billing:lastname']");
    private By btnContinue = By.xpath("//button[@id='delivery-address-button']");
    private By lblRequiredFieldErrorMsg = By.xpath("//div[@id='advice-required-entry-billing:lastname']");
    private By txtPostalCode = By.xpath("//input[@id='billing:postcodesuburb']");
    private By lblPostalCode = By.xpath("//div[@id='Autocomplete_billing:postcodesuburb']/div");



    public void clickOnBtnProceedToCheckout(){
        syscoLabUI.click(btnProceedToCheckout);
    }

    public String getTextFirstNameBilling(){
        return syscoLabUI.getText(txtFirstNameBilling);
    }

    public String getTextLastNameBilling(){
        return syscoLabUI.getText(txtLastNameBilling);
    }

    public void clickOnContinue(){
        syscoLabUI.click(btnContinue);
    }

    public void clearLastNameTxtField(){
        syscoLabUI.clear(txtLastNameBilling);
    }

    public void validateLastNameReqErrMsg(){
        syscoLabUI.isDisplayed(lblRequiredFieldErrorMsg);
    }

    public void typeLastName(){
        syscoLabUI.sendKeys(txtLastNameBilling, LoginData.lastName);
    }

    public boolean isPostalCodeAdded(){
        if(syscoLabUI.getText(txtPostalCode)== ""){
            return false;
        }else {
            return true;
        }
    }

    public void selectPostalCode(){
        syscoLabUI.sendKeys(txtPostalCode,"2000");
        syscoLabUI.sleep(2);
        syscoLabUI.click(lblPostalCode);
    }

}
