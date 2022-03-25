package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatoriosRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustment-table\"]/div/div[2]/div/div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//div[@class=\"adjustment-list-dialog\"]/div/div/div[2]/div/div/div/input")
	public WebElement pesquisar;
	
	public RRGConfiguracaoDeAjustePresquisaPorIDOuCodigoDeAjustePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> pesquisar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatoriosRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnAjuste.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idPesquisa = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("ID pesquisa: " + idPesquisa);
		
		int rowsGeneral = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows general: " + rowsGeneral);
		
		pesquisar.click();
		sleep(1000);
		pesquisar.sendKeys(idPesquisa);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idPesquisado = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("ID pesquisado Resultado: " + idPesquisado);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(convertToInt(idPesquisado) == convertToInt(idPesquisa)) {
			System.out.println("Resultado confirmado con ID Pesquisado...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo el resultado");
			sucesso.add(false);
			return sucesso;
		}
		
		pesquisar.clear();
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		// Pesquisar por codigo de ajuste
		String codigoDeAjuste = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		System.out.println("Codigo de Ajuste pesquisado: " + codigoDeAjuste);
		
		pesquisar.click();
		sleep(1000);
		pesquisar.sendKeys(codigoDeAjuste);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);		
		
		int rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows pesquisados  codigo de ajuste: " + rows);
		
		int j = 1;
		
		String codigo = "";
		
		for(int i = 0; i < rows; i++) {
			codigo = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+j+"]/div[4]/div")).getText();			
			sucesso.add(codigo.contains(codigoDeAjuste));
		}
		
		pesquisar.clear();
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rowsGeneral2 = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows general despues de limpiar pesquisar: " + rowsGeneral2);
		
		if(rowsGeneral2 == rowsGeneral) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	} 
}
