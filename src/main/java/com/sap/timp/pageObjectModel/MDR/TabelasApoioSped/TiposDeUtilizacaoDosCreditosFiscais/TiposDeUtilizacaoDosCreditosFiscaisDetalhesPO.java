package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeUtilizacaoDosCreditosFiscaisDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.5 Tipos de Utilização dos Créditos Fiscais - ICMS\"]")
	public WebElement tabeladeutilizacaodoscreditosfiscais;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código Tipo de Utilização do Crédito Fiscal\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Tipo de Utilização dos Créditos Fiscais - ICMS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement codigode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement ufde;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement sequenciade;
	
	@FindBy(xpath = "//span[@id=\"codTipoUtilizacaoCredito\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"sequence\"]")
	public WebElement sequenciavi;
	
	public TiposDeUtilizacaoDosCreditosFiscaisDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		tabeladeutilizacaodoscreditosfiscais.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("tiposdeutilizacaodoscreditosfiscais");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String codigodetalhes = codigode.getText();
		String ufdetalhes = ufde.getText();
		String sequenciadetalhes = sequenciade.getText();
	
		
		System.out.println(codigodetalhes);
		System.out.println(ufdetalhes);
		System.out.println(sequenciadetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String codigovisualizar = codigovi.getText();
		String ufvisualizar = ufvi.getText();
		String sequenciavisualizar = sequenciavi.getText();
	
		
		System.out.println(codigovisualizar);
		System.out.println(ufvisualizar);
		System.out.println(sequenciavisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(ufvisualizar.equals(ufdetalhes));
		sucesso.add(sequenciavisualizar.equals(sequenciadetalhes));
		
		return sucesso;
	}
}
