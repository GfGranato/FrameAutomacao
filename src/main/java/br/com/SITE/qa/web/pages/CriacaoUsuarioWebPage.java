package br.com.SITE.qa.web.pages;

import br.com.SITE.qa.commons.BaseTest;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//input[@id='identification']")
    protected WebElement campoCPF;
    @FindBy(xpath = "//input[@id='email']")
    protected WebElement campoEmail;
    @FindBy(xpath = "//input[@id='password']")
    protected WebElement campoSenha;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement btnContinuar;

    @FindBy(xpath = "//span[.='O dígito verificador não é válido.']")
    protected WebElement msgCPFInvalido;
    @FindBy(xpath = "//span[.='Utilize o formato nome@exemplo.com.']")
    protected WebElement msgEmailInvalido;
    @FindBy(xpath = "(//div[.='Marque a caixa de verificação'])[last()]")
    protected WebElement msgRecaptcha;

    protected WebElement msgSpan(String msg){
        String path = "//span[.='"+msg+"']";
        return (WebElement) webDriver.findElements(By.xpath(path));
    }
}
