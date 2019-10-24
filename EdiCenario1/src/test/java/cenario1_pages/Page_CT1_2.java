/*
 * PROJETO EDI TESTER
 * Caso de Teste 1 - Cenário 2
 * Por: Edi Bezerra
 * 
 * */

package cenario1_pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_CT1_2 {
	
	private WebDriver driver; 
	private WebDriverWait wait;
	
		
	public Page_CT1_2(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 30);
	}
	
	private By emailCt2 = By.id("email");
	private By senhaCt2 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By personalCt2 = By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a");
	private By campoNomeCt2 = By.id("firstname");
	private By senhaAtualCt2 = By.id("old_passwd");
	private By btnSalvarCt2 = By.name("submitIdentity");
	private By btnVoltarCt2 = By.cssSelector("#center_column > ul > li:nth-child(1) > a");
		
	public void login() {
		
		driver.findElement(emailCt2).sendKeys("emailct1.1@teste.cs");
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.emailCt2));
		driver.findElement(senhaCt2).sendKeys("12345");
		driver.findElement(btnSingIn).click();
		
	}
	
	public void clicarInformacoes() {		
		driver.findElement(personalCt2).click();		
	}
	
	public void modificarNome() {
		
		driver.findElement(campoNomeCt2).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.campoNomeCt2));
		driver.findElement(campoNomeCt2).sendKeys("Mudou");
		driver.findElement(senhaAtualCt2).sendKeys("12345");
		driver.findElement(btnSalvarCt2).click();
		
	
	}
	
	public void validarModificacoes() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a")));
		driver.findElement(btnVoltarCt2).click();
		driver.findElement(personalCt2).click();
	
		String nomerAtual = driver.findElement(By.id("firstname")).getAttribute("value");
	    String nomeEsperado = "Mudou";
	    
	    assertEquals(nomeEsperado,nomerAtual);
	
	}

}