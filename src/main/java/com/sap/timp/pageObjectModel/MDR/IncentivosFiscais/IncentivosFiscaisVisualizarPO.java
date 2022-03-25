package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class IncentivosFiscaisVisualizarPO extends TestBaseMassiel{
	

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-cadastroIncentivosFiscais\")]/div/span[2]")
	public WebElement subIncentivosFiscais;

	@FindBy(xpath="//span[text()=\"Biblioteca\"]")
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
	
	
	@FindBy(xpath="//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	
	@FindBy(xpath="//div[@id=\"uf\"]/div/div/div/div/div/div[1]")
	public WebElement ufFilialE;
	
	@FindBy(xpath="//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialE;
	
	@FindBy(xpath="//div[@id=\"tribute\"]/div/div/div/input")
	public WebElement tributoE;
	
	@FindBy(xpath="//div[@id=\"beneficio\"]/div/div/div/input")
	public WebElement nomeDeBeneficioE;
	
	@FindBy(xpath="//div[@id=\"baseCalculo\"]/div/div/div/input")
	public WebElement baseCalculoE;
	
	@FindBy(xpath="//div[@id=\"iniBeneficio\"]/div/div/input")
	public WebElement inicioBeneficioE;
	
	@FindBy(xpath="//div[@id=\"fimBeneficio\"]/div/div/input")
	public WebElement finBeneficioE;
	
	public IncentivosFiscaisVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
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

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoempresaV = empresaV.getText();
		String textoufFilialV = ufFilialV.getText();
		String textofilialV = filialV.getText();
		textofilialV = textofilialV.replace("-","");
		textofilialV = textofilialV.replace(" ","");
		String textotributoV = tributoV.getText();
		String textonomeDeBeneficioV = nomeDeBeneficioV.getText();
		String textobaseCalculoV = baseCalculoV.getText();
		String textoinicioBeneficioV = inicioBeneficioV.getText();
		String textofinBeneficioV = finBeneficioV.getText();

		System.out.println("Empresa: " + textoempresaV);
		System.out.println("UF Filial: " + textoufFilialV);
		System.out.println("Filial: " + textofilialV);
		System.out.println("Tributo: " + textotributoV);
		System.out.println("Nome do Benefício: " + textonomeDeBeneficioV );
		System.out.println("Base de cálculo: " + textobaseCalculoV);
		System.out.println("Início do benefício: " + textoinicioBeneficioV);
		System.out.println("Fim do benefício: " + textofinBeneficioV);
		
		sleep(8000);
		irBiblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		sleep(6000);
		sleep(6000);
		String textoempresaE = empresaE.getText();
		String textoufFilialE = ufFilialE.getText();
		String textofilialE = filialE.getText();
//		textofilialE = textofilialE.replace("AL","");
		textofilialE = textofilialE.replace("-","");
		textofilialE = textofilialE.replace(" ","");
		String textotributoE = tributoE.getAttribute("value");
		String textonomeDeBeneficioE = nomeDeBeneficioE.getAttribute("value");
		String textobaseCalculoE = baseCalculoE.getAttribute("value");
		String textoinicioBeneficioE = inicioBeneficioE.getAttribute("value");
		String textofinBeneficioE = finBeneficioE.getAttribute("value");
		
		System.out.println("-------------------------------------------");
		System.out.println("Empresa: " + textoempresaE);
		System.out.println("UF Filial: " + textoufFilialE);
		System.out.println("Filial: " + textofilialE);
		System.out.println("Tributo: " + textotributoE);
		System.out.println("Nome do Benefício: " + textonomeDeBeneficioE );
		System.out.println("Base de cálculo: " + textobaseCalculoE);
		System.out.println("Início do benefício: " + textoinicioBeneficioE);
		System.out.println("Fim do benefício: " + textofinBeneficioE);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoempresaE.equals(textoempresaV));
		sucesso.add(textoufFilialE.equals(textoufFilialV));
		sucesso.add(textofilialE.contains(textofilialV));
		sucesso.add(textotributoE.equals(textotributoV));
		sucesso.add(textonomeDeBeneficioE .equals(textonomeDeBeneficioV));
		sucesso.add(textobaseCalculoE.equals(textobaseCalculoV));
		sucesso.add(textoinicioBeneficioE.equals(textoinicioBeneficioV));
		sucesso.add(textofinBeneficioE.equals(textofinBeneficioV));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
