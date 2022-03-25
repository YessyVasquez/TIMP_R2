package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class LivrosFiscaisExcluirEmMassaPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-fiscalBooks\"]")
	public WebElement livrosFiscaisO;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	

	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;
	
	
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
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo do Livro\")]")
	public WebElement tipodolivro;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][2]")
	public WebElement opcao1;

	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial\")]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Modelo de Livro\")]")
	public WebElement modelo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Quantidade\")]")
	public WebElement quantidade;
	
	@FindBy(xpath = "//div[@class=\"field-element taxCode_0_2\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	
	
	public LivrosFiscaisExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public Boolean criar() {
		
		sleep(2000);
		livrosfiscais.click();
		sleep(2000);
		
		livrosFiscaisO.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		//NUEVO REGISTRO
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//for (int i = 0; i < 2; i++) {
			tipodolivro.click();
			sleep(1000);
			opcao.click();
			sleep(2000);
			
			empresa.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			ufFilial.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			filial.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			modelo.click();
			sleep(1000);
			opcao.click();
			sleep(2000);
			
			quantidade.sendKeys("123");
			
			dataVigencia.sendKeys(fechaActual());
			
			sleep(2000);
			gravareNovo.click();
			sleep(2000);
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			//SEGUNDO REGISTRO
			tipodolivro.click();
			sleep(1000);
			opcao1.click();
			sleep(2000);
			
			empresa.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			ufFilial.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			filial.click();
			sleep(1000);
			opcao2.click();
			opcao2.sendKeys(Keys.ESCAPE);
			sleep(2000);
			
			modelo.click();
			sleep(1000);
			opcao1.click();
			sleep(2000);
			
			quantidade.sendKeys("123");
			
			dataVigencia.sendKeys(fechaActual());
			
			sleep(2000);
			gravareNovo.click();
			sleep(2000);
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		//}
		
		biblioteca.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		
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
	
	public Boolean livrosFiscaisExcluirEmMassa() {
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
		waitExpectElement(ultimaPagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
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
