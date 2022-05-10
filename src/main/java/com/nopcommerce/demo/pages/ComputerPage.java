package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

     @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopsLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement notebooksLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement softwareLink;
    public String verifyComputersText(){
        Reporter.log("getting ComputersText  from "+computersText.toString()+"<br>");
        return getTextFromElement(computersText);
    }
    public void clickOnDesktopLink(){
        Reporter.log("Clicking on DesktopLink"+ desktopsLink.toString()+ "<br>");
        clickOnElement(desktopsLink);
    }
    public void clickOnNotebooksLink(){
        Reporter.log("Clicking on NotebooksLink"+ notebooksLink.toString()+ "<br>");
        clickOnElement(notebooksLink);
    }
    public void clickOnSoftwareLink(){
        Reporter.log("Clicking on SoftwareLink"+ softwareLink.toString()+ "<br>");
        clickOnElement(softwareLink);
    }
}
