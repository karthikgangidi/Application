package com.Action;

import com.Browser.browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

    public Actions(WebDriver driver) {
        Actions act = new Actions(browser.driver);
    }
    public void scrollDown(WebDriver driver){
        JavascriptExecutor executor = (JavascriptExecutor) browser.driver;
        executor.executeScript("window.scrollBy(0,2000)","");
    }
    public void clickUsingJavaScriptExecutor(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) browser.driver;
        executor.executeScript("arguments[0].click()",element);

}}
