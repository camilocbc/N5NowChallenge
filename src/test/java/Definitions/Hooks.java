package Definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class Hooks {
    private WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=es");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void after(Scenario scenario){
        if (scenario.isFailed()) {
            // Capturar la captura de pantalla en caso de fallo
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Error Presentado");
        }
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
