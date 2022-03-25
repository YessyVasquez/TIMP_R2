package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1210PagamentosDeRendimientosDoTrabalhoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-paymentsIncomeFromWork\"]")
	public WebElement subMenuPagamentosDeRendimientosDoTrabalho;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[@id=\"PER_APUR\"]/div/div/input")
	public WebElement periodoDeApuracao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	public S1210PagamentosDeRendimientosDoTrabalhoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuPagamentosDeRendimientosDoTrabalho.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1210PagamentosDeRendimientosDoTrabalho");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Primer registro que es el que se crea con la automatizacion
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String periodoDeApuracaoValorNuevo = "11/01/2020";
		periodoDeApuracao.clear(); // Limpio el periodo actual que tiene guardada
		periodoDeApuracao.sendKeys(periodoDeApuracaoValorNuevo); // Le envio el nuevo periodo a editar	
		System.out.println(periodoDeApuracaoValorNuevo); // Imprimo el periodo que se va editar el nuevo valor
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String periodoDeApuracaoValorEditado = periodoDeApuracao.getAttribute("value");
		System.out.println(periodoDeApuracaoValorEditado);
		
		boolean sucesso = false;
		
		sucesso = periodoDeApuracaoValorEditado.equals(periodoDeApuracaoValorNuevo);
		return sucesso;		
	}
}
