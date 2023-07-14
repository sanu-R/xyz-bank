package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By searchCustomerName = By.xpath("//select[@id='userSelect']");
    By findCustomer = By.xpath("//select[@id='userSelect']");
    By currency = By.xpath("//select[@id='currency']");
    By selectCurrency = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[normalize-space()='Process']");


    public void clickOnCusterNameDropDown() {
        clickOnElement(searchCustomerName);
    }

    public void selectOnCusterNameDropDownToSeeName() {
        selectByVisibleTextFromDropDown(findCustomer, "Ron Weasly");
    }

    public void clickOnCurrency() {
        clickOnElement(currency);
    }

    public void selectTheCurrency() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");
    }

    public void clickOnProcessButton() {
        clickOnElement(process);
    }

    public void getTextFormOpenAccountPopUp() {
        getTextFromAlert();
    }

    public void clickOkONOpenAccountPopUp() {
        acceptAlert();
    }


}
