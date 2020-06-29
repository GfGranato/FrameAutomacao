package br.com.SITE.qa.web.pages;

import br.com.SITE.qa.commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuscaDeProdutosWebPage extends BaseTest {
    public BuscaDeProdutosWebPage (WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='as_word']")
    protected WebElement inputPesquisa;
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement lupaPesquisa;

    protected List<WebElement> listaProdutosEncontrados(String produto){
        String path = "//h2[@class='item__title list-view-item-title ']/span[contains(.,'"+produto+"')]";
        return webDriver.findElements(By.xpath(path));
    }

    @FindBy(xpath = "//a[@class='qcat-truncate ' and contains(.,'Até')]")
    protected WebElement linkAteValorMaximo;
}
