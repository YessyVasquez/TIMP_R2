package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeParametrosDeEntradaEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Parâmetros de Entrada\"]")
	public WebElement mapeamento;
	
	
	
	@FindBy(xpath = "//div[@class=\"select\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"4.2.2 - CFOP\"]")
	public WebElement opcaoestrutura2;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")

	public WebElement primerapagina;

	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo \"]")
	public WebElement direcaomovimento;
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	
	
	public MapeamentoDeParametrosDeEntradaEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		
		mapeamento.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String enviar = "Alíquota COFINS";
		direcaomovimento.clear();
		sleep(2000);
		direcaomovimento.sendKeys(enviar);
		sleep(1000);
		direcaomovimento.sendKeys(Keys.ENTER);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		String novadirecaomovimento = direcaomovimento.getAttribute("value");
		System.out.println(novadirecaomovimento);
		sucesso = novadirecaomovimento.equals(enviar);
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}


}
