package br.com.SITE.qa.commons;

import br.com.SITE.qa.configuration.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait webWait;
    protected static String devsName, devsEmail, devsPassword;

    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();

        webDriver.get(PropertiesManager.getPropertiesValue("URL_aplication"));
        webWait = new WebDriverWait(webDriver, 80);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
