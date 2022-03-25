package com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class TabelaDeApoioECFNovaVersaoLeiautePO extends TestBaseSteven{
	
	@FindBy(xpath = "//ul/li[contains(@identifier,\"supportParameterECF\") and @tabindex=\"0\"]")
	public WebElement tabelaecf;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Data Inicial\")]")
	public WebElement dataInicial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Data Final\")]")
	public WebElement dataFinal;

	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement nova;

	@FindBy(xpath = "//button[not(contains(@class,\"highlighted\"))]/span[contains(@class,\"adddoc\")]")
	public WebElement mais;

	
	
	

	
	
	public TabelaDeApoioECFNovaVersaoLeiautePO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean novaTabela() {
		
		sleep(2000);
		tabelaecf.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//criaçao
		mais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		versao.sendKeys("123456789");
		sleep(1000);
		dataInicial.sendKeys(fechaActual());
		sleep(1000);
		dataFinal.sendKeys(fechaActual());
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		
		
		idInserir("TabelaDeApoioECFNovaVersaoLeiaute",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}		
	

}
