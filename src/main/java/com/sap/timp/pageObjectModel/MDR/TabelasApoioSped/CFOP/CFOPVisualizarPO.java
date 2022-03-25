package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CFOPVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaSPED;
	
	@FindBy(xpath = "//span[text()=\"4.2.2 CFOP\"]")
	public WebElement opcionCFOP;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	// Datos de editar
	@FindBy(xpath = "//div[@id=\"taxCodCode\"]")
	public WebElement codigoCFOP1;
	
	@FindBy(xpath = "//div[@id=\"taxCodGroup\"]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//div[@id=\"Code\"]")
	public WebElement cFOP1;
	
	@FindBy(xpath = "//div[@id=\"codeComp\"]")
	public WebElement compl1;
	
	@FindBy(xpath = "//div[@id=\"Description\"]")
	public WebElement descricao1;
	
	@FindBy(xpath = "//div[@id=\"Transaction\"]/div/div/div/input")
	public WebElement origem1;
	
	@FindBy(xpath = "//div[@id=\"Movement\"]/div/div/div/input")
	public WebElement movimentacaSimbolica1;
	
	@FindBy(xpath = "//div[@id=\"Validity\"]/div/div/input")
	public WebElement dataInicioVigencia1;
	
	@FindBy(xpath = "//div[@class=\"switch\"]/div/input")
	public WebElement activo1;
	
	// Datos de visualizar
	@FindBy(xpath = "//span[@id=\"taxCodCode\"]")
	public WebElement codigoCFOP;
	
	@FindBy(xpath = "//span[@id=\"taxCodGroup\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//span[@id=\"taxCodCFOP\"]")
	public WebElement cFOP;
	
	@FindBy(xpath = "//span[@id=\"taxCodComp\"]")
	public WebElement compl;
	
	@FindBy(xpath = "//span[@id=\"taxCodDescription\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//span[@id=\"taxCodTransType\"]")
	public WebElement origem;
	
	@FindBy(xpath = "//span[@id=\"taxCodMovement\"]")
	public WebElement movimentacaSimbolica;
	
	@FindBy(xpath = "//span[@id=\"taxCodValidity\"]")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//span[@id=\"taxCodInativo\"]")
	public WebElement activo;
	
	public CFOPVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaSPED.click();
		
		sleep(2000);
		actionsMoveToElementElement(opcionCFOP);
		opcionCFOP.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));	
		System.out.println(idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigoCFOPString = codigoCFOP.getText();
		String textoGrupoString = grupo.getText();
		String textoCFOPString = cFOP.getText();
		String textoComplString = compl.getText();
		String textoDescricaoString = descricao.getText();
		String textoOrigemString = origem.getText();
		String textoMovimentacaoSimbolicaString = movimentacaSimbolica.getText();
		String textoDataInicioVigenciaString = dataInicioVigencia.getText();
		String textoActivoString = activo.getText();
		
		System.out.println("Codigo CFOP: " + textoCodigoCFOPString);
		System.out.println("Grupo: " + textoGrupoString);
		System.out.println("CFOP: " + textoCFOPString);
		System.out.println("Compl: " + textoComplString);
		System.out.println("Descricao: " + textoDescricaoString);
		System.out.println("Origem: " + textoOrigemString);
		System.out.println("Movimentacao simbolica: " + textoMovimentacaoSimbolicaString);
		System.out.println("Data inicio vigencia: " + textoDataInicioVigenciaString);
		System.out.println("Activo: " + textoActivoString);
		
		sleep(2000);
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));	
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String textoCodigoCFOPString1 = codigoCFOP1.getText();
		String textoGrupoString1 = grupo1.getText();
		String textoCFOPString1 = cFOP1.getText();
		String textoComplString1 = compl1.getText();
		String textoDescricaoString1 = descricao1.getText();
		String textoOrigemString1 = origem1.getAttribute("value");
		String textoMovimentacaoSimbolicaString1 = movimentacaSimbolica1.getAttribute("value");
		String textoDataInicioVigenciaString1 = dataInicioVigencia1.getAttribute("value");
		String textoActivoString1 = activo1.isSelected() ? "Sim" : "Não";
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("Codigo CFOP 1: " + textoCodigoCFOPString1);
		System.out.println("Grupo 1: " + textoGrupoString1);
		System.out.println("CFOP 1: " + textoCFOPString1);
		System.out.println("Compl 1: " + textoComplString1);
		System.out.println("Descricao 1: " + textoDescricaoString1);
		System.out.println("Origem 1: " + textoOrigemString1);
		System.out.println("Movimentacao simbolica 1: " + textoMovimentacaoSimbolicaString1);
		System.out.println("Data inicio vigencia 1: " + textoDataInicioVigenciaString1);
		System.out.println("Activo 1: " + textoActivoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigoCFOPString1.equals(textoCodigoCFOPString));
		sucesso.add(textoGrupoString1.equals(textoGrupoString));
		sucesso.add(textoCFOPString1.equals(textoCFOPString));
		sucesso.add(textoComplString1.equals(textoComplString));
		sucesso.add(textoDescricaoString1.equals(textoDescricaoString));
		sucesso.add(textoOrigemString1.contains(textoOrigemString));
		sucesso.add(textoMovimentacaoSimbolicaString1.equals(textoMovimentacaoSimbolicaString));
		sucesso.add(textoDataInicioVigenciaString1.equals(textoDataInicioVigenciaString));
		sucesso.add(textoActivoString1.equals(textoActivoString));
		System.out.println(sucesso);
		return sucesso;
	}
}
