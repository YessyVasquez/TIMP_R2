package com.sap.timp.pageObjectModel.BRE.Lixeira.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sap.timp.base.TestBaseSteven;


public class LIxeiraCriarPO extends TestBaseSteven{

	@FindBy(xpath = "//li[@class=\"base-accordion-li \"]/div/span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaregra;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Auditoria Nvl 2\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Determinação de Alíquota\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"][1]")
	public WebElement opcaoRegulamento;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"<\"]")
	public WebElement opcaoOperador;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regradeauditorian2;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	public LIxeiraCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regradeauditorian2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro em auditoria n2: " + id);
	
		lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		novaregra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE AUTOMATIZADO Lixeira - NAO MEXER");
		sleep(1000);
		
		tiporegra.click();
		sleep(1000);
		opcaotiporegra.click();
		sleep(1000);
		
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipotributo);
		sleep(1000);
		
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
		
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		
		regulamento.click();
		sleep(1000);
		opcaoRegulamento.click();
		sleep(1000);
		
		dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);		
		
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regradeauditorian2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("LixeiraParametrosGerais", idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso1 = false;
		if (idBD > idD) {
			sucesso1 = true;
			sucesso.add(sucesso1);
		}else {
			sucesso1 = false;
			sucesso.add(sucesso1);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idB+"\"]/div[1]/div"));
		WebElement lixeira1 = driver.findElement(By.xpath("//div[@data-id=\""+idB+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira1.click();
		sleep(5000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(mensagem);
		sleep(2000);
		//waitExpectElement(mensagembloqueio);
		sleep(5000);
		lixeira.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idlixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToDouble(idlixeira);
		double id2 = convertToDouble(idB);
		if(id1 == id2)
		{
			System.out.println("Sim, o ID é o mesmo que foi criado");
			boolean sucesso2=true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("Não é o mesmo ID");
			boolean sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}

}
