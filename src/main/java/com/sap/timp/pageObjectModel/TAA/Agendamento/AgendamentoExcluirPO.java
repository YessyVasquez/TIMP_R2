package com.sap.timp.pageObjectModel.TAA.Agendamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AgendamentoExcluirPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Agendamento\"]")
	public WebElement abaAgendamento;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s_tax_00\"]")
	public WebElement menuIcms;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public AgendamentoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		 
		abaAgendamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuIcms.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String idRegistro = idObter("Agendamento");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println("ID Primer Registro despues de eliminar: " + idPrimerRegistro);
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idPrimerRegistro);
		  
		boolean sucesso = false;
		
		if(id2 != id1) {
			System.out.println("");
			System.out.println("Valor eliminado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al eliminar registro...");
		}
		
		return sucesso;
	}
}
