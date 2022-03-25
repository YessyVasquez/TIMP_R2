package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRVS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRVSVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RVS\"]")
	public WebElement registrorvs;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/input")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher/Selecionar Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número NIF\"]")
	public WebElement numeronif;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número de Serviço\"]")
	public WebElement numeroservico;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Registro de Crédito\"]")
	public WebElement numerodoregistro;

	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número de Registro de Exportação\"]")
	public WebElement numeroderegistroexpotacao;

	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	
	@FindBy(xpath = "//span[@id=\"period\"]")
	public WebElement periodovi;
	
	@FindBy(xpath = "//span[@id=\"nifNumber\"]")
	public WebElement numeronifvi;
	
	@FindBy(xpath = "//span[@id=\"serviceSoldNumber\"]")
	public WebElement numeroservicovi;
	
	@FindBy(xpath = "//span[@id=\"creditRecordNumber\"]")
	public WebElement numerodoregistrovi;

	
	@FindBy(xpath = "//span[@id=\"exportDeclarationNumber\"]")
	public WebElement numeroderegistroexpotacaovi;
	

	
	public RegistroRVSVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		registrorvs.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RegistroRVS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(empresa);
		sleep(2000);
		
		//visualizar
		String empresavisualizar = empresavi.getText();
		String periodovisualizar =periodovi.getText();
		String numeroserviçovisualizar =numeroservicovi.getText();
		String numeronifvisualizar =numeronifvi.getText();
		String numerodoregistrovisualizar =numerodoregistrovi.getText();
		String numeroderegistroexpotacaovisualizar =numeroderegistroexpotacaovi.getText();
		
		
		
		
		System.out.println(empresavisualizar);
		System.out.println(periodovisualizar);
		System.out.println(numeroserviçovisualizar);
		System.out.println(numeronifvisualizar);
		System.out.println(numerodoregistrovisualizar);
		System.out.println(numeroderegistroexpotacaovisualizar);
		
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("RegistroRVS");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);

		sleep(8000);

			
		//editar
		System.out.println("Datos del editar");
		
		String empresaeditar=empresa.getAttribute("value");
		String periodoeditar = periodo.getAttribute("value");
		String numeroserviçoeditar=numeroservico.getAttribute("value");
		String numeronifeditar = numeronif.getAttribute("value");
		String numerodoregistroeditar = numerodoregistro.getAttribute("value");
		String numeroderegistroexpotacaoeditar = numeroderegistroexpotacao.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(periodoeditar);
		System.out.println(numeroserviçoeditar);
		System.out.println(numeronifeditar);
		System.out.println(numerodoregistroeditar);
		System.out.println(numeroderegistroexpotacaoeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaeditar.equals(empresavisualizar));
		sucesso.add(periodoeditar.equals(periodovisualizar));
		sucesso.add(numeroserviçoeditar.equals(numeroserviçovisualizar));
		sucesso.add(numeronifeditar.equals(numeronifvisualizar));
		sucesso.add(numerodoregistroeditar.equals(numerodoregistrovisualizar));
		sucesso.add(numeroderegistroexpotacaoeditar.equals(numeroderegistroexpotacaovisualizar));
		System.out.println(sucesso);
		return sucesso;	

	
	}
}
