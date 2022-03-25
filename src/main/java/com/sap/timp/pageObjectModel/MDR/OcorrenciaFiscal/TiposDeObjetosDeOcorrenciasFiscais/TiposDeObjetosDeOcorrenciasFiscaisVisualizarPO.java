package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeObjetosDeOcorrenciasFiscaisVisualizarPO extends TestBaseSteven{
	

	
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciafiscal;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement tiposdeobjetosdeocorrenciasfiscais;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Ocorrência\"]")
	public WebElement ocorrencia;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o Objetos de Ocorrências\"]")
	public WebElement objetos;
	
	
	@FindBy(xpath = "//input[@placeholder=\"i18n[ACCESS CLASSIFICATION PLACEHOLDER]\"]")
	public WebElement classificacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Início de Vigência\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafim;
	
	@FindBy(xpath = "//span[@id=\"occurrence\"]")
	public WebElement ocorrenciavi;
	
	@FindBy(xpath = "//span[@id=\"occurrenceObject\"]")
	public WebElement objetosvi;
	
	@FindBy(xpath = "//span[@id=\"accessClassification\"]")
	public WebElement classificacaovi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datainiciovi;
	
	@FindBy(xpath = "//span[@id=\"validityTo\"]")
	public WebElement datafimvi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public TiposDeObjetosDeOcorrenciasFiscaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		ocorrenciafiscal.click();
		sleep(2000);
		
		tiposdeobjetosdeocorrenciasfiscais.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TiposDeObjetosDeOcorrenciasFiscais");
		
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
		//visualizar
		
		String ocorrenciavisualizar = ocorrenciavi.getText();
		String objetosvisualizar = objetosvi.getText();
		//String classificacaovisualizar = classificacaovi.getText();
		String datainiciovisualizar = datainiciovi.getText();
		String datafimvisualizar = datafimvi.getText();
		
		
		System.out.println( ocorrenciavisualizar);
		System.out.println(objetosvisualizar);
		//System.out.println(classificacaovisualizar);
		System.out.println(datainiciovisualizar);
		System.out.println(datafimvisualizar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TiposDeObjetosDeOcorrenciasFiscais");
		
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
		
		String ocorrenciaeditar=ocorrencia.getAttribute("value");
		String objetoseditar=objetos.getAttribute("value");
	//	String classificacaoeditar=classificacao.getAttribute("value");
		String datainicioeditar = datainicio.getAttribute("value");
		String datafimeditar = datafim.getAttribute("value");
	
	
		System.out.println( ocorrenciaeditar);
		System.out.println( objetoseditar);
		//System.out.println(classificacaoeditar);
		System.out.println(datainicioeditar);
		System.out.println(datafimeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(ocorrenciavisualizar.equals(ocorrenciaeditar));
		sucesso.add(objetosvisualizar.equals(objetoseditar));
	//	sucesso.add(classificacaovisualizar.equals(classificacaoeditar));
		sucesso.add(datainiciovisualizar.equals(datainicioeditar));
		sucesso.add(datafimvisualizar.equals(datafimeditar));
		
		return sucesso;	

	
	}	
	
	

}

