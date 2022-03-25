package com.sap.timp.pageObjectModel.BRB;



import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sap.timp.base.TestBaseSteven;

public class PaginacionPO extends TestBaseSteven{
	
	//Página siguiente
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][1]")
	public WebElement ps;
	
	//Página Anterior
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement pa;
	
	//Página Final
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement pf;
	
	//Página Inicial
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement pi;
		
	
	//Inserir Número
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[10]/div/div/input")
	public WebElement numero;
	
	
	@FindBy(xpath="//div[@class=\"totalPages\"]/input")
	public WebElement totalPAges;
	
	@FindBy(xpath = "//div[@class=\"actualPage\"]/div/div/input")
	public WebElement actualPage;
	
	@FindBy(xpath = "//span[text()=\"Relatórios de Outputs\"]")
	public WebElement output;
	
	
	public PaginacionPO() {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	
	public String paginacionPS() {
		
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		output.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ps.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
				
		actionsMoveToElementXpath("//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[10]/div/div");
		
		String psV = actualPage.getAttribute("value");
		System.out.println(psV);
		
		return psV;
			
		
	}
	
	public String paginacionPA() {
	
		sleep(3000);

		pa.click();

		waitExpectXpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		actionsMoveToElementXpath("//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[10]/div/div");

		String paV = actualPage.getAttribute("value");
		System.out.println(paV);

		return paV;
			
		
	}
	
	public String paginacionPF() {
		
		
		sleep(3000);
	
		pf.click();
		

		waitExpectXpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		
		actionsMoveToElementXpath("//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[7]");
		String pfV = actualPage.getAttribute("value");

		return pfV;
			
		
	}

	public String paginacionPI() {
		
		sleep(3000);
		
		pi.click();
		
		waitExpectXpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		
		actionsMoveToElementXpath("//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[3]");
		String piV = actualPage.getAttribute("value");
	
		return piV;
			
		
	}
	
	
	public String numero() {
		sleep(3000);
		numero.clear();
		sleep(1000);
		numero.sendKeys("1");
		numero.sendKeys(Keys.ENTER);
	
		waitExpectXpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		
		actionsMoveToElementXpath("//*[@id=\"right\"]/div/div[5]/div/div[2]/div/div[5]");
		String pbV = actualPage.getAttribute("value");

	
		return pbV;
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
