package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracaoBloqueiosFiltrosPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-box\")]/span/span[text()=\"Configurações\"]")
	public WebElement abaConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Bloqueios\"]")
	public WebElement bloqueios;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodUp\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"idCompany\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"BA\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"idBranch\"]/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"1000 / 0143\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[2]")
	public WebElement cboUsuarioCriacao;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement opcionUsuarioCriacao;
	
	@FindBy(xpath = "//div[@id=\"creationDate\"]/div/div/input")
	public WebElement inputDataCriacao;
	
	@FindBy(xpath = "//div[@id=\"modificationUser\"]/div/div/div[2]")
	public WebElement cboUsuarioModificacao;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement opcionUsuarioModificacao;
	
	@FindBy(xpath = "//div[@id=\"modificationDate\"]/div/div/input")
	public WebElement inputDataModificacao;
	
	String URL = driver.getCurrentUrl();
	
	public ConfiguracaoBloqueiosFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtros() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloqueios.click();
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvanzados.click();
		sleep(2000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboFilial.click();
		sleep(1000);
		opcionFilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboUsuarioCriacao.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcionUsuarioCriacao = driver.findElement(By.xpath("//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]"));
		}
		
		opcionUsuarioCriacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputDataCriacao.sendKeys(fechaActual());
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboUsuarioModificacao.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcionUsuarioModificacao = driver.findElement(By.xpath("//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]"));
		}
		
		opcionUsuarioModificacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputDataModificacao.sendKeys(fechaActual());
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		System.out.println("Id Registro a buscar: " + idRegistro);
		System.out.println("");
		
		// Buscamos el registro en los resultados
		WebElement resultado = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]"));
		
		boolean sucesso = false;
		
		if(resultado.isDisplayed()) {
			sucesso = true;
			System.out.println("El registro se encuestra entre los resultado...");
		}else {
			System.out.println("No se encuentra el registro entre los resultados...");
		}
		
		return sucesso;
	}
}
