package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.model.Report;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//h1[contains(text(),'Register')]")
        WebElement RegisterText;
        //@FindBy(xpath = "//input[@id='gender-male']")
       // WebElement maleRadio;
        @FindBy(xpath = "//input[@id='gender-female']")
        WebElement femaleRadio;
        @FindBy(xpath = "//input[@id='FirstName']")
        WebElement firstName;
        @FindBy(xpath = "//input[@id='LastName']")
        WebElement lastName;
        @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
        WebElement selectDayOfBirth;
        @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
        WebElement selectMonthOfBirth;
        @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
        WebElement selectyearOfBirth;
        @FindBy(xpath = "//input[@id='Email']")
        WebElement email;
        @FindBy(xpath = "//input[@id='Password']")
        WebElement password;
        @FindBy(xpath = "//input[@id='ConfirmPassword']")
        WebElement confirmPassword;
        @FindBy(xpath = "//button[@id='register-button']")
        WebElement registerButon;
        @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
        WebElement yourRegisterCompletedText;
        @FindBy(xpath = "//a[contains(text(),'Continue')]")
        WebElement continuButton;
        public String getRegisterText() {
            Reporter.log("Verify the Text: " + registerButon.toString()+"<br>");

            return getTextFromElement(registerButon);
        }
//        public void clickOnMaleButton() {
//            clickOnElement(maleRadio);
//        }
        public void clickOnFemaleButton() {
            Reporter.log("Clicking on Female Button:" + femaleRadio.toString()+"<br>");
            clickOnElement(femaleRadio);
        }
        public void enterFirstName(String text) {
         Reporter.log("Entering FirstName: " + firstName.toString()+"<br>");
        sendTextToElement(firstName, text);
        }
        public void enterLastName(String text) {
        Reporter.log("Entering Last Name : " + lastName.toString()+"<br>");
            sendTextToElement(lastName, text);
        }
        public void setDayOfBirth(String text) {
            Reporter.log("Select Day Of Birth: " + selectDayOfBirth.toString()+"<br>");
            selectByValueFromDropDown(selectDayOfBirth, text);
        }public void setMonthOfBirth(String text) {
            Reporter.log("Select the Month Of Birth: " + selectMonthOfBirth.toString()+"<br>");
           selectByValueFromDropDown(selectMonthOfBirth, text);
    }
    public void setYearOfBirth(String text){
            Reporter.log("Select the Year of Birth: " + selectyearOfBirth.toString()+"<br>");
             selectByValueFromDropDown(selectyearOfBirth,text);
    }
    public void enterEmail(String text){
            Reporter.log("Enter Email: " + email.toString()+"<br>");
           sendTextToElement(email,text);
    }
    public void enterPassword(String text){
            Reporter.log("Enter Password: " + password.toString()+"<br>");
             sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
            Reporter.log("Enter Confirm Password: " + confirmPassword.toString()+"<br>");
            sendTextToElement(confirmPassword,text);
    }
    public void clickOnRegistedButton(){

            Reporter.log("Click On RegisterButton: " + registerButon.toString()+"<br>");
                    clickOnElement(registerButon);
    }
    public String getRegistrationCompletedText(){
            Reporter.log("Verify the Text: " + yourRegisterCompletedText.toString()+"<br>");
            return getTextFromElement(yourRegisterCompletedText);
    }
    public void clickOnCountinu(){
            Reporter.log("Click On Countinu Button: " + continuButton.toString()+"<br>");
            clickOnElement(continuButton);

    }

}
