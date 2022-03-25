package com.sap.timp.pageObjectModel.MDR.RateiroConsorcio;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RateiroConsorcioPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"Rateio de Consórcio\"]")
	public WebElement rateiro;
	
	@FindBy(xpath = "//span[text()=\"Novo Rateio de Consórcio\"]")
	public WebElement novorareiro;
	
	@FindBy(xpath ="//input[@placeholder=\"Selecione Empresa Consórcio\"]")
	public WebElement EmpresaConsorcio;
	
	@FindBy(xpath ="//div[@id=\"option-3\"]")
	public WebElement nombreEmpresaConsorcio;
	
	@FindBy(xpath =  "//textarea[@placeholder=\"Preencher CNPJ\"]")
	public WebElement CNPJ;
	
	@FindBy(xpath = "//body")
	public WebElement clickfuera;
	
	@FindBy(xpath = "//span[text()=\"Nova Empresa Consorciada\"]")
	public WebElement nuevaempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Empresa Consorciada \"]")
	public WebElement empresaconsorciadanovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Empresa Consorciada \"]")
	public WebElement click;
	
	@FindBy(xpath = "//li[@id=\"1000\"]")
	public WebElement numeroempresa;
	
	
	
	
	
	public  RateiroConsorcioPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void Criar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rateiro.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novorareiro.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		EmpresaConsorcio.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombreEmpresaConsorcio.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		//*[@id=\"rbtCode\"]/div/label/span
		CNPJ.sendKeys("98676217");invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		nuevaempresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresaconsorciadanovo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		click.sendKeys(Keys.ENTER);
	    sleep(2000);
	    
	    nuevaempresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	    
		
		
		
	     
		
		
		
		
		
		
		
	}
}
