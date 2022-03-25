package com.sap.timp.pageObjectModel.SCANC.OficiosExtemporaneos;

import java.util.ArrayList;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class OficiosExtemporaneosCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Ofícios extemporâneos\"]")
	public WebElement oficiosExtemporaneos;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement btnOficiosExtemporaneos;
	
	@FindBy(xpath = "//div[@id=\"annexe\"]/div/div[2]")
	public WebElement cboAnexo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"Anexo 6\"]")
	public WebElement opcionAnexo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement cboEmpre;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcionEmpre;
	
	@FindBy(xpath = "//div[@id=\"frame\"]/div/div[2]")
	public WebElement cboQuadro;

	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"Quadros 4.1 > 7.1\"]")
	public WebElement opcionQuadro;
	
	@FindBy(xpath = "//div[@id=\"period\"]/div/div/span")
	public WebElement inputPeriodo;

	@FindBy(xpath = "//div[@id=\"filial\"]/div/div[2]")
	public WebElement cboFilialOrigem;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"0001 - SP\"]")
	public WebElement opcionFilialOrigem;
	
	@FindBy(xpath = "//div[@id=\"uf-origin\"]/div/div[2]")
	public WebElement cboUfRelatorio;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"SP\"]")
	public WebElement opcionUfRelatorio;
	
	@FindBy(xpath = "//div[@id=\"cnpj\"]/div/div[2]")
	public WebElement cboCnpj;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"00326969000319 - MAXSUL DISTRIBUIDORA DE COMBUSTIVEIS LTDA\"]")
	public WebElement opcionCnpj;
	
	@FindBy(xpath = "//div[@id=\"uf-dest-report\"]/div/div[2]")
	public WebElement cboUfRelatorioDestino;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"SP\"]")
	public WebElement opcionUfRelatorioDestino;
	
	@FindBy(xpath = "//div[@id=\"communique\"]/div/div/input")
	public WebElement inputComunicado;
	
	@FindBy(xpath = "//div[@id=\"operation-value\"]/div/div/input")
	public WebElement inputValorOperacao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public OficiosExtemporaneosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		oficiosExtemporaneos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnUltimaPagina.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Ultimo ID: " + id);			
		sleep(2000);	
		
		btnOficiosExtemporaneos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cboEmpre.click();
		sleep(1000);
		opcionEmpre.click();
		sleep(8000);
		
		cboAnexo.click();
		sleep(1000);
		opcionAnexo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"frame\"]/div", "class", "base-autocomplete required");
		cboQuadro.click();
		sleep(1000);
		opcionQuadro.click();
		sleep(1000);
		
		Calendar c1 = Calendar.getInstance();
		String anio = Integer.toString(c1.get(Calendar.YEAR));
		System.out.println("ANIO ACTUAL: " + anio);
		
		inputPeriodo.click();
		WebElement anioCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"title\") and text()=\""+anio+"\"]"));
		anioCalendarElement.click();
		sleep(2000);
		
		WebElement flechaIzquierdaCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaIzquierdaCalendarElement.click();
		sleep(1000);
		flechaIzquierdaCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaIzquierdaCalendarElement.click();
		sleep(1000);
		flechaIzquierdaCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaIzquierdaCalendarElement.click();
		sleep(1000);
		
		WebElement yearCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"2000\"]"));
		yearCalendarElement.click();
		sleep(1000);
		
		WebElement monthCalendarElement = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendarElement.click();
		sleep(1000);
		
		cboFilialOrigem.click();
		sleep(1000);
		opcionFilialOrigem.click();
		sleep(1000);
		
		cboUfRelatorio.click();
		sleep(1000);
		opcionUfRelatorio.click();
		sleep(1000);
		
		cboUfRelatorioDestino.click();
		sleep(1000);
		opcionUfRelatorioDestino.click();
		sleep(1000);
		
		cboCnpj.click();
		sleep(1000);
		opcionCnpj.click();
		sleep(1000);
		
		String comunicadoString = "TESTE AUTOMATIZADO";
		inputComunicado.sendKeys(comunicadoString);
		sleep(1000);
		
		String valorOperacaoString = "1.000,00";
		inputValorOperacao.sendKeys(valorOperacaoString);
		
		btnGravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sleep(3000);
		String anexo = "Anexo 6";
		String filialOrigem = "0001 - SP";
		String filialDestino = "0001 - SP";
		String ufRelatorio = "SP";
		String ufRelatorioDestino = "SP";
		//String quadroOrigem = "Quadros 4.1 > 7.1";
		String quadroOrigem = "A6Q41 -> A6Q71";
		String cnpj = "00326969000319 - MAXSUL DISTRIBUIDORA DE COMBUSTIVEIS LTDA";
		String razaoSocial = "MAXSUL DISTRIBUIDORA DE COMBUSTIVEIS LTDA";
		String valorOperacao = "1.000,00";
		String comunicado = "TESTE AUTOMATIZADO";
		
		String anexo1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		System.out.println(anexo1);
		String filialOrigem1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println(filialOrigem1);
		String filialDestino1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println(filialDestino1);
		String ufRelatorio1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println(ufRelatorio1);
		String ufRelatorioDestino1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")).getText();
		System.out.println(ufRelatorioDestino1);
		String quadroOrigem1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")).getText();
		System.out.println(quadroOrigem1);
		String cnpj1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")).getText();
		System.out.println(cnpj1);
		String razaoSocial1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[10]/div")).getText();
		System.out.println(razaoSocial1);
		String valorOperacao1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[11]/div")).getText();
		System.out.println(valorOperacao1);
		String comunicado1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[12]/div")).getText();
		System.out.println(comunicado1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(anexo.contains(anexo1));
		sucesso.add(filialOrigem.contains(filialOrigem1));
		sucesso.add(filialDestino.contains(filialDestino1));
		sucesso.add(ufRelatorio.equals(ufRelatorio1));
		sucesso.add(ufRelatorioDestino.equals(ufRelatorioDestino1));
		sucesso.add(quadroOrigem.contains(quadroOrigem1));
		sucesso.add(cnpj.contains(cnpj1));
		sucesso.add(razaoSocial.equals(razaoSocial1));
		sucesso.add(valorOperacao.equals(valorOperacao1));
		sucesso.add(comunicado.equals(comunicado1));
		
		System.out.println("");
		System.out.println(sucesso);
		
		btnBiblioteca.click();
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnUltimaPagina.click();		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		if(rows == 0) {
			sucesso.add(true);
			return sucesso; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText(); 
		idInserir4(idB);
		  
		sleep(2000); 
		System.out.println("Id: " + id); 
		System.out.println("Ultimo id: " + idB);
		  
		int idD = Integer.valueOf(id); 
		int idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso.add(true);
		}else { 
			sucesso.add(false);
		}
		 
		System.out.println("");
		System.out.println(sucesso);
		return sucesso;	
		
	}
}
