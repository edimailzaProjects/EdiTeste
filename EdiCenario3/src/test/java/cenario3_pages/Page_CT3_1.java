/*
 * PROJETO EDI TESTER
 * Caso de Teste 3 - Cenário 1
 * Por: Edi Bezerra
 * 
 * */
package cenario3_pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_CT3_1 {
	
	private WebDriver driver; 
	private Actions action;
	
	public Page_CT3_1(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
	}
	
	private By itemA = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1] ");
	private By acharItemA = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div");
	private By itemB = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]");	                                 
	private By acharItemB = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div");
	private By continuar = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");
	private By checkoutBtn = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	private By conferirCarrinho = By.id("summary_products_quantity");
	private By proceedBtn = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By emailCt3 = By.id("email");
	private By senhaCt3 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By procedBtn2 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	private By aceite = By.cssSelector("#uniform-cgv");
	private By proceedBtn3 = By.cssSelector("#form > p > button");
	private By pagarBankWire = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
	private By conferirPedido = By.xpath("//*[@id=\"center_column\"]/form/div");
	private By concluirPedido = By.xpath("//*[@id=\"cart_navigation\"]/button");
	private By validarPedidoItens = By.cssSelector("#center_column > div > p > strong");
	
	public void adicionarItemA() {			 
		WebElement moverMouse = driver.findElement(acharItemA);
		action.moveToElement(moverMouse).moveToElement(driver.findElement(itemA)).click().build().perform();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(continuar).click();	
	}
	
	public void adicionarItemB() {
		WebElement moverMouse = driver.findElement(acharItemB);
		action.moveToElement(moverMouse).moveToElement(driver.findElement(itemB)).click().build().perform();
		/*action.moveToElement(moverMouse).build.perform();*/
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(checkoutBtn).click();
	}
	
	public void conferirCarrinho() {
		String mensagemAtual = driver.findElement(conferirCarrinho).getText();
		String mensagemEsperada = "2 Products";
		assertEquals(mensagemAtual,mensagemEsperada);
		System.out.println(" Mensagem atual "+ mensagemAtual +" Mensagem esperada = "+mensagemEsperada);	
	}
	
	public void fazerCheckout() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,300)", "");
		driver.findElement(proceedBtn).click();
	}
	
	public void fazerLogin() {
		driver.findElement(emailCt3).sendKeys("emailct1.1@teste.ct1");
		driver.findElement(senhaCt3).sendKeys("12345");
		driver.findElement(btnSingIn).click();
	}
	
	public void comprar() {
		driver.findElement(procedBtn2).click();
		driver.findElement(aceite).click();
		driver.findElement(proceedBtn3).click();
	}
	
	public void pagarEConferir() {
		driver.findElement(pagarBankWire).click();
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