package com.sap.timp.pageObjectModel.TFP.Configurações.Status.Periodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguracoesStatusPeriodoCopiarPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Status\"]/div/span[2]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodStatusList\"]/div/span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"6000\"]")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement estado;
	@FindBy(xpath = "//div[@id=\"MA\"]")
	public WebElement estadoOPC;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@id=\"0031-BA-3000\"]")
	public WebElement filialOpc;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public ConfiguracoesStatusPeriodoCopiarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void copiar() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
}
