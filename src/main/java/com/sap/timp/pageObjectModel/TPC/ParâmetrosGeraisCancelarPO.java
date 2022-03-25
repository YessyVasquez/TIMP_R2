package com.sap.timp.pageObjectModel.TPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParâmetrosGeraisCancelarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//*[@id=\"right-content\"]/div/div[1]/div/div/ul/li[3]/button/span")
	public WebElement check;
	
	
	
	
	public ParâmetrosGeraisCancelarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean cacelado(){

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div/ul/li/span[text()=\"Cancelar\"]"));
		
		String status1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[12]/div")).getText();
		System.out.println("status Inicial: " + status1);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		btnSim.click();
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
