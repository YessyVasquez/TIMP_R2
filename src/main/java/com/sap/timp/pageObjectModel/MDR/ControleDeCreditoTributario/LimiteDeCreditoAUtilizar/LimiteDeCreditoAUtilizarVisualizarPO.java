package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LimiteDeCreditoAUtilizarVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Limite de Crédito a Utilizar\"]")
	public WebElement limitedecreditoautilizar;
	
	@FindBy(xpath = "//span[text()=\"Novo Limite de Crédito a Utilizar\"]")
	public WebElement novolimitedecreditoautilizar;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	

	@FindBy(xpath = "//div[@class=\"field\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Limite de Utilização do Crédito\"]")
	public WebElement limitedeutilizacaodecredito;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div")
	public WebElement empresaed;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div")
	public WebElement filialed;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-23\"]")
	public WebElement tributoed;
	
	@FindBy(xpath = "//div[@id=\"creditUtilizationLimit\"]/div/div/input")
	public WebElement utilizacaodecreditoed;
	
	

	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditUtilizationLimit\"]")
	public WebElement utilizacaodecreditovi;
	

	
	
	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;
	
	public LimiteDeCreditoAUtilizarVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		limitedecreditoautilizar.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("LimiteDeCreditoAUtilizar");
		
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
		
		waitExpectElement(editar);
		sleep(4000);
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String  utilizacaodecreditovisualizar = utilizacaodecreditovi.getText();
		
		
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		//System.out.println(tributovisualizar);
		System.out.println(utilizacaodecreditovisualizar);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("LimiteDeCreditoAUtilizar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String empresaeditar=empresaed.getText();
		String filialeditar=filialed.getText();
		//String tributoeditar=tributoed.getText();
		String utilizacaodecreditoeditar = utilizacaodecreditoed.getAttribute("value");
	
		System.out.println(empresaeditar);
		System.out.println(filialeditar);
		//System.out.println(tributoeditar);
		System.out.println(utilizacaodecreditoeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(filialvisualizar.equals(filialeditar));
		//sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(utilizacaodecreditovisualizar.equals(utilizacaodecreditoeditar));
		return sucesso;	

	
	}
}
