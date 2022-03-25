package com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO extends TestBaseKenssy{
	//NUEVA CONFIGURACION HIERARQUIA
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;
		@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
		public WebElement hierarquiaConfiguracao;
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement ultimo;
	
	// NUEVA CONFIGURACAO
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
		public WebElement configuracoes;
	
		@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
		public WebElement configuracaoDaConsolidacao;
	
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
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
	//EXECUTAR
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executar;
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executarM;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-rightmenu\")]")
		public WebElement paginaSiguiente;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"2019\"]")
		public WebElement ano2019;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
		@FindBy(xpath = "//div[text()=\"Nov\"]")
		public WebElement nov;
		
		@FindBy(xpath = "//span[text()=\"1M\"]")
		public WebElement m1;
		
		@FindBy(xpath = "//span[text()=\"1Y\"]")
		public WebElement y1;
		
		@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
		public WebElement execucaoAnalitica;
		
		@FindBy(xpath = "//button[text()=\"Executar\"]")
		public WebElement executarB;
		
		@FindBy(xpath = "//button[text()=\"Salvar Execução\"]")
		public WebElement salvarExecucoes;
		
		@FindBy(xpath = "//div/span[contains(@class,\"icon-pensil\")]")
		public WebElement editarEntradaManual;
		
		@FindBy(xpath = "//div[@id=\"value\"]/div/div/input")
		public WebElement editarValorEntradaManual;
		
		@FindBy(xpath = "//button[text()=\"Gravar\"]")
		public WebElement gravarD;
				
				
	//RESULTADO FINAL
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement camposSaidaSubnivel2;
		@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
		public WebElement nomedoResultado;
		
		@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Campos de Saída\")]")
		public WebElement camposSaidaBCB;
		
		@FindBy(xpath = "//div[text()=\"Aba 1\"]")
		public WebElement selectCampoSaidaAba1OPC1;
		
		@FindBy(xpath = "//div[text()=\"Subnivel 2(Aba 1)\"]")
		public WebElement selectCampoSaidaAba1OPC2;
		
		@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
		public WebElement caixaFormula;
		
	//RESULTADO DO ABA
		@FindBy(xpath = "//span[contains(text(),\"Configurações do Resultado da Abas\")]")
		public WebElement resultadodDoAba;
		
		@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[1]/div/div/button")
		public WebElement adicionarAbas;
		
		
		@FindBy(xpath = "//div[@id=\"source-tab\"]/div/div/div[2]")
		public WebElement configuracaoAba;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcAba2;
		
		
	//VERIFICAR INFORMACION DE SUBNIVELES
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")][1]/div/div[1]/div[1]/div[1]")
		public WebElement abrirHierarquia1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[1]")
		public WebElement abrirGrupo1;
		
	
	//DATOS ABA 1
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[2]/div/div[1]")
		public WebElement verSub1Aba1;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba1;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[2]/div/div[1]")
		public WebElement verSub2Aba1;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[2]")
		public WebElement verTotalizadorGrupo1Aba1;
		

	//DATOS ABA 2
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[3]/div/div[1]")
		public WebElement verSub1Aba2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[3]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba2;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[3]/div/div[1]")
		public WebElement verSub2Aba2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[3]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba2;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[3]")
		public WebElement verTotalizadorGrupo1Aba2;
		
	//DATOS ABA 3
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[4]/div/div[1]")
		public WebElement verSub1Aba3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[4]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba3;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[4]/div/div[1]")
		public WebElement verSub2Aba3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[2]/div[4]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba3;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[4]")
		public WebElement verTotalizadorGrupo1Aba3;
	
	//DATOS RESULTADO FINAL
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")][2]/div/div[2]")
		public WebElement verResultadoFinal;
	
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div[1]/div[3]/div[2]")
		public WebElement totalizadorAba2;	
		
		
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
				
	public DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO() {
		PageFactory.initElements(driver, this);
	}
	
	public void ejecutarFinal() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		//COMENTAR DESPUES PORFAVOR
		sleep(2000);
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracaoExecutar = idObter5();
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
//		pesquisar.sendKeys(idConfiguracaoExecutar);
//		//pesquisar.sendKeys("1171");
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracaoExecutar+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracaoExecutar+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(executar);
		sleep(2000);
		
	//HASTA AQUI

		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		sleep(3000);
		waitExpectElement(executarM);
		sleep(2000);
		executarM.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		periodo.click();
		sleep(3000);
		paginaAnterior.click();
		sleep(2000);
		
		if (tc2) {
			ano2019.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			nov.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			m1.click(); //OJO CORREGIR PARA TC2
		}else {
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
		
		sleep(2000);
	//	execucaoAnalitica.click();
		sleep(1000);
		
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(gravar);
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		waitExpectElement(abrirHierarquia1);
		sleep(3000);
	}
	
	public ArrayList<Boolean> relacionamentoFinalyAbrirHierarquiaGrupo() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
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
		
		
		abrirHierarquia1.click();
		sleep(1000);
		
		abrirGrupo1.click();
		sleep(1000);
		
		
		System.out.println("_________________________________________________________________");
		System.out.println("----------------------*** Primera Aba ***----------------------");
		System.out.println("");
		
			verSub1Aba1.click();
			sleep(1000);
			
			String campoSaida1Sub1Aba1 = verCampoSaida1Sub1Aba1.getText();
			System.out.println("Subnivel 1 - Aba 1: ");
			System.out.println("campo Saida1 Sub1 Aba1: "+campoSaida1Sub1Aba1 );
			System.out.println("");
			
			verSub2Aba1.click();
			sleep(1000);
			
			String campoSaida1Sub2Aba1 = verCampoSaida1Sub2Aba1.getText();
			System.out.println("Subnivel 2 - Aba 1: ");
			System.out.println("campo Saida1 Sub2 Aba1: "+campoSaida1Sub2Aba1 );
		
		
			String totalizadorGrupo1Aba1 = verTotalizadorGrupo1Aba1.getText();
			System.out.println("Totalizador: ");
			System.out.println("Totalizador Grupo1 - Aba1: "+totalizadorGrupo1Aba1 );
			System.out.println("");
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
				sucesso.add(campoSaida1Sub1Aba1.contains("1.000,00"));
				sucesso.add(campoSaida1Sub2Aba1.contains("1.000,00"));
				sucesso.add(totalizadorGrupo1Aba1.contains("1.000,00"));
			
			verSub1Aba1.click();
			sleep(1000);
			verSub2Aba1.click();
			sleep(1000);
			
		System.out.println("_________________________________________________________________");
		System.out.println("----------------------*** Segunda Aba ***----------------------");
		System.out.println("");	
		
			verSub1Aba2.click();
			sleep(1000);
			
			String campoSaida1Sub1Aba2 = verCampoSaida1Sub1Aba2.getText();
			System.out.println("Subnivel 1 - Aba 2: ");
			System.out.println("campo Saida1 Sub1 Aba2: "+campoSaida1Sub1Aba2 );
			System.out.println("");
			
			verSub2Aba2.click();
			sleep(1000);
			
			String campoSaida1Sub2Aba2 = verCampoSaida1Sub2Aba2.getText();
			System.out.println("Subnivel 2 - Aba 2: ");
			System.out.println("campo Saida1 Sub2 Aba2: "+campoSaida1Sub2Aba2 );
		
		
			String totalizadorGrupo1Aba2 = verTotalizadorGrupo1Aba2.getText();
			System.out.println("Totalizador: ");
			System.out.println("Totalizador Grupo1 - Aba2: "+totalizadorGrupo1Aba2 );
			System.out.println("");
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoSaida1Sub1Aba2.contains("2.000,00"));
				sucesso.add(campoSaida1Sub2Aba2.contains("2.000,00"));
				sucesso.add(totalizadorGrupo1Aba2.contains("2.000,00"));
			
			verSub1Aba2.click();
			sleep(1000);
			verSub2Aba2.click();
			sleep(1000);
	
		System.out.println("_________________________________________________________________");
		System.out.println("----------------------*** Tercera Aba ***----------------------");
		System.out.println("");	
		
			verSub1Aba3.click();
			sleep(1000);
			
			String campoSaida1Sub1Aba3 = verCampoSaida1Sub1Aba3.getText();
			System.out.println("Subnivel 1 - Aba 3: ");
			System.out.println("campo Saida1 Sub1 Aba3: "+campoSaida1Sub1Aba3 );
			System.out.println("");
			
			verSub2Aba3.click();
			sleep(1000);
			
			String campoSaida1Sub2Aba3 = verCampoSaida1Sub2Aba3.getText();
			System.out.println("Subnivel 2 - Aba 3: ");
			System.out.println("campo Saida1 Sub2 Aba3: "+campoSaida1Sub2Aba3 );
		
		
			String totalizadorGrupo1Aba3 = verTotalizadorGrupo1Aba3.getText();
			System.out.println("Totalizador: ");
			System.out.println("Totalizador Grupo1 - Aba3: "+totalizadorGrupo1Aba3 );
			System.out.println("");
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoSaida1Sub1Aba3.contains("1.000,00"));
				sucesso.add(campoSaida1Sub2Aba3.contains("1.000,00"));
				sucesso.add(totalizadorGrupo1Aba3.contains("1.000,00"));
			
			verSub1Aba3.click();
			sleep(1000);
			verSub2Aba3.click();
			sleep(1000);
		
		
		System.out.println("_________________________________________________________________");
		System.out.println("----------------------*** RESULTADO FINAL 1***----------------------");
		System.out.println("");
			String verResultFinal = verResultadoFinal.getText();
			System.out.println("Resultado Final ");
			System.out.println("resultado Final 1: "+verResultFinal );
			System.out.println("");
		
			sucesso = new ArrayList<Boolean>();
				sucesso.add(verResultFinal.contains("2.000,00"));
			
				
		System.out.println("_________________________________________________________________");
		System.out.println("----------------------*** TOTALIZADOR ABA 2 ***----------------------");
		System.out.println("");
		
			String verTotalizadorAba2 = totalizadorAba2.getText();
			System.out.println("Totalizador Aba 2 ");
			System.out.println("totalizador Aba2: "+verTotalizadorAba2 );
			System.out.println("");
		
			sucesso = new ArrayList<Boolean>();
				sucesso.add(verTotalizadorAba2.contains("1.000.000,00"));		
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirConfiguracoes2() {
		
		biblioteca.click();
		sleep(8000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//EXCLUIR CONFIGURACOES

//		sleep(2000);
//		biblioteca.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		System.out.println("*******EXCLUIR CONFIGURACOES 2************");
		System.out.println("");
		
//		sleep(2000);
//		configuracoes.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		configuracaoDaConsolidacao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		
		String idConfiguracao2 = idObter5();
		System.out.println("");
		System.out.println("*******EXCLUIR CONFIGURACOES************");
		System.out.println("OBTER 5:" + idConfiguracao2);
		System.out.println("");
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idConfiguracao2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
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
		sleep(2000);
		
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
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
//		pesquisar.sendKeys(idConfiguracao2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div"));
		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
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
	
	public ArrayList<Boolean> excluirHierarquia2() {
		//EXCLUIR HIERARQUIA
		System.out.println("*******EXCLUIR HIERARQUIA 2************");
		System.out.println("");
		
		sleep(2000);
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idHierarquia2 = idObter4();
		//String idHierarquia = "1100";
		System.out.println("");
		System.out.println("*******EXCLUIR HIERARQUIA************");
		System.out.println("OBTER 4:" + idHierarquia2);
		System.out.println("");
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idHierarquia2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div"));
		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idHierarquia2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
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
	
	public ArrayList<Boolean> excluirConfiguracoes1() {
		//EXCLUIR CONFIGURACOES
		System.out.println("*******EXCLUIR CONFIGURACOES 1************");
		System.out.println("");
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracao1 = idObter3();
		System.out.println("");
		System.out.println("*******EXCLUIR CONFIGURACOES************");
		System.out.println("OBTER 3:" + idConfiguracao1);
		System.out.println("");
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idConfiguracao1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
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
		sleep(2000);
		
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
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
//		pesquisar.sendKeys(idConfiguracao1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div"));
		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
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
	
	public ArrayList<Boolean> excluirHierarquia1() {
		//EXCLUIR HIERARQUIA
		System.out.println("*******EXCLUIR HIERARQUIA 1************");
		System.out.println("");
		
		sleep(2000);
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idHierarquia1 = idObter2();
		//String idHierarquia = "1100";
		System.out.println("");
		System.out.println("*******EXCLUIR HIERARQUIA************");
		System.out.println("OBTER 1:" + idHierarquia1);
		System.out.println("");
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idHierarquia1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div"));
		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		
		pastaLexeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		pesquisar.sendKeys(idHierarquia1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluirH.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
	}
	

	
}
