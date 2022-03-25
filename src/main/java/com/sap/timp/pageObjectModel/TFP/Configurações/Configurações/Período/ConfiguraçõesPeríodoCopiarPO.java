package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Período;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguraçõesPeríodoCopiarPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[@id=\"valid-from\"]/div/div/input")
	public WebElement validadeDe;
	@FindBy(xpath = "//div[@id=\"valid-to\"]/div/div/input")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div/input")
	public WebElement Dia;
	
	@FindBy(xpath = "//li[@id=\"option-4\"]")
	public WebElement DiaOpc;
	

	public ConfiguraçõesPeríodoCopiarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean copiar() {
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
		WebElement copiar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));

		menu.click();
		sleep(1000);
		copiar.click();
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
		
		
		validadeDe.clear();
		sleep(1000);
		validadeAte.clear();
		sleep(1000);
			
		validadeDe.sendKeys("01/01/1973");
		sleep(1000);
		String validadeDe1 = validadeDe.getAttribute("value");
		System.out.println("Validade De valor a editar: " +validadeDe1);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		validadeAte.sendKeys("31/12/1974");
		sleep(1000);
		String validadeAte1 = validadeAte.getAttribute("value");
		System.out.println("Validade Ate valor a editar: " +validadeAte1);
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
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 > id2) {
			sucesso = true;
		}
		System.out.println( sucesso);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

//		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String dia2 = Dia.getAttribute("value");
		System.out.println("Dia Despues de Editar" +dia2);
		
		String validadeDe2 = validadeDe.getAttribute("value");
		System.out.println("Dia Despues de Editar" +validadeDe2);
		
		String validadeAte2 = validadeAte.getAttribute("value");
		System.out.println("Dia Despues de Editar" +validadeAte2);
		
		ArrayList<Boolean> sucesso1 = new ArrayList<Boolean>();
			sucesso1.add(dia3.contains(dia2));
			sucesso1.add(validadeAte1.contains(validadeDe2));
			sucesso1.add(validadeDe1.contains(validadeAte2));
		
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
			
		sleep(2000);
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		menu2.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]")).size();
		String idObtenido3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[2]/div")).getText();
		
		int id3 = convertToInt(idObtenido3);
		int id4 = convertToInt(idRegistro);
		System.out.println(idObtenido3);
		System.out.println(id2);
				
		if (id3 == id4) {
			sucesso= true;
		}
		System.out.println( sucesso);
		//return sucesso, sucesso1;
		
		return sucesso;
		
		
		
		
		
	}
}
