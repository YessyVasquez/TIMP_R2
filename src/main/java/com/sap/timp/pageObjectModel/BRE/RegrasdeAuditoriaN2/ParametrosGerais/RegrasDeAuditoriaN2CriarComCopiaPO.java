package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeAuditoriaN2CriarComCopiaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regrasDeAuditoriaN2;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	public RegrasDeAuditoriaN2CriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarComCopia() {
		invisibilityOfElementOverlay();
		
		regrasDeAuditoriaN2.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		//String idRegistro = idObter3();
		String idRegistro = idObter("An2");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAplicar.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(btnBiblioteca);
		sleep(2000);
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasDeAuditoriaN2.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistro = "0"; // Ultimo ID
		
		if(rows > 0) {
			idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + idUltimoRegistro);
		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(7000);
		lixeira.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistroLixeira = "0"; // Ultimo ID
		
		if(rows > 0) {
			idUltimoRegistroLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro Lixeira: " + idUltimoRegistroLixeira);
		}
		
		boolean sucesso = false;
		
		if(convertToInt(idUltimoRegistroLixeira) == convertToInt(idUltimoRegistro)) {
			System.out.println("El ultimo registro registro de Lixeira es el creado en el TA...");
			sucesso = true;
		}else {
			System.out.println("El ultimo regisgtro no es el crceado en el TA...");
			return sucesso = false;
		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(8000);
		lixeira.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistroLixeiraDespuesDeExcluir = "0"; // Ultimo ID
		
		if(rows > 0) {
			idUltimoRegistroLixeiraDespuesDeExcluir = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro Lixeira despues de excluir: " + idUltimoRegistroLixeiraDespuesDeExcluir);
		}
		
		if(convertToInt(idUltimoRegistroLixeiraDespuesDeExcluir) != convertToInt(idUltimoRegistroLixeira)) {
			System.out.println("Registro eliminado de lixeira correctamente...");
			sucesso = true;
		}else {
			System.out.println("No se elimino el registro de lixeira...");
			sucesso = false;
		}
		
		return sucesso;
	}
}
