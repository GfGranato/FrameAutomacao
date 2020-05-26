package br.com.SITE.qa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CriacaoUsuarioWebPage {
    public CriacaoUsuarioWebPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

}
