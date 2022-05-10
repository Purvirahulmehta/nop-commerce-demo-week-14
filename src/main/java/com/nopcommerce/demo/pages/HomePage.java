package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
//    2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, Remaining(My
//    account link and LogOut link )
//    and create appropriate methods for it.
    @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computersTab;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement elctronicsTab;
    @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparelTab;
    @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownloadsTab;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksTab;
    @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewelryTab;
    @FindBy(xpath ="//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftcards;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logInLink;
    @FindBy(xpath ="//a[contains(text(),'Register')]" )
    WebElement registerLink;
    @FindBy(xpath ="//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]" )
    WebElement nopcommerceLogo ;
    @FindBy(xpath ="//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;

    public void clickOnComputers() {
        Reporter.log("Clicking on Computers"+ computersTab.toString()+ "<br>");
        clickOnElement(computersTab);
    }
    public void clickOnElectronics() {
        Reporter.log("Clicking on Electronics"+ elctronicsTab.toString()+ "<br>");
        clickOnElement(elctronicsTab);
    }
    public void clickOnApparel() {
        Reporter.log("Clicking on Apparel"+ apparelTab.toString()+ "<br>");
        clickOnElement(apparelTab);
    }
    public void clickOnDigitalDownloads() {
        Reporter.log("Clicking on DigitalDownloads"+ digitalDownloadsTab.toString()+ "<br>");
        clickOnElement(digitalDownloadsTab);
    }
    public void clickOnBooks() {
        Reporter.log("Clicking on newsletterbox"+ booksTab.toString()+ "<br>");
        clickOnElement(booksTab);
    }
    public void clickOnJewelry() {
        Reporter.log("Clicking on Jewelry"+ jewelryTab.toString()+ "<br>");
        clickOnElement(jewelryTab);
    }
    public void clickOnGiftCards() {
        Reporter.log("Clicking onGiftCards"+ giftcards.toString()+ "<br>");
        clickOnElement(giftcards);
    }
    public void clickOnLogInLink() {
        Reporter.log("Clicking on LogInLink"+ logInLink.toString()+ "<br>");
        clickOnElement(logInLink);
    }
    public void clickOnRegisterLink(){
        Reporter.log("Clicking on RegisterLink"+ registerLink.toString()+ "<br>");
        clickOnElement(registerLink);
           }
public String clickOnLogOutLink(){
    Reporter.log("getting LogOutLink text from "+logOut.toString()+"<br>");
    return getTextFromElement(logOut);
}

}
