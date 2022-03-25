package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class IncentivosFiscaisExcluirEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-cadastroIncentivosFiscais\")]/div/span[2]")
	public WebElement subIncentivosFiscais;
	
	@FindBy(xpath = "//span[text()=\"Novo Incentivo Fiscal\"]")
	public WebElement novoIncentivo;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	//SELECT SIN CHECKBOX
	
	@FindBy(xpath="//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTributo;
	
	//SELECT CON CHECKBOX	
		
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcempresa;
	
	@FindBy(xpath ="//*[@id=\"uf\"]/div/div[1]/div[1]")
	public WebElement selecionarUfFilial; 
	
		@FindBy(xpath ="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcselecionarUfFilial; 
		
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[1]")
	public WebElement filial;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilial;	
		
		
	//SELECT NORMAL	
	@FindBy(xpath="//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement seleccionarTipoImposto;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTipoImposto;
		
	@FindBy(xpath="//div[@id=\"taxTypeDetail\"]/div/div/div[2]")
	public WebElement seleccionarDetalheTipoTributo;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcDetalheTipoTributo;	
		
	
	@FindBy(xpath="//div[@id=\"beneficio\"]/div/div/div[2]")
	public WebElement seleccionarNomeDoBeneficio;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcNomeDoBeneficio;	
		
		
	@FindBy(xpath="//div[@id=\"baseCalculo\"]/div/div/div[2]")
	public WebElement seleccionarBaseCalculo;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcBaseCalculo;
	
	@FindBy(xpath="//div[@id=\"iniBeneficio\"]/div/div/input")
	public WebElement inicioBeneficio;
	
	
	@FindBy(xpath="//div[@id=\"fimBeneficio\"]/div/div/input")
	public WebElement fimBeneficio;
	
	
	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	
	@FindBy(xpath="//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath="//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath="//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath="//*[@id=\"table\"]/div/div[2]/div/div[6]")
	public WebElement irFinalPagina;
	
	
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	
	
	
	
	public IncentivosFiscaisExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public Boolean criar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		incentivosFiscais.click();
		sleep(2000);
		
		subIncentivosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ultimo id de la tablas
		
		ultimaPagina.click();
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
		
		//NUEVO REGISTRO
		novoIncentivo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		for (int i = 0; i < 2; i++) {
			tributo.click();
			opcTributo.click();
			opcTributo.sendKeys(Keys.ESCAPE);
			
			
			empresa.click();
			sleep(2000);
			opcempresa.click();
			sleep(2000);
			clickFuera.click();
			
			
			
			selecionarUfFilial.click();
			sleep(2000);
			opcselecionarUfFilial.click();
			sleep(2000);
			clickFuera.click();
			
			
			filial.click();
			sleep(2000);
			opcfilial.click();
			sleep(2000);
			clickFuera.click();
			
			
			seleccionarTipoImposto.click();
			sleep(2000);
			opcTipoImposto.click();
			sleep(8000);
			
//			actionsMoveToElementXpath("//div[@id=\"taxTypeDetail\"][1]/div/div[1]");
//			sleep(2000);
//			attributeToBeXpath("//div[@id=\"taxTypeDetail\"][1]/div/div[1]","class" ,"base-select  disabled");
//			sleep(2000);
			
			seleccionarNomeDoBeneficio.click();
			sleep(2000);
			opcNomeDoBeneficio.click();
			sleep(2000);
			
			System.out.println(opcNomeDoBeneficio);
	//		
	//		
			seleccionarBaseCalculo.click();
			sleep(2000);
			opcBaseCalculo.click();
			sleep(2000);
	//		opcBaseCalculo.sendKeys(Keys.ESCAPE);
	//		sleep(2000);
	
			
			
			inicioBeneficio.sendKeys("11/2020");
			clickFuera.click();
			sleep(2000);
			
			
			fimBeneficio.sendKeys("12/2020");
			clickFuera.click();
			sleep(2000);
			
			sleep(2000);
			gravareNovo.click();
			sleep(2000);
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		}
		
		biblioteca.click();
		sleep(2000);
		no.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimaPagina.click();
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
	
	public Boolean incentivosFiscaisExcluirEmMassa() {
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
