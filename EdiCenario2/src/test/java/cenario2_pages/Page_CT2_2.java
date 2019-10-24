package cenario2_pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page_CT2_2 {
	
	private WebDriver driver; 
	
	
	public Page_CT2_2(WebDriver driver) {
		this.driver = driver;
	}
	
	private By inserirEmail = By.id("email");
	private By naoInserirSenha = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By mensagemAlerta = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
	
	public void emailCorreto() {
		driver.findElement(inserirEmail).sendKeys("edi.qa.tester@gmail.com");
	}
	
	public void senhaEmBranco() {
		driver.findElement(naoInserirSenha).sendKeys("");
		driver.findElement(btnSingIn).click();
	}
	public void validarSenhaEmBranco() {	
		String mensagemAtual = driver.findElement(mensagemAlerta).getText();
		String mensagemEsperada = "Password is required.";
		assertEquals(mensagemAtual,mensagemEsperada);
		System.out.println(mensagemAtual +" = "+mensagemEsperada);
	}

}
