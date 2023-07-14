package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");


    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
    }


}
