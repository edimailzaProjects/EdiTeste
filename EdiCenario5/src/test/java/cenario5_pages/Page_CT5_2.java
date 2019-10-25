package cenario5_pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_CT5_2 {
	
	private WebDriver driver;

	public Page_CT5_2(WebDriver driver){
		this.driver = driver;
	}
	
	private By singIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By emailCt5 = By.id("email");
	private By senhaCt5 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By myWlistbtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a");
	
	public void formulario() {
		driver.findElement(singIn).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(emailCt5).sendKeys("emailct1.1@teste.ct");
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
			assertNotEquals(URL,urlMyWishList);
			System.out.println(" ");	
			System.out.println(URL + " O redicecionamento é incorreto.");
			driver.findElement(myWlistbtn).click();
			
		}
	}

}