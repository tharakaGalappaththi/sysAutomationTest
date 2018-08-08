package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.HomePage;

public class Home {

    //public static HomePage omgHomePage = new HomePage();
    //private static HomePage omgHomePage;

    private static HomePage HomePage = new HomePage();

public static void viewAddedItemsToCart(){
    HomePage.clickOnCart();
}

public static void selectProductCatAsClassicRange(){
    HomePage.moveMouseToProducts();
    HomePage.clickOnClassicRange();
}


//    public static void loadHomePage() { omgHomePage = new HomePage(); }
//
//
//    public static void clickOnProfile(){
//        omgHomePage =  new HomePage();
//        omgHomePage.clickBtnProfile();
//    }
//
//    public static void keyiInSearchBx(String text){ omgHomePage.setTxtSearch(text);}
//
//    public static void waitTillHomePageLoad(){ omgHomePage.waitTillBtnBackToHome(); }
//    public static void waitTillProfileLoad(){ omgHomePage.waitTillBtnProfileLoad(); }
//    public static void clickOnSignOut(){ omgHomePage.clickBtnSignOut(); }
//
//    public static String getInboxRowBusinessProcessType(){ return omgHomePage.getLblInBoxRowTitle().split(":")[0].trim(); }
//
//    public static String getInboxRowBusinessProcessTitle(){ return omgHomePage.getLblInBoxRowTitle().split(":")[1].trim(); }
//
//    //--------------------------------------
//
//
//    public static void selectFirstInBoxItem(){
//        omgHomePage.waitTillBtnInBoxLoad();
//        omgHomePage.clickBtnInBox();
//        omgHomePage.clickBtnFirstInBoxItem();
//
//    }
//
//    public static void accessTask(String task){
//        keyiInSearchBx(task);
//        omgHomePage.clickLblAutoCompletePopup();
//    }
//
//    public static void userSignOut(){
//        waitTillProfileLoad();
//        clickOnProfile();
//        clickOnSignOut();
//
//    }
//
//    public static void homePageSleep(int sec){
//        omgHomePage.sleep(sec);
//    }
//

}
