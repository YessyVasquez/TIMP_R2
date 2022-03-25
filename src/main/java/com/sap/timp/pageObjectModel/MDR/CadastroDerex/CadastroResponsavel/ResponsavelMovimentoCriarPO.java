package com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class ResponsavelMovimentoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-responsibleDerex\"]")
	public WebElement responsavelO;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Cadastro Responsável\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/div[2]")
	public WebElement instituicao;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[1]/label/span")
	public WebElement icms;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"completeAddress\"]/div/div/input")
	public WebElement endereco;
	
	@FindBy(xpath = "//div[@id=\"officialId\"]/div/div/input")
	public WebElement idOfficial;
	
	@FindBy(xpath = "//div[@id=\"documentType\"]/div/div/input")
	public WebElement tipoDoc;
	
	@FindBy(xpath = "//div[@id=\"accountingId\"]/div/div/input")
	public WebElement idConta;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement validFrom;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//li[text()=\"TA Instituição Financeira\"]")
	public WebElement instituicaoO;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public ResponsavelMovimentoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		derex.click();
		sleep(1000);
		responsavelO.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		tributo.click();
		sleep(1000);
		icms.click();
		tributo.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		instituicao.click();
		sleep(1000);
		actionsMoveToElementElement(instituicaoO);
		sleep(1000);
		instituicaoO.click();
		sleep(1000);
			
		attributoNotToBeEmptyXpath("//*[@id=\"country\"]/div/div/input", "value");
		
		nome.sendKeys("teste movimento");
		
		endereco.sendKeys("endereço teste");
		
		idOfficial.sendKeys("0607");
		
		tipoDoc.sendKeys("pasaport");
		
		idConta.sendKeys("1234567");
		
		String data = fechaActual();
		
		validFrom.sendKeys(data);
		
		
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("ResponsavelMovimento",idB);
		System.out.println(id);
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}

		return sucesso;
				
			
		
		
		
	}
	

}
