package com.sap.timp.pageObjectModel.BCB.OrigemBFB.HierarquiaConfiguracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO extends TestBaseKenssy{

	//NUEVA CONFIGURACION HIERARQUIA
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;
		@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
		public WebElement hierarquiaConfiguracao;
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement ultimo;

	//NUEVA HIERARQUIA
		@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
		public WebElement nova;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeDeHierarquia;
	
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
		public WebElement nomeDaAba;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Hierarquia\")]")
		public WebElement nomeDaHierarquia;
		
		@FindBy(xpath = "//div[@id=\"hierarchies\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
		public WebElement listaNomeDaAba;

		// Nome do Grupo
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Grupo\")]")
		public WebElement nomeDoGrupo;
		@FindBy(xpath = "//div[@id=\"groups\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
		public WebElement listaNomeDoHierarquia;

		// Nome do Campo de Linha
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Campo de Linha\")]")
		public WebElement nomeDoCampoDeLinha;
		@FindBy(xpath = "//div[@id=\"fields\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
		public WebElement listanomeDoSubnivel;

		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcao;

		@FindBy(xpath = "//div[@class=\"list-option selectAll\"][1]/div/div/label/span")
		public WebElement opcaoTodos;

		@FindBy(xpath = "//div[@id=\"sublevels\"]/div/div[@id=\"add-icon\"]")
		public WebElement adicionar;

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
			
		
	// NUEVA CONFIGURACAO
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
		public WebElement configuracoes;
	
		@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
		public WebElement configuracaoDaConsolidacao;
	
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeHirarquia;
	
		@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
		public WebElement tributo;
		@FindBy(xpath = "//div[contains(@id,\"00\")]/div/label/span")
		public WebElement tributoO;
	
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresa;
		@FindBy(xpath = "//div[contains(@id,\"1000\")]/div/label/span")
		public WebElement empresaO;
	
		@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
		public WebElement uf;
		@FindBy(xpath = "//div[contains(@id,\"SP\")]/div/label/span")
		public WebElement ufO;
		@FindBy(xpath = "//div[contains(@id,\"AL\")]/div/label/span")
		public WebElement ufO2;
		
		@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
		public WebElement filial;
		@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
		public WebElement filialO;
		@FindBy(xpath = "//div[contains(@id,\"1000_AL_0008\")]/div/label/span")
		public WebElement filialTc2;
	
		@FindBy(xpath = "//div[@id=\"calculation-type\"]/div/div/div[2]")
		public WebElement tipoApuracao;
		@FindBy(xpath = "//li[text()=\"3 - Outros\"]")
		public WebElement tipoApuracaoO;
	
		@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
		public WebElement dataVigencia;
	
		@FindBy(xpath = "//button[text()=\"Gravar\"]")
		public WebElement gravarC;
	
		@FindBy(xpath = "//span[contains(@class,\"icon-Calculator\")]")
		public WebElement calculator;
	
		@FindBy(xpath = "//span[contains(text(),\"Configuração do Resultado Final\")]")
		public WebElement resultadoFinal;
	
		@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[2]/div/div/button")
		public WebElement adicionarConfiguracao;
	
		@FindBy(xpath = "//div[@id=\"condition\"]/div/div/div[2]")
		public WebElement condicao;
		@FindBy(xpath = "//li[text()=\"Não Exibir\"]")
		public WebElement condacaoO;
	
		@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
		public WebElement criar;
	
		@FindBy(xpath = "//button[text()=\"Fechar\"]")
		public WebElement fechar;
		
		@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
		public WebElement fecharEM;
		
		@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
		public WebElement fecharEM2;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
	// primer subnivel
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement primerNivel;	
			
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha1;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BFB\"]")
		public WebElement campoLinhaO1;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBFB;
		
		@FindBy(xpath = "//li[text()=\"44612 - (BCB Origem BFB) TA - NÃO MEXER\"]")
		public WebElement selectBFB1;
		//CORREGIR EN SU DEBIDO AMBIENTE
		@FindBy(xpath = "//li[contains(text(),\"368 - (BCB Origem BFB) TA - NÃO MEXER\")]")
		public WebElement selectBCB2;
		@FindBy(xpath = "//li[contains(text(),\"232 - (BCB Origem BFB) TA - NÃO MEXER\")]")
		public WebElement selectBFB3;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div/div[2]")
		public WebElement campoSaida1;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCampoSaida1;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicar;
				
		
		// SEGUNGO subnivel
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivel;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha2;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BFB\"]")
		public WebElement campoLinhaO2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBFBsub2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div/div[2]")
		public WebElement campoSaida2;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCampoSaida2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-previous\"]/div/label/span")
		public WebElement subPeriodosAnteriores2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"previous-periods\"]/div/div/div[2]")
		public WebElement cantSubPeriodosAnteriores2;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement opcCantSubPeriodosAnteriores2;
		
	//TERCER SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"3\"]")
		public WebElement tercerNivel;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha3;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BFB\"]")
		public WebElement campoLinhaO3;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBFBsub3;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"value\"]/div/div[2]")
		public WebElement campoSaida3;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCampoSaida3;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
		public WebElement zerado;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]//div[@id=\"zero-value\"]/div/div/div[2]")
		public WebElement condicaoZerado;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcZerado;
		
		
		//CUARTO SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"4\"]")
		public WebElement cuartoNivel;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha4;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BFB\"]")
		public WebElement campoLinhaO4;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBFBsub4;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"value\"]/div/div[2]")
		public WebElement campoSaida4;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][3]")
		public WebElement opcCampoSaida4;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
		public WebElement zerado4;
		@FindBy(xpath = "//div[@class=\"subLevel\"][4]//div[@id=\"zero-value\"]/div/div/div[2]")
		public WebElement condicaoZerado4;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement opcZerado4;
		
	//QUINTO SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"5\"]")
		public WebElement quintoNivel;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha5;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BFB\"]")
		public WebElement campoLinhaO5;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectBFBsub5;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"value\"]/div/div[2]")
		public WebElement campoSaida5;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCampoSaida5;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div/div[@id=\"check-negative\"]/div/label/span")
		public WebElement negativo5;
		
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
	
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel1;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaidaSubNivel1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaidaSubNivel2;
		//TQ1 Y TP1
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[1]/div[2]")
		public WebElement periodoTiempo2;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaidaSubNivel3;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[2]")
		public WebElement totalizador3;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel4;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaidaSubNivel4;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[4]/div[1]/div[2]")
		public WebElement totalizador4;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel5;
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[2]/div/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaidaSubNivel5;
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[5]/div[1]/div[2]")
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
		
	public OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracaoHierarquia() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		//IR A HIERARQUIA CONFIGURACAO
		sleep(2000);
		hierarquias.click();
		sleep(1000);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsH = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idH = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Hierarquia Configuracao: "+idH);
		
		nova.click();
		sleep(3000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nomeDeHierarquia.sendKeys("Prueba Automatizada Massiel");
		sleep(1000);

		nomeDaAba.sendKeys("Aba 1");
		sleep(1000);
		
		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1000);
		nomeDaHierarquia.sendKeys("Hierarquia 1");
		sleep(1000);
		listaNomeDaAba.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		nomeDoGrupo.sendKeys("Grupo 1");
		sleep(1000);
		listaNomeDoHierarquia.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		for (int i = 0; i < 4; i++) {
			adicionar.click();
			sleep(1000);
		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
		System.out.println(subniveisAdicionados);

		String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

		sucesso.add(subniveisAdicionadosS.equals("5"));

		int f = 1;
		for (int i = 0; i < 1; i++) {

		}
		
		
		for (int i = 0; i < subniveisAdicionados; i++) {
			WebElement nomeDoSubnivel = driver
					.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
			WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
					+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

			nomeDoSubnivel.sendKeys("Subnivel " + f);
			sleep(1000);
			listoDoNomeDoGrupo.click();
			opcao.click();
			opcao.sendKeys(Keys.ESCAPE);
			sleep(1000);

			f = f + 1;
		}

		nomeDoCampoDeLinha.sendKeys("Campo linha 1");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		justificativa.sendKeys("Justificativa TESTE AUTOMATIZADO");
//		aplicarJustificativa.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rowsH = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.contains("Prueba Automatizada Massiel"));

		idInserir1(id2);

		int id1I = convertToInt(idH);
		int id2I = convertToInt(id2);

		System.out.println("***********");
		System.out.println("Hierarquia");
		System.out.println("Id antes da criação: " + id1I);
		System.out.println("Id Após a criação: " + id2I);
		System.out.println("");
		System.out.println("***********");

		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		return sucesso;
	}
		
	public boolean criarConfiguracionConfiguracao() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Id Configurações antes da criação: "+ id);
		//idInserir2(id); //antes de crear herarquia configuracao
		
		nova.click();
		sleep(3000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys("Prueba Automatizada Massiel");
		sleep(1000);
		nomeHirarquia.sendKeys(Keys.ENTER);
		sleep(1000);

		tributo.click();
		sleep(1000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		uf.click();
		sleep(1000);
		if (tc2==true) {
			ufO2.click();
			ufO2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			ufO.click();
			ufO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		filial.click();
		sleep(1000);
		if (tc2==true) {
			filialTc2.click();
			filialTc2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			filialO.click();
			filialO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}


		tipoApuracao.click();
		sleep(1000);
		tipoApuracaoO.click();
		sleep(1000);

		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);

		gravarC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(3000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		idInserir3(idApos);
		System.out.println("Id Configurações apos da criação: "+ idApos);
		
		
		System.out.println("");
		System.out.println("***********");
		System.out.println("CONFIFURACOES");
		System.out.println("ID ANTES: " +id);
		System.out.println("ID DESPUES: "+ idApos);
		System.out.println("***********");
		System.out.println("");
		
		int idI = convertToInt(id);
		int idAposI = convertToInt(idApos);
		
		boolean sucesso = false;
		
		if (idAposI > idI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> configurarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		//COMENTAR DESPUES PORFAVOR
//			sleep(2000);
//			configuracoes.click();
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			configuracaoDaConsolidacao.click();
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			
//			pesquisar.sendKeys("1072");
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			
//			
//			WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div"));
//			WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//			sleep(2000);
		//HASTA AQUI
			
		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
			
//	
//	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
		
		calculator.click();
		sleep(1000);
		waitExpectElement(resultadoFinal);
		sleep(2000);
		resultadoFinal.click();
		sleep(1000);

		adicionarConfiguracao.click();
		sleep(1000);
		waitExpectElement(condicao);
		sleep(2000);
		condicao.click();
		sleep(1000);
		condacaoO.click();
		sleep(1000);

		criar.click();
		sleep(2000);
		fechar.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		justificativa.sendKeys("JUSTIFICATIVA 2 TESTE AUTOMATIZADO");
//		sleep(2000);
//		aplicarJustificativa.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		//corregir mensaje al parecer
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> outputBFB() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}
		
		boolean tq2 = false;
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		//PRIMER SUBNIVEL
		
		System.out.println("--------------------------------------------SubNivel 1-------------------------------------");
		sleep(1000);
		
		//sleep(2000);
		//primerNivel.click();
		sleep(2000);
		
		campolinha1.click();
		sleep(2000);
		campoLinhaO1.click();
		sleep(8000);
		
		//attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
		sleep(3000);
		
		selectBFB.click();
		sleep(1000);
		if (tc2==true) {
			selectBFB3.click();
			selectBFB3.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			//CORREGIR PARA TP1
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		
		campoSaida1.click();
		sleep(3000);
		opcCampoSaida1.click();
		sleep(3000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//comentar cuando junte todo
//		nao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		justificativa.sendKeys("JUSTIFICATIVA 2 TESTE AUTOMATIZADO");
//		sleep(2000);
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
	
	public ArrayList<Boolean> subNivel2() {
		
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
		
		
		boolean tq2 = false;
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		System.out.println("--------------------------------------------SubNivel 2-------------------------------------");
		sleep(1000);

		
		segundoNivel.click();
		sleep(2000);
		
		campolinha2.click();
		sleep(2000);
		campoLinhaO2.click();
		sleep(2000);
		
//		attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
//		sleep(3000);
		
		selectBFBsub2.click();
		sleep(1000);
		if (tc2==true) {
			selectBFB3.click();
			selectBFB3.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			//CORREGIR PARA TP1
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		campoSaida2.click();
		sleep(3000);
		opcCampoSaida2.click();
		opcCampoSaida2.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		
		subPeriodosAnteriores2.click();
		sleep(3000);
		
		cantSubPeriodosAnteriores2.click();
		sleep(2000);		
		opcCantSubPeriodosAnteriores2.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
//		sim.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
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
	
	public ArrayList<Boolean> subNivel3() {
		
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
		
		boolean tq2 = false;
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		//COMENTAR DESPUES PORFAVOR
	//	sleep(2000);
	//	configuracoes.click();
	//	sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	sleep(2000);
	//	configuracaoDaConsolidacao.click();
	//	sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	sleep(2000);
	//	
	//	
	//	pesquisar.sendKeys("1072");
	//	pesquisar.sendKeys(Keys.ENTER);
	//	sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	sleep(2000);
	//	
	//	
	//	
	//	WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div"));
	//	WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	//	sleep(2000);
	//	
	//	menu.click();
	//	sleep(1000);
	//	editar.click();
	//	sleep(6000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	waitExpectElement(calculator);
	//	sleep(2000);
	//HASTA AQUI
		
		System.out.println("--------------------------------------------SubNivel 3-------------------------------------");
		sleep(1000);
	
		
		tercerNivel.click();
		sleep(2000);
		
		campolinha3.click();
		sleep(2000);
		campoLinhaO3.click();
		sleep(2000);
		
	//	attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
	//	sleep(3000);
		
		selectBFBsub3.click();
		sleep(1000);
		if (tc2==true) {
			selectBFB3.click();
			selectBFB3.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		campoSaida3.click();
		sleep(3000);
		opcCampoSaida3.click();
		opcCampoSaida3.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		
		zerado.click();
		sleep(3000);
		
		condicaoZerado.click();
		sleep(3000);
		opcZerado.click();
		opcZerado.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	//	sim.click();
	//	sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	sleep(2000);
	//	
	//	aplicarJustificativa.click();
	//	sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	sleep(2000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;	
	}


	public ArrayList<Boolean> subNivel4() {
		
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
		
		boolean tq2 = false;
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
//		
//		pesquisar.sendKeys("1072");
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1072\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
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
		
		System.out.println("--------------------------------------------SubNivel 4-------------------------------------");
		sleep(1000);

		
		cuartoNivel.click();
		sleep(2000);
		
		campolinha4.click();
		sleep(2000);
		campoLinhaO4.click();
		sleep(2000);
		
//		attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
//		sleep(3000);
		
		selectBFBsub4.click();
		sleep(1000);
		if (tc2==true) {
			selectBFB3.click();
			selectBFB3.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		campoSaida4.click();
		sleep(3000);
		opcCampoSaida4.click();
		opcCampoSaida4.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		
		zerado4.click();
		sleep(3000);
		
		condicaoZerado4.click();
		sleep(3000);
		opcZerado4.click();
		opcZerado4.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subNivel5() {
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
		
		boolean tq2 = false;
		if (url.contains("tq2")) {
			tq2 = true;
		}
		
		System.out.println("--------------------------------------------SubNivel 5-------------------------------------");
		sleep(1000);
		
		quintoNivel.click();
		sleep(4000);
		
		campolinha5.click();
		sleep(2000);
		campoLinhaO5.click();
		sleep(5000);
		
//		attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
//		sleep(3000);
		
		selectBFBsub5.click();
		sleep(1000);
		if (tc2==true) {
			selectBFB3.click();
			selectBFB3.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq1==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else if(tq2==true) {
			selectBFB1.click();
			selectBFB1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else{
			selectBCB2.click();
			selectBCB2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		campoSaida5.click();
		sleep(5000);
		opcCampoSaida5.click();
		opcCampoSaida5.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		negativo5.click();
		sleep(5000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
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
		
		sleep(1000);
		executar.click();
		sleep(3000);
		waitExpectElement(executarN);
		sleep(2000);
		executarN.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		periodo.click();
		sleep(3000);
		
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
		
		sleep(2000);
	//	execucaoAnalitica.click();
		sleep(1000);
		
		executarB.click();
		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(aba1);
		sleep(2000);
		
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

		String valorCampoSaidaSubNivel1 = verCampoSaidaSubNivel1.getText();
		System.out.println("Campo Saida Subnivel1: "+ valorCampoSaidaSubNivel1);
		
		subnivel1.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorCampoSaidaSubNivel1.equals("5.000,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> abrirSubnivel2() {
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 2-------------------------------------");
		sleep(1000);
		
		subnivel2.click();
		sleep(2000);

		String valorCampoSaidaSubNivel2 = verCampoSaidaSubNivel2.getText();
		System.out.println("Campo Saida Subnivel2: "+ valorCampoSaidaSubNivel2);
		
		String valorCampoPeriodoTiempoSubNivel2 = periodoTiempo2.getText();
		System.out.println("Campo Periodo Tiempo SubNivel2: "+ valorCampoPeriodoTiempoSubNivel2);
		
		subnivel2.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (tc2==true) {
			sucesso.add(valorCampoSaidaSubNivel2.equals("5.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel2.contains("1/2014-1Y"));
		}else {
			sucesso.add(valorCampoSaidaSubNivel2.equals("5.000,00"));
			sucesso.add(valorCampoPeriodoTiempoSubNivel2.contains("12/2015 - 1M"));
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> abrirSubNivel3() {
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 3-------------------------------------");
		sleep(1000);
		
		subnivel3.click();
		sleep(2000);

		String valorCampoSaidaSubNivel3 = verCampoSaidaSubNivel3.getText();
		System.out.println("Campo Saida Subnivel3: "+ valorCampoSaidaSubNivel3);
		
		String valorTotalizadorSubNivel3 = totalizador3.getText();
		System.out.println("Totalizador SubNivel3: "+ valorTotalizadorSubNivel3);
		
		subnivel3.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(valorCampoSaidaSubNivel3.equals("5.000,00"));
			sucesso.add(valorTotalizadorSubNivel3.equals("0,00"));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	

	public ArrayList<Boolean> abrirSubNivel4() {
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 4-------------------------------------");
		sleep(1000);
		
		subnivel4.click();
		sleep(2000);

		String valorCampoSaidaSubNivel4 = verCampoSaidaSubNivel4.getText();
		System.out.println("valorEntradaManual Editado"+ valorCampoSaidaSubNivel4);
		
		String valorTotalizadorSubNivel4 = totalizador4.getText();
		System.out.println("Totalizador SubNivel4: "+ valorTotalizadorSubNivel4);
		
		subnivel4.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(valorCampoSaidaSubNivel4.equals("-5.000,00"));
			sucesso.add(valorTotalizadorSubNivel4.equals("0,00"));
			
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> abrirSubnivel5() {
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
		
		
		System.out.println("---------------------------------Abrir SubNivel 5-------------------------------------");
		sleep(1000);
		
		subnivel5.click();
		sleep(2000);
		
		String valorCampoSaidaSubNivel5 = verCampoSaidaSubNivel5.getText();
		System.out.println("Campo Saida Subnivel5: "+ valorCampoSaidaSubNivel5);
		
		String valortotalizadorSubNivel5 = totalizadorSubNivel5.getText();
		System.out.println("Totalizador SubNivel5: "+ valortotalizadorSubNivel5);
		
		subnivel5.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		sucesso.add(valorCampoSaidaSubNivel5.equals("5.000,00"));
		sucesso.add(valortotalizadorSubNivel5.equals("-5.000,00"));
		
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
		sleep(2000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		System.out.println(exclucao);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		sleep(6000);
		pastaLexeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
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
		
		
		/*pesquisar.sendKeys(idHierarquia);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);*/
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
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
		
	/*	pesquisar.sendKeys(idHierarquia);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
