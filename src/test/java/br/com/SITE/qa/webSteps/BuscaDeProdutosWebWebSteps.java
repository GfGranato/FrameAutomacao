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
    @Dado("^que pesquiso pelo produto <produto>$")
    public void quePesquisoPeloProdutoProduto() {
    }

    @E("^clico na lupa$")
    public void clicoNaLupa() {
    }

    @E("^sou redirecionado para a tela de produtos$")
    public void souRedirecionadoParaATelaDeProdutos() {
    }

    @Entao("^visualizo o <produto> listado na tela$")
    public void visualizoOProdutoListadoNaTela() {

    }

    //Validar preco filtrado
    @Dado("^pesquiso pelo produto <produto>$")
    public void pesquisoPeloProdutoProduto() {
    }

    @E("^clico na lupa de pesquisa$")
    public void clicoNaLupaDePesquisa() {

    }

    @E("^filtro o preco o preco com alguma das opcoes$")
    public void filtroOPrecoOPrecoComAlgumaDasOpcoes() {


    }

    @Entao("^vizualiso apenas os precos no intervalo selecionado$")
    public void vizualisoApenasOsPrecosNoIntervaloSelecionado() {
    }
}
