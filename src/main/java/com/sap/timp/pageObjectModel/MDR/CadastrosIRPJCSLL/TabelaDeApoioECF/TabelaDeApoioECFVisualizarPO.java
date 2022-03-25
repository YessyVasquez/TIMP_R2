package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TabelaDeApoioECFVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastroIRPJCSLL;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-supportParameterECF\"]")
	public WebElement tabelaDeApoioECF;
	
	@FindBy(xpath = "//div[contains(@class, \"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//span[@id=\"id-register\"]")
	public WebElement Id;
	
	@FindBy(xpath = "//span[@id=\"table-ecf\"]")
	public WebElement tabelaECF;
	
	@FindBy(xpath = "//span[@id=\"description-ecf\"]")
	public WebElement decripcionTabelaECF;
	
	@FindBy(xpath = "//span[@id=\"idLayout\"]")
	public WebElement versao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"table-ecf\"]/div/div[1]/input")
	public WebElement tabelaECFE;
	
	@FindBy(xpath = "//div[@id=\"description-ecf\"]/div/textarea")
	public WebElement decripcionTabelaECFE;
	
	@FindBy(xpath = "//div[@id=\"layout-version\"]/div/div[1]/input")
	public WebElement versaoE;
	
	public TabelaDeApoioECFVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList Visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cadastroIRPJCSLL);
		cadastroIRPJCSLL.click();
		sleep(1000);
		
		tabelaDeApoioECF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro =idObter("TabelaDeApoioECF");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acao.click();
	  	sleep(4000);
	  	
	  	String textoId = Id.getText();
		String textoTabelaECF= tabelaECF.getText();
		String textoDecripcionTabelaECF = decripcionTabelaECF.getText();
		String textoVersao = versao.getText();


		System.out.println("ID: " + textoId);
		System.out.println("TabelaECF: " + textoTabelaECF);
		System.out.println("Decripcion Tabela ECF: " + textoDecripcionTabelaECF);
		System.out.println("Versao: " + textoVersao);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		String textotabelaECFE = tabelaECFE.getAttribute("value");
		String textoDecripcionTabelaECFE = decripcionTabelaECFE.getAttribute("value");
		String textoVersaoE = versaoE.getAttribute("value");
		
		System.out.println("-------------------------------------------");
		System.out.println("TabelaECF: " + textotabelaECFE);
		System.out.println("Decripcion Tabela ECF: " + textoDecripcionTabelaECFE);
		System.out.println("Versao: " + textoVersaoE);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textotabelaECFE .equals(textoTabelaECF));
		sucesso.add(textoDecripcionTabelaECFE.equals(textoDecripcionTabelaECF));
		sucesso.add(textoVersaoE.contains(textoVersao));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
