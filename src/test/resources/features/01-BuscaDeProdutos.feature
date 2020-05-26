#language: pt

Funcionalidade: Busca de produtos
  Como usuario do SITE
  Gostaria de realizar busca de produtos
  Para que eu possa realizar compras

  Contexto: Acessar tela de produtos
    Dado que acesso o SITE

  @pesquisaProdutos
  Cenario: Pesquisar produto
    Dado que pesquiso pelo produto <produto>
    E clico na lupa
    E sou redirecionado para a tela de produtos
    Entao visualizo o <produto> listado na tela

  Esquema do Cenario: Pesquisar produto para cozinha
    Dado que pesquiso pelo produto <produto>
    E clico na lupa
    E sou redirecionado para a tela de produtos
    Entao visualizo o <produto> listado na tela
    Exemplos:
      | produto           |
      | panela de pressão |
      | colher de madeira |

  @validarPreco
  Cenario: Validar preco filtrado
     Dado pesquiso pelo produto <produto>
     E clico na lupa de pesquisa
     E filtro o preco o preco com alguma das opcoes
     Entao vizualiso apenas os precos no intervalo selecionado