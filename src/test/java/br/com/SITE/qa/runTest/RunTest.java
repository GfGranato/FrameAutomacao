package br.com.SITE.qa.runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {"pretty", "json:target/cucumber.json"},
        features = {".//src//test//resources//features" },
        glue = {"br.com.SITE.qa.webSteps", "br.com.SITE.qa.configuration"}, tags = {}
)
public class RunTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Inicio dos Testes");
        System.out.println("-------------\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Fim dos Testes");
        System.out.println("-------------");
    }


}
