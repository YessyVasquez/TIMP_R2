package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class R1070DadosAdicionaisExcluirEmMassaPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados Adicionais\"]")
	public WebElement R1070DadosAdicionais;

	@FindBy(xpath = "//span[text()=\"New Reinf Dados Adicionais\"]")
	public WebElement Novo;
	
	@FindBy(xpath = "//div[@class=\"field-element company\"]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opc;
	
	@FindBy(xpath = "//div[@class=\"field-element branch\"]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data\"]")
	public WebElement Data;
	
	@FindBy(xpath = "//div[@class=\"field-element processType\"]/div/div[2]/div/div[2]")
	public WebElement tipoProcesso;
	
	@FindBy(xpath = "//div[@class=\"field-element processNumber\"]/div/div[2]/div/div[2]")
	public WebElement numeroProceso;
	
	@FindBy(xpath = "//div[@class=\"field-element suspensionCode\"]/div/div[2]/div/div[2]")
	public WebElement COD_SUSP;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Numero de Inscrição\"]")
	public WebElement NumeroInscrição;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor da Retenção\"]")
	public WebElement ValorRetenção;

	@FindBy(xpath = "//div[@class=\"field-element additional\"]/div/div[2]/div/div[2]")
	public WebElement adicional;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor CP Suspensa\"]")
	public WebElement ValorCPSuspensa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor RAT Suspensa\"]")
	public WebElement ValorRATSuspensa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor SENAR Suspensa\"]")
	public WebElement ValorSENARSuspensa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor CPRB Suspensa\"]")
	public WebElement ValorCPRBSuspensa;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvareNovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public R1070DadosAdicionaisExcluirEmMassaPO() {	
		PageFactory.initElements(driver, this);
	}

	public boolean Criar() {
		sleep(2000);
	
		Reinf.click();
		sleep(4000);
		R1070DadosAdicionais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	
		System.out.println(id);
	
		sleep(2000);
		//criaçao
		Novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		empresa.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(2000);
	
		opcFilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataatual = fechaActual();
		Data.sendKeys(dataatual);
		
		tipoProcesso.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		numeroProceso.click();
		sleep(3000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		COD_SUSP.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		NumeroInscrição.sendKeys("1");
		sleep(2000);
		
		ValorRetenção.sendKeys("1");
		sleep(2000);
		
		adicional.click();
		sleep(3000);
	
		opcFilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ValorCPSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorRATSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorSENARSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorCPRBSuspensa.sendKeys("1");
		sleep(2000);
		
		salvareNovo.click();
		sleep(2000);
		
		butaosim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//SEGUNDO REGISTRO
		Novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		empresa.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(2000);
	
		opcFilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataatual2 = fechaActual();
		Data.sendKeys(dataatual2);
		
		tipoProcesso.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		numeroProceso.click();
		sleep(3000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		COD_SUSP.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		NumeroInscrição.sendKeys("1");
		sleep(2000);
		
		ValorRetenção.sendKeys("1");
		sleep(2000);
		
		adicional.click();
		sleep(3000);
	
		opcFilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ValorCPSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorRATSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorSENARSuspensa.sendKeys("1");
		sleep(2000);
		
		ValorCPRBSuspensa.sendKeys("1");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		butaosim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(biblioteca);
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		//Pega o ultimo id depois do preenchimento
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows -1;
		String id3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		


		//idInserir("ProcessosAdmJudiciaisExcluirEmMassa",id2);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		int id3D = Integer.valueOf(id3);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D && idD < id3D ) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
	public boolean excluirEmMassa() {
		
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
		
		System.out.println("Ids Excluidos com sucesso: " +sucesso);
	
		return sucesso;
		
	}
}
