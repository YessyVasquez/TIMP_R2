package com.sap.timp.pageObjectModel.TAA.Ajuste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AjustesEditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[@id=\"reasonChange\"]/div/textarea")
	public WebElement motivo;
	
	@FindBy(xpath = "//body/div[@class=\"overlay dark\"][2]/div/div[3]/button[1]")
	public WebElement no;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//span[text()=\"Novo Ajuste\"]")
	public WebElement nueva;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	@FindBy(xpath = "//span[text()=\"Dados Lançamento\"]")
	public WebElement data;
	
	public   AjustesEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
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
				
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(16000);
		
	
		waitExpectElement(data);
	  	sleep(8000);
		
	  	String enviar = "Test AN4 Massiel Vasquez";
	  	sleep(4000);
	  	
	  	motivo.clear();
	  	sleep(4000);
	  	
	  	motivo.sendKeys(enviar);
	  	sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(confirmar);
		sleep(4000);
		
		confirmar.click();
		sleep(4000);
		
		no.click();
		sleep(4000);
		
		confirmar.click();
		sleep(4000);
		
		waitExpectElement(nueva);
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
	
		waitExpectElement(data);
	  	sleep(12000);
		
	  	String nuevoTexto = motivo.getAttribute("value");
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}
}
