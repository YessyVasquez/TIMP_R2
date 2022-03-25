package com.sap.timp.pageObjectModel.MDR.Empresas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class EmpresasDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//li/div/span[text()=\"Empresas\"]")
	public WebElement empresa;

	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement codigoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresaD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement razaoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement paisD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement municipioD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	@FindBy(xpath ="//span[@id=\"codEmpresa\"]")
	public WebElement codigoV;
	
	@FindBy(xpath ="//span[@id=\"razaoSocial\"]")
	public WebElement razaoV;
	
	@FindBy(xpath ="//span[@id=\"pais\"]")
	public WebElement paisV;
	
	@FindBy(xpath ="//span[@id=\"municipio\"]")
	public WebElement munucipioV;
	
	@FindBy(xpath ="//span[@id=\"nomeEmpresa\"]")
	public WebElement empresaV;
	
	public EmpresasDetallePO() {
		PageFactory.initElements(driver, this);
		
	}
	
public ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		empresa.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id][1]/div/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		detalle.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String codigoD1 = codigoD.getText();
		String razaoD1 = razaoD.getText();
		String paisD1 = paisD.getText();
		String empresaD1 = empresaD.getText();
		String muicipioD1 = municipioD.getText();
		
		
		System.out.println(codigoD1);
		System.out.println(razaoD1);
		System.out.println(paisD1);
		System.out.println(muicipioD1);
		System.out.println(empresaD1);
		sleep(2000);
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu =  driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id][1]/div/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigoV.getText();
		String razaoV1 = razaoV.getText();
		String paisV1 = paisV.getText();
		String municipioV1 = munucipioV.getText();
		String empresaV1 = empresaV.getText();

		
		System.out.println(codigoV1);
		System.out.println(razaoV1);
		System.out.println(paisV1);
		System.out.println(municipioV1);
		System.out.println(empresaV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoV1.equals(codigoD1));
		sucesso.add(razaoV1.equals(razaoD1));
		sucesso.add(paisV1 .equals(paisD1));
		sucesso.add(municipioV1.equals(muicipioD1));
		sucesso.add(empresaV1.equals(empresaD1));

		System.out.println(sucesso);

		return sucesso;
}

	
}
