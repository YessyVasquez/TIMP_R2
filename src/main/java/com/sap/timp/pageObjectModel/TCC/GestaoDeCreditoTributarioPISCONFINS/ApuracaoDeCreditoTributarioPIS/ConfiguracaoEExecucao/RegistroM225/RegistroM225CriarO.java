package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM225;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM225CriarO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuracaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[3]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM225\"]")
	public WebElement registrom225;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro M225\"]")
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
	
	@FindBy(xpath = "//div[@id=\"indAj\"]/div/div[2]")
	public WebElement indicadorajuste;
	
	@FindBy(xpath = "//div[@id=\"vlAj\"]/div/div[2]")
	public WebElement valorajuste;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"detValorAj\"]/div/div[2]")
	public WebElement detalhamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data da operação\"]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@id=\"vlRetDcomp\"]/div/div[2]")
	public WebElement valorcompensacao;
	
	@FindBy(xpath = "//div[@id=\"sldRet\"]/div/div[2]")
	public WebElement saldoretencao;
	
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
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public RegistroM225CriarO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom225.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idRegistro="0";
		
		if(rows>0) {
		idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		}else {
			//idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id ultimo registro: " +idRegistro);
		}
		novo.click();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		uf.click();
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(1000);
	
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
	
		detalhamento.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		data.sendKeys(fechaActual());
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int naobotao= driver.findElements(By.xpath("//button[text()=\"Não\"]")).size();
		if (naobotao > 0) {
			
			waitExpectElement(nao);
			sleep(2000);
			nao.click();
			sleep(2000);
			waitExpectElement(siguiente);
			sleep(2000);
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			
			idInserir("ApuraçãodeCréditoTributárioPISRegistroM225",id2);
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
			
		}else {
				
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("ApuraçãodeCréditoTributárioPISRegistroM225",id2);
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


}
