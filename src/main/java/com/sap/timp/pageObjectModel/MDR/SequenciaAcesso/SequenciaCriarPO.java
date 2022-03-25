package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SequenciaCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
	@FindBy(xpath = "//span[text()=\"Nova Sequência de Acesso\"]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div[@class=\"list-item\"]/div[2]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	//@FindBy (xpath = "//*[@id=\"23\"]/div[1]/label/span")
	@FindBy (xpath = "//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[text()=\"ICMS\"]")
	public WebElement opcaotributo;

	@FindBy(xpath ="//div[@id=\"structureGroup\"]/div/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//div[@id=\"structure\"]/div/div/div[2]")
	public WebElement estruturadados;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	//@FindBy(xpath="//div[text()=\"Agrupamento\"]")
	@FindBy(xpath = "//div[@class=\"field-info droppable-tile-info\"]/div[text()=\"Alíquota ICMS\"]")
	public WebElement aliquotaICMS;
	
	@FindBy(xpath = "//*[@id=\"fields\"]/div[3]")
	public WebElement camposselecionados;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input [@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public SequenciaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {				
		Actions action = new Actions(driver);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sequencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		sleep(2000);
		System.out.println("Id Ultimo Registro: " + id);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sequenciaacesso.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste");		
		descricao.sendKeys("descrição");
		
		empresa.click();
		sleep(2000);
		
		opcaoempresa.click();
		sleep(2000);
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		tributo.click();
		sleep(2000);		
		opcaotributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		
		actionsMoveToElementElement(estruturadados);
		grupoestrutura.click();
		sleep(2000);
		
		WebElement opcaogrupo;
		String url = driver.getCurrentUrl();
		String xpathString = "";
		
		if(url.contains("tq1") || url.contains("tc2")) {
			xpathString = "//li[@class=\"list-item\" and text()=\"Ajuste\"][1]";		
			actionsMoveToElementXpath(xpathString);
			opcaogrupo = driver.findElement(By.xpath(xpathString));
		}else {
			xpathString = "//li[@class=\"list-item\" and text()=\"Ajustes\"][1]";		
			actionsMoveToElementXpath(xpathString);
			opcaogrupo = driver.findElement(By.xpath(xpathString));
		}
	
		opcaogrupo.click();		
		sleep(1000);
		
		estruturadados.click();
		sleep(2000);
		
		opcaoestrutura.click();
		sleep(2000);
		
		camposestrutura.click();
		
		//arrastar a opçao para outro campo
		action.clickAndHold(aliquotaICMS).moveToElement(camposselecionados).release().build().perform();		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		
		sleep(2000);
		
		butaosim.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String idB = "0";
		
		if(rows > 0) {
			idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = Integer.parseInt(id);
		double idBD = Integer.parseInt(idB);
		
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			idInserir("Sequencia",idB);
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	


}
