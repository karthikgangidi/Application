package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static com.Browser.browser.driver;

public class Screenshot1 {

    public void screenshot(String name)throws Exception{
        try {
            TakesScreenshot scrShot =((TakesScreenshot)driver);

            File Src=scrShot.getScreenshotAs(OutputType.FILE);

            String filePath = System.getProperty("user.dir")+"//target//Screenshot//"+name+".png";
            File Dest=new File(filePath);
            FileUtils.copyFile(Src, Dest);
        }catch (Exception e)
        {
            System.out.println("Screen Captured");
        }


    }
}
