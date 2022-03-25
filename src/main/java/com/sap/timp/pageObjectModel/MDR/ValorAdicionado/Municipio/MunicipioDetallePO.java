package com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class MunicipioDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Valor Adicionado\"]")
	public WebElement valorAdicionado;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-valueAddedTax\"]/ul/li/div/span[text()=\"Municípios\"]")
	public WebElement municipios;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement codigoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement ufD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement valorPorcentualD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement activoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	@FindBy(xpath ="//span[@id=\"codMunicipio\"]")
	public WebElement codigoV;
	
	@FindBy(xpath ="//span[@id=\"uf\"]")
	public WebElement ufV;
	
	@FindBy(xpath ="//span[@id=\"valorPorcentualInformado\"]")
	public WebElement valorPorcentualV;
	
	@FindBy(xpath ="//span[@id=\"active\"]")
	public WebElement activoV;
	
	public MunicipioDetallePO() {
		PageFactory.initElements(driver, this);
		
	}
	
public ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		valorAdicionado.click();
		sleep(2000);
		municipios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("municipio");
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
		
		
		String codigoD1 = codigoD.getText();
		String ufD1 = ufD.getText();
		String valorPorcentualD1 = valorPorcentualD.getText();
		String activoD1 = activoD.getText();

		
		System.out.println(codigoD1);
		System.out.println(ufD1);
		System.out.println(valorPorcentualD1);
		System.out.println(activoD1);
		sleep(2000);
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigoV.getText();
		String ufV1 = ufV.getText();
		String valorPorcentualV1 = valorPorcentualV.getText();
		String activoV1 = activoV.getText();

		
		System.out.println(codigoV1);
		System.out.println(ufV1);
		System.out.println(valorPorcentualV1);
		System.out.println(activoV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoV1.equals(codigoD1));
		sucesso.add(ufV1.equals(ufD1));
		sucesso.add(valorPorcentualV1 .equals(valorPorcentualD1));
		sucesso.add(activoV1.equals(activoD1));

		System.out.println(sucesso);

		return sucesso;
}

	
}
