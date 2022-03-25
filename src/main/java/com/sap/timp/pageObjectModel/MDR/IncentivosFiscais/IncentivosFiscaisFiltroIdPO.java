package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class IncentivosFiscaisFiltroIdPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-cadastroIncentivosFiscais\")]/div/span[2]")
	public WebElement subIncentivosFiscais;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputBuscar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBuscado;
	

	public IncentivosFiscaisFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean FiltrarIncentivosFiscaisId() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		incentivosFiscais.click();
		sleep(2000);
		
		subIncentivosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputBuscar.sendKeys(idBuscado.getText());
		inputBuscar.sendKeys(Keys.ENTER);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String success = idBuscado.getText();
		boolean dato= success.contains(idBuscado.getText());
		System.out.println(success);
		
		return dato;
		
		
	
	}
	
	
}




