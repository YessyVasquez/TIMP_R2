package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.CodigosDeCredito;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosDeCreditoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Códigos de Crédito\"]")
	public WebElement codigosdecredito;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Crédito\"]")
	public WebElement novocodigo;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Crédito\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição Código Crédito\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicial;
	
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditCode\"]")
	public WebElement codigovi;

	@FindBy(xpath = "//span[@id=\"creditCodeDescription\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	public CodigosDeCreditoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		codigosdecredito.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("CodigoDeCredito");
		
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
		
		waitExpectElement(tributovi);
		sleep(2000);
		
		String tributovisualizar = tributovi.getText();
		String codigovisualizar = codigovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(tributovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
	
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
		String idRegistro1 = idObter("CodigoDeCredito");
		
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
		
		String tributoeditar = tributo.getText();
		String codigoeditar = codigo.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println(tributoeditar);
		System.out.println(codigoeditar);
		System.out.println(descricaoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	

}
