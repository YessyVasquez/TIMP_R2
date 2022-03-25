package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1501;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1501CriarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário COFINS\"]")
	public WebElement gestaocreditocofins;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1501\"]")
	public WebElement registro1501;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro 1501\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div[@class=\"new-tag\"]/input")
	public WebElement uf;
	
	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//*[@id=\"dt-oper\"]/div/div[1]/input")
	public WebElement data;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[text()=\"Notas Fiscais Filtradas\"]")
	public WebElement notasFiscais;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Filtros\"]")
	public WebElement visualizarFiltro;
	
	@FindBy(xpath = "//button[text()=\"Pesquisa Nota Fiscal\"]")
	public WebElement pesquisarNota;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flagNota;
	
	@FindBy(xpath = "//span[text()=\"Transferir\"]")
	public WebElement transferir;
	
	@FindBy(xpath = "//div[@class=\"fieldSize1 company\"]/div/div[@id=\"main-icon\"]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaOV;
	
	@FindBy(xpath = "//div[@class=\"fieldSize1 branch\"]/div/div[@id=\"main-icon\"]")
	public WebElement filialV;
	
	@FindBy(xpath = "//li[text()=\"0002\"]")
	public WebElement filialOV;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/span")
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]")
	public WebElement atrasCal;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[3]/div[8]")
	public WebElement anio;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]")
	public WebElement enero;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/div/div/span")
	public WebElement m1;
	
	@FindBy(xpath = "//span[text()=\"1A\"]")
	public WebElement a1;
	
	public Registro1501CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1501.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idRegistro="0";
		
		if(rows>0) {
		idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		}else {
			//idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id ultimo registro: " +idRegistro);
		}
		novo.click();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("1111");
		empresa.click();
		sleep(1000);
		System.out.println("1111");
		empresaO.click();
		sleep(1000);
		System.out.println("1111");
		
		//attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(12000);
		
		uf.click();
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(1000);
		
		
		System.out.println("1111");
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		System.out.println("1111");
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		data.sendKeys(fechaActual());
		sleep(1000);
		System.out.println("1111");
		notasFiscais.click();
		sleep(2000);
		
		visualizarFiltro.click();
		sleep(4000);
		
		empresaV.click();
		sleep(2000);
		empresaOV.click();
		sleep(13000);
		
		filialV.click();
		sleep(2000);
		filialOV.click();
		sleep(5000);
		
		calendario.click();
		sleep(2000);
		
		atrasCal.click();
		sleep(2000);
		
		anio.click();
		sleep(4000);
		
		enero.click();
		sleep(4000);
		
		if (tq1==true) {
			m1.click();
			sleep(2000);
		}else {
			a1.click();
			sleep(2000);
		}
		
		
		pesquisarNota.click();
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		flagNota.click();
		sleep(2000);
		
		transferir.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int naobotao= driver.findElements(By.xpath("//button[text()=\"Não\"]")).size();
		
		if (naobotao > 0) {
			
			waitExpectElement(nao);
			sleep(2000);
			nao.click();
			sleep(2000);
			waitExpectElement(siguiente);
			sleep(2000);
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			
			idInserir("GestaoCréditoTributárioCOFINSRegistro1501",id2);
			int idD = convertToInt(idRegistro);
			int id2D = convertToInt(id2);
			
			System.out.println(idD);
			System.out.println(id2D);
			
			boolean sucesso = false;
			if (idD < id2D) {
				sucesso = true;
			}
			
			System.out.println(sucesso);
			
			return sucesso;
			
		}else {
				
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GestaoCréditoTributárioCOFINSRegistro1501",id2);
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
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

	
}
