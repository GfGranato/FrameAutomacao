package br.com.SITE.qa.web.funcionalidades;

import br.com.SITE.qa.commons.BaseTest;
import br.com.SITE.qa.web.pages.CommonWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonWebFuncionalidade extends BaseTest {
    private CommonWebPage commonWebPage;

    public CommonWebFuncionalidade() {
        commonWebPage = new CommonWebPage(webDriver);
    }

    public void clicaCriarSuaConta() {
        webWait.until(ExpectedConditions.elementToBeClickable(this.commonWebPage.getLinkCriarConta()));
        this.commonWebPage.getLinkCriarConta().click();
    }
}
