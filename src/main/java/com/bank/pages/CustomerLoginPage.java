package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");
    By selectCustomer = By.xpath("//option[@value='12']");
    By clickLogin = By.xpath("//button[normalize-space()='Login']");

    public void clickOnCustomerName() {
        clickOnElement(customerName);
    }

    public void selectTheCustomerNameFromDropDown() {
        selectByVisibleTextFromDropDown(selectCustomer, "Rita Smith");
    }

    public void clickOnLoginForCustomer() {
        clickOnElement(clickLogin);
    }

}
