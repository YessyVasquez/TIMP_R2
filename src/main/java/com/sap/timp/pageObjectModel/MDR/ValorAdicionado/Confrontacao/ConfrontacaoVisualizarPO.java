package com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Confrontacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfrontacaoVisualizarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Valor Adicionado\"]")
	public WebElement valoradicionado;
	
	@FindBy(xpath = "//span[text()=\"Confrontação\"]")
	public WebElement confrontacao;
	
	//---- visualizar 

	@FindBy(xpath = "//span[@id=\"creditMonth\"]")
	public WebElement mesCredito;
	
	@FindBy(xpath = "//span[@id=\"productionMonth\"]")
	public WebElement mesProducao;
	
	@FindBy(xpath = "//span[@id=\"petroleumField\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//span[@id=\"concessionContract\"]")
	public WebElement contrato;
	
	@FindBy(xpath = "//span[@id=\"county\"]")
	public WebElement municipio;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//span[@id=\"averageConfrontation\"]")
	public WebElement percentaual;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataInicio;
	
	
	// Editar 
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Mês do Crédito\"]")
	public WebElement mesCredito1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Mês de Produção\"]")
	public WebElement mesProducao1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Campo\"]")
	public WebElement campo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Contrato de Concessão\"]")
	public WebElement contrato1;
	
	//@FindBy(xpath = "//input[@placeholder=\"Preencher o Município\"]")
	//public WebElement municipio1;
	
	@FindBy(xpath = "//div[@id=\"county\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement municipio1;
	
	//@FindBy(xpath = "//div[@id=\"county\"]")
	//public WebElement municipio1;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/input")
	public WebElement uf1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Percentual Médio de Confrontação\"]")
	public WebElement percentaual1;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div[1]/input")
	public WebElement dataInicio1;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public  ConfrontacaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		valoradicionado.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		confrontacao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("confrontacao");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textomesCredito = mesCredito.getText();
		String textomesProducao = mesProducao.getText();
		String textocampo = campo.getText();
		String textocontrato = contrato.getText();
		//String textomunicipio = municipio.getText();
		String textouf = uf.getText();
		String textopercentaual = percentaual.getText();
		String textodataInicio = dataInicio.getText();
		
		System.out.println("Mês do Crédito: " + textomesCredito);
		System.out.println("Mês de Produção: " + textomesProducao);
		System.out.println("Campo: " + textocampo);
		System.out.println("Contrato de Concessão: " + textocontrato);
		//System.out.println("Município: " + textomunicipio);
		System.out.println("UF: " + textouf);
		System.out.println("Percentual Médio de Confrontação: " + textopercentaual);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textomesCredito1 = mesCredito1.getAttribute("value");
		String textomesProducao1 = mesProducao1.getAttribute("value");
		String textocampo1 = campo1.getAttribute("value");
		String textocontrato1 = contrato1.getAttribute("value");
		//String textomunicipio1 = municipio1.getAttribute("value");
		String textouf1 = uf1.getAttribute("value");
		String textopercentaual1 = percentaual1.getAttribute("value");
		String textodataInicio1 = dataInicio1.getAttribute("value");
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Mês do Crédito: " + textomesCredito1);
		System.out.println("Mês de Produção: " + textomesProducao1);
		System.out.println("Campo: " + textocampo1);
		System.out.println("Contrato de Concessão: " + textocontrato1);
		//System.out.println("Município: " + textomunicipio1);
		System.out.println("UF: " + textouf1);
		System.out.println("Percentual Médio de Confrontação: " + textopercentaual1);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio1);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textomesCredito1.equals(textomesCredito));
		sucesso.add(textomesProducao1.equals(textomesProducao));
		sucesso.add(textocampo1.equals(textocampo));
		sucesso.add(textocontrato1.equals(textocontrato));
		//sucesso.add(textomunicipio1.equals(textomunicipio));
		sucesso.add(textouf1.equals(textouf));
		sucesso.add(textopercentaual1.equals(textopercentaual));
		sucesso.add(textodataInicio1.equals(textodataInicio));
		return sucesso;
	}

}
