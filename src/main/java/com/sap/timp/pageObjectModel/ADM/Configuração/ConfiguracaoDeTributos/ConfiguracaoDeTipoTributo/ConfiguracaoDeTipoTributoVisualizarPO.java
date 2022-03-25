package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoDeTipoTributoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;
	

	@FindBy(xpath = "//span[text()=\"Configuração de Tipo Tributo \"]")
	public WebElement configuracaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[@id=\"cod-tax-type\"]")
	public WebElement codigotributotipovi;
	
	@FindBy(xpath = "//span[@id=\"cod-tax-group\"]")
	public WebElement codigotributogrupovi;
	
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo tipo\"]")
	public WebElement codigotributotipo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo grupo\"]")
	public WebElement codigotributogrupo;

	
	public ConfiguracaoDeTipoTributoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotipotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguracaoDeTipoTributo");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigotributotipovisualizar = codigotributotipovi.getText();
		String codigotributogrupovisualizar = codigotributogrupovi.getText();
		
		
		System.out.println(codigotributotipovisualizar);
		System.out.println(codigotributogrupovisualizar);
		
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(primeira);
		sleep(2000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigotributotipoeditar = codigotributotipo.getAttribute("value");
		String codigotributogrupoeditar = codigotributogrupo.getAttribute("value");
		
		System.out.println(codigotributotipoeditar);
		System.out.println(codigotributogrupoeditar);
		

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(codigotributotipoeditar.equals(codigotributotipovisualizar));
		sucesso.add(codigotributogrupoeditar.equals(codigotributogrupovisualizar));
		
		
	//	System.out.println(sucesso);
		return sucesso;

	}

}
