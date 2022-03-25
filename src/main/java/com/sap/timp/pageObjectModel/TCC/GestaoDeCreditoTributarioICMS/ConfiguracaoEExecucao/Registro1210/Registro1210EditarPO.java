package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;

public class Registro1210EditarPO extends TestBaseFernando {
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"][1]/ul/li/ul/li/div/span[text()=\"Registro 1210\"]")
	public WebElement registro1210;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement cboTipoImposto;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][2]")
	public WebElement opcTipoImposto;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement btnGravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public Registro1210EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {		
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		gestaoCredito.click();
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		
		registro1210.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		String idRegistro = idObter("Registro1210");
//		String idRegistro = "21"; // 2 para TC2, 21 TP1 Descomentar aqui para probar el TA
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		String valorActual = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		System.out.println("Valor actual Controle de Credito: " + valorActual);
		System.out.println("");
		
		sleep(2000);
		cboTipoImposto.click();
		sleep(1000);
		opcTipoImposto.click();
		sleep(1000);

		String valorEnviar = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		System.out.println("Valor enviar Controle de Credito: " + valorEnviar);
		System.out.println("");
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		driver.navigate().refresh();

		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);

		attributoNotToBeEmptyXpath("//div[@id=\"taxType\"]/div/div/div/input", "value");
		
		String valorNuevoEditado = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		System.out.println("Valor nuevo editado Controle de Credito: " + valorNuevoEditado);
		
		boolean sucesso = false;
		
		if(valorNuevoEditado.equals(valorEnviar)) {
			System.out.println("Dato editado satisfactoriamente...");
			sucesso = true;
		} else {
			System.out.println("El dato no fue editado....");
		}
		
		return sucesso;
	}
}
