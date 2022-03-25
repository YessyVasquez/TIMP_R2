package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1070ProcessosAdmJudiciaisExcluirEmMassaPO extends TestBaseFernando{
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
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
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
	
	@FindBy(xpath = "//div[contains(@class, \"publicationDate_0_12\")]/div/div/input")
	public WebElement inputDataDaPublicao;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date today\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement dataDaPublicao;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_15 \")]/div/div/input")
	public WebElement inputValidadede;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date today\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement validadede;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[contains(@class,\"list-option\") and @tabindex][2]")
	public WebElement opcionCombo2;
	
	@FindBy(xpath = "//div[contains(@class,\"list-option\") and @tabindex][3]")
	public WebElement opcionCombo3;
	
	public S1070ProcessosAdmJudiciaisExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		menuEventosEsocial.click();
		
		sleep(2000);
		subMenuProcessosAdmJudiciais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
		btnNovoProcesso.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Primer registro
		empresa.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
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
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"inscriptionNumber_0_3\")]/div/div[2]/div/div/div[2]/input", "class", "");
		numeroInscricao.click();
		sleep(1000);
		opcionCombo.click();
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
		inputDataDaPublicao.sendKeys("01/01/2013");
		sleep(1000);
		
		inputValidadede.click();
		sleep(1000);
		inputValidadede.sendKeys("01/01/2010");
		sleep(2000);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		// Segundo registro
		empresa.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
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
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"inscriptionNumber_0_3\")]/div/div[2]/div/div/div[2]/input", "class", "");
		numeroInscricao.click();
		sleep(1000);
		opcionCombo.click();
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
		inputDataDaPublicao.sendKeys("01/01/2013");
		sleep(1000);
		
		inputValidadede.click();
		sleep(1000);
		inputValidadede.sendKeys("01/01/2010");
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		menuEventosEsocial.click();
		
		sleep(2000);
		subMenuProcessosAdmJudiciais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 

		idInserir("S1070ProcessosAdmJudiciaisExcluirEmMassa", idB);

		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!btnNovoProcesso.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		

		int idUltimoRegistro = convertToInt(idObter("S1070ProcessosAdmJudiciaisExcluirEmMassa"));

		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
