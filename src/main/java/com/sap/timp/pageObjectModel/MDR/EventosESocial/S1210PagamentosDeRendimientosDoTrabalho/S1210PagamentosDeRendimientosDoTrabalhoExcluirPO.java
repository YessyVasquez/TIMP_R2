package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1210PagamentosDeRendimientosDoTrabalhoExcluirPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-paymentsIncomeFromWork\"]")
	public WebElement subMenuPagamentosDeRendimientosDoTrabalho;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public S1210PagamentosDeRendimientosDoTrabalhoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuPagamentosDeRendimientosDoTrabalho.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1210PagamentosDeRendimientosDoTrabalho");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		System.out.println(idRegistro); // Primer registro que es el que se crea con la automatizacion
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		waitExpectElement(btnSim);
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idPrimero = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		String[] idArray = idPrimero.split("_");
		String idRegistroPrimero = idArray[3];
		
		int id1 = convertToInt(idRegistroPrimero);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(id1); // Primer registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
