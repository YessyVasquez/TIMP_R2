package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-contratingNoPortWorkers\"]")
	public WebElement subMenuContatacaoTrabalhador;
	
	@FindBy(xpath = "//span[text()=\"Novo Registo\"]")
	public WebElement btnNovoRegistro;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"companies_0_1\")]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//div[contains(@class, \"branches_0_2\")]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@class, \"typeInscriptionNumber1_0_3\")]/div/div[2]/div/div[2]")
	public WebElement tipoInscricao1;
	
	@FindBy(xpath = "//div[contains(@class, \"inscriptionNumber1_0_4\")]/div/div[2]/div/div[2]")
	public WebElement numeroInscricao1;
	
	@FindBy(xpath = "//div[contains(@class, \"referenceMonth_0_5\")]/div/div/input")
	public WebElement mesReferencia;
	
	@FindBy(xpath = "//div[contains(@class, \"typeInscriptionNumber2_0_6\")]/div/div[2]/div/div[2]")
	public WebElement tipoInscricao2;
	
	@FindBy(xpath = "//div[contains(@class, \"inscriptionNumber2_0_7\")]/div/div[2]/div/div[2]")
	public WebElement numeroInscricao2;
	
	@FindBy(xpath = "//div[contains(@class, \"stockCode_0_8\")]/div/div[2]/div/div/div[2]/input")
	public WebElement lotacaoTributaria;
	
	@FindBy(xpath = "//div[contains(@class, \"vrBcCp00_0_9\")]/div/div[2]/div/div/div[2]/input")
	public WebElement valorBaseContribuicaoPrevidenciaria;
	
	@FindBy(xpath = "//div[contains(@class, \"vrBcFgts_0_14\")]/div/div[2]/div/div/div[2]/input")
	public WebElement valorBaseCalculoFGTS;
	
	@FindBy(xpath = "//div[contains(@class, \"vrDescCP_0_15\")]/div/div[2]/div/div/div[2]/input")
	public WebElement valorBaseContribuicaoDescontada;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_16 \")]/div/div/input")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	public ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuContatacaoTrabalhador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);			
		sleep(2000);
		
		btnNovoRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"branches_0_2\")]/div/div[2]/div/div[1]/div[2]/input", "class", "");
		filial.click();
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"typeInscriptionNumber1_0_3\")]/div/div[2]/div/div[1]/div[2]/input", "class", "");
		tipoInscricao1.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"inscriptionNumber1_0_4\")]/div/div[2]/div/div[1]/div[2]/input", "class", "");
		numeroInscricao1.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		mesReferencia.click();
		sleep(1000);
		mesReferencia.sendKeys("10/2020");
		sleep(2000);
		
		actionsMoveToElementElement(lotacaoTributaria);
		attributeToBeXpath("//div[contains(@class, \"typeInscriptionNumber2_0_6\")]/div/div[2]/div/div[1]/div[2]/input", "class", "");
		tipoInscricao2.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"inscriptionNumber2_0_7\")]/div/div[2]/div/div[1]/div[2]/input", "class", "");
		numeroInscricao2.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		lotacaoTributaria.click();
		sleep(1000);
		lotacaoTributaria.sendKeys("Prueba tester 55");
		sleep(2000);
		
		actionsMoveToElementElement(validadeDe);
		valorBaseContribuicaoPrevidenciaria.click();
		sleep(1000);
		valorBaseContribuicaoPrevidenciaria.sendKeys("32,33");
		sleep(2000);
		
		valorBaseCalculoFGTS.click();
		sleep(1000);
		valorBaseCalculoFGTS.sendKeys("0,20");
		sleep(2000);
		
		valorBaseContribuicaoDescontada.click();
		sleep(1000);
		valorBaseContribuicaoDescontada.sendKeys("0,43");
		sleep(2000);
		
		validadeDe.click();
		sleep(1000);
		validadeDe.sendKeys(fechaActual());
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("ContrataçãoDeTrabalhadoresAvulsosNãoPortuários",idB);

		sleep(2000);
		System.out.println(id);
		System.out.println(idB);

		double idD = Integer.valueOf(id);
		double idBD = Integer.valueOf(idB);

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
