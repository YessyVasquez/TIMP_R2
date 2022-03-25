package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoContabilCorrecaoEditarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento Contábil por Correção\"]")
	public WebElement contabil;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"header-text\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public MapeamentoContabilCorrecaoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		parametro.click();
		sleep(1000);
		contabil.click();
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);

		//siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter(" MapeamentoContabilCorrecao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		//attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		waitExpectXpath("//div[@id=\"company\"]/div/div/div[2]");
		attributoNotToBeEmptyXpath("//*[@id=\"header-text\"]/div/div/input", "value");
		sleep(2000);
		String valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "Prueba editar";
		
		campo.clear();
		campo.sendKeys(enviar);
		
		
		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		driver.navigate().refresh();
		
		waitExpectXpath("//div[@id=\"company\"]/div/div/div[2]");
		attributoNotToBeEmptyXpath("//*[@id=\"header-text\"]/div/div/input", "value");
		
		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(nuevoTexto);

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		sleep(1000);
		
		gravar.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
	}
}
