package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class RegrasPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[contains(@class,\"add-column\")]/div/div/div")
	public WebElement agregar;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div")
	public WebElement regraC;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement atribuirRegra;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement selecionRegra;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement proximo;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	
	public RegrasPO() {
	
		PageFactory.initElements(driver, this);
	}
	

	
	public boolean regra() {
		
		WebDriverWait wait = new WebDriverWait(driver, 7000);
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);
		
		menu.click();

		opcao.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		agregar.click();
		sleep(1000);
		regraC.click();
		sleep(1000);
		atribuirRegra.click();
		
		waitExpectXpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span");
		sleep(1000);
		selecionRegra.click();
		sleep(1000);
		
		String reglaT = driver.findElement(By.xpath("//div[@class=\"tbody\"]/div[@class=\"tr\"]/div[3]/div")).getText();
		
		
		proximo.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/textarea")));
		sleep(2000);
		proximo.click();
		
		waitExpectXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label/span");
		sleep(1000);
		proximo.click();
		
		sleep(5000);
		
		gravar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(3000);
		
		execucao.click();
		
		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		executar.click();
		
		
		sleep(2000);
		waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

	
		boolean sucesso = driver.findElement(By.xpath("//div[contains(@aria-label,\"Regra\")]")).isDisplayed();

		
		return sucesso;
		
		
		
		
		
		
	}
	
	
	
	
}
