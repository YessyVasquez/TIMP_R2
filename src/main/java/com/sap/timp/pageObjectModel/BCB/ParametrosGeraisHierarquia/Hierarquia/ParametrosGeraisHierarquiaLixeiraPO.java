package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisHierarquiaLixeiraPO extends TestBaseKenssy {

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
	public WebElement pastaLexeiraH;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simExcluir;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	
	
	public ParametrosGeraisHierarquiaLixeiraPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean lixeiraHierarquia() {
		sleep(2000);
		hierarquias.click();
		sleep(1100);
		
		pastaLexeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter1();
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idRegistro);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		System.out.println("Registro que cree: "+idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluirH.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(pastaLexeiraH);
		sleep(6000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String id2 = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		
//		pesquisar.sendKeys(idRegistro);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		String id2 = driver.findElement(By.xpath("//div[@class=\"tr-no-data\"]/div[@class=\"td\"]")).getText();
		System.out.println(id2);
		
		boolean sucesso = false;
		//cadena1.equals(cadena2)
		if (id2 != idRegistro  ) {
			sucesso= true;
		}else {
			sucesso= false;
		}
		
		return sucesso;
		
		
		
		
		
	}
}
