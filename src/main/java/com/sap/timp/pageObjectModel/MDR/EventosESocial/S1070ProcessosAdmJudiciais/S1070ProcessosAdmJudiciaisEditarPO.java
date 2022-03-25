package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1070ProcessosAdmJudiciaisEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-judicialProcesses\"]")
	public WebElement subMenuProcessosAdmJudiciais;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_15 \")]/div/div/span")
	public WebElement inputValidadede;
	
	@FindBy(xpath = "//div[contains(@class, \"processNumber_0_4\")]/div/div/div/div/div[2]/input")
	public WebElement numeroDoProceso;
	
	public S1070ProcessosAdmJudiciaisEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuProcessosAdmJudiciais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1070ProcessosAdmJudiciais");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numeroDoProcessoString = "0002020";
		numeroDoProceso.clear();
		numeroDoProceso.sendKeys(numeroDoProcessoString);
		System.out.println("Numero do Processo valor Nuevo: " + numeroDoProcessoString);
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(1000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtengo el valor actualizado ya recargada la página
		waitExpectElement(numeroDoProceso);
		String numeroDoProcessoStringEditado = numeroDoProceso.getAttribute("value");
		System.out.println("Numero do Processo valor editado guardado: " + numeroDoProcessoStringEditado);
		sleep(2000);

		boolean sucesso = false;
		sucesso = numeroDoProcessoStringEditado.equals(numeroDoProcessoString); 

		return sucesso;
	}
}
