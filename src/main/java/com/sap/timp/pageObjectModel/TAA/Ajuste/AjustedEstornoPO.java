package com.sap.timp.pageObjectModel.TAA.Ajuste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AjustedEstornoPO extends TestBaseMassiel {

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[text()=\"Novo Ajuste\"]")
	public WebElement nueva;
	
	@FindBy(xpath = "//div[@class=\"reason\"]/div/div/div[2]")
	public WebElement razao;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement razaoOPC;
	
	@FindBy(xpath = "//label[@for=\"3\"]")
	public WebElement label;
	
	@FindBy(xpath = "//div[@class=\"date\"]/div/div/input")
	public WebElement fecha;
	
	
	public   AjustedEstornoPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean estorno(){
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[1]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[15]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
		
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		String idRegistro = idObter("Ajuste");
		System.out.println(idRegistro );
				
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement estornar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Estornar\"]"));
		

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		estornar.click();
		sleep(16000);
	
		
		waitExpectElement(aceitar);
		sleep(2000);
		
		razao.click();
		sleep(2000);
		
		razaoOPC.click();
		sleep(2000);
		
		label.click();
		sleep(2000);
		
		String enviar = "31/01/2021";
	  	sleep(4000);
	  	
	  	fecha.sendKeys(enviar);
	  	sleep(2000);
	  	
	  	aceitar.click();
		sleep(2000);
		waitExpectElement(nueva);
		sleep(10000);
		sleep(10000);
		
		String valor = "PENDENTE";
		System.out.println(valor );
		
		String status = driver
				.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[13]/div"))
				.getText();
		
		System.out.println("Status : " + status );
		
		boolean sucesso = status.equals(valor);
		System.out.println(sucesso);
	  	
		return sucesso;
		
	}
}
