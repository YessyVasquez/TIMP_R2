package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoDeTributoVisualizarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;
	

	@FindBy(xpath = "//span[text()=\"Configuração de tributo\"]")
	public WebElement configuracaotributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[@id=\"country\"]")
	public WebElement paisvi;
	
	@FindBy(xpath = "//span[@id=\"cod-tax\"]")
	public WebElement codigotributovi;
	
	@FindBy(xpath = "//span[@id=\"description-cod-tax\"]")
	public WebElement descricaocodigotributovi;
	
	@FindBy(xpath = "//span[@id=\"description-cod-tax-label\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"classification\"]")
	public WebElement classificacaovi;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar País \"]")
	public WebElement pais1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo\"]")
	public WebElement codigotributo1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição código tributo label\"]")
	public WebElement descricao1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição código tributo\"]")
	public WebElement descricaocodigotributo1;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Classificação \"]")
	public WebElement classificacao1;
	
	public ConfiguracaoDeTributoVisualizarPO() {

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
		configuracaotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguracaoDeTributo");
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
		
		String paisvisualizar = paisvi.getText();
		String codigotributovisualizar = codigotributovi.getText();
		String descricaocodigotributovisualizar = descricaocodigotributovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String classificacaovisualizar = classificacaovi.getText();
		
		System.out.println(paisvisualizar);
		System.out.println(codigotributovisualizar);
		System.out.println(descricaocodigotributovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(classificacaovisualizar);
		
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

		String paiseditar = pais1.getAttribute("value");
		String codigotributoeditar = codigotributo1.getAttribute("value");
		String descricaocodigotributoeditar = descricaocodigotributo1.getAttribute("value");
		String descricaoeditar = descricao1.getAttribute("value");
		String classificacaoeditar = classificacao1.getAttribute("value");
		
		System.out.println(paiseditar);
		System.out.println(codigotributoeditar);
		System.out.println(descricaocodigotributoeditar);
		System.out.println(descricaoeditar);
		System.out.println(classificacaoeditar);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(paiseditar.equals(paisvisualizar));
		sucesso.add(codigotributoeditar.equals(codigotributovisualizar));
		sucesso.add(descricaocodigotributoeditar.equals(descricaocodigotributovisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(classificacaoeditar.equals(classificacaovisualizar));
		
		//System.out.println(sucesso);
		return sucesso;

	}

}
