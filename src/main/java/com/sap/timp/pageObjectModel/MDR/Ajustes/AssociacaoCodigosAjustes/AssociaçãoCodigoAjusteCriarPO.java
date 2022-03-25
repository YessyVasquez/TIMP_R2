package com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoCodigoAjusteCriarPO extends TestBaseFernando{
	String URL = driver.getCurrentUrl(); 
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-codeAssoc\"]")
	public WebElement subMenuAjustesAssociacaoCodigoAjuste;
	
	@FindBy(xpath = "//span[text()=\"Nova Associação\"]")
	public WebElement btnNovaAssociacao;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//div[@id=\"adjustCode\"]/div/div/div[2]/span")
	public WebElement btnCodigoAjuste;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Código de Ajuste\"]")
	public WebElement btnSeleccionarCodigoAjuste;
	
	// Dejo en la posicion 2 porque en laopcion 1 ya habian registros
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][2]/div/label/span")
	public WebElement opcionCodigoAjuste;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//div[@id=\"ufDestiny\"]/div/div/div[2]")
	public WebElement inputUFDestino;
	
	@FindBy(xpath = "//div[@id=\"officialCode\"]/div/div/div[2]")
	public WebElement inputCodigoOficial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//div[@id=\"ufOrigin\"]/div/div/div[2]")
	public WebElement inputUFOrigem;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][3]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo1;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][2]")
	public WebElement opcionComboCodigoOficial;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div[2]")
	public WebElement inputFilial;
	
	@FindBy(xpath = "//div[@id=\"spedRegister\"]/div/div/div[2]")
	public WebElement inputCodigoRegistroSPED;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificativa;	
	public AssociaçãoCodigoAjusteCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarAssociaçãoCodigoAjusteCriar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("td1") || URL.contains("tq1")) {
			waitExpectElement(menuAjustes);
			menuAjustes.click();		
			sleep(2000);
		}		
		
		actionsMoveToElementElement(subMenuAjustesAssociacaoCodigoAjuste);
		dobleClickElement(subMenuAjustesAssociacaoCodigoAjuste);
		//subMenuAjustesAssociacaoCodigoAjuste.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);			
		sleep(2000);	
		
		btnNovaAssociacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcionCheckbox.click();
		body.click();
		
		sleep(2000);
		btnCodigoAjuste.click();
		sleep(2000);
		btnSeleccionarCodigoAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		opcionCodigoAjuste.click();
		sleep(1000);
		btnSim.click();
		sleep(2000);
		btnAplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//actionsMoveToElementElement(inputUFDestino);
		inputUFDestino.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(1000);	
		
		inputUFOrigem.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		body.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		inputFilial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		
		actionsMoveToElementElement(inputUFDestino);
		inputCodigoOficial.click();
		sleep(1000);
		opcionComboCodigoOficial.click();
		sleep(1000);
		body.click();	
		sleep(1000);
				
		actionsMoveToElementElement(inputCodigoRegistroSPED);
		inputCodigoRegistroSPED.click();
		sleep(1000);
		opcionCombo1.click();
		sleep(1000);
		body.click();	
		sleep(1000);		
		
		inputDataInicioVigencia.click();
		sleep(1000);
		inputDataInicioVigencia.sendKeys(fechaActual());
		
		sleep(1000);
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnSim);
		sleep(1000);
		nao.click();
		waitExpectElement(btnSim);
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);
		
		
		btnBiblioteca.click();

//		sleep(5000);
//		nao.click();
//		System.out.println("primer nao");
//		sleep(500);
//		nao.click();
//		System.out.println("segundo nao");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("AssociaçãoCodigoAjuste",idB);
		  
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
}
