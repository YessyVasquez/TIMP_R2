package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEvento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1250DadosdeEventoCriarPO extends TestBaseSteven {
	

	
	@FindBy(xpath = "//span[text()=\"S1250 - Aquisição de Produção Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"Dados de Evento\"]")
	public WebElement dadosEvento;
	
	@FindBy(xpath = "//*[@id=\"event-data-toolbar\"]/div/div/ul/li/button/span[2]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"event-data-list\"]/div/div[2]/div/div[1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement idEvento;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicativo de retificação\"]")
	public WebElement indicativodeRetificação;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Recibo\"]")
	public WebElement noRecibo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicativo apuração\"]")
	public WebElement indicativodoPeriodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher período de contagem\"]")
	public WebElement periodo;
	
		
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Processo de emissão\"]")
	public WebElement processo;
	

	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public S1250DadosdeEventoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s1250.click();
		
		sleep(2000);
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dadosEvento.click();
		sleep(3000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@id=\"event-data-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getText();
		
		System.out.println("ID1: "+id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idEvento.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		indicativodeRetificação.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		noRecibo.sendKeys("991");
		
		
		sleep(2000);
		
		indicativodoPeriodo.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		periodo.sendKeys("1/2021");
		
		sleep(2000);
		
		processo.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		
		
		aceitar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//biblioteca.click();
		
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[@id=\"event-data-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getAttribute("textContent");
		
		
		idInserir("S1250DadosdeEvento",id2);
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
