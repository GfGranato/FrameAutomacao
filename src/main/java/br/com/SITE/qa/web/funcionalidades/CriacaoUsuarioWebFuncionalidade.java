package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.utils.RgCPFMaker;
import br.com.SITE.qa.web.pages.CriacaoUsuarioWebPage;
import com.github.javafaker.Faker;
import java.util.Locale;

public class CriacaoUsuarioWebFuncionalidade extends CriacaoUsuarioWebPage {
    public CriacaoUsuarioWebFuncionalidade() {
        super(webDriver);
    }

    private Faker faker = new Faker(new Locale("pt-BR"));
    private RgCPFMaker rgCPFMaker = new RgCPFMaker();
    public void preencheNomeESobrenome() {
        waitForElementPageToBeClickable(campoNome);
        campoNome.sendKeys(faker.name().firstName());
        campoSobrenome.sendKeys(faker.name().lastName());
    }

    public void preencheCampoEmail() {
        waitForElementToBeVisible(campoEmail);
        campoEmail.sendKeys(faker.leagueOfLegends().champion().replace(" ","")
                + "@"+faker.leagueOfLegends().location().replace(" ","")
                +".com");
    }

    public void preencheCampoSenha() {
        waitForElementToBeVisible(campoSenha);
        campoSenha.sendKeys("Senha123");
    }

    public void clicaBtnContinuar() {
        waitForElementToBeVisible(btnContinuar);
        btnContinuar.click();
    }

    public void preencheCampoCPF() {
        waitForElementToBeVisible(campoCPF);
        campoCPF.sendKeys("12345678901");
    }

    public boolean isMensagemCpfInvalidoDisplayed() {
        waitForElementToBeVisible(msgCPFInvalido);
        return msgCPFInvalido.isDisplayed();
    }
    public boolean isMensagemRecaptchaDisplayed() {
        waitForElementToBeVisible(msgRecaptcha);
        return msgRecaptcha.isDisplayed();
    }

    public void preencheCampoEmailIncorretamente() {
        waitForElementToBeVisible(campoEmail);
        campoEmail.sendKeys(faker.leagueOfLegends().champion().replace(" ","_") + "@");
    }

    public void preencheCampoSenhaIncorretamente() {
        waitForElementToBeVisible(campoSenha);
        campoSenha.sendKeys("123");
    }

    public boolean isMensagemEmailInvalidDisplayed(String msg1) {
        waitForElementToBeVisible(msgEmailInvalido);
        return msgEmailInvalido.isDisplayed();
    }

    public String isMensagemSenhaInvalidDisplayed(String msg2) {
        waitForElementToBeVisible(msgSpan(msg2));
        return msgSpan(msg2).getText();
    }
}
