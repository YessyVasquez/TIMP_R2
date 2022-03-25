package com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoDeEstruturasDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Grupo de Estruturas\"]")
	public WebElement grupodeestrutura;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupovi;
	
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: Ajustes Fiscais\"]/div/div")
	public WebElement ajustefiscaisvi;
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div/div")
	public WebElement cfopvi;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div[1]")
	public WebElement cfop;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement ajustefiscais;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar; 
	
	
	public GrupoDeEstruturasDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);
		
		grupodeestrutura.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		System.out.println("Ultimo registro: " + idRegistro);
		
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
	    
	  
	   System.out.println("detalhes");
		String ajustefiscaisdetalhes = ajustefiscais.getText();
		//String cfopdetalhes = cfop.getText();
		
		
		System.out.println(ajustefiscaisdetalhes);
		//System.out.println(cfopdetalhes);
		
		fechar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String ajustefiscaisvisualizar = ajustefiscaisvi.getText();
		//String cfopvisualizar = cfopvi.getText();
		
		 System.out.println("");
		 System.out.println("visualizar");
		System.out.println(ajustefiscaisvisualizar);
	//	System.out.println(cfopvisualizar);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//cfopvisualizar
		sucesso.add(ajustefiscaisdetalhes.contains(ajustefiscaisvisualizar));
		//sucesso.add(cfopdetalhes.contains(ajustefiscaisvisualizar));
		
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
