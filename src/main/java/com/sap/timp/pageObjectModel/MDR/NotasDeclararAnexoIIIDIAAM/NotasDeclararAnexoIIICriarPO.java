package com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class NotasDeclararAnexoIIICriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/div/span[text()=\"Notas a Declarar Anexo III DIA-AM\"]")
	public WebElement menuNotasDeclararAnexo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Notas a Declarar\"]")
	public WebElement btnNovaNotasDeclarar;
	
	// Input
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
	
	@FindBy(xpath = "//div[@tabindex=\"0\" and contains(@class,\"today\")]")
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
	public WebElement btnSim;
	
	public NotasDeclararAnexoIIICriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarNotasDeclararAnexoIIICriar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuNotasDeclararAnexo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		// Esto se hace por si al llegar a la tabla de registros no hay nada
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
	    
		System.out.println(id);			
		sleep(2000);
		
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
		
		sleep(1000);
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); rows = driver.findElements(By.
		xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("NotasDeclararAnexoIII",idB);
		
		
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		int idD = Integer.valueOf(id); 
		int idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
}