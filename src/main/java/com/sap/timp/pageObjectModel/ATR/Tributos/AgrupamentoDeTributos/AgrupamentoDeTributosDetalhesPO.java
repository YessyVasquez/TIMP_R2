package com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AgrupamentoDeTributosDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[@class=\"title-boxes \"][text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//span[text()=\"Agrupamento de Tributos\"]")
	public WebElement agrupamentodetributos;
	
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
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]")
	public WebElement nome;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div[1]")
	public WebElement icms;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div[2]")
	public WebElement cofins;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar; 
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement icmsvi;
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[2]/div[1]")
	public WebElement cofinsvi;
	
	public AgrupamentoDeTributosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);

		tributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		detalhes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	   
		String nomedetalhes = nome.getText();
		String icmsdetalhes= icms.getText();
		//String cofinsdetalhes = cofins.getText();
		
		
		System.out.println(nomedetalhes);
		System.out.println(icmsdetalhes);
		//System.out.println(cofinsdetalhes);
		fechar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(6000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("AgrupamentoDeTributosCriar");
		
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
		
		String nomevisualizar = nomevi.getAttribute("value");
		String icmsvisualizar= icmsvi.getText();
		//String cofinsvisualizar = cofinsvi.getText();
		
		
		System.out.println(nomevisualizar);
		System.out.println(icmsvisualizar);
		//System.out.println(cofinsvisualizar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		sucesso.add(icmsvisualizar.contains(icmsdetalhes));
		//sucesso.add(cofinsvisualizar.contains(cofinsdetalhes));
		
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
