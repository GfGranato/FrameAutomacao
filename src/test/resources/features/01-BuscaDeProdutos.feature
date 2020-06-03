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
    E pesquiso pelo produto PAO DOCE
    Quando clico na lupa
    Entao visualizo o PAO DOCE listado na tela

  Esquema do Cenario: Pesquisar produto para cozinha
    E pesquiso pelo produto <produto>
    E clico na lupa
    Entao visualizo o <produto> listado na tela
    Exemplos:
      | produto           |
      | panela de pressao |
      | colher de madeira |

  @mercadoLivreWeb @validarPreco
  Cenario: Validar preco filtrado
     E pesquiso pelo produto Uno Mile
     Quando clico na lupa
     E filtro o preco com uma das opcoes
     Entao vizualiso apenas os precos no intervalo selecionado