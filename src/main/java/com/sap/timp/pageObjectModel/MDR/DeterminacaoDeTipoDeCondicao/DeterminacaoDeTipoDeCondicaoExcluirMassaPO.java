package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeTipoDeCondicaoExcluirMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Determinação de Tipo de Condição\"]")
	public WebElement determinacaodetipodecondicao;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Tipo de Condição\"]")
	public WebElement novodetermincao;
	
	//--------------- inputs ----------------------
	
	@FindBy(xpath = "//div[@class=\"field-element company_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element process_0_0\"]/div/div/div/div[2]")
	public WebElement processo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoprocesso;
	
	@FindBy(xpath = "//div[@class=\"field-element processPrice_0_1\"]/div/div/div/div[2]")
	public WebElement procedimento;
		
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoprocedimento;
	
	@FindBy(xpath = "//div[@class=\"field-element taxType_0_1\"]/div/div/div/div[2]")
	public WebElement imposto;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id]/div[text()=\"ICMS\"]")
	public WebElement opcaoimposto;
	
	@FindBy(xpath = "//div[@class=\"field-element taxTypeDetail_0_2\"]/div/div/div/div[2]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaodetalhe;
	
	@FindBy(xpath = "//div[@class=\"field-element taxBc_0_2\"]/div/div/div/div[2]")
	public WebElement condicao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocondicao;
	
	@FindBy(xpath = "//div[@class=\"field-element taxRate_0_3\"]/div/div/div/div[2]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoaliquota;
	
	@FindBy(xpath = "//div[@class=\"field-element taxValue_0_3\"]/div/div/div/div[2]")
	public WebElement valortributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaovalortributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tipo de tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Detalhe Tipo Tributo\"]")
	public WebElement detalhe1;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
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
	
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public DeterminacaoDeTipoDeCondicaoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		determinacaodetipodecondicao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novodetermincao.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(empresa);
		sleep(4000);
		processo.click();
		
		sleep(2000);
		opcaoprocesso.click();
		sleep(2000);	
		
		procedimento.click();	
		sleep(2000);
		opcaoprocedimento.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		imposto.click();
		sleep(2000);
		opcaoimposto.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		detalhe.click();
		sleep(2000);	
		opcaodetalhe.click();	
		sleep(2000);
		
		condicao.click();		
		sleep(2000);
		opcaocondicao.click();		
		sleep(2000);
		
		aliquota.click();		
		sleep(2000);		
		opcaoaliquota.click();		
		sleep(2000);
		
		valortributo.click();		
		sleep(2000);		
		opcaovalortributo.click();		
		sleep(2000);
		
		String data = fechaActual();
		dataVigencia.sendKeys(data);
		
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(empresa);
		
		sleep(4000);
		
		processo.click();
		
		sleep(2000);
		opcaoprocesso.click();
		sleep(2000);	
		
		procedimento.click();	
		sleep(2000);
		opcaoprocedimento.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		imposto.click();
		sleep(2000);
		opcaoimposto.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		detalhe.click();
		sleep(2000);	
		opcaodetalhe.click();	
		sleep(2000);
		
		condicao.click();		
		sleep(2000);
		opcaocondicao.click();		
		sleep(2000);
		
		aliquota.click();		
		sleep(2000);		
		opcaoaliquota.click();		
		sleep(2000);
		
		valortributo.click();		
		sleep(2000);		
		opcaovalortributo.click();		
		sleep(2000);
		
		String data1 = fechaActual();
		dataVigencia.sendKeys(data1);
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer rows2 = rows + 1;
		rows = rows2 - rows;
		System.out.println("rows: "+rows);
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer filas1 = fila1 + 1;
		fila1 = filas1 - fila1;
		
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer filas2 = fila2 + 2;
		fila2 = filas2 - fila2;
		System.out.println("fila1: "+fila1);
		System.out.println("fila2: "+fila2);
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		aceitar.click();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("DeterminacaoDeTipoDeCondicao",idB);
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
		
		System.out.println(sucesso);
		return sucesso;
		
	}
}
