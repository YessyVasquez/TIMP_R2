package com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeTransporte;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NotaFiscalEletronicaDeTransporteFiltrosAvancadosPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Arquivos\"]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//span[text()=\"Nota Fiscal Eletrônica de Transporte\"]")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar pela Data de Criação\"]")
	public WebElement filtrardatacriacao;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][1]/div[1]")
	public WebElement anoinicio;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][2]/div[1]")
	public WebElement anofim;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][1]/div[1]/div[1]")
	public WebElement arinicio;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][2]/div[1]/div[1]")
	public WebElement arfim;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	public NotaFiscalEletronicaDeTransporteFiltrosAvancadosPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtro() {

		sleep(2000);
		arquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		notafiscal.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String data = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")).getText();
		String datasplit[]=data.split("/");
		
		filtrosavancados.click();
		sleep(2000);
		filtrardatacriacao.click();
		sleep(2000);
		
		//Data inicio
		
		anoinicio.click();
		sleep(2000);
		anoinicio.click();
		sleep(2000);
		
		int element2018 = driver.findElements(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[5]/div[text()=\""+datasplit[2]+"\"]")).size();
		
		sleep(2000);
		
		if(element2018 == 0) {
			arinicio.click();
			sleep(2000);
		}		
		
		WebElement ano2018inicio =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[5]/div[text()=\""+datasplit[2]+"\"]"));
		ano2018inicio.click();
		sleep(2000);
		int mesI = Integer.valueOf(datasplit[1]);
		System.out.println("O mes é: " +mesI);
		
		String mesLetra ="";
		
		switch (mesI) {
		case 1:
			mesLetra = "Jan";
			break;
		case 2:
			mesLetra = "Fev";
			break;
			
		case 3:
			mesLetra = "Mar";
			break;
			
		case 4:
			mesLetra = "Abr";
			break;
			
		case 5:
			mesLetra = "Mai";
			break;
			
		case 6:
			mesLetra = "Jun";
			break;
			
		case 7:
			mesLetra = "Jul";
			break;
		
		case 8:
			mesLetra = "Ago";
			break;
			
		case 9:
			mesLetra = "Set";
			break;
			
		case 10:
			mesLetra = "Out";
			break;
			
		case 11:
			mesLetra = "Nov";
			break;
			
		case 12:
			mesLetra = "Dez";
			break;

		default:
			break;
		}

		System.out.println("Mes: " + mesLetra);
		
		WebElement mes2018inicio =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[4]/div[text()=\""+mesLetra+"\"]"));
		mes2018inicio.click();
		sleep(2000);
		
		int dia = Integer.valueOf(datasplit[0]);
		WebElement dia2018inicio =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[3]/div[text()=\""+dia+"\"]"));
		dia2018inicio.click();
		sleep(2000);
		
		//Data do Fim
		
		anofim.click();
		sleep(2000);
		anofim.click();
		sleep(2000);
		
		int element2018fim = driver.findElements(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[5]/div[text()=\""+datasplit[2]+"\"]")).size();
		
		sleep(2000);
		
		if(element2018fim == 0) {
			arfim.click();
			sleep(2000);
		}		
		
		WebElement ano2018fim =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[5]/div[text()=\""+datasplit[2]+"\"]"));
		ano2018fim.click();
		sleep(2000);
		int mesIfim = Integer.valueOf(datasplit[1]);
		System.out.println("O mes fim é: " +mesIfim);
		
		String mesLetrafim ="";
		
		switch (mesIfim) {
		case 1:
			mesLetrafim = "Jan";
			break;
		case 2:
			mesLetrafim = "Fev";
			break;
			
		case 3:
			mesLetrafim = "Mar";
			break;
			
		case 4:
			mesLetrafim = "Abr";
			break;
			
		case 5:
			mesLetrafim = "Mai";
			break;
			
		case 6:
			mesLetrafim = "Jun";
			break;
			
		case 7:
			mesLetrafim = "Jul";
			break;
		
		case 8:
			mesLetrafim = "Ago";
			break;
			
		case 9:
			mesLetrafim = "Set";
			break;
			
		case 10:
			mesLetrafim = "Out";
			break;
			
		case 11:
			mesLetrafim = "Nov";
			break;
			
		case 12:
			mesLetrafim = "Dez";
			break;

		default:
			break;
		}

		System.out.println("Mes Fim: " + mesLetrafim);
		
		WebElement mes2018fim =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[4]/div[text()=\""+mesLetrafim+"\"]"));
		mes2018fim.click();
		sleep(2000);
		
		int diafim = Integer.valueOf(datasplit[0]);
		WebElement dia2018fim =  driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[3]/div[text()=\""+diafim+"\"]"));
		dia2018fim.click();
		sleep(2000);
		
		aplicar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int j = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i = 0; i < rows; i++) {

			String datafiltradainicio = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+j+"]/div[6]/div")).getText();
			System.out.println("Data filtrada inicio:"+datafiltradainicio);
			String datafiltradafim = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+j+"]/div[7]/div")).getText();
			System.out.println("Data filtrada fim:"+datafiltradafim);
			
			
			if(data.contains(datafiltradainicio) == true && data.contains(datafiltradafim) == true)
			{
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			
			j = j + 1;
		}
		System.out.println(sucesso);
		
		

		return sucesso;

	}

}
