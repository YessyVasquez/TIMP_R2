package com.sap.timp.pageObjectModel.TDK.Dashboard.Lixeira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DashboardLixeiraExcluirEmMassaPO extends TestBaseMassiel{
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[3]/ul/li[3]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;	
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item   \"][2]/button/span")
	public WebElement excluirMassa;
	
	
	
	public  DashboardLixeiraExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean comparar() {
		String idRegistro11 =idObter("DashboardLixeiraEmMassa1");
		String idRegistro22 =idObter("DashboardLixeiraEmMassa2");

		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
	
		
		boolean sucesso = false;
		
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		double idRegistroD11 = convertToDouble(idRegistro11);
		double idRegistroD22 = convertToDouble(idRegistro22);
		
		if (idRegistroD1 == idRegistroD11 && idRegistroD2 == idRegistroD22) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
	}
	
	public boolean ExcluirMasas() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		
		check1.click();
		sleep(1000);
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		
		
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(5000);
		waitExpectElement(lixeira);
		sleep(5000);
		
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		return sucesso;
	}
}
