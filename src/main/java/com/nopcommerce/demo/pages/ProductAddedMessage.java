package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductAddedMessage extends Utility {
    public ProductAddedMessage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement theProductHasBeenAddedToYourShoppingCart;
    public String verifyMessage(){
        Reporter.log("Verify the Text: " + theProductHasBeenAddedToYourShoppingCart.toString()+"<br>");
        return getTextFromElement(theProductHasBeenAddedToYourShoppingCart);
    }
}
