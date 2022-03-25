package com.sap.timp.pageObjectModel.TPC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParâmetrosGeraisAprovarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//*[@id=\"right-content\"]/div/div[1]/div/div/ul/li[3]/button/span")
	public WebElement check;
	
	
	
	
	public ParâmetrosGeraisAprovarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean aprovado(){

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		String idRegistro = idObter4();

		WebElement seleccion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[2]/label/span"));
		
		String status1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[12]/div")).getText();
		System.out.println("status Inicial: " + status1);
		

		seleccion.click();
		sleep(2000);
		check.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnFechar.click();
		sleep(2000);
		sleep(7000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(7000);
		
		waitExpectElement(btnPrimeraPagina);
		sleep(2000);
		String status2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[12]/div")).getText();
		System.out.println("status final: " + status2);
		
		
		boolean sucesso = false;
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (status2 == "APROVADO") { 
			sucesso = true; 
		}else {
			sucesso = false; 
		}
		
		return sucesso;
	}

}
