package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO extends TestBaseKenssy {

	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRates\"]")
	public WebElement taxasDeActualizacao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRateConfiguration\"]")
	public WebElement configuracaoDeTipoTaxa;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Tipo Taxa de Atualização\"]")
	public WebElement btnNovoConfiguracao;
	
	@FindBy(xpath = "//div[contains(@class, \"indexCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoNoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexName\")]/div/div[2]/div/div/div[2]/input")
	public WebElement nomeDoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexDescription\")]/div/div[2]/div/div/div[2]/input")
	public WebElement descricaoDoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexType\")]/div/div[2]/div/div/div[2]/input")
	public WebElement tipoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"coinIndex\")]/div/div[2]/div/div/div[2]/input")
	public WebElement moedaIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexStartDate\")]/div/div/input")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//div[contains(@class, \"indexEndDate \")]/div/div/input")
	public WebElement dataFimVigencia;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	public ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		taxasDeActualizacao.click();
		
		sleep(1000);
		configuracaoDeTipoTaxa.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		
		
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(idRegistro);		
				
		
		//NUEVO REGISTRO
		btnNovoConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		for (int i = 0; i < 2; i++) {
			codigoNoIndice.click();
			sleep(1000);
			codigoNoIndice.sendKeys("00001");
			sleep(2000);
			
			nomeDoIndice.click();
			sleep(1000);
			nomeDoIndice.sendKeys("Tester");
			sleep(2000);
			
			descricaoDoIndice.click();
			sleep(1000);
			descricaoDoIndice.sendKeys("Automatizacao tester");
			sleep(2000);
			
			tipoIndice.click();
			sleep(1000);
			tipoIndice.sendKeys("1");
			sleep(2000);
			
			moedaIndice.click();
			sleep(1000);
			moedaIndice.sendKeys("Lps");
			sleep(2000);
			
			dataInicioVigencia.click();
			sleep(1000);
			dataInicioVigencia.sendKeys(fechaActual());
			sleep(2000);
			
			dataFimVigencia.click();
			sleep(1000);
			dataFimVigencia.sendKeys(fechaActual());
			sleep(2000);
			
			gravareNovo.click();
			sleep(2000);
			
			waitExpectElement(btnSim);
			btnSim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);	
		}
		
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		
		rows1 = rows+1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(idRegistro);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(idRegistro);
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
	
	public boolean configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa() {
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
		btnPrimerPagina.click();
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
