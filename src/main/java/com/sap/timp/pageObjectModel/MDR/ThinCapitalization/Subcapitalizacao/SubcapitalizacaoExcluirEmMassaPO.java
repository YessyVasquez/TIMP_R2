package com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Subcapitalizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SubcapitalizacaoExcluirEmMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Thin Capitalization\"]")
	public WebElement thincapitalization;
	
	@FindBy(xpath = "//span[text()=\"Subcapitalização\"]")
	public WebElement subcapitalizacao;
	
	@FindBy(xpath = "//span[text()=\"Nova Subcapitalização\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo1;
	
	
	@FindBy(xpath = "//div[@id=\"companies\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao2;
	
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"lender\"]/div/div/div[2]")
	public WebElement tipodecredor;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Dívida/Capital na proporção da Lei\"]")
	public WebElement divida;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement datainicio;
	
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
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"1000-SP-0001\"]/div/label/span")
	public WebElement opcaofilial;
	
	public SubcapitalizacaoExcluirEmMassaPO() {

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
		thincapitalization.click();
		sleep(2000);
		
		subcapitalizacao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		if(tp1 == true) {
		//Primeiro Registro
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
		sleep(3000);
		uf.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
		sleep(3000);
		
		filial.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipodecredor.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		divida.sendKeys("1");
		
		sleep(2000);
		
		datainicio.sendKeys(fechaActual());
		
		sleep(2000);
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		
		attributeToBeXpath("//div[@id=\"companies\"]/div", "class", "base-select required");
		sleep(3000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
		sleep(3000);
		uf.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
		sleep(3000);
		
		filial.click();
		
		sleep(2000);
		
		opcao1.click();
		
		sleep(2000);
		
		tipodecredor.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		divida.sendKeys("1");
		
		sleep(2000);
		
		datainicio.sendKeys(fechaActual());
		
		
		sleep(2000);
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		}  else if(tq1 ==true) {
			
			
			//Primeiro Registro
			empresa.click();
			
			sleep(2000);
			
			opcao2.click();
			sleep(2000);
			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
			sleep(3000);
			uf.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
			sleep(3000);
			
			filial.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			tipodecredor.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			divida.sendKeys("1");
			
			sleep(2000);
			
			datainicio.sendKeys(fechaActual());
			
			sleep(2000);
			novo1.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			//Segundo Registro
			
			attributeToBeXpath("//div[@id=\"companies\"]/div", "class", "base-select required");
			sleep(3000);
			
			empresa.click();
			
			sleep(2000);
			
			opcao.click();
			sleep(2000);
			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
			sleep(3000);
			uf.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
			sleep(3000);
			
			filial.click();
			
			sleep(2000);
			
			opcao1.click();
			
			sleep(2000);
			
			tipodecredor.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			divida.sendKeys("1");
			
			sleep(2000);
			
			datainicio.sendKeys(fechaActual());
			
			
			sleep(2000);
			novo1.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			biblioteca.click();
			
			
		} else {
			//primeiro
			empresa.click();
			
			sleep(2000);
			
			//opcao.click();
			opcaoempresa.click();
			sleep(2000);
			closeSelectTypeCheckbox(empresa);
			sleep(2000);
			//attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
			//sleep(3000);
			uf.click();
			
			sleep(2000);
			
			//opcao.click();
			opcaouf.click();
			sleep(2000);
			closeSelectTypeCheckbox(uf);
			sleep(2000);
			//attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
			//sleep(3000);
			
			filial.click();
			
			sleep(2000);
			opcaofilial.click();
			//opcao1.click();
			
			sleep(2000);
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			tipodecredor.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			divida.sendKeys("1");
			
			sleep(2000);
			
			datainicio.sendKeys(fechaActual());
			sleep(2000);
			novo1.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			//segundo
			empresa.click();
			
			sleep(2000);
			
			//opcao.click();
			opcaoempresa.click();
			sleep(2000);
			closeSelectTypeCheckbox(empresa);
			sleep(2000);
			//attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
			//sleep(3000);
			uf.click();
			
			sleep(2000);
			
			//opcao.click();
			opcaouf.click();
			sleep(2000);
			closeSelectTypeCheckbox(uf);
			sleep(2000);
			//attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
			//sleep(3000);
			
			filial.click();
			
			sleep(2000);
			opcaofilial.click();
			//opcao1.click();
			
			sleep(2000);
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			tipodecredor.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			divida.sendKeys("1");
			
			sleep(2000);
			
			datainicio.sendKeys(fechaActual());
			sleep(2000);
			novo1.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			biblioteca.click();
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		sleep(3000);
		
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
	
	
	public boolean excluir() {
		
		
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
