package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.HomePage;
import com.sysco.auto_test.pages.OverLayPage;

import java.awt.*;

public class OverLay {

public static OverLayPage overLayPage = new OverLayPage();
public static HomePage homePage = new HomePage();

public static boolean verifyAgeValidPopUp(){
    return overLayPage.isAgeVerificationPopUpDisplayed();
}

public static void submitAge(String year, String month, String day){
    overLayPage.selectBirthYear(year);
    overLayPage.selectBirthMonth(month);
    overLayPage.selectBirthDay(day);
    overLayPage.clickBtnEnter();
}

public static void clearCartItems() throws AWTException {
    Home.viewAddedItemsToCart();
    while (overLayPage.isTopItemExists()){
    overLayPage.clickTopItemToRemove();
    Home.viewAddedItemsToCart();
    }
}

    public static String actualItemNameOnCart(){
        homePage.clickOnCart();
        return overLayPage.getProductName();
}

    public static String actualItemPriceOnCart(){
        return overLayPage.getProductPrice();
    }

    public static void clickOnCartCheckOutBtn(){
        overLayPage.clickOnCheckoutBtn();
    }
}
