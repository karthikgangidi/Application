package Stepdefinitions;

import com.script.RegisterScript;
import io.cucumber.java.en.*;

public class step3 {


    @Given("user clicks on the signup button")
    public void user_clicks_on_the_signup_button() {
        RegisterScript.getsignUpBtn();
    }
    @Then("user enters the fullname as {string}")
    public void user_enters_the_fullname_as(String string) {
        RegisterScript.getfullName("karthikgangidi");

    }
    @And("user enters the email as {string} and Password as {string}")
    public void user_enters_the_email_as_and_password_as(String string, String string2) {
        RegisterScript.getEmailID("karthikgangidi@gmail.com");
        RegisterScript.getPwd("Welcome123");
    }
    @Then("user click on signup button")
    public void user_click_on_signup_button() {
        RegisterScript.getSignupIcon();
    }

}
