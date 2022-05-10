package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends LoginPageTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    ErrorMessage errorMessage;
    ProductAddedMessage productAddedMessage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        errorMessage = new ErrorMessage();
        productAddedMessage = new ProductAddedMessage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegistedButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerPage.getRegisterText(),"Register");
    }

  @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){

        homePage.clickOnRegisterLink();
        registerPage.clickOnRegistedButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(errorMessage.getFirstNameError(),"First name is required.");
       softAssert.assertEquals(errorMessage.getLastNameError(),"Last name is required.");
        softAssert.assertEquals(errorMessage.getEmailError(),"Email is required.");
       softAssert.assertEquals(errorMessage.getPasswordError(),"Password is required.");
       softAssert.assertEquals(errorMessage.getConfirmPasswordError(),"Password is required.");
       softAssert.assertAll();

    }
    @Test(groups={"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemaleButton();
        registerPage.enterFirstName("Pooja");
        registerPage.enterLastName("Shah");
        registerPage.setDayOfBirth("10");
        registerPage.setMonthOfBirth("May");
        registerPage.setYearOfBirth("1984");
        registerPage.enterEmail("Prime456@gmail.com");
        registerPage.enterPassword("Prime456");
        registerPage.enterConfirmPassword("Prime456");
        registerPage.clickOnRegistedButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerPage.getRegistrationCompletedText(),"Your registration completed");
softAssert.assertAll();
    }

}
