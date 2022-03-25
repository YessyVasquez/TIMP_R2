package com.sap.timp.pageObjectModel.MDR.MapeamentoDeRelevanciaParaPisCofins;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeRelevanciaParaPisCofinsVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement mapeamentoderelevancia;
	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement novomapeamentoderelevancia;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Relevância\"]")
	public WebElement relevancia;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código da Conta\"]")
	public WebElement codigoconta;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Inicio de Vigência\"]")
	public WebElement dataincio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafinal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"accountCode\"]")
	public WebElement codigocontavi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"relevance\"]")
	public WebElement relevanciavi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datainicialvi;
	
	@FindBy(xpath = "//span[@id=\"endDate\"]")
	public WebElement datafinalvi;
		
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div/input")
	public WebElement empresaed;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"tax\"]/div/div/div/input")
	public WebElement tributoed;
	
	public MapeamentoDeRelevanciaParaPisCofinsVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		mapeamentoderelevancia.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeRelevanciaParaPisCofins");
		
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
		String empresavisualizar = empresavi.getText();
		String codigovisualizar = codigocontavi.getText();
		String descricaovisualizar= descricaovi.getText();
		String relevanciavisualizar = relevanciavi.getText();
		String datainicialvisualizar = datainicialvi.getText();
		String datafinalvisualizar = datafinalvi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(codigovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(relevanciavisualizar);
		System.out.println(datainicialvisualizar);
		System.out.println(datafinalvisualizar);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("MapeamentoDeRelevanciaParaPisCofins");
		
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
		
		String empresaeditar=empresaed.getAttribute("value");
		String codigoeditar=codigoconta.getAttribute("value");
		String descricaoeditar=descricao.getAttribute("value");
		String relevanciaeditar=relevancia.getAttribute("value");
		String datainicialeditar = dataincio.getAttribute("value");
		String datafinaleditar = datafinal.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(codigoeditar);
		System.out.println(descricaoeditar);
		System.out.println(relevanciaeditar);
		System.out.println(datainicialeditar);
		System.out.println(datafinaleditar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(relevanciavisualizar.equals(relevanciaeditar));
		sucesso.add(datainicialvisualizar.equals(datainicialeditar));
		sucesso.add(datafinalvisualizar.equals(datafinaleditar));
		return sucesso;	

	
	
	
	}
}
