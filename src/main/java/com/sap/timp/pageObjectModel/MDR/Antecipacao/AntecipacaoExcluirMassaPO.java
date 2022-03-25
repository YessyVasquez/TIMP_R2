package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AntecipacaoExcluirMassaPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//div[@id=\"container\"]/div[1]/div/div/ul/li[1]/button")
	public WebElement novaAntecipacao;
	
	@FindBy(xpath = "//div[@id=\"content-list\"]/div[1]/div/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@id=\"empresa\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//li[text()=\"SP\"]")
	public WebElement ufFilialO;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@id=\"tributo\"]/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipoTributo;

	@FindBy(xpath = "//div[@id=\"detalheTipoTributo\"]/div/div[2]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@id,\"Antecipacao\")]/div/div/input")
	public WebElement antecipacaoC;
	
	@FindBy(xpath = "//div[@id=\"parcela\"]/div/div/input")
	public WebElement parcela;
	
	@FindBy(xpath = "//div[@id=\"baseAntecipacao\"]/div/div[2]")
	public WebElement base;

	@FindBy(xpath = "//div[@id=\"linhaDeducao\"]/div/div[2]")
	public WebElement linha;

	@FindBy(xpath = "//div[@id=\"codRegLancSped\"]/div/div/div[2]")
	public WebElement lancamento;

	@FindBy(xpath = "//div[@id=\"modRelatorio\"]/div/div/div[2]")
	public WebElement modelo;

	@FindBy(xpath = "//div[@id=\"dtInicio\"]/div/div[1]/input")
	public WebElement data;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement biblioteca;
	
	//BOTON EXCLUIR EN MASA
		@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
		public WebElement excluirMassa;

		@FindBy(xpath = "//button[text()=\"Aceitar\"]")
		public WebElement aceitar;

	
	public AntecipacaoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	

	public boolean criarAntecipacao() {
		
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
		
		
		antecipacao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);

		novaAntecipacao.click();
		sleep(2000);
		//attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		sleep(12000);
		
		empresa.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
	
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		ufFilial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//*[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
	//	attributeToBeXpath("//*[@id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoTributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		detalhe.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		antecipacaoC.sendKeys("20");
		sleep(1000);
		parcela.sendKeys("12");
		sleep(2000);
		
		base.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		linha.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		lancamento.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		modelo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		String dataH = fechaActual();
		
		data.sendKeys(dataH);
		sleep(2000);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sleep(2000);
		sim.click();
		sleep(4000);
		
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		novaAntecipacao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		sleep(5000);
		
		sleep(2000);
		empresa.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
	
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		ufFilial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//*[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		attributeToBeXpath("//*[@id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoTributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		detalhe.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		antecipacaoC.sendKeys("20");
		sleep(1000);
		parcela.sendKeys("12");
		sleep(2000);
		
		base.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		linha.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		lancamento.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		modelo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		String dataH1 = fechaActual();
		
		data.sendKeys(dataH1);
		sleep(2000);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sleep(2000);
		sim.click();
		sleep(4000);
		
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
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
	
	public boolean ExcluirMasas() {
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
		sleep(2000);
		sleep(4000);
		
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
