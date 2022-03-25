package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSExecutarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsExecution\"]")
	public WebElement executadosPainelCréditoICMS;
	
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
	
	public ConfiguracaoEExecucaoPainelCreditoICMSExecutarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Executar() {
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		executadosPainelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		//int rows = rows("//div[@class=\"tr\" and @data-id]");
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoExcecutado = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			idUltimoExcecutado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("Id ultimo registro Executado: " + idUltimoExcecutado);
		}
		
//		String idUltimoExcecutado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
//		System.out.println("Id ultimo registro Executado: " +idUltimoExcecutado);
//		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		painelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String idRegistro = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucaco");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement Executar= driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		menu.click();
		sleep(1000);
		Executar.click();
		sleep(2000);
		waitExpectElement(btnExecutar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
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
		sleep(3000);
		
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
		sleep(6000);
		
		actionsMoveToElementElement(executados);
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		executadosPainelCréditoICMS.click();
		//invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String idUltimoRegistroExecutados = "0"; // Ultimo ID de Executado luego de Executar el registro de configuracao
		
		if(rows > 0) {
			idUltimoRegistroExecutados = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro Executados despues de Executar registro de configuracao: " + idUltimoRegistroExecutados);
		}
		
		boolean sucesso = false;
		
		if(convertToInt(idUltimoRegistroExecutados) > convertToInt(idUltimoExcecutado)) {
			System.out.println("Registro executado correcctamente..."+ idUltimoRegistroExecutados);
			idInserir("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucacoExecutados",idUltimoRegistroExecutados);
			
			sucesso = true;
		}else {
			System.out.println("No se executo el registro...");
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}
}
