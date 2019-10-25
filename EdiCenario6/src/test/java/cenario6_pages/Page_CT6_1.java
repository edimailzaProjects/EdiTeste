/*
 * PROJETO EDI TESTER
 * Caso de Teste 5 - Cenário 1
 * Por: Edi Bezerra
 * 
 * */
package cenario6_pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_CT6_1 {
	
	private WebDriver driver;
	 

	public Page_CT6_1(WebDriver driver) {
		this.driver = driver;	
	}
	
	private By singIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By emailCt6 = By.id("email");
	private By senhaCt6 = By.id("passwd");
	private By btnSingOut = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a");
	
	public void estarLogado() {
		driver.findElement(singIn).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(emailCt6).sendKeys("emailct1.1@teste.ct1");
		driver.findElement(senhaCt6).sendKeys("12345");
	}
	
	public void desconectar() {
		driver.findElement(btnSingOut).click();
	}
	
	public void validarRedirecionamento() {
		String URL = driver.getCurrentUrl();
		String urlHome = "http://automationpractice.com/index.php?";
		
		if(URL.equals(urlHome)) {
			System.out.println(URL + "Redirecionamento correto! ");
			assertEquals(URL,urlHome);
		}else {
			System.out.println(" ");	
			System.out.println(URL + " Nao e a URL de redicecionamento correta.");
			assertNotEquals(URL,urlHome);
		}
	
		}
}