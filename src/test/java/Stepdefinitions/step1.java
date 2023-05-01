package Stepdefinitions;

import com.script.LoginScript;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class step1 {

    @Given("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        LoginScript.setSignIn();
    }

    @Then("Forgot password link should be displayed")
    public void forgot_password_link_should_be_displayed() {

        Assert.assertTrue(LoginScript.getForgotPwd());
    }

    @Then("User enter Email as {string}")
    public void user_enter_email_as(String Email) {
        LoginScript.setEmail(Email);
    }

    @Then("User enter Password as {string}")
    public void user_enter_password_as(String Password) {
        LoginScript.setPassword(Password);
    }

    @Then("User clicks on log in button")
    public void user_clicks_on_log_in_button() {

        LoginScript.getLogSignIn();
    }


}


