package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DEPARAContasContábeisExluirPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastro;
	
	//submenu
	@FindBy(xpath = "//span[text()=\" DE-PARA  Contas  Contábeis\"]")
	public WebElement subItem;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Aceptar;
	
	public DEPARAContasContábeisExluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Excluir() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

	   cadastro.click();
	   sleep(5000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(5000);
	   
	   subItem.click();
	   sleep(5000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(5000);
	   
	    ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("DePARAContasContabeis");
		System.out.println(idRegistro);
	    
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
	  	sleep(2000);
	  	
	  	Aceptar.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
