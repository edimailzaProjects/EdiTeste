package cenario2_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario2_pages.Page_CT2_2;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT2_2 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT2_2 page_CT2_2;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT2_2 = new Page_CT2_2(this.driver);
	}
	
	@Dado("que o usuario inseriu o email corretamente")
	public void que_o_usuario_inseriu_o_email_corretamente() {
		abrirNavegador.abrirNavegador();
		page_CT2_2.emailCorreto();
	}

	@Quando("ele nao preencher o campo de senha e clicar em Sing In")
	public void ele_não_preencher_o_campo_de_senha_e_clicar_em_Sing_In() {
		page_CT2_2.senhaEmBranco();
	}

	@Entao("ele nao ira se conectar a sua conta")
	public void ele_nao_ira_se_conectar_a_sua_conta() {
		page_CT2_2.validarSenhaEmBranco();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
	
}
