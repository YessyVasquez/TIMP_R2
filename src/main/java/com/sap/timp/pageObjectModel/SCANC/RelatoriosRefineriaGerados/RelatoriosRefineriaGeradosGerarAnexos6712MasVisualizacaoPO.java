package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Gerar Anexos 6, 7 e 12\"]")
	public WebElement btnGerarAnexos;
	
	@FindBy(xpath = "//button[text()=\"Gerar\"]")
	public WebElement btnGerar;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//span[text()=\"Anexo VII\"]")
	public WebElement anexoVII;
	
	@FindBy(xpath = "//span[text()=\"Anexo XII\"]")
	public WebElement anexoXII;
	
	@FindBy(xpath = "//span[text()=\"Log de Geração\"]")
	public WebElement logDeGeracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	public RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> gerarAnexosMasVisualizacao() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnGerarAnexos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String url = driver.getCurrentUrl();
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "13";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "30";
		}
		
		WebElement checkBox = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[3]/div/div/div/div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/label/span"));
		
		sleep(1000);
		checkBox.click();
		sleep(1000);
		
		btnGerar.click();
		sleep(2000);
		
		if(url.contains("tq1")) {
			waitExpectElement(btnAplicar);
			btnAplicar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"progress-bar\"]");
		sleep(2000);
		
		waitExpectElement(btnFechar);
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(url.contains("tq1")) {
			idRegistro = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "9";
		}
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		String nomeArquivoString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[4]/div")).getText();
		String subperiodoString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[7]/div")).getText();
		
		System.out.println("");
		System.out.println("Nome Arquivo: " + nomeArquivoString);
		System.out.println("subperiodo Arquivo: " + subperiodoString);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement verificarQuadro15 = driver.findElement(By.xpath("//div[@class=\"annexe-section-row container-element\"]/div/div[contains(text(), \"QUADRO 15\")]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(verificarQuadro15.isDisplayed()) {
			System.out.println("Anexo VI verificado...");
			sucesso.add(true);
		}else{
			System.out.println("Anexo VI no se verificaron los 15 QUADROS...");
			sucesso.add(false);
		}
		
		// Anexo VII
		anexoVII.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement verificarQuadro7 = driver.findElement(By.xpath("//div[@class=\"report-container\"]/div/div[@class=\"report-wrapper\"][7]//div[@class=\"annexe-section-row container-element\"]/div/div[contains(text(), \"QUADRO 7\")]"));
		
		if(verificarQuadro7.isDisplayed()) {
			System.out.println("Anexo VII verificado...");
			sucesso.add(true);
		}else{
			System.out.println("Anexo VII no se verificaron los 7 QUADROS...");
			sucesso.add(false);
		}
		
		// Anexo XII
		anexoXII.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		verificarQuadro7 = driver.findElement(By.xpath("//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[@class=\"report-container\"]/div/div[@class=\"report-wrapper\"][7]/div/div[@class=\"annexe-section-row container-element\"]/div/div[contains(text(), \"QUADRO 7\")]"));
		
		if(verificarQuadro7.isDisplayed()) {
			System.out.println("Anexo VII verificado...");
			sucesso.add(true);
		}else{
			System.out.println("Anexo VII no se verificaron los 7 QUADROS...");
			sucesso.add(false);
		}
		
		WebElement cuadroDemostrativo = driver.findElement(By.xpath("//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[@class=\"report-container\"]/div/div[@class=\"report-wrapper\"][8]/div/div[@class=\"annexe-section-row container-element section-title\"][2]/div/div[contains(text(), \"DEMONSTRATIVO \")]"));
		
		if(cuadroDemostrativo.isDisplayed()) {
			System.out.println("Anexo XII cuadro demostrativo verificado...");
			sucesso.add(true);
		}else{
			System.out.println("Anexo XII no se verifico cuadro demostrativoS...");
			sucesso.add(false);
		}
		
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
		sucesso.add(subperiodoDoArquivoString.equals(subperiodoString));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
