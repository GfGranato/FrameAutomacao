#language: pt

Funcionalidade: Criar novo usuario
  Como usuario do SITE
  Gostaria de criar um novo usuario
  Para que eu possa realizar compras

  Contexto: Acessar tela de cadastro
    Dado que acesso o SITE
    E clico no Link Crie a sua conta

  Cenario: Checar Recaptcha passando informacoes validas
    Dado que acesso o SITE
    E clico no Link Crie a sua conta
    Quando preencho os dados corretamente
    Entao a mensagem "Marque a caixa de verificação" abaixo do recaptcha

  Cenario: Realizar Cadastro enviando caracteres especiais
    Dado que acesso o SITE
    E clico no Link Crie a sua conta
    Quando preencho os dados incorretamente
    Entao sou visualizo as mensagens de erro