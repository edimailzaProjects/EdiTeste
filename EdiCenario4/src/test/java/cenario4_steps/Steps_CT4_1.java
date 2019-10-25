/*
 * PROJETO EDI TESTER
 * Steps - Cenário 4.1
 * Por: Edi Bezerra
 * 
 * */


package cenario4_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import abrir_navegador.AbrirNavegador;
import cenario4_pages.Page_CT4_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Steps_CT4_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT4_1 page_CT4_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT4_1 = new Page_CT4_1(this.driver);
	}
	
	@Dado("que o usuario que ja finalizou uma compra se conectou ao site")
	public void que_o_usuario_que_ja_finalizou_uma_compra_se_conectou_ao_site() {
		abrirNavegador.abrirNavegador();
		page_CT4_1.fazerLogin();
	}

	@Dado("clicou Order Story and Details")
	public void clicou_Order_Story_and_Details() {
		page_CT4_1.clicarOrderDetails();
	}

	@Quando("ele clicar em Reorder")
	public void ele_clicar_em_Reorder() {
		page_CT4_1.clicarReorder();
	}

	@Quando("alterar a quantidade de itens comprados")
	public void alterar_a_quantidade_de_itens_comprados() {
		page_CT4_1.alterarQuantidade();
	}

	@Quando("seguir as etapas de compra normalmente")
	public void seguir_as_etapas_de_compra_normailmente() {
		page_CT4_1.seguirEtapasCompras();
	}

	@Então("ao efetuar o pagamento ao clicar em confirm My order")
	public void ao_efetuar_o_pagamento_ao_clicar_em_confirm_My_order() {
		page_CT4_1.efetuarPagamento();
	}

	@Então("ele podera verificar isso em Order Story and Details")
	public void ele_podera_verificar_isso_em_Order_Story_and_Details() {
		page_CT4_1.validarAlteracao();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
}
