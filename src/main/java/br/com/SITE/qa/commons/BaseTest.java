package br.com.SITE.qa.commons;

import br.com.SITE.qa.configuration.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait webWait;

    public BaseTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
        this.webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public BaseTest() {
    }

    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        webDriver.get(PropertiesManager.getPropertiesValue("URL_application"));
        webWait = new WebDriverWait(webDriver, 20);
    }

    public void waitForElementToBeVisible(WebElement element) {
        webWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementPageToBeClickable(WebElement element) {
        webWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
