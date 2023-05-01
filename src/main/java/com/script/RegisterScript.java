package com.script;

import com.Pages.Register;

import static com.Browser.browser.driver;

public class RegisterScript {

    static Register rg;
    public static void getsignUpBtn(){
        rg = new Register(driver);
        rg.setSignupBtn().click();
    }
    public static void getfullName(String fullname){
        rg.setfullname(fullname);
    }

    public static void getEmailID(String email){
        rg.setEmailId().sendKeys(email);
    }
    public static void getPwd(String password){
        rg.setPwdId().sendKeys(password);
    }
    public static void getSignupIcon(){
        rg.setSignupIcon().click();
    }
}
