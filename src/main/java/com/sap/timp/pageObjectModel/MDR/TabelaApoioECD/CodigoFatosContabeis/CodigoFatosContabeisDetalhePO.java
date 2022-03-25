package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigoFatosContabeisDetalhePO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Código dos Fatos Contábeis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	// Datos detalhe
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigoDoFatoContabil;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement fatoContabil;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement activo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement dataInicioValidade;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement dataFinalValidade;
	
	// Datos de editar
	@FindBy(xpath = "//div[@id=\"accountingFactCode-1\"]/div/div/input")
	public WebElement inputCodigoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"accountingFact-1\"]/div/div/input")
	public WebElement inputDescricaoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"startDate-1\"]/div/div/input")
	public WebElement inputDataInicio;
	
	@FindBy(xpath = "//div[@id=\"endDate-1\"]/div/div/input")
	public WebElement inputDataFinal;
	
	@FindBy(xpath = "//div[@id=\"active-1\"]/div/input")
	public WebElement inputActivo;
	
	public CodigoFatosContabeisDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalheCodigoFatosContabeisDetalhe() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("CodigoFatosContabeis");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtengo los datos
		String textoCodigoFatoContabil = codigoDoFatoContabil.getText();
		String textoFatoContabil = fatoContabil.getText();
		String textoActivo = activo.getText();
		String textoDataInicioValidade = dataInicioValidade.getText();
		String textoDataFinalValidade = dataFinalValidade.getText();
		
		System.out.println("Codigo do Fato Contabil: " + textoCodigoFatoContabil);
		System.out.println("Fato contabil: " + textoFatoContabil);
		System.out.println("Activo: " + textoActivo);
		System.out.println("Data inicio validade: " + textoDataInicioValidade);
		System.out.println("Data final validade: " + textoDataFinalValidade);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtengo los datos
		System.out.println("---------------------------------------------------------");
		String textoCodigoFatoContabil1 = inputCodigoFatoContabil.getAttribute("value");
		String textoFatoContabil1 = inputDescricaoFatoContabil.getAttribute("value");
		String textoActivo1 = inputActivo.isSelected() ? "Sim" : "Não";
		String textoDataInicioValidade1 = inputDataInicio.getAttribute("value");
		String textoDataFinalValidade1 = inputDataFinal.getAttribute("value");
		
		System.out.println("Codigo do Fato Contabil: " + textoCodigoFatoContabil1);
		System.out.println("Fato contabil: " + textoFatoContabil1);
		System.out.println("Activo: " + textoActivo1);
		System.out.println("Data inicio validade: " + textoDataInicioValidade1);
		System.out.println("Data final validade: " + textoDataFinalValidade1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigoFatoContabil1.equals(textoCodigoFatoContabil));
		sucesso.add(textoFatoContabil1.equals(textoFatoContabil));
		sucesso.add(textoDataInicioValidade1.equals(textoDataInicioValidade));
		sucesso.add(textoDataFinalValidade1.equals(textoDataFinalValidade));
		sucesso.add(textoActivo1.equals(textoActivo));
		return sucesso;
	}
}