package com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EnquadramentoCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Enquadramento\"]")
	public WebElement enquadramento;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Enquadramento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Enquadramento\"]")
	public WebElement codigodeenquadramento;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"nbsCode\"]/div/div[2]")
	public WebElement codigonbs;
	
	@FindBy(xpath = "//div[@id=\"indicator\"]/div/div/div[2]")
	public WebElement indicatorrc;
	
	@FindBy(xpath = "//div[@id=\"salesModule\"]/div/div/div[2]")
	public WebElement modulovenda;
	
	@FindBy(xpath = "//div[@id=\"acquisitionModule\"]/div/div/div[2]")
	public WebElement moduloaquisicao;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	public EnquadramentoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		enquadramento.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		
		//criaçao
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigodeenquadramento.sendKeys("71");
		
		sleep(2000);
		
		descricao.sendKeys("descricao1");
		
		sleep(2000);
		codigonbs.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		indicatorrc.click();
		
		sleep(2000);
		
		opcao.click();
		
		
		sleep(2000);
		
		modulovenda.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		moduloaquisicao.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		
		waitExpectElement(mensagem);
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("Enquadramento",id2);
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
