package com.sap.timp.pageObjectModel.MDR.ContasEspeciaisIRPJCSLL;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ContasEspeciaisIRPJCSLLPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Contas Especiais IRPJ/CSLL\"]")
	public WebElement ContasEspIRP;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Especial IRPJ/CSLL\"]")
	public WebElement nuevoCoin;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[1]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement Empresas;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div[2]")
	public WebElement numeroEmpresa;
	
	@FindBy(xpath = "//body")
	public WebElement clickfuera;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[2]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement Tributo;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]/div[2]")
	public WebElement NumeroTributo;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[3]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement Codigo;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div")
	public WebElement NumeroCodigo;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[4]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement Ano;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[8]/td/div/div[2]/div/div[1]/input")
	public WebElement DataInicial;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement Sim;
	
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public ContasEspeciaisIRPJCSLLPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean Criar() {
		//carga mrd
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//carga boton de contains
		ContasEspIRP.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		
		//primer dato
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println(idRegistro);			
		sleep(2000);		
		
		nuevoCoin.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		
		
		
		Empresas.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		
		numeroEmpresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		clickfuera.click();
		
		sleep(2000);
		Tributo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		
		sleep(2000);
		NumeroTributo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		clickfuera.click();
		
		sleep(2000);
		Codigo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		
		sleep(2000);
		NumeroCodigo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		clickfuera.click();
		
		Ano.sendKeys("2020");
		DataInicial.sendKeys("20/10/2020");
		clickfuera.click();
		
		sleep(2000);
		Gravar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		boolean sucesso = false;
		
		//primer dato de la tabla
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();		
		idInserir("ContasEspeciais", String.valueOf(Integer.parseInt(idRegistro1)));
		System.out.println(idRegistro1);			
		sleep(2000);
		  
		int idD = Integer.parseInt(idRegistro); 
		int idBD = Integer.parseInt(idRegistro1);
		
		System.out.println("-----------------------------");
		System.out.println(idD); 
		System.out.println(idBD);
		sleep(2000);

		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
	
	
	
	
}
