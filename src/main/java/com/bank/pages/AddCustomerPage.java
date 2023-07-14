package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By customerAdd = By.xpath("//button[@type='submit']");

    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "Rita");
    }


    public void enterLastName() {
        sendTextToElement(lastName, "Smith");
    }


    public void enterThePostCode() {
        sendTextToElement(postCode, "SW1 2AA");
    }

    public void EnterKeyOnAddCustomer() {
        clickOnElement(customerAdd);
    }

    public void getTextFromPopUp() {
        getTextFromAlert();
    }

    public void popUpWindow() {
        acceptAlert();
    }

}
