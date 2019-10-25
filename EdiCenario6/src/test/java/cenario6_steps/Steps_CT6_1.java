/*
 * PROJETO EDI TESTER
 * Steps - Cenário 6.1
 * Por: Edi Bezerra
 * 
 * */

package cenario6_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import abrir_navegador.AbrirNavegador;
import cenario6_pages.Page_CT6_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Steps_CT6_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT6_1 page_CT6_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT6_1 = new Page_CT6_1(this.driver);
	}
	
	@Dado("que o usuario esta conectado ao sistema")
	public void que_o_usuario_esta_conectado_ao_sistema() {
		abrirNavegador.abrirNavegador();
		page_CT6_1.estarLogado();
	}

	@Quando("ele clicar em Sing Out")
	public void ele_clicar_em_Sing_Out() {
		page_CT6_1.desconectar();
	}

	@Então("ele sera redirecionado para a tela Home")
	public void ele_sera_redirecionado_para_a_tela_Home() {
		page_CT6_1.validarRedirecionamento();
	}	
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
}
