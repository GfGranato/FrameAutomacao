package br.com.SITE.qa.commons;

import br.com.SITE.qa.configuration.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait webWait;
    protected static String devsName, devsEmail, devsPassword;

    protected void initializeWebApplication(WebApplication webApplication, boolean trueFalse) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        if(trueFalse) {
        webDriver.get(PropertiesManager.getPropertiesValue("URL_SRBARRIGA"));
        }
        else if (!trueFalse) {
            webDriver.get(PropertiesManager.getPropertiesValue("URL_4DEVS"));
        }
        webWait = new WebDriverWait(webDriver, 80);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
