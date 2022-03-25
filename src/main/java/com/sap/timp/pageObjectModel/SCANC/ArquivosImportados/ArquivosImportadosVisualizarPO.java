package com.sap.timp.pageObjectModel.SCANC.ArquivosImportados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ArquivosImportadosVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Arquivos Importados\"]")
	public WebElement arquivosImportados;
	
	@FindBy(xpath = "//span[text()=\"Anexo V\"]")
	public WebElement anexoV;
	
	@FindBy(xpath = "//span[text()=\"Anexo XI\"]")
	public WebElement anexoXI;
	
	@FindBy(xpath = "//span[text()=\"Log de Inconsistência\"]")
	public WebElement logDeInconsistencia;
	
	@FindBy(xpath = "//div[@id=\"field-file-name\"]/div/div/input")
	public WebElement nomeDoArquivo;
	
	@FindBy(xpath = "//div[@id=\"field-file-period\"]/div/div/input")
	public WebElement periodoDoArquivo;
	
	public ArquivosImportadosVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		arquivosImportados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "13";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "32";
		}
		
		System.out.println("ID Registro do Ambiente: " + idRegistro);
		
		String nome = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[3]/div")).getText();
		String subperiodo = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[6]/div")).getText();
		
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Subperiodo: " + subperiodo);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo III
		actionsMoveToElementXpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[3]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"3-3\")]");
		String verificarPaginasAnexoIII = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[3]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"3-3\")]")).getText();
		String paginaAnexoIII = "3-3";
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(verificarPaginasAnexoIII.contains(paginaAnexoIII)) {
			System.out.println("Paginas verificadas de Anexo III...");
			sucesso.add(true);
		}else {
			System.out.println("No se verificaron las paginas de Anexo III...");
			sucesso.add(false);
		}
		
		// Anexo V		
		anexoV.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[3]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"3-3\")]");
		String verificarPaginasAnexoV = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[3]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"3-3\")]")).getText();
		String paginaAnexoV = "3-3";
		
		if(verificarPaginasAnexoV.contains(paginaAnexoV)) {
			System.out.println("Paginas verificadas de Anexo V...");
			sucesso.add(true);
		}else {
			System.out.println("No se verificaron las paginas de Anexo V...");
			sucesso.add(false);
		}
		
		// Anexo XI		
		anexoXI.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"1\")]");
		String verificarPaginasAnexoXI = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element page-column\"]/div[contains(text(), \"1\")]")).getText();
		String paginaAnexoXI = "1";
		
		if(verificarPaginasAnexoXI.contains(paginaAnexoXI)) {
			System.out.println("Paginas verificadas de Anexo XI...");
			sucesso.add(true);
		}else {
			System.out.println("No se verificaron las paginas de Anexo XI...");
			sucesso.add(false);
		}
		
		// Log de Inconsistenciaa	
		logDeInconsistencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeDoArquivoString = nomeDoArquivo.getAttribute("value");
		String periodoDoArquivoString = periodoDoArquivo.getAttribute("value");
		
		System.out.println("");
		System.out.println("Nome do arquivo: " + nomeDoArquivoString);
		System.out.println("Periodo do arquivo: " + periodoDoArquivoString);
		
		// Validamos nombre y subperiodo
		sucesso.add(nomeDoArquivoString.equals(nome));
		sucesso.add(periodoDoArquivoString.equals(subperiodo));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
