package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    public Register(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.button.button-small")
    WebElement signupBtn;

    public WebElement setSignupBtn() {
        return signupBtn;
    }

    @FindBy(xpath = "//input[@id='fullname']")
    WebElement fullName;

    public void setfullname(String fullname) {

    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailId;

    public WebElement setEmailId() {

        return emailId;
    }
    @FindBy(xpath = "//input[@id='password']")
    WebElement pwd;

    public WebElement setPwdId(){
        return pwd;
    }
    @FindBy(xpath = "//body/div[@id='app']/main/div/div/div/form/div[4]/button")
    WebElement signupIcon;

    public WebElement setSignupIcon() {
        return signupIcon;
    }

}






