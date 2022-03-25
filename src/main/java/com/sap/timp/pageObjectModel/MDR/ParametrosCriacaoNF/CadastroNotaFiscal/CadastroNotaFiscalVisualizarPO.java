package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroNotaFiscalVisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Nota Fiscal\"]")
	public WebElement cadastroNotaFiscal;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"companies\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufs\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxes\"]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@class=\"section-container\"]/table/tr[1]/td[1]/div/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@class=\"section-container\"]/table/tr[1]/td[2]/div/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@class=\"section-container\"]/table/tr[2]/td[1]/div/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[@class=\"section-container\"]/table/tr[2]/td[2]/div/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement tributoE;
	
	public CadastroNotaFiscalVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CadastroNotaFiscal");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		attributoNotToBeEmptyElement(empresaV, "textContent");
		sleep(1000);
		
		System.out.println("--------- Visualizar -------");
		
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		sleep(2000);
		menu1.click();
		sleep(1000);

		açao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String empresaE1 = empresaE.getText();
		String ufE1 = ufE.getText();
		String filialE1 = filialE.getText();
		String tributoE1 = tributoE.getText();


		System.out.println(empresaE1);
		System.out.println(ufE1);
		filialE1 = filialE1.replace(" ", "");
		filialE1 = filialE1.replace("-", "_");
		System.out.println(filialE1);
		System.out.println(tributoE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(tributoE1.contains(tributoV1));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
