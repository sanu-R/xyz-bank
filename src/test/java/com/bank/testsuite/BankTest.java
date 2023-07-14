package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        //	click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
        Thread.sleep(2000);
        //	enter FirstName
        addCustomerPage.enterFirstName();
        Thread.sleep(2000);
        //	enter LastName
        addCustomerPage.enterLastName();
        Thread.sleep(2000);
        //	enter PostCode
        addCustomerPage.enterThePostCode();
        Thread.sleep(2000);
        //	click On "Add Customer" Button
        addCustomerPage.EnterKeyOnAddCustomer();
        Thread.sleep(2000);
        //	popup display verify message "Customer added successfully"
        addCustomerPage.getTextFromPopUp();
        Thread.sleep(2000);
        //	click on "ok" button on popup
        addCustomerPage.popUpWindow();
        Thread.sleep(2000);
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        Thread.sleep(1000);
        //	click On "Open Account" Tab
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnOpenAccount();
        //	Search customer that created in first test
        openAccountPage.clickOnCusterNameDropDown();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName();
        //	Select currency "Pound"
        openAccountPage.clickOnCurrency();
        Thread.sleep(1000);
        openAccountPage.selectTheCurrency();
        Thread.sleep(1000);
        //	click on "process" button
        openAccountPage.clickOnProcessButton();
        Thread.sleep(1000);
        //	verify message "Account created successfully"
        openAccountPage.getTextFormOpenAccountPopUp();
        //	click on "ok" button on popup.
        openAccountPage.clickOkONOpenAccountPopUp();


    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName();
        Thread.sleep(1000);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        Thread.sleep(1000);
        //	verify "Logout" Tab displayed.
        // customersPage.checkLogOutText();
        Thread.sleep(1000);
        //	click on "Logout"
        customersPage.enterOnLogoutOnCustomerPage();
        Thread.sleep(1000);
        // verify "Your Name" text displayed.
        homePage.verifyYourNameText();


    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName();
        Thread.sleep(1000);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        Thread.sleep(1000);
        //	click on "Deposit" Tab
        accountPage.enterOnDepositButton();
        Thread.sleep(1000);
        //	Enter amount 100
        accountPage.enterDepositAmount();
        Thread.sleep(1000);
        //	click on "Deposit" Button
        accountPage.clickOnDepositButton();
        Thread.sleep(1000);
        //	verify message "Deposit Successful"
        accountPage.checkDepositSuccessful();
        Thread.sleep(1000);

    }


    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        openAccountPage.selectOnCusterNameDropDownToSeeName();
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        //	click on "Withdrawal" Tab
        accountPage.withdrawalMoney();

        //	Enter amount 50
        accountPage.enterMoneyWithdrawal();
        //	click on "withdrawal" Button
        accountPage.enterWithdrawalButton();
        //	verify message "Transaction Successful"
        accountPage.verifyTheTransactionText();
    }


}