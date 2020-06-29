#language: pt
#encoding: UTF-8

Funcionalidade: Criar novo usuario
  Como usuario do SITE
  Gostaria de criar um novo usuario
  Para que eu possa realizar compras

  Contexto: Acessar tela de cadastro
    Dado que acesso o site
    E clico no link Crie a sua conta

  @mercadoLivreWeb
  Cenario: Checar mensagem CPF invalido
    Quando que preencho os campos com CPF invalido
    E aperto o botao Continuar
    Entao visualizo a mensagem O dígito verificador não é válido.

  @mercadoLivreWeb @FalhaNoSegundoAssert
  Cenario: Checar mensagem Recaptcha
    Quando que preencho os campos com CPF invalido
    E aperto o botao Continuar
    Entao visualizo mensagem do Rcaptcha Marque a caixa de verificação

  @mercadoLivreWeb @falhaProgramada @dontRun
  Cenario: Realizar um cadastro enviando caracteres especiais
    Quando que preencho o email e senha incorretamente
    Entao visualizo as mensagens de erro Utilize o formato nome@exemplo.com. e Debes ingresar mínimo 6 caracteres