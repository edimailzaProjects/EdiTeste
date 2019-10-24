package cenario2_pages;


import static org.junit.Assert.assertNotEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page_CT2_3 {
	
	private WebDriver driver; 
	
	public Page_CT2_3(WebDriver driver) {
		this.driver = driver;
	}
	
	private By inserirEmail = By.id("email");
	private By inserirSenhaErrada = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By mensagemAlerta = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
	

	public void emailCorreto() {
		driver.findElement(inserirEmail).sendKeys("edi.qa.tester@gmail.com");
	}
	
	public void senhasErradas() {
		driver.findElement(inserirSenhaErrada).sendKeys("errou");
		driver.findElement(btnSingIn).click();
		driver.findElement(inserirSenhaErrada).sendKeys("errouDeNovo");
		driver.findElement(btnSingIn).click();
		driver.findElement(inserirSenhaErrada).sendKeys("errooou");
		driver.findElement(btnSingIn).click();
	}	
	public void validarBloqueio() {	
		String mensagemEsperada = driver.findElement(mensagemAlerta).getText();
		String mensagemAtual = "Authentication failed.";
		assertNotEquals(mensagemAtual,mensagemEsperada);		
	}

}
