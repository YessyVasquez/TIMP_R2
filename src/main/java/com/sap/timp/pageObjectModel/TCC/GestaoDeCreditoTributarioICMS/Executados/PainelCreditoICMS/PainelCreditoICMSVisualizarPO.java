package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class PainelCreditoICMSVisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsExecution\"]")
	public WebElement executadosPainelCréditoICMS;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
	public WebElement periodovi;
	
	@FindBy(xpath = "//div[@class=\"empresa\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//div[@class=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//div[@class=\"filial\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//div[@class=\"tributo\"]")
	public WebElement tributovi;
	
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

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public PainelCreditoICMSVisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		executadosPainelCréditoICMS.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistroExecucao = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucacoExecutados");
		System.out.println("");
		System.out.println("ID Registro Excecutado: " + idRegistroExecucao);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroExecucao+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroExecucao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(periodovi);
		sleep(2000);
		
		String periodovisualizar = periodovi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String empresavisualizar = empresavi.getText();
	
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(periodovisualizar);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		executadosPainelCréditoICMS.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroExecucao+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroExecucao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
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
		
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(periodoeditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(ufeditar.contains(ufvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(periodoeditar.contains(periodovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
