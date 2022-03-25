package com.sap.timp.pageObjectModel.TPC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParâmetrosGeraisVisualizarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[11]/ul/li[2]/div/span[2]")
	public WebElement Painel;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Layout de Painel\"]")
	public WebElement configuracionPainel;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	public ParâmetrosGeraisVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver(){

		System.out.println("onyu");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div/ul/li[3]/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		// Datos de visualizar
		String dataVencimentoString = driver.findElement(By.xpath("//*[@id=\"dueDate\"]/div/div/input")).getAttribute("value").trim();
		String empresatring = driver.findElement(By.xpath("//*[@id=\"company\"]/div/div/input")).getAttribute("value").trim();
		String estadoString = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div/input")).getAttribute("value").trim();
		String filialString = driver.findElement(By.xpath("//*[@id=\"branch\"]/div/div/input")).getAttribute("value").trim();
		String tributoString = driver.findElement(By.xpath("//*[@id=\"tax\"]/div/div/input")).getAttribute("value").trim();
		String subPeriodoString = driver.findElement(By.xpath("//*[@id=\"subPeriod\"]/div/div/input")).getAttribute("value").trim();
		String codReceitaString = driver.findElement(By.xpath("//*[@id=\"revenueCode\"]/div/div/input")).getAttribute("value").trim();
		String codAjusteString = driver.findElement(By.xpath("//*[@id=\"accCode\"]/div/div/input")).getAttribute("value").trim();
		String formularioString = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("Datos de Ver");
		System.out.println("data vencimento: " + dataVencimentoString);
		System.out.println("empresa: " + empresatring);
		System.out.println("estado: " + estadoString);
		System.out.println("filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("subperiodo: " + subPeriodoString);
		System.out.println("codigo receita: " + codReceitaString);
		System.out.println("codigo ajuste: " + codAjusteString);
		System.out.println("formulario: " + formularioString);
		
		System.out.println("");
		
		sleep(2000);
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div/ul/li[5]/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		// Datos de Editar
		String dataVencimentoStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecione a Data de Vencimento\"]")).getAttribute("value").trim();
		String empresatringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Empresa\"]")).getAttribute("value").trim();
		String estadoStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar UF\"]")).getAttribute("value").trim();
		String filialStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Filial\"]")).getAttribute("value").trim();
		String tributoStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Tributo\"]")).getAttribute("value").trim();
		String subPeriodoStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Subperíodo\"]")).getAttribute("value").trim();
		String codReceitaStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Código da Receita\"]")).getAttribute("value").trim();
		String codAjusteStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Código de Ajuste\"]")).getAttribute("value").trim();
		String formularioStringV = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Formulário\"]")).getAttribute("value").trim();
		
		System.out.println("Datos de Ver");
		System.out.println("data vencimento: " + dataVencimentoStringV);
		System.out.println("empresa: " + empresatringV);
		System.out.println("estado: " + estadoStringV);
		System.out.println("filial: " + filialStringV);
		System.out.println("Tributo: " + tributoStringV);
		System.out.println("subperiodo: " + subPeriodoStringV);
		System.out.println("codigo receita: " + codReceitaStringV);
		System.out.println("codigo ajuste: " + codAjusteStringV);
		System.out.println("formulario: " + formularioStringV);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(dataVencimentoString.equals(dataVencimentoStringV));
		sucesso.add(empresatring.equals(empresatringV));
		sucesso.add(estadoString.equals(estadoStringV));
		sucesso.add(filialString.equals(filialStringV));
		sucesso.add(tributoString.equals(tributoStringV));
		sucesso.add(subPeriodoString.equals(subPeriodoStringV));
		//sucesso.add(codReceitaString.equals(codReceitaStringV));
		sucesso.add(codAjusteString.equals(codAjusteStringV));
		sucesso.add(formularioString.equals(formularioStringV));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}

}
