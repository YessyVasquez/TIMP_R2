package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM105;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM105EditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM105\"]")
	public WebElement registroM105;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"cstPis\"]/div/div/input")
	public WebElement CódigoSituaçãoTributáriaReferenteAOPIS;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//Button[text()=\"Sim\"]")
	public WebElement sim;
	
	public RegistroM105EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuraçãoCrédito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM105.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM105");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		waitExpectElement(CódigoSituaçãoTributáriaReferenteAOPIS);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		String valor = CódigoSituaçãoTributáriaReferenteAOPIS.getAttribute("value");
		System.out.println(valor);
		
		String enviado = "11";
		System.out.println(enviado);
		
		CódigoSituaçãoTributáriaReferenteAOPIS.clear();
		sleep(4000);
		CódigoSituaçãoTributáriaReferenteAOPIS.sendKeys(enviado);
		sleep(4000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(8000);
		waitExpectElement(CódigoSituaçãoTributáriaReferenteAOPIS);
		sleep(20000);
		
		String nuevoTexto = CódigoSituaçãoTributáriaReferenteAOPIS.getAttribute("value");
		/*System.out.println(valor);*/
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.contains(enviado);
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
