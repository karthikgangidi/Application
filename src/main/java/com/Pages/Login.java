package com.Pages;

import com.Browser.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
    public Login(WebDriver driver) {
        PageFactory.initElements(browser.driver, this);
    }

    @FindBy(css = "a.button.button-small.button-muted.margin-left-s")
    WebElement signInbtn;

    public WebElement getsignInbtn() {
        return signInbtn;
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement Email;
    public WebElement getEmail() {
        return Email;
    }
    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    public WebElement getPassword() {
        return Password;
    }
    @FindBy(xpath = "//button[@class='button auth-button']")
    WebElement logSignIn;

    public WebElement setLogSignIn() {
        return logSignIn;
    }

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPwd;

    public WebElement setForgotPwd() {
        return forgotPwd;
    }
}