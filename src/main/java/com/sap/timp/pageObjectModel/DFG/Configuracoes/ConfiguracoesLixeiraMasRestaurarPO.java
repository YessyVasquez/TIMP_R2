package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracoesLixeiraMasRestaurarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-Display-and-Setting icon-setting padding-right \"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[1]/div/div[1]")
	public WebElement raiz;
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"id\"]/div/div/input")
	public WebElement inputId;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiarFiltros;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public ConfiguracoesLixeiraMasRestaurarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean lixeiraMasRestaurar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		configuracoes.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(raiz);
		raiz.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		System.out.println("ID Registro: " + idRegistro);
		sleep(1000);
		
	/*	btnFiltrosAvanzados.click();
		sleep(2000);*/
		waitExpectElement(btnFiltrosAvanzados);
		//inputId.click();
		sleep(1000);
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		no.click();
		sleep(3000);
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		limpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		waitExpectElement(pesquisar);
		pesquisar.clear();
	//	inputId.click();
		sleep(1000);
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Restaurar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		limpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

	//	waitExpectElement(inputId);
		pesquisar.clear();
	//	inputId.click();
		sleep(1000);
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
