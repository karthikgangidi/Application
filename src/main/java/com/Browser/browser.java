package com.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Properties;

public class browser {
    static String browserChoice = browser.readConfig("browser");
    static String urlChoice = browser.readConfig("url");
    static String browserstack_Username = browser.readConfig("bsUsername");
    static String browserstack_AccessKey = browser.readConfig("bsAccessKey");
    public static RemoteWebDriver driver;

    public static String readConfig(String fileProperties) {
        String Datareturn = null;
        String filePath = System.getProperty("user.dir") + "//src//main//Configuration//config.properties";
        try {
            FileInputStream file = new FileInputStream(filePath);
            Properties prop = new Properties();
            prop.load(file);
            Datareturn = prop.getProperty(fileProperties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Datareturn;
    }
    public static void Intialisation() throws MalformedURLException {

        if (browserChoice.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if (browserChoice.equalsIgnoreCase("remoteChrome")) {
            String URL = "https://"+browserstack_Username+":"+browserstack_AccessKey+"@hub-cloud.browserstack.com/wd/hub";

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Ventura");
            caps.setCapability("browser", "Chrome");


            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        }

        else if (browserChoice.equalsIgnoreCase("remoteFirefox")) {
            String URL = "https://"+browserstack_Username+":"+browserstack_AccessKey+"@hub-cloud.browserstack.com/wd/hub";

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Ventura");
            caps.setCapability("browser", "Firefox");


            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        }
    }
    public static void setUrl(){
        driver.get(urlChoice);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    public static void close(){
        driver.quit();
    }

    public static void readBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    public void address(){
        driver.get("https://salinaka-ecommerce.web.app/shop");
    }
}