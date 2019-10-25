/*
 * PROJETO EDI TESTER
 * Steps - Cenário 5.1
 * Por: Edi Bezerra
 * 
 * */

package cenario5_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario5_pages.Page_CT5_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Steps_CT5_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT5_1 page_CT5_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT5_1 = new Page_CT5_1(this.driver);
	}
	
	@Dado("que o usuario preencheu os dados no formulario de login")
	public void que_o_usuario_preencheu_os_dados_no_formulario_de_login() {
		abrirNavegador.abrirNavegador();
		page_CT5_1.formulario();
	}

	@Quando("ele clicar em Sing In")
	public void ele_clicar_em_Sing_In() {
		page_CT5_1.logar();
	}

	@Então("ele sera redirecionado para a tela My Wish List")
	public void ele_sera_redirecionado_para_a_tela_My_Wish_List() {
		page_CT5_1.validarRedirecionamento();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
}