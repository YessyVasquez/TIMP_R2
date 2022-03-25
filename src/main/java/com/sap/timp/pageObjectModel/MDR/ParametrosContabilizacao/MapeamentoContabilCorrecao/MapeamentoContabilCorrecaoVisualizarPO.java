package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoContabilCorrecaoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento Contábil por Correção\"]")
	public WebElement contabil;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"header-text\"]")
	public WebElement cabecalhoV;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder, \"Cabeçalho\")]")
	public WebElement cabecalhoE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	public MapeamentoContabilCorrecaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		parametro.click();
		sleep(1000);
		contabil.click();
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);

		//siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
								 
		String idRegistro = idObter(" MapeamentoContabilCorrecao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String cabecalhoV1 = cabecalhoV.getText();

		
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(cabecalhoV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
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
		attributoNotToBeEmptyElement(cabecalhoE, "value");
		sleep(3000);
		
		//String empresaE1 = empresaE.getAttribute("textContent");
		//String filialE1 = filialE.getAttribute("textContent");
		String cabecalhoE1 = cabecalhoE.getAttribute("value");

		
		
	//	System.out.println(empresaE1);
	//	System.out.println(filialE1);
		System.out.println(cabecalhoE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//sucesso.add(empresaV1.contains(empresaE1));
		//sucesso.add(filialV1.contains(filialE1));
		sucesso.add(cabecalhoV1.contains(cabecalhoE1));

		System.out.println(sucesso);




		return sucesso;

	}

}
