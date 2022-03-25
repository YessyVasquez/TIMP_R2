package com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParâmetrosParaEnvioDeMensagensEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class,\"accordion-container\")]/ul/li/div/span[text()=\"Parâmetros para Envio de Mensagens\"]")
	public WebElement menuParametrosParaEnvioDeMensagens;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	public ParâmetrosParaEnvioDeMensagensEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuParametrosParaEnvioDeMensagens.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParâmetrosParaEnvioDeMensagens");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(descricao);
		waitExpectElement(descricao);
		attributoNotToBeEmptyXpath("//div[@id=\"initialValidity\"]/div/div/input", "value");
		
		String descricaoeOriginal = descricao.getAttribute("value");
		System.out.println("Valor original: " + descricaoeOriginal);
		
		// Se obtiene y setea el valor nuevo para editar 
		String descricaoNuevo = "Teste automatizado editado";	
		descricao.clear();
		descricao.sendKeys(descricaoNuevo);
		System.out.println("Valor nuevo seteado: " + descricaoNuevo);
		sleep(2000);
		
		sleep(1000);
		btnGravar.click();
		sleep(1000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		waitExpectElement(descricao);
		attributoNotToBeEmptyXpath("//div[@id=\"initialValidity\"]/div/div/input", "value");
		String descricaoNuevoEditado = descricao.getAttribute("value");
		
		System.out.println("----------------------------------------");
		System.out.println("Valor editado al recargar pagina: " + descricaoNuevoEditado);
		
		sleep(1000);
		
		boolean sucesso = false;
		sucesso = descricaoNuevoEditado.equals(descricaoNuevo);
		
		// Si no  hay error, devuelvo el valor original que tenia 
		sleep(1000);
		if(sucesso) {
			waitExpectElement(descricao);
			attributoNotToBeEmptyXpath("//div[@id=\"initialValidity\"]/div/div/input", "value");
			descricao.click();
			sleep(1000);
			descricao.clear();
			descricao.sendKeys(descricaoeOriginal);
			sleep(1000);
			btnGravar.click();
			sleep(2000);
			btnSim.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(1000);
		}
		
		
		return sucesso;
		
	}
}
