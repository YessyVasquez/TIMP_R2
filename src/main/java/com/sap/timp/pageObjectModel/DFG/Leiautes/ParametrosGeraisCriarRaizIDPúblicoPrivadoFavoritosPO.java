package com.sap.timp.pageObjectModel.DFG.Leiautes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-layout\"]")
	public WebElement meusLeiautes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-layout\"]")
	public WebElement meusFavoritos;
	
	public ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean favoritos() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		raiz.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		sleep(1000);
		
		pesquisar.click();
		sleep(2000);
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement favorito = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[3]/span"));
		sleep(4000);
		
		favorito.click();
		sleep(3000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		meusLeiautes.click();
		sleep(1000);
		meusFavoritos.click();
		sleep(1000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.click();
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"][1]")).size();
		System.out.println("Rows: " + rows);
		String idBusqueda = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		
		int id = convertToInt(idRegistro);
		int id2 = convertToInt(idBusqueda);
		
		if(id2 ==  id) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
}
