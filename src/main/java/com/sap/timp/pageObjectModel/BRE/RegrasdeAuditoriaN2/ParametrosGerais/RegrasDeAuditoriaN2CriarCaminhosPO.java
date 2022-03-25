package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN2CriarCaminhosPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras\"]")
	public WebElement Regras;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[@colspan=\"6\" and @class=\"title-field\"]/div[1]/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o tipo da Regra\"]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o grupo de Estruturas de Dados\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Estrutura de Dados\"]")
	public WebElement estructura;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement opcEstructura;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o Tributo\"]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement opcionTipoTributo;
	

	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div/input[@placeholder=\" selecionar Data\"]")
	public WebElement validade;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/input")
	public WebElement acoes;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"justification\"]/div/textarea")
	public WebElement agg;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamiento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"][1]")
	public WebElement regulamientoOPC;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public RegrasDeAuditoriaN2CriarCaminhosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		Regras.click();
		sleep(2000);
		AN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		 
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
	
		sleep(11000);
		
		nome.sendKeys("TESTE AUTOMATIZADO RODADA ");
		sleep(2000);
		
		
		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		if(tp1 == true) {
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestruturatp1.click();
		sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
	 
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		 regulamiento.click();
		sleep(3000);
		
		actionsMoveToElementElement(regulamientoOPC);
		sleep(4000);
		regulamientoOPC.click();
		sleep(3000);
			
		String data = fechaActual();
		validade.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(adicionar);
		sleep(2000);
		adicionar.click();
		
		sleep(2000);
		condicoes.sendKeys("Alíquota ICMS (ED)");
		sleep(2000);
		condicoes.sendKeys(Keys.ENTER);
		sleep(2000);
		
		operador.click();
		sleep(2000);
		opcOperador.click();
		sleep(2000);
		
		condicoes2.sendKeys("Alíquota COFINS (ED)");
		sleep(2000);
		condicoes2.sendKeys(Keys.ENTER);
		sleep(2000);
		
		acoes.sendKeys("Alíquotas não apresentam valores iguais");
		sleep(2000);
		closeSelectTypeCheckbox(acoes);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(adicionar);
		sleep(2000);
		adicionar.click();
		
		sleep(2000);
		condicoes.sendKeys("Alíquota ICMS (ED)");
		sleep(2000);
		condicoes.sendKeys(Keys.ENTER);
		sleep(2000);
		
		operador.click();
		sleep(2000);
		opcOperador.click();
		sleep(2000);
		
		condicoes2.sendKeys("Alíquota COFINS (ED)");
		sleep(2000);
		condicoes2.sendKeys(Keys.ENTER);
		sleep(2000);
		
		acoes.sendKeys("Alíquotas não apresentam valores iguais 2");
		sleep(2000);
		closeSelectTypeCheckbox(acoes);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		justi.click();
		sleep(3000);
		agg.sendKeys("Teste Criação");
		sleep(2000);
		
		aceitar.click();

		sleep(29000);
		
		biblioteca.click();
		
		sleep(2000);
		/*sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");*/
		sleep(2000);
		sleep(2000);
		sleep(2000);
		waitExpectElement(AN2);
		sleep(7000);
		AN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		//idInserir3(idB);
		idInserir("An2",idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}

}
