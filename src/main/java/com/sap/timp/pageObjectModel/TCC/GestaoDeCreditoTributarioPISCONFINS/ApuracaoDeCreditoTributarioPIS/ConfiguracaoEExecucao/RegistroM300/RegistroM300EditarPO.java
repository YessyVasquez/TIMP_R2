package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM300;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegistroM300EditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM300\"]")
	public WebElement registroM300;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"codCont\"]/div/div/input")
	public WebElement codigoContribuicaoSocialDiferidaPeriodosAnteriores;
	
	public RegistroM300EditarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean editar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gestaoCredito.click();
		sleep(2000);
		
		apuraçãoCrédito.click();
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		
		registroM300.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM300");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opc = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		opc.click();
		sleep(6000);		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoContribucaoSocialDiferidaPeriodosAnterioresText = codigoContribuicaoSocialDiferidaPeriodosAnteriores.getAttribute("value");
		
		System.out.println("Código da contribuição social diferida em períodos anteriores: " + codigoContribucaoSocialDiferidaPeriodosAnterioresText);
		
		boolean sucesso = false;
		if(!codigoContribucaoSocialDiferidaPeriodosAnterioresText.equals("")) {
			sucesso = true;
			System.out.println("Dato confirmado...");
		}else {
			System.out.println("No hay datos en el campo a validar...");
		}
		
		return sucesso;
	}
}
