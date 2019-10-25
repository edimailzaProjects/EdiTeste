#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#5.1 - Logar e redirecionar para a tela [My Wish List]
# Validar se ao logar no site, o usuário que já possui um item na lista de 
#desejos  é redirecionado para a tela [My Wish List] 
#5.2 -Logar e redirecionar para a tela [Home]
# Validar se ao logar  no site, o usuário que não 
#possui um item na lista de desejos  é redirecionado para a tela [Home]

@ct5
Funcionalidade: My Wishlist vazia X preenchida
  Verificar redirecionamento das paginas com a lista de desejos 
  preenchida e vazia
  
  @ct5_1
  Cenario: Logar e redirecionar para a tela My Wish List
    Dado que o usuario preencheu os dados no formulario de login 
    Quando ele clicar em Sing In 
    Então ele sera redirecionado para a tela My Wish List
    
  @ct5_2
  Cenario: Logar e redirecionar para a tela Home
    Dado que o usuario preencheu corretamente o formulario de login 
    Quando ele clicar no botao Sing In 
    Então ele sera redirecionado para a tela Home 