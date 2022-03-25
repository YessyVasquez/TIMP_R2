package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatoriosRefinariaGeradosInformacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//div[@id=\"detail-name\"][1]/div")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement sbperiodo;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarInformacoes;
	
	@FindBy(xpath = "//span[text()=\"Log de Geração\"]")
	public WebElement logDeGeracao;
	
	public RelatoriosRefinariaGeradosInformacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> informacao() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "26";
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		String nomeArquivoString = nome.getText();
		String subperiodoString = sbperiodo.getText();
		
		System.out.println("");
		System.out.println("Nome Arquivo: " + nomeArquivoString);
		System.out.println("subperiodo Arquivo: " + subperiodoString);
		
		sleep(1000);
		btnCerrarInformacoes.click();
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		// Log de Geracao
		logDeGeracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeDoArquivoString = driver.findElement(By.xpath("//div[@id=\"field-file-name\"]/div/div/input")).getAttribute("value");
		String subperiodoDoArquivoString = driver.findElement(By.xpath("//div[@id=\"field-file-period\"]/div/div/input")).getAttribute("value");
		
		System.out.println("");
		System.out.println("Nome do Arquivo: " + nomeDoArquivoString);
		System.out.println("subperiodo d Arquivo: " + subperiodoDoArquivoString);
		
		sucesso.add(nomeDoArquivoString.equals(nomeArquivoString));
		sucesso.add(subperiodoString.contains(subperiodoDoArquivoString));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
