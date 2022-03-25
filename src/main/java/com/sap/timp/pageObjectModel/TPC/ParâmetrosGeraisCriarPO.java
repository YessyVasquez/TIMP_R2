package com.sap.timp.pageObjectModel.TPC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParâmetrosGeraisCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Pagamento\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Vencimento\"]")
	public WebElement dtaVencimento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF\"]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//li[text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//*[@id=\"AL\"]/div[1]/label/span")
	public WebElement opcionUfTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial\"]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//li[text()=\"0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_SP_0014\"]/div[1]/label/span")
	public WebElement opcionFilialTC2;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[1]/span")
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[1]")
	public WebElement atrasCalendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
	public WebElement aniotp1;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[6]")
	public WebElement aniotq1;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[2]")
	public WebElement enero;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[1]/div/div[1]")
	public WebElement M1;
	
	@FindBy(xpath = "//div[@class=\"row\"][13]/div[2]/div/div/div[2]")
	public WebElement codReceita;
	
	@FindBy(xpath = "//li[text()=\"1145\"]")
	public WebElement opcCodReceitaTp1;
	
	@FindBy(xpath = "//li[text()=\"900-8\"]")
	public WebElement opcCodReceitaTq1;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Ajuste\"]")
	public WebElement codAjuste;
	
	@FindBy(xpath = "//li[text()=\"279 - P0003 - Pagamento ICMS - Conta Vinculada Maranhão\"]")
	public WebElement opcCodAjusteTp1;
	
	@FindBy(xpath = "//li[text()=\"258 - P0001 - Test Pagamento JMIDE\"]")
	public WebElement opcCodAjusteTq1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Formulário\"]")
	public WebElement formulario;
	
	@FindBy(xpath = "//li[text()=\"107 - Teste PR\"]")
	public WebElement opcFormularioTp1;
	
	@FindBy(xpath = "//li[text()=\"431 - Teste 29/09\"]")
	public WebElement opcFormularioTq1;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ParâmetrosGeraisCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
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
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		if ( tp1 == true) {
			dtaVencimento.sendKeys("01/01/2016");
		}else {
			dtaVencimento.sendKeys("30/09/2016");
		}
		
		
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(7000);
		
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		
		
		
		
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		sleep(1000);
		
		
		
		
		cboFilial.click();
		sleep(1000);
		opcionFilial.click();
		sleep(1000);
		
		
		
		calendario.click();
		sleep(4000);
		
		atrasCalendario.click();
		sleep(4000);
		
		if (tq1==true) {
			aniotq1.click();
			sleep(3000);
		}else {
			aniotp1.click();
			sleep(3000);
		}
		
		enero.click();
		sleep(7000);
		
		M1.click();
		
		System.out.println("----------");
		sleep(55000);
		System.out.println("----------");
		
		actionsMoveToElementElement(formulario);
		
		System.out.println("");
		sleep(7000);
		if (tq1==true) {
			codReceita.click();
			sleep(1000);
			actionsMoveToElementElement(opcCodReceitaTq1);
			sleep(1000);
			opcCodReceitaTq1.click();
			sleep(3000);
			
			codAjuste.click();
			sleep(1000);
			actionsMoveToElementElement(opcCodAjusteTq1);
			sleep(1000);
			opcCodAjusteTq1.click();
			sleep(1000);
			
			formulario.click();
			sleep(1000);
			actionsMoveToElementElement(opcFormularioTq1);
			sleep(1000);
			opcFormularioTq1.click();
			sleep(3000);
			
			
		}else {
			codReceita.click();
			sleep(1000);
			actionsMoveToElementElement(opcCodReceitaTp1);
			sleep(3000);
			opcCodReceitaTp1.click();
			sleep(3000);
			
			codAjuste.click();
			sleep(1000);
			actionsMoveToElementElement(opcCodAjusteTp1);
			sleep(3000);
			opcCodAjusteTp1.click();
			sleep(3000);
			
			formulario.click();
			sleep(1000);
			actionsMoveToElementElement(opcFormularioTp1);
			sleep(3000);
			opcFormularioTp1.click();
			sleep(3000);
		}
		
		
		sleep(5000);
	
		btnGravar.click();
		

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
			idInserir4(idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
	}

}
