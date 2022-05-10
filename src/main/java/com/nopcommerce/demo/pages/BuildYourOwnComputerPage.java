package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import javax.smartcardio.Card;
import java.security.cert.X509Certificate;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildyourowncompterText;
    @FindBy(xpath = "//select[@name='product_attribute_1']")
    WebElement processorDropDown;
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ramdropdown;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")//vista
          //  @FindBy(xpath = "//input[@id='product_attribute_4_9']")//vista Primium
    WebElement osRadio;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")//microsoftoffice
            //@FindBy(xpath="//input[@id='product_attribute_5_11']")
           // xpath="//input[@id='product_attribute_5_12']"
    WebElement softwareCheckBoxes;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCardButton;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDDradios320;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradios400;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;


    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice1;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader;


    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            clickOnElement(VistaHome1);
        } else {
            clickOnElement(VistaPremium);

        }
    }

    public void getHdd(String Hddtext) {
        if (Hddtext == "320GB") {
            clickOnElement(HDDradios320);
        } else {
            clickOnElement(HDDradios400);
        }
    }

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            clickOnElement(MicrosoftOffice1);
        }
        if (software == "TotalCommander") {
            clickOnElement(TotalCommander1);
        }
        if (software == "AcrobatReader") {
            clickOnElement(AcrobatReader1);
        }
    }

public String verifyBuildYourOwnComputerText(){
    Reporter.log("getting BuildYourOwnComputerText from "+buildyourowncompterText.toString()+"<br>");
        return getTextFromElement(buildyourowncompterText);
}
public void selectOnProcessorDropDown(String processor){
    Reporter.log("Selecting ProcessorDropDown"+processor+" from dropdown "+processorDropDown.toString() + "<br>");
    selectByVisibleTextFromDropDown(processorDropDown,processor);
}
public void selectOnRam(String ram){
    Reporter.log("Selecting Ram"+ ram+" from dropdown "+ramdropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(ramdropdown,ram);
}

//public void selectOSRedioButton(){
//    clickOnElement(osRadio);
//}
//public void selectSoftwareButton(){
//    clickOnElement(softwareCheckBoxes);
//}
public void clickOnAddToCartButton(){
    Reporter.log("Clicking on AddToCartButton"+ addToCardButton.toString()+ "<br>");
        clickOnElement(addToCardButton);
}

}
