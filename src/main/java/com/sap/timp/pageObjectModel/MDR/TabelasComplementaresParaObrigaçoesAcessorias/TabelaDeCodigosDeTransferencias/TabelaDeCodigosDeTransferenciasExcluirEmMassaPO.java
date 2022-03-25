package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TabelaDeCodigosDeTransferenciasExcluirEmMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Códigos de Transferências\"]")
	public WebElement tabeladecodigosdetransferencias;
	
	@FindBy(xpath = "//span[text()=\"Nova Tabela de Códigos de Transferências\"]")
	public WebElement novatabela;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div[2]")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and text()=\"GIA\"]")
	public WebElement opcaoobrigacao;	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Transferências\"]")
	public WebElement codigodetranferencias;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição de Transferências\"]")
	public WebElement descricaodetransferencias;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement datainicial;
	
	
	public TabelaDeCodigosDeTransferenciasExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelacomplementares.click();
		
		sleep(2000);
		tabeladecodigosdetransferencias.click();
		
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
		
		novatabela.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Primer registro
		obrigacao.click();		
		sleep(1000);		
		opcaoobrigacao.click();		
		sleep(2000);
		
		codigodetranferencias.sendKeys("852");		
		sleep(2000);
		
		descricaodetransferencias.sendKeys("TESTE AUTOMATIZADO 1");		
		sleep(2000);
		
		String data = "30/01/2011";
		datainicial.sendKeys(data);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		// Segundo registro
		obrigacao.click();		
		sleep(1000);		
		opcaoobrigacao.click();		
		sleep(2000);
		
		codigodetranferencias.sendKeys("852");		
		sleep(2000);
		
		descricaodetransferencias.sendKeys("TESTE AUTOMATIZADO 2");		
		sleep(2000);
		
		data = "30/01/2011";
		datainicial.sendKeys(data);
		
		btnGravar.click();
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

		idInserir("TabelaDeCodigosDeTransferenciasExcluirEmMassa", idB);

		  
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
		if(!novatabela.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		

		int idUltimoRegistro = convertToInt(idObter("TabelaDeCodigosDeTransferenciasExcluirEmMassa"));

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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(13000);
		
		//waitExpectElement(novatabela);
		
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
