package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AliquotasDeTaxaDeActualizacaoVisualizarPO  extends TestBaseSteven{
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement taxasActualizacao;
	
	@FindBy(xpath = "//span[text()=\"Alíquotas de Taxa de Atualização\"]")
	public WebElement aliquotas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"indexCode\"]")
	public WebElement codigoIndiceV;
	@FindBy(xpath = "//span[@id=\"value\"]")
	public WebElement valorV;
	@FindBy(xpath = "//span[@id=\"accumulatedFactor\"]")
	public WebElement fatorAcumuladoV;
	@FindBy(xpath = "//span[@id=\"rate\"]")
	public WebElement taxaV;
	@FindBy(xpath = "//span[@id=\"periodValue\"]")
	public WebElement valorPeriodoV;
	@FindBy(xpath = "//span[@id=\"rateStartDate\"]")
	public WebElement inicioTaxaV;
	@FindBy(xpath = "//span[@id=\"rateEndDate\"]")
	public WebElement fimTaxaV;
	@FindBy(xpath = "//span[@id=\"updateRateDate\"]")
	public WebElement dataAtualizacaoV;
	@FindBy(xpath = "//span[@id=\"disclosureDate\"]")
	public WebElement dataDivulgacaoV;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Código do índice\"]")
	public WebElement codigoIndiceE;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor\"]")
	public WebElement valorE;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Valor Período\"]")
	public WebElement valorPeriodoE;
	@FindBy(xpath = "//input[@placeholder=\"Prencher o Fator Acumulado\"]")
	public WebElement fatorAcumuladoE;
	@FindBy(xpath = "//input[@placeholder=\"Prencher a Taxa\"]")
	public WebElement taxaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Início da Taxa\")]")
	public WebElement inicioTaxaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Fim da Taxa\")]")
	public WebElement fimTaxaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Divulgação da Taxa\")]")
	public WebElement dataDivulgacionE;	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Atualização da Taxa\")]")
	public WebElement dataActualizacionE;	
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public AliquotasDeTaxaDeActualizacaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		taxasActualizacao.click();
		sleep(2000);
		aliquotas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("taxasdeactualizacao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		

		String codigoIndiceV1 = codigoIndiceV.getText();
		String valorV1 = valorV.getText();
		String fatorAcumuladoV1 = fatorAcumuladoV.getText();
		String taxaV1 = taxaV.getText();
		String valorPeriodoV1 = valorPeriodoV.getText();
		String inicioTaxaV1 = inicioTaxaV.getText();
		String fimTaxaV1 = fimTaxaV.getText();
		String dataDivulgacaoV1 = dataDivulgacaoV.getText();
		String dataAtualizacaoV1 = dataAtualizacaoV.getText();

		System.out.println("----------VISUALIZAR----------");
		System.out.println(codigoIndiceV1);
		System.out.println(valorV1);
		System.out.println(fatorAcumuladoV1);
		System.out.println(taxaV1);
		System.out.println(valorPeriodoV1);
		System.out.println(inicioTaxaV1);
		System.out.println(fimTaxaV1);
		System.out.println(dataDivulgacaoV1);
		System.out.println(dataAtualizacaoV1);
		
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
		sleep(2000);
		
		String codigoIndiceE1 = codigoIndiceE.getAttribute("value");
		codigoIndiceE1 = codigoIndiceE1.replace(" - Tester", "");
		
		String valorE1 = valorE.getAttribute("value");
		valorE1= valorE1.replace(",", ".");
		
		String fatorAcumuladoE1 = fatorAcumuladoE.getAttribute("value");
		fatorAcumuladoE1= fatorAcumuladoE1.replace(",", ".");
		
		String taxaE1 = taxaE.getAttribute("value");
		taxaE1= taxaE1.replace(",", ".");
		
		String valorPeriodoE1 = valorPeriodoE.getAttribute("value");
		valorPeriodoE1= valorPeriodoE1.replace(",", ".");
		
		String inicioTaxaE1 = inicioTaxaE.getAttribute("value");
		String fimTaxaE1 = fimTaxaE.getAttribute("value");
		String dataDivulgacaoE1 = dataDivulgacionE.getAttribute("value");
		String dataAtualizacaoE1 = dataActualizacionE.getAttribute("value");

		System.out.println("");
		System.out.println("----------EDITAR-------------");
		System.out.println(codigoIndiceE1);
		System.out.println(valorE1);
		System.out.println(fatorAcumuladoE1);
		System.out.println(taxaE1);
		System.out.println(valorPeriodoE1);
		System.out.println(inicioTaxaE1);
		System.out.println(fimTaxaE1);
		System.out.println(dataDivulgacaoE1);
		System.out.println(dataAtualizacaoE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		sucesso.add(codigoIndiceV1.contains(codigoIndiceE1));
		sucesso.add(valorV1.equals(valorE1));
		sucesso.add(fatorAcumuladoV1.equals(fatorAcumuladoE1));
		sucesso.add(taxaE1.equals(taxaV1));
		sucesso.add(valorPeriodoV1.equals(valorPeriodoE1));
		sucesso.add(inicioTaxaV1.equals(inicioTaxaE1));
		sucesso.add(fimTaxaV1.equals(fimTaxaE1));
		sucesso.add(dataDivulgacaoV1.equals(dataDivulgacaoE1));
		sucesso.add(dataAtualizacaoV1.equals(dataAtualizacaoE1));
		
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
