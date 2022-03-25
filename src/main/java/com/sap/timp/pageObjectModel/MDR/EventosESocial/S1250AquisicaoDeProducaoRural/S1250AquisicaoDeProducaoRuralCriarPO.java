package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1250AquisicaoDeProducaoRuralCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"S1250 - Aquisição de Produção Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"Novo Dados Básicos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@id=\"companyOption\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"eventTypeOption\"]/div/div/div[2]")
	public WebElement tipodeevento;
	
	@FindBy(xpath = "//div[@id=\"versionOption\"]/div/div/div[2]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o Logsys\"]")
	public WebElement log;
	
		
	@FindBy(xpath = "//div[@id=\"environmentType\"]/div/div/div[2]")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Versão do processo de preenchimento\"]")
	public WebElement versaodoprocesso;
	
	@FindBy(xpath = "//div[@id=\"eventRegistrationType\"]/div/div/div[2]")
	public WebElement tipoderegisto;
	
	@FindBy(xpath = "//div[@id=\"eventRegistrationNumber\"]/div/div/div[2]")
	public WebElement numeroderegistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Recibo\"]")
	public WebElement numeroderecibo;
	
	@FindBy(xpath = "//div[@id=\"indApur\"]/div/div/div[2]")
	public WebElement indicativodeperiodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher período de contagem\"]")
	public WebElement periododeapuracao;
	
	@FindBy(xpath = "//div[@id=\"issuingProcess\"]/div/div/div[2]")
	public WebElement processodeemissao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public S1250AquisicaoDeProducaoRuralCriarPO() {

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
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipodeevento.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		versao.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		status.sendKeys("99");
		
		sleep(2000);
		
		log.sendKeys("9");
		
		sleep(2000);
		
		tipodeambiente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		versaodoprocesso.sendKeys("7");
		
		sleep(2000);
		
		tipoderegisto.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		numeroderegistro.click();
		
		sleep(2000);
		
		opcao.click();

		sleep(2000);
		numeroderecibo.sendKeys("777");
		
		sleep(2000);
		
		indicativodeperiodo.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		periododeapuracao.sendKeys("9/2020");
		
		sleep(2000);
		
		processodeemissao.click();
		
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
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		
		idInserir("S1250AquisicaoDeProducaoRural",id2);
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
