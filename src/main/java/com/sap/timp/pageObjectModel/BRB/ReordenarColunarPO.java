package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ReordenarColunarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"draggable-21\"]")
	public WebElement haciaE;
	
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	public ReordenarColunarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean reordenar() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();
		sleep(1000);
		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(1000);
		
		Actions actions = new Actions(driver);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);

		Point hacia = driver.findElement(By.xpath("//*[@id=\"draggable-193\"]")).getLocation();
		Point desde = driver.findElement(By.xpath("//*[@id=\"draggable-28\"]")).getLocation();

		int x = desde.x;
		int y = hacia.x;
		sleep(1000);
		
		
		actions.dragAndDropBy(mover,hacia.x, 0).perform();

		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");

		
		boolean movido = false;
		
		Point actual = driver.findElement(By.xpath("//*[@id=\"draggable-28\"]")).getLocation();
		System.out.println(actual);
		
		if(	x != actual.x) {
			movido = true;
		}
		
		sleep(2000);
		actions.dragAndDropBy(mover, -y, 0).perform();

		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		return movido;
	
	}
	
	
	
	

}
