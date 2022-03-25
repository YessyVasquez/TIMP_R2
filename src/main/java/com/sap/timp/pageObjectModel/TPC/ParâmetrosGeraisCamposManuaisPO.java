package com.sap.timp.pageObjectModel.TPC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParâmetrosGeraisCamposManuaisPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[4]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/table/tbody/tr/td[2]/div/div/input")
	public WebElement juros;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[2]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnManuais;
	
	@FindBy(xpath = "//*[@id=\"right-content\"]/div/div[1]/div/div/ul/li[3]/button/span")
	public WebElement check;
	
	
	
	
	public ParâmetrosGeraisCamposManuaisPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean manuais(){

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		String idRegistro = idObter4();

		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div/ul/li[5]/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		btnManuais.click();
		sleep(2000);
		
		juros.sendKeys("123456");
		sleep(1000);
		btnAceitar.click();
		sleep(3000);
		
		btnGravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(7000);
		
		waitExpectElement(btnPrimeraPagina);
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div/ul/li[5]/span[text()=\"Editar\"]"));
			
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		btnManuais.click();
		sleep(2000);
		
		String camposManuais = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/table/tbody/tr/td[2]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("JUROS: " +camposManuais);
		boolean sucesso = false;
				  
		if (camposManuais == "1.234,56") { 
			sucesso = true; 
		}else {
			sucesso = false; 
		}
		
		return sucesso;
	}

}
