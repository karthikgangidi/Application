package com.script;

import com.Pages.Login;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.Browser.browser.driver;
public class LoginScript {
    static Login lg;
    public static void setSignIn(){
        lg = new Login(driver);
       lg.getsignInbtn().click();
    }
    public static void setEmail(String emailID){
        WebDriverWait wait = new WebDriverWait(driver,30);
        lg.getEmail().sendKeys(emailID);
    }
    public static void setPassword(String pwd){
        lg.getPassword().sendKeys(pwd);
    }
    public static void getLogSignIn(){
        lg.setLogSignIn().click();
    }

    public static boolean getForgotPwd(){
       return lg.setForgotPwd().isDisplayed();

    }

}
