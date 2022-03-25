package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegraDeCamposEditarPO extends TestBaseFernando {
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"rule-valid-from\"]/div/div/input")
	public WebElement inputValidadeDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	public RegraDeCamposEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputValidadeDe);
		attributoNotToBeEmptyElement(inputValidadeDe, "value");
		String inputValidadeValorOriginal = inputValidadeDe.getAttribute("value");
		System.out.println("Validade de original: " + inputValidadeValorOriginal);
		
		String valorNuevo = fechaManana();
		System.out.println("Valor nuevo a enviar: " + valorNuevo);
		
		inputValidadeDe.clear();
		inputValidadeDe.sendKeys(valorNuevo);
		sleep(1000);
		
		btnGravar.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();

		System.out.println("ID Registro: " + idRegistro);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputValidadeDe);
		attributoNotToBeEmptyElement(inputValidadeDe, "value");
		String inputValidadeValorEditado = inputValidadeDe.getAttribute("value");
		System.out.println("Validade de editado: " + inputValidadeValorEditado);
		
		boolean sucesso = false;
		
		if(inputValidadeValorEditado.equals(valorNuevo)) {
			System.out.println("Registro editado...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		return sucesso;
	}
}
