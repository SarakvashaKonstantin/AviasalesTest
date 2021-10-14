package utils;

import base.BrowserProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class DriverUtils {
    private static WebDriver driver;

    private DriverUtils(){setDriver();}

    public static WebDriver getDriver(){
        if (driver == null){
            new DriverUtils();
        }
        return driver;
    }

    public static WebDriver setDriver(){
        String prop = BrowserProperties.getConfigProperty("browserName").toLowerCase(Locale.ROOT);
        switch (prop){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException();
        }
        return driver;
    }
}
