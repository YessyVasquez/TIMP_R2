package com.sap.timp.pageObjectModel.MDR.TipoDeTributoContaContabil;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TipodeTributoContaContábilVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tipo de Tributo x Conta Contábil\"]")
	public WebElement tipodetributocontacontabil;
	
	@FindBy(xpath = "//span[text()=\"Cadastros PIS/COFINS\"]")
	public WebElement cadastroPisConfins;
	
	
	@FindBy(xpath = "//span[text()=\"Novo Tipo de Tributo x Conta Contábil\"]")
	public WebElement novotipodetributocontacontabil;

	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//td[@id=\"fpasCode\"]/span")
	public WebElement codigoV;
	@FindBy(xpath = "//td[@id=\"classificationTax\"]/span")
	public WebElement classificacaoV;
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeV;
	
	//DATOS DE EDITAR
	@FindBy(xpath = "//input[contains(@placeholder,\"Codigo\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Classificação\")]")
	public WebElement classificacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validadeE;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	//BUSCAR
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement finalPagina;
	
	
	public TipodeTributoContaContábilVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizarCompatibilidadeEntreFPAS() {
		sleep(2000);
		
		cadastroPisConfins.click();
		sleep(2000);
		
		tipodetributocontacontabil.click();
		sleep(2000);
		sleep(2000);
		finalPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CompatibilidadeEntreFPAS");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		opcion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigoV.getText();
		String classificacaoV1 = classificacaoV.getText();
		String validadeV1 = validadeV.getText();
		
		System.out.println("********Datos del Visualizar*******");
		System.out.println(codigoV1);
		System.out.println(classificacaoV1);
		System.out.println(validadeV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		finalPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoE1 = codigoE.getAttribute("value");
		String classificacaoE1 = classificacaoE.getAttribute("value");
		String validadeE1 = validadeE.getAttribute("value");

		System.out.println("");
		System.out.println("********Datos del Editar*******");
		System.out.println(codigoE1);
		System.out.println(classificacaoE1);
		System.out.println(validadeE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(classificacaoV1.contains(classificacaoE1));
		sucesso.add(validadeV1.contains(validadeE1));

		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}

}
