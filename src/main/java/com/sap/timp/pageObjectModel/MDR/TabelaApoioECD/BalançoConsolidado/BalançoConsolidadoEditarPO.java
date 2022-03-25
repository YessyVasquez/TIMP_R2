package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.BalançoConsolidado;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class BalançoConsolidadoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Balanço Consolidado  \"]")
	public WebElement opcionBalancoConsolidadoElement;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"competence\"]/div/div/input")
	public WebElement competência;
	
	public BalançoConsolidadoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionBalancoConsolidadoElement.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class = \"tr\" and @data-id][1]/div[1]/div[1]"));
		WebElement açao = driver.findElement(By.xpath("//div[@class = \"tr\" and @data-id][1]/div[1]/div[1]/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se obtiene el valor que tiene actualmente el input
		String competenciaString = competência.getAttribute("value");
		System.out.println("Valor original Competencia: " + competenciaString);
		
		// Definimos el valor nuevo para editar
		String valorNuevoString = anioActual();
		System.out.println("Valor nuevo a editar Competencia: " + valorNuevoString);
		
		// Seteamos el valor nuevo
		competência.click();
		sleep(1000);
		competência.clear();
		sleep(1000);
		competência.sendKeys(valorNuevoString);
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(competência);
		attributoNotToBeEmptyElement(competência, "value");
		String valorEditado = competência.getAttribute("value"); // Se obtiene nuevamente el valor del input despues de recargar la pagina para verificar si se guardo el nuevo valor
		System.out.println("Valor editado al recargar pagina: " + valorEditado);
		System.out.println("");
		
		boolean sucesso = false;
		sucesso = valorEditado.equals(valorNuevoString); // Si es igual significa que si fue editado y que se mantiene el valor al actualizar la pagina
		System.out.println("Exito: " + sucesso);
		System.out.println("");
		
		if(!sucesso) {
			return sucesso;
		}
		
		// Se devuelve el valor original del campo
		competência.click();
		sleep(1000);
		competência.clear();
		sleep(1000);
		competência.sendKeys(competenciaString);
		sleep(2000);	
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(competência, "value");
		valorEditado = competência.getAttribute("value"); // Se obtiene nuevamente el valor del input despues de recargar la pagina para verificar si se guardo el valor original que tenia
		System.out.println("Valor editado al recargar pagina (valor original nuevamente): " + valorEditado);
		System.out.println("");
		
		sucesso = valorEditado.equals(competenciaString); // Si es igual significa que si fue editado y que se mantiene el valor al original
		System.out.println("Exito: " + sucesso);
		System.out.println("");
		
		return sucesso;
	}
}
