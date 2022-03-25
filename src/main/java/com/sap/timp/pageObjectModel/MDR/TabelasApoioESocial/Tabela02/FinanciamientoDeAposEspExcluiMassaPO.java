package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FinanciamientoDeAposEspExcluiMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 02 - Financiamento de Apos. Esp.\"]")
	public WebElement tabela02;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Financiamento da Aposent. Especial\"]")
	public WebElement novoFinanciamiento;
	
	@FindBy(xpath = "//div[contains(@class, \"code_0_0\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[contains(@class, \"description_0_1\")]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_2\")]/div/div/input")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	public FinanciamientoDeAposEspExcluiMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoio.click();
		
		sleep(2000);
		tabela02.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
		novoFinanciamiento.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.click();
		sleep(1000);
		codigo.sendKeys("001");
		sleep(2000);
		
		descricao.click();
		sleep(1000);
		descricao.sendKeys("Teste automatizado");
		sleep(2000);
		
		validadeDe.click();
		sleep(1000);
		validadeDe.sendKeys(fechaActual());
		sleep(2000);
		
		validadeAte.click();
		sleep(1000);
		validadeAte.sendKeys(fechaActual());
		sleep(2000);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		codigo.click();
		sleep(1000);
		codigo.sendKeys("002");
		sleep(2000);
		
		descricao.click();
		sleep(1000);
		descricao.sendKeys("Teste automatizado 2");
		sleep(2000);
		
		validadeDe.click();
		sleep(1000);
		validadeDe.sendKeys(fechaActual());
		sleep(2000);
		
		validadeAte.click();
		sleep(1000);
		validadeAte.sendKeys(fechaActual());
		sleep(2000);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("FinanciamentoDeAposEspExcluirMassas",idB);
		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!novoFinanciamiento.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(idObter("FinanciamentoDeAposEspExcluirMassas"));
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
