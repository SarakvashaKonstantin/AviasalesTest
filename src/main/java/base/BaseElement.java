package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public abstract class BaseElement {
    WebDriver driver = DriverUtils.getDriver();

    private final By locator;
    private final String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public void sendKeys(String name) {
        findElement().sendKeys(name);
    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }

    private WebElement findElement() {
        return driver.findElement(this.locator);
    }

    public String getText() {
        return findElement().getText();
    }

    public boolean isDisplayed() {
        return driver.findElement(this.locator)!=null;
    }

    public void click() {
        findElement().click();
    }
}

