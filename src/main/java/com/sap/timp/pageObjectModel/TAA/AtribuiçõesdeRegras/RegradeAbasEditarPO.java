package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeAbasEditarPO extends TestBaseSteven {
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement AtribuiçõesdeRegras;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[1]/div/span[2]")
	public WebElement ICMS;
	
	@FindBy(xpath = "//span[text()=\"Regras de Abas\"]")
	public WebElement RegrasdeAbas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//*[@id=\"rule-valid-from\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public RegradeAbasEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
 
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AtribuiçõesdeRegras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ICMS.click();
		sleep(2000);
		
		RegrasdeAbas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String idRegistro = idObter("RegradeAbas");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String valorDescricao = "13/01/2021";
		System.out.println("Fecha Nueva: " + valorDescricao);
		
		validaDe.clear();
		validaDe.sendKeys(valorDescricao);
		sleep(3000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(10000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(25000);
		
		AtribuiçõesdeRegras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ICMS.click();
		sleep(2000);
		
		RegrasdeAbas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu2.click();
		sleep(1000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(validaDe, "value");
		String valorDescricaoGuardado = validaDe.getAttribute("value");
		System.out.println("");
		System.out.println("Descricao valor guardado: " + valorDescricaoGuardado);
		  
		boolean sucesso = false;
		
		if(valorDescricaoGuardado.equals(valorDescricao)) {
			System.out.println("");
			System.out.println("Valor editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al prencher descricao...");
		}
		
		return sucesso;
	}
	
}
