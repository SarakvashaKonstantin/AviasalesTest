package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

import java.time.Duration;

public abstract class BaseForm {
    WebDriver driver = DriverUtils.getDriver();
    private String name;
    private final BaseElement element;

    public BaseForm(BaseElement element, String name) {
        this.element = element;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    public void waitForOpen(BaseElement element){
        long timer = Long.parseLong(BrowserProperties.getConfigProperty("timerSec"));
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(timer))
                .until(ExpectedConditions.presenceOfElementLocated((element.getLocator())));

    }
}