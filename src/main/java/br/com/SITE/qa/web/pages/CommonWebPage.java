package br.com.SITE.qa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonWebPage {
    public CommonWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@data-link-id='registration']")
    private WebElement linkCriarConta;

    public WebElement getLinkCriarConta() {
        return linkCriarConta;
    }
}
