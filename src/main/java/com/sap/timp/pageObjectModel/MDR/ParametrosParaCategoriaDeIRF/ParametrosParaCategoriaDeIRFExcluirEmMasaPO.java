package com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosParaCategoriaDeIRFExcluirEmMasaPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Categoria de IRF \"]")
	public WebElement parametros;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	

	@FindBy(xpath = "//div[@id=\"irf-category\"]/div/div/div[2]")
	public WebElement categoriaIRF;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;

	@FindBy(xpath = "//div[@id=\"irf-code\"]/div/div/div[2]")
	public WebElement codigoIRF;
	
	@FindBy(xpath = "//div[@id=\"irf-key\"]/div/div/div[2]")
	public WebElement chaveIRF;
	
	@FindBy(xpath = "//div[@id=\"structure\"]/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"values-fields\"]/div/div/div[2]")
	public WebElement camposValor;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	public ParametrosParaCategoriaDeIRFExcluirEmMasaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		parametros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		novo.click();
		sleep(3000);
		waitExpectElement(categoriaIRF);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		categoriaIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"irf-code\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);
	
		
		codigoIRF.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"irf-key\"]/div", "class", "base-select ");
		
		chaveIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		descricao.sendKeys("Teste Categoria IRF 1");
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		camposValor.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		gravar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		//segundo registro
		sleep(2000);
		novo.click();
		sleep(3000);
		waitExpectElement(categoriaIRF);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(5000);

	

		

		categoriaIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"irf-code\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);
	
		
		codigoIRF.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"irf-key\"]/div", "class", "base-select ");
		
		chaveIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		descricao.sendKeys("Teste Categoria IRF 2");
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		camposValor.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		gravar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
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
	}
	
	public boolean excluirMassa() {
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
	
		return sucesso;
		
	}
}
