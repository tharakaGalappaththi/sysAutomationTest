package com.sysco.auto_test.pages;

import org.openqa.selenium.By;

public class MyAccountPage extends LoginPage {

    private By lblAccUserName = By.xpath("//p[contains(text(),'william jacob')]");

    public boolean verifyMyAccountNameDisplayed(){
        return   syscoLabUI.isDisplayed(lblAccUserName);
    }

}
