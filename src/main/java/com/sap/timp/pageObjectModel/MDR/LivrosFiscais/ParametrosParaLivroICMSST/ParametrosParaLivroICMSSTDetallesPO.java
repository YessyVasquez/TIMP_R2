package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTDetallesPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	//------- detalle----------------
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div[2]/div")
	public WebElement tipolvro;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div[2]/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div[2]/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div[2]/div")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div[2]/div")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement biblioteca;
	
	//------Visualizar
	
	@FindBy(xpath = "//span[@id=\"bookType\"]")
	public WebElement tipolvro1;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"state\"]")
	public WebElement ufFilial1;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial1;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//span[@id=\"effectiveStartDate\"]")
	public WebElement dataInicio1;
	
	@FindBy(xpath = "//span[@id=\"effectiveEndDate\"]")
	public WebElement dataVigencia1;
	
	
	public ParametrosParaLivroICMSSTDetallesPO(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean>Detalles(){
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		livrosfiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		parametrosparalivroicmsst.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrosParaLivroICMSST");

		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu1.click();
		sleep(2000);
		detalle.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);

	
		String textotipolvro = tipolvro.getText();
		String textoempresa = empresa.getText();
		String textoufFilial = ufFilial.getText();
		String textofilial = filial.getText();
		String textotributo = tributo.getText();
		String textodataInicio = dataInicio.getText();
		String textodataVigencia = "----------";
		//String textodataVigencia = dataVigencia.getText();


		System.out.println("Tipo do Livro: " + textotipolvro);
		System.out.println("Empresa: " + textoempresa);
		System.out.println("UF da Filial: " + textoufFilial);
		System.out.println("Filial: " + textofilial );
		System.out.println("Tributo: " + textotributo);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio);
		System.out.println("Data de Fim de Vigência: " + textodataVigencia);

		sleep(2000);
		biblioteca.click();
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//---------------visualizar
		
		String textotipolvro1 = tipolvro1.getText();
		String textoempresa1 = empresa1.getText();
		String textoufFilial1 = ufFilial1.getText();
		String textofilial1 = filial1.getText();
		String textotributo1 = tributo1.getText();
		String textodataInicio1 = dataInicio1.getText();
		String textodataVigencia1 = dataVigencia1.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Tipo do Livro: " + textotipolvro1);
		System.out.println("Empresa: " + textoempresa1);
		System.out.println("UF da Filial: " + textoufFilial1);
		System.out.println("Filial: " + textofilial1);
		System.out.println("Tributo: " + textotributo1);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio1);
		System.out.println("Data de Fim de Vigência: " + textodataVigencia1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	 	sucesso.add(textoempresa1.equals(textoempresa));
	 	sucesso.add(textoufFilial1.equals(textoufFilial));
		sucesso.add(textofilial1.equals(textofilial));
		sucesso.add(textotributo1.equals(textotributo));
		sucesso.add(textodataInicio1.equals(textodataInicio));
		sucesso.add(textodataVigencia1.equals(textodataVigencia));
		System.out.println(sucesso);
	     	
		return sucesso;
		
	}

}


