#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#6.1 - Deslogar e redirecionar para a tela [Home]
# Validar se, quando o usuário executar a acao de 
#desconectar-se do site ira ser redirecionado para a 
#pagina principal, a tela [Home]

@ct6
Funcionalidade: Deslogar e ir para Home
  Validar se, quando o usuario executar a acao de desconectar-se
   do site ira ser redirecionado para a página principal, a tela [Home]
  
  @ct6_1
  Cenario: Logar e redirecionar para a tela Home
    Dado que o usuario esta conectado ao sistema 
    Quando ele clicar em Sing Out 
    Então ele sera redirecionado para a tela Home