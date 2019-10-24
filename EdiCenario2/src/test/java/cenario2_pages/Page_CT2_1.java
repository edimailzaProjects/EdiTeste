package cenario2_pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page_CT2_1 {
	
	private WebDriver driver; 

	
	public Page_CT2_1(WebDriver driver) {
		this.driver = driver;
	}
	
	private By inserirEmailC2 = By.id("email");
	private By inserirSenhaErrC2 = By.id("passwd");
	private By btnSingInC2 = By.id("SubmitLogin");
	private By senhaErrada = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
	
	public void emailCorreto() {
		driver.findElement(inserirEmailC2).sendKeys("edi.qa.tester@gmail.com");

		//for (String winHandle : driver.getWindowHandles()) {
			//driver.switchTo().window(winHandle);
		//}
	}
	
	public void senhaErrada() {
		driver.findElement(inserirSenhaErrC2).sendKeys("senhaerrada");
	}
	
	public void entrar() {
		driver.findElement(btnSingInC2).click();
	}
	
	public void validarNaoLogar() {
		String mensagemAtual = driver.findElement(senhaErrada).getText();
		String mensagemEsperada = "Authentication failed.";
		assertEquals(mensagemAtual,mensagemEsperada);
		System.out.println(mensagemAtual +" = "+mensagemEsperada);
	}

}