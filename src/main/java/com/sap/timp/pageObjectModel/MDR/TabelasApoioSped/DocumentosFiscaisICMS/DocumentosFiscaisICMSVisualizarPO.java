package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DocumentosFiscaisICMSVisualizarPO extends TestBaseSteven{
	
	
	
	
	
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
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"codDocumentoFiscalIcms\"]")
	public WebElement codigodocumentofiscalvi;
	
	@FindBy(xpath = "//span[@id=\"especie\"]")
	public WebElement especievi;
	
	@FindBy(xpath = "//span[@id=\"vigencia\"]")
	public WebElement vigenciavi;
	
	@FindBy(xpath = "//div[@id=\"taxDocSpecie\" and @class=\"element\"]/div/div/div/input")
	public WebElement especieed;
	
	public DocumentosFiscaisICMSVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		documentosfiscaisicms.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("documentosfiscaisicms");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String codigovisualizar = codigodocumentofiscalvi.getText();
		String especievisualizar= especievi.getText();
		String datavigenciavisualizar= vigenciavi.getText();
		
		System.out.println(codigovisualizar);
		System.out.println(especievisualizar);
		System.out.println(datavigenciavisualizar);

		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		
		//editar
	//	attributeToBeXpath("//div[@class=\"element\" and @id=\"taxDocCode\"]/div/div", "class", "base-input  required type2 success");
		sleep(9000);
	
		String codigoeditar=codigodedocumentofiscal.getAttribute("value");
		String especieeditar= especieed.getAttribute("value");
		String dataeditar= datavigencia.getAttribute("value");
		System.out.println("----------Editar-----------");
		System.out.println(codigoeditar);
		System.out.println(especieeditar);
		System.out.println(dataeditar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(especievisualizar.equals(especieeditar));
		sucesso.add(datavigenciavisualizar.equals(dataeditar));
		
		return sucesso;	

	
	
	}	

}
