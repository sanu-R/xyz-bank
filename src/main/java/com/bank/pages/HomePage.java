package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }

    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
    }

    public void verifyYourNameText() {

        String expectedMessage = "Your Name :";
        String actualMessage = getTextFromElement(yourNameText);
        Assert.assertEquals(actualMessage, expectedMessage, "Text not found");
    }


}
