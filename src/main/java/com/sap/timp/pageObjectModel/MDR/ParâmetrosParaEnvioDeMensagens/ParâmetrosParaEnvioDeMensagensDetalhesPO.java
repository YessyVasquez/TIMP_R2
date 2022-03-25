package com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParâmetrosParaEnvioDeMensagensDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class,\"accordion-container\")]/ul/li/div/span[text()=\"Parâmetros para Envio de Mensagens\"]")
	public WebElement menuParametrosParaEnvioDeMensagens;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimerPagina;
	
	// Datos detalhe
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div[1]")
	public WebElement id;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	// Datos Visualizar
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement id1;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf1;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial1;
	
	public ParâmetrosParaEnvioDeMensagensDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes(){
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuParametrosParaEnvioDeMensagens.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParâmetrosParaEnvioDeMensagens");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idString = id.getText();
		String empresaString = empresa.getText();		
		String ufString = uf.getText();
		String filialString = filial.getText();
		
		System.out.println("------------------Datos de Detalhe--------------------");
		System.out.println("ID: " + idString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("");
		
		btnCerrar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(btnPrimerPagina);
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idString1 = id1.getText();
		String empresaString1 = empresa1.getText();
		String ufString1 = uf1.getText();
		String filialString1 = filial1.getText();
		
		System.out.println("------------------Datos de Visualizar--------------------");
		System.out.println("ID: " + idString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(idString1.equals(idString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));


		System.out.println(sucesso);
	
		return sucesso;
	}
}
