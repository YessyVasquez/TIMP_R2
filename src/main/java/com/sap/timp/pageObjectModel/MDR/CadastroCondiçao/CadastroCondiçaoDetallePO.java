package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroCondiçaoDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement Empresa;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement Tributo;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement Secuencia;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement Activo;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	@FindBy(xpath ="//span[@id=\"companyCode\"]")
	public WebElement Empresa1;
	
	@FindBy(xpath ="//span[@id=\"taxFinancial\"]")
	public WebElement Tributo1;
	
	@FindBy(xpath ="//span[@id=\"accessCode\"]")
	public WebElement Secuencia1;
	
	@FindBy(xpath ="//span[@id=\"active\"]")
	public WebElement Activo1;
	
	public CadastroCondiçaoDetallePO() {
		PageFactory.initElements(driver, this);
		
	}
	
public ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cadastrocondicao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("CadastroCondicao");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		detalle.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String textoCodigo = Empresa.getText();
		String textoTributo = Tributo.getText();
		String textoSecuencia = Secuencia.getText();
		String textoActivo = Activo.getText();

		
		System.out.println("Código de Empresa : " + textoCodigo);
		System.out.println("Tributo : " + textoTributo);
		System.out.println("Secuencia de Acceso : " + textoSecuencia);
		System.out.println("Activo" + textoActivo);
		sleep(2000);
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo1 = Empresa1.getText();
		String textoTributo1 = Tributo1.getText();
		String textoSecuencia1 = Secuencia1.getText();
		String textoActivo1 = Activo1.getText();

		
		System.out.println("Código de Empresa : " + textoCodigo1);
		System.out.println("Tributo : " + textoTributo1);
		System.out.println("Secuencia de Acceso : " + textoSecuencia1);
		System.out.println("Activo" + textoActivo1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(textoCodigo1.equals(textoCodigo));
		sucesso.add(textoTributo1.equals(textoTributo));
		sucesso.add(textoSecuencia1 .equals(textoSecuencia));
		sucesso.add(textoActivo1.equals(textoActivo));

		System.out.println(sucesso);

		return sucesso;
}

	
}
