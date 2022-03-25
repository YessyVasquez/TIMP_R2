package com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosAjustesCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajustes;
	
	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	@FindBy(xpath = "//div[@id=\"companyCode\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"adjustmentType\"]/div/div/div[2]")
	public WebElement tipoAjuste;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and  @id][1]")
	public WebElement opcion;
	
	@FindBy(xpath = "//div[@id=\"releaseType\"]/div/div/div[2]")
	public WebElement tipoLan;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement descriçao;
	@FindBy(xpath = "//div[@id=\"adjustmentTribute\"]/div/div/div[2]")
	
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"tributeType\"]/div/div/div[2]")
	public WebElement tipoTributo;
	
	
	@FindBy(xpath = "//div[@id=\"tributeTypeDetail\"]/div/div/div/div[2]")
	public WebElement detalheTributo;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]")
	public WebElement detalheTributoO;
	
	
	@FindBy(xpath = "//div[@id=\"accountingType\"]/div/div[2]")
	public WebElement codigoConta;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and  @id][1]")
	public WebElement codigoContaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validade;
	
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public CodigosAjustesCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")==true || url.contains("tp1")==true) {
			sleep(1000);
			codigo.click();
		}else {
			ajustes.click();
			sleep(1000);
			codigo.click();
		}
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		attributeToBeXpath("//div[@id=\"companyCode\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tipoAjuste.click();
		opcion.click();
		sleep(1000);
		
		tipoLan.click();
		opcion.click();
		sleep(1000);
		
		descriçao.sendKeys("Código Ajuste de Teste");
		sleep(1000);
		actionsMoveToElementElement(codigoConta);
		sleep(1000);
		tributo.click();
		sleep(1000);
		
		tributoO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"tributeType\"]/div", "class", "base-select required");
		sleep(1000);
		tipoTributo.click();
		sleep(1000);
		opcion.click();
		sleep(1000);
		attributeToBeXpath("//div[@id=\"tributeTypeDetail\"]/div/div/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);
		detalheTributo.click();
		sleep(1000);
		detalheTributoO.click();
		
		codigoConta.click();
		sleep(1000);
		codigoContaO.click();
		sleep(1000);
		
		validade.sendKeys(fechaActual());
		
		sleep(1000);
		gravar.click();
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
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("CodigoAjuste",id2);
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
