package com.sap.timp.pageObjectModel.DFG.Leiautes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautesPublicos;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement tipoInformacoes;
	
	public ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean informacao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		raiz.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		leiautesPublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.click();
		sleep(2000);
		pesquisar.sendKeys("Teste automatizado");
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"][1]")).size();
		
		// Guardamos los datos necesarios
		String id = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		String tipo = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[9]/div")).getText();
		
		System.out.println("Datos de la tabla de busqueda");
		System.out.println("ID: " + id);
		System.out.println("Tipo: " + tipo);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tipo2 = tipoInformacoes.getText();
		
		System.out.println("");
		System.out.println("Datos de Informacoes");
		System.out.println("Tipo: " + tipo2);
		
		boolean sucesso = false;
		
		if (tipo2.equals(tipo)) {
			sucesso = true;
		}
		
		return sucesso;
	}
}
