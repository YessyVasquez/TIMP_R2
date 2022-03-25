package com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class SPCBFederaisRetidosVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"SPCB - Federais Retidos\"]")
	public WebElement SPGB;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos Visualizar
	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"area\"]")
	public WebElement area;
	
	@FindBy(xpath = "//span[@id=\"mesAno\"]")
	public WebElement mesAnio;
	
	@FindBy(xpath = "//span[@id=\"nomeBenefic\"]")
	public WebElement beneficiario;
	
	// Datos Editar
	@FindBy(xpath = "//div[@id=\"codEmpresa\"]/div/div/div/input")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"area\"]/div/div/input")
	public WebElement area1;
	
	@FindBy(xpath = "//div[@id=\"mesAno\"]/div/div/input")
	public WebElement mesAnio1;
	
	@FindBy(xpath = "//div[@id=\"nomeBenefic\"]/div/div/input")
	public WebElement beneficiario1;

	
	public SPCBFederaisRetidosVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		SPGB.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =  idObter("SPCBFederaisRetidos");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtenemos los datos
		String empresaString = empresa.getText();
		String areaString = area.getText();
		String mesAnioString = mesAnio.getText();
		String beneficiarioString = beneficiario.getText();
		
		System.out.println("Datos de Visualizar");
		System.out.println("Empresa: " + empresaString);
		System.out.println("Area: " + areaString);
		System.out.println("Mes/Anio: " + mesAnioString);
		System.out.println("Beneficiario: " + beneficiarioString);
		System.out.println("");
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtenemos los datos de Editar
		String empresaString1 = empresa1.getAttribute("value");
		String areaString1 = area1.getAttribute("value");
		String mesAnioString1 = mesAnio1.getAttribute("value");
		String beneficiarioString1 = beneficiario1.getAttribute("value");
		
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("Area: " + areaString1);
		System.out.println("Mes/Anio: " + mesAnioString1);
		System.out.println("Beneficiario: " + beneficiarioString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(areaString1.equals(areaString));
		sucesso.add(mesAnioString1.equals(mesAnioString));
		sucesso.add(beneficiarioString1.equals(beneficiarioString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
