package com.sap.timp.pageObjectModel.ADM.Configuração.Licenças;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LicençasDetalhesPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Licenças\"]")
	public WebElement Licenças;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[1]/div[2]")
	public WebElement numero;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[2]/div[2]")
	public WebElement data;
	
	public LicençasDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  detalles() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Licenças.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[2]/div")).getText();
		String numeroUsuario = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String dataVencimiento = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		
		System.out.println(id);
		System.out.println(numeroUsuario);
		System.out.println(dataVencimiento);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numeroDetalle = numero.getText();
		String dataDetalle = data.getText();
		
		System.out.println(numeroDetalle);
		System.out.println(dataDetalle);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(numeroUsuario.equals(numeroDetalle));
		sucesso.add(dataVencimiento.equals(dataDetalle));
		System.out.println(sucesso);
		return sucesso;
	}
		
}
