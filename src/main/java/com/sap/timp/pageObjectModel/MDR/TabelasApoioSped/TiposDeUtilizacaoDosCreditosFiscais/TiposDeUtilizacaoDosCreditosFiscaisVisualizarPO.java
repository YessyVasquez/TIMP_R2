package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeUtilizacaoDosCreditosFiscaisVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.5 Tipos de Utilização dos Créditos Fiscais - ICMS\"]")
	public WebElement tabeladeutilizacaodoscreditosfiscais;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código Tipo de Utilização do Crédito Fiscal\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Sequência\"]")
	public WebElement sequencia;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Tipo de Utilização dos Créditos Fiscais - ICMS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
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
	
	@FindBy(xpath = "//span[@id=\"codTipoUtilizacaoCredito\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"sequence\"]")
	public WebElement sequenciavi;
	
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"vigencia\"]")
	public WebElement datavi;
	
	public TiposDeUtilizacaoDosCreditosFiscaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		tabeladeutilizacaodoscreditosfiscais.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("tiposdeutilizacaodoscreditosfiscais");
		
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
		//visualizar
		
		String codigovisualizar = codigovi.getText();
		String ufvisualizar = ufvi.getText();
		String sequenciavisualizar = sequenciavi.getText();
		String descricaovisualizar = descricaovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(codigovisualizar);
		System.out.println( ufvisualizar);
		System.out.println(sequenciavisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
	
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
		sleep(2000);
		
		
		//editar
		waitExpectElement(descricao);
		sleep(2000);
		
		String codigoeditar=codigo.getAttribute("value");
		String ufeditar=uf.getAttribute("value");
		String sequenciaeditar = sequencia.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String dataeditar=datainicio.getAttribute("value");
	
		System.out.println( codigoeditar);
		System.out.println( ufeditar);
		System.out.println(sequenciaeditar);
		System.out.println(descricaoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(ufvisualizar.equals(ufeditar));
		sucesso.add(sequenciavisualizar.equals(sequenciaeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	
}
