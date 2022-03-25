package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegraDeCamposExcluirPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public RegraDeCamposExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		invisibilityOfElementOverlay(); 
		abaAtribucoesDeRegras.click();
		invisibilityOfElementOverlay();
		
		icms.click();
		sleep(2000);
		
		regrasDeCampos.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		sleep(1000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistro = "0"; // Ultimo ID despues de excluir
		
		if(rows > 0) {
			idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro despues de excluir: " + idUltimoRegistro);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idUltimoRegistro);
		
		if(id2 != id1) {
			System.out.println("Registro excluido...");
			sucesso = true;
		}else {
			System.out.println("No se pudo excluir el registro...");
		}
		
		return sucesso;
	}
}
