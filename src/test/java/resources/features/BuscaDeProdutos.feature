#language: pt

Funcionalidade: Busca de produtos
  Como usuario do SITE
  Gostaria de realizar busca de produtos
  Para que eu possa realizar compras

  Contexto: Acessar tela de produtos
    Dado que acesso o SITE

  Cenario: Pesquisar produto
    Quando pesquiso pelo produto <produto>
    E clico na lupa
    Entao sou redirecionado para a tela de produtos
    E visualizo o <produto> listado na tela

  Esquema do Cenario: Pesquisar produto para cozinha
    Quando pesquiso pelo produto <produto>
    E clico na lupa
    Entao sou redirecionado para a tela de produtos
    E visualizo o <produto> listado na tela
    Exemplos:
      | produto           |
      | panela de pressão |
      | colher de madeira |

   Cenario: Validar preco filtrado
     Quando pesquiso pelo produto <produto>
     E clico na lupa
     E filtro o preco para ...
     Entao vizualiso apenas precos no intervalo selecionado