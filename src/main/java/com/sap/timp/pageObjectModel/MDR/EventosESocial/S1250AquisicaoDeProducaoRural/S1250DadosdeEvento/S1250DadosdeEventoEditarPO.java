package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEvento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1250DadosdeEventoEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"S1250 - Aquisição de Produção Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"Dados de Evento\"]")
	public WebElement dadosEvento;
	
	@FindBy(xpath = "//span[text()=\"Novo Dados Básicos\"]")
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
	
	public S1250DadosdeEventoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
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
		
		String idRegistro = idObter("S1250DadosdeEvento");
		System.out.println("111");
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"event-data-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//*[@id=\"event-data-list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[1]/span[2]"));
		System.out.println("222");
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = numeroderecibo.getAttribute("value");

		String enviar = "888";

		numeroderecibo.clear();
		sleep(2000);
		numeroderecibo.sendKeys(enviar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@id=\"event-data-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//*[@id=\"event-data-list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[1]/span[2]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(numeroderecibo);
		sleep(2000);
		String novoTexto=numeroderecibo.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		
		
		return sucesso;
	}	

}
