package cenario2_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import abrir_navegador.AbrirNavegador;
import cenario2_pages.Page_CT2_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT2_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT2_1 page_CT2_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT2_1 = new Page_CT2_1(this.driver);
	}
	
	@Dado("que o usuario inseriu o email")
	public void que_o_usuario_inseriu_o_email() {
		abrirNavegador.abrirNavegador();
		page_CT2_1.emailCorreto();
	}

	@Dado("preencheu com senha incorreta")
	public void preencheu_com_senha_incorreta() {
		page_CT2_1.senhaErrada();
	}

	@Quando("o usuario clicar em Sing In")
	public void o_usuario_clicar_em_Sing_In() {
		page_CT2_1.entrar();
	}

	@Entao("ele nao conseguira logar")
	public void ele_nao_conseguira_logar() {
		page_CT2_1.validarNaoLogar();
	}

	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
	

}