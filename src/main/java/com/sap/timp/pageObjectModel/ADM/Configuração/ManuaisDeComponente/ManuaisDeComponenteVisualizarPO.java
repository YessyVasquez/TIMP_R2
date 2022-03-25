package com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ManuaisDeComponenteVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[1]/td[1]/span")
	public WebElement componenteV;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[1]/td[2]/span")
	public WebElement idiomaV;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[3]/td[1]/span")
	public WebElement inicioVigenciaV;
	
	public ManuaisDeComponenteVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String componente = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		String idioma = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[5]/div")).getText();
		String inicioVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[6]/div")).getText();
	
		System.out.println(id);
		System.out.println(componente);
		System.out.println(idioma);
		System.out.println(inicioVigencia);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String componenteVisualizar = componenteV.getText();
		String idiomaVisualizar = idiomaV.getText();
		String inicioVigenciaVisualizar = inicioVigenciaV.getText();
		
		System.out.println(componenteVisualizar);
		System.out.println(idiomaVisualizar);
		System.out.println(inicioVigenciaVisualizar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(componenteVisualizar.equals(componente));
		sucesso.add(idiomaVisualizar.equals(idioma));
		sucesso.add(inicioVigenciaVisualizar.equals(inicioVigencia));
		
		System.out.println(sucesso);
		return sucesso;

	}
	
}
