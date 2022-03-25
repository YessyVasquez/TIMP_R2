package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class StatusOcorrenciaFiscalExcluirEmMassaPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Status de Ocorrência Fiscal\"]")
	public WebElement statusOcorrencia;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//button[@id=\"statusButton\"]")
	public WebElement status;
	
	@FindBy(xpath = "//div[@id=\"firstStatus\"]/div/div/div[2]")
	public WebElement statusInicial;
	
	@FindBy(xpath = "//div[@id=\"lastStatus\"]/div/div/div[2]")
	public WebElement statusFinal;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;	
	
	@FindBy(xpath = "//body")
	public WebElement body;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public StatusOcorrenciaFiscalExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		ocorrenciaFiscal.click();
		sleep(2000);
		statusOcorrencia.click();
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
		
		empresa.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(empresa).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"state\"]/div", "class", "input-element-wrapper");
		
		ufFilial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(ufFilial).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "input-element-wrapper");
		
		filial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(filial).click().perform();
		sleep(1000);
		
		status.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		statusInicial.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		new Actions(driver).moveToElement(statusInicial).click().perform();
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		new Actions(driver).moveToElement(statusFinal).click().perform();
		sleep(1000);
		
		fechar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status da Ocorrência Fiscal");

		dataVigencia.sendKeys(fechaActual());
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//************      CREAR SEGUNDO REGISTRO        ************
		
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(empresa).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"state\"]/div", "class", "input-element-wrapper");
		
		ufFilial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(ufFilial).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "input-element-wrapper");
		
		filial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(filial).click().perform();
		sleep(1000);
		
		status.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		statusInicial.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		new Actions(driver).moveToElement(statusInicial).click().perform();
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		new Actions(driver).moveToElement(statusFinal).click().perform();
		sleep(1000);
		
		fechar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status da Ocorrência Fiscal");

		dataVigencia.sendKeys(fechaActual());
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
	}
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		return sucesso;
	}
}
