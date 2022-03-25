package com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1200;


import java.util.ArrayList;

import org.apache.maven.profiles.AlwaysOnActivation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
  

public class S1200AlterarDadosDoEventoPO extends TestBaseSteven{
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-gooddoc\")]")
	public WebElement sped;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-efd-icmsipi\"]")
	public WebElement efd;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-e-social\"]")
	public WebElement esocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-events\"]")
	public WebElement eventos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1200\"]")
	public WebElement s1200;

	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"Alterar Dados do Evento\"]")
	public WebElement alterarDados;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]")
	public WebElement raizArquivos;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"S1200 - Alter\"]")
	public WebElement alter;
	
	//ECD
	
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiauteS1000;
	
	@FindBy(xpath = "//li[contains(text(),\"7586\")]")
	public WebElement leiauteS1000O;

	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoS1000;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoS1000O;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoS1000;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoS1000O;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaS1000;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaS1000O;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufS1000;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufS1000O;
	
	@FindBy(xpath = "//div[@id=\"AL\"]/div/label/span")
	public WebElement ufECDOTC2;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialS1000;
	
	@FindBy(xpath = "//div[contains(@id,\"0001\")]/div/label/span")
	public WebElement filialS1000O;
	
	@FindBy(xpath = "//div[contains(@id,\"0008\")]/div/label/span")
	public WebElement filialECDOTC2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;

	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fecharInformacoes;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement nomeI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement descricaoI;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeV;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Leiaute\")]")
	public WebElement leiauteV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão Leiaute\")]")
	public WebElement versaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement ufV;

	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement filialV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaV;
	
	
	
	//Bloco Apuração
	
	
	@FindBy(xpath = "//div[@id=\"executarArquivo\"]/div[3]/div[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement ufFilialB;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufFilialBO;
	
	@FindBy(xpath = "//div[@id=\"AL\"]/div/label/span")
	public WebElement ufFilialBOTC2;
	
	@FindBy(xpath = "//div[@id=\"taxSelect\"]/div/div[2]")
	public WebElement tributoTC2;

	
	
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\") and @tabindex=\"0\"][1]")
	public WebElement atras;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement atualizarEstrutura;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConf;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement visualizarAN3;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeR;
	
	@FindBy(xpath = "//div[@class=\"rule-input\"]/div/div/div[2]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Atualizar\"]")
	public WebElement atualizar;
	

	@FindBy(xpath = "//div[@id=\"fiscal-year\"]/div/div/input")
	public WebElement execicioFiscal;
	
	@FindBy(xpath = "//div[@id=\"execution-month\"]/div/div[2]")
	public WebElement mesExecucao;
	
	@FindBy(xpath = "//li[text()=\"Janeiro\"]")
	public WebElement mesExecucaoO;
	
	@FindBy(xpath = "//div[@id=\"execution-month-to\"]/div/div[2]")
	public WebElement mesAte;
	
	@FindBy(xpath = "//li[text()=\"Dezembro\"]")
	public WebElement mesAteO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"bookkeeping-type\"]/div/div[2]")
	public WebElement tipoEscrituracao;
	
	@FindBy(xpath = "//li[contains(text(),\"Livro diário (completo\")]")
	public WebElement tipoEscrituracaoO;
	
	@FindBy(xpath = "//div[@id=\"operation-start-situation\"]/div/div[2]")
	public WebElement sitInicio;
	
	@FindBy(xpath = "//li[text()=\"Abertura\"]")
	public WebElement sitInicioO;
	
	@FindBy(xpath = "//div[@id=\"bookkeeping-purpose\"]/div/div[2]")
	public WebElement finalidadeEscrituracao;
	
	@FindBy(xpath = "//li[text()=\"Original\"]")
	public WebElement finalidadeEscrituracaoO;
	
	@FindBy(xpath = "//div[@id=\"ledger\"]/div/div[2]")
	public WebElement livro;
	
	@FindBy(xpath = "//li[text()=\"0L\"]")
	public WebElement livroO;
	
	@FindBy(xpath = "//div[@id=\"swing-structure\"]/div/div[2]")
	public WebElement estrBalanco;
	
	@FindBy(xpath = "//li[text()=\"ZBBR\"]")
	public WebElement estrBalancoO;
	
	@FindBy(xpath = "//div[@id=\"document-type\"]/div/div/input")
	public WebElement tpDocEnc;
	
	@FindBy(xpath = "//div[@id=\"big-company-indicator\"]/div/div[2]")
	public WebElement empresaGrande;
	
	@FindBy(xpath = "//li[text()=\"Grande empresa\"]")
	public WebElement empresaGrandeO;
	
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//li[text()=\"SPED EFD/ICMS\"]")
	public WebElement tipoO;
	
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaTP1O;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
	public WebElement estruturaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;

	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome do arquivo\"]")
	public WebElement nomeVariante;
	
	@FindBy(xpath = "//span[text()=\"Criar Variante\"]")
	public WebElement criarVariante;
	
	@FindBy(xpath = "//div[@id=\"variant\"]/div/div[2]")
	public WebElement variante;
	
	@FindBy(xpath = "//li[text()=\"Variante Teste\"]")
	public WebElement varianteO;
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[3]/button")
	public WebElement excluirVariante;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limparFiltros;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosAvancados;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement idI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement eventoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement empresaI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement tipoInscricaoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement numInscricaoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement versaoInscricaoI;
	
	@FindBy(xpath = "//span[text()=\"Enviar selecionado\"]")
	public WebElement selecionado;
	
	@FindBy(xpath = "//span[text()=\"Enviar pendências\"]")
	public WebElement pendencias;
	
	
	public S1200AlterarDadosDoEventoPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		

		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		esocial.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		eventos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		s1200.click();
		
		invisibilityOfElementOverlay();
		
		alterarDados.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idESocialAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação (ECD): " +idESocialAC);
		
		
		
		novo.click();
		waitExpectElement(nome);
		invisibilityOfElementOverlay();
		
		nome.sendKeys("Teste Automatizado");
		
		leiauteS1000.click();
		sleep(1000);
		leiauteS1000O.click();
		sleep(1000);
		
		versaoS1000.click();
		sleep(1000);
		versaoS1000O.click();
		sleep(1000);
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		tributoS1000.click();
		sleep(1000);
		tributoS1000O.click();
		sleep(1000);
		
		empresaS1000.click();
		sleep(1000);
		empresaS1000O.click();
		sleep(1000);
		empresaS1000O.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		ufS1000.click();
		sleep(1000);
		ufS1000O.click();
		sleep(1000);
		ufS1000O.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		filialS1000.click();
		sleep(1000);
		filialS1000O.click();
		sleep(1000);
		filialS1000O.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		invisibilityOfElementOverlay();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		alterarDados.click();
		invisibilityOfElementOverlay();
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		System.out.println("------------------------------------Criação de S1000------------------------------------------------");
		String idESocialDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir1(idESocialDC);
		System.out.println("Id Após da Criação S1000: " +idESocialDC);
		
		int idESocialDCI = convertToInt(idESocialDC);
		int idESocialACI = convertToInt(idESocialAC);
		
		if (idESocialACI < idESocialDCI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verificação da criação: " + sucesso.get(0));
		
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[4]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[10]/div/li")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[11]/div/li")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[12]/div/li")).getText();
		String tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[13]/div/li")).getText();
		String dataVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[14]/div")).getText();
		
		System.out.println(nome);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(dataVigencia);
		
		
		sucesso.add(nome.equals("Teste Automatizado"));
		sucesso.add(empresa.equals("1000"));
		sucesso.add(uf.equals("SP"));
		sucesso.add(filial.equals("0001"));
		sucesso.add(tributo.equals("ICMS"));
		sucesso.add(dataVigencia.equals("01/01/2013"));
		
		sucesso.add(true);
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	public boolean editar() {
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		
		String enviar = "Teste Editar";
		descricao.clear();
		descricao.sendKeys(enviar);
		sleep(1000);
		
		editar.click();
		invisibilityOfElementOverlay();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		sleep(3000);
		
		int presente = driver.findElements(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).size();
		
		if (presente > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		alterarDados.click();
		
		invisibilityOfElementOverlay();
		
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		System.out.println("-----------------------------------Verificação Edição-------------------------------------------------");
		String texto = descricao.getAttribute("value");
		System.out.println("Texto após edição: " +texto);
		boolean sucesso = texto.equals(enviar);
		System.out.println(sucesso);
		fechar.click();
		sleep(3000);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> informacao() {
		

		System.out.println("-------------------------------------Verificação Informação--------------------------------------------");
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String descricaoI1 = descricaoI.getText();
		String nomeI1 = nomeI.getText();
				
		System.out.println("Texto Informação Nome: " +nomeI1);
		System.out.println("Texto Informação Descrição: " +descricaoI1);
		
		fecharInformacoes.click();
		sleep(3000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String nomeV1 = nome.getAttribute("value");
		String descricaoV1 = descricao.getAttribute("value");
		System.out.println("Texto Visualizar Nome: " +nomeI1);
		System.out.println("Texto Visualizar Descrição: " +descricaoV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeI1.equals(nomeV1));
		sucesso.add(descricaoI1.equals(descricaoV1));
		
		System.out.println(sucesso);
		sleep(1000);
		fechar.click();
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> visualizar() {
		

		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Visualizar-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		System.out.println("----------Visualizar-------");
		String nomeV1 = nomeV.getAttribute("value");
		String descricaoV1 = descricaoV.getAttribute("value");
		String leiauteV1 = leiauteV.getAttribute("value");
		String versaoV1 = versaoV.getAttribute("value");
		String tributoV1 = tributoV.getAttribute("value");
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String dataVigenciaV1 = dataVigenciaV.getAttribute("value");
		
		System.out.println(nomeV1);
		System.out.println(descricaoV1);
		System.out.println(leiauteV1);
		System.out.println(versaoV1);
		System.out.println(tributoV1);
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(dataVigenciaV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		fechar.click();
		sleep(2000);
		
	
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String nomeE1 = nomeV.getAttribute("value");
		String descricaoE1 = descricaoV.getAttribute("value");
		String leiauteE1 = leiauteV.getAttribute("value");
		String versaoE1 = versaoV.getAttribute("value");
		String tributoE1 = tributoV.getAttribute("value");
		String empresaE1 = empresaV.getText();
		String ufE1 = ufV.getText();
		String filialE1 = filialV.getText();
		String dataVigenciaE1 = dataVigenciaV.getAttribute("value");
		System.out.println("----------Editar-------");
		
		System.out.println(nomeE1);
		System.out.println(descricaoE1);
		System.out.println(leiauteE1);
		System.out.println(versaoE1);
		System.out.println(tributoE1);
		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(dataVigenciaE1);
		

		sucesso.add(nomeV1.equals(nomeE1));
		sucesso.add(descricaoV1.equals(descricaoE1));
		sucesso.add(leiauteV1.contains(leiauteE1));
		sucesso.add(versaoV1.equals(versaoE1));
		sucesso.add(tributoV1.equals(tributoE1));
		sucesso.add(empresaV1.equals(empresaE1));
		sucesso.add(ufV1.equals(ufE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(dataVigenciaV1.equals(dataVigenciaE1));
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(2000);

		return sucesso;
		
		
	}
	
	public boolean ExecucaoS1000() {
		

		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Visualizar Bloco Apuracao-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		ufFilialB.click();
		sleep(1000);

		ufFilialBO.click();
		sleep(1000);
		ufFilialBO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		calendario.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		atras.click();
		sleep(1000);
		ano2016.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		m1.click();
		sleep(2000);
		centralizacao.click();
		sleep(3000);
		
		executarConf.click();
		sleep(2000);
		waitExpectXpath("//div[contains(@class,\"draggable\")]");
		sleep(2000);
		invisibilityOfElement("//div[contains(@class,\"draggable\")]");
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int aparece = rows("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		if (aparece > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		
		atualizarEstrutura.click();
		
		invisibilityOfElementOverlay();
		
		gravar.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		visualizarAN3.click();
		sleep(2000);
		waitExpectElement(criar);
		sleep(2000);
		
		nomeR.sendKeys("Teste Automatizado Regra ECD");
		sleep(100);
		regra.click();
		sleep(1000);
		String idRegra = "2353";
		
		WebElement regraO = driver.findElement(By.xpath("//div[@id=\""+idRegra+"\"]/div/label/span"));
		regraO.click();
		sleep(1000);
		regraO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		boolean sucesso = driver.findElement(By.xpath("//span[text()=\"Aprovar\"]")).isDisplayed();
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}

	public ArrayList<Boolean> visualizarActualizacoes() {
		
		String idRegistro = idObter1();
		
	
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar Atualizações\"]"));
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(2000);
		waitExpectElement(atualizar);
		sleep(2000);
		String fechaHoy = fechaActual();
		int rows = rows("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]");
		int f = 1;
		System.out.println("--------------------------Verificação Modificações Bloco Apuração----------------------------------------");
		for (int i = 0; i < rows; i++) {
		
			String dataMod = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"][" + f + "]/div[10]/div")).getText();
			System.out.println(dataMod);
			sucesso.add(dataMod.equals(fechaHoy));
		}
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(3000);
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> verificarArquivosRaiz() {
		
		home.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"dragger-pagination-right\"]");
		sleep(1000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		arquivos.click();
		invisibilityOfElementOverlay();
		
		raizArquivos.click();
		invisibilityOfElementOverlay();
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		System.out.println("------------------------- Verficacão de arquivos-------------------------------");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = rows("//div[@data-id and @class=\"tr\"]");
		String nome = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[7]/div")).getText();
		String descricao = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[8]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[10]/div")).getText();
		String uf = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[11]/div")).getText();
		String filial = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[12]/div")).getText();
		String ano = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[13]/div")).getText();
		String mes = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[14]/div")).getText();
		String periodo = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[15]/div")).getText();
		
		
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(periodo);
		
		sucesso.add(nome.contains("Teste Automatizado"));
		sucesso.add(descricao.contains("Teste Editar"));
		sucesso.add(empresa.contains("1000"));
		sucesso.add(uf.contains("SP"));
		sucesso.add(filial.contains("0001"));
		sucesso.add(ano.contains("2016"));
		sucesso.add(mes.contains("12,01"));
		sucesso.add(periodo.contains("1M"));
		
		return sucesso;
		
	}
	

	public ArrayList<Boolean> verificacaoInsert() {

		
		sped.click();
		invisibilityOfElementOverlay();
		
		esocial.click();
		
		invisibilityOfElementOverlay();
		
		eventos.click();
		
		invisibilityOfElementOverlay();
		
		s1200.click();

		invisibilityOfElementOverlay();
		
		alter.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();
		

		
		filtrosAvancados.click();
		sleep(3000);
		waitExpectXpath("//input[contains(@placeholder,\"Inscrição\")]");
		limparFiltros.click();
		
		invisibilityOfElementOverlay();
		System.out.println("-----------------------------------------Verificação Insert------------------------------------------");
		String idB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[3]/div")).getText();
		String eventIDB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[4]/div")).getText();
		String empresaB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[5]/div")).getText();
		String tipoInscricaoB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[6]/div")).getText();
		String numeroInscricaoB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[7]/div")).getText();
		String versaoProcesoB = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[8]/div")).getText();
		
		System.out.println(idB);
		System.out.println(eventIDB);
		System.out.println(empresaB);
		System.out.println(tipoInscricaoB);
		System.out.println(numeroInscricaoB);
		System.out.println(versaoProcesoB);


		
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\"9\" and @class=\"tr\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String idI1 = idI.getText();
		String eventIDI1 = eventoI.getText();
		String empresaI1 = empresaI.getText();
		String tipoInscricaoI1 = tipoInscricaoI.getText();
		String numeroInscricaoI1 = numInscricaoI.getText();
		String versaoProcesoI1 = versaoInscricaoI.getText();
		
		System.out.println(idI1);
		System.out.println(eventIDI1);
		System.out.println(empresaI1);
		System.out.println(tipoInscricaoI1);
		System.out.println(numeroInscricaoI1);
		System.out.println(versaoProcesoI1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idB.equals(idI1));
		sucesso.add(eventIDB.equals(eventIDI1));
		sucesso.add(empresaB.equals(empresaI1));
		sucesso.add(tipoInscricaoB.equals(tipoInscricaoI1));
		sucesso.add(numeroInscricaoB.equals(numeroInscricaoI1));
		sucesso.add(versaoProcesoB.equals(versaoProcesoI1));

		System.out.println(sucesso);
		fecharInformacoes.click();
		sleep(1000);
		return sucesso;
		

	}
	
	public ArrayList<Boolean> enviarInsert() {

		
		
		WebElement flag = driver.findElement(By.xpath("//div[@data-id=\"9\"]/div[2]/label/span"));
		
		flag.click();
		sleep(1000);
		selecionado.click();
		
		invisibilityOfElementOverlay();
		System.out.println("------------------------------Verificar enviar------------------------------------");
		int enviado = driver.findElements(By.xpath("//span[contains(text(),\"Arquivos Enviados\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (enviado > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		invisibilityOfElement("//span[contains(text(),\"Arquivos Enviados\")]");
		
		sleep(2000);
		
		pendencias.click();
		invisibilityOfElementOverlay();
		
		int enviado2 = driver.findElements(By.xpath("//span[contains(text(),\"Arquivos Enviados\")]")).size();
		
		if (enviado2 > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		return sucesso;
		

	}
	
	
	
	
	
	
	
	
	
	
	
}


