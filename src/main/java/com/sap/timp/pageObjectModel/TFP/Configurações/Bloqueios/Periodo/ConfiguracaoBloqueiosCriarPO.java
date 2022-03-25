package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracaoBloqueiosCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-box\")]/span/span[text()=\"Configurações\"]")
	public WebElement abaConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Bloqueios\"]")
	public WebElement bloqueios;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodUp\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Bloqueios de Período\"]")
	public WebElement btnNovaConfiguracaoBloqueios;
	
	@FindBy(xpath = "//div[@id=\"statusInput\"]/div/div/div[2]")
	public WebElement cboStatus;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"000 Indisponível\"]")
	public WebElement opcionStatus;
	
	@FindBy(xpath = "//div[@id=\"companyInput\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"ufInput\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"BA\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"branchInput\"]/div/div/div[2]")
	public WebElement cbofilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 / 0143\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement inputValidoDesde;
	
	@FindBy(xpath = "//div[@class=\"app-name droppable-tile-name\" and text()=\"BFB\"]")
	public WebElement itemBFB;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	public ConfiguracaoBloqueiosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloqueios.click();
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[2]/div")).getText();
		
		System.out.println("Id Ultimo Registro: " + idUltimoRegistro);
		System.out.println("");
		sleep(1000);
		
		btnNovaConfiguracaoBloqueios.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboStatus.click();
		sleep(1000);
		opcionStatus.click();
		closeSelectTypeCheckbox(cboStatus);
		sleep(1000);
		
		cboEmpresa.click();
		sleep(2000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"ufInput\"]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(8000);
		
	//	attributeToBeXpath("//div[@id=\"branchInput\"]/div", "class", "base-MultipleSelect3 required");
		cbofilial.click();
		sleep(1000);
		opcionFilial.click();
		closeSelectTypeCheckbox(cbofilial);
		sleep(2000);
		
		inputValidoDesde.sendKeys("01/01/2001");
		sleep(2000);
		
		moveToElement(itemBFB, driver.findElement(By.xpath("//div[@id=\"list-r-elements-wrapper\"]")));
		sleep(2000);
		
		WebElement accesarBfb = driver.findElement(By.xpath("//div[contains(@aria-label, \"Accesar o BFB\") and @class=\"tr\" and @tabindex=\"0\"]/div"));
		Actions  actions = new Actions(driver);
		actions.doubleClick(accesarBfb).perform();
		sleep(1000);
		
		btnAplicar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistroGuardado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[2]/div")).getText();
		
		System.out.println("Id Ultimo Registro despues de guardar: " + idUltimoRegistroGuardado);
		System.out.println("");
		sleep(1000);
		
		int id1 = convertToInt(idUltimoRegistro);
		int id2 = convertToInt(idUltimoRegistroGuardado);
		
		boolean sucesso = false;
		
		if(id2 > id1) {
			sucesso = true;
			idInserir1(idUltimoRegistroGuardado);
			System.out.println("Registro creado...");
		}else {
			System.out.println("No se creo el registro...");
		}
		
		return sucesso;
	}
}
