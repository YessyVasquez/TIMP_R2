package com.sap.timp.pageObjectModel.SCANC.ArquivosImportados;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ArquivosImportadosInformacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Arquivos Importados\"]")
	public WebElement arquivosImportados;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautesPublicos;
	
	@FindBy(xpath = "//div[@id=\"detail-name\"][1]/div")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarInformacoes;
	
	@FindBy(xpath = "//span[text()=\"Log de Inconsistência\"]")
	public WebElement logDeInconcisstencia;
	
	public ArquivosImportadosInformacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean informacao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		arquivosImportados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String url = driver.getCurrentUrl();
		String  idRegistro = "0";
		
		if(url.contains("tc2")) {
			idRegistro = "32";
		}
		
		if(url.contains("tq1")) {
			idRegistro = "13";
		}
		
	
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeString = nome.getText();
		
		System.out.println("");
		System.out.println("Datos de Informacoes");
		System.out.println("Nome: " + nomeString);
		
		btnCerrarInformacoes.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(10000);
	//	waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		logDeInconcisstencia.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeDoArquivoString = driver.findElement(By.xpath("//div[@id=\"field-file-name\"]/div/div/input")).getAttribute("value");
		System.out.println("Datos de visualizar");
		System.out.println("");
		System.out.println("Nome do Arquivo: " + nomeDoArquivoString);
		
		boolean sucesso = false;
		
		if (nomeDoArquivoString.equals(nomeString)) {
			System.out.println("");
			System.out.println("Datos confirmados...");
			sucesso = true;
		}
		
		return sucesso;
	}
}
