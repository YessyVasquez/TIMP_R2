package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivaçaoParaMunicipioExcluirMassaPO extends TestBaseSteven{
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
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
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
	
	public AtivaçaoParaMunicipioExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void ExcluirMassa() {
		
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
	
		gravareNovo.click();
		sleep(2000);
		sim.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		System.out.println("Segundo registro");
		
	
		sleep(4000);
		
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
	
		biblioteca.click();
		
		sleep(2000);
		
/*		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
	//	rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		int rows = 1;
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		 rows = rows+1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);
	
		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
	
		
		return sucesso;
	*/
		
		
	}
}
