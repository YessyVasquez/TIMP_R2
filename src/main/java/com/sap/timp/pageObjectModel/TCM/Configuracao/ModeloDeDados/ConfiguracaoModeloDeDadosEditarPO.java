package com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguracaoModeloDeDadosEditarPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]/span/span[contains(text(),\"Configuração\")]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Serviço de importação\"]")
	public WebElement servicioImportacao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	
	public ConfiguracaoModeloDeDadosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		configuracao.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("idConfModeloDeDados");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(servicioImportacao);
		attributoNotToBeEmptyElement(servicioImportacao, "value");
		
		String valorOriginal = servicioImportacao.getAttribute("value");
		System.out.println("");
		System.out.println("Servicio Importacao: " + valorOriginal);
		
		String valorAEnviar = "SImp Editado";
		System.out.println("");
		System.out.println("Inicio de Vigencia valor a enviar: " + valorAEnviar);
		
		servicioImportacao.clear();
		servicioImportacao.sendKeys(valorAEnviar);
		sleep(2000);
		
		btnGravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		driver.navigate().refresh();
		invisibilityOfElementOverlay();
		waitExpectElement(configuracao);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		configuracao.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu1.click();
		sleep(1000);
		açao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(servicioImportacao, "value");
		String valorEditado = servicioImportacao.getAttribute("value");
		System.out.println("");
		System.out.println("Inicio de Vigencia valor editado: " + valorEditado);
		
		boolean sucesso = false;
		
		if(valorEditado.equals(valorAEnviar)) {
			System.out.println("Registro editado correctamente...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		return sucesso;
	}
	
}
