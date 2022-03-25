package com.sap.timp.pageObjectModel.MDR.Filiais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class FiliaisDetallesPo extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Filiais\"]")
	public WebElement Filial;
	
	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath ="//div[@id=\"detail-name\"]/div[1]")
	public WebElement codigoFilial;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement nombreFantasia;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement Empresa;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement razaoSocial;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement uF;

	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement municipio;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement telefono;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tipoActividad;
	
	@FindBy(xpath ="//span[@id=\"codFilial\"]")
	public WebElement codigoFilial1;
	
	@FindBy(xpath ="//span[@id=\"nomeFantasia\"]")
	public WebElement nombreFantasia1;
	
	@FindBy(xpath ="//span[@id=\"codEmpresa\"]")
	public WebElement Empresa1;
	
	@FindBy(xpath ="//span[@id=\"razaoSocial\"]")
	public WebElement razaoSocial1;
	
	@FindBy(xpath ="//span[@id=\"uf\"]")
	public WebElement uF1;

	@FindBy(xpath ="//span[@id=\"municipio\"]")
	public WebElement municipio1;
	
	@FindBy(xpath ="//span[@id=\"telefone\"]")
	public WebElement telefono1;
	
	@FindBy(xpath ="//span[@id=\"labelTipoAtividade\"]")
	public WebElement tipoActividad1;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	public FiliaisDetallesPo() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean>  Detalle() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Filial.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		menu.click();
		sleep(1000);
		detalle.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo = codigoFilial.getText();
		String textoFantasia = nombreFantasia.getText();
		String textoEmpresa = Empresa.getText();
		String textoRazonSocia = razaoSocial.getText();
		String textoUf = uF.getText();
		String textoMunicipio = municipio.getText();
		String textoTelefono = telefono.getText();
		String textoTipoActividad= tipoActividad.getText();
		
		System.out.println("Código de Filial: " + textoCodigo);
		System.out.println("Nombre de Fantasia: " + textoFantasia);
		System.out.println("Número de Empresa " + textoEmpresa);
		System.out.println("Razón Social: " + textoRazonSocia);
		System.out.println("UF: " + textoUf);
		System.out.println("Municipio " + textoMunicipio);
		System.out.println("Telefono: " + textoTelefono);
		System.out.println("Tipo Actividad " + textoTipoActividad);
		
		sleep(2000);
		cerrar.click();

		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo1 = codigoFilial1.getText();
		String textoFantasia1 = nombreFantasia1.getText();
		String textoEmpresa1 = Empresa1.getText();
		String textoRazonSocia1 = razaoSocial1.getText();
		String textoUf1 = uF1.getText();
		String textoMunicipio1 = municipio1.getText();
		String textoTelefono1 = telefono1.getText();
		String textoTipoActividad1= tipoActividad1.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Código de Filial: " + textoCodigo1);
		System.out.println("Nombre de Fantasia: " + textoFantasia1);
		System.out.println("Número de Empresa " + textoEmpresa1);
		System.out.println("Razón Social: " + textoRazonSocia1);
		System.out.println("UF: " + textoUf1);
		System.out.println("Municipio " + textoMunicipio1);
		System.out.println("Telefono: " + textoTelefono1);
		System.out.println("Tipo Actividad " + textoTipoActividad1);
		
		sleep(8000);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigo1.equals(textoCodigo));
		sucesso.add(textoFantasia1.equals(textoFantasia));
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoRazonSocia1.equals(textoRazonSocia));
		sucesso.add(textoUf1.equals(textoUf));
		sucesso.add(textoMunicipio1.equals(textoMunicipio));
		sucesso.add(textoTelefono1.equals(textoTelefono));
		sucesso.add(textoTipoActividad1.equals(textoTipoActividad));
		System.out.println(sucesso);
		return sucesso;

		
	}
}

