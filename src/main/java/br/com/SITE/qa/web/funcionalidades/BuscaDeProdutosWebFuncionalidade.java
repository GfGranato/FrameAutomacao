package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.commons.BaseTest;
import br.com.SITE.qa.web.pages.BuscaDeProdutosWebPage;

public class BuscaDeProdutosWebFuncionalidade extends BaseTest {
    private BuscaDeProdutosWebPage buscaDeProdutosWebPage;

    public BuscaDeProdutosWebFuncionalidade() {
        buscaDeProdutosWebPage = new BuscaDeProdutosWebPage(webDriver);
    }

}
