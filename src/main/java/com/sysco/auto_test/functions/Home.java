package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.HomePage;

public class Home {

    private static HomePage HomePage = new HomePage();

    public static void viewAddedItemsToCart() {
        HomePage.clickOnCart();
    }

    public static void selectProductCatAsClassicRange() {
        HomePage.moveMouseToProducts();
        HomePage.clickOnClassicRange();
    }

}
