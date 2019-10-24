package cenario2_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario2_pages.Page_CT2_4;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT2_4 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT2_4 page_CT2_4;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT2_4 = new Page_CT2_4(this.driver);
	}
	
	@Dado("que o usuario inseriu seu email a cadastrado no formulario Create Account")
	public void que_o_usuario_inseriu_seu_email_a_cadastrado_no_formulario_Create_Account() {
		abrirNavegador.abrirNavegador();
		page_CT2_4.inserirEmailExistente();
	}

	@Quando("ele clicar no botao Create Account")
	public void ele_clicar_no_botao_Create_Account() {
		page_CT2_4.clicarCreateAccout();
	}

	@Entao("uma notificacao de email ja cadastrado surgira na tela")
	public void uma_notificacao_de_email_ja_cadastrado_surgira_na_tela() {
		page_CT2_4.validarAlerta();
	 
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}

}