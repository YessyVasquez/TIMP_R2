package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ExportarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[9]/button")
	public WebElement exportar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"radiobutton\"]/div[2]/label/span")
	public WebElement xlsx;

	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]")
	public WebElement descargado;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[4]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	public WebElement nao;
	
	
	
	public ExportarPO() {

		PageFactory.initElements(driver, this);
	}

	
	
	public boolean exportarCSV() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");

		executar.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
		exportar.click();
		sleep(2000);
		
		aceitar.click();
		
		boolean sucesso = false;
		waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(3000);
		if (descargado.isDisplayed() == true) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
	}
	
	
	public boolean exportaXSLX() {
		sleep(3000);
		exportar.click();
		sleep(2000);
		xlsx.click();
		sleep(2000);
		aceitar.click();
		boolean sucesso = false;
		waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(3000);
		if (descargado.isDisplayed() == true) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		biblioteca.click();
		sleep(3000);
		nao.click();
		
		waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div");
		sleep(3000);
		return sucesso;
		
	}

}
