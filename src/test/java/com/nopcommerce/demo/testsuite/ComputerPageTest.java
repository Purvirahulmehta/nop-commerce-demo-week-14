package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
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
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputers();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(computerPage.verifyComputersText(),"Computers","Not navigate to page");


    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
            SoftAssert softAssert=new SoftAssert();
            homePage.clickOnComputers();
            computerPage.clickOnDesktopLink();
            softAssert.assertEquals(desktopsPage.verifyDesktopsText(),"Desktops","Not navigate to page");

        }
    @Test(dataProvider = "credentials",dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(String
            processor, String ram, String hdd, String os, String software){
        homePage.clickOnComputers();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectOnProcessorDropDown(processor);
        buildYourOwnComputerPage.selectOnRam(ram);
        buildYourOwnComputerPage.getHdd(hdd);
        buildYourOwnComputerPage.getOsRadio(os);
        buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(productAddedMessage.verifyMessage(),"The product has been added to your shopping cart");
    }

}
