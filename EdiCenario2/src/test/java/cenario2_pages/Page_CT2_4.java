package cenario2_pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_CT2_4 {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public Page_CT2_4(WebDriver driver) {
		this.driver = driver;
		this.wait =  new WebDriverWait(this.driver, 30);
	}
	
	private By emailJaExiste = By.id("email_create");
	private By btnCreate = By.id("SubmitCreate");
	private By mensagemAlerta = By.cssSelector("#create_account_error > ol > li");
	
	public void inserirEmailExistente() {
		driver.findElement(emailJaExiste).sendKeys("emailct1.1@teste.cp");
	}
	
	public void clicarCreateAccout() {
		driver.findElement(btnCreate).click();
	}
	
	public void validarAlerta() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.mensagemAlerta));
		String mensagemAtual = driver.findElement(mensagemAlerta).getText();
		String mensagemEsperada = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		assertEquals(mensagemAtual,mensagemEsperada);
		
	}	
}