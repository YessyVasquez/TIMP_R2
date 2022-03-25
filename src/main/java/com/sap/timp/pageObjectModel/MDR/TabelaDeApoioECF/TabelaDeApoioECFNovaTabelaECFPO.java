package com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class TabelaDeApoioECFNovaTabelaECFPO extends TestBaseSteven{
	
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
	
	

	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"version\"]/div/div[2]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tabela\")]")
	public WebElement tabela;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;

	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement nova;

	@FindBy(xpath = "//button[not(contains(@class,\"highlighted\"))]/span[contains(@class,\"plussign\")]")
	public WebElement mais;

	
	
	

	
	
	public TabelaDeApoioECFNovaTabelaECFPO() {

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
		
		
		versao.click();
		sleep(1000);
		opcao.click();
		
		
		tabela.sendKeys("teste");
		
		descricao.sendKeys("Teste Nova Tabela ECF");
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		
		
		idInserir("TabelaDeApoioECFNovaTabela",id2);
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
