package com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AgrupamentoDeTributosEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[@class=\"title-boxes \"][text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//span[text()=\"Agrupamento de Tributos\"]")
	public WebElement agrupamentodetributos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div[2]")
	public WebElement tributosaavaliar;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Todos\"]")
	public WebElement opcaotributosaavaliar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//div[@id=\"05\"]/div/label/span")
	//@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement selecionadocofinstributos;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement selecionadoicmstributos;
	
	@FindBy(xpath = "//div[@id=\"05\"]/div/label/span")
	public WebElement selecionadocofinstributosaavaliar;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement selecionadoicmstributosaavaliar;
	
	
	public AgrupamentoDeTributosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		sleep(2000);
		
		tributos.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		agrupamentodetributos.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(8000);
		//waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nome.clear();
		String enviar = "Teste ATR Editar";
		
		nome.sendKeys(enviar);
		sleep(1000);
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		opcaotributosaavaliar.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String nomeregistro = nome.getAttribute("value");
		System.out.println(nomeregistro);
		sucesso.add(nomeregistro.equals(enviar));
		waitExpectElement(tributo);
		sleep(2000);
		tributo.click();
		sleep(2000);
		
		boolean Checkedcofinstributos;
		WebElement cofins=driver.findElement(By.xpath("//div[@id=\"05\"]/div/input"));
		Checkedcofinstributos = cofins.getAttribute("checked").equals("true");
		
		//actionsMoveToElementXpath("//div[@id=\"00\"]/div/label/span");
		
		boolean Checkedicmstributos;
		WebElement icms=driver.findElement(By.xpath("//div[@id=\"00\"]/div/input"));
		Checkedicmstributos = icms.getAttribute("checked").equals("true");
		
		/*
		if(cofins.isSelected() == true &&  icms.isSelected() == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}*/
		
		if(Checkedcofinstributos == true &&  Checkedicmstributos == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		
		
		boolean Checkedcofinstributosaavaliar;
		WebElement cofinstributosaavaliar=driver.findElement(By.xpath("//div[@id=\"05\"]/div/input"));
		Checkedcofinstributosaavaliar = cofinstributosaavaliar.getAttribute("checked").equals("true");
		
		
		
		
		boolean Checkedicmstributosaavaliar;
		WebElement icmstributosaavaliar=driver.findElement(By.xpath("//div[@id=\"00\"]/div/input"));
		Checkedicmstributosaavaliar = icmstributosaavaliar.getAttribute("checked").equals("true");
		
		if(Checkedcofinstributosaavaliar == true &&  Checkedicmstributosaavaliar == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		closeSelectTypeCheckbox(tributosaavaliar);
		
		System.out.println(sucesso);
		
		return sucesso;
	}

}
