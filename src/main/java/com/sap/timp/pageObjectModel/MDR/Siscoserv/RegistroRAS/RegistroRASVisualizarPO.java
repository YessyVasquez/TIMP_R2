package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRAS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRASVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RAS\"]")
	public WebElement registroras;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Serviço Adquirido\"]")
	public WebElement numeroservico;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher/Selecionar Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Registro de Crédito\"]")
	public WebElement numerodoregistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número NIF\"]")
	public WebElement numeronif;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Número do Declaração de Importação\"]")
	public WebElement numerododeclaracao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"acquiredServiceNumber\"]")
	public WebElement numeroservicovi;
	
	@FindBy(xpath = "//span[@id=\"period\"]")
	public WebElement periodovi;
	
	@FindBy(xpath = "//span[@id=\"creditRecordNumber\"]")
	public WebElement numerodoregistrovi;
	
	@FindBy(xpath = "//span[@id=\"nifNumber\"]")
	public WebElement numeronifvi;
	
	@FindBy(xpath = "//span[@id=\"importDeclarationNumber\"]")
	public WebElement numerododeclaracaovi;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativovi;
	

	
	public RegistroRASVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		registroras.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RegistroRAS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		
		String empresavisualizar = empresavi.getText();
		String numeroserviçovisualizar =numeroservicovi.getText();
		String periodovisualizar =periodovi.getText();
		String numerodoregistrovisualizar =numerodoregistrovi.getText();
		String numeronifvisualizar =numeronifvi.getText();
		String numerododeclaracaovisualizar =numerododeclaracaovi.getText();
		
		
		
		System.out.println(empresavisualizar);
		System.out.println(numeroserviçovisualizar);
		System.out.println(periodovisualizar);
		System.out.println(numerodoregistrovisualizar);
		System.out.println(numeronifvisualizar);
		System.out.println(numerododeclaracaovisualizar);
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("RegistroRAS");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		//editar
		
		
		String empresaeditar=empresa.getAttribute("value");
		String numeroserviçoeditar=numeroservico.getAttribute("value");
		String periodoeditar = periodo.getAttribute("value");
		String numerodoregistroeditar = numerodoregistro.getAttribute("value");
		String numeronifeditar = numeronif.getAttribute("value");
		String numerododeclaracaoeditar = numerododeclaracao.getAttribute("value");
		
		System.out.println( empresaeditar);
		System.out.println( numeroserviçoeditar);
		System.out.println(periodoeditar);
		System.out.println(numerodoregistroeditar);
		System.out.println(numeronifeditar);
		System.out.println(numerododeclaracaoeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaeditar.equals(empresavisualizar));
		sucesso.add(numeroserviçoeditar.equals(numeroserviçovisualizar));
		sucesso.add(periodoeditar.equals(periodovisualizar));
		sucesso.add(numerodoregistroeditar.equals(numerodoregistrovisualizar));
		sucesso.add(numeronifeditar.equals(numeronifvisualizar));
		sucesso.add(numerododeclaracaoeditar.equals(numerododeclaracaovisualizar));
		return sucesso;	

	
	}	

}
