package com.sap.timp.pageObjectModel.MDR.CEP.Logradouro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LogradouroVisualizarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	@FindBy(xpath = "//li/div/span[text()=\"Logradouro\"]")
	public WebElement logradouro;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement numerobairrovi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"localizacaoNumero\"]")
	public WebElement numerolocalizacaovi;
	
	@FindBy(xpath = "//span[@id=\"bairroNumero\"]")
	public WebElement bairronumerovi;
	
	@FindBy(xpath = "//span[@id=\"logradouroNome\"]")
	public WebElement nomelogadourovi;
	
	@FindBy(xpath = "//div[contains(@class,\"id_0_0\")]/div/div/div/div/div[2]/input")
	public WebElement numerobairroed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher UF\"]")
	public WebElement ufed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Número de localização\"]")
	public WebElement numerolocalizacaoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Número de bairro\"]")
	public WebElement bairronumeroed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Nome de Logradouro\"]")
	public WebElement nomelogadouroed;
	
	
	
	public LogradouroVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> logradouroVisualizar() {
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		logradouro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		String idRegistro = idObter("CEP-Logradouro");
	    System.out.println("idEditar: "+ idRegistro);
	    
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		String numerobairrovisualizar = numerobairrovi.getText();
		String ufvisualizar = ufvi.getText();
		String numerolocalizacaovisualizar = numerolocalizacaovi.getText();
		String bairronumerovisualizar = bairronumerovi.getText();
		String nomelogadourovisualizar = nomelogadourovi.getText();
		
		System.out.println(numerobairrovisualizar);
		System.out.println(ufvisualizar);
		System.out.println(numerolocalizacaovisualizar);
		System.out.println(bairronumerovisualizar);
		System.out.println(nomelogadourovisualizar);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numerobairroeditar=numerobairroed.getAttribute("value");
		String ufeditar=ufed.getAttribute("value");
		String numerolocalizacaoeditar=numerolocalizacaoed.getAttribute("value");
		String bairronumeroeditar=bairronumeroed.getAttribute("value");
		String nomelogadouroeditar = nomelogadouroed.getAttribute("value");
				
		System.out.println(numerobairroeditar);
		System.out.println(ufeditar);
		System.out.println(numerolocalizacaoeditar);
		System.out.println(bairronumeroeditar);
		System.out.println(nomelogadouroeditar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(numerobairroeditar.equals(numerobairrovisualizar));
		sucesso.add(ufeditar.equals(ufvisualizar));
		sucesso.add(numerolocalizacaoeditar.equals(numerolocalizacaovisualizar));
		sucesso.add(bairronumeroeditar.equals(bairronumerovisualizar));
		sucesso.add(nomelogadouroeditar.equals(nomelogadourovisualizar));
		return sucesso;		
	}
}
