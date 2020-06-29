#language: pt
#encoding: UTF-8
Funcionalidade: Busca de produtos
  Como usuario do SITE
  Gostaria de realizar busca de produtos
  Para que eu possa realizar compras

  Contexto: Acessar tela de produtos
    Dado que acesso o site

  @mercadoLivreWeb @pesquisaProdutos
  Cenario: Pesquisar produto
    Quando pesquiso pelo produto Cadeira Gamer
    Entao visualizo o Cadeira Gamer POO listado na tela

  @mercadoLivreWeb
  Esquema do Cenario: Pesquisar produto para cozinha
    Quando pesquiso pelo produto <produto>
    Entao visualizo o <produto> listado na tela
    Exemplos:
      | produto           |
      | Panela De Pressao |
      | Panela De Pressão |
      | Colher De Pau     |

  @mercadoLivreWeb @validarPreco @dontRun
  Cenario: Validar preco filtrado
     Quando pesquiso pelo produto Uno Mile
     E filtro o preco com uma das opcoes
     Entao vizualiso apenas os precos no intervalo selecionado