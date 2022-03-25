package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DocumentosFiscaisICMSEditarPO extends TestBaseSteven {
	
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.1.1 Documentos Fiscais - ICMS\"]")
	public WebElement documentosfiscaisicms;
	
	@FindBy(xpath = "//span[text()=\"Novo Documento Fiscal\"]")
	public WebElement novodocumentofiscal;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Documento Fiscal\"]")
	public WebElement codigodedocumentofiscal;
	
	@FindBy(xpath = "//div[@id=\"taxDocSpecie\" and @class=\"element\"]/div/div/div[2]")
	public WebElement especie;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoespecie;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public DocumentosFiscaisICMSEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		documentosfiscaisicms.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
	
	
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("documentosfiscaisicms");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	//	attributeToBeXpath("//div[@class=\"element\" and @id=\"taxDocCode\"]/div/div", "class", "base-input  required type2 success");
		sleep(8000);
		String valor = codigodedocumentofiscal.getAttribute("value");

		String enviar = "08";

		codigodedocumentofiscal.clear();
		sleep(2000);
		codigodedocumentofiscal.sendKeys(enviar);
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
		

	
		waitExpectElement(codigodedocumentofiscal);

		
		sleep(6000);

		String novoTexto = codigodedocumentofiscal.getAttribute("value");
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(1000);
		codigodedocumentofiscal.clear();

		sleep(1000);
		codigodedocumentofiscal.sendKeys(valor);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@class=\"element\" and @id=\"taxDocCode\"]/div/div", "class", "base-input  required type2 success");
		
		return sucesso;
		
		
	}
}
