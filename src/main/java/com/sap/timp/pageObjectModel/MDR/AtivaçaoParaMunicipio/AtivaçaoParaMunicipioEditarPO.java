package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivaçaoParaMunicipioEditarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Ativação para Município\"]")
	public WebElement ativaçaoparamunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralizing-branch\"]/div/div/div[2]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement filialE;
	
	@FindBy(xpath = "//span[@id=\"centralizingBranch\"]")
	public WebElement filialV;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	
	public AtivaçaoParaMunicipioEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		ativaçaoparamunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AtivacaoParaMunicipio");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(filialcentralizadora);
		sleep(2000);
		
		filialcentralizadora.click();
		
		sleep(2000);
		
		String filialE1= filialE.getText();
		System.out.println("filial 1: "+filialE1);
		filialE.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		*/
	
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("AtivacaoParaMunicipio");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(filialV);
		sleep(2000);
		
		String filialV1 = filialV.getText();
		System.out.println(filialV1);
		
		
		
		boolean sucesso = filialV1.contains(filialE1);
		System.out.println(sucesso);	
		return sucesso;
		
	}
	
	

}
