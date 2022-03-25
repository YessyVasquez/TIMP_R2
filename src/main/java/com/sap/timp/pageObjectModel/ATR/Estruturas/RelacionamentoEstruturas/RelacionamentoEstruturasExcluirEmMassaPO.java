package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelacionamentoEstruturasExcluirEmMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement cboGrupo1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionGrupo1;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement cboEstrutura1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstrutura1;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement cboCamposEstrutura1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"Código da filial\"][1]")
	public WebElement opcionCamposEstruturas1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"UF da filial\"][1]")
	public WebElement opcionCamposEstruturas12;
	
	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement cboGrupo2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa/Filial 1\"][1]")
	public WebElement opcionGrupo2;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement cboEstrutura2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement opcionEstrutura2;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement cboCamposEstrutura2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"Código da filial\"][1]")
	public WebElement opcionCamposEstruturas2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"UF da filial\"][1]")
	public WebElement opcionCamposEstruturas22;
	
	@FindBy(xpath = "//div[contains(@class, \"from-date\")]/div/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	@FindBy(xpath = "//div[contains(@class, \"to-date\")]/div/div/div/input")
	public WebElement inputDataFimVigencia;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	String URL = driver.getCurrentUrl();
	String idPrimerRegistroCreado = "0";
	String idSegundoRegistroCreado = "0";
	
	public RelacionamentoEstruturasExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElementOverlay();
		relacionamentoEstruturas.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Ultimo Registro: " + idUltimoRegistro);
		System.out.println("");
		
		// Primer ingreso
		btnNovo.click();
		sleep(40400);
		
		waitExpectElement(cboGrupo1);
		cboGrupo1.click();
		sleep(3000);
		opcionGrupo1.click();
		sleep(3000);
		
		attributeToBeXpath("//div[@class=\"structure1-select\"]/div", "class", "base-select ");
		cboEstrutura1.click();
		sleep(3000);
		opcionEstrutura1.click();
		sleep(3000);
		
		cboCamposEstrutura1.click();
		sleep(3000);
		opcionCamposEstruturas1.click();
		sleep(3000);
		
		cboGrupo2.click();
		sleep(3000);
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			opcionGrupo2 = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa Filial\"][1]"));
		}
		opcionGrupo2.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@class=\"structure2-select\"]/div", "class", "base-select ");
		cboEstrutura2.click();
		sleep(3000);
		opcionEstrutura2.click();
		sleep(3000);
		
		cboCamposEstrutura2.click();
		sleep(3000);
		opcionCamposEstruturas2.click();
		sleep(3000);
		
		inputDataInicioVigencia.sendKeys("01/01/1974");
		sleep(3000);
		
		inputDataFimVigencia.sendKeys("01/01/1975");
		sleep(3000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idPrimerRegistroCreado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Primer Registro Creado: " + this.idPrimerRegistroCreado);
		System.out.println("");
		
		boolean sucesso = false;
		
		int id1 = convertToInt(idUltimoRegistro);
		int id2 = convertToInt(this.idPrimerRegistroCreado);
		
		if(id2 > id1) {
			System.out.println("Primer registro creado...");
			System.out.println("");
			sucesso = true;
		}else {
			System.out.println("No se pudo crear el primer registro...");
			System.out.println("");
			return sucesso;
		}
		
		// Segundo registro
		btnNovo.click();
		sleep(40400);
		sleep(40400);
		sleep(40400);
		
		waitExpectElement(cboGrupo1);
		cboGrupo1.click();
		sleep(3000);
		opcionGrupo1.click();
		sleep(3000);
		
		attributeToBeXpath("//div[@class=\"structure1-select\"]/div", "class", "base-select ");
		cboEstrutura1.click();
		sleep(3000);
		opcionEstrutura1.click();
		sleep(3000);
		
		cboCamposEstrutura1.click();
		sleep(3000);
		opcionCamposEstruturas12.click();
		sleep(3000);
		
		cboGrupo2.click();
		sleep(3000);
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			opcionGrupo2 = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa Filial\"][1]"));
		}
		opcionGrupo2.click();
		sleep(3000);
		
		attributeToBeXpath("//div[@class=\"structure2-select\"]/div", "class", "base-select ");
		cboEstrutura2.click();
		sleep(3000);
		opcionEstrutura2.click();
		sleep(3000);
		
		cboCamposEstrutura2.click();
		sleep(3000);
		opcionCamposEstruturas22.click();
		sleep(3000);
		
		inputDataInicioVigencia.sendKeys("01/01/1972");
		sleep(3000);
		
		inputDataFimVigencia.sendKeys("01/01/1973");
		sleep(3000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idSegundoRegistroCreado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Segundo Registro Creado: " + this.idSegundoRegistroCreado);
		System.out.println("");
		
		int id3 = convertToInt(this.idSegundoRegistroCreado);
		
		if(id3 > id2) {
			System.out.println("Segundo registro creado...");
			System.out.println("");
			sucesso = true;
		}else {
			System.out.println("No se pudo crear el primer registro...");
			System.out.println("");
		}
		
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!btnNovo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(this.idSegundoRegistroCreado);
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(5000);
		marcarCheckbox.click();
		sleep(5000);
		
		int idPenultimoUltimoRegistro = convertToInt(this.idPrimerRegistroCreado);
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		relacionamentoEstruturas.click();
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
