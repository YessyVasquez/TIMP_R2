package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigoFatosContabeisExluirPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Código dos Fatos Contábeis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public CodigoFatosContabeisExluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluirCodigoFatosContabeis() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("CodigoFatosContabeis");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		waitExpectElement(btnAceitar);
		sleep(2000);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToInt(idUltimo);
		double id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
