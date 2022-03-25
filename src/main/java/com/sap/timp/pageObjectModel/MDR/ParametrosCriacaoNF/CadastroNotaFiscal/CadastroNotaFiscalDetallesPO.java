package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroNotaFiscalDetallesPO  extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Nota Fiscal\"]")
	public WebElement cadastroNotaFiscal;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresasD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement ufD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement filiaisD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement tributosD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"companies\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufs\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxes\"]")
	public WebElement tributoV;
	
	public CadastroNotaFiscalDetallesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalles() {
		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		String idRegistro = idObter("CadastroNotaFiscal");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String empresaD1 = empresasD.getText();
		String ufD1 = ufD.getText();
		String filialD1 = filiaisD.getText();
		String tributoD1 = tributosD.getText();

		System.out.println(empresaD1);
		System.out.println(ufD1);
		System.out.println(filialD1);
		System.out.println(tributoD1);
		
		sleep(2000);
		fechar.click();
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(menu);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
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
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
	
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialV1.contains(filialD1));
		sucesso.add(tributoV1.contains(tributoD1));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
