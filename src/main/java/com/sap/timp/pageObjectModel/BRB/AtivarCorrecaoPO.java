package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivarCorrecaoPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[contains(@class,\"nf-correction-btn\")]")
	public WebElement correcao;
	
	@FindBy(xpath = "//*[@id=\"draggable-126\"]")
	public WebElement mostrado;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[5]/button/span[2]")
	public WebElement ativo;	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[contains(@class,\"nf-correction-done-btn\")]")				
	public WebElement check;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	
	public AtivarCorrecaoPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> comentaroAtivo() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(3000);
		
		List<WebElement> campo = driver.findElements(By.xpath("//*[@id=\"draggable-126\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (campo.size() > 0) {
			
			correcao.click();
			
			sleep(2000);
			
			
			
			if (mostrado.isDisplayed() == true) {
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			
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
			
			
			if (check.isDisplayed() == true) {
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
				
			
			
		}else {
			
			
			correcao.click();
			sleep(2000);
			sim.click();
			sleep(1000);
			
			sleep(2000);
		

			if (mostrado.isDisplayed() == true) {
				sucesso.add(true);
	
			} else {
				sucesso.add(false);
		
			}

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

			if (check.isDisplayed() == true) {
				sucesso.add(true);
				
			} else {
				sucesso.add(false);
				
			}

		
		}
		
	
		
		
		return sucesso;
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
