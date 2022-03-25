package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoTipoCreditoVisualizarPO extends TestBaseSteven {
	
	
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
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"creditTypeCode\"]")
	public WebElement codigoTipoCreditoV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher o Código de Tipo de Crédito\")]")
	public WebElement codigoTipoCreditoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Início\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public CodigoTipoCreditoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		String codigoTipoCreditoV1 = codigoTipoCreditoV.getText();
		String descricaoV1 = descricaoV.getText();
		String tributoV1 = tributoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();

		
		
		System.out.println(codigoTipoCreditoV1);
		System.out.println(descricaoV1);
		System.out.println(tributoV1);
		System.out.println(dataVigenciaV1);

		
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
		
		String codigoTipoCreditoE1 = codigoTipoCreditoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String tributoE1 = tributoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");

		
		
		System.out.println(codigoTipoCreditoE1);
		System.out.println(descricaoE1);
		System.out.println(tributoE1);
		System.out.println(dataVigenciaE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoTipoCreditoV1.contains(codigoTipoCreditoE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
	
		System.out.println(sucesso);


		return sucesso;
		
	}
		
	
	

}
