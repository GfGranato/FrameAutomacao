package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.web.pages.CriacaoUsuarioWebPage;
import com.github.javafaker.Faker;

import java.util.Locale;

public class CriacaoUsuarioWebFuncionalidade extends CriacaoUsuarioWebPage {
    public CriacaoUsuarioWebFuncionalidade() {
        super(webDriver);
    }

    private Faker faker = new Faker(new Locale("pt-BR"));

    public void preencheNomeESobrenome() {
        waitForElementPageToBeClickable(campoNome);
        campoNome.sendKeys(faker.name().firstName());
        campoSobrenome.sendKeys(faker.name().lastName());
    }

    public void preencheCampoEmail() {
        waitForElementToBeVisible(campoEmail);
        campoEmail.sendKeys(faker.leagueOfLegends().champion().replace(" ","_") + "@"+faker.leagueOfLegends().location()+".com");
    }

    public void preencheCampoSenha() {
        waitForElementToBeVisible(campoSenha);
        campoSenha.sendKeys("Senha123");
    }

    public void clicaBtnContinuar() {
        waitForElementToBeVisible(btnContinuar);
        btnContinuar.click();
    }
}
