package br.com.SITE.qa.webSteps;

import br.com.SITE.qa.web.funcionalidades.CriacaoUsuarioWebFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CriacaoUsuarioWebSteps extends CriacaoUsuarioWebFuncionalidade {
    private CriacaoUsuarioWebFuncionalidade criacaoUsuarioWebFuncionalidade;

    public CriacaoUsuarioWebSteps() {
        this.criacaoUsuarioWebFuncionalidade = new CriacaoUsuarioWebFuncionalidade();
    }

    //Cenario: Checar Recaptcha passando informacoes validas
    @Quando("^que preencho os campos com CPF invalido$")
    public void quePreenchoOsCamposComInformacoesValidas() {
        criacaoUsuarioWebFuncionalidade.preencheNomeESobrenome();
        criacaoUsuarioWebFuncionalidade.preencheCampoCPF();
        criacaoUsuarioWebFuncionalidade.preencheCampoEmail();
        criacaoUsuarioWebFuncionalidade.preencheCampoSenha();
    }


    @E("^aperto o botao Continuar$")
    public void apertoOBotaoContinuar() {
        criacaoUsuarioWebFuncionalidade.clicaBtnContinuar();
    }


    @Entao("^visualizo a mensagem (.*)$")
    public void visualizoAMensagem(String msg) {
        Assert.assertTrue("Mensagem "+msg+" não visivel",criacaoUsuarioWebFuncionalidade.isMensagemCpfInvalidoDisplayed());
    }

    @Quando("^que preencho o email e senha incorretamente$")
    public void quePreenchoOEmailESenhaIncorretamente() {
        criacaoUsuarioWebFuncionalidade.preencheNomeESobrenome();
        criacaoUsuarioWebFuncionalidade.preencheCampoCPF();
        criacaoUsuarioWebFuncionalidade.preencheCampoEmailIncorretamente();
        criacaoUsuarioWebFuncionalidade.preencheCampoSenhaIncorretamente();
    }

    @Entao("^visualizo as mensagens de erro (.*) e (.*)$")
    public void visualizoAsMensagensDeErroMsgEMsg(String msg1, String msg2 ) {
        Assert.assertTrue("Mensagem nao visivel",criacaoUsuarioWebFuncionalidade.isMensagemEmailInvalidDisplayed(msg1));
        Assert.assertEquals("Quebrou nesse assertEquals!",criacaoUsuarioWebFuncionalidade.isMensagemSenhaInvalidDisplayed(msg2));
    }

    @Entao("^visualizo erro de assert para mensagem (.*)$")
    public void visualizoErroDeAssert(String msg) {
        Assert.assertFalse("Mensagem "+msg+" não visivel", criacaoUsuarioWebFuncionalidade.isMensagemCpfInvalidoDisplayed());
    }

    @Entao("^visualizo mensagem do Rcaptcha (.*)$")
    public void visualizoMensagemRecaptcha(String msg) {
        Assert.assertTrue("Mensagem "+msg+" não visivel", criacaoUsuarioWebFuncionalidade.isMensagemRecaptchaDisplayed());
    }
}
