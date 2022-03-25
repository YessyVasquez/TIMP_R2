package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoTipoCreditoDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.3.6 Tabela Código de Tipo de Crédito\"]")
	public WebElement tipoCredito;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Código de Tipo de Crédito\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoO;
	@FindBy(xpath = "//div[@id=\"creditTypeCode\"]/div/div/input")
	public WebElement codigo;
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement tributode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descricaode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement datade;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditTypeCode\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datavi;
	
	
	public CodigoTipoCreditoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		tipoCredito.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("codigotipocredito");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		detalhes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		String codigodetalhes = codigode.getText();
		String descricaodetalhes = descricaode.getText();
		String tributodetalhes = tributode.getText();
		String datadetalhes = datade.getText();
		
		System.out.println(tributodetalhes);
		System.out.println(codigodetalhes);
		System.out.println(descricaodetalhes);
		System.out.println(datadetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("codigotipocredito");;
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String codigovisualizar =  codigovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String tributovisualizar = tributovi.getText();
		String datavisualizar = datavi.getText();
		
		
		System.out.println(tributovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(descricaovisualizar.equals(descricaodetalhes));
		sucesso.add(tributovisualizar.equals(tributodetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		
		//String sucesso = driver.findElement(By.xpath("//*[@id=\"detail-name\"]")).getAttribute("class");
		
		return sucesso;
	}
}
