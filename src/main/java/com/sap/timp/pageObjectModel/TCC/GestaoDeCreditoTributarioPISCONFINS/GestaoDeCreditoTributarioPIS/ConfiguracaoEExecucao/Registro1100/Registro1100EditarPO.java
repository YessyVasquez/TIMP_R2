package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Registro1100EditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1100\"]")
	public WebElement registro1100;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"origCred\"]/div/div/div[2]")
	public WebElement origen;
	
	@FindBy(xpath = "//div[@id=\"origCred\"]/div/div[1]/div[1]/input")
	public WebElement origenInput;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement opc;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//Button[text()=\"Sim\"]")
	public WebElement sim;
	
	public Registro1100EditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(4000);
		registro1100.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1100");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		//waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String valor =origenInput.getAttribute("value");
		System.out.println(valor);
		
		origen.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String enviado =origenInput.getAttribute("value");
		System.out.println(enviado);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto = origenInput.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviado);
		System.out.println(sucesso);
		
		return sucesso;
	}
	
}
