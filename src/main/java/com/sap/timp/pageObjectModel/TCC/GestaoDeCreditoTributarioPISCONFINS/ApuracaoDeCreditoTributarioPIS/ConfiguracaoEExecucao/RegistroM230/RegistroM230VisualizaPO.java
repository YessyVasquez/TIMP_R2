package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM230;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM230VisualizaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM230\"]")
	public WebElement registroM230;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"vlVend\"]/div[1]/div[1]/input")
	public WebElement valorTotalVendasPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlNaoReceb\"]/div[1]/div[1]/input")
	public WebElement valorTotalRecebidoPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlContDif\"]/div[1]/div[1]/input")
	public WebElement valorContribuiçãoDiferidaPeríodo;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public RegistroM230VisualizaPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuraçãoCrédito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM230.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM230");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(6000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(filial);
		sleep(10000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String valorTotalVendasPeríodovisualizar = valorTotalVendasPeríodo.getAttribute("value");
		String valorTotalRecebidoPeríodovisualizar = valorTotalRecebidoPeríodo.getAttribute("value");
		String valorContribuiçãoDiferidaPeríodovisualizar = valorContribuiçãoDiferidaPeríodo.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(valorTotalVendasPeríodovisualizar);
		System.out.println(valorTotalRecebidoPeríodovisualizar);
		System.out.println(valorContribuiçãoDiferidaPeríodovisualizar);
		
		biblioteca.click();
		sleep(4000);
		
		no.click();
		sleep(20000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(filial);
		sleep(12000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String valorTotalVendasPeríodoEditar = valorTotalVendasPeríodo.getAttribute("value");
		String valorTotalRecebidoPeríodoEditar = valorTotalRecebidoPeríodo.getAttribute("value");
		String valorContribuiçãoDiferidaPeríodoEditar = valorContribuiçãoDiferidaPeríodo.getAttribute("value");
		
		System.out.println("------------------------------");
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(valorTotalVendasPeríodoEditar);
		System.out.println(valorTotalRecebidoPeríodoEditar);
		System.out.println(valorContribuiçãoDiferidaPeríodoEditar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(valorTotalVendasPeríodoEditar.contains(valorTotalVendasPeríodovisualizar));
		sucesso.add(valorTotalRecebidoPeríodoEditar.contains(valorTotalRecebidoPeríodovisualizar));
		sucesso.add(valorContribuiçãoDiferidaPeríodoEditar.contains(valorContribuiçãoDiferidaPeríodovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}
}

