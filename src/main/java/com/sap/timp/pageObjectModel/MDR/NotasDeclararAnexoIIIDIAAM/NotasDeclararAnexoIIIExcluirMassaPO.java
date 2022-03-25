package com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NotasDeclararAnexoIIIExcluirMassaPO extends TestBaseSteven {

	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/div/span[text()=\"Notas a Declarar Anexo III DIA-AM\"]")
	public WebElement menuNotasDeclararAnexo;
	
	@FindBy(xpath = "//span[text()=\"Nova Notas a Declarar\"]")
	public WebElement btnNovaNotasDeclarar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
	@FindBy(xpath = "//div[@id=\"ieDeclarantTaxpayer\"]/div/div/input")
	public WebElement inputInscricaoEstadual;
	
	@FindBy(xpath = "//div[@id=\"presentationYear\"]/div/div/input")
	public WebElement inputAnoDeApresentacao;
	
	@FindBy(xpath = "//div[@id=\"presentationMonth\"]/div/div/input")
	public WebElement inputMesApresentacao;
	
	@FindBy(xpath = "//div[@id=\"notesNumber\"]/div/div/input")
	public WebElement inputNumeroNotas;
	
	@FindBy(xpath = "//div[@id=\"orderNoteNumber\"]/div/div/input")
	public WebElement inputNumeroOrdemNota;
	
	@FindBy(xpath = "//div[@id=\"presentationDanfeDate\"]/div/div/span")
	public WebElement inputDataApresentacaoDoDanfe;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[17]")
	public WebElement dataApresentacao;

	@FindBy(xpath = "//div[@id=\"NFeKey\"]/div/div/input")
	public WebElement inputChaveNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@id=\"itemsNumber\"]/div/div/input")
	public WebElement inputNumeroItensNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@id=\"idCompany\"]/div/div/div[2]")
	public WebElement cboCodigoEmpresa;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"NFeItemNumber\"]/div/div/input")
	public WebElement inputNumeroDoItemNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@id=\"idBranch\"]/div/div/div[2]")
	public WebElement cboCodigoDeFilial;
	
	@FindBy(xpath = "//div[@id=\"cst\"]/div/div/input")
	public WebElement inputCodigoDeSituacaoTributaria;
	
	@FindBy(xpath = "//div[@id=\"NFeProductCod\"]/div/div/input")
	public WebElement inputCodigoDoProductoNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@id=\"productDesc\"]/div/div/input")
	public WebElement inputDescricaoDoProducto;
	
	@FindBy(xpath = "//div[@id=\"codEAN\"]/div/div/input")
	public WebElement inputCodigoEAN;
	
	@FindBy(xpath = "//div[@id=\"codNCM\"]/div/div/input")
	public WebElement inputCodigoNCM;
	
	@FindBy(xpath = "//div[@id=\"NFeItemValue\"]/div/div/input")
	public WebElement inputValorDoItemDaNotaFiscal;
	
	//@FindBy(xpath = "//div[@id=\"codIntProduct\"]/div/div/input")
	//public WebElement inputCodigoInternoProducto;
	
	@FindBy(xpath = "//div[@id=\"codTribProduct\"]/div/div/input")
	public WebElement inputCodigoDeTributacaoProducto;
	
	@FindBy(xpath = "//div[@id=\"valueMult\"]/div/div/input")
	public WebElement inputValorMultipicado;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public NotasDeclararAnexoIIIExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	String idR1 = "";
	String idR2 = "";
	
	public boolean criar() {
		sleep(2000);
		menuNotasDeclararAnexo.click();
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
		
		btnNovaNotasDeclarar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputInscricaoEstadual.click();
		inputInscricaoEstadual.sendKeys("123456");
		sleep(1000);
		
		inputAnoDeApresentacao.click();
		inputAnoDeApresentacao.sendKeys(anioActual());
		sleep(1000);
		
		inputMesApresentacao.click();
		inputMesApresentacao.sendKeys("10");
		sleep(1000);
		
		inputNumeroNotas.click();
		inputNumeroNotas.sendKeys("12");
		sleep(1000);
		
		inputNumeroOrdemNota.click();
		inputNumeroOrdemNota.sendKeys("1234");
		sleep(1000);
		
		inputDataApresentacaoDoDanfe.click();
		sleep(1000);
		dataApresentacao.click();
		sleep(1000);
		
		inputChaveNotaFiscalElectronica.click();
		inputChaveNotaFiscalElectronica.sendKeys("123");
		sleep(1000);
		
		inputNumeroItensNotaFiscalElectronica.click();
		inputNumeroItensNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		cboCodigoEmpresa.click();
		opcionCombo.click();
		sleep(1000);
		
		inputNumeroDoItemNotaFiscalElectronica.click();
		inputNumeroDoItemNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		cboCodigoDeFilial.click();
		opcionCombo.click();
		sleep(1000);
		
		inputCodigoDeSituacaoTributaria.click();
		inputCodigoDeSituacaoTributaria.sendKeys("1");
		sleep(1000);
		
		inputCodigoDoProductoNotaFiscalElectronica.click();
		inputCodigoDoProductoNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		inputDescricaoDoProducto.click();
		inputDescricaoDoProducto.sendKeys("Tester");
		sleep(1000);
		
		inputCodigoEAN.click();
		inputCodigoEAN.sendKeys("teste test");
		sleep(1000);
		
		inputCodigoNCM.click();
		inputCodigoNCM.sendKeys("15");
		sleep(1000);
		
		inputValorDoItemDaNotaFiscal.click();
		inputValorDoItemDaNotaFiscal.sendKeys("12345");
		sleep(1000);
		
		inputCodigoDeTributacaoProducto.click();
		inputCodigoDeTributacaoProducto.sendKeys("2");
		sleep(1000);
		
		inputValorMultipicado.click();
		inputValorMultipicado.sendKeys("3");
		sleep(1000);
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(inputInscricaoEstadual);
		sleep(2000);
		
		inputInscricaoEstadual.click();
		inputInscricaoEstadual.sendKeys("123456");
		sleep(1000);
		
		inputAnoDeApresentacao.click();
		inputAnoDeApresentacao.sendKeys(anioActual());
		sleep(1000);
		
		inputMesApresentacao.click();
		inputMesApresentacao.sendKeys("10");
		sleep(1000);
		
		inputNumeroNotas.click();
		inputNumeroNotas.sendKeys("12");
		sleep(1000);
		
		inputNumeroOrdemNota.click();
		inputNumeroOrdemNota.sendKeys("1234");
		sleep(1000);
		
		inputDataApresentacaoDoDanfe.click();
		sleep(1000);
		dataApresentacao.click();
		sleep(1000);
		
		inputChaveNotaFiscalElectronica.click();
		inputChaveNotaFiscalElectronica.sendKeys("123");
		sleep(1000);
		
		inputNumeroItensNotaFiscalElectronica.click();
		inputNumeroItensNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		cboCodigoEmpresa.click();
		opcionCombo.click();
		sleep(1000);
		
		inputNumeroDoItemNotaFiscalElectronica.click();
		inputNumeroDoItemNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		cboCodigoDeFilial.click();
		opcionCombo.click();
		sleep(1000);
		
		inputCodigoDeSituacaoTributaria.click();
		inputCodigoDeSituacaoTributaria.sendKeys("1");
		sleep(1000);
		
		inputCodigoDoProductoNotaFiscalElectronica.click();
		inputCodigoDoProductoNotaFiscalElectronica.sendKeys("15");
		sleep(1000);
		
		inputDescricaoDoProducto.click();
		inputDescricaoDoProducto.sendKeys("Tester");
		sleep(1000);
		
		inputCodigoEAN.click();
		inputCodigoEAN.sendKeys("teste test");
		sleep(1000);
		
		inputCodigoNCM.click();
		inputCodigoNCM.sendKeys("15");
		sleep(1000);
		
		inputValorDoItemDaNotaFiscal.click();
		inputValorDoItemDaNotaFiscal.sendKeys("12345");
		sleep(1000);
		
		inputCodigoDeTributacaoProducto.click();
		inputCodigoDeTributacaoProducto.sendKeys("2");
		sleep(1000);
		
		inputValorMultipicado.click();
		inputValorMultipicado.sendKeys("3");
		sleep(1000);
		sleep(1000);
		
		sleep(2000);
		
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		rows = rows("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]");
		
		String idU = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idR1 = idU;
		sleep(1000);
		System.out.println("Último ID após a criação: " +idU);
		
		rows = rows-1;
		String idP = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idR2 = idP;
		sleep(1000);
		System.out.println("Penultimo ID após a criação: " +idP);
		
		
		int idI = convertToInt(id);
		int idUI = convertToInt(idU);
		int idPI = convertToInt(idP);
		

		boolean sucesso = false;
		
		if (idI < idUI && idI < idPI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
		
		
		
		
	}
	
	
	public boolean excluir() {
		
		sleep(2000);
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id=\""+idR1+"\"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id=\""+idR2+"\"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		aceitar.click();
		
		
		invisibilityOfElementOverlay();
		
		refresh();
		
		sleep(2000);
		waitExpectElement(menuNotasDeclararAnexo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuNotasDeclararAnexo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);

		System.out.println("Ultimo Registro: "+idR1);
		System.out.println("Penultimo Registro: "+idR2);
		
		double idD = convertToDouble(idB);
		double idU = convertToDouble(idR1);
		double idP = convertToDouble(idR2);
		
		
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idU > idD && idP > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
		
		
		
		
		
	}
}
