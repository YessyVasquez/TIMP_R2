package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1210PagamentosDeRendimientosDoTrabalhoCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-paymentsIncomeFromWork\"]")
	public WebElement subMenuPagamentosDeRendimientosDoTrabalho;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"container\"]/div/div/div/ul/li/button/span[2]")
	public WebElement btnDadosBasicos;
	
	@FindBy(xpath = "//div[@id=\"COMPANY\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"EVENT_TYPE\"]/div/div/input")
	public WebElement tipoDeEvento;
	
	@FindBy(xpath = "//div[@id=\"STATUS\"]/div/div/input")
	public WebElement status;
	
	@FindBy(xpath = "//div[@id=\"TP_AMB\"]/div/div/div[2]")
	public WebElement cboTipoDeAmbiente;
	
	@FindBy(xpath = "//div[@id=\"TP_INSC_EVT\"]/div/div/input")
	public WebElement inscTipoEvento;
	
	@FindBy(xpath = "//div[@id=\"NR_RECIBO\"]/div/div/input")
	public WebElement nrRecibo;
	
	@FindBy(xpath = "//div[@id=\"PER_APUR\"]/div/div/input")
	public WebElement periodoDeApuracao;
	
	@FindBy(xpath = "//div[@id=\"VERSAO\"]/div/div/input")
	public WebElement versão;
	
	@FindBy(xpath = "//div[@id=\"LOGSYS\"]/div/div/input")
	public WebElement logSys;

	@FindBy(xpath = "//div[@id=\"VER_PROC\"]/div/div/input")
	public WebElement versãoDoProcesso;
	
	@FindBy(xpath = "//div[@id=\"NR_INSC_EVT\"]/div/div/input")
	public WebElement nrInscEvent;
	
	@FindBy(xpath = "//div[@id=\"IND_APUR\"]/div/div/div[2]")
	public WebElement cboIndicativoApuração;
	
	@FindBy(xpath = "//div[@id=\"PROC_EMI\"]/div/div/div[2]")
	public WebElement cboProcessoDeEmissão;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public S1210PagamentosDeRendimientosDoTrabalhoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuPagamentosDeRendimientosDoTrabalho.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		String[] idArray = idRegistro.split("_");
		String id = idArray[3];
		System.out.println(id);			
		sleep(2000);	
		
		btnDadosBasicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);;
		
		tipoDeEvento.click();
		sleep(1000);
		tipoDeEvento.sendKeys("55545");
		sleep(2000);
		
		status.click();
		sleep(1000);
		status.sendKeys("15");
		sleep(2000);
		
		cboTipoDeAmbiente.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		inscTipoEvento.click();
		sleep(1000);
		inscTipoEvento.sendKeys("1");
		sleep(2000);
		
		nrRecibo.click();
		sleep(1000);
		nrRecibo.sendKeys("555523");
		sleep(2000);
		
		periodoDeApuracao.click();
		sleep(1000);
		periodoDeApuracao.sendKeys("10/2020");
		sleep(2000);
		
		versão.click();
		sleep(1000);
		versão.sendKeys("123");
		sleep(2000);
		
		logSys.click();
		sleep(1000);
		logSys.sendKeys("553456");
		sleep(2000);
		
		versãoDoProcesso.click();
		sleep(1000);
		versãoDoProcesso.sendKeys("15345");
		sleep(2000);
		
		nrInscEvent.click();
		sleep(1000);
		nrInscEvent.sendKeys("153452");
		sleep(2000);
		
		cboIndicativoApuração.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		cboProcessoDeEmissão.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(1000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		//conta o numero de linhas	
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();		
		String[] idArray1 = idRegistro1.split("_");
		String idB = idArray1[3];
		idInserir("S1210PagamentosDeRendimientosDoTrabalho",idB);
		System.out.println(idB);			
		sleep(2000);
		  
		int idD = Integer.parseInt(id); 
		int idBD = Integer.parseInt(idB);
		
		System.out.println("-----------------------------");
		System.out.println(idD); 
		System.out.println(idBD);
		sleep(2000);
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
}
