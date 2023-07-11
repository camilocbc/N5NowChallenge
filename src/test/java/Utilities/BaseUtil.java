package Utilities;

import Definitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseUtil {
    protected WebDriver driver;
    private WebDriverWait wait;
    public BaseUtil(WebDriver driver){
        this.driver = driver;

    }


    protected void click(By selector, int seconds){
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector)).click();
    }
    protected void click(By selector){
        driver.findElement(selector).click();
    }

    protected void type(String text, By selector, int seconds){
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector)).sendKeys(text);
    }
    protected void type(String text, By selector){
        driver.findElement(selector).sendKeys(text);
    }
    protected void validateText(String expected, By selector, int seconds){
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
       String text = wait.until(ExpectedConditions.visibilityOfElementLocated(selector)).getText();
        Assert.assertEquals(expected,text);
    }
    protected void validateText(String expected, By selector){
        String text = driver.findElement(selector).getText();
        Assert.assertEquals(expected,text);
    }
}
