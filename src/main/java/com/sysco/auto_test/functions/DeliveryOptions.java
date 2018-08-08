package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.DeliveryOptionsPage;

public class DeliveryOptions {

    public static DeliveryOptionsPage deliveryOptionsPage = new DeliveryOptionsPage();

    public static boolean isDeliveryOptionPresent(){
        return deliveryOptionsPage.isDeliveryOptionsPresent();
    }

    public static void clickOnContinue(){
        deliveryOptionsPage.clickOnContinue();
    }

}
