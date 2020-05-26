package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.commons.BaseTest;
import br.com.SITE.qa.web.pages.CriacaoUsuarioWebPage;

public class CriacaoUsuarioWebFuncionalidade extends BaseTest {
    private CriacaoUsuarioWebPage criacaoUsuarioWebPage;

    public CriacaoUsuarioWebFuncionalidade() {
        this.criacaoUsuarioWebPage = new CriacaoUsuarioWebPage(webDriver);
    }


}
