package com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.FatorDeCreditamentoContabilizaçãoDeCIAP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class FatorDeCreditamentoContabilizaçãoDeCIAPPO extends TestBaseMassiel{
	
	//CRIAR CONFIGURACION
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][3]")
		public WebElement execucoes;
		
		@FindBy(xpath = "//span[text()=\"Execução da Consolidação\"]")
		public WebElement execucacoConsolidacao;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement ultimo;
		
		@FindBy(xpath = "//div[@class=\"paginator\"]/div/div[contains(@class,\"icon-right\")][1]")
		public WebElement siguiente;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;

		@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
		public WebElement hierarquiaConfiguracao;

		//NUEVA HIERARQUIA
		@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
		public WebElement nova;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeDeHierarquia;

		@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
		public WebElement nomeDaAba;
		
		// Nome da Hierarquia
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
		
		@FindBy(xpath = "//button[text()=\"Não\"]")
		public WebElement nao;

		@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;
		
		// Configuracao
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
		@FindBy(xpath = "//div[contains(@id,\"DF\")]/div/label/span")
		public WebElement ufO2;
		
		@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
		public WebElement filial;
		@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
		public WebElement filialO;
		@FindBy(xpath = "//div[contains(@id,\"1000_DF_0019\")]/div/label/span")
		public WebElement filialTc2;

		@FindBy(xpath = "//div[@id=\"calculation-type\"]/div/div/div[2]")
		public WebElement tipoApuracao;
		@FindBy(xpath = "//li[text()=\"2 - Fator de Creditamento do CIAP\"]")
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

		@FindBy(xpath = "//button[text()=\" Criar\"]")
		public WebElement criar;

		@FindBy(xpath = "//button[text()=\"Fechar\"]")
		public WebElement fechar;
		
		//ENTRADA MANUAL
		@FindBy(xpath = "//span[contains(@class,\"icon-textandtext\")]")
		public WebElement entrada;
		
		@FindBy(xpath = "//button[text()=\"Adicionar Entrada Manual\"]")
		public WebElement adicionarEntrada;
		
		@FindBy(xpath = "//div[@id=\"create-name\"]/div/div/input")
		public WebElement entradaManualNome;
		
		@FindBy(xpath = "//div[@id=\"create-value\"]/div/div/input")
		public WebElement entradaManualValor;
		
		@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
		public WebElement criarAdicionarEntradaManual;
		
		// primer subnivel
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha1;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha3;
		
		@FindBy(xpath = "//li[text()=\"Entrada Manual\"]")
		public WebElement campoLinhaO1;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement entradaManual1;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement entradaManual2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement entradaManual3;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement entradaManualO1;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-plussign\")]")
		public WebElement mas;
		
		@FindBy(xpath = "//button[@id=\"add-button\"]")
		public WebElement adicionarCampo;
		
		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[2]/div[2]/div/div[1]/div[2]")
		public WebElement aba;
		
		@FindBy(xpath = "//li[text()=\"1\"]")
		public WebElement  abaOPC;

		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[3]/div[2]/div/div[1]/div[2]")
		public WebElement hierarquia;
		
		@FindBy(xpath = "//li[text()=\"Hierarquia 1\"]")
		public WebElement  hierarquiaOPC;
		
		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[4]/div[2]/div/div[1]/div[2]")
		public WebElement grupo;
		
		@FindBy(xpath = "//li[text()=\"Grupo 1\"]")
		public WebElement  grupoOPC;
		
		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[5]/div[2]/div/div[1]/div[2]")
		public WebElement subNivel;
		
		@FindBy(xpath = "//li[text()=\"Subnível  1\"]")
		public WebElement  subNivelOPC1;
		
		@FindBy(xpath = "//li[text()=\"Subnível  2\"]")
		public WebElement  subNivelOPC2;
		
		@FindBy(xpath = "//li[text()=\"Subnível  3\"]")
		public WebElement  subNivelOPC3;
		
		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[6]/div[2]/div/div[1]/div[2]")
		public WebElement campoSalida;
		
		@FindBy(xpath = "//div[@class=\"dialog-create-output\"]/div[7]/div[2]/div/div[1]/input")
		public WebElement  campoSalidaNome;
		
		@FindBy(xpath = "//div[@class=\"overlay dark\"][2]/div/div[3]/button[text()=\"Fechar\"]")
		public WebElement fechar2;
		
		@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Fechar\"]")
		public WebElement fechar3;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-uploadtodataset\")]")
		public WebElement servicos;
		
		@FindBy(xpath = "//div[@id=\"service\"]/div[1]/div[1]/div[2]")
		public WebElement servicio;
		
		@FindBy(xpath = "//li[text()=\"Fator de Creditamento\"]")
		public WebElement  servicioOPC;
		
		@FindBy(xpath = "//div[@id=\"credit-factor\"]/div[1]/div[1]/div[2]")
		public WebElement FatordeCreditamento;
		
		@FindBy(xpath = "//div[@id=\"total-value-sales\"]/div[1]/div[1]/div[2]")
		public WebElement ventasTotales;
		
		@FindBy(xpath = "//div[@id=\"total-value-taxable-sales\"]/div[1]/div[1]/div[2]")
		public WebElement totalVentas;
		
		@FindBy(xpath = "//li[text()=\"Campo de Saída 1\"]")
		public WebElement FatordeCreditamentoOPC;
		
		@FindBy(xpath = "//li[text()=\"Campo de Saída 2\"]")
		public WebElement ventasTotalesOPC;
		
		@FindBy(xpath = "//li[text()=\"Campo de Saída 3\"]")
		public WebElement totalVentasOPC;
		

		
		//EXECUTAR
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executar;
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executarM;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
		
		@FindBy(xpath = "//span[text()=\"1M\"]")
		public WebElement m1;
		
		@FindBy(xpath = "//span[text()=\"1Y\"]")
		public WebElement y1;
		
		@FindBy(xpath = "//div[text()=\"2019\"]")
		public WebElement ano2019;

		@FindBy(xpath = "//div[text()=\"Nov\"]")
		public WebElement nov;
		
		@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
		public WebElement execucaoAnalitica;
		
		@FindBy(xpath = "//button[text()=\"Executar\"]")
		public WebElement executarB;
		
		@FindBy(xpath = "//button[text()=\"Salvar Execução\"]")
		public WebElement salvarExecucoes;
		
		@FindBy(xpath = "//span[text()=\"Finalizar\"]")
		public WebElement finalizarExecucoes;
		
		@FindBy(xpath = "//button[text()=\"Confirma\"]")
		public WebElement confirmarExecucoes;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		

		//LEXERIA + RESTAURAR
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement simLexeira;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveExecutions\"]")
		public WebElement pastaLexeira;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
		public WebElement pastaLexeira2;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
		public WebElement pastaLexeira3;
		
		public FatorDeCreditamentoContabilizaçãoDeCIAPPO() {
			PageFactory.initElements(driver, this);
		}
		
		public ArrayList<Boolean> criarConfiguracaoExecucoes() {
			boolean tc2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			
			
			sleep(2000);
			execucoes.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			execucacoConsolidacao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			ultimo.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			//GUARDO EL ULTIMO ID DE LA ULTIMA PAGINA DE EXECUCOES
			int rows = driver
					.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
					.size();
			String id = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
					.getText();
			
			idInserir("IdExecucoes",id);
			
			System.out.println("Ultimo ID de Execucoes: "+id);
			System.out.println("");
			System.out.println("*************************");
			
			//IR A HIERARQUIA CONFIGURACAO
			sleep(2000);
			hierarquias.click();
			sleep(9000);
			hierarquiaConfiguracao.click();
			sleep(3000);
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
			sleep(2000);
			waitExpectElement(nomeDeHierarquia);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(1000);
			
			nomeDeHierarquia.sendKeys("Prueba Automatizada Massiel");
			sleep(1000);

			nomeDaAba.sendKeys("1");
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

			for (int i = 0; i < 2; i++) {
				adicionar.click();				
				sleep(1000);		
			}

			int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
			System.out.println(subniveisAdicionados);

			String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);
			System.out.println("subnivelS:" + subniveisAdicionadosS);
			
			sucesso.add(subniveisAdicionadosS.equals("3"));

			int f = 1;
			for (int i = 0; i < 1; i++) {

			}
			
			
			for (int i = 0; i < subniveisAdicionados; i++) {
				WebElement nomeDoSubnivel = driver
						.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
				WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
						+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

				nomeDoSubnivel.sendKeys("Subnível  " + f);
				sleep(1000);
				listoDoNomeDoGrupo.click();
				opcao.click();
				opcao.sendKeys(Keys.ESCAPE);
				sleep(1000);

				f = f + 1;
			}
			
			nomeDoCampoDeLinha.sendKeys("Campo de Linha 1");
			sleep(1000);
			listanomeDoSubnivel.click();
			opcaoTodos.click();
			opcaoTodos.sendKeys(Keys.ESCAPE);
			
			sleep(1000);
			gravar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			//waitExpectXpath("//span[@id=\"textLabel\"]");

			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int Hierrarquia = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi criada\")]")).size();
			System.out.println(Hierrarquia);
			
			
			if (Hierrarquia >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			ultimo.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			int rowsH2 = driver
					.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
					.size();
			String iH2 = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH2 + "]/div[4]/div"))
					.getText();
			String nome = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH2 + "]/div[5]/div"))
					.getText();
			System.out.println(nome);

			sucesso.add(nome.contains("Prueba Automatizada Massiel"));

			
			idInserir("IdExecucoes2",iH2);
			System.out.println("Id ultimo de Hierarquia a excluir: " + iH2);

			int id1I = convertToInt(idH);
			int id2I = convertToInt(iH2);

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
			System.out.println("*****CRIAR******");

			
			System.out.println(sucesso);
			
			return sucesso;

		}
		
		public boolean criarConfiguracao() {
			
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
			//idInserir3(id); //antes de crear herarquia configuracao
			
			nova.click();
			sleep(8000);


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

			dataVigencia.sendKeys("01/01/2010");
			sleep(1000);

			gravarC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);

			biblioteca.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
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
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
			
			
			String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
			idInserir("idApos",idApos);
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
		
		public ArrayList<Boolean>  configurarConfiguracao() {
			boolean tc2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
			ultimo.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			String idRegistro = idObter("idApos");
			System.out.println(idRegistro);
			
			WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+ idRegistro +"\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+ idRegistro +"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			sleep(2000);
	
			menu.click();
			sleep(1000);
			editar.click();
			sleep(3000);
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
			

			int NoExibir = driver.findElements(By.xpath("//span[contains(text(),\"Configuração de Resultado inserido com sucesso\")]")).size();
			System.out.println("no exibir: " +NoExibir);
			
			
			if (NoExibir >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			fechar.click();
			sleep(2000);

			entrada.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			adicionarEntrada.click();
			sleep(2000);
			waitExpectElement(criarAdicionarEntradaManual);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			

			entradaManualNome.sendKeys("Entrada Manual 1");
			sleep(1000);
			
			entradaManualValor.sendKeys("100");
			sleep(2000);

			criarAdicionarEntradaManual.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int EntradaManual = driver.findElements(By.xpath("//span[contains(text(),\"Entrada manual inserido com sucesso\")]")).size();
			System.out.println("entrada Manual: " + EntradaManual);
			
			
			if (EntradaManual >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			
			fechar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			campolinha1.click();
			sleep(1000);
			campoLinhaO1.click();
			sleep(2000);
			
			entradaManual1.click();
			sleep(1000);
			entradaManualO1.click();
			sleep(2000);
			
			//subnivel 2
			
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			actionsMoveToElementElement(campolinha2);
			sleep(1000);
			
			campolinha2.click();
			sleep(1000);
			campoLinhaO1.click();
			sleep(2000);
			
			entradaManual2.click();
			sleep(1000);
			entradaManualO1.click();
			sleep(2000);
			
			//subnivel 3
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			actionsMoveToElementElement(campolinha3);
			sleep(1000);
			
			campolinha3.click();
			sleep(1000);
			campoLinhaO1.click();
			sleep(2000);
			
			entradaManual3.click();
			sleep(1000);
			entradaManualO1.click();
			sleep(2000);
			
			mas.click();
			sleep(1000);
			
			adicionarCampo.click();
			sleep(1000);
		
			aba.click();
			sleep(1000);
			
			abaOPC.click();
			sleep(1000);
			
			hierarquia.click();
			sleep(1000);
			
			hierarquiaOPC.click();
			sleep(1000);
			
			grupo.click();
			sleep(1000);
			
			grupoOPC.click();
			sleep(1000);
			
			subNivel.click();
			sleep(1000);
			
			subNivelOPC1.click();
			sleep(1000);
	
			
			campoSalidaNome.sendKeys("Campo de Saída 1");
			sleep(1000);
			
			criar.click();
			sleep(2000);
			
			int campoSalida = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
			System.out.println("campo Salida 1: " +campoSalida);
			
			
			if (campoSalida >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			subNivel.click();
			sleep(1000);
			
			subNivelOPC2.click();
			sleep(1000);
	
			campoSalidaNome.clear();
			sleep(1000);
			
			campoSalidaNome.sendKeys("Campo de Saída 2");
			sleep(1000);
			
			criar.click();
			sleep(2000);
			
			int campoSalida2 = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
			System.out.println("campo Salida 2: " + campoSalida2);
			
			
			if (campoSalida2 >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			subNivel.click();
			sleep(1000);
			
			subNivelOPC3.click();
			sleep(1000);
	
			campoSalidaNome.clear();
			sleep(1000);
			campoSalidaNome.sendKeys("Campo de Saída 3");
			sleep(1000);
			
			criar.click();
			sleep(3000);
			
			int campoSalida3 = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
			System.out.println("campo Salida 3: "+campoSalida3);
			
			
			if (campoSalida3 >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			
			
			
			fechar2.click();
			sleep(2000);
			
			fechar.click();
			sleep(2000);
			
			servicos.click();
			sleep(1000);
			
			adicionarCampo.click();
			sleep(1000);
			
			servicio.click();
			sleep(1000);
			
			servicioOPC.click();
			sleep(1000);
			
			FatordeCreditamento.click();
			sleep(1000);
			
			FatordeCreditamentoOPC.click();
			sleep(1000);
			
			ventasTotales.click();
			sleep(1000);
			
			ventasTotalesOPC.click();
			sleep(1000);
			
			totalVentas.click();
			sleep(1000);
			
			totalVentasOPC.click();
			sleep(1000);
			
			gravarC.click();
			sleep(2000);
			
			fechar3.click();
			sleep(4000);
		
			
			gravar.click();
			sleep(2000);

			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int gravar = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
			System.out.println("Despues de Gravar: "+ gravar);
			
			
			if (gravar >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			System.out.println(sucesso);
			return sucesso;
		
		}
		
		public boolean executar() {
			
			boolean tc2 = false;
			boolean tp1 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}else if (url.contains("tp1")) {
				tp1 = true;
			}
			
			sleep(1000);
			executar.click();
			sleep(3000);
			waitExpectElement(executarM);
			sleep(2000);
			executarM.click();
			
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			

			periodo.click();
			sleep(3000);
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
		
			
			
			executarB.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			gravar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			nao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);
			
			//salvarExecucoes.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			sleep(2000);
			execucoes.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			execucacoConsolidacao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			ultimo.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int rowsE = driver
					.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
					.size();
			String idE = driver.findElement(By.xpath(
					"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsE + "]/div[4]/div"))
					.getText();
			System.out.println("Ultimo ID de Execucoes Configuracao: "+idE);
			
			idInserir("IdExecucoes3",idE);
			
			
			int idExecucoesA = Integer.valueOf(idObter("IdExecucoes2"));		
			int idExecucoesB = Integer.valueOf(idE);
			
			System.out.println("");
			System.out.println("***********");
			System.out.println("EXECUTAR");
			System.out.println("ID ANTES: " +idExecucoesA);
			System.out.println("ID DESPUES: "+ idExecucoesB);
			System.out.println("***********");
			System.out.println("");
			
			boolean sucesso = true;
			
			if (idExecucoesB > idExecucoesA) {
				sucesso = true;
			}else {
				sucesso = false;
			}
			
			
			return sucesso;
			
		}	
		
		public ArrayList<Boolean> lixeira() {
			boolean tc2 = false;
			String url = driver.getCurrentUrl();
			if (url.contains("tc2")) {
				tc2 = true;
			}
			sleep(9000);
			execucoes.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			execucacoConsolidacao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			
			ultimo.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(9000);
			
			String idRegistro  =  idObter("IdExecucoes3");
			
			WebElement menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div"));
			WebElement factor = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Atualização de Fator de Creditamento\"]"));
			sleep(2000);

			menu1.click();
			sleep(1000);
			factor.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			int factorR = driver.findElements(By.xpath("//span[contains(text(),\"Fator de Creditamento atualizado com sucesso\")]")).size();
			System.out.println("Despues de Gravar: "+ factorR);
			
			
			if (factorR >0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			
			WebElement menu2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div"));
			WebElement lixieria = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
			sleep(2000);

			menu2.click();
			sleep(1000);
			lixieria.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			waitExpectElement(simLexeira);
			sleep(2000);
			
			simLexeira.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);

			pastaLexeira.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ultimo.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
//			pesquisar.sendKeys(idRegistro);
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
			
			
//			String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
//			
//			
//		
//			sucesso.add(idRegistro.equals(id));
//			System.out.println(sucesso);
			
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
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String idRegistro2  =  idObter("idApos");
			
			
			
//			pesquisar.sendKeys(idRegistro2);
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
			
			WebElement menu3 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro2+"\"]/div[1]/div"));
			WebElement lixieria2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
			sleep(2000);

			menu3.click();
			sleep(1000);
			lixieria2.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			waitExpectElement(simLexeira);
			sleep(2000);
		
			simLexeira.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);
			
			pastaLexeira2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			ultimo.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
//			pesquisar.sendKeys(idRegistro2);
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			
//			String idC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
//			
//			
//			sucesso.add(idRegistro2.equals(idC));
//			System.out.println(sucesso);
			
			sleep(2000);
			hierarquias.click();
			sleep(5000);
			hierarquiaConfiguracao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String idRegistro3  =  idObter("IdExecucoes2");
			
			pesquisar.sendKeys(idRegistro3);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			WebElement menu4 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro3+"\"]/div[1]/div"));
			WebElement lixieria3 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro3+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
			sleep(2000);

			menu4.click();
			sleep(1000);
			lixieria3.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			waitExpectElement(simLexeira);
			sleep(2000);
		
			simLexeira.click();
			sleep(6000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);
			
			pastaLexeira3.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ultimo.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
//			pesquisar.sendKeys(idRegistro3);
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			
//			String idH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
//			
//			
//			sucesso.add(idRegistro3.equals(idH));
//			System.out.println(sucesso);
			
			return sucesso;
		}
		
			

}
