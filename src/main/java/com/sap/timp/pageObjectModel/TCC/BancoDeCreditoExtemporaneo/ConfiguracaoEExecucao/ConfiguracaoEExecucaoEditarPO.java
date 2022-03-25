package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracaoEExecucaoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"initialDate\"]/div/div/input")
	public WebElement inputInicioDeVigencia;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public ConfiguracaoEExecucaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		invisibilityOfElementOverlay();
		bancoCreditoExtemporaneo.click();
		sleep(1000);
		
		configuracaoEExecucao.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		//String idRegistro = idObter4();
		String idRegistro = idObter("idConfiguracaoEExecucaco");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(inputInicioDeVigencia);

		sleep(12000);

		
		
		attributoNotToBeEmptyElement(inputInicioDeVigencia, "value");
		
		String valorOriginal = inputInicioDeVigencia.getAttribute("value");
		System.out.println("");
		System.out.println("Inicio de Vigencia original: " + valorOriginal);
		
		String valorAEnviar = fechaManana();
		System.out.println("");
		System.out.println("Inicio de Vigencia valor a enviar: " + valorAEnviar);
		
		inputInicioDeVigencia.clear();
		sleep(2000);
		inputInicioDeVigencia.sendKeys(fechaManana());
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElementOverlay();
		waitExpectElement(inputInicioDeVigencia);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		attributoNotToBeEmptyElement(inputInicioDeVigencia, "value");
		String valorEditado = inputInicioDeVigencia.getAttribute("value");
		System.out.println("");
		System.out.println("Inicio de Vigencia valor editado: " + valorEditado);
		
		boolean sucesso = false;
		
		if(valorEditado.equals(valorAEnviar)) {
			System.out.println("Registro editado correctamente...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		return sucesso;
	}
}
