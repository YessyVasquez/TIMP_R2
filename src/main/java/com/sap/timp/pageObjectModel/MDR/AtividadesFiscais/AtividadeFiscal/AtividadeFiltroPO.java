package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeFiltroPO extends TestBaseSteven {

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[1]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[1]")
	public WebElement atividadesO2;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;

	public AtividadeFiltroPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {

		String url = driver.getCurrentUrl();
		/*
		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {

			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		*/
		
		atividades.click();
		sleep(2000);
		atividadesO.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");


		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String actividadeFiscal = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(actividadeFiscal);

		sleep(6000);

		//String idRegistro = actividadeFiscal.getText();

		pesquisar.sendKeys(actividadeFiscal);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(idBusqueda);

		
		//String idBusqueda = actividadeFiscal.getText();

		boolean sucesso = actividadeFiscal.equals(idBusqueda);

		return sucesso;

	}

}
