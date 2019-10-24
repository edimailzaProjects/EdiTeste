package cenario2_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario2_pages.Page_CT2_3;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT2_3 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT2_3 page_CT2_3;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT2_3 = new Page_CT2_3(this.driver);
	}
	
	@Dado("que o usuario inseriu seu email")
	public void que_o_usuario_inseriu_seu_email() {
		abrirNavegador.abrirNavegador();
		page_CT2_3.emailCorreto();
	}

	@Quando("ele preencher o campo de senha varias vezes de forma incorreta")
	public void ele_preencher_o_campo_de_senha_varias_vezes_de_forma_incorreta() {
		page_CT2_3.senhasErradas();
	}

	@Entao("uma mensagem de bloqueio de conta no site ou envio de alerta chegara via email")
	public void uma_mensagem_de_bloqueio_de_conta_no_site_ou_envio_de_alerta_chegara_via_email() {
		page_CT2_3.validarBloqueio();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}

}
