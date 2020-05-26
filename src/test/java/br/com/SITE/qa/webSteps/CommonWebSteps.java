package br.com.SITE.qa.webSteps;

import br.com.SITE.qa.web.funcionalidades.CommonWebFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class CommonWebSteps extends CommonWebFuncionalidade {
    private CommonWebFuncionalidade commonWebFuncionalidade;

    public CommonWebSteps() {
        this.commonWebFuncionalidade = new CommonWebFuncionalidade();
    }

    @Dado("^que acesso o site$")
    public void queAcessoOSite() {

    }

    @Entao("^clico no link Crie a sua conta$")
    public void clicoNoLinkCrieASuaConta() {
        this.commonWebFuncionalidade.clicaCriarSuaConta();
    }
}
