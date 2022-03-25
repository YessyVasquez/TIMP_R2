package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UtilizacaoDosCreditosEmPeriodoAnteriorVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Utilização dos Créditos em Período Anterior\"]")
	public WebElement utilizacaodoscreditos;
	
	
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[1]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Ind. Desc. Cred\"]")
	public WebElement codigodecredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Utilização\"]")
	public WebElement ordemdeutilizacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditCode\"]")
	public WebElement codigocreditovi;
	
	@FindBy(xpath = "//span[@id=\"utilizationOrder\"]")
	public WebElement ordemvi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;
	
	public UtilizacaoDosCreditosEmPeriodoAnteriorVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		utilizacaodoscreditos.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("UtilizacaoDosCreditosEmPeriodoAnterior");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		waitExpectElement(empresavi);
		sleep(2000);
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String codigovisualizar = codigocreditovi.getText();
		String ordemdeutilizacaovisualizar = ordemvi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(ordemdeutilizacaovisualizar);
		System.out.println(datavisualizar);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("UtilizacaoDosCreditosEmPeriodoAnterior");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaeditar = empresa.getText();
		String filialeditar = filial.getText();
		String tributoeditar = tributo.getText();
		String codigoeditar = codigodecredito.getAttribute("value");
		String ordemdeutilizacaoeditar = ordemdeutilizacao.getAttribute("value");
		String dataeditar = dataincial.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(codigoeditar);
		System.out.println(ordemdeutilizacaoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(filialvisualizar.equals(filialeditar));
		sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(ordemdeutilizacaovisualizar.equals(ordemdeutilizacaoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}

}
