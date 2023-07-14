package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AccountPage extends Utility {

    By deposit = By.xpath("//button[normalize-space()='Deposit']");
    By amount = By.xpath("//input[@placeholder='amount']");
    By clickDeposit = By.xpath("//button[@type='submit']");

    By successfulDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawal = By.xpath("//button[normalize-space()='Withdrawl']");
    By enterWithdrawal = By.xpath("//input[@placeholder='amount']");
    By clickWithdrawal = By.xpath("//button[normalize-space()='Withdraw']");
    By transaction = By.xpath("//span[@class='error ng-binding']");


    public void enterOnDepositButton() {
        clickOnElement(deposit);
    }

    public void enterDepositAmount() {
        sendTextToElement(amount, "100");
    }

    public void clickOnDepositButton() {
        clickOnElement(clickDeposit);
    }
    public void checkDepositSuccessful() {

        String expectedText = "Deposit Successful";
        String actualText = getTextFromElement(successfulDeposit);
        Assert.assertEquals(actualText, expectedText, "Text not found ");

    }

    public void withdrawalMoney() {
        clickOnElement(withdrawal);
    }

    public void enterMoneyWithdrawal() {
        sendTextToElement(enterWithdrawal, "50");
    }

    public void enterWithdrawalButton() {
        clickOnElement(clickWithdrawal);
    }

    public void verifyTheTransactionText() {
        String expectedText1 = "Transaction successful";
        String actualText1 = getTextFromElement(transaction);
        Assert.assertEquals(actualText1, expectedText1, "Text not found ");

    }














}
