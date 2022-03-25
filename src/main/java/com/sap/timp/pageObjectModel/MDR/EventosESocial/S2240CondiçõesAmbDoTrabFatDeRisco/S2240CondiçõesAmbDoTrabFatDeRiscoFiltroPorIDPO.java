package com.sap.timp.pageObjectModel.MDR.EventosESocial.S2240CondiçõesAmbDoTrabFatDeRisco;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO extends TestBaseKenssy {
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-riskFactor\"]")
	public WebElement subMenuCondicoesAmbDo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputBuscar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBuscado;
	
	
	
	
	
	
	public S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean filtroPorId() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);

		subMenuCondicoesAmbDo.click();
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
