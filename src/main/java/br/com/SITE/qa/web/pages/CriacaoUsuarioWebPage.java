package br.com.SITE.qa.web.pages;

import br.com.SITE.qa.commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CriacaoUsuarioWebPage  extends BaseTest {
    public CriacaoUsuarioWebPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    protected WebElement campoNome;
    @FindBy(xpath = "//input[@id='lastName']")
    protected WebElement campoSobrenome;
    @FindBy(xpath = "//input[@id='email']")
    protected WebElement campoEmail;
    @FindBy(xpath = "//input[@id='password']")
    protected WebElement campoSenha;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement btnContinuar;
}
