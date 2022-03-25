package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoContabilizacaoCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
		

	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	

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
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public CodigoContabilizacaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {
		
	

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
			
		novocodigocontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		
		opcaoempresa.click();
		
		opcaoempresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);
		
		opcaotipolancamento.click();
		
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste");
		
		tributo.click();
		
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		tipotributo.click();
		
		opcaotipotributo.click();
		
		//pega a data atual
		//String data= fechaActual();
		String data = fechaAyer();
		datainicio.sendKeys(data);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(butaosim);
		sleep(1000);
		nao.click();
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(4000);


		
		biblioteca.click();
		sleep(6000);
		
		int visible = rows("//button[text()=\"Não\"]");
		
		if (visible>0) {
			sleep(2000);
			waitExpectElement(butaosim);
			sleep(1000);
			nao.click();
			waitExpectElement(butaosim);
			sleep(2000);
			butaosim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay dark\"]");
			sleep(4000);
		}
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		//Pega o ultimo id depois do preenchimento

		siguiente.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("CodigoContabilizacao",id2);
		System.out.println(id2);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
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
