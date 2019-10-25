/*
 * PROJETO EDI TESTER
 * Caso de Teste 5 - Cenário 1
 * Por: Edi Bezerra
 * 
 * */
package cenario5_pages;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertNotEquals;

public class Page_CT5_1 {
	
	private WebDriver driver;
 

	public Page_CT5_1(WebDriver driver) {
		this.driver = driver;	
	}
	
	private By singIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By emailCt5 = By.id("email");
	private By senhaCt5 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By myWlistbtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a");
	private By MyWlistItem = By.cssSelector("#wishlist_13946 > td.bold.align_center");
	
	public void formulario() {
		driver.findElement(singIn).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(emailCt5).sendKeys("emailct1.1@teste.ct1");
		driver.findElement(senhaCt5).sendKeys("12345");
	}
	
	public void logar() {
		driver.findElement(btnSingIn).click();
	}
	
	public void validarRedirecionamento() {
		String URL = driver.getCurrentUrl();
		String urlMyWishList = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";
		
		if(URL.equals(urlMyWishList)) {
			System.out.println(URL + "Redirecionamento correto! ");
			assertEquals(URL,urlMyWishList);
		}else {
		System.out.println(" ");	
		System.out.println(URL + " Nao e a URL de redicecionamento correta.");
		driver.findElement(myWlistbtn).click();
		String exibirItem  = driver.findElement(MyWlistItem).getText();
		System.out.println("Existe " + exibirItem + " item em My WishList.");
		assertNotEquals(URL,urlMyWishList);
		}
	}
}