package com.sap.timp.pageObjectModel.MDR.RegistroECAC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroECACEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Registro ECAC\"]")
	public WebElement registroecac;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement novoregistro;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Código da Receita\"]")
	public WebElement codigodareceita;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data de Arrecadação\"]")
	public WebElement dataarrecadacao;
	
	@FindBy(xpath = "//div[@id=\"documentNumber\"]/div/div/input")
	public WebElement numerodocumento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Período de Apuração\"]")
	public WebElement periododeapuracao;
	
	@FindBy(xpath = "//div[@id=\"totalValue\"]/div/div/input")
	public WebElement valortotal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data de Vencimento\"]")
	public WebElement datavencimento;
	
	public RegistroECACEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		registroecac.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RegistroECAC");
		
		//WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		//WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		sleep(3000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = numerodocumento.getAttribute("value");

		String enviar = "888";

		numerodocumento.clear();
		sleep(2000);
		numerodocumento.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		
		String novoTexto=numerodocumento.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
	
		numerodocumento.clear();

		sleep(2000);
		numerodocumento.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	

}
