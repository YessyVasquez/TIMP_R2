package com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FatorCreditamentoFiltrosPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Fator de Creditamento do CIAP\"]")
	public WebElement fatorCrecimento;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[3]/div")
	public WebElement id;
	//*[@id="list"]/div/div/div[1]/div/div[3]/div[1]/div[3]
	//*[@id="list"]/div/div/div[1]/div/div[3]/div[1]/div[3]/div
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public FatorCreditamentoFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean fatorCrecimentoFiltros() {
		centralização.click();
		sleep(1000);
		fatorCrecimento.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);

		//waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		//invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		String idRegistro = id.getText();

		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		//waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[2]/label/span");
		//invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idBusqueda = id.getText();
		
		boolean sucesso = idBusqueda.equals(idRegistro);
		
		return sucesso;
	}
}
