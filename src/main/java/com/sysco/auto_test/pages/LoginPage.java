package com.sysco.auto_test.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class LoginPage {
    protected static SyscoLabUI syscoLabUI;


    private By lnkMyAccount = By.xpath("//a[@title='My Account']");
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPsw = By.xpath("//input[@id='pass']");
    private By btnLogin = By.xpath("//button[@id='send2']");



    public static void loadLoginPage(Capabilities capabilities, String url) {
        syscoLabUI = new SyscoLabWUI(capabilities);
        syscoLabUI.navigateTo(url);
        syscoLabUI.driver.manage().window().fullscreen();
        syscoLabUI.sleep(2);
    }

    public void clickMyAccountLnk(){
        syscoLabUI.sleep(1);
        syscoLabUI.click(lnkMyAccount);
        syscoLabUI.sleep(2);
    }

    public  boolean isLoginButtonPresent(){
     return syscoLabUI.isDisplayed(btnLogin);
    }

    public void setTxtEmail(String userName) {
        syscoLabUI.sendKeys(txtEmail, userName);
    }

    public void setTxtPsw(String psw) {
        syscoLabUI.sendKeys(txtPsw, psw);
    }

    public void clickLogin(){
        syscoLabUI.click(btnLogin);
        syscoLabUI.sleep(2);
    }

    public void quitDriver() {
        if (syscoLabUI != null) {
            syscoLabUI.quit();
        }
    }




}
