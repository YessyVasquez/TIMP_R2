
package com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ManuaisDeComponenteCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Manual de Componente\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement componenteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Idioma\"]")
	public WebElement idioma;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement idiomaOpc;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Data de Início de Vigência\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca; 
	
	public ManuaisDeComponenteCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
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
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		componente.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		
		idioma.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		

		//File filePath = new File("C:\\Users\\AGILE SOLUTIONS\\Desktop\\automatizacion.txt");
		File filePath = new File("C:\\Users\\Massiel\\Desktop\\automatizacion.txt"); 
		String pathString = filePath.getAbsolutePath();
		
		driver.findElement(By.className("file-uploader")).sendKeys(pathString);
		sleep(11000);
//		driver.findElement(By.className("browse-button")).click();
//		sleep(9000);
		
		String valorAEnviar = fechaActual();
		
		fecha.sendKeys(valorAEnviar);
		sleep(6000);
	
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
//		btnSim.click();
//		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		
		boolean sucesso = false;
		  
		/*	if(rows == 0) {
			return sucesso = true; 
		}*/
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Ultimo nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) { 
			sucesso = true; 
			idInserir("ManuaisDeComponente",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
	}


}

