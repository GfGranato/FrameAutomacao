#language: pt

Funcionalidade: Criar novo usuario
  Como usuario do SITE
  Gostaria de criar um novo usuario
  Para que eu possa realizar compras

  Contexto: Acessar tela de cadastro
    Dado que acesso o SITE
    Quando clico no Link Crie a sua conta
    Entao sou redirecionado para a tela de registro

    Cenario: Realizar Cadastro com sucesso
      Dado que acesso o SITE
      E clico no Link Crie a sua conta
      Quando preencho os dados corretamente
      Entao sou cadastrado no SITE com sucesso

  Cenario: Realizar Cadastro enviando caracteres especiais
    Dado que acesso o SITE
    E clico no Link Crie a sua conta
    Quando preencho os dados incorretamente
    Entao sou visualizo as mensagens de erro