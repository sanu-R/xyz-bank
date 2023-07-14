package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomersPage extends Utility {
    By verifyLogoutTab = By.xpath("//button[contains(text(),'Login')]");

    By logoutCustomer = By.xpath("//button[contains(text(),'Logout')]");


    public void enterOnLogoutOnCustomerPage() {
        clickOnElement(logoutCustomer);
    }

    public void checkLogOutText() {

        String expectedText = "Logout";
        String actualText = getTextFromElement(verifyLogoutTab);
        Assert.assertEquals(actualText, expectedText, "Text not found ");

    }



}
