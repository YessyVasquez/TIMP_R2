package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigoFatosContabeisVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Código dos Fatos Contábeis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos visualizar
	@FindBy(xpath = "//span[@id=\"accountingFactCode\"]")
	public WebElement codigoFatoContabil;
	
	@FindBy(xpath = "//span[@id=\"accountingFact\"]")
	public WebElement descricaoFatoContabil;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//span[@id=\"endDate\"]")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement activo;
	
	// Datos de editar
	@FindBy(xpath = "//div[@id=\"accountingFactCode-1\"]/div/div/input")
	public WebElement inputCodigoFatoContabil1;
	
	@FindBy(xpath = "//div[@id=\"accountingFact-1\"]/div/div/input")
	public WebElement inputDescricaoFatoContabil1;
	
	@FindBy(xpath = "//div[@id=\"startDate-1\"]/div/div/input")
	public WebElement inputDataInicio1;
	
	@FindBy(xpath = "//div[@id=\"endDate-1\"]/div/div/input")
	public WebElement inputDataFinal1;
	
	@FindBy(xpath = "//div[@id=\"active-1\"]/div/input")
	public WebElement inputActivo1;
	
	public CodigoFatosContabeisVisualizarPO() {
		PageFactory.initElements(driver,  this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CodigoFatosContabeis");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigoFatoContabilString = codigoFatoContabil.getText();
		String textoDescricaoFatoContabilString = descricaoFatoContabil.getText();
		String textoDataInicioString = dataInicio.getText();
		String textoDataFinalString = dataFinal.getText();
		String textoActivoString = activo.getText();
		
		System.out.println("Código do Fato Contábil: " + textoCodigoFatoContabilString);
		System.out.println("Descrição Fato Contábil: " + textoDescricaoFatoContabilString);
		System.out.println("Data inicio: " + textoDataInicioString);
		System.out.println("Data Final: " + textoDataFinalString);
		System.out.println("Activo: " + textoActivoString);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtengo los datos
		System.out.println("---------------------------------------------------------");
		String textoCodigoFatoContabil1 = inputCodigoFatoContabil1.getAttribute("value");
		String textoFatoContabil1 = inputDescricaoFatoContabil1.getAttribute("value");
		String textoActivo1 = inputActivo1.isSelected() ? "Sim" : "Não";
		String textoDataInicioValidade1 = inputDataInicio1.getAttribute("value");
		String textoDataFinalValidade1 = inputDataFinal1.getAttribute("value");
		
		System.out.println("Codigo do Fato Contabil: " + textoCodigoFatoContabil1);
		System.out.println("Fato contabil: " + textoFatoContabil1);
		System.out.println("Activo: " + textoActivo1);
		System.out.println("Data inicio validade: " + textoDataInicioValidade1);
		System.out.println("Data final validade: " + textoDataFinalValidade1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigoFatoContabil1.equals(textoCodigoFatoContabilString));
		sucesso.add(textoFatoContabil1.equals(textoDescricaoFatoContabilString));
		sucesso.add(textoDataInicioValidade1.equals(textoDataInicioString));
		sucesso.add(textoDataFinalValidade1.equals(textoDataFinalString));
		sucesso.add(textoActivo1.equals(textoActivoString));
		System.out.println(sucesso);
		return sucesso;
	}
}
