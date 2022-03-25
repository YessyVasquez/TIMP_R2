package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class IncentivosFiscaisDetallesPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-cadastroIncentivosFiscais\")]/div/span[2]")
	public WebElement subIncentivosFiscais;

	@FindBy(xpath="//div[@id=\"detail-close-button\"]")
	public WebElement irBiblioteca;
	
	@FindBy(xpath="//*[@id=\"table\"]/div/div[2]/div/div[6]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath="//span[@id=\"company\"]")
	public WebElement empresaV;
	
	@FindBy(xpath="//span[@id=\"ufBranch\"]")
	public WebElement ufFilialV;
	
	@FindBy(xpath="//span[@id=\"branch\"]")
	public WebElement filialV;
	
	@FindBy(xpath="//span[@id=\"tax\"]")
	public WebElement tributoV;
	
	@FindBy(xpath="//span[@id=\"benefitName\"]")
	public WebElement nomeDeBeneficioV;
	
	@FindBy(xpath="//span[@id=\"calculationBase\"]")
	public WebElement baseCalculoV;
	
	@FindBy(xpath="//span[@id=\"benefitStartDate\"]")
	public WebElement inicioBeneficioV;
	
	@FindBy(xpath="//span[@id=\"benefitEndDate\"]")
	public WebElement finBeneficioV;
	
	
	@FindBy(xpath="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresaD;
	
	@FindBy(xpath="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement ufFilialD;
	
	@FindBy(xpath="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement filialD;
	
	@FindBy(xpath="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement tributoD;
	
	@FindBy(xpath="//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement inicioBeneficioD;
	
	public IncentivosFiscaisDetallesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  Detalle() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		incentivosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		subIncentivosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("IncentivosFiscais");
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
		
		
		String textoempresaD = empresaD.getText();
		String textoufFilialD = ufFilialD.getText();
		textoufFilialD = textoufFilialD. replace(" ", "");
		String textofilialD = filialD.getText();
		String textotributoD = tributoD.getText();
		String textoinicioBeneficioD = inicioBeneficioD.getText();
		
		System.out.println("Empresa: " + textoempresaD);
		System.out.println("UF Filial: " + textoufFilialD);
		System.out.println("Filial: " + textofilialD);
		System.out.println("Tributo: " + textotributoD);
		System.out.println("Início do benefício: " + textoinicioBeneficioD);

		sleep(8000);
		irBiblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu1.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoempresaV = empresaV.getText();
		String textoufFilialV = ufFilialV.getText();
		textoufFilialV = textoufFilialV. replace(" ", "");
		String textofilialV = filialV.getText();
		String textotributoV = tributoV.getText();
		String textoinicioBeneficioV = inicioBeneficioV.getText();
		String textofinBeneficioV = finBeneficioV.getText();

		System.out.println("-------------------------------------------");
		System.out.println("Empresa: " + textoempresaV);
		System.out.println("UF Filial: " + textoufFilialV);
		System.out.println("Filial: " + textofilialV);
		System.out.println("Tributo: " + textotributoV);
		System.out.println("Início do benefício: " + textoinicioBeneficioV);
		System.out.println("Fim do benefício: " + textofinBeneficioV);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoempresaD.equals(textoempresaV));
		sucesso.add(textoufFilialV.equals(textoufFilialD));
		sucesso.add(textofilialV.contains(textofilialD));
		sucesso.add(textotributoD.equals(textotributoV));
		sucesso.add(textoinicioBeneficioD.contains(textoinicioBeneficioV));
		sucesso.add(textoinicioBeneficioD.contains(textofinBeneficioV));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
