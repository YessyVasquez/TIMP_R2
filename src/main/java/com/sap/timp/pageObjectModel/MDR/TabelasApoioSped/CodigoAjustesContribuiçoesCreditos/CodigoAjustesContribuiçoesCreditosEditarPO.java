package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigoAjustesContribuiçoesCreditosEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[contains(text(),\"4.3.8 Código de Ajustes\")]")
	public WebElement ajusteeinformacao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	public CodigoAjustesContribuiçoesCreditosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		ajusteeinformacao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
	
		// Obtener el id del primer registro
		//String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		String idRegistro =idObter("codigoajustescontribuicoescreditos");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));	
		System.out.println(idRegistro);		
		sleep(2000);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(inputDataInicioVigencia);
		sleep(3000);
		
		String textoDataInicioVigenciaValorOriginal = inputDataInicioVigencia.getAttribute("value"); 
		System.out.println("Data inicio vigencia valor original: " + textoDataInicioVigenciaValorOriginal);
		sleep(2000);
		
		String textoDataInicioVigenciaNuevo = fechaActual();
		System.out.println("Data inicio vigencia valor nuevo: " + textoDataInicioVigenciaNuevo);
		sleep(2000);
		
		inputDataInicioVigencia.click();
		inputDataInicioVigencia.clear();
		inputDataInicioVigencia.sendKeys(textoDataInicioVigenciaNuevo);
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(inputDataInicioVigencia);	
		sleep(3000);
		
			
		attributoNotToBeEmptyElement(inputDataInicioVigencia, "value");
		sleep(2000);
		String dataInicioVigenciaEditadoString = inputDataInicioVigencia.getAttribute("value");
		System.out.println("Data inicio vigencia Valor Editado al recargar: " + dataInicioVigenciaEditadoString);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataInicioVigenciaEditadoString.equals(textoDataInicioVigenciaNuevo);
		
		if(!sucesso) {
			return sucesso;
		}
		
		inputDataInicioVigencia.clear();
		inputDataInicioVigencia.sendKeys(textoDataInicioVigenciaValorOriginal);
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
