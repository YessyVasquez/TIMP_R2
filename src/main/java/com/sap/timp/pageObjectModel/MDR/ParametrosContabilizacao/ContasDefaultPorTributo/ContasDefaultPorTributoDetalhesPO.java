package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultPorTributoDetalhesPO extends TestBaseSteven{

	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default por Tributo (Substituir Conta Estoque)\"]")
	public WebElement contasdefaultportributo;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoAjusteD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement contaCreditoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement contaDebitoD;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
	public WebElement codigoAjusteV;
	
	@FindBy(xpath = "//span[@id=\"creditAccount\"]")
	public WebElement contaCreditoV;
	
	@FindBy(xpath = "//span[@id=\"debitAccount\"]")
	public WebElement contaDebitoV;
	

	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	public ContasDefaultPorTributoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultportributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContasDefaultPorTributo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoAjusteD1 = codigoAjusteD.getText();
		String contaCreditoD1 = contaCreditoD.getText();
		String contaDebitoD1 = contaDebitoD.getText();
		
		System.out.println(codigoAjusteD1);
		System.out.println(contaCreditoD1);
		System.out.println(contaDebitoD1);


		
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("ContasDefaultPorTributo");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoAjusteV1 = codigoAjusteV.getText();
		String contaCreditoV1 = contaCreditoV.getText();
		String contaDebitoV1 = contaDebitoV.getText();
		

		System.out.println(codigoAjusteV1);
		System.out.println(contaCreditoV1);
		System.out.println(contaDebitoV1);


		
	
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(codigoAjusteV1.contains(codigoAjusteD1));
		sucesso.add(contaCreditoV1.contains(contaCreditoD1));
		sucesso.add(contaDebitoV1.contains(contaDebitoD1));
		
		System.out.println(sucesso);	
		return sucesso;	

		
	}
}
