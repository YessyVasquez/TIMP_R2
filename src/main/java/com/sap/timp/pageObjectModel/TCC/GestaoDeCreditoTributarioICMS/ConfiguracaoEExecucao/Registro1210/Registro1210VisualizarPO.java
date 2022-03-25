package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Registro1210VisualizarPO  extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCreditoTributarioICMS;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"][1]/ul/li/ul/li/div/span[text()=\"Registro 1210\"]")
	public WebElement registro1210;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[1]/div[1]/div/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]")
	public WebElement tipoImposo;
	
	@FindBy(xpath = "//div[@id=\"taxTypeDetail\"]/div/div[1]/div[1]/input")
	public WebElement detalheTributo;
	
	@FindBy(xpath = "//div[@id=\"creditControl\"]/div/div[1]/div[1]/input")
	public WebElement controleCrédito;
	
	@FindBy(xpath = "//div[@id=\"creditControlDescription\"]/div/textarea")
	public WebElement descriçãoControle;
	
	@FindBy(xpath = "//div[@id=\"adjustmentCode\"]/div/div[1]/div[1]/input")
	public WebElement codigoAjuste;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public  Registro1210VisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gestaoCreditoTributarioICMS.click();
		sleep(1000);
		
		configuracaoEExecucao.click();
		sleep(1000);
		
		registro1210.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Registro1210");
//		String idRegistro = "21"; // 2 para TC2, 21 TP1 Descomentar aqui para probar el TA
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		String empresaV = empresa.getText();
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tributoV = tributo.getAttribute("value");
		String tipoImposoV = tipoImposo.getAttribute("value");
		String detalheTributoV = tributo.getAttribute("value");
		String controleCréditoV = tributo.getAttribute("value");
		String descriçãoControleV = tributo.getAttribute("value");
		String codigoAjusteV = tributo.getAttribute("value");
		
		System.out.println("---------------Informação no Visualizar-----------------");
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(tipoImposoV);
		System.out.println(detalheTributoV);
		System.out.println(controleCréditoV);
		System.out.println(descriçãoControleV);
		System.out.println(codigoAjusteV);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));


		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]");
		sleep(2000);
		
		
		String empresaE = empresa.getText();
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tributoE = tributo.getAttribute("value");
		String tipoImposoE = tipoImposo.getAttribute("value");
		String detalheTributoE = tributo.getAttribute("value");
		String controleCréditoE = tributo.getAttribute("value");
		String descriçãoControleE = tributo.getAttribute("value");
		String codigoAjusteE = tributo.getAttribute("value");
		
		System.out.println("---------------Informação na Edição-----------------");
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(tipoImposoE);
		System.out.println(detalheTributoE);
		System.out.println(controleCréditoE);
		System.out.println(descriçãoControleE);
		System.out.println(codigoAjusteE);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(tipoImposoE.equals(tipoImposoV));
		sucesso.add(detalheTributoE.equals(detalheTributoV));
		sucesso.add(controleCréditoE.equals(controleCréditoV));
		sucesso.add(descriçãoControleE.equals(descriçãoControleV));
		sucesso.add(codigoAjusteE.equals(codigoAjusteV));
	
		System.out.println(sucesso);
		return sucesso;
	}
}
