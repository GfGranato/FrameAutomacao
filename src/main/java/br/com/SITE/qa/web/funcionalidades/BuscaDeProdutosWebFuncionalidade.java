package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.commons.BaseTest;
import br.com.SITE.qa.web.pages.BuscaDeProdutosWebPage;
import org.openqa.selenium.Keys;

public class BuscaDeProdutosWebFuncionalidade extends BuscaDeProdutosWebPage {
    private BuscaDeProdutosWebPage buscaDeProdutosWebPage;

    public BuscaDeProdutosWebFuncionalidade() {
        super(webDriver);
        buscaDeProdutosWebPage = new BuscaDeProdutosWebPage(webDriver);
    }

    public void preencheCampoPesquisa(String produto) {
        waitForElementToBeVisible(inputPesquisa);
        inputPesquisa.sendKeys(produto + Keys.ENTER);
    }

    public void clicaLupa() {
        waitForElementPageToBeClickable(lupaPesquisa);
    }

    public boolean isProdutosListadosNaTela(String produto) {
        waitForElementToBeVisible(listaProdutosEncontrados(produto).get(0));
        return ! listaProdutosEncontrados(produto).isEmpty();
    }

    public void clicaValorAte() {
        waitForElementPageToBeClickable(linkAteValorMaximo);
        linkAteValorMaximo.click();
    }

}
