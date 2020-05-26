package br.com.SITE.qa.configuration;

import br.com.SITE.qa.commons.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {
    @Before(value = "@mercadoLivreWeb")
    public void beforeMercadoLivre() {
        initializeWebApplication(Web.CHROME_WINDOWS);
    }

    @After(value = "@mercadoLivreWeb")
    public void afterMercadoLivre() {
        closeWeb();
    }

}
