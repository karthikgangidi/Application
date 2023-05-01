package Stepdefinitions;

import com.Action.Actions;
import com.Pages.shopNowPage;
import com.script.SearchProduct;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Action.Actions.*;
import static com.Browser.browser.driver;

public class step2 {

    @When("User clicks on Shop now button")
    public void user_clicks_on_shop_now_button() {
     SearchProduct.shopbtnClick();

    }
    @Then("User selects the {string}")
    public void user_selects_the(String product)  {

     SearchProduct.productselection(product);
    }

    @Then("User clicks on the Add to cart button")
    public void user_clicks_on_the_add_to_cart_button() {

        SearchProduct.addCart();
    }
    @And("User clicks on the basket")
    public void userClicksOnTheBasket() {

        SearchProduct.clickOnBasket();
    }
    
}
