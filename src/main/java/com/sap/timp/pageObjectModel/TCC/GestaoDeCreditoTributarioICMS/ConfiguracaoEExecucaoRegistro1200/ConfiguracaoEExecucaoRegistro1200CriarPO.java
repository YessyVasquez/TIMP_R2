package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoRegistro1200CriarPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Configuration\"]")
	public WebElement registro1200;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//label[@for=\"check-1000\"]/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição do Controle\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//button[@id=\"adjustmentButton\"]")
	public WebElement associacaoBtn;
	
	@FindBy(xpath = "//div[@data-id][1]/div/label/span")
	public WebElement associacaoO;
	
	@FindBy(xpath = "//button[text()=\"Avançar\"]")
	public WebElement avancar;
	
	@FindBy(xpath = "//div[contains(@class,\"originUF\")]/div/div[2]/div/div[2]")
	public WebElement ufOrigem;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"SP\"]")
	public WebElement ufOrigemO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//span[text()=\"Cálculos de fórmula\"]")
	public WebElement calculoFormula;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Fórmula\"]")
	public WebElement adicionarFormula;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
	public WebElement caixaFormula;
	
	@FindBy(xpath = "//div[@id=\"totalSuitableCreditInMonth\"]/div/div[1]/div[2]")
	public WebElement mesApropiado;
	
	@FindBy(xpath = "//div[@id=\"totalCreditReceivedByTransfer\"]/div/div[1]/div[2]")
	public WebElement recebidosPorTransferencia;
	
	@FindBy(xpath = "//div[@id=\"totalCreditUsedInPeriod\"]/div/div[1]/div[2]")
	public WebElement utilizadosNoPeriodo;
	
	@FindBy(xpath = "//li[@class=\"list-item\"]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	public ConfiguracaoEExecucaoRegistro1200CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
	
		
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		registro1200.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		novo.click();
		
		waitExpectElement(empresa);
		invisibilityOfElementOverlay();
		
		
		empresa.click();
		sleep(1000);
		empresaO.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		//attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(10000);
		
		uf.click();
		sleep(1000);
		actionsMoveToElementElement(ufO);
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(1000);
	
		
		//attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(12000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		
		descricao.sendKeys("Teste Automatizado");
		sleep(1000);
		
		associacaoBtn.click();
		invisibilityOfElementOverlay();
		
		associacaoO.click();
		sleep(1000);
		
		avancar.click();
		
		waitExpectElement(ufOrigem);
		sleep(1000);
		invisibilityOfElementOverlay();
		
		ufOrigem.click();
		sleep(1000);
		ufOrigemO.click();
		invisibilityOfElementOverlay();
		
		dataVigencia.sendKeys(fechaActual());
		sleep(1000);
		
		aplicar.click();
		
		invisibilityOfElementOverlay();
		
		calculoFormula.click();
		sleep(2000);
		waitExpectElement(adicionarFormula);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarFormula.click();
		sleep(2000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		caixaFormula.sendKeys("1");
		sleep(1000);
		
		gravar2.click();
		
		sleep(2000);
		
		fechar.click();
		sleep(2000);
		
		actionsMoveToElementElement(utilizadosNoPeriodo);
		
		mesApropiado.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		recebidosPorTransferencia.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		utilizadosNoPeriodo.click();
		sleep(1000);
		actionsMoveToElementElement(opcao);
		opcao.click();
		sleep(2000);
		

		gravar.click();
		sleep(3000);
		waitExpectElement(sim);
		sim.click();
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200",id2);
		
		//idInserir4(id2);
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;

	}

}
