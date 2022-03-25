package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoExecutarPO extends TestBaseMassiel{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceExecuted\"]")
	public WebElement executados;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//td[@id=\"companyInput\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and @id][1]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@class= \"list-option\"][1]/div/div[2]")
	public WebElement opcionCheck;
	
	@FindBy(xpath = "//td[@id=\"stateInput\"]/div/div/div[2]")
	public WebElement cboEstado;
	
	@FindBy(xpath = "//td[@id=\"branchInput\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//td[@id=\"subInput\"]/div/div/span")
	public WebElement inputSubperiodo;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement btnExecutar2;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ConfiguracaoEExecucaoExecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean executar() {
		invisibilityOfElementOverlay();
		bancoCreditoExtemporaneo.click();
		sleep(1000);
		
		executados.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String idUltimoRegistroExecutado = "0"; // Ultimo ID 
		
		if(rows > 0) {
			idUltimoRegistroExecutado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro Executado: " + idUltimoRegistroExecutado);
		}
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElementOverlay();

		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistroConfiguracaoEExecucao = idObter("idConfiguracaoEExecucaco");
		System.out.println("");
		System.out.println("ID Registro Configuracao execucaco: " + idRegistroConfiguracaoEExecucao);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroConfiguracaoEExecucao+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroConfiguracaoEExecucao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExecutar.click();
		invisibilityOfElementOverlay();
		
		waitExpectElement(cboEmpresa);
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		
		attributeToBeXpath("//td[@id=\"stateInput\"]/div", "class", "base-MultipleSelect3 required");
		cboEstado.click();
		sleep(1000);
		opcionCheck.click();
		closeSelectTypeCheckbox(cboEstado);
		sleep(1000);
		
		attributeToBeXpath("//td[@id=\"branchInput\"]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		opcionCheck.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		actionsMoveToElementElement(inputSubperiodo);

		inputSubperiodo.click();
		sleep(2000);

		WebElement flechaAtrasCalendario = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaAtrasCalendario.click();

		String anio = "2016";

		WebElement anioCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"" + anio + "\"]"));
		anioCalendar.click();
		sleep(3000);

		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendar.click();
		sleep(3000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);

		btnExecutar2.click();
		sleep(1000);
		
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String idUltimoRegistroExecutados = "0"; // Ultimo ID de Executado luego de Executar el registro de configuracao
		
		if(rows > 0) {
			idUltimoRegistroExecutados = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro Executados despues de Executar registro de configuracao: " + idUltimoRegistroExecutados);
		}
		
		boolean sucesso = false;
		
		if(convertToInt(idUltimoRegistroExecutados) > convertToInt(idUltimoRegistroExecutado)) {
			System.out.println("Registro executado correcctamente..."+ idUltimoRegistroExecutados);
			idInserir("idResultadoDeExecucaco",idUltimoRegistroExecutados);
			//idInserir3(idUltimoRegistroExecutados);
			
			sucesso = true;
		}else {
			System.out.println("No se executo el registro...");
		}
		
		return sucesso;
	}
}
