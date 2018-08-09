package com.sysco.auto_test.tests;


import com.sysco.auto_test.data.LoginData;
import com.sysco.auto_test.data.OverLayData;
import com.sysco.auto_test.functions.*;
import com.sysco.auto_test.utils.TestBase;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.ui.SyscoLabUI;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(SyscoLabListener.class)
public class LoginTest extends TestBase {
    protected SyscoLabUI syscoLabUI = new SyscoLabUI();
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void init(ITestContext iTestContext) {
//        iTestContext.setAttribute("feature", "Login");
        iTestContext.setAttribute("feature", "Order - Shopping Cart");
    }

    @Test
    public void testLogin() throws Exception {
        Login.loadLoginPage();
        softAssert.assertTrue(OverLay.verifyAgeValidPopUp());
        OverLay.submitAge(OverLayData.userBirthYear, OverLayData.userBirthMonth, OverLayData.userBirthDay);
        Login.logIntoApplication(LoginData.userEmail, LoginData.userPassword);
        MyAccount.isMyAccountNameDisplayed();
        OverLay.clearCartItems();
        Home.selectProductCatAsClassicRange();
        ProductCategory.selectProductRumUpAddToCart();
        softAssert.assertEquals(OverLay.actualItemNameOnCart(), OverLayData.expectedProductNameRumUp);
        softAssert.assertEquals(OverLay.actualItemPriceOnCart(), OverLayData.expectedProductPriceRumUp);
        OverLay.clickOnCartCheckOutBtn();
        Checkout.clickOnProceedToCheckout();
        softAssert.assertEquals(Checkout.actualFirstNameInBilling(), LoginData.firstName);
        softAssert.assertEquals(Checkout.actualLastNameInBilling(), LoginData.lastName);
        Checkout.validateReqFieldErrorMsg();
        Checkout.addValueToThePostalCodeField();
        Checkout.clickOnContinue();
        softAssert.assertTrue(DeliveryOptions.isDeliveryOptionPresent());
        DeliveryOptions.clickOnContinue();
        PaymentInfo.clickOnCcRdb();
        softAssert.assertTrue(PaymentInfo.isCreditCardFieldsPresent());
    }


    @AfterTest
    public void webDriverClose() {
        Login.quiteDriver();
    }

}