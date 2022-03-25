package com.sap.timp.pageObjectModel.BCB.Formula.HierarquiaConfiguracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO extends TestBaseKenssy{

	//HIERARQUIAS
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;
	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	//CONFIGURACAO
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;
	@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
	public WebElement configuracaoDaConsolidacao;
	@FindBy(xpath = "//span[contains(@class,\"icon-Calculator\")]")
	public WebElement calculator;

	
	//QUINTO SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"5\"]")
	public WebElement quintoNivel;
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha5;
	@FindBy(xpath = "//li[text()=\"Atribuir Fórmula\"]")
	public WebElement campoLinhaO5;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][5]")
	public WebElement opcFontedeDados5;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-number\")]")
	public WebElement arredondamento;
	
	@FindBy(xpath = "//button[text()=\"Adicionar configuração de arredondamento\"]")
	public WebElement adicionarConfiguracionArredondamento;
	
	@FindBy(xpath = "//div[@id=\"rounding\"]/div/div/div[2]")
	public WebElement configuracaoArrendamiento;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement configuracaoArrendamientoOpc;
	
	@FindBy(xpath = "//div[@id=\"rounding-decimals\"]/div/div/input")
	public WebElement decimais;
	
	@FindBy(xpath = "//div[@id=\"create-tab\"]/div/div/div[2]")
	public WebElement abaArredondar;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement abaArredondarOpc;
	
	@FindBy(xpath = "//div[@id=\"create-hierarchy\"]/div/div/div[2]")
	public WebElement hierarquiaArredondar;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement hierarquiaArredondarOpc;
	
	@FindBy(xpath = "//div[@id=\"create-group\"]/div/div/div[2]")
	public WebElement grupoArredondar;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement grupoArredondarOpc;
	
	
	@FindBy(xpath = "//div[@id=\"create-sublevel\"]/div/div/div[2]")
	public WebElement subnivelArredondar;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][5]")
	public WebElement subnivelArredondarOpc;
	
	@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
	public WebElement criarSubnivel5;
	
	@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
	public WebElement fecharSubnivel5;
	
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executar;

	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executarN;
	
	//EXECUTAR
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
	public WebElement paginaAnterior;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"2015\"]")
	public WebElement ano2015;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//span[text()=\"1A\"]")
	public WebElement a1;
	
	@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
	public WebElement execucaoAnalitica;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executarB;
	
	//VERIFICAR INFORMACION DE SUBNIVELES
	@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement aba1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement hierarquia1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[1]/div[1]/div[1]/div[1]")
	public WebElement grupo1;
	
//			@FindBy(xpath = "//div[@class=\"hdr hdr-0\"]")
//			public WebElement aba1;
//			@FindBy(xpath = "//div[@class=\"hdr hdr-1\"]")
//			public WebElement hierarquia1;
//			@FindBy(xpath = "//div[@class=\"hdr hdr-2\"]")
//			public WebElement grupo1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verFormulaSubNivel1;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[1]/div/div[2]")
	public WebElement totalizadorSubNivel1;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verFormulaSubNivel2;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div/div[2]")
	public WebElement totalizadorSubNivel2;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel3;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verFormulaSubNivel3;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div/div[2]")
	public WebElement totalizadorSubNivel3;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel4;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verFormulaSubNivel4;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[4]/div/div[2]")
	public WebElement totalizadorSubNivel4;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel5;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verFormulaSubNivel5;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[5]/div/div[2]")
	public WebElement totalizadorSubNivel5;
	
	//EXCLUIR
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simLexeira;
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveExecutions\"]")
	public WebElement pastaLexeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simExcluir;
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
	public WebElement pastaLexeiraC;
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
	public WebElement pastaLexeiraH;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	@FindBy(xpath = "//span[contains(@class,\"icon-function\")]")
	public WebElement formula;
	
	@FindBy(xpath = "//div[@id=\"column-source\"]/div/div/div[1]")
	public WebElement fontedeDados;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcFontedeDados;
	
	@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Campos de Saída BCB\")]")
	public WebElement camposSaidaBCB;
	
	@FindBy(xpath = "//div[@class=\"column-wrapper second\"]/div/div/div/div/div/input")
	public WebElement buscarCamposSaidaBCB;
	
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),\"ID954-(BCB com campo de Output) TA\")]")
	public WebElement selectBCB1;
	//CORREGIR EN SU DEBIDO AMBIENTE
	@FindBy(xpath = "//div[text()=\"ID326-(BCB com campo de Output) TA\"]")
	public WebElement selectBCB2;
	@FindBy(xpath = "//div[text()=\"ID393-(BCB com campo de Output) TA\"]")
	public WebElement selectBCB3;
	
	
	@FindBy(xpath = "//div[contains(text(),\"4285-Campo de Saída 1\")]")
	public WebElement selectBCB11;
	//REVISAR CUANDO PASE POR EL AMBIENTE RESPECTIVO
	@FindBy(xpath = "//div[contains(text(),\"1424-Campo de saída 1\")]")
	public WebElement selectBCB12;
	@FindBy(xpath = "//div[contains(text(),\"2275-Campo de Saída 1\")]")
	public WebElement selectBCB13;
	
	@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
	public WebElement caixaFormula;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicarJustificativa;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> subNivel5() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		//COMENTAR DESPUES PORFAVOR
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracaoSubnivel5= idObter3();
		pesquisar.sendKeys(idConfiguracaoSubnivel5);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idConfiguracaoSubnivel5+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idConfiguracaoSubnivel5+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
	//HASTA AQUI
		
		
		System.out.println("--------------------------------------------SubNivel 5-------------------------------------");
		sleep(1000);

		quintoNivel.click();
		sleep(2000);
		
		campolinha5.click();
		sleep(2000);
		campoLinhaO5.click();
		sleep(2000);
		
		formula.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		fontedeDados.click();
		sleep(2000);
		
		opcFontedeDados5.click();
		sleep(2000);
		
		actionsMoveToElementElement(camposSaidaBCB);
		sleep(2000);
		
		camposSaidaBCB.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		camposSaidaBCB.click();
		sleep(2000);
		
		
		attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
		sleep(2000);
		
		if (tq1 == true) {
			buscarCamposSaidaBCB.sendKeys("954");
			sleep(1000);
			selectBCB1.click();
			sleep(1000);
			dobleClickElement(selectBCB11);
			sleep(1000);
		}else if (tc2 ==true) {
			buscarCamposSaidaBCB.sendKeys("393");
			sleep(1000);
			selectBCB3.click();
			sleep(1000);
			dobleClickElement(selectBCB13);
			sleep(1000);
		}else if (tq2 == true) {
			buscarCamposSaidaBCB.sendKeys("954");
			sleep(1000);
			selectBCB1.click();
			sleep(1000);
			dobleClickElement(selectBCB11);
			sleep(1000);
		}else{
			//CORREGIR AL EJECUTAR EN AMBIENTE
			buscarCamposSaidaBCB.sendKeys("326");
			sleep(1000);
			selectBCB2.click();
			sleep(1000);
			dobleClickElement(selectBCB12);
			sleep(1000);
		}
		
		
		caixaFormula.sendKeys("/56");
		sleep(2000);
		
		aplicar.click();
		sleep(4000);
		
		
		arredondamento.click();
		sleep(2000);
		
		adicionarConfiguracionArredondamento.click();
		sleep(2000);
		
		
		configuracaoArrendamiento.click();
		sleep(2000);
		configuracaoArrendamientoOpc.click();
		sleep(2000);
		
//		if(tc2== true) {
//			sim.click();
//			sleep(2000);	
//		}
		

		decimais.sendKeys("3");
		sleep(2000);
		
		
		abaArredondar.click();
		sleep(2000);
		abaArredondarOpc.click();
		sleep(2000);
		
		
		hierarquiaArredondar.click();
		sleep(2000);
		hierarquiaArredondarOpc.click();
		sleep(2000);
		
		
		grupoArredondar.click();
		sleep(2000);
		grupoArredondarOpc.click();
		sleep(2000);
		
		
		subnivelArredondar.click();
		sleep(2000);
		subnivelArredondarOpc.click();
		sleep(2000);
		
		
		criarSubnivel5.click();
		sleep(2000);
		
		
		
		fecharSubnivel5.click();
		sleep(2000);
		
		fechar.click();
		sleep(3000);
		
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(executar);
		sleep(2000);
		sleep(2000);
//		aplicarJustificativa.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> abrirSubnivel1() {
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		
		//COMENTAR DESPUES PORFAVOR
//		sleep(2000);
//		configuracoes.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		configuracaoDaConsolidacao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		String idConfiguracaoSubnivel5= idObter3();
//		pesquisar.sendKeys(idConfiguracaoSubnivel5);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idConfiguracaoSubnivel5+"\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idConfiguracaoSubnivel5+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		editar.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(calculator);
//		sleep(2000);
	//HASTA AQUI
		
	
		
		
		sleep(2000);
		executar.click();
		sleep(2000);
		waitExpectElement(executarN);
		sleep(2000);
		executarN.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		
		if (tc2) {
			paginaAnterior.click();
			sleep(2000);
			ano2015.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			jan.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			a1.click(); //OJO CORREGIR PARA TC2
		}else {
			paginaAnterior.click();
			sleep(2000);
			ano2016.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			jan.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			m1.click();
		}		
		
		sleep(6000);
	//	execucaoAnalitica.click();
		sleep(1000);
		
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		waitExpectElement(gravar);
		sleep(3000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		waitExpectElement(aba1);
		sleep(13000);
		
		aba1.click();
		sleep(2000);
		hierarquia1.click();
		sleep(2000);
		grupo1.click();
		sleep(2000);
				
				
		
		System.out.println("---------------------------------Abrir SubNivel 1-------------------------------------");
		sleep(1000);
		
		subnivel1.click();
		sleep(2000);

		String valorFormulaSubNivel1 = verFormulaSubNivel1.getText();
		System.out.println("Campo Formula Subnivel1: "+ valorFormulaSubNivel1);
		
		String valorTotalizadorSubNivel1 = totalizadorSubNivel1.getText();
		System.out.println("Campo Totalizador Subnivel1: "+ valorTotalizadorSubNivel1);
		
		subnivel1.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//if (tc2==true) {
			sucesso.add(valorFormulaSubNivel1.equals("1000/2"));
			sucesso.add(valorTotalizadorSubNivel1.equals("500,00"));
		//}else {
//			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
//			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/12/2015 - 31/01/2016)"));
		//}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> abrirSubnivel2() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		
		System.out.println("---------------------------------Abrir SubNivel 2-------------------------------------");
		sleep(1000);
		
		subnivel2.click();
		sleep(2000);

		String valorFormulaSubNivel2 = verFormulaSubNivel2.getText();
		System.out.println("Campo Formula Subnivel2: "+ valorFormulaSubNivel2);
		
		String valorTotalizadorSubNivel2 = totalizadorSubNivel2.getText();
		System.out.println("Campo Totalizador Subnivel2: "+ valorTotalizadorSubNivel2);
		
		subnivel2.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//if (tc2==true) {
			sucesso.add(valorFormulaSubNivel2.equals("-1000/2"));
			sucesso.add(valorTotalizadorSubNivel2.equals("-500,00"));
		//}else {
//			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
//			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/12/2015 - 31/01/2016)"));
		//}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> abrirSubNivel3() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
				
		
		System.out.println("---------------------------------Abrir SubNivel 3-------------------------------------");
		sleep(1000);
		
		subnivel3.click();
		sleep(2000);

		String valorFormulaSubNivel3 = verFormulaSubNivel3.getText();
		System.out.println("Campo Formula Subnivel3: "+ valorFormulaSubNivel3);
		
		String valorTotalizadorSubNivel3 = totalizadorSubNivel3.getText();
		System.out.println("Campo Totalizador Subnivel3: "+ valorTotalizadorSubNivel3);
		
		subnivel3.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//if (tc2==true) {
			sucesso.add(valorFormulaSubNivel3.equals("1000/2"));
			sucesso.add(valorTotalizadorSubNivel3.equals("0,00"));
		//}else {
//			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
//			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/12/2015 - 31/01/2016)"));
		//}
		
		System.out.println(sucesso);
		
		return sucesso;
	}

	
	public ArrayList<Boolean> abrirSubNivel4() {
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		System.out.println("---------------------------------Abrir SubNivel 4-------------------------------------");
		sleep(1000);
		
		subnivel4.click();
		sleep(2000);

		String valorFormulaSubNivel4 = verFormulaSubNivel4.getText();
		System.out.println("Campo Formula Subnivel4: "+ valorFormulaSubNivel4);
		
		String valorTotalizadorSubNivel4 = totalizadorSubNivel4.getText();
		System.out.println("Campo Totalizador Subnivel4: "+ valorTotalizadorSubNivel4);
		
		subnivel4.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (tp1==true) {
			sucesso.add(valorFormulaSubNivel4.equals("1000/2"));
			sucesso.add(valorTotalizadorSubNivel4.equals("500,00"));
		}else {
			sucesso.add(valorFormulaSubNivel4.equals("-1000/2"));
			sucesso.add(valorTotalizadorSubNivel4.equals("0,00"));
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> abrirSubNivel5() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		System.out.println("---------------------------------Abrir SubNivel 5-------------------------------------");
		sleep(1000);
		
		subnivel5.click();
		sleep(2000);

		String valorFormulaSubNivel5 = verFormulaSubNivel5.getText();
		System.out.println("Campo Formula Subnivel5: "+ valorFormulaSubNivel5);
		
		String valorTotalizadorSubNivel5 = totalizadorSubNivel5.getText();
		System.out.println("Campo Totalizador Subnivel5: "+ valorTotalizadorSubNivel5);
		
		subnivel5.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//if (tc2==true) {
			sucesso.add(valorFormulaSubNivel5.equals("1000/56"));
			sucesso.add(valorTotalizadorSubNivel5.equals("17,857"));
		//}else {
//			sucesso.add(valorCampoSaidaSubNivel2.equals("2.000,00"));
//			sucesso.add(valorCampoPeriodoTiempoSubNivel2.equals("(01/12/2015 - 31/01/2016)"));
		//}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
	public ArrayList<Boolean> excluirConfiguracoes() {
		//EXCLUIR CONFIGURACOES

		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracao = idObter3();
		System.out.println("");
		System.out.println("*******EXCLUIR CONFIGURACOES************");
		System.out.println("OBTER 3:" + idConfiguracao);
		System.out.println("");
		
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1082\"]/div[1]/div"));
//		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1082\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(6000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		System.out.println(exclucao);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		pastaLexeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(16000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirC.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirHierarquia() {
		//EXCLUIR HIERARQUIA
		
		sleep(2000);
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idHierarquia = idObter1();
		//String idHierarquia = "1100";
		System.out.println("");
		System.out.println("*******EXCLUIR HIERARQUIA************");
		System.out.println("OBTER 1:" + idHierarquia);
		System.out.println("");
		
		
	/*	pesquisar.sendKeys(idHierarquia);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1100\"]/div[1]/div"));
//		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1100\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(9000);
		
		simLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(6000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		
		pastaLexeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluirH.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
	}
}
