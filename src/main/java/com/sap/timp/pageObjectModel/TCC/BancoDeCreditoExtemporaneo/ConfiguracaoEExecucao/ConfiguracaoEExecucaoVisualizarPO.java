package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracaoEExecucaoVisualizarPO extends TestBaseFernando {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement branch;
	
	
	public ConfiguracaoEExecucaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		invisibilityOfElementOverlay();
		bancoCreditoExtemporaneo.click();
		sleep(1000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("idConfiguracaoEExecucaco");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(branch);
		sleep(2000);
		
		sleep(5000);
		

		String empresaString = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/div/div/div[1]")).getText().trim();
		String ufString = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/div/div/div[1]")).getText().trim();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String tipoDeImposto = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		String detalheTipoTributo = driver.findElement(By.xpath("//div[@id=\"taxTypeDetail\"]/div/div/div/input")).getAttribute("value").trim();
		String idDeFluxoBpma = driver.findElement(By.xpath("//div[@id=\"idFluxoBpma\"]/div/div/div/div/div[2]/input")).getAttribute("value").trim();
		String inicioDeVigenciaString = driver.findElement(By.xpath("//div[@id=\"initialDate\"]/div/div/input")).getAttribute("value").trim();
		String codigoDeAjusteDeEstornoDeCredito = driver.findElement(By.xpath("//div[@id=\"adjustmentCode\"]/div/div/div/input")).getAttribute("value").trim();
		String codigoDeAjusteDeCredito = driver.findElement(By.xpath("//div[@id=\"creditAdjustmentCode\"]/div/div/div/input")).getAttribute("value").trim();
		String tipoString = driver.findElement(By.xpath("//div[@id=\"type\"]/div/div/div/input")).getAttribute("value").trim();
		
		System.out.println("");
		System.out.println("***************Datos de Visualizar************");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Tipo de Imposto: " + tipoDeImposto);
		System.out.println("Detalhe Tipo Tributo: " + detalheTipoTributo);
		System.out.println("Id de  Fluxo BPMA: " + idDeFluxoBpma);
		System.out.println("Inicio de Vigencia: " + inicioDeVigenciaString);
		System.out.println("codigo de Ajuste de Estorno de Credito: " + codigoDeAjusteDeEstornoDeCredito);
		System.out.println("Codigo de Ajuste de Credito: " + codigoDeAjusteDeCredito);
		System.out.println("Tipo: " + tipoString);
		
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(branch);
		sleep(2000);
		
		sleep(5000);
	
		
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/div/div/div[1]")).getText().trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/div/div/div[1]")).getText().trim();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String tipoDeImposto1 = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		String detalheTipoTributo1 = driver.findElement(By.xpath("//div[@id=\"taxTypeDetail\"]/div/div/div/input")).getAttribute("value").trim();
		String idDeFluxoBpma1 = driver.findElement(By.xpath("//div[@id=\"idFluxoBpma\"]/div/div/div/div/div[2]/input")).getAttribute("value").trim();
		String inicioDeVigenciaString1 = driver.findElement(By.xpath("//div[@id=\"initialDate\"]/div/div/input")).getAttribute("value").trim();
		String codigoDeAjusteDeEstornoDeCredito1 = driver.findElement(By.xpath("//div[@id=\"adjustmentCode\"]/div/div/div/input")).getAttribute("value").trim();
		String codigoDeAjusteDeCredito1 = driver.findElement(By.xpath("//div[@id=\"creditAdjustmentCode\"]/div/div/div/input")).getAttribute("value").trim();
		String tipoString1 = driver.findElement(By.xpath("//div[@id=\"type\"]/div/div/div/input")).getAttribute("value").trim();
		
		System.out.println("");
		System.out.println("*************Datos de Editar*************");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Tipo de Imposto: " + tipoDeImposto1);
		System.out.println("Detalhe Tipo Tributo: " + detalheTipoTributo1);
		System.out.println("Id de  Fluxo BPMA: " + idDeFluxoBpma1);
		System.out.println("Inicio de Vigencia: " + inicioDeVigenciaString1);
		System.out.println("codigo de Ajuste de Estorno de Credito: " + codigoDeAjusteDeEstornoDeCredito1);
		System.out.println("Codigo de Ajuste de Credito: " + codigoDeAjusteDeCredito1);
		System.out.println("Tipo: " + tipoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString.equals(empresaString1));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(tipoDeImposto1.equals(tipoDeImposto));
		sucesso.add(detalheTipoTributo1.equals(detalheTipoTributo));
		sucesso.add(idDeFluxoBpma1.equals(idDeFluxoBpma));
		sucesso.add(inicioDeVigenciaString1.equals(inicioDeVigenciaString));
		sucesso.add(codigoDeAjusteDeEstornoDeCredito1.equals(codigoDeAjusteDeEstornoDeCredito));
		sucesso.add(codigoDeAjusteDeCredito1.equals(codigoDeAjusteDeCredito));
		sucesso.add(tipoString1.equals(tipoString));
		
		System.out.println("");
		System.out.println(sucesso);
		return sucesso;
	}
}
