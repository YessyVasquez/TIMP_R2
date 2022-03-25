package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosEditarPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath="//button[text()=\"Não\"]")
	public WebElement  nao;

	@FindBy(xpath = "//div[@id=\"webServiceId\"]/div/div/div/input")
	public WebElement numeroProcesso;
	
	@FindBy(xpath="//div[@id=\"webServiceId\"]/div/div/div[2]")
	public WebElement servicioWeb;
			
		@FindBy(xpath="//li[@id][2]")
		public WebElement opcServicioWeb;
		
	public SaldosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idCentralizacaoSaldos");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		waitExpectElement(numeroProcesso);
		sleep(2000);
		
		String valor = numeroProcesso.getAttribute("value");
		System.out.println("dato antes editar: "+valor);
		sleep(2000);
		
		servicioWeb.click();
		sleep(2000);
		opcServicioWeb.click();
		sleep(2000);
		
		String enviar = numeroProcesso.getAttribute("value");
		System.out.println("dato a editar: "+enviar);
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(numeroProcesso);
		sleep(2000);
	
		
		String nuevoTexto = numeroProcesso.getAttribute("value");
		System.out.println("nuevo texto: "+nuevoTexto);

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}
}
