package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosPesquisarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public RelatorioRefinariaGeradosPesquisarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> pesquisar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String nomePesquuisa = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println("Nome pesquisa: " + nomePesquuisa);
		
		int rowsGeneral = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows general: " + rowsGeneral);
		
		pesquisar.click();
		sleep(1000);
		pesquisar.sendKeys(nomePesquuisa);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows pesquisa: " + rows);
		
		int j = 1;
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		String nome = "";
		
		for(int i = 0; i < rows; i++) {
			nome = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+j+"]/div[4]/div")).getText();			
			sucesso.add(nome.contains(nomePesquuisa));
		}
		
		pesquisar.clear();
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rowsGeneral2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
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
