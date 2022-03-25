package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SubPeriodoFiltroIdPO extends TestBaseMassiel {
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Sub-Período\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//span[text()=\"Bloqueios\"]")
	public WebElement bloqueio;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;

	
	public SubPeriodoFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtro() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloqueio.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = id.getText();
		
		System.out.println(" Id Registro: " + idRegistro );
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idBusqueda = id.getText();
		System.out.println(" Id Busqueda: " + idBusqueda  );
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add( idBusqueda.equals(idRegistro));
	
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows2 > rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		
		return sucesso;

	}
		
		
}
