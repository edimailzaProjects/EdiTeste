/*
 * PROJETO EDI TESTER
 * Steps - Cenário 5.2
 * Por: Edi Bezerra
 * 
 * */

package cenario5_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import abrir_navegador.AbrirNavegador;
import cenario5_pages.Page_CT5_2;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Steps_CT5_2 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT5_2 page_CT5_2;
	
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT5_2 = new Page_CT5_2(this.driver);
	}
	
	@Dado("que o usuario preencheu corretamente o formulario de login")
	public void que_o_usuario_preencheu_corretamente_o_formulario_de_login() {
		abrirNavegador.abrirNavegador();
		page_CT5_2.formulario();
	}

	@Quando("ele clicar no botao Sing In")
	public void ele_clicar_no_botao_Sing_In() {
		page_CT5_2.logar();
	}

	@Então("ele sera redirecionado para a tela Home")
	public void ele_sera_redirecionado_para_a_tela_Home() {
		page_CT5_2.validarRedirecionamento();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}


}
