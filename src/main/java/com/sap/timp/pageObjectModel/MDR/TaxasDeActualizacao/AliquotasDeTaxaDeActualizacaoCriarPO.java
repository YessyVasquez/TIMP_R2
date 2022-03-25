package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao.RegistroDeExportaçaoCriarPO;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal;

public class AliquotasDeTaxaDeActualizacaoCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement taxasActualizacao;
	
	@FindBy(xpath = "//span[text()=\"Alíquotas de Taxa de Atualização\"]")
	public WebElement aliquotas;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"indexCode\"]/div/div/div/input")
	public WebElement codigo;
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement codigoO;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor\"]")
	public WebElement valor;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor Período\"]")
	public WebElement valorPeriodo;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Fator Acumulado\"]")
	public WebElement fatorAcum;
	@FindBy(xpath = "//input[@placeholder=\"Prencher a Taxa\"]")
	public WebElement taxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Início da Taxa\")]")
	public WebElement inicioTaxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Fim da Taxa\")]")
	public WebElement finTaxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Divulgação da Taxa\")]")
	public WebElement dataDivulgacion;	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Atualização da Taxa\")]")
	public WebElement dataActualizacion;	

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public AliquotasDeTaxaDeActualizacaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		taxasActualizacao.click();
		sleep(2000);
		aliquotas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		valor.sendKeys("987");
		sleep(1000);
		
		fatorAcum.sendKeys("765");
		sleep(1000);
		
		taxa.sendKeys("432");
		sleep(1000);
		
		valorPeriodo.sendKeys("3318");
		sleep(1000);
		
		String data = fechaActual();
		inicioTaxa.sendKeys(data);
		sleep(1000);
		
		String data1 = fechaManana();
		finTaxa.sendKeys(data1);
		sleep(1000);
		
		String data2 = fechaManana();
		dataDivulgacion.sendKeys(data2);
		sleep(1000);
		
		String data3 = fechaManana();
		dataActualizacion.sendKeys(data3);
		sleep(1000);
		
		codigo.click();
		sleep(1000);
		codigoO.click();
		sleep(1000);
		
		
		

		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("taxasdeactualizacao", idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
		


}
