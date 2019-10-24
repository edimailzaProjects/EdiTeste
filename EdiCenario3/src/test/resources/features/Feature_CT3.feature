#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#3.1 - Adicionar e logar para comprar via pagamento Bank Wire
# Verificar se é possível comprar N itens fazendo o login DEPOIS de adicionar os itens ao carrinho
#3.2- Logar para comprar via pagamento Check
# Verificar se é possível comprar N itens fazendo o login antes de adicionar os itens ao carrinho

@ct3
Funcionalidade: Compra de N itens
  Validar a operacao de compra de itens logando no sistema antes
  ou depois de adicionar itens ao carrinho e por meio dos
  dois tipos de pagamento disponiveis no site

  @ct3_1
  Cenario: Adicionar e logar para comprar via pagamento Bank Wire
    Dado que o usuario adicionou um item ao carrinho 
    E clicou em Continue Shipping para adicionar mais um item
    Quando ele conferir os itens inseridos e clicar em Proceed to Checkout
    Entao ele podera ir para as etapas seguintes de compra ao validar o login
    E efetuar o pagamento Bank Wire
    E finalizar a compra para conferir o status da ordem de pagamento
    
@ct3_2
  Cenario: Logar para comprar via pagamento Check
    Dado que o usuario se conectou em sua conta 
    E clicou em home e adicionou um item ao carrinho
    Quando ele verificar os itens inseridos e clicar em Proceed to Checkout
    Entao ele podera ir para as etapas seguintes da compra
    E efetuar o pagamento do tipo Check
    E finalizar a compra para verificar o status da ordem de pagamento
    