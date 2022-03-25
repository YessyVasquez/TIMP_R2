package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CódigoContabilizaçãoExcluirMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement tipolancamento;
	
	@FindBy(xpath = "//li[@class=\"list-item selected visible\"]")
	public WebElement opcaotipolancamento;

	@FindBy(xpath = "//*[@id=\"standard-description\"]/div/div/input")
	public WebElement descricaopadrao;
	
	@FindBy(xpath = "//div[@class=\"icon main-icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"00 - ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//*[@id=\"start-date\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div[2]")
	public WebElement tipotributo;
	
	//@FindBy(xpath = "//div[@class=\"base-autocomplete-box show\"]/ul/li[2]")
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public CódigoContabilizaçãoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	String idAC = ""; 
	public boolean criar() {
		sleep(2000);
		codigoscontabilizacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idAC = id;
		sleep(2000);
		System.out.println("Id antes da criação: "+id);
		
		novocodigocontabilizacao.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		opcaoempresa.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);
		sleep(2000);
		opcaotipolancamento.click();
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste QA 1");
		
		tributo.click();
		sleep(1000);
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		
		//pega a data atual
		//String data= fechaActual();
		String data = fechaAyer();
		datainicio.sendKeys(data);
		
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		nao.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		opcaoempresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);
		sleep(2000);
		opcaotipolancamento.click();
		
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste QA 1");
		sleep(2000);
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		sleep(3000);
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		tipotributo.click();
		sleep(2000);
		opcaotipotributo.click();
		sleep(2000);
		//pega a data atual
		//String data= fechaActual();
		String data1 = fechaAyer();
		datainicio.sendKeys(data1);
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		nao.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(5000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);
		
	
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows -1;
		
		String id3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		System.out.println("Id penultimo apos da cricação: " +id3);
		System.out.println("Id ultimo apos da cricação: " +id2);
		
		boolean sucesso = false;
		int idI = convertToInt(idAC);
		int id2I = convertToInt(id2);
		int id3I = convertToInt(id3);
		
		
		if (idI < id2I && idI<id3I) {
			sucesso = true;
		}
		
		System.out.println("Registros Criados com Sucesso: "+sucesso);
		
		return sucesso;
		
		
	}
	
	
	public boolean excluir() {
		
		int rows = rows("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]");
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da cricação: " +idAC);
		
		rows = rows -1;
		
		String id3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		rows = rows("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]");
		
		
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 

		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		sleep(1000);
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		sleep(1000);
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		aceitar.click();
		
		invisibilityOfElementOverlay();
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		System.out.println("Ultimo id Após a Exclusão: "+id);
		
		int idAC1 = convertToInt(id);
		int id2I = convertToInt(id2);
		int id3I = convertToInt(id3);

		
		
		boolean sucesso = false;
		
		if (idAC1 < id2I && idAC1<id3I) {
			sucesso = true;
		}
		
		

		
		return sucesso;
		
	}
}
