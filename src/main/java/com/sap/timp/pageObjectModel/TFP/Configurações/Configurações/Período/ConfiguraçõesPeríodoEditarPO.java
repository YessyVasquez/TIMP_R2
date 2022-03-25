package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Período;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguraçõesPeríodoEditarPO extends TestBaseKenssy {

	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div/input")
	public WebElement Dia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement DiaOpc;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	public ConfiguraçõesPeríodoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("idConfiguracoesPeriodo");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dia1 = Dia.getAttribute("value");
		System.out.println("Dia Antes de Editar: " +dia1);
		
		Dia.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		DiaOpc.click();
		sleep(1000);
		String dia3 = Dia.getAttribute("value");
		System.out.println("Dia valor a editar: " +dia3);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		aplicar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		
		menu2.click();
		sleep(1000);
		editar2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dia2 = Dia.getAttribute("value");
		System.out.println("Dia Despues de Editar" +dia2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(dia3.contains(dia2));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
