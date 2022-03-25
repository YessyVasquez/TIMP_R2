package com.sap.timp.pageObjectModel.MDR.CEP.Bairro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BairroDetalhesPO extends TestBaseSteven{
	

	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li/span[text()=\"Detalhes\"]")
	public WebElement detalhes;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement Visualizar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement numeroBairroV;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	
	@FindBy(xpath = "//span[@id=\"localizacaoNumero\"]")
	public WebElement numeroLocalizacaoV;
	
	@FindBy(xpath = "//span[@id=\"bairroNome\"]")
	public WebElement bairroNomeV;
	
	@FindBy(xpath = "//span[@id=\"bairroNomeAbreviado\"]")
	public WebElement bairroNomeAbreviadoV;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement numeroBairroD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement ufD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement numeroLocalizacaoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement bairroNomeD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement bairroNomeAbreviadoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public BairroDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);
		} else if (url.contains("tc2")) {
			cep2.click();
			sleep(1000);
		}else {
			cep.click();
			sleep(1000);
		}
		bairro.click();
		
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("CEP-Bairro");
	    System.out.println("idDetalhes: "+ idRegistro);
	    
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		menu.click();
		sleep(2000);
		detalhes.click();

		invisibilityOfElementOverlay();
		
		
		String numeroBairroD1= numeroBairroD.getText();
		String ufD1 = ufD.getText();
		String numeroLocalizacaoD1 =numeroLocalizacaoD.getText();
		String nomeBairroD1 = bairroNomeD.getText();
		//String bairroNomeAbreviadoD1=bairroNomeAbreviadoD.getText();
		
		System.out.println(numeroBairroD1);
		System.out.println(ufD1);
		System.out.println(numeroLocalizacaoD1);
		System.out.println(nomeBairroD1);
		//System.out.println(bairroNomeAbreviadoD1);


		fechar.click();
		
		sleep(3000);
		
		
		invisibilityOfElementOverlay();
		menu.click();
		sleep(2000);
		Visualizar.click();
		
		invisibilityOfElementOverlay();
		
		
		//editar
		invisibilityOfElementOverlay();
		
		String numeroBairroV1 = numeroBairroV.getText();
		String ufV1 = ufV.getText();
		String numeroLocalizacaoV1 = numeroLocalizacaoV.getText();
		String bairroNomeV1 = bairroNomeV.getText();
		//String bairroNomeAbreviadoV1=bairroNomeAbreviadoV.getText();
		
		System.out.println(numeroBairroV1);
		System.out.println(ufV1);
		System.out.println(numeroLocalizacaoV1);
		System.out.println(bairroNomeV1);
		//System.out.println(bairroNomeAbreviadoV1);

		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(numeroBairroD1.equals(numeroBairroV1));
		sucesso.add(ufD1.equals(ufV1));
		sucesso.add(numeroLocalizacaoD1.equals(numeroLocalizacaoV1));
		sucesso.add(nomeBairroD1.equals(nomeBairroD1));
		//sucesso.add(bairroNomeAbreviadoD1.equals(bairroNomeAbreviadoV1));
		
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	
	
	

}
