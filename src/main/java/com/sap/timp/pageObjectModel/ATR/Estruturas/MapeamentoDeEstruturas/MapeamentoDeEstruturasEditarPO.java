package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeEstruturasEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapeamentodeestruturas;
	
	@FindBy(xpath = "//div[@class=\"input taxMap\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicio;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-05\"]")
	public WebElement cofins;
	
	
	public MapeamentoDeEstruturasEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		sleep(2000);
		mapeamentodeestruturas.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MapeamentoDeEstruturasCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");
		sleep(5000);
		
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		String enviar = "02/01/1977";
		datainicio.clear();
		sleep(2000);
		datainicio.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(cofins);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String data = datainicio.getAttribute("value");
		String tributocofins = cofins.getText();
		String enviar1 = "COFINS";
		
		System.out.println(data);
		System.out.println(tributocofins);
		
		sucesso.add(data.equals(enviar));
		sucesso.add(tributocofins.contains(enviar1));
		
		System.out.println(sucesso);
		
		return sucesso;
	}


}
