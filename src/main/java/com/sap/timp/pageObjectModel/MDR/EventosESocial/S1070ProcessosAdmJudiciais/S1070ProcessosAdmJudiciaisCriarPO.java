package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1070ProcessosAdmJudiciaisCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-judicialProcesses\"]")
	public WebElement subMenuProcessosAdmJudiciais;
	
	@FindBy(xpath = "//span[text()=\"Novo Processo Adm/Judicial\"]")
	public WebElement btnNovoProcesso;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"companies_0_0\")]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@class, \"uf_0_1\")]/div/div[2]/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[contains(@class, \"branches_0_2\")]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@class, \"inscriptionNumber_0_3\")]/div/div[2]/div/div[2]")
	public WebElement numeroInscricao;
	
	@FindBy(xpath = "//div[contains(@class, \"processNumber_0_4\")]/div/div/div/div/div[2]/input")
	public WebElement numeroDoProceso;
	
	@FindBy(xpath = "//div[contains(@class, \"processType_0_5\")]/div/div[2]/div/div[2]")
	public WebElement tipoProcesso;
	
	@FindBy(xpath = "//div[contains(@class, \"authorshipType_0_6\")]/div/div[2]/div/div[2]")
	public WebElement tipoAutoria;
	
	@FindBy(xpath = "//div[contains(@class, \"processClass_0_7\")]/div/div[2]/div/div[2]")
	public WebElement classeProcesso;
	
	@FindBy(xpath = "//div[contains(@class, \"countyCode_0_8\")]/div/div[2]/div/div[2]")
	public WebElement codMunicipio;
	
	@FindBy(xpath = "//div[contains(@class, \"judicialRod_0_9\")]/div/div[2]/div/div/div[2]/input")
	public WebElement varaJudicial;
	
	@FindBy(xpath = "//div[contains(@class, \"suspensionCode_0_10\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoSuspensao;
	
	@FindBy(xpath = "//div[contains(@class, \"suspensionIndicative_0_11\")]/div/div[2]/div/div[2]")
	public WebElement indicativoDaSuspensao;
	
	@FindBy(xpath = "//div[contains(@class, \"publicationDate_0_12 \")]/div/div/span")
	public WebElement inputDataDaPublicao;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date today\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement dataDaPublicao;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_15 \")]/div/div/span")
	public WebElement inputValidadede;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date today\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement validadede;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[contains(@class,\"list-option\") and @tabindex][2]")
	public WebElement opcionCombo2;
	
	@FindBy(xpath = "//div[contains(@class,\"list-option\") and @tabindex][3]")
	public WebElement opcionCombo3;
	
	public S1070ProcessosAdmJudiciaisCriarPO() {
		PageFactory.initElements(driver,  this);
	}
	
	public boolean criar() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuProcessosAdmJudiciais.click();
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
		
		btnNovoProcesso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"uf_0_1\")]/div/div[2]/div/div/div[2]/input", "class", "");
		waitExpectElement(uf);
		uf.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"branches_0_2\")]/div/div[2]/div/div/div[2]/input", "class", "");
		filial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"inscriptionNumber_0_3\")]/div/div[2]/div/div/div[2]/input", "class", "");
		numeroInscricao.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		numeroDoProceso.click();
		numeroDoProceso.sendKeys("5551200");
		sleep(1000);
		
		tipoProcesso.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(1000);
		
		tipoAutoria.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(1000);
		
		classeProcesso.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(1000);
		
		codMunicipio.click();
		sleep(1000);
		opcionCombo3.click();
		sleep(1000);
		
		varaJudicial.click();
		sleep(1000);
		varaJudicial.sendKeys("1234");
		sleep(1000);
		
		codigoSuspensao.click();
		codigoSuspensao.sendKeys("12314241241241");
		sleep(1000);
		
		indicativoDaSuspensao.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(1000);
		
		inputDataDaPublicao.click();
		sleep(1000);
		dataDaPublicao.click();
		sleep(1000);
		
		inputValidadede.click();
		sleep(1000);
		validadede.click();
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
		
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuProcessosAdmJudiciais.click();
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
		idInserir("S1070ProcessosAdmJudiciais",idB);

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
