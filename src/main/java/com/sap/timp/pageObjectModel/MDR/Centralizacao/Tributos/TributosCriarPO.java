package com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TributosCriarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Centralização de Tributos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//div[@id=\"UF\"]/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcUfFilial;
	
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filiais;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFiliais;
	
	@FindBy(xpath = "//div[contains(@class,\"overlay-multipleSelect3\")]")
	public WebElement claseOpcFiliais;
	
	@FindBy(xpath = "//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcTributoICMS;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcTributoCIAP;
	
	@FindBy(xpath = "//div[@id=\"centralizedTribute\"]/div/div/div[2]")
	public WebElement tributoCentralizador;
	
	@FindBy(xpath = "//li[@class=\"list-item\"]")
	public WebElement opcTributoCentralizador;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataVigenciaInicio;
	
	@FindBy(xpath = "//div[@class=\"date today\"]")
	public WebElement dia;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span")
	public WebElement pestañaAjuste;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Ajuste\"]")
	public WebElement btnNovoAjuste;
	
	@FindBy(xpath = "//div[@class=\"item\"]/div/div/div/input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filiaisAjuste;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcFiliaisAjuste;
	
	//                 ORIGEN
	@FindBy(xpath = "//div[@id=\"tributeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tributoOrigen;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcTributoOrigen;
	
	@FindBy(xpath = "//div[@id=\"tributeTypeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tipoOrigen;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcTipoOrigen;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opcTipoOrigenTP1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Saldo\"]")
	public WebElement saldo;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcSaldo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Detalhe Origem\"]")
	public WebElement detalheOrigen;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcDetalheOrigen;
	
	@FindBy(xpath = "//div[@id=\"documentTypeOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de documento\"]")
	public WebElement tipoDocumentoOrigen;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcTipoDocumentoOrigen;
	
	@FindBy(xpath = "//div[@id=\"documentNameOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Modelo de Guia\"]")
	public WebElement modeloGuiaOrigen;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcModeloGuiaOrigen;
	
	@FindBy(xpath = "//div[@id=\"outputFieldOrigin\"]/div/div/div/div/input[@placeholder=\"Selecionar Campo de saída\"]")
	public WebElement campoSaidaOrigen;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcCampoSaidaOrigen;
	
	//                  DESTINO
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo Destino\"]")
	public WebElement tributoDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcTributoDestino;
	
	@FindBy(xpath = "//div[@id=\"tributeTypeDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de tributo\"]")
	public WebElement tipoDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcTipoDestino;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Detalhe Destino\"]")
	public WebElement detalheDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcDetalheDestino;
	
	@FindBy(xpath = "//div[@id=\"documentTypeDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Tipo de documento\"]")
	public WebElement tipoDocumentoDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcTipoDocumentoDestino;
	
	@FindBy(xpath = "//div[@id=\"documentNameDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Modelo de Guia\"]")
	public WebElement modeloGuiaDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcModeloGuiaDestino;
	
	@FindBy(xpath = "//div[@id=\"outputFieldDestination\"]/div/div/div/div/input[@placeholder=\"Selecionar Campo de saída\"]")
	public WebElement campoSaidaDestino;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcCampoSaidaDestino;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnNovoAjusteGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"01\"]/div[2]")
	public WebElement opcICMSST;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFiliaisTC2;
	
	public TributosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarTributo() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		centralização.click();
		sleep(1000);
		tributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);
		sleep(2000);


		empresa.click();
		sleep(1000);
		opcEmpresa.click();
		attributeToBeXpath("//div[@id=\"UF\"]/div", "class", "base-select required");
		sleep(3000);
		
		ufFilial.click();
		sleep(1000);
		opcUfFilial.click();
		attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		filiais.click();
		sleep(1000);
		if(tc2==true) {
			opcFiliaisTC2.click();
		}else {
			opcFiliais.click();
		}
		
		claseOpcFiliais.click();
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		opcTributoCIAP.click();
		sleep(1000);
		opcTributoICMS.click();
		sleep(1000);
		claseOpcFiliais.click();
		
		attributeToBeXpath("//div[@id=\"centralizedTribute\"]/div ", "class", "base-select required");
		sleep(2000);
		tributoCentralizador.click();
		sleep(1000);
		opcTributoCentralizador.click();
		sleep(1000);
		String data = fechaActual();

		dataVigenciaInicio.sendKeys(data);
//		dataVigenciaInicio.sendKeys(Keys.END);
//		sleep(1000);
//		dataVigenciaInicio.sendKeys(Keys.ESCAPE);
//		sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"until\"]/div/div/input")).click();
		sleep(2000);
		pestañaAjuste.click();
		waitExpectElement(btnNovoAjuste);
		sleep(2000);
		btnNovoAjuste.click();
		sleep(1000);
		waitExpectElement(filiaisAjuste);
		sleep(1000);
		filiaisAjuste.sendKeys(Keys.ENTER);
		opcFiliaisAjuste.click();
		
		
		sleep(2000);
		tributoOrigen.click();
		sleep(1000);
		opcTributoOrigen.click();

		sleep(1000);
		attributeToBeXpath("//div[@id=\"tributeTypeOrigin\"]/div/div", "class", "base-select required");
		sleep(2000);
		
		tipoOrigen.click();
		sleep(1000);
		opcTipoOrigen.click();
		sleep(2000);

		attributeToBeXpath("//div[@id=\"saldo\"]/div/div", "class", "base-select required");
		sleep(2000);
		saldo.click();
		sleep(1000);
		opcSaldo.click();
		sleep(2000);
		
		detalheOrigen.click();
		sleep(1000);
		opcDetalheOrigen.click();
		sleep(3000);
		
		tipoDocumentoOrigen.click();
		sleep(1000);
		opcTipoDocumentoOrigen.click();
		sleep(1000);

		attributeToBeXpath("//div[@id=\"documentNameOrigin\"]/div/div", "class", "base-select required");
		sleep(2000);
		modeloGuiaOrigen.click();
		sleep(1000);
		opcModeloGuiaOrigen.click();
		sleep(1000);
		/*
		if (td1 == true || tq1==true ) {
			sleep(6000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		*/
		attributeToBeXpath("//div[@id=\"outputFieldOrigin\"]/div/div", "class", "base-select required");
		sleep(2000);
		campoSaidaOrigen.click();
		sleep(1000);
		opcCampoSaidaOrigen.click();


		sleep(2000);
		actionsMoveToElementElement(campoSaidaDestino);
		sleep(1000);

		
		tributoDestino.click();
		sleep(1000);
		opcTributoDestino.click();
		sleep(1000);
		
		
		attributeToBeXpath("//div[@id=\"tributeTypeDestination\"]/div/div", "class", "base-select required");
		sleep(2000);
		tipoDestino.click();
		sleep(1000);
		opcTipoDestino.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"detailDestination\"]/div/div", "class", "base-select required");
		sleep(3000);
		detalheDestino.click();
		sleep(2000);
		opcDetalheDestino.click();
		sleep(2000);
		
		
		tipoDocumentoDestino.click();
		sleep(1000);
		opcTipoDocumentoDestino.click();
		sleep(1000);
		
		/*
		if (td1 == true || tq1==true ) {
			sleep(9000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		*/
		
		attributeToBeXpath("//div[@id=\"documentNameDestination\"]/div/div", "class","base-select required");
		sleep(2000);
		modeloGuiaDestino.click();
		sleep(1000);
		opcModeloGuiaDestino.click();
		
		/*
		if (td1 == true || tq1==true ) {
			sleep(8000);
		}else if (tp1 == true || tc2==true) {
			sleep(12000);
		}
		*/
		sleep(1000);
		attributeToBeXpath("//div[@id=\"outputFieldDestination\"]/div/div", "class","base-select required");
		sleep(2000);
		campoSaidaDestino.click();
		sleep(1000);
		opcCampoSaidaDestino.click();
		sleep(1000);
		
		btnNovoAjusteGravar.click();
		
		//Integer filas= driver.findElements(By.xpath("//*[@id=\"library\"]/div/div/div/div[2]/div[1]")).size();
		
		sleep(3000);
		btnGravar.click();
		sleep(1000);
		waitExpectElement(confirmacionGravar);
		sleep(1000);
		confirmacionGravar.click();
		
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(btnRegresar);
		btnRegresar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		idInserir("Tributos",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
	
		return sucesso;
	}
}
