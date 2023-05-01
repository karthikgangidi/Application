package com.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Browser.browser;
import java.util.List;
import com.Pages.shopNowPage;

import static com.Browser.browser.driver;

public class SearchProduct {
    static shopNowPage Trial;
    public static void shopbtnClick(){
         Trial = new shopNowPage(driver);
            Trial.getshopBtn().click();
        }
        public static void productselection (String lists) {
            try {
                Thread.sleep(3000);
                List<WebElement> list = Trial.getSelectItems().findElements(By.xpath(".//div/div[@class='css-vbgp86-SkeletonTheme']/div/div/div[2]/h5"));
                for(WebElement ele :list){
                    String products =ele.getText();
                    if (products.contains(lists))
                    {
                        ele.click();
                        break;
                    }
                }
            }
            catch(Exception e){

                System.out.println(e);
            }
        }
        public static void addCart(){
        Trial.getaddToCart().click();

        }
        public static void clickOnBasket(){
        Trial.getclickBasket().click();
        }
        public static void clickonCheckOutbtn(){
        Trial.getclickCheckOut().click();
        }
        }


