package AppHooks;

import com.Browser.browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static com.Browser.browser.close;
import static com.Browser.browser.driver;

public class ApplicationHooks {

    @Before(order = 0)
    public void getBrowser() throws MalformedURLException {
        browser.Intialisation();
    }
    @Before(order = 1)
    public void getUrl(){
        browser.setUrl();
    }
    @After(order = 0)
        public static void quit() {
        browser.close();
    }
    /*@After(order =1)
          public void tearDown(String name) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot)driver );
        File Src = scrShot.getScreenshotAs(OutputType.FILE);
        String filePath = System.getProperty("user.dir")+"//target//Screenshot//"+name+".png";
        File Dest = new File(filePath);
        FileUtils.copyFile(Src,Dest);
    }*/
        }



