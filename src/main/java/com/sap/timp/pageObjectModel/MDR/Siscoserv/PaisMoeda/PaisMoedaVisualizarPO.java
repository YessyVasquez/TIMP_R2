package com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PaisMoedaVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"País/Moeda\"]")
	public WebElement paismoeda;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar País \"]")
	public WebElement pais;
	
	@FindBy(xpath = "//input[@placeholder= \"Selecionar Moeda \"]")
	public WebElement moeda;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de País\"]")
	public WebElement codigodepais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Moeda\"]")
	public WebElement codigodemoeda;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"country\"]")
	public WebElement paisvi;
	
	@FindBy(xpath = "//span[@id=\"coin\"]")
	public WebElement moedavi;
	
	
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement codigodepaisvi;
	
	@FindBy(xpath = "//span[@id=\"coinCode\"]")
	public WebElement codigodemoedavi;
	
	public PaisMoedaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		paismoeda.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("PaisMoeda");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		
		
		waitExpectElement(paisvi);
		sleep(2000);
		String paisvisualizar = paisvi.getText();
		String moedavisualizar = moedavi.getText();
		String codigodepaisvisualizar = codigodepaisvi.getText();
		String codigodemoedavisualizar = codigodemoedavi.getText();
		
		System.out.println(paisvisualizar);
		System.out.println(codigodepaisvisualizar);
		System.out.println(moedavisualizar);
		System.out.println(codigodemoedavisualizar);
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("PaisMoeda");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
			
		
		//editar
		
		attributeToBeXpath("//div[@id=\"country\"]/div", "class", "base-autocomplete required");
		sleep(3000);
		
		String paiseditar=pais.getAttribute("value");
		String codigodepaiseditar=codigodepais.getAttribute("value");
		String moedaeditar = moeda.getAttribute("value");
		String codigodemoedaeditar = codigodemoeda.getAttribute("value");
		
		System.out.println( paiseditar);
		System.out.println( codigodepaiseditar);
		System.out.println(moedaeditar);
		System.out.println(codigodemoedaeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(paisvisualizar.equals(paiseditar));
		sucesso.add(codigodepaisvisualizar.equals(codigodepaiseditar));
		sucesso.add(moedavisualizar.equals(moedaeditar));
		sucesso.add(codigodemoedavisualizar.equals(codigodemoedaeditar));
		
		return sucesso;	

	
	}	

}
