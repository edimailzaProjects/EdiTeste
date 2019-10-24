/*
 * PROJETO EDI TESTER
 * Steps - Cenário 1.2
 * Por: Edi Bezerra
 * 
 * */
package cenario1_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario1_pages.Page_CT1_2;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT1_2 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT1_2 page_CT1_2;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT1_2 = new Page_CT1_2(this.driver);
	}

	@Dado("que o usuario ja possui cadastro na loja virtual")
	public void que_o_usuario_ja_possui_cadastro_na_loja_virtual() {
		abrirNavegador.abrirNavegador();
		page_CT1_2.login();
	    
	}

	@Quando("o usuario clicar em My Personal Information")
	public void o_usuario_clicar_em_My_Personal_Information() {
		page_CT1_2.clicarInformacoes();
	}

	@Quando("modificar um campo do cadastro clicando em seguida em salvar")
	public void modificar_um_campo_do_cadastro_clicando_em_seguida_em_salvar() {
		page_CT1_2.modificarNome();
	}

	@Entao("sera feita a comparacao entre os dados modificados versus os salvos")
	public void sera_feita_a_comparacao_entre_os_dados_modificados_versus_os_salvos() {
	    page_CT1_2.validarModificacoes();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
}
