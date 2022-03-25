package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1250DetNotaFiscalExcluirPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-eSocialEvents\"]")
	public WebElement eventosESocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ruralProductionAcquisition\"]")
	public WebElement s1250AquisicaoDeProducaoRural;
	
	@FindBy(xpath = "//span[text()=\"Det Nota Fiscal\"]")
	public WebElement abaDetNotaFiscal;
	
	@FindBy(xpath = "//div[@id=\"fiscal-note-det-list\"]/div/div[2]/div/div[1]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public S1250DetNotaFiscalExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
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
		
		String idRegistro = idObter("S1250DetNotaFiscal");		
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		invisibilityOfElementOverlay();
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaDetNotaFiscal.click();
		invisibilityOfElementOverlay();
		
		actionsMoveToElementElement(btnPrimeraPagina);
		btnPrimeraPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[@id=\"fiscal-note-det-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID Primer registro despues de excluir: " + id);
		}
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(id);
		
		boolean sucesso = false;
		
		if(id2 != id1) {
			System.out.println("Registro eliminado...");
			sucesso = true;
		}else {
			System.out.println("No se pudo excluir el registro...");
		}
		
		return sucesso;
	}
}
