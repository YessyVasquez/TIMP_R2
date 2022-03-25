package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1250DetNotaFiscalCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-eSocialEvents\"]")
	public WebElement eventosESocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ruralProductionAcquisition\"]")
	public WebElement s1250AquisicaoDeProducaoRural;
	
	@FindBy(xpath = "//span[text()=\"Det Nota Fiscal\"]")
	public WebElement abaDetNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Novo Det Nota Fiscal\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"fiscal-note-det-list\"]/div/div[2]/div/div[1]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//div[@id=\"eventOption\"]/div/div[2]")
	public WebElement cboIdDoEvento;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and contains(@class, \"list-item\")][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"recordId\"]/div/div/input")
	public WebElement inputIdDoRegistro;
	
	@FindBy(xpath = "//div[@id=\"parentId\"]/div/div/input")
	public WebElement inputIdPrincipal;
	
	@FindBy(xpath = "//div[@id=\"series\"]/div/div/input")
	public WebElement inputSerie;
	
	@FindBy(xpath = "//div[@id=\"invoiceNumber\"]/div/div/input")
	public WebElement inputNumeroDaNotaFiscal;
	
	@FindBy(xpath = "//div[@id=\"invoiceIssueDate\"]/div/div/input")
	public WebElement inputDataEmissaoDaNotaFiscal;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public S1250DetNotaFiscalCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElementOverlay();
		eventosESocial.click();
		sleep(1000);
		
		s1250AquisicaoDeProducaoRural.click();
		invisibilityOfElementOverlay();
		
		abaDetNotaFiscal.click();
		invisibilityOfElementOverlay();
		
		actionsMoveToElementElement(btnPrimeraPagina);
		btnPrimeraPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID Primer registro: " + id);
		}
		
		actionsMoveToElementElement(btnNovo);
		btnNovo.click();
		sleep(2000);
		
		waitExpectElement(cboIdDoEvento);
		cboIdDoEvento.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		inputIdDoRegistro.sendKeys("1");
		sleep(1000);
		
		inputIdPrincipal.sendKeys("1");
		sleep(1000);
		
		inputSerie.sendKeys("1");
		sleep(1000);
		
		inputNumeroDaNotaFiscal.sendKeys("1");
		sleep(1000);
		
		inputDataEmissaoDaNotaFiscal.sendKeys(fechaActual());
		sleep(1000);
		
		btnAceitar.click();
		invisibilityOfElementOverlay();
		
		actionsMoveToElementElement(btnPrimeraPagina);
		btnPrimeraPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroNuevo = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			idRegistroNuevo = driver.findElement(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID registro nuevo: " + idRegistroNuevo);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistroNuevo);
		
		if(id2 > id1) {
			System.out.println("Registro creado...");
			sucesso = true;
			idInserir("S1250DetNotaFiscal",idRegistroNuevo);
		}else{
			System.out.println("No se ha creado el registro...");
		}
		
		return sucesso;
	}
}
