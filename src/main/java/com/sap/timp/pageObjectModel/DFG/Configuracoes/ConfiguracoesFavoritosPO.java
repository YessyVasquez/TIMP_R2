package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracoesFavoritosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-Display-and-Setting icon-setting padding-right \"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz1;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"id\"]/div/div/input")
	public WebElement inputId;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-setting\"]")
	public WebElement minhasConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-favorite-setting\"]")
	public WebElement meusFavoritos;
	
	public ConfiguracoesFavoritosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean favoritos() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		configuracoes.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(raiz2);
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		System.out.println("ID Registro: " + idRegistro);
		sleep(1000);
		
	/*	btnFiltrosAvanzados.click();
		sleep(2000);*/
		waitExpectElement(btnFiltrosAvanzados);
		
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
		
		minhasConfiguracoes.click();
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
