package abrir_navegador;

import org.openqa.selenium.WebDriver;

public class AbrirNavegador {
	
	WebDriver driver;
	private String urlAP = "http://automationpractice.com/index.php";
	
	public AbrirNavegador(WebDriver driver){
		this.driver = driver;
	}
	
	public AbrirNavegador abrirNavegador() {
		driver.get(urlAP);
		driver.manage().window().maximize();
		return this;
	}
}