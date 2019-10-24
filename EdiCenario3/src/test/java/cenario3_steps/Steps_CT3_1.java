/*
 * PROJETO EDI TESTER
 * Steps - Cenário 3.1
 * Por: Edi Bezerra
 * 
 * */

package cenario3_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario3_pages.Page_CT3_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT3_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT3_1 page_CT3_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT3_1 = new Page_CT3_1(this.driver);
	}
	
	@Dado("que o usuario adicionou um item ao carrinho")
	public void que_o_usuario_adicionou_um_item_ao_carrinho() {
		abrirNavegador.abrirNavegador();
		page_CT3_1.adicionarItemA();
	   
	}

	@Dado("clicou em Continue Shipping para adicionar mais um item")
	public void clicou_em_Continue_Shipping_para_adicionar_mais_um_item() {
		page_CT3_1.adicionarItemB();
		
	}

	@Quando("ele conferir os itens inseridos e clicar em Proceed to Checkout")
	public void ele_conferir_os_itens_inseridos_e_clicar_em_Proceed_to_Checkout() {
		page_CT3_1.conferirCarrinho();
		page_CT3_1.fazerCheckout();		
	}

	@Entao("ele podera ir para as etapas seguintes de compra ao validar o login")
	public void ele_podera_ir_para_as_etapas_seguintes_de_compra() {
		page_CT3_1.fazerLogin();
		page_CT3_1.comprar();
	   
	}

	@Entao("efetuar o pagamento Bank Wire")
	public void efetuar_o_pagamento_Bank_Wire() {
		page_CT3_1.pagarEConferir();
	   
	}

	@Entao("finalizar a compra para conferir o status da ordem de pagamento")
	public void finalizar_a_compra_para_conferir_o_status_da_ordem_de_pagamento() {
		page_CT3_1.concluirPedido();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}

}