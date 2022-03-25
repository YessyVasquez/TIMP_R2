package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DetalheDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;

	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement tipoTributoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement descricaoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement ativoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	@FindBy(xpath ="//span[@id=\"codEmpresa\"]")
	public WebElement codigoV;
	
	@FindBy(xpath ="//span[@id=\"taxType\"]")
	public WebElement tipoTributoV;
	
	@FindBy(xpath ="//span[@id=\"descricao\"]")
	public WebElement descricaoV;
	
	@FindBy(xpath ="//span[@id=\"active\"]")
	public WebElement ativoV;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	public DetalheDetallePO() {
		PageFactory.initElements(driver, this);
		
	}
	
public ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		detalhe.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("DetalheTipoTributo");
		
		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String codigoD1 = codigoD.getText();
		String tipoTributoD1 = tipoTributoD.getText();
		String descricaoD1 = descricaoD.getText();
		String ativoD1 = ativoD.getText();

		
		System.out.println(codigoD1);
		System.out.println(tipoTributoD1);
		System.out.println(descricaoD1);
		System.out.println(ativoD1);
		sleep(2000);
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
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
		String tipoTributoV1 = tipoTributoV.getText();
		String descricaoV1 = descricaoV.getText();
		String ativoV1 = ativoV.getText();

		
		System.out.println(codigoV1);
		System.out.println(tipoTributoV1);
		System.out.println(descricaoV1);
		System.out.println(ativoV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoV1.equals(codigoD1));
		sucesso.add(tipoTributoV1.equals(tipoTributoD1));
		sucesso.add(descricaoV1 .equals(descricaoD1));
		sucesso.add(ativoV1.equals(ativoD1));

		System.out.println(sucesso);

		return sucesso;
}

	
}
