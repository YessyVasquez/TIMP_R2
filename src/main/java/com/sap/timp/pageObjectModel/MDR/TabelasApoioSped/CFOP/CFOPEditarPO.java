package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CFOPEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaSPED;
	
	@FindBy(xpath = "//span[text()=\"4.2.2 CFOP\"]")
	public WebElement opcionCFOP;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"Validity\"]/div/div/input")
	public WebElement inputDataInicioDeVigencia;
	
	@FindBy(xpath = "//div[@id=\"toast-wrapper\"]")
	public WebElement alertGuardado;
	
	public CFOPEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaSPED.click();
		
		sleep(2000);
		actionsMoveToElementElement(opcionCFOP);
		opcionCFOP.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));	
		System.out.println(idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputDataInicioDeVigencia);
		String dataInicioVigencia = inputDataInicioDeVigencia.getAttribute("value");
		System.out.println("Data inicio vigencia antes de editar: " + dataInicioVigencia);
		
		sleep(2000);
		String dataInicioVigenciaNuevaString = fechaActual();
		inputDataInicioDeVigencia.clear();
		inputDataInicioDeVigencia.sendKeys(dataInicioVigenciaNuevaString);
		System.out.println("Data inicio vigencia Valor nuevor: " + dataInicioVigenciaNuevaString);
		sleep(2000);
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		waitExpectElement(alertGuardado);
		invisibilityOfElement("//div[@id=\\\"toast-wrapper\\\"]");
		sleep(3000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputDataInicioDeVigencia);		
		attributoNotToBeEmptyElement(inputDataInicioDeVigencia, "value");
		sleep(2000);
		String dataInicioVigenciaEditadoString = inputDataInicioDeVigencia.getAttribute("value");
		System.out.println("Data inicio vigencia Valor Editado al recargar: " + dataInicioVigenciaEditadoString);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataInicioVigenciaEditadoString.equals(dataInicioVigenciaNuevaString);
		
		if(!sucesso) {
			return sucesso;
		}
		
		inputDataInicioDeVigencia.clear();
		inputDataInicioDeVigencia.sendKeys(dataInicioVigencia);
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		waitExpectElement(alertGuardado);
		invisibilityOfElement("//div[@id=\\\"toast-wrapper\\\"]");
		sleep(3000);
		
		return sucesso;
	}
}
