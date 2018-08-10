package com.sysco.auto_test.pages;

import com.sysco.auto_test.data.OverLayData;
import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;

public class OverLayPage extends LoginPage {

    // WebElements in the Age verification overLay
    private By ddYear = By.xpath("//select[@id='age_select_year']");
    private By ddMonth = By.xpath("//select[@id='age_select_month']");
    private By ddDay = By.xpath("//select[@id='age_select_day']");
    private By btnEnter = By.xpath("//button[@id='age_confirm_btn']");

    // WebElements in the cart items overLay
    private By lnkRemoveTop = By.xpath("//div[@class='product-btn-content']/a[2]");
    private By lblRumUp = By.xpath("//p[@class='product-name']/a");
    private By lblItemPrice = By.xpath("//th[text()='Price']/..//span");
    private By btnCheckOut = By.xpath("//ol[@id='mini-cart']/../div//button");


    public boolean isAgeVerificationPopUpDisplayed() {
        return syscoLabUI.isDisplayed(btnEnter);
    }

    public void selectBirthYear(String year) {
        syscoLabUI.select(ddYear, year);
    }

    public void selectBirthMonth(String month) {
        syscoLabUI.select(ddMonth, month);
    }

    public void selectBirthDay(String day) {
        syscoLabUI.select(ddDay, day);
    }

    public void clickBtnEnter() {
        syscoLabUI.click(btnEnter);
        syscoLabUI.sleep(2);
    }

    public void clickTopItemToRemove() throws AWTException {
        syscoLabUI.click(lnkRemoveTop);
        syscoLabUI.sleep(1);
        syscoLabUI.clickOkInWindowsAlert();

    }

    public boolean isTopItemExists() {
        return syscoLabUI.isDisplayed(lnkRemoveTop);
    }

    public String getProductName() {
        syscoLabUI.sleep(2);
        return syscoLabUI.getText(lblRumUp);
    }

    public String getProductPrice() {
        return syscoLabUI.getText(lblItemPrice);
    }

    public void clickOnCheckoutBtn() {
        syscoLabUI.click(btnCheckOut);
    }
}
