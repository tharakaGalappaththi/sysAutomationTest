package com.sysco.auto_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends LoginPage{


    private By lblCart=  By.xpath("//span[@id='cartHeader']");
    private By lblProducts = By.xpath("//li[@class='link-product']/a");
    private By lnkClassicRange = By.xpath("//div[@class= 'main-nav']/div/div/div[4]//ul//ul/li[5]/a");




    public void clickOnCart(){
        syscoLabUI.click(lblCart);
        syscoLabUI.sleep(1);
       // syscoLabUI.;
    }

    public void moveMouseToProducts(){
        syscoLabUI.mouseHover(lblProducts);
        syscoLabUI.sleep(1);
    }

    public void clickOnClassicRange(){
        syscoLabUI.click(lnkClassicRange);
    }

//
//    //private By btnProfile=  By.xpath("//*[@class='WCKP WCEM WFUO WATO workdayHome-o']/div/div[2]/div[2]/div[4]");
//    private By btnProfile=  By.xpath("//*[@class='wdappchrome-a']/div[@class='wdappchrome-g']/div[@class='wdappchrome-i']/div[@class='wdappchrome-az']");
//    private By txtSearch=  By.xpath("//*[@id='wd-searchInput']/div[1]/input");
//    private By btnBackToHome=  By.xpath("//*[@data-automation-id='wd_header_home_icon']");
//    private By btnSignOut=  By.xpath("//*[@data-automation-id='Sign_Out']/button");
//    private By btnInBox=  By.xpath("//div[@data-automation-id='appHeader']/div[@class='wdappchrome-i']/div[@class='wdappchrome-q']/button[@data-automation-id='inbox_preview']");
//    private By btnFirstInBoxItem=  By.xpath("//div[@id='wd-Inbox-mainpage']/div/div/ul[@data-automation-id='inbox_item_list']/li[1]");
//
//
//
//    private By lblInBoxRowTitle=  By.xpath("//div[@id='wd-Inbox-mainpage']/div/div/ul[@data-automation-id='inbox_item_list']/li[1]/div/div/section/div[2]/div[@data-automation-id='inbox_row_title']");
//
//    //private By lblAutoCompletePopup=  By.xpath("//div[@data-automation-id='searchInputAutocompletePopup']/div/ul");
//    private By lblAutoCompletePopup=  By.xpath("//div[@data-automation-id='searchInputAutocompletePopup']");
//
//
//
//
//
//    public String getLblInBoxRowTitle() { return syscoLabUI.driver.findElement(lblInBoxRowTitle).getText(); }
//
//    public void setTxtSearch(String srch) {
//        syscoLabUI.sendKeys(txtSearch, srch);
//        syscoLabUI.sleep(2);
//    }
//
//    public void clickBtnProfile(){
//        syscoLabUI.click(btnProfile);
//        syscoLabUI.sleep(4);
//    }
//
//    public void waitTillBtnBackToHome(){ syscoLabUI.waitTillElementLoaded(btnBackToHome); }
//    public void waitTillBtnProfileLoad(){ syscoLabUI.waitTillElementLoaded(btnProfile); }
//    public void waitTillBtnInBoxLoad(){ syscoLabUI.waitTillElementLoaded(btnInBox); }
//
//
//    public void clickBtnSignOut(){
//        syscoLabUI.click(btnSignOut);
//        syscoLabUI.sleep(4);
//    }
//    public void clickBtnInBox(){
//        syscoLabUI.click(btnInBox);
//        syscoLabUI.sleep(4);
//    }
//
//    public void clickBtnFirstInBoxItem(){
//        syscoLabUI.click(btnFirstInBoxItem);
//        syscoLabUI.sleep(4);
//    }
//
//    public void clickLblAutoCompletePopup(){
//        syscoLabUI.click(lblAutoCompletePopup);
//        syscoLabUI.sleep(4);
//    }
//
//    public void sleep(int sec){
//        syscoLabUI.sleep(sec);
//    }

}
