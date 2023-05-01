package org.example;

import com.Browser.browser;
import com.script.RegisterScript;
import com.script.SearchProduct;
import com.script.LoginScript;

public class Main extends browser {
    public static void main(String[] args) throws InterruptedException {
        browser.readBrowser();
        driver.get("https://salinaka-ecommerce.web.app");
        RegisterScript.getsignUpBtn();
        RegisterScript.getfullName("karthikgangidi");
        RegisterScript.getEmailID("karthikgangidi@gmail.com");
        RegisterScript.getPwd("Welcome123");
        RegisterScript.getSignupIcon();
        LoginScript.setSignIn();
        LoginScript.setEmail("karthikgangidi@gmail.com");
        LoginScript.setPassword("Welcome123");
        LoginScript.getLogSignIn();
        LoginScript.getForgotPwd();
        Thread.sleep(3000);
        SearchProduct.shopbtnClick();
        SearchProduct.productselection("Very Nice");
        SearchProduct.addCart();
        SearchProduct.clickOnBasket();
        Thread.sleep(3000);
        SearchProduct.clickonCheckOutbtn();


    }
}