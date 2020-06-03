package br.com.SITE.qa.webSteps;

import br.com.SITE.qa.web.funcionalidades.BuscaDeProdutosWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class BuscaDeProdutosWebWebSteps extends BuscaDeProdutosWebFuncionalidade {
    private BuscaDeProdutosWebFuncionalidade buscaDeProdutosWebFuncionalidade;

    public BuscaDeProdutosWebWebSteps() {
        this.buscaDeProdutosWebFuncionalidade = new BuscaDeProdutosWebFuncionalidade();
    }

    //Pesquisar produto
    @Dado("^pesquiso pelo produto (.*)$")
    public void pesquisoPeloProdutoProduto(String produto) {
    }

    @E("^clico na lupa$")
    public void clicoNaLupa() {
    }

    @E("^sou redirecionado para a tela de produtos$")
    public void souRedirecionadoParaATelaDeProdutos() {
    }

    @Entao("^visualizo o (.*) listado na tela$")
    public void visualizoOProdutoListadoNaTela(String produto1) {

    }

    @E("^filtro o preco com uma das opcoes$")
    public void filtroOPrecoComUmaDasOpcoes() {
    }

    @Entao("^vizualiso apenas os precos no intervalo selecionado$")
    public void vizualisoApenasOsPrecosNoIntervaloSelecionado() {
    }

}
