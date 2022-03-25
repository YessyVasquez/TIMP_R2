package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoCriarPO extends TestBaseFernando {
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement menuActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/ul/li/div/span[text()=\"Associação de Atividade Fiscal\"]")
	public WebElement subMenuAssociaçãoActividadesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Nova Associação  de Atividade Fiscal\"]")
	public WebElement btnNovaAssociação;
	
	@FindBy(xpath = "//div[@class=\"field-element codEmpresa_0_0\"]/div/div[2]/div/div[2]")
	public WebElement inputEmpresa;
	
	@FindBy(xpath = "//div[@class=\"field-element uf_0_1\"]/div/div[2]/div/div[2]")
	public WebElement inputUF;
	
	@FindBy(xpath = "//div[contains(@class, \"codFilial\")]/div/div[2]/div/div[2]")
	public WebElement inputFilial;
	
	@FindBy(xpath = "//div[contains(@class, \"municipioExecutor\")]/div/div/div/div[2]")
	public WebElement inputMunicipioExecutor;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcionCheckbox1;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"0\"))]/span")
	public WebElement opcionCheckboxDiferenteCero;
	
	// Si no encuentra informacion en la opcion seleccionada, probar colocar otra posicion del arreglo 1 o 4
	// En tq1, td1 y tp1 funciona con la posicion 1, en tc2 funciona con posicion 4
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//div[contains(@class, \"codTributo\")]/div/div[2]/div/div[2]")
	public WebElement inputTributo;
	
	@FindBy(xpath = "//div[contains(@class, \"tipoTributo\")]/div/div[2]/div/div[2]")
	public WebElement inputTipoTributo;
	
	@FindBy(xpath = "//div[contains(@class, \"atividadeFiscal\")]/div/div[2]/div/div[2]")
	public WebElement inputAtividadeFiscal;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcionComboAtividadeFiscal;
	
	@FindBy(xpath = "//div[contains(@class, \"grupoAtividade\")]/div/div[2]/div/div[2]")
	public WebElement inputGrupoAtividadeFiscal;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[contains(text(), \"Grupo Atividade Fiscal de Teste\")]")
	public WebElement opcionComboGrupoAtividadeFiscal;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public AssociaçãoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarAssociação() {
		sleep(2000);
		menuActividadesFiscais.click();
		
		sleep(2000);
		subMenuAssociaçãoActividadesFiscais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}		
		
		sleep(2000);
		btnNovaAssociação.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		inputEmpresa.click();
		sleep(2000);
		opcionCheckbox1.click();
		opcionCheckbox1.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"uf\")]/div/div[2]/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);
		inputUF.click();		
		sleep(2000);
		opcionCheckbox.click();
		opcionCheckbox.sendKeys(Keys.ESCAPE);		
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"codFilial\")]/div/div[2]/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);
		inputFilial.click();		
		sleep(2000);
		opcionCheckbox.click();
		body.click();
		sleep(2000);
		
		sleep(2000);
		inputMunicipioExecutor.click();		
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		//attributeToBeXpath("//div[contains(@class, \"codFilial\")]/div/div[2]/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);
		inputTributo.click();		
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		opcionCheckboxDiferenteTodos.sendKeys(Keys.ESCAPE);
		sleep(2000);
		/*
		attributeToBeXpath("//div[contains(@class, \"tipoTributo\")]/div/div[2]/div/div/div[2]/input", "disabled", "");
		sleep(2000);
		inputTipoTributo.click();		
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		body.click();
		sleep(2000);
		*/
		sleep(2000);
		inputAtividadeFiscal.click();		
		sleep(2000);
		opcionComboAtividadeFiscal.click();
		sleep(2000);
		
		sleep(2000);
		inputGrupoAtividadeFiscal.click();		
		sleep(2000);
		opcionComboGrupoAtividadeFiscal.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("AssociacaoAtividadeFiscal",idB);
		  
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
