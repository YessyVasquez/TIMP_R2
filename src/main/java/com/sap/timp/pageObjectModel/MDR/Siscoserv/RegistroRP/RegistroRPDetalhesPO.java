package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRPDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RP\"]")
	public WebElement registrorp;

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement numeroservico;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement numerodoregistro;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement valorrecebido;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement numerododeclaracao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[16]/div/div")
	public WebElement ativo;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	
	@FindBy(xpath = "//span[@id=\"acquiredServiceNumber\"]")
	public WebElement numeroservicovi;
	
	@FindBy(xpath = "//span[@id=\"period\"]")
	public WebElement periodovi;
	
	@FindBy(xpath = "//span[@id=\"creditRecordNumber\"]")
	public WebElement numerodoregistrovi;
	
	@FindBy(xpath = "//span[@id=\"value\"]")
	public WebElement valorrecebidovi;
	
	@FindBy(xpath = "//span[@id=\"importDeclarationNumber\"]")
	public WebElement numerododeclaracaovi;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public RegistroRPDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	

	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		registrorp.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RegistroRP");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		
		//detalhes
		//String iddetalhes = id.getText();
		String empresadetalhes = empresa.getText();
		String numeroserviçodetalhes =numeroservico.getText();
		String periododetalhes =periodo.getText();
		String numerodoregistrodetalhes =numerodoregistro.getText();
		String valorrecebidodetalhes =valorrecebido.getText();
		String numerododeclaracaodetalhes =numerododeclaracao.getText();
		String ativodetalhes = ativo.getText();
		
		
		//System.out.println(iddetalhes);
		System.out.println(empresadetalhes);
		System.out.println(numeroserviçodetalhes);
		System.out.println(periododetalhes);
		System.out.println(numerodoregistrodetalhes);
		System.out.println(valorrecebidodetalhes);
		System.out.println(numerododeclaracaodetalhes);
		System.out.println(ativodetalhes);
		
		
		fechar.click();
		
		
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("RegistroRP");
		
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
		String numeroserviçovisualizar =numeroservicovi.getText();
		String periodovisualizar =periodovi.getText();
		String numerodoregistrovisualizar =numerodoregistrovi.getText();
		String valorrecebidovisualizar =valorrecebidovi.getText();
		String numerododeclaracaovisualizar =numerododeclaracaovi.getText();
		String ativovisualizar = ativovi.getText();
		
		
		
		System.out.println(empresavisualizar);
		System.out.println(numeroserviçovisualizar);
		System.out.println(periodovisualizar);
		System.out.println(numerodoregistrovisualizar);
		System.out.println(valorrecebidovisualizar);
		System.out.println(numerododeclaracaovisualizar);
		System.out.println(ativovisualizar);
		
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(numeroserviçovisualizar.equals(numeroserviçodetalhes));
		sucesso.add(periodovisualizar.equals(periododetalhes));
		sucesso.add(numerodoregistrovisualizar.equals(numerodoregistrodetalhes));
		sucesso.add(valorrecebidovisualizar.equals(valorrecebidodetalhes));
		sucesso.add(numerododeclaracaovisualizar.equals(numerododeclaracaodetalhes));
		sucesso.add(ativovisualizar.equals(ativodetalhes));
		
		System.out.println(sucesso);
		
		return sucesso;
	}

}
