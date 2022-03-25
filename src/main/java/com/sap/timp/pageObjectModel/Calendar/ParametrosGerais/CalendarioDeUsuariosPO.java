package com.sap.timp.pageObjectModel.Calendar.ParametrosGerais;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CalendarioDeUsuariosPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement ar;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	

	public CalendarioDeUsuariosPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarMDR() {

		calendario.click();
		sleep(3000);
		waitExpectElement(ar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement flag = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and@tabindex=\"0\"][1]/div/label/span"));
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and@tabindex=\"0\"][1]/div[3]/div")).getText();
		
		System.out.println("Nome do primer registro: " +nome);
		
		dobleClickElement(flag);
		sleep(1000);
		
		aceitar.click();
		invisibilityOfElementOverlay();
		
		String nomeCalendario = driver.findElement(By.xpath("//div[@id=\"user-title\"]")).getText();
		nomeCalendario = nomeCalendario.replace("Calendário de ", "");
		
		System.out.println("Nome Calendário: " +nomeCalendario);
		
		boolean sucesso = nome.contains(nomeCalendario);
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
}
