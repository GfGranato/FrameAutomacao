package br.com.SITE.qa.webSteps;

import br.com.SITE.qa.web.funcionalidades.CriacaoUsuarioWebFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.omg.PortableServer.THREAD_POLICY_ID;

public class CriacaoUsuarioWebSteps extends CriacaoUsuarioWebFuncionalidade {
    private CriacaoUsuarioWebFuncionalidade criacaoUsuarioWebFuncionalidade;

    public CriacaoUsuarioWebSteps() {
        this.criacaoUsuarioWebFuncionalidade = new CriacaoUsuarioWebFuncionalidade();
    }

    //Cenario: Checar Recaptcha passando informacoes validas
    @Quando("^que preencho os campos com informacoes validas$")
    public void quePreenchoOsCamposComInformacoesValidas() {
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\" abaixo do recaptcha$")
    public void visualizoAMensagemAbaixoDoRecaptcha(String msg0) {
    }

    //Cenario: Realizar um cadastro enviando caracteres especiais
    @Quando("^que preencho os dados incorretamente$")
    public void quePreenchoOsDadosIncorretamente() {
    }

    @Entao("^visualizo as mensagens de erro$")
    public void visualizoAsMensagensDeErro() {
    }
}
