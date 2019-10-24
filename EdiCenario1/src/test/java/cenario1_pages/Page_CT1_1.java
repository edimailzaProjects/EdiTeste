/*
 * PROJETO EDI TESTER
 * Caso de Teste 1 - Cenário 1
 * Por: Edi Bezerra
 * 
 * */
package cenario1_pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page_CT1_1 {
	
	private WebDriver driver; 
	private WebDriverWait wait;
	
	public Page_CT1_1(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 30);
	}
	
	private By emailCt1 = By.id("email_create");
	private By btnCreate = By.id("SubmitCreate");
	private By radioBtnCt1 = By.id("id_gender1");
	private By nomeCt1 = By.id("customer_firstname");
	private By sobrenomeCt1 = By.cssSelector("#customer_lastname");
	private By senhaCt1 = By.cssSelector("#passwd");
	private By diaCt1 = By.cssSelector("#days  option:nth-child(2)");
	private By mesCt1 = By.cssSelector("#months option:nth-child(2)");
	private By anoCt1 = By.cssSelector("#years  option:nth-child(12)");
	private By checarCt1 = By.cssSelector("#newsletter");
	private By empresaCt1 = By.cssSelector("#company");
	private By enderecoEmpresaCt1 = By.name("address1");
	private By cepCt1 = By.id("postcode");
	private By cidadeCt1 = By.id("city");
	private By selEstado = By.name("id_state");
	private By infoCt1 = By.id("other");
	private By foneCt1 = By.name("phone");
	private By cellCt1 = By.name("phone_mobile");
	private By refCt1 = By.name("alias");
	private By btnSubimitCt1 = By.name("submitAccount");
	private By personalCt1 = By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a");
	
	
	public void inserirEmail() {
		driver.findElement(emailCt1).sendKeys("emailct1.1@teste.cs");
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.emailCt1));
		driver.findElement(btnCreate).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.btnCreate));
	}
	
	public void preencherFormulario() {
		wait.until(ExpectedConditions.elementToBeClickable(By.name("id_gender")));
		driver.findElement(radioBtnCt1).click();
		driver.findElement(nomeCt1).sendKeys("Edi");
		driver.findElement(sobrenomeCt1).sendKeys("Caso de Teste");
		driver.findElement(senhaCt1).sendKeys("12345");		
		driver.findElement(diaCt1).click();
		driver.findElement(mesCt1).click();
		driver.findElement(anoCt1).click();
		driver.findElement(checarCt1).click();
		driver.findElement(empresaCt1).sendKeys("Empresa CT1.1");
		driver.findElement(enderecoEmpresaCt1).sendKeys("Rua da Empresa CT1.1");
		driver.findElement(cidadeCt1).sendKeys("Cidade CT1.1");
		WebElement estado = driver.findElement(selEstado);
		Select selecEstado = new Select(estado);
		selecEstado.selectByVisibleText("Kansas");
		driver.findElement(cepCt1).sendKeys("11111");
		driver.findElement(infoCt1).sendKeys("Teste CT1: 1.1 - Cadastro e comparação");
		driver.findElement(foneCt1).sendKeys("123456789");
		driver.findElement(cellCt1).sendKeys("123456789");
		driver.findElement(refCt1).sendKeys("Teste Ct1");
	}
	
	public void clicarRegistrar() {
		driver.findElement(btnSubimitCt1).click();
	}
	
	public void clicarInformacoes() {		
		driver.findElement(personalCt1).click();		
	}
	
	public void compararInformacoes() {
		
		String generoAtual = driver.findElement(By.id("id_gender1")).getAttribute("value").toString();
		String generoEsperado = "1";
		
		String nomerAtual = driver.findElement(By.id("firstname")).getAttribute("value");
		String nomeEsperado = "Edi";
		
		String emailAtual = driver.findElement(By.id("email")).getAttribute("value");
	    String emailEsperado = "emailct1.1@teste.cs";
	    
	    
	    String diaAtual = driver.findElement(By.id("days")).getAttribute("value").toString();
	    String diaEsperado = "1";
	     
	    String mesAtual = driver.findElement(By.id("months")).getAttribute("value").toString();
	    String mesEsperado = "1";
	    
	    String anoAtual = driver.findElement(By.id("years")).getAttribute("value").toString();
	    String anoEsperado = "2009"; 
	     
	    assertEquals(generoEsperado,generoAtual);
	    assertEquals(nomeEsperado,nomerAtual);
	    assertEquals(emailEsperado,emailAtual);
	    assertEquals(diaEsperado,diaAtual);
	    assertEquals(mesEsperado,mesAtual);
	    assertEquals(anoEsperado,anoAtual);    
	}
}