/*
 * PROJETO EDI TESTER
 * Steps - Cenário 1.1
 * Por: Edi Bezerra
 * 
 * */
package cenario1_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import abrir_navegador.AbrirNavegador;
import cenario1_pages.Page_CT1_1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps_CT1_1 {
	
	private WebDriver driver;
	private AbrirNavegador abrirNavegador;
	private Page_CT1_1 page_CT1_1;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		this.driver = new ChromeDriver();
		abrirNavegador = new AbrirNavegador(this.driver);
		page_CT1_1 = new Page_CT1_1(this.driver);
	}
	
	@Dado("que o usuario inseriu email valido e clicou no botao Create Account")
	public void que_o_usuario_inseriu_email_valido_e_clicou_no_botao_Create_Account() {
		abrirNavegador.abrirNavegador();
		page_CT1_1.inserirEmail();
	}

	@Dado("preencheu todo o formulario com dados validos")
	public void preencheu_todo_o_formulario_com_dados_validos() {
		page_CT1_1.preencherFormulario();
	}

	@Quando("o usuario clicar em Register")
	public void o_usuario_clicar_em_Register() {
		page_CT1_1.clicarRegistrar();
	}

	@Quando("clicar em My Personal Information")
	public void clicar_em_My_Personal_Information() {
		page_CT1_1.clicarInformacoes();
	}

	@Entao("sera feita a comparacao entre os dados inseridos versus os salvos")
	public void sera_feita_a_comparacao_entre_os_dados_inseridos_versus_os_salvos() {
		page_CT1_1.compararInformacoes();
	}
	
	@After
	public void afterScenario() {
		this.driver.quit();
	}
}