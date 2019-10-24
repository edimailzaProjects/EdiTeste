#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#2.1 - Usuário com senha errada
#Verificar se o usuário consegue se conectar sem senha
#2.2- Usuário com senha em branco
#Verificar se o usuário consegue se conectar com senha errada
#2.3 - Várias tentativas com senhas erradas
#Verificar se o site bloqueia o usuário com várias tentativas de senha inválida
#2.4 - Cadastrar mesmo usuário duas vezes
#Verificar se outro usuário pode fazer um novo cadastro com dados de usuário já existente

@ct2
Funcionalidade: Segurança das Informações do usuario
  Verificar, por meio de tentativas de login, se os dados do usuario 
  estao seguros

  @ct2_1
  Cenario: Usuario com senha errada
    Dado que o usuario inseriu o email 
    E preencheu com senha incorreta
    Quando o usuario clicar em Sing In
    Entao ele nao conseguira logar
    
@ct2_2
  Cenario: Usuario com senha em branco
    Dado que o usuario inseriu o email corretamente 
    Quando ele nao preencher o campo de senha e clicar em Sing In
    Entao ele nao ira se conectar a sua conta


@ct2_3
  Cenario: Varias tentativas com senhas erradas
    Dado que o usuario inseriu seu email 
    Quando ele preencher o campo de senha varias vezes de forma incorreta 
    Entao uma mensagem de bloqueio de conta no site ou envio de alerta chegara via email 
   
@ct2_4
  Cenario: Cadastrar mesmo usuario duas vezes
    Dado que o usuario inseriu seu email a cadastrado no formulario Create Account
    Quando ele clicar no botao Create Account 
    Entao uma notificacao de email ja cadastrado surgira na tela 