package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MunicipioVisualizarPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//div/div/span[text()=\"Número de localização\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	//@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	//public WebElement menu;
	

	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Número de localização\")]")
	public WebElement numero;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome de localização\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	

	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar CEP\")]")

	public WebElement cepN;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in sit\")]")
	public WebElement locS;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in tipo\")]")
	public WebElement locT;
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement numerovi;
	
	@FindBy(xpath = "//span[@id=\"locNo\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//span[@id=\"ufeSg\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"cep\"]")
	public WebElement cepvi;
	
	@FindBy(xpath = "//span[@id=\"locInSit\"]")
	public WebElement locSvi;
	
	@FindBy(xpath = "//span[@id=\"locInTipoLoc\"]")
	public WebElement locTvi;
	
	public MunicipioVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		
		municipio.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("CEP-Municipio");
	    System.out.println("idEditar: "+ idRegistro);
	    
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		String numerovisualizar = numerovi.getText();
		String nomevisualizar = nomevi.getText();
		String ufvisualizar = ufvi.getText();
		String cepvisualizar = cepvi.getText();
		String locinsitvisualizar = locSvi.getText();
		String locintipolocvisualizar = locTvi.getText();
		
		System.out.println("******Visualizar******");
		
		System.out.println(numerovisualizar);
		System.out.println(nomevisualizar);
		System.out.println (ufvisualizar);
		System.out.println(cepvisualizar);
		System.out.println(locinsitvisualizar);
		System.out.println(locintipolocvisualizar);
		
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
		System.out.println("");
		System.out.println("******Editar******");
		String numeroeditar=numero.getAttribute("value");
		String nomeeditar=nome.getAttribute("value");
		String ufeditar=uf.getAttribute("value");
		String cepeditar =cepN.getAttribute("value");
		String locinsiteditar = locS.getAttribute("value");
		String locintipoloceditar = locT.getAttribute("value");
		
		System.out.println(numeroeditar);
		System.out.println(nomeeditar);
		System.out.println (ufeditar);
		System.out.println(cepeditar);
		System.out.println(locinsiteditar);
		System.out.println(locintipoloceditar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(numeroeditar.equals(numerovisualizar));
		sucesso.add(nomeeditar.equals(nomevisualizar));
		sucesso.add(ufeditar.equals(ufvisualizar));
		sucesso.add(cepeditar.equals(cepvisualizar));
		sucesso.add(locinsiteditar.equals(locinsitvisualizar));
		sucesso.add(locintipoloceditar.equals(locintipolocvisualizar));
		return sucesso;


	}

}
