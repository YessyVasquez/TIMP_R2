package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegraDeCamposCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Atribuição Regra\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"rule-type\"]/div/div/div[2]")
	public WebElement cboTipoDeRegra;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Regra de Campos\"]")
	public WebElement opcionTipoDeRegra;
	
	@FindBy(xpath = "//div[@id=\"rule-tax\"]/div/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"rule-company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"rule-state\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"rule-branch\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 - 0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"rule-type-1\"]/div/div/div[2]")
	public WebElement cboRegraDeAbas;
	
	@FindBy(xpath = "//div[@id=\"rule-rule\"]/div/div[2]")
	public WebElement cboRegras;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @id and @tabindex=\"0\"][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"rule-valid-from\"]/div/div/input")
	public WebElement inputValidadeDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	public RegraDeCamposCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElementOverlay();
		abaAtribucoesDeRegras.click();
		invisibilityOfElementOverlay();
		
		icms.click();
		sleep(2000);
		
		regrasDeCampos.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		
		waitExpectElement(cboTipoDeRegra);
		cboTipoDeRegra.click();
		sleep(1000);
		opcionTipoDeRegra.click();
		sleep(1000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		attributeToBeXpath("//div[@id=\"rule-state\"]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			opcionUf = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"AL\"]"));
		}
		
		sleep(2000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(1000);
		
		actionsMoveToElementElement(inputValidadeDe);
		attributeToBeXpath("//div[@id=\"rule-branch\"]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			opcionFilial = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"1000 - 0008\"]"));
		}
		
		sleep(2000);		
		opcionFilial.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		waitExpectElement(cboRegraDeAbas);
		cboRegraDeAbas.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboRegras.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		inputValidadeDe.sendKeys(fechaActual());
		sleep(1000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		sleep(4000);

		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistro = "0"; // Ultimo ID despues de crear
		
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro Creado: " + idRegistro);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		
		if(id2 > id1) { 
			System.out.println("Registro creado...");
			sucesso = true;
			idInserir("RegraDeCampos",idRegistro);
		}else {
			System.out.println("No se pudo crear el registro...");
		}
		
		return sucesso;
	}
}
