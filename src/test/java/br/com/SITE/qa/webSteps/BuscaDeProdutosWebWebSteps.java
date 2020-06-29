package br.com.SITE.qa.webSteps;

import br.com.SITE.qa.web.funcionalidades.BuscaDeProdutosWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class BuscaDeProdutosWebWebSteps extends BuscaDeProdutosWebFuncionalidade {
    private BuscaDeProdutosWebFuncionalidade buscaDeProdutosWebFuncionalidade;

    public BuscaDeProdutosWebWebSteps() {
        this.buscaDeProdutosWebFuncionalidade = new BuscaDeProdutosWebFuncionalidade();
    }

    //Pesquisar produto
    @Dado("^pesquiso pelo produto (.*)$")
    public void pesquisoPeloProdutoProduto(String produto) {
        buscaDeProdutosWebFuncionalidade.preencheCampoPesquisa(produto);
    }


    @E("^clico na lupa$")
    public void clicoNaLupa() {
        buscaDeProdutosWebFuncionalidade.clicaLupa();
    }

    @Entao("^visualizo o (.*) listado na tela$")
    public void visualizoOProdutoListadoNaTela(String produto) {
        Assert.assertTrue("Não foi encontrado nenhum "+produto+" listado",buscaDeProdutosWebFuncionalidade.isProdutosListadosNaTela(produto));
    }

    @E("^filtro o preco com uma das opcoes$")
    public void filtroOPrecoComUmaDasOpcoes() {
        buscaDeProdutosWebFuncionalidade.clicaValorAte();
    }
}
