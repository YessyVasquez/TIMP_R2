package com.sap.timp.pageObjectModel.BRB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EliminarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[1]/div/div/ul/li[4]/button")
	public WebElement opcaoE;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcaoEditar;
					
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[8]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]")
	public WebElement excluir;

	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li[1]/div/span[3]")
	public WebElement cerrar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	public WebElement nao;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[4]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[2]/div/div[2]/div/label/span")
	public WebElement check;
	
	@FindBy(xpath = "//span[text()=\"Relatórios\"]")
	public WebElement relatorios;
	
	
	public EliminarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean eliminar() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		menu.click();
		opcaoEditar.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(3000);
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		relatorios.click();
		
		invisibilityOfElementOverlay();

		
		check.click();
		sleep(2000);
		opcaoE.click();
		sleep(2000);	
		
		
		waitExpectElement(sim);
		sim.click();
		
		invisibilityOfElementOverlay();
		
		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		boolean sucesso = driver.findElement(By.xpath("//div[contains(@class,\"tr-no-data\")]/div")).isDisplayed();
		
		return sucesso;
		
			
	}
	
	public boolean eliminarLixeira() {
		
		sleep(3000);
	
		lixeira.click();
		
		invisibilityOfElementOverlay();

		lixeira.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
	
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		check.click();
		sleep(2000);
		opcaoE.click();
		sleep(2000);	
		
		waitExpectElement(sim);
		sim.click();
		
		invisibilityOfElementOverlay();
		
		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = driver.findElement(By.xpath("//div[contains(@class,\"tr-no-data\")]/div")).isDisplayed(); 
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,\"tr-no-data\")]/div")).isDisplayed());
		
		return sucesso;
			
	}
	
	

}
