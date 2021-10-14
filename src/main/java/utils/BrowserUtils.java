package utils;

import base.BrowserProperties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

    public static WebDriver driver = DriverUtils.getDriver();

    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public static void quit(){
        if (driver != null){
            driver.quit();
        }
    }

    public void closePopUp(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.querySelector('.modal-content').closePopUp");
    }

    public void refreshPage(){driver.navigate().refresh();}

    public void navigateBack(){driver.navigate().back();}

    public void addCookie(Cookie cookie){driver.manage().addCookie(cookie);}

    public void openMainPage() {
        driver.get(BrowserProperties.getConfigProperty("mainUrl"));
    }
}
