package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branchCode\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxFinancial\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"financialInstitution\"]")
	public WebElement instituicaoV;
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement paisV;
	@FindBy(xpath = "//span[@id=\"coinCode\"]")
	public WebElement moedaV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial\")]")
	public WebElement filialE;
	@FindBy(xpath = "//div[contains(@id,\"multipleControlerId\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Instituição\")]")
	public WebElement instituicaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"País\")]")
	public WebElement paisE;
	@FindBy(xpath = "//input[@placeholder=\"Moeda \"]")
	public WebElement moedaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public InstitucaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("InstituicaoFinanceira");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		visibilityOfElementXpath("//span[@id=\"companyCode\"]");
		sleep(1000);
		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String instituicaoV1 = instituicaoV.getText();
		String paisV1 = paisV.getText();
		String moedaV1 = moedaV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(instituicaoV1);
		System.out.println(paisV1);
		System.out.println(moedaV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
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
		
		String empresaE1 = empresaE.getAttribute("value");
		String filialE1 = filialE.getAttribute("value");
		String tributoE1 = tributoE.getText();
		String instituicaoE1 = instituicaoE.getAttribute("value");
		String paisE1 = paisE.getAttribute("value");
		String moedaE1 = moedaE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(empresaE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(instituicaoE1);
		System.out.println(paisE1);
		System.out.println(moedaE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(paisV1.contains(paisE1));
	//	sucesso.add(moedaE1.contains(moedaV1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;
		
	}
	
	

}
