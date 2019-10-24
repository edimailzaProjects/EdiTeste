#language: pt
#Autor: Edi - celular.corporativo.edi@gmail.com
#Cenarios: 
#1.1 - Cadastro e Comparação
#1.2 - Alterar Cadastro


@ct1
Funcionalidade: Dados cadastrados X Dados Salvos
  Comparar se os dados cadastrados pelo usuário são iguais aos dados salvos

  @ct1_1
  Cenario: Cadastro e comparação
    Dado que o usuario inseriu email valido e clicou no botao Create Account
    E preencheu todo o formulario com dados validos
    Quando o usuario clicar em Register
    E clicar em My Personal Information
    Entao sera feita a comparacao entre os dados inseridos versus os salvos
    
  @ct1_2
  Cenario: Alterar Cadastro
    Dado que o usuario ja possui cadastro na loja virtual
    Quando o usuario clicar em My Personal Information
    E modificar um campo do cadastro clicando em seguida em salvar
    Entao sera feita a comparacao entre os dados modificados versus os salvos
    