package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class ExecucoesExecucoesPublicasLixeiraemMassaPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"Dashboard\"]")
	public WebElement dashboards;

	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//span[text()=\"Novo Dashboard\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Dashboard\"]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement classificacao;

	@FindBy(xpath = "//li[@id][text()=\"Relatorios Gerenciais\"]")
	public WebElement opcaoclassificacao;

	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement classificacaoacesso;

	@FindBy(xpath = "//li[@id][text()=\"1 - Público\"]")
	public WebElement opcaoclassificacaoacesso;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Nao;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;

	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//span[text()=\"Execução\"]")
	public WebElement execucao;
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[1]/div/div[3]/div/button/span[2]")
	public WebElement executar1;
	
	@FindBy(xpath = "//button[text()=\"Sem anexo\"]")
	public WebElement semAnexo;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	//==================LEXEIRA=====================
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;

	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;

	@FindBy(xpath = "//div[text()=\"Cartão Indicador\"]")
	public WebElement cartaoindicador;

	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;

	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;

	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;

	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;

	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;

	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement colunas;

	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;

	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;

	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemsalvo;

	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement Lixeira;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[3]/ul/li[3]")
	public WebElement lixeiraD;
	
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[3]/ul/li[3]/div/span[2]")
	public WebElement lixeiraE;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[3]/button")
	public WebElement eliminar;
	

	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[3]/button/span")
	public WebElement eliminarD;

	public ExecucoesExecucoesPublicasLixeiraemMassaPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idExecucao = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows2 + "]/div[5]/div"))
				.getText();
		
		System.out.println("Ultimo registro EXECUCAO: " + idExecucao);
		
		sleep(2000);
		dashboards.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		dashboardspublicos.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println("Ultimo registro dashboard: " + id);

		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);

		nome.click();
		sleep(1000);
		nome.sendKeys("Dashboard 1 - NÃO MEXER ");
		sleep(1000);
		attributeToBeXpath("//div[@id=\"classification\"]/div", "class", "base-select required");
		sleep(4000);
		classificacao.click();
		sleep(1000);
		opcaoclassificacao.click();
		sleep(1000);

		classificacaoacesso.click();
		sleep(1000);
		opcaoclassificacaoacesso.click();
		sleep(1000);

		gravar.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		execucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		executar1.click();
		sleep(4000);
		
		Gravar.click();
		sleep(3000);
		
		semAnexo.click();
		sleep(3000);
		
		confirmar.click();
		sleep(5000);
		
		Gravar.click();
		sleep(3000);
		
		semAnexo.click();
		sleep(3000);
		
		confirmar.click();
		sleep(5000);
		

		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		
	

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);

		boolean sucesso = false;
		if (idBD > idD) {
			idInserir("IdLixeira", idB);
			sucesso = true;
		} else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;

	}
	

	
	public boolean lixeira() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("IdLixeira");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = false;

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);

		if (idBD < idD) {
			System.out.println("Sim, é o id que foi enviado para lixeira");
			sucesso =true;
		} else {
			System.out.println("Não é o id que foi enviado para lixeira");
			sucesso=false;
		}
		

		
		System.out.println(sucesso);
		return sucesso;
	}

	
	public boolean lixeiraDefinitiva() {
		lixeiraD.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("IdLixeira");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		Lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = false;

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);

		if (idBD < idD) {
			System.out.println("Sim, é o id que foi enviado para lixeira");
			sucesso =true;
		} else {
			System.out.println("Não é o id que foi enviado para lixeira");
			sucesso=false;
		}
		

		
		System.out.println(sucesso);
		return sucesso;
	}

	
	public boolean lixeiraExecucao() {
		
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows3 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		
		int rows4= rows3 -1;
		
		String idRegistro1 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows3 + "]/div[5]/div"))
				.getText();
		String idRegistro2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows4 + "]/div[5]/div"))
				.getText();
		
		WebElement idExecucao1 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro1+"\"]/div[2]/label/span"));
		WebElement idExecucao2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro2+"\"]/div[2]/label/span"));
	
		sleep(2000);
		idExecucao1.click();
		sleep(2000);
		idExecucao2.click();
		sleep(2000);
		
		eliminar.click();
		sleep(3000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		lixeiraE.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println(id);
		System.out.println(idRegistro1);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idRegistro1);
		
		int rowsL5 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		
		int rowsL6= rowsL5 -1;
		
		String idRegistroL1 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsL5 + "]/div[5]/div"))
				.getText();
		String idRegistroL2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsL6 + "]/div[5]/div"))
				.getText();
		
		idInserir("idRegistroL1",idRegistroL1);
		idInserir("idRegistroL2",idRegistroL2);
		
		System.out.println("ID1 : "+idRegistroL1);
		System.out.println("ID2 : "+idRegistroL2);
		
		boolean sucesso = false;
		if (idBD == idD) {
			System.out.println("É o mesmo id que foi pra lixeira");
			sucesso = true;
		}else {
			System.out.println("Não é o mesmo id");
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}


	
	
}
