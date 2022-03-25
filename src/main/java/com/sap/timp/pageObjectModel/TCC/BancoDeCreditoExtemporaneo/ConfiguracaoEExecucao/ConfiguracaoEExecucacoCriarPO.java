package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucacoCriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Banco de Crédito Extemporâneo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and @id and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement cboTipoImposto;
	
	@FindBy(xpath = "//div[@id=\"taxTypeDetail\"]/div/div/div[2]")
	public WebElement cboDetalheTipoImposto;
	
	@FindBy(xpath = "//div[@id=\"idFluxoBpma\"]/div/div[2]/div/div[2]")
	public WebElement cboIdDeFluxoBpma;
	
	@FindBy(xpath = "//div[@id=\"initialDate\"]/div/div/input")
	public WebElement inputInicioVigencia;
	
	@FindBy(xpath = "//div[@class=\"fields-line\"][6]/div/button")
	public WebElement btnDestacado1;
	
	@FindBy(xpath = "//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id][1]/div/label/span")
	public WebElement marcarFlagDestacado1;
	
	@FindBy(xpath = "//button[text()=\"Selecionar\"]")
	public WebElement btnSeleccionar;
	
	@FindBy(xpath = "//div[@class=\"fields-line\"][7]/div/button")
	public WebElement btnDestacado2;
	
	@FindBy(xpath = "//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id][1]/div/label/span")
	public WebElement marcarFlagDestacado2;
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement cboTipo;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[contains(@class, \"list-option\")][1]/div/div")
	public WebElement opcionCombo2;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	String URL = driver.getCurrentUrl();
	
	public ConfiguracaoEExecucacoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElementOverlay();
		bancoCreditoExtemporaneo.click();
		sleep(1000);
		
		configuracaoEExecucao.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cboEmpresa);
		cboEmpresa.click();
		sleep(1000);
		opcionCheckbox.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		cboUf.click();
		sleep(1000);
		opcionCheckbox.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(10000);
		
		//attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		cboFilial.click();
		sleep(1000);
		opcionCheckbox.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(5000);
		
		attributeToBeXpath("//div[@id=\"taxType\"]/div", "class", "base-select required");
		sleep(2000);
		cboTipoImposto.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboDetalheTipoImposto.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboIdDeFluxoBpma.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(1000);
		
		inputInicioVigencia.sendKeys(fechaActual());
		sleep(1000);
		
		btnDestacado1.click();
		invisibilityOfElementOverlay();
		
		waitExpectElement(marcarFlagDestacado1);
		marcarFlagDestacado1.click();
		sleep(1000);
		btnSeleccionar.click();
		sleep(2000);
		
		btnDestacado2.click();
		invisibilityOfElementOverlay();
		
		waitExpectElement(marcarFlagDestacado2);
		marcarFlagDestacado2.click();
		sleep(1000);
		btnSeleccionar.click();
		sleep(2000);
		
		cboTipo.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnSim);
		btnSim.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		waitExpectElement(btnUltimaPagina);
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroNuevo = "0"; // Ultimo ID despues de crear un registro
		
		if(rows > 0) {
			idRegistroNuevo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro despues de crear: " + idRegistroNuevo);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistroNuevo);
		
		if(id2 > id1) {
			System.out.println("Registro creado satisfactoriamente...");
			sucesso = true;
			idInserir("idConfiguracaoEExecucaco",idRegistroNuevo);
			//idInserir4(idRegistroNuevo);
		}else {
			System.out.println("No se pudo crear el registro...");
		}
		
		return sucesso;
	}
}
