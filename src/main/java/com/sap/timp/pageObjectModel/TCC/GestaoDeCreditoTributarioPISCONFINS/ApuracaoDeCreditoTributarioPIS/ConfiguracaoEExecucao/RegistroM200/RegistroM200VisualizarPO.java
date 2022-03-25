package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM200VisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM200\"]")
	public WebElement registroM200;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcPer\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribuiçãoNãoCumulativaPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDesc\"]/div[1]/div[1]/input")
	public WebElement valorCréditoDescontadoApuradoPróprioPeríodoEscrituração;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDescAnt\"]/div[1]/div[1]/input")
	public WebElement valorCréditoDescontadoApuradoPeríodoAnteriorEscrituração;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcDev\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribuiçãoNãoCumulativaDevida;
	
	@FindBy(xpath = "//div[@id=\"vlRetNc\"]/div[1]/div[1]/input")
	public WebElement ValorRetidoFonteDeduzidoPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedNc\"]/div[1]/div[1]/input")
	public WebElement outrasDeduçõesPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlContNcRec\"]/div[1]/div[1]/input")
	public WebElement valorContribuiçãoCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContCumPer\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribuiçãoCumulativaPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlRetCum\"]/div[1]/div[1]/input")
	public WebElement valorRetidoFonteDeduzidoPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedCum\"]/div[1]/div[1]/input")
	public WebElement outraDeduçõesPeríodo;
	
	@FindBy(xpath = "//div[@id=\"vlContCumRec\"]/div[1]/div[1]/input")
	public WebElement valordaContribuiçãoCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContRec\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribuiçãoRecolherPagarPeríodo;
	
	public RegistroM200VisualizarPO() {

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
		registroM200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM200");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(6000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String valorTotalContribuiçãoNãoCumulativaPeríodovisualizar = valorTotalContribuiçãoNãoCumulativaPeríodo.getAttribute("value");
		String valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãovisualizar = valorCréditoDescontadoApuradoPróprioPeríodoEscrituração.getAttribute("value");
		String valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãovisualizar = valorCréditoDescontadoApuradoPeríodoAnteriorEscrituração.getAttribute("value");
		String valorTotalContribuiçãoNãoCumulativaDevidavisualizar = valorTotalContribuiçãoNãoCumulativaDevida.getAttribute("value");
		String ValorRetidoFonteDeduzidoPeríodovisualizar = ValorRetidoFonteDeduzidoPeríodo.getAttribute("value");
		String outrasDeduçõesPeríodovisualizar = outrasDeduçõesPeríodo.getAttribute("value");
		String valorContribuiçãoCumulativaRecolherPagarvisualizar = valorContribuiçãoCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribuiçãoCumulativaPeríodovisualizar = valorTotalContribuiçãoCumulativaPeríodo.getAttribute("value");
		String valorRetidoFonteDeduzidoPeríodovisualizar = 	valorRetidoFonteDeduzidoPeríodo.getAttribute("value");
		String OutraDeduçõesPeríodovisualizar = outraDeduçõesPeríodo.getAttribute("value");
		String valordaContribuiçãoCumulativaRecolherPagarvisualizar = valordaContribuiçãoCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribuiçãoRecolherPagarPeríodovisualizar = valorTotalContribuiçãoRecolherPagarPeríodo.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(valorTotalContribuiçãoNãoCumulativaPeríodovisualizar);
		System.out.println(valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãovisualizar);
		System.out.println(valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãovisualizar);
		System.out.println(valorTotalContribuiçãoNãoCumulativaDevidavisualizar);
		System.out.println(ValorRetidoFonteDeduzidoPeríodovisualizar);
		System.out.println(outrasDeduçõesPeríodovisualizar);
		System.out.println(valorContribuiçãoCumulativaRecolherPagarvisualizar);
		System.out.println(valorTotalContribuiçãoCumulativaPeríodovisualizar);
		System.out.println(valorRetidoFonteDeduzidoPeríodovisualizar);
		System.out.println(OutraDeduçõesPeríodovisualizar);
		System.out.println(valordaContribuiçãoCumulativaRecolherPagarvisualizar);
		System.out.println(valorTotalContribuiçãoRecolherPagarPeríodovisualizar);
		
		biblioteca.click();
		sleep(4000);
		
		no.click();
		sleep(15000);
			
	
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
		sleep(16000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String valorTotalContribuiçãoNãoCumulativaPeríodoEditar = valorTotalContribuiçãoNãoCumulativaPeríodo.getAttribute("value");
		String valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãoEditar = valorCréditoDescontadoApuradoPróprioPeríodoEscrituração.getAttribute("value");
		String valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãoEditar = valorCréditoDescontadoApuradoPeríodoAnteriorEscrituração.getAttribute("value");
		String valorTotalContribuiçãoNãoCumulativaDevidaEditar = valorTotalContribuiçãoNãoCumulativaDevida.getAttribute("value");
		String ValorRetidoFonteDeduzidoPeríodoEditar = ValorRetidoFonteDeduzidoPeríodo.getAttribute("value");
		String outrasDeduçõesPeríodoEditar = outrasDeduçõesPeríodo.getAttribute("value");
		String valorContribuiçãoCumulativaRecolherPagarEditar = valorContribuiçãoCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribuiçãoCumulativaPeríodoEditar = valorTotalContribuiçãoCumulativaPeríodo.getAttribute("value");
		String valorRetidoFonteDeduzidoPeríodoEditar = valorRetidoFonteDeduzidoPeríodo.getAttribute("value");
		String outraDeduçõesPeríodoEditar = outraDeduçõesPeríodo.getAttribute("value");
		String valordaContribuiçãoCumulativaRecolherPagarEditar = valordaContribuiçãoCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribuiçãoRecolherPagarPeríodoEditar = valorTotalContribuiçãoRecolherPagarPeríodo.getAttribute("value");
		
		System.out.println("------------------------------");
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(valorTotalContribuiçãoNãoCumulativaPeríodoEditar);
		System.out.println(valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãoEditar);
		System.out.println(valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãoEditar);
		System.out.println(valorTotalContribuiçãoNãoCumulativaDevidaEditar);
		System.out.println(ValorRetidoFonteDeduzidoPeríodoEditar);
		System.out.println(outrasDeduçõesPeríodoEditar);
		System.out.println(valorContribuiçãoCumulativaRecolherPagarEditar);
		System.out.println(valorTotalContribuiçãoCumulativaPeríodoEditar);
		System.out.println(valorRetidoFonteDeduzidoPeríodoEditar);
		System.out.println(outraDeduçõesPeríodoEditar);
		System.out.println(valordaContribuiçãoCumulativaRecolherPagarEditar);
		System.out.println(valorTotalContribuiçãoRecolherPagarPeríodoEditar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(valorTotalContribuiçãoNãoCumulativaPeríodoEditar.contains(valorTotalContribuiçãoNãoCumulativaPeríodovisualizar));
		sucesso.add(valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãoEditar.contains(valorCréditoDescontadoApuradoPróprioPeríodoEscrituraçãovisualizar));
		sucesso.add(valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãoEditar.contains(valorCréditoDescontadoApuradoPeríodoAnteriorEscrituraçãovisualizar));
		sucesso.add(valorTotalContribuiçãoNãoCumulativaDevidaEditar.contains(valorTotalContribuiçãoNãoCumulativaDevidavisualizar));
		sucesso.add(ValorRetidoFonteDeduzidoPeríodoEditar.contains(ValorRetidoFonteDeduzidoPeríodovisualizar));
		sucesso.add(outrasDeduçõesPeríodoEditar.contains(outrasDeduçõesPeríodovisualizar));
		sucesso.add(valorContribuiçãoCumulativaRecolherPagarEditar.contains(valorContribuiçãoCumulativaRecolherPagarvisualizar));
		sucesso.add(valorTotalContribuiçãoCumulativaPeríodoEditar.contains(valorTotalContribuiçãoCumulativaPeríodovisualizar));
		sucesso.add(valorRetidoFonteDeduzidoPeríodoEditar.contains(valorRetidoFonteDeduzidoPeríodovisualizar));
		sucesso.add(outraDeduçõesPeríodoEditar.contains(OutraDeduçõesPeríodovisualizar));
		sucesso.add(valordaContribuiçãoCumulativaRecolherPagarEditar.contains(valordaContribuiçãoCumulativaRecolherPagarvisualizar));
		sucesso.add(valorTotalContribuiçãoRecolherPagarPeríodoEditar.contains(valorTotalContribuiçãoRecolherPagarPeríodovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	
	
}
