package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class DeterminacionRelevanciaPorMotivoExcluirEmMassaPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement determinacaoRelevancia;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Motivo\"]")
	public WebElement motivoReabertura;
	
	//DATOS
	@FindBy(xpath = "//span[contains(text(),\"Nova Determinação de Relevância por Motivo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement empresaSeleccion;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresaI;
	
	@FindBy(xpath = "//*[@id=\"uf\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement uf;
	
	@FindBy(xpath = "//*[@id=\"overlay\"]/div[1]/div/div/div[1]/label/span")
	public WebElement ufSeleccion;
	
	@FindBy(xpath = "//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement filial;
	
	@FindBy(xpath = "//*[@id=\"overlay\"]/div[1]/div/div/div[1]/label/span")
	public WebElement filialSeleccion;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"overlay\"]/div[1]/div/div/div[1]/label/span")
	public WebElement tributoSeleccion;
	
	@FindBy(xpath = "//*[@id=\"motiveCode\"]/div")
	public WebElement codMotivo;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement codMotivoSeleccion;
	
	@FindBy(xpath = "//*[@id=\"ruleCode\"]/div")
	public WebElement codRegra;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement codRegraSeleccion;
	
	@FindBy(xpath = "//*[@id=\"output\"]/div")
	public WebElement chaveReavertura;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement chaveReaverturaSeleccion;
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	public DeterminacionRelevanciaPorMotivoExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		determinacaoRelevancia.click();
		sleep(2000);
		motivoReabertura.click();
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
		//CLICK BOTON NUEVO
		sleep(2000);
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		for (int i = 0; i < 2; i++) {
			
			
			empresa.click();
			sleep(2000);
			empresaSeleccion.click();
			empresaSeleccion.sendKeys(Keys.ESCAPE);
			sleep(3000);
			attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000); 
			
			uf.click();
			sleep(3000);
			ufSeleccion.click();
			ufSeleccion.sendKeys(Keys.ESCAPE);
			sleep(3000);
			attributeToBeXpath("//*[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);
			
			filial.click();
			sleep(3000);
			filialSeleccion.click();
			filialSeleccion.sendKeys(Keys.ESCAPE);
			sleep(3000);
	
			
			tributo.click();
			sleep(3000);
			tributoSeleccion.click();
			tributoSeleccion.sendKeys(Keys.ESCAPE);
			sleep(3000);
	
			
			codMotivo.click();
			sleep(3000);
			codMotivoSeleccion.click();
			sleep(3000);
	
			
			codRegra.click();
			sleep(3000);
			codRegraSeleccion.click();
			sleep(3000);
			
			
			chaveReavertura.click();
			sleep(3000);
			chaveReaverturaSeleccion.click();
			sleep(3000);
			
			fecha.sendKeys(fechaActual());
			
			sleep(2000);
			gravareNovo.click();
			sleep(2000);
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
//			waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
		
		}
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
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
	
	public boolean determinacaoDeRelevanciaPorMotivoExcluirEmMassa() {
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
