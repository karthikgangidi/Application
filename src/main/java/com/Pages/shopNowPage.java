package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopNowPage {

    public shopNowPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Shop")
    WebElement shopBtn;

    public WebElement getshopBtn(){
        return shopBtn;
    }
    @FindBy (xpath = "//body/div[@id='app']/main/section")
    WebElement selectItems;

    public WebElement getSelectItems(){
        return selectItems;

    }
    @FindBy(xpath = "//button[contains(text(),'Add To Basket')]")
     WebElement addToCart;

    public WebElement getaddToCart(){
        return addToCart;
    }
    @FindBy(xpath = "//body/div[@id='app']/nav/ul[2]/li/button/div/span/*")
    WebElement clickBasket;

    public WebElement getclickBasket(){
        return clickBasket;
    }
    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    WebElement clickCheckOut;

    public WebElement getclickCheckOut(){
        return clickCheckOut;
    }
}