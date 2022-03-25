package com.sap.timp.pageObjectModel.TAA.Agendamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AgendamentoCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Agendamento\"]")
	public WebElement abaAgendamento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Agendamento de Ajustes\"]")
	public WebElement btnNovoAgendamento;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement inputNome;
	
	@FindBy(xpath = "//div[@id=\"scheduling-type\"]/div/div[2]")
	public WebElement cboTipoAgendamento;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and contains(@class, \"list-item\") and text()=\"Ajuste Reverso\"]")
	public WebElement opcionTipoAgendamento;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Ajuste\"]")
	public WebElement btnAdicionarAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustment\"]/div/div[2]")
	public WebElement cboIdAjusteOrigem;
	
	@FindBy(xpath = "//div[@id=\"adjustment-code\"]/div/div[2]")
	public WebElement cboCodigoAjuste;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and contains(@class, \"list-item\")][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"subperiod\"]/div/div/span")
	public WebElement inputSubperiodo;
	
	@FindBy(xpath = "//button[text()=\"Adicionar\"]")
	public WebElement btnAdicionar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public AgendamentoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaAgendamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovoAgendamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
		cboFilial.click();
		sleep(1000);
		opcionFilial.click();
		sleep(1000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		inputNome.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		
		cboTipoAgendamento.click();
		sleep(1000);
		opcionTipoAgendamento.click();
		sleep(3000);
		
		btnAdicionarAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cboIdAjusteOrigem);
		cboIdAjusteOrigem.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboCodigoAjuste.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		inputSubperiodo.click();
		sleep(2000);

		WebElement flechaAtrasCalendario = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaAtrasCalendario.click();

		String anio = "2016";

		WebElement anioCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"" + anio + "\"]"));
		anioCalendar.click();
		sleep(3000);

		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendar.click();
		sleep(3000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);
		
		btnAdicionar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		   
		if(rows == 0) {
			return sucesso = true; 
		} 
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Primer nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) { 
			sucesso = true; 
			idInserir("Agendamento",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
	}
}
