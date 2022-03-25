package com.sap.timp.pageObjectModel.MDR.CEP.Logradouro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LogradouroFiltrosPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Logradouro\"]")
	public WebElement logradouro;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public LogradouroFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logradouroFiltros() {
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		logradouro.click();
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		String idRegistro = id.getText();

		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[2]/label/span");
		invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		
		String idBusqueda = id.getText();

		
		boolean sucesso = idBusqueda.equals(idRegistro);
		
		return sucesso;
		
	}
}
