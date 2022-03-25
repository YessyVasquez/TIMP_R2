package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class AliquotasDeTaxaDeActualizacaoExcluirEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement taxasActualizacao;
	
	@FindBy(xpath = "//span[text()=\"Alíquotas de Taxa de Atualização\"]")
	public WebElement aliquotas;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"indexCode\"]/div/div/div/input")
	public WebElement codigo;
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement codigoO;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor\"]")
	public WebElement valor;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor Período\"]")
	public WebElement valorPeriodo;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Fator Acumulado\"]")
	public WebElement fatorAcum;
	@FindBy(xpath = "//input[@placeholder=\"Prencher a Taxa\"]")
	public WebElement taxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Início da Taxa\")]")
	public WebElement inicioTaxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Fim da Taxa\")]")
	public WebElement finTaxa;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Divulgação da Taxa\")]")
	public WebElement dataDivulgacion;	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Atualização da Taxa\")]")
	public WebElement dataActualizacion;		

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
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	
	@FindBy(xpath = "//*[@id=\"indexCode\"]/div/div[1]/div[2]")
	public WebElement codigoIndice;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcCodigoIndice;
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	public AliquotasDeTaxaDeActualizacaoExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		sleep(2000);
		taxasActualizacao.click();
		sleep(2000);
		aliquotas.click();
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
		sleep(2000);
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

			
		

		valor.sendKeys("987");
		sleep(1000);

		fatorAcum.sendKeys("765");
		sleep(1000);

		taxa.sendKeys("432");
		sleep(1000);

		valorPeriodo.sendKeys("3318");
		sleep(1000);

		String data = fechaActual();
		inicioTaxa.sendKeys(data);
		sleep(1000);

		String data1 = fechaManana();
		finTaxa.sendKeys(data1);
		sleep(1000);

		String data2 = fechaManana();
		dataDivulgacion.sendKeys(data2);
		sleep(1000);

		String data3 = fechaManana();
		dataActualizacion.sendKeys(data3);
		sleep(1000);
		
		codigo.click();
		sleep(1000);
		codigoO.click();
		sleep(1000);
	
		
		gravar.click();
		
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();
		
		waitExpectElement(novo);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

			
		

		valor.sendKeys("900");
		sleep(1000);

		fatorAcum.sendKeys("450");
		sleep(1000);

		taxa.sendKeys("420");
		sleep(1000);

		valorPeriodo.sendKeys("4455");
		sleep(1000);


		inicioTaxa.sendKeys(data);
		sleep(1000);


		finTaxa.sendKeys(data1);
		sleep(1000);


		dataDivulgacion.sendKeys(data2);
		sleep(1000);


		dataActualizacion.sendKeys(data3);
		sleep(1000);
		
		codigo.click();
		sleep(1000);
		codigoO.click();
		sleep(1000);
	
		
		gravar.click();
		
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(3000);
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
