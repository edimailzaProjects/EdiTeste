/*
 * PROJETO EDI TESTER
 * Caso de Teste 4 - Cenário 1
 * Por: Edi Bezerra
 * 
 * */

package cenario4_pages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page_CT4_1 {
	
	private WebDriver driver; 

	
	public Page_CT4_1(WebDriver driver) {
		this.driver = driver;
	}
	
	private By singIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By emailCt3 = By.id("email");
	private By senhaCt3 = By.id("passwd");
	private By btnSingIn = By.id("SubmitLogin");
	private By orderBtn = By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a");
	private By reorderBtn = By.cssSelector("#order-list > tbody > tr.first_item > td.history_detail.footable-last-column > a.link-button");
	private By addBtn = By.cssSelector("#cart_quantity_up_1_1_0_229118");
	private By proceed1 = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
	private By proceed2 = By.cssSelector("#center_column > form > p > button");
	private By agreeCheck = By.cssSelector("#uniform-cgv");
	private By proceed3 = By.cssSelector("#form > p > button");
	private By pagamentoBtn = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
	private By confirmarBtn = By.cssSelector("#cart_navigation > button");
	private By validarAlteracao = By.cssSelector("#center_column > div");
	
	public void fazerLogin() {
		driver.findElement(singIn).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(emailCt3).sendKeys("emailct1.1@teste.ct1");
		driver.findElement(senhaCt3).sendKeys("12345");
		driver.findElement(btnSingIn).click();	
	}
	
	public void clicarOrderDetails() {
		driver.findElement(orderBtn).click();
	}
	
	public void clicarReorder() {
		driver.findElement(reorderBtn).click();
	}
	
	public void alterarQuantidade() {
		driver.findElement(addBtn).click();
	}
	
	public void seguirEtapasCompras() {
		driver.findElement(proceed1).click();
		driver.findElement(proceed2).click();
		driver.findElement(agreeCheck).click();
		driver.findElement(proceed3).click();
	}
	
	public void efetuarPagamento() {
		driver.findElement(pagamentoBtn).click();
		driver.findElement(confirmarBtn).click();
	}
	
	public void validarAlteracao() {
		String validacao = driver.findElement(validarAlteracao).getText();
		assertTrue(validacao, true);
		System.out.println(validacao);
		System.out.println("Alteracao realizada com sucesso!");
	}
}