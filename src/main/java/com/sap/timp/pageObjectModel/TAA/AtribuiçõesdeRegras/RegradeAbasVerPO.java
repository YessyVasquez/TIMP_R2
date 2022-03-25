package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeAbasVerPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement AtribuiçõesdeRegras;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[1]/div/span[2]")
	public WebElement ICMS;
	
	@FindBy(xpath = "//span[text()=\"Regras de Abas\"]")
	public WebElement RegrasdeAbas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	
	public RegradeAbasVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver(){
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		AtribuiçõesdeRegras.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ICMS.click();
		sleep(1000);
		
		RegrasdeAbas.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ultimapagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		
		String idRegistro = idObter("RegradeAbas");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de visualizar
		String empresaString = driver.findElement(By.xpath("//div[@id=\"rule-company\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String ufString = driver.findElement(By.xpath("//div[@id=\"rule-state\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]/div/div/div/input")).getAttribute("value").trim();
		String reglaString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/input")).getAttribute("value").trim();

		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Regla: " + reglaString);

		System.out.println("");
		
		sleep(2000);
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		// Datos de Editar
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]/div/div/div/input")).getAttribute("value").trim();
		String reglaString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/input")).getAttribute("value").trim();

		
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Regla: " + reglaString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(reglaString1.equals(reglaString));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}

}
