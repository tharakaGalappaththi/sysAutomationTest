package com.sysco.auto_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends LoginPage {
    private By lblCart = By.xpath("//span[@id='cartHeader']");
    private By lblProducts = By.xpath("//li[@class='link-product']/a");
    private By lnkClassicRange = By.xpath("//div[@class= 'main-nav']/div/div/div[4]//ul//ul/li[5]/a");

    public void clickOnCart() {
        syscoLabUI.click(lblCart);
        syscoLabUI.sleep(1);
        // syscoLabUI.;
    }

    public void moveMouseToProducts() {
        syscoLabUI.mouseHover(lblProducts);
        syscoLabUI.sleep(1);
    }

    public void clickOnClassicRange() {
        syscoLabUI.click(lnkClassicRange);
    }

}
