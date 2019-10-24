/*
 * PROJETO EDI TESTER
 * Caso de Teste 3 - Cenário 2
 * Por: Edi Bezerra
 * 
 * */
package cenario3_pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_CT3_2 {
	
	private WebDriver driver; 
	private Actions action;
	
	public Page_CT3_2(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
	}
	
	private By singIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By clicarEmHome = By.cssSelector("#header_logo > a > img");
	private By emailCt3 = By.id("email");
	private By senhaCt3 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By item = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1] ");
	private By acharItem = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div");
	private By prosseguir = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	private By conferir = By.xpath("//*[@id=\"summary_products_quantity\"]");
	private By seguir1 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By seguir2 = By.cssSelector("#center_column > form > p > button");
	private By aceitect3 = By.cssSelector("#uniform-cgv");
	private By seguir3 = By.cssSelector("#form > p > button");
	private By pagamentoCheck = By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");
	private By conferirPedido = By.xpath("//*[@id=\"center_column\"]/form/div");
	private By concluirPedido = By.xpath("//*[@id=\"cart_navigation\"]/button");
	private By validarPedidoItens = By.cssSelector("#center_column > p.alert.alert-success");
	
	public void fazerLogin() {
		driver.findElement(singIn).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(emailCt3).sendKeys("emailct1.1@teste.ct1");
		driver.findElement(senhaCt3).sendKeys("12345");
		driver.findElement(btnSingIn).click();
		driver.findElement(clicarEmHome).click();
	}
	
	public void adicionarItem() {			 
		WebElement moverMouse = driver.findElement(acharItem);
		action.moveToElement(moverMouse).moveToElement(driver.findElement(item)).click().build().perform();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(prosseguir).click();	
	}
	
	public void verificarEseguir() {
		String quantidadeAtual = driver.findElement(conferir).getText();
		String quantidadeEsperada = "1 Product";
		assertEquals(quantidadeAtual,quantidadeEsperada);
		System.out.println(" Quantidade atual "+ quantidadeAtual +" = Quantidade esperada "+quantidadeEsperada);
		driver.findElement(seguir1).click();
	}
	
	public void irEtapasDeCompra() {
		driver.findElement(seguir2).click();
		driver.findElement(aceitect3).click();
		driver.findElement(seguir3).click();
	}
	
	public void pagarEConferir() {
		driver.findElement(pagamentoCheck).click();
		String pedido = driver.findElement(conferirPedido).getText();
		System.out.println(pedido);
		assertTrue(pedido, true);
	}
	
	public void concluirPedido() {
		driver.findElement(concluirPedido).click();
		String validarPedido = driver.findElement(validarPedidoItens).getText();
		String validacao = "Your order on My Store is complete.";
		assertEquals(validarPedido,validacao);
		System.out.println("Pedido concluido com sucessol.");;
	}
}
