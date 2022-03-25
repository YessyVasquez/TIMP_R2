package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class DeterminacaoDeRelevanciaPorRegraExcluirEmMassaPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa\"]")
	public WebElement determinacaoderelevanciadetarefa;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Regra\"]")
	public WebElement determinacaoderelevanciaporregra;
	
	//DATOS
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Relevância por Regra\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0014\"]/div/label/span")
	public WebElement opcaofilialtc2;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"ruleCode\"]/div/div/div[2]")
	public WebElement codigoderegra;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"output\"]/div/div/div[2]")
	public WebElement saida;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement datainiciovigencia;
	
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
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	
	public DeterminacaoDeRelevanciaPorRegraExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		determinacaoderelevanciadetarefa.click();
		sleep(2000);
		determinacaoderelevanciaporregra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		for (int i = 0; i < 2; i++) {
			empresa.click();
			sleep(2000);
			opcaoempresa.click();
			sleep(2000);
			body.click();
			sleep(2000);
		
			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);
			
			uf.click();
			
			sleep(2000);
			
			opcaouf.click();
			
			sleep(2000);
			
			body.click();
			
			sleep(2000);
			if(tc2==true) {
			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);
			filial.click();
			sleep(2000);
			opcaofilialtc2.click();
			sleep(2000);
			body.click();
			sleep(2000);
			}else {
				
				attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
				sleep(3000);
				filial.click();
				sleep(2000);
				opcaofilial.click();
				sleep(2000);
				body.click();
				sleep(2000);
				
			}
			
			tributo.click();
			
			sleep(2000);
			
			opcaotributo.click();
			
			sleep(2000);
			
			body.click();
			
			sleep(2000);
			
			codigoderegra.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			saida.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			
			
			String data = fechaActual();
		
			datainiciovigencia.sendKeys(data);
			
			sleep(2000);
			gravareNovo.click();
			sleep(2000);
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
//		sleep(2000);
//		gravareNovo.click();
//		sleep(2000);
//		sim.click();
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
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
	
	public boolean determinacaoDeRelevanciaPorRegraExcluirEmMassa() {
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
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
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
