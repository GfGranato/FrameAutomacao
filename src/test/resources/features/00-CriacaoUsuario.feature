#language: pt
#encoding: UTF-8

Funcionalidade: Criar novo usuario
  Como usuario do SITE
  Gostaria de criar um novo usuario
  Para que eu possa realizar compras

  Contexto: Acessar tela de cadastro
    Dado que acesso o site
    Entao clico no link Crie a sua conta

  @mercadoLivreWeb @checarRecaptcha
  Cenario: Checar Recaptcha passando informacoes validas
    Dado que preencho os campos com informacoes validas
    Entao visualizo a mensagem "Marque a caixa de verificação" abaixo do recaptcha

  @mercadoLivreWeb @caracteresEspeciais
  Cenario: Realizar um cadastro enviando caracteres especiais
    Dado que preencho os dados incorretamente
    Entao visualizo as mensagens de erro