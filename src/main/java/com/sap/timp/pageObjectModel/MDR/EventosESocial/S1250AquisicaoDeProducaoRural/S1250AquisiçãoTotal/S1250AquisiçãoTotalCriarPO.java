package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1250AquisiçãoTotalCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"S1250 - Aquisição de Produção Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"Aquisição Total\"]")
	public WebElement adquisicaoTotal;
	
	@FindBy(xpath = "//*[@id=\"total-acquisition-toolbar\"]/div/div/ul/li/button/span[2]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"total-acquisition-list\"]/div/div[2]/div/div[1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement idEvento;
	
	@FindBy(xpath = "//*[@id=\"recordId\"]/div/div/input")
	public WebElement idRegistro;
	
	@FindBy(xpath = "//*[@id=\"parentId\"]/div/div/input")
	public WebElement idPrincipal;
	
	@FindBy(xpath = "//*[@id=\"select\"]/div[1]/input")
	public WebElement Indicativo;
	
	@FindBy(xpath = "//*[@id=\"totalAcquisitionValue\"]/div/div/input")
	public WebElement valorTotal;
	
	
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public S1250AquisiçãoTotalCriarPO() {

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
		
		adquisicaoTotal.click();
		sleep(3000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@id=\"total-acquisition-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getText();
		
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
		
		idRegistro.sendKeys("001");
		
		sleep(2000);
		
		idPrincipal.sendKeys("001");
		
		sleep(2000);
		
		Indicativo.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		valorTotal.sendKeys("123456");
		
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
		String id2 = driver.findElement(By.xpath("//div[@id=\"total-acquisition-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getAttribute("textContent");
		
		
		idInserir("S1250AquisiçãoTotal",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println("ID1: "+idD);
		System.out.println("ID2: "+id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	

}
