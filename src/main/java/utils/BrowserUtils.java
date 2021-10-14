package utils;

import base.BrowserProperties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

    public static WebDriver driver = DriverUtils.getDriver();

    private static ClassLoader classLoader = BrowserProperties.class.getClassLoader();
    private static File screenshotFile = new File(classLoader.getResource("screen.png").getFile());
    private static String screenshotPath = screenshotFile.getAbsolutePath();

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

    public void takeScreenshot(){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refreshPage(){driver.navigate().refresh();}

    public void navigateBack(){driver.navigate().back();}

    public void addCookie(Cookie cookie){driver.manage().addCookie(cookie);}

    public void openMainPage() {
        driver.get(BrowserProperties.getConfigProperty("authUrl"));
    }
}
