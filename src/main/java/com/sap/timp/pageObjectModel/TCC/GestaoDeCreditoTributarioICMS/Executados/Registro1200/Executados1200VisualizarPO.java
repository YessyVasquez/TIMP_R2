package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Executados1200VisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Execution\"]")
	public WebElement registro12000;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement Executar;
	
	@FindBy(xpath = "//div[@class=\"empresa\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//div[@class=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//div[@class=\"filial\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//div[@class=\"tributo\"]")
	public WebElement tributovi;
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement arinicio;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executar1;
	
	@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
	public WebElement periodovi;
	
	
	@FindBy(xpath = "//div[@class=\"empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"uf\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[1]/div")
	public WebElement creditosfiscaisanterioresvi;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[2]/div")
	public WebElement creditosapropriadonomesvi;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[3]/div")
	public WebElement creditosrecebidosportransferenciavi;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement creditosutilizadosnoperiodovi;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[5]/div")
	public WebElement creditofiscalacumuladovi;
	
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[1]/div")
	public WebElement creditosfiscaisanteriores;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[2]/div")
	public WebElement creditosapropriadonomes;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[3]/div")
	public WebElement creditosrecebidosportransferencia;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement creditosutilizadosnoperiodo;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[5]/div")
	public WebElement creditofiscalacumulado;
	
	String URL = driver.getCurrentUrl();
	
	public Executados1200VisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		
		executados.click();
		sleep(2000);
		registro12000.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200Executados");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(periodovi);
		sleep(2000);
		
		String periodovisualizar = periodovi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String empresavisualizar = empresavi.getText();
		String anterioresvisualizar =creditosfiscaisanterioresvi.getText();
		String mesvisualizar = creditosapropriadonomesvi.getText();
		String transferenciavisualizar = creditosrecebidosportransferenciavi.getText();
		String creditoperiodovisualizar = creditosutilizadosnoperiodovi.getText();
		String acumuladovisualizar = creditofiscalacumuladovi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(periodovisualizar);
		System.out.println(anterioresvisualizar);
		System.out.println(mesvisualizar);
		System.out.println(transferenciavisualizar);
		System.out.println(creditoperiodovisualizar);
		System.out.println(acumuladovisualizar);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*
		executados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(periodo);
		sleep(2000);
		
		String periodoeditar = periodo.getText();
		String ufeditar = uf.getText();
		String filialeditar = filial.getText();
		String tributoeditar = tributo.getText();
		String empresaeditar = empresa.getText();
		String anterioreseditar =creditosfiscaisanteriores.getText();
		String meseditar = creditosapropriadonomes.getText();
		String transferenciaeditar = creditosrecebidosportransferencia.getText();
		String creditoperiodoeditar = creditosutilizadosnoperiodo.getText();
		String acumuladoeditar = creditofiscalacumulado.getText();
		
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(periodoeditar);
		System.out.println(anterioreseditar);
		System.out.println(meseditar);
		System.out.println(transferenciaeditar);
		System.out.println(creditoperiodoeditar);
		System.out.println(acumuladoeditar);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(ufeditar.contains(ufvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(periodoeditar.contains(periodovisualizar));
		sucesso.add(anterioreseditar.contains(anterioresvisualizar));
		sucesso.add(meseditar.contains(mesvisualizar));
		sucesso.add(transferenciaeditar.contains(transferenciavisualizar));
		sucesso.add(creditoperiodoeditar.contains(creditoperiodovisualizar));
		sucesso.add(acumuladoeditar.contains(acumuladovisualizar));
		System.out.println(sucesso);
		return sucesso;
	}

}
