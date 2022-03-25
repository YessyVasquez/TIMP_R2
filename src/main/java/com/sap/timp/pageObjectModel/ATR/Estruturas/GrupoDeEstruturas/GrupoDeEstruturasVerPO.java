package com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoDeEstruturasVerPO extends TestBaseSteven{

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
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: Ajustes Fiscais\"]/div[2]/div")
	public WebElement ajustefiscais;
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div[2]/div")
	public WebElement cfop;
	

	
	
	public GrupoDeEstruturasVerPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);

		grupodeestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String nomedogrupovisualizar = nomedogrupovi.getAttribute("value");
		String ajustefiscaisvisualizar = ajustefiscaisvi.getText();
		//String cfopvisualizar = cfopvi.getText();
		
		System.out.println(nomedogrupovisualizar);
		System.out.println(ajustefiscaisvisualizar);
		//System.out.println(cfopvisualizar);
		
		aceitar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("GrupoDeEstruturasCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	    String nomedogrupoeditar = nomedogrupo.getAttribute("value");
		String ajustefiscaiseditar = ajustefiscais.getText();
		//String cfopeditar = cfop.getText();
		
		System.out.println(nomedogrupoeditar);
		System.out.println(ajustefiscaiseditar);
		//System.out.println(cfopeditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomedogrupoeditar.contains(nomedogrupovisualizar));
		sucesso.add(ajustefiscaiseditar.contains(ajustefiscaisvisualizar));
		//sucesso.add(cfopeditar.contains(cfopvisualizar));
		
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
