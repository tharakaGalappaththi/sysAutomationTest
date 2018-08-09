package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.MyAccountPage;

public class MyAccount {
    public static MyAccountPage myAccountPage = new MyAccountPage();

    public static boolean isMyAccountNameDisplayed() {
        return myAccountPage.verifyMyAccountNameDisplayed();
    }

}
