package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage () {
        PageFactory.initElements(driver, this);
    }
   // - Desktops text, Sortby, Display, selectProductList Locators and it's actions
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildyourowncomputer;
public String verifyDesktopsText(){
    return getTextFromElement(desktopsText);
}
public void clickOnSortby(String text){
    Reporter.log("SelectingSortby"+text+" from dropdown "+sortBy.toString() + "<br>");
    selectByValueFromDropDown(sortBy,text);
}
public void clickOnDisplay(String text){
    Reporter.log("Selecting Display"+text+" from dropdown "+display.toString() + "<br>");
    selectByValueFromDropDown(display,text);
}
public void clickOnProductList(){
    Reporter.log("Clicking on ProductList"+ selectProductList.toString()+ "<br>");
    clickOnElement(selectProductList);
}
public void clickOnBuildYourOwnComputer(){
    Reporter.log("Clicking on BuildYourOwnComputer"+ buildyourowncomputer.toString()+ "<br>");
    clickOnElement(buildyourowncomputer);
}

}
