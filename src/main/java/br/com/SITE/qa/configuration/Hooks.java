package br.com.SITE.qa.configuration;

import br.com.SITE.qa.commons.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {
    @Before(value = "@srbarrigaWeb")
    public void beforeSrBarrigaWeb() {
        initializeWebApplication(Web.CHROME_WINDOWS);
    }

    @After(value = "@srbarrigaWeb")
    public void afterSrBarrigaWeb() {
        closeWeb();
    }

}
