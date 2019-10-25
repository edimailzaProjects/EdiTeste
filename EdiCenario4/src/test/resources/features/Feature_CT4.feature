#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#4.1 - Reabrir Compra
#Verificar se existe a possibilidade de inserir novos itens em compra já finalizada

@ct4
Funcionalidade: Reabertura de compras ja finalizadas
  Verificar se existe a possibilidade de inserir novos itens em compra ja finalizada
  @ct4_1
  Cenario: Reabrir e alterar compra
    Dado que o usuario que ja finalizou uma compra se conectou ao site 
    E clicou Order Story and Details
    Quando ele clicar em Reorder
    E alterar a quantidade de itens comprados
    E seguir as etapas de compra normalmente
    Então ao efetuar o pagamento ao clicar em confirm My order
    E ele podera verificar isso em Order Story and Details