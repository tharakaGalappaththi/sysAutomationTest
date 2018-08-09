package com.sysco.auto_test.pages;

import org.openqa.selenium.By;

public class ProductCategoryPage extends LoginPage {

    private By lnkRumUpViewMore = By.xpath("//li[@id='product-tracking-1148']//a");
    private By btnAddToCart = By.xpath("//button[@title='Add to Cart']");

    public void clickOnViewMore() {
        syscoLabUI.click(lnkRumUpViewMore);
        syscoLabUI.sleep(1);
    }

    public void clickAddToCart() {
        syscoLabUI.click(btnAddToCart);
    }


}
