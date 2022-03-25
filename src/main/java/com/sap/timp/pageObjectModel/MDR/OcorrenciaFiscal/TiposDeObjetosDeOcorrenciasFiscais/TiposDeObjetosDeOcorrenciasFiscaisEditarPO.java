package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeObjetosDeOcorrenciasFiscaisEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciafiscal;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement tiposdeobjetosdeocorrenciasfiscais;
	
	
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
	
	@FindBy(xpath = "//div[@id=\"occurrence\"]/div/div/div[2]")
	public WebElement ocorrencia;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"occurrenceObject\"]/div/div/div[2]")
	public WebElement objetos;
	
	@FindBy(xpath = "//div[@id=\"idFluxBPMA\"]/div/div/div/div[2]")
	public WebElement idfluxo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoid;
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div/div[2]")
	public WebElement classificacao;
	
		
	@FindBy(xpath = "//div[@id=\"credit-adjustment-code\"]/div/div/div[2]")
	public WebElement codigocredito;
	
	@FindBy(xpath = "//div[@id=\"debit-adjustment-code\"]/div/div/div[2]")
	public WebElement codigodebito;
	
	@FindBy(xpath = "//div[@id=\"pagamento-adjustment-code\"]/div/div/div[2]")
	public WebElement codigopagamento;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Início de Vigência\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafim;
	
	public TiposDeObjetosDeOcorrenciasFiscaisEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		sleep(2000);
		ocorrenciafiscal.click();
		sleep(2000);
		
		tiposdeobjetosdeocorrenciasfiscais.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("TiposDeObjetosDeOcorrenciasFiscais");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		String valor = datainicio.getAttribute("value");

		String enviar = fechaAyer();
		sleep(48000);
		datainicio.clear();
		sleep(2000);
		datainicio.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
			
		waitExpectElement(datainicio);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String novoTexto=datainicio.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(40000);
		datainicio.clear();

		sleep(2000);
		datainicio.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	


}
