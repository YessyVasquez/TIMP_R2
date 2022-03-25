package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeNegocioCriarPO extends TestBaseSteven{
	
	 
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regrasdenegocio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaregra;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Negócio\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componenteTQ2;
	
	
	
	@FindBy(xpath = "//li[@id][text()=\"TAA\"]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"TAA Estruturas\"]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Definição Tab\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Abas\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"tab-field\"]/div/div/div[2]")
	public WebElement abas;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement opcaoabas;
	
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
	
	//@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div/input")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Tributo- (aba:Dados Lançamento) (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"=\"]")
	public WebElement opcaoOperador;
	
	//@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div/input")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/div[2]")
	public WebElement acoes;
	
	//@FindBy(xpath = "//div[@id=\"T1\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Dados Lançamento\"]")
	public WebElement opcaoacoes;
	
	//@FindBy(xpath = "//div[@id=\"T2\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Registro E111\"]")
	public WebElement opcaoacoesr2;
	
	//@FindBy(xpath = "//div[@id=\"T3\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Registro C197 ou D197\"]")
	public WebElement opcaoacoesr3;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	@FindBy(xpath = "//div[@class=\"tabAction-enable\"]/div/label/span")
	public WebElement habilitar;
	
	@FindBy(xpath = "//div[@class=\"tabAction-obligatory\"]/div/label/span")
	public WebElement preenchementoobrigatorio;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	//@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]")
	//@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\" and @transform=\"translate(0,100)\"]/*/*[1]")
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[9]")
	public WebElement primeiracaixar3;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement salvarcomocopia;
	
	//@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*[2]//*[3]")
	//@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\" and @transform =\"translate(0,150)\"]/*[name()=\"text\"][1]/*[name()=\"tspan\"][2]")
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[name()=\"g\"][11]/*/*")
	public WebElement text;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols icon-plussign icon-btn btn flat trans\"]")
	public WebElement adicionarcondicao;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[5]/div/div[1]/input")
	public WebElement NomeDoValor1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/input")
	public WebElement Condicoes1;
	
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	//@FindBy(xpath = "//div[@id=\"T74\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Registro 1210\"]")
	public WebElement opcaoacoesr4;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente2;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente3;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public RegrasDeNegocioCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		System.out.println("---------- Id Anterior --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;
		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
	
		
		novaregra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE AUTOMATIZADO NEGOCIOS 007 - NAO MEXER");
		sleep(1000);
		
		tiporegra.click();
		sleep(1000);
		opcaotiporegra.click();
		sleep(1000);
		
		if (tq1 == true) {
			componente.click();
			sleep(1000);
			opcaocomponente.click();
			sleep(1000);

			

		}else if (tc2==true ) {
			componente2.click();
			sleep(1000);
			opcaocomponente.click();
			sleep(1000);
			
			
		}else if (tq2 == true) {
			componenteTQ2.click();
			sleep(1000);
			opcaocomponente.click();
			sleep(1000);
		
		}else{
			
			componente3.click();
			sleep(1000);
			opcaocomponente.click();
			sleep(1000);
			
		}
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipotributo);
		sleep(1000);
		
		
		/*boolean tc2 = false;
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
		}*/
		
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestrutura.click();
		sleep(1000);
		
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		caracteristicaespecial.click();
		sleep(1000);
		opcaocaracteristicaespecial.click();
		sleep(1000);
		attributeToBeXpath("//td[@class=\"tab-field\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		waitExpectElement(abas);
		sleep(2000);
		abas.click();
		sleep(1000);
		opcaoabas.click();
		closeSelectTypeCheckbox(abas);
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		sleep(1000);
		regulamento.click();
		sleep(1000);
		opcaoRegulamento.click();
		sleep(1000);
		
		//dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);		
		
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		Justificactiva.click();
		sleep(2000);
		
		waitExpectElement(justificativa);
		sleep(2000);
		justificativa.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		aceitar.click();
		sleep(65000);
		//1 caminho
		adicionarcaminho.click();
		sleep(9000);
		//waitExpectElement(Condicoes);
		Condicoes.click();
		sleep(1000);
		Condicoes.sendKeys("Tributo- (aba:Dados Lançamento) (ED)");
		Condicoes.sendKeys(Keys.ENTER);
		sleep(1000);
		
		Operador.click();
		sleep(1000);
		opcaoOperador.click();
		sleep(1000);
		
		NomeDoValor.click();
		sleep(1000);
		NomeDoValor.sendKeys("ICMS");
		NomeDoValor.sendKeys(Keys.ESCAPE);
		
		sleep(1000);
				
		acoes.click();
		sleep(1000);
		opcaoacoes.click();
		closeSelectTypeCheckbox(acoes);
		sleep(1000);
		habilitar.click();
		sleep(1000);
		preenchementoobrigatorio.click();
		sleep(1000);
		aplicar.click();
		sleep(2000);
		/*
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		//WebElement caminhocriador1 = driver.findElement(By.xpath("//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"]"));
		WebElement caminhocriador1 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[3]/*/*"));
		if(caminhocriador1.isDisplayed()) {
			System.out.println("Caminho criado r1");
			sucesso.add(caminhocriador1.isDisplayed());
		}
		//segundo caminho
		adicionarcaminho.click();
		sleep(1000);
	
		Condicoes.click();
		sleep(1000);
		Condicoes.sendKeys("Código Registro SPED- (aba:Dados Lançamento) (ED)");
		Condicoes.sendKeys(Keys.ENTER);
		sleep(1000);
		Operador.click();
		sleep(1000);
		opcaoOperador.click();
		sleep(1000);
		NomeDoValor.click();
		sleep(1000);
		NomeDoValor.sendKeys("E111");
		NomeDoValor.sendKeys(Keys.ESCAPE);
		sleep(1000);
		acoes.click();
		sleep(1000);
		opcaoacoesr2.click();
		closeSelectTypeCheckbox(acoes);
		sleep(1000);
		habilitar.click();
		sleep(1000);
		aplicar.click();
		sleep(1000);
		//WebElement caminhor2 =driver.findElement(By.xpath("//*[name()=\"g\"][@class=\"path-start\"]"));
		//WebElement caminhor2 =driver.findElement(By.xpath("//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"]"));
		WebElement caminhor2 =driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[7]/*/*"));
		
		

		if(caminhor2.isDisplayed()) {
			System.out.println("Caminho criado r2");
			sucesso.add(caminhor2.isDisplayed());
		}
	
		//3 caminho
		sleep(1000);
		adicionarcaminho.click();
		sleep(1000);
	
		Condicoes.click();
		sleep(1000);
		Condicoes.sendKeys("Detalhar Cod. Reg SPED- (aba:Dados Lançamento) (ED)");
		Condicoes.sendKeys(Keys.ENTER);
		sleep(1000);
		Operador.click();
		sleep(1000);
		opcaoOperador.click();
		sleep(1000);
		NomeDoValor.click();
		sleep(1000);
		NomeDoValor.sendKeys("C197");
		NomeDoValor.sendKeys(Keys.ESCAPE);
		sleep(1000);
		acoes.click();
		sleep(1000);
		opcaoacoesr3.click();
		closeSelectTypeCheckbox(acoes);
		sleep(1000);
		habilitar.click();
		sleep(1000);
		aplicar.click();
		System.out.println("click en aplicar 3");
		sleep(1000);
		//WebElement caminhor3 =driver.findElement(By.xpath("//*[name()=\"g\"][@class=\"path-start edited\"]"));
		WebElement caminhor3 =driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[11]/*/*"));
		
		System.out.println("creao caminho 3");
		if(caminhor3.isDisplayed()) {
			System.out.println("Caminho criado r3");
			sucesso.add(caminhor3.isDisplayed());
		}
		

		sleep(1000);
		waitExpectElement(primeiracaixar3);
		sleep(2000);
		primeiracaixar3.click();
		sleep(1000);
		waitExpectElement(NomeDoValor);
		sleep(2000);
		NomeDoValor.clear();
		NomeDoValor.sendKeys("D197");
		NomeDoValor.sendKeys(Keys.ESCAPE);
		salvarcomocopia.click();
		int rows1 = driver.findElements(By.xpath("//div[@id=\"graph\"]/*/*/*[13]/*/*")).size();	
		int j=1;

		for (int i = 0; i < rows1; i++) {
			waitExpectElement(text);
			sleep(2000);
			String texto = "D197";
			String texto1 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[name()=\"g\"][10]/*/*["+j+"]")).getText();
			System.out.println(texto1);
			//boolean sucesso1 = texto1.contains(texto);
			//sucesso.add(sucesso1);
			j++;
		}


		if(rows1 > 1) {
			System.out.println("2 frases");
			waitExpectElement(text);
			sleep(2000);
			String texto = "D197";
			String texto1 = text.getText();
			System.out.println(texto1);
			boolean sucesso1 = texto1.contains(texto);
			sucesso.add(sucesso1);
		}else {
			System.out.println("Uma frase");
			WebElement text1 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[13]/*/*[1]"));
			waitExpectElement(text1);
			sleep(2000);
			String texto="D197";
			String texto1= text1.getText();
			System.out.println(texto1);
			boolean sucesso1 =texto1.contains(texto);
			sucesso.add(sucesso1);
		}
		//4 registro
		adicionarcaminho.click();
		sleep(1000);
	
		Condicoes.click();
		sleep(1000);
		Condicoes.sendKeys("Código Registro SPED- (aba:Dados Lançamento) (ED)");
		Condicoes.sendKeys(Keys.ENTER);
		sleep(1000);
		Operador.click();
		sleep(1000);
		opcaoOperador.click();
		sleep(1000);
		NomeDoValor.click();
		sleep(1000);
		NomeDoValor.sendKeys("1200");
		NomeDoValor.sendKeys(Keys.ESCAPE);
		adicionarcondicao.click();
		sleep(1000);
		Condicoes1.sendKeys("Código Registro SPED- (aba:Dados Lançamento) (ED)");
		Condicoes1.sendKeys(Keys.ENTER);
		sleep(1000);
		NomeDoValor1.sendKeys("1210");
		NomeDoValor1.sendKeys(Keys.ESCAPE);
		sleep(1000);
		acoes.click();
		sleep(1000);
		opcaoacoesr4.click();
		closeSelectTypeCheckbox(acoes);
		sleep(1000);
		habilitar.click();
		sleep(1000);
		aplicar.click();
		System.out.println("Dio click en aplicar");
		sleep(1000);
		//WebElement caminhor4 =driver.findElement(By.xpath("//*[name()=\"g\"][@class=\"edited\"]"));
		WebElement caminhor4 =driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[name()=\"g\"][11]/*/*"));
		System.out.println("Creo camihno 4");
		if(caminhor4.isDisplayed()) {
			System.out.println("Caminho criado r4");
			sucesso.add(caminhor4.isDisplayed());
		}
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(15000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		waitExpectElement(adicionarcaminho);
		sleep(2000);
		WebElement caminhos = driver.findElement(By.xpath("//div[@id=\"graph\"]/*[name()=\"svg\"]/*[name()=\"g\"]"));
		waitExpectElement(caminhos);
		sleep(2000);
		if(caminhos.isDisplayed() )
		{
			boolean sucesso2 = true;
			System.out.println("Caminhos continuam após a atualização");
			sucesso.add(sucesso2);
		}
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("p1");
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("RegrasDeNegocioCriar",idB);
		

		System.out.println(id);
		System.out.println("Ultimo: "+idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso2 = false;
		if (idBD > idD) {
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
