package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }
//    1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators
//    and create appropriate methods for it.
    @FindBy(xpath ="//input[@id='Email']")
    WebElement emailLoginField;
    @FindBy(xpath ="//input[@id='Password']" )
    WebElement passwordLoginField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement logInButton;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignIn;
public void enterEmailField(String text){
    Reporter.log("Enter Email: " + emailLoginField.toString()+"<br>");
sendTextToElement(emailLoginField,text);
}
public void enterPasswordField(String text){
    Reporter.log("Enter Pasword: " + passwordLoginField.toString()+"<br>");
    sendTextToElement(passwordLoginField,text);
}
public void clickOnLogInButton(){
    Reporter.log("Click On Log In: " + logInButton.toString()+"<br>");
    clickOnElement(logInButton);
}
public String verifyLogInButton(){
    Reporter.log("Verify the Text: " + logInButton.toString()+"<br>");
    return getTextFromElement(logInButton);
}
public String getWelcomeMessage(){
    Reporter.log("Verify The Text: " + welcomePleaseSignIn.toString()+"<br>");
    return getTextFromElement(welcomePleaseSignIn);

}
public String getErrorMessage(){
    Reporter.log("Verify the Text: " + errorMessage.toString()+"<br>");
    return getTextFromElement(errorMessage);
}

}
