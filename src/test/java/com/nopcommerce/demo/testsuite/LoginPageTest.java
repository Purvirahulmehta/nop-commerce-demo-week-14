package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    ErrorMessage errorMessage;
    ProductAddedMessage productAddedMessage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        loginPage=new LoginPage();
        registerPage=new RegisterPage();
        computerPage=new ComputerPage();
        desktopsPage=new DesktopsPage();
        errorMessage=new ErrorMessage();
        productAddedMessage=new ProductAddedMessage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLogInLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getWelcomeMessage(),"Welcome, Please Sign In!");
        softAssert.assertAll();

    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){
//        Click on login link
//        Enter EmailId
//        Enter Password
//        Click on Login Button
//        Verify that the Error message
        homePage.clickOnLogInLink();
        loginPage.enterEmailField("1234");
        loginPage.enterPasswordField("222 ");
        loginPage.clickOnLogInButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginPage.getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
//
        softAssert.assertAll();

    }
    @Test(groups={"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLogInLink();
        loginPage.enterEmailField("Prime456@gmail.com");
        loginPage.enterPasswordField("Prime456");
        loginPage.clickOnLogInButton();
        homePage.clickOnLogOutLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(homePage.clickOnLogOutLink(),"Log out");
        softAssert.assertAll();
    }
    @Test(groups={"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLogInLink();
        loginPage.enterEmailField("Prime456@gmail.com");
        loginPage.enterPasswordField("Prime456");
        loginPage.clickOnLogInButton();
        homePage.clickOnLogOutLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginPage.verifyLogInButton(),"Log in");
        softAssert.assertAll();

    }



}
