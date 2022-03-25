package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivaçaoParaMunicipioCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Ativação para Município\"]")
	public WebElement ativaçaoparamunicipio;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement novomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralizing-branch\"]/div/div/div[2]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"county\"]/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralized-branches\"]/div/div/div[2]")
	public WebElement filiaiscentralizadora;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofiliais;
	
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
	
	
	public AtivaçaoParaMunicipioCriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(2000);
		ativaçaoparamunicipio.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		//String id = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println(id);
		
		sleep(2000);
		novomunicipio.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		//razaosocial.sendKeys("Razão Social");
		//sleep(2000);
		
		uf.click();
		sleep(2000);
		opcaouf.click();
		sleep(2000);
		
		filialcentralizadora.click();
		sleep(2000);
		opcaofilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		municipio.click();
		sleep(2000);
		opcaomunicipio.click();
		sleep(2000);
		
		filiaiscentralizadora.click();
		sleep(2000);
		opcaofiliais.click();
		sleep(2000);
		opcaofiliais.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
	
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		waitExpectElement(biblioteca);
		sleep(2000);

		sleep(6000);

		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
	//	String id2 = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");

		idInserir("AtivacaoParaMunicipio",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;		
	}
	

}
