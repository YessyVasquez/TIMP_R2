package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1700;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Registro1700EditarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário COFINS\"]")
	public WebElement gestaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1700\"]")
	public WebElement registro1700;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div[1]/div[2]")
	public WebElement indicadordeNatureza;
	
	@FindBy(xpath = "//li[@id=\"02\"]")
	public WebElement OPC;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement OPC1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div[1]/div[1]/input")
	public WebElement indicadordeNaturezaInput;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//Button[text()=\"Sim\"]")
	public WebElement sim;
	
	public Registro1700EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1700.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestionCreditoTributarioCONFINSRegistro1700");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		//waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		String valor = indicadordeNaturezaInput.getAttribute("value");
		System.out.println(valor);
		
		indicadordeNatureza.click();
		sleep(2000);
		
		if (tc2 == true) {

			OPC1.click();
			sleep(2000);
			
		} else if(tq1 == true) {
			OPC.click();
			sleep(2000);
			
		}else {
			OPC1.click();
			sleep(2000);
		}
		
		String enviado = indicadordeNaturezaInput.getAttribute("value");
		System.out.println(enviado);
		sleep(8000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(indicadordeNaturezaInput);
		sleep(12000);
		
		String nuevoTexto = indicadordeNaturezaInput.getAttribute("value");
		/*System.out.println(valor);*/
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.contains(enviado);
		System.out.println(sucesso);
		
		return sucesso;
	}
}
