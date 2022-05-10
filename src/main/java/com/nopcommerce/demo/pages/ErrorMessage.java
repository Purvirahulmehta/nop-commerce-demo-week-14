package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ErrorMessage extends Utility {
    public ErrorMessage() {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//span[@id='FirstName-error']")
        WebElement firstNameError ;
        @FindBy(xpath = "//span[@id='LastName-error']")
        WebElement lastNameError;
        @FindBy(xpath = "//span[@id='Email-error']")
        WebElement emailError;
        @FindBy(xpath = "//span[@id='Password-error']")
        WebElement passwordError;
        @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
        WebElement confirmPasswordError;
       public String getFirstNameError(){
           Reporter.log("getting FirstNameError text from "+firstNameError.toString()+"<br>");
           return getTextFromElement(firstNameError);
       }
       public String getLastNameError(){
           Reporter.log("getting LastNameError text from "+lastNameError.toString()+"<br>");
           return getTextFromElement(lastNameError);
       }
       public String getEmailError(){
           Reporter.log("getting EmailError text from "+emailError.toString()+"<br>");
           return getTextFromElement(emailError);
       }
       public String getPasswordError(){
           Reporter.log("getting PasswordError text from "+passwordError.toString()+"<br>");
           return getTextFromElement(passwordError);
       }
       public String getConfirmPasswordError(){
           Reporter.log("getting ConfirmPasswordError text from "+confirmPasswordError.toString()+"<br>");
           return getTextFromElement(confirmPasswordError);
       }

    }

