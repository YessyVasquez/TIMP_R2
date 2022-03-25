package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTCriarPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	@FindBy(xpath = "//span[text()=\"Novos Parâmetros para Livro ICMS ST\"]")
	public WebElement novoparametros;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	

	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"field-element bookType_0_0\"]/div/div/div/div[2]")
	public WebElement tipodolivro;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaotipodolivro;

	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//label[contains(@for,\"3000\")]/span")
	public WebElement opcaoempresa;

	@FindBy(xpath = "//label[contains(@for,\"1000\")]/span")
	public WebElement opcaoempresaTC2;
	
	@FindBy(xpath = "//div[@class=\"field-element stateId_0_1\"]/div/div/div/div[2]")
	public WebElement ufdafilial;
	
	@FindBy(xpath = "//label[contains(@for,\"BA\")]/span")
	public WebElement opcaoufdafilial;
	
	@FindBy(xpath = "//label[contains(@for,\"AL\")]/span")
	public WebElement opcaoufdafilialTC2;
	
	@FindBy(xpath = "//div[@class=\"field-element branchId_0_1\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//label[contains(@for,\"0031\")]/span")
	public WebElement opcaodafilial;
	
	@FindBy(xpath = "//label[contains(@for,\"0008\")]/span")
	public WebElement opcaodafilialTC2;
	
	@FindBy(xpath = "//div[@class=\"field-element taxCode_0_2\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-2\"]/div")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"field-element branchStructureHash_0_2\"]/div/div/div/div[2]")
	public WebElement informacaomdr;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdr;
	
	@FindBy(xpath = "//div[@class=\"field-element branchStateSt_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrufst;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrufst;
	
	@FindBy(xpath = "//div[@class=\"field-element branchState_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrfilial;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrfilial;
	
	@FindBy(xpath = "//div[@class=\"field-element companyStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposmdrempresa;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element filialStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposfilial;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposfilial;
	
	@FindBy(xpath = "//div[@class=\"field-element stRegistrationStructureHash_0_5\"]/div/div/div/div[2]")
	public WebElement informacaomdrinscricao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrinscricao;
	
	
	@FindBy(xpath = "//div[@class=\"field-element stRegistrationFields_0_5\"]/div/div/div/div[2]")
	public WebElement camposinformacaomdrinscricao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrincricao;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginStructureHash_0_6\"]/div/div/div/div[2]")
	public WebElement informacaoorigemdomovimento;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaoorigemdomovimento;
	
	@FindBy(xpath = "//div[@class=\"field-element movementOriginState_0_6\"]/div/div/div/div[2]")
	public WebElement camposinformacaoorigem;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposinformacaoorigem;
	
	@FindBy(xpath = "//div[@class=\"field-element movementOriginBranch_0_7\"]/div/div/div/div[2]")
	public WebElement movimentoufdeparceiro;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimentoufdeparceiro;
	
	@FindBy(xpath = "//div[@class=\"field-element movementOriginTax_0_7\"]/div/div/div/div[2]")
	public WebElement movimentotributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimenttributo;
	
	@FindBy(xpath = "//div[@class=\"field-element adjustmentsStructureHash_0_8\"]/div/div/div/div[2]")
	public WebElement informacaodeajustes;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaodeajustes;
	
	@FindBy(xpath = "//div[@class=\"field-element adjustmentsFields_0_8\"]/div/div/div/div[2]")
	public WebElement camposinformacaodeajustes;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaocamposinformacaodeajustes;
	
	
	
	public ParametrosParaLivroICMSSTCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 =true;
		}
		
		sleep(2000);
		livrosfiscais.click();
		sleep(2000);
		
		parametrosparalivroicmsst.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novoparametros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipodolivro.click();
		
		sleep(2000);
		
		opcaotipodolivro.click();
		
		sleep(2000);
		

		empresa.click();
		sleep(2000);
		
		if (tc2 == true) {
			opcaoempresaTC2.click();
			opcaoempresaTC2.sendKeys(Keys.ESCAPE);
		}else {
			opcaoempresa.click();
			opcaoempresa.sendKeys(Keys.ESCAPE);
		}

		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element stateId_0_1\"]/div", "class", "input-element-wrapper");
		sleep(1000);
		
		ufdafilial.click();
		
		sleep(2000);
		if (tc2 == true) {
			opcaoufdafilialTC2.click();
			opcaoufdafilialTC2.sendKeys(Keys.ESCAPE);
			
		}else {
			opcaoufdafilial.click();
			opcaoufdafilial.sendKeys(Keys.ESCAPE);
		}
		
		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element branchId_0_1\"]/div", "class", "input-element-wrapper");
		sleep(1000);

		
		filial.click();
		
		sleep(2000);
		
		if (tc2 == true) {
			opcaodafilialTC2.click();
			sleep(1000);
			opcaodafilialTC2.sendKeys(Keys.ESCAPE);
		}else {
			opcaodafilial.click();
			sleep(1000);
			opcaodafilial.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		body.click();
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		
		informacaomdr.click();
		
		sleep(2000);
		
		opcaoinformacaomdr.click();
		
		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element branchStateSt_0_3\"]/div", "class", "input-element-wrapper");
		sleep(2000);
		
		camposmdrufst.click();
		sleep(2000);
		
		opcaocamposmdrufst.click();
		
		sleep(2000);
		
		camposmdrfilial.click();
		
		sleep(2000);
		
		opcaocamposmdrfilial.click();
		
		sleep(2000);
		
		camposmdrempresa.click();
		
		sleep(2000);
		
		opcaocamposmdrempresa.click();
		
		sleep(2000);
		
		camposfilial.click();
		
		sleep(2000);
		
		opcaocamposfilial.click();
		
		sleep(2000);
		
		informacaomdrinscricao.click();
		
		sleep(2000);
		
		opcaoinformacaomdrinscricao.click();
		
		sleep(2000);
		actionsMoveToElementElement(dataincial);
		sleep(1000);
		attributeToBeXpath("//div[@class=\"field-element stRegistrationFields_0_5\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaomdrinscricao.click();
		
		sleep(2000);
		
		opcaoinformacaomdrincricao.click();
		
		sleep(2000);
		
		
		informacaoorigemdomovimento.click();
		
		sleep(2000);
		
		opcaoinformacaoorigemdomovimento.click();
		
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"field-element movementOriginState_0_6\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaoorigem.click();
		
		sleep(2000);
		
		opcaocamposinformacaoorigem.click();
		
		sleep(2000);
		
		movimentoufdeparceiro.click();
		
		sleep(2000);
		
		opcaomovimentoufdeparceiro.click();
		
		sleep(2000);
		
		movimentotributo.click();
		
		sleep(2000);
		
		opcaomovimenttributo.click();
		
		sleep(2000);
		
		informacaodeajustes.click();
		
		sleep(2000);
		
		opcaoinformacaodeajustes.click();
		
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"field-element adjustmentsFields_0_8\"]/div","class", "input-element-wrapper");
		sleep(2000);
		
		camposinformacaodeajustes.click();
		
		sleep(2000);
		
		opcaocamposinformacaodeajustes.click();
		opcaocamposinformacaodeajustes.sendKeys(Keys.ESCAPE);
		body.click();
		sleep(2000);
		
		String data="01/01/2013";
		dataincial.sendKeys(data);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("ParametrosParaLivroICMSST",id2);
		
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
