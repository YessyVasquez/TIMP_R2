package com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ManuaisDeComponenteDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[1]/div[2]")
	public WebElement idV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[2]/div[2]")
	public WebElement componenteV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[3]/div[2]")
	public WebElement idiomaV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[4]/div[2]")
	public WebElement inicioVigenciaV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[1]")
	public WebElement usuarioCriadoV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[1]/span")
	public WebElement dataCriadoV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[2]")
	public WebElement usuarioModificadoV;

	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[2]/span")
	public WebElement dataModificadoV;
	
	public ManuaisDeComponenteDetallePO() { 

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalle() {
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
		String usuarioCriado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[8]/div")).getText();
		String dataCriado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[9]/div")).getText();
		String usuarioModificado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[10]/div")).getText();
		String dataModificado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[11]/div")).getText();
		
		System.out.println(id);
		System.out.println(componente);
		System.out.println(idioma);
		System.out.println(inicioVigencia);
		System.out.println(usuarioCriado);
		System.out.println(dataCriado);
		System.out.println(usuarioModificado);
		System.out.println(dataModificado);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idVisualizar = idV.getText();
		String componenteVisualizar = componenteV.getText();
		String idiomaVisualizar = idiomaV.getText();
		String inicioVigenciaVisualizar = inicioVigenciaV.getText();
		String usuarioCriadoVisualizar = usuarioCriadoV.getText();
		String dataCriadoVisualizar = dataCriadoV.getText();
		String usuarioModificadoisualizar = usuarioModificadoV.getText();
		String dataModificadoVisualizar = dataModificadoV.getText();
		
		System.out.println(componenteVisualizar);
		System.out.println(idiomaVisualizar);
		System.out.println(inicioVigenciaVisualizar);
		System.out.println(usuarioCriadoVisualizar);
		System.out.println(dataCriadoVisualizar);
		System.out.println(usuarioModificadoisualizar);
		System.out.println(dataModificadoVisualizar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idVisualizar.equals(id));
		sucesso.add(componenteVisualizar.equals(componente));
		sucesso.add(inicioVigenciaVisualizar.equals(inicioVigencia));
		sucesso.add(idiomaVisualizar.equals(idioma));
		sucesso.add(usuarioCriadoVisualizar.contains(usuarioCriado));
		sucesso.add(dataCriadoVisualizar.equals(dataCriado));
		sucesso.add(usuarioModificadoisualizar.contains(usuarioModificado));
		sucesso.add(dataModificadoVisualizar.contains(dataModificado));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
