package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaTPEditarPO extends TestBaseSteven {
	
	
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para TP\"]")
	public WebElement parametrosparatp;
	
	@FindBy(xpath = "//span[text()=\"Novo Parâmetro\"]")
	public WebElement novoparametro;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"clientCode\"]/div/div[2]")
	public WebElement codigodecliente;
	
	@FindBy(xpath = "//div[@id=\"tpDefault\"]/div/div/div[2]")
	public WebElement tpdefault;
	
	
	@FindBy(xpath = "//div[@id=\"related\"]/div/div/div[2]")
	public WebElement coligada;
	
	@FindBy(xpath = "//div[@id=\"outdoorOperation\"]/div/div/div[2]")
	public WebElement operacaoexterior;
	
	@FindBy(xpath = "/div[@id=\"interposedOperation\"]/div/div/div[2]")
	public WebElement operacaointerposta;
	
	@FindBy(xpath = "//div[@id=\"exclusiveOperation\"]/div/div/div[2]")
	public WebElement operacaoexclusiva;
	
	@FindBy(xpath = "//div[@id=\"exemptIROperation\"]/div/div/div[2]")
	public WebElement opercaoisentas;
	
	@FindBy(xpath = "//div[@id=\"taxHavensOperation\"]/div/div/div[2]")
	public WebElement operacaoparaisofiscais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Inicio de validade\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public ParametrosParaTPEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		parametrosparatp.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParametrosParaTP");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String valor = datainicial.getAttribute("value");

		String enviar = fechaAyer();

		datainicial.clear();
		sleep(2000);
		datainicial.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		attributeToBeXpath("//div[@id=\"clientCode\"]/div", "class", "base-autocomplete required");
		sleep(20000);
		
		String novoTexto=datainicial.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		datainicial.clear();

		sleep(2000);
		datainicial.sendKeys(valor);
		
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
