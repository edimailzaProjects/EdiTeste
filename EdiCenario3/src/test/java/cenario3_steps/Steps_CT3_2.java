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
import cenario3_pages.Page_CT3_2;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT3_2 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT3_2 page_CT3_2;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT3_2 = new Page_CT3_2(this.driver);
	}
	
	@Dado("que o usuario se conectou em sua conta")
	public void que_o_usuario_se_conectou_em_sua_conta() {
		abrirNavegador.abrirNavegador();
		page_CT3_2.fazerLogin();
	}

	@Dado("clicou em home e adicionou um item ao carrinho")
	public void clicou_em_home_e_adicionou_um_item_ao_carrinho() {
		page_CT3_2.adicionarItem();
	}

	@Quando("ele verificar os itens inseridos e clicar em Proceed to Checkout")
	public void ele_verificar_os_itens_inseridos_e_clicar_em_Proceed_to_Checkout() {
		page_CT3_2.verificarEseguir();
	}

	@Entao("ele podera ir para as etapas seguintes da compra")
	public void ele_podera_ir_para_as_etapas_seguintes_da_compra() {
		page_CT3_2.irEtapasDeCompra();
	}

	@Entao("efetuar o pagamento do tipo Check")
	public void efetuar_o_pagamento_do_tipo_Check() {
		page_CT3_2.pagarEConferir();
	}

	@Entao("finalizar a compra para verificar o status da ordem de pagamento")
	public void finalizar_a_compra_para_verificar_o_status_da_ordem_de_pagamento() {
		page_CT3_2.concluirPedido();
	}

	
	@After
	public void afterScenario() {
		this.driver.quit();
	}

}