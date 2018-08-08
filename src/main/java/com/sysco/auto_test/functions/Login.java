package com.sysco.auto_test.functions;

import com.sysco.auto_test.common.Constants;
import com.sysco.auto_test.pages.LoginPage;
import com.sysco.auto_test.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login  {

    public static LoginPage loginPage = new LoginPage();


//    public static void loadLoginPage() {
//            DesiredCapabilities capabilities = null;
//            loginPage.loadLoginPage(capabilities, Constants.APP_URL);
//    }

    public static void loadLoginPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            loginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            loginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }



    public static void VerifyLoginButton(){
        loginPage.isLoginButtonPresent();
    }

    public static void logIntoApplication(String email, String psw){
        loginPage.clickMyAccountLnk();
        loginPage.setTxtEmail(email);
        loginPage.setTxtPsw(psw);
        loginPage.clickLogin();
    }

    public static void quiteDriver() {
        loginPage.quitDriver();
    }
    
}
