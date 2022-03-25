package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRVS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRVSDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RVS\"]")
	public WebElement registrorvs;

	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement numeronif;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement numeroservico;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement numerodoregistro;

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement numeroderegistroexpotacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement ativo;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
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
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public RegistroRVSDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		registrorvs.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RegistroRVS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		
		//detalhes
	
		String empresadetalhes = empresa.getText();
		String periododetalhes =periodo.getText();
		String numeroserviçodetalhes =numeroservico.getText();
		String numeronifdetalhes =numeronif.getText();
		String numerodoregistrodetalhes =numerodoregistro.getText();
		String numeroderegistroexpotacaodetalhes =numeroderegistroexpotacao.getText();
		String ativodetalhes = ativo.getText();
		
		
		
		System.out.println(empresadetalhes);
		System.out.println(periododetalhes);
		System.out.println(numeroserviçodetalhes);
		System.out.println(numeronifdetalhes);
		System.out.println(numerodoregistrodetalhes);
		System.out.println(numeroderegistroexpotacaodetalhes);
		System.out.println(ativodetalhes);
		
		
		fechar.click();
		
		
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("RegistroRVS");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String empresavisualizar = empresavi.getText();
		String periodovisualizar =periodovi.getText();
		String numeroserviçovisualizar =numeroservicovi.getText();
		String numeronifvisualizar =numeronifvi.getText();
		String numerodoregistrovisualizar =numerodoregistrovi.getText();
		String numeroderegistroexpotacaovisualizar =numeroderegistroexpotacaovi.getText();
		String ativovisualizar = ativovi.getText();
		
		
		
		System.out.println(empresavisualizar);
		System.out.println(periodovisualizar);
		System.out.println(numeroserviçovisualizar);
		System.out.println(numeronifvisualizar);
		System.out.println(numerodoregistrovisualizar);
		System.out.println(numeroderegistroexpotacaovisualizar);
		System.out.println(ativovisualizar);
		
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(periodovisualizar.equals(periododetalhes));
		sucesso.add(numeroserviçovisualizar.equals(numeroserviçodetalhes));
		sucesso.add(numeronifvisualizar.equals(numeronifdetalhes));
		sucesso.add(numerodoregistrovisualizar.equals(numerodoregistrodetalhes));
		sucesso.add(numeroderegistroexpotacaovisualizar.equals(numeroderegistroexpotacaodetalhes));
		sucesso.add(ativovisualizar.equals(ativodetalhes));
		System.out.println(sucesso);
		return sucesso;
	}

}
