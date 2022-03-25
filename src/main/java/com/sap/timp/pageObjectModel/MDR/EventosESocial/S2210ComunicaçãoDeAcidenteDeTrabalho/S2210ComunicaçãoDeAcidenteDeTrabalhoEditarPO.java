package com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-communicationWorkAccident\"]")
	public WebElement subMenuComunicacaoDeAcidente;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[contains(@class, \"registerNumber\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroRegistro;
	
	public S2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);

		subMenuComunicacaoDeAcidente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S2210ComunicaçãoDeAcidenteDeTrabalho");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numeroRegistroValorNuevo = "123";
		numeroRegistro.clear(); // Limpio la fecha actual que tiene guardada
		numeroRegistro.sendKeys(numeroRegistroValorNuevo); // Le envio la nueva fecha a editar	
		System.out.println(numeroRegistroValorNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
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
		waitExpectElement(numeroRegistro);
		String numeroRegistroEditada = numeroRegistro.getAttribute("value");
		System.out.println(numeroRegistroEditada);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = numeroRegistroEditada.equals(numeroRegistroValorNuevo); // Se compara si la fecha editada que se muestra en visualizar es igual a la fecha de ayer que fue la fecha que se establecio en editar
		
		return sucesso;
	}
}
