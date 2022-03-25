package com.sap.timp.pageObjectModel.DFG.SPED.ECD;


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
 

public class ECDFuncionalidadesPO extends TestBaseSteven{
	
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
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecd\"]")
	public WebElement eCD;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecdItem\"]")
	public WebElement eCDO;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecd-calculationBlocks\"]")
	public WebElement blocoApuracao;

	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]")
	public WebElement raizArquivos;
	
	
	
	//ECD
	
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiauteECD;
	
	@FindBy(xpath = "//li[contains(text(),\"ID7521\")]")
	public WebElement leiauteECDOTQ1;
	
	@FindBy(xpath = "//li[contains(text(),\"ID151\")]")
	public WebElement leiauteECDOTC2;
	
	@FindBy(xpath = "//li[contains(text(),\"ID713\")]")
	public WebElement leiauteECDOTP1;
	
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoECD;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoECD;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaECD;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufECD;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufECDO;
	
	@FindBy(xpath = "//div[@id=\"AL\"]/div/label/span")
	public WebElement ufECDOTC2;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialECD;
	
	@FindBy(xpath = "//div[contains(@id,\"0001\")]/div/label/span")
	public WebElement filialECDO;
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
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
	
	public ECDFuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}
		
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		eCD.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		eCDO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idECDAC = "0";
		if (rows > 0) {
			idECDAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id Antes da Criação (ECD): " +idECDAC);
		} 
		
		blocoApuracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		String idBAAC = "0";
		if (rows > 0) {
			idBAAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			idInserir1(idBAAC);
			System.out.println("Id Antes da Criação (Bloco Apuração): " +idBAAC);
		} 
		
		
		eCDO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(2000);
		
		leiauteECD.click();
		sleep(2000);
		
		if (tc2 == true) {
			leiauteECDOTC2.click();
		}else if (tp1==true) {
			leiauteECDOTP1.click();
		}else {
			leiauteECDOTQ1.click();
		}
		sleep(2000);
		
		versaoECD.click();
		sleep(2000);
		versaoECDO.click();
		sleep(2000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(2000);
		
		tributoECD.click();
		sleep(2000);
		tributoECDO.click();
		sleep(2000);
		
		empresaECD.click();
		sleep(2000);
		empresaECDO.click();
		sleep(2000);
		empresaECDO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(2000);
		
		ufECD.click();
		sleep(2000);
		if (tc2 == true) {
			ufECDOTC2.click();
			sleep(2000);
			ufECDOTC2.sendKeys(Keys.ESCAPE);
		}else {
			ufECDO.click();
			sleep(2000);
			ufECDO.sendKeys(Keys.ESCAPE);
		}
		
		sleep(2000);
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(2000);
		
		filialECD.click();
		
		if (tc2 == true) {
			filialECDOTC2.click();
			sleep(2000);
			filialECDOTC2.sendKeys(Keys.ESCAPE);
		}else {
			filialECDO.click();
			sleep(2000);
			filialECDO.sendKeys(Keys.ESCAPE);
		}
		sleep(2000);
		
		
		dataVigenciaE.sendKeys("01/01/2013");
		sleep(2000);
		salvar.click();
		
		invisibilityOfElementOverlay();
		
		eCDO.click();
		
		invisibilityOfElementOverlay();
		
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		System.out.println("------------------------------------Criação de ECD------------------------------------------------");
		String idECDDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir1(idECDDC);
		System.out.println("Id Apóis da Criação (Bloco Apuração): " +idECDDC);
		
		int idECDDCI = convertToInt(idECDDC);
		int idECDACI = convertToInt(idECDAC);
		
		if (idECDACI < idECDDCI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verificação da criação: " + sucesso);
		
		
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
		
		if (tc2 == true) {
			sucesso.add(uf.equals("AL"));
			sucesso.add(filial.equals("0008"));
			
		}else {
			sucesso.add(uf.equals("SP"));
			sucesso.add(filial.equals("0001"));
		}
		
		sucesso.add(tributo.equals("ICMS"));
		sucesso.add(dataVigencia.equals("01/01/2013"));
	
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	public boolean editar() {
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		waitExpectElement(descricao);
		sleep(2000);
		
		String enviar = "Teste Editar";
		descricao.clear();
		sleep(2000);
		descricao.sendKeys(enviar);
		sleep(2000);
		
		editar.click();
		invisibilityOfElementOverlay();
		
		nao.click();
		sleep(2000);
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
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
	
	public boolean informacao() {
		

		System.out.println("-------------------------------------Verificação Informação--------------------------------------------");
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String descricaoI1 = descricaoI.getText();
		System.out.println("Texto Informação: " +descricaoI1);
		
		fecharInformacoes.click();
		sleep(3000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String texto = descricao.getAttribute("value");
		System.out.println("Texto Edição: " +texto);
		
		boolean sucesso = texto.equals(descricaoI1);
		System.out.println(sucesso);
		sleep(2000);
		fechar.click();
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> visualizar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2  = false;
		

		if(url.contains("tc2")){
			tc2 = true;
		}
		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Visualizar-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(2000);
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
		sleep(2000);
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
	
	public ArrayList<Boolean> criarBlocoApuracao() {
		
		String url = driver.getCurrentUrl();
		

		boolean tc2  = false;
		
		if(url.contains("tc2")){
			tc2 = true;
		}
		blocoApuracao.click();
		invisibilityOfElementOverlay();
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		System.out.println("----------------------------Criar em Bloco de Apuração'------------------------------------------");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
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
		
		if (tc2 == true) {
			sucesso.add(uf.equals("AL"));
			sucesso.add(filial.equals("0008"));
			
		}else {
			sucesso.add(uf.equals("SP"));
			sucesso.add(filial.equals("0001"));
		}
		
		sucesso.add(tributo.equals("ICMS"));
		sucesso.add(dataVigencia.equals("01/01/2013"));
		

		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	public boolean editarBlocoApuracao() {
		
		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Editar Bloco Apuracao-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		

		String texto = descricao.getAttribute("value");
		System.out.println("Texto após edição: " +texto);
		boolean sucesso = texto.equals("Teste Editar");
		System.out.println(sucesso);
		fechar.click();
		sleep(3000);
		
		return sucesso;
		
		
	}
	
	public boolean informacaoBlocoApuracao() {
		
		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Informação Bloco Apuracao-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		

		String texto = descricaoI.getText();
		System.out.println("Texto após edição: " +texto);
		boolean sucesso = texto.equals("Teste Editar");
		System.out.println(sucesso);
		fecharInformacoes.click();
		sleep(3000);
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> visualizarBlocoApuracao() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2  = false;
		

		if(url.contains("tc2")){
			tc2 = true;
		}
		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Visualizar Bloco Apuracao-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(2000);
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
			sucesso.add(nomeV1.equals("Teste Automatizado"));
			sucesso.add(descricaoV1.equals("Teste Editar"));
			sucesso.add(leiauteV1.contains("ECD - TA - NÃO MEXER"));
			sucesso.add(versaoV1.equals("1.0"));
			sucesso.add(tributoV1.equals("ICMS"));
			sucesso.add(empresaV1.equals("1000"));
		
		if (tc2==true) {
			sucesso.add(ufV1.equals("AL"));
			sucesso.add(filialV1.contains("0008"));
		}else {
			sucesso.add(ufV1.equals("SP"));
			sucesso.add(filialV1.contains("0001"));
		}
		sucesso.add(dataVigenciaV1.equals("01/01/2013"));
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(2000);

		return sucesso;
		
		
	}
	
	public boolean ExecucaoBlocosApuracao() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2  = false;
		boolean tp1  = false;

		if(url.contains("tc2")){
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		
		String idRegistro = idObter1();
		

		System.out.println("-------------------------------------Verificação Visualizar Bloco Apuracao-------------------------------------------");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		invisibilityOfElementOverlay();
		
		ufFilialB.click();
		sleep(2000);
		if (tc2 == true ) {
			ufFilialBOTC2.click();
			sleep(2000);
			ufFilialBOTC2.sendKeys(Keys.ESCAPE);
		}else if (tp1 == true) {
			ufFilialBO.click();
			sleep(2000);
			ufFilialBO.sendKeys(Keys.ESCAPE);
		}else{
			ufFilialBO.click();
			sleep(2000);
			ufFilialBO.sendKeys(Keys.ESCAPE);
		}
		
		if (tc2 ==true || tp1 == true) {
			tributoTC2.click();
			sleep(2000);
			tributoECDO.click();
		}
		
		sleep(2000);
		
		calendario.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		atras.click();
		sleep(2000);
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
		sleep(2000);
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
		sleep(2000);
		String idRegra = "";
		
		if (tc2 == true) {
			idRegra = "1217";
		}else if (tp1 == true) {
			idRegra = "1150";
		}else {
			idRegra = "2307";
		}
		
		WebElement regraO = driver.findElement(By.xpath("//div[@id=\""+idRegra+"\"]/div/label/span"));
		regraO.click();
		sleep(2000);
		regraO.sendKeys(Keys.ESCAPE);
		sleep(2000);
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
		sleep(2000);
		acao.click();
		sleep(2000);
		waitExpectElement(atualizar);
		sleep(2000);
		String fechaHoy = fechaActual();
		int rows = rows("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]");
		int f = 1;
		System.out.println("--------------------------Verificação Modificações Bloco Apuração----------------------------------------");
		for (int i = 0; i < rows; i++) {
		
			String dataMod = driver
					.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"][" + f + "]/div[10]/div"))
					.getText();
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
		sleep(2000);
		
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
	
	
	public boolean executarVariante() {
		invisibilityOfElementOverlay();
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}
		
		sped.click();
		invisibilityOfElementOverlay();
		
		eCD.click();
		invisibilityOfElementOverlay();
		
		eCDO.click();
		invisibilityOfElementOverlay();
		
		
		primeira.click();
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();
		
		
		String idRegistro = idObter1();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(2000);
		acao.click();
		sleep(3000);
//		waitExpectElement(execicioFiscal);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		execicioFiscal.sendKeys("2016");
		
		sleep(2000);
		actionsMoveToElementXpath("//div[@id=\"account-to\"]");
		sleep(2000);
		
		mesExecucao.click();
		sleep(2000);
		mesExecucaoO.click();
		sleep(2000);
		
		mesAte.click();
		sleep(2000);
		mesAteO.click();
		sleep(2000);
		
		actionsMoveToElementElement(tipoEscrituracao);
		
		empresa.click();
		sleep(2000);
		empresaO.click();
		sleep(2000);
		
		actionsMoveToElementElement(estrBalanco);
		sleep(2000);
		
		tipoEscrituracao.click();
		sleep(2000);
		tipoEscrituracaoO.click();
		sleep(2000);
		
		sitInicio.click();
		sleep(2000);
		sitInicioO.click();
		sleep(2000);
		
		finalidadeEscrituracao.click();
		sleep(2000);
		finalidadeEscrituracaoO.click();
		sleep(2000);
		
		livro.click();
		sleep(2000);
		livroO.click();
		sleep(2000);
		
		
		actionsMoveToElementXpath("//div[@id=\"current-shareholder\"]");
		
		estrBalanco.click();
		sleep(2000);
		estrBalancoO.click();
		sleep(2000);
		
		tpDocEnc.sendKeys("SB");
		
		actionsMoveToElementXpath("//div[@id=\"file-name\"]");
		
		empresaGrande.click();
		sleep(2000);
		empresaGrandeO.click();
		sleep(2000);
		
		criarVariante.click();
		sleep(2000);
		waitExpectElement(nomeVariante);
		sleep(2000);
		
		nomeVariante.sendKeys("Variante Teste");
		sleep(2000);
		criar.click();
		invisibilityOfElementOverlay();
		
		refresh();
		
		waitExpectElement(execicioFiscal);
		invisibilityOfElementOverlay();
		
		variante.click();
		sleep(2000);
		varianteO.click();
		String varianteID = varianteO.getAttribute("id");
		System.out.println("Id da Variante: " +varianteID);
		idInserir2(varianteID);
		sleep(2000);
		

		
		
		executarDFG.click();
		System.out.println("-------------------Verficação Execução da Variante---------------------------------");
		waitExpectXpath("//span[contains(text(),\"ECD executado com sucesso\")]");
		sleep(2000);
		
		boolean sucesso = driver.findElement(By.xpath("//span[contains(text(),\"ECD executado com sucesso\")]")).isDisplayed();
		
		System.out.println(sucesso);
		
		invisibilityOfElementOverlay();
		
		
		return sucesso;
		

	}
	
	public boolean excluirVariante() {
		
		String idRegistro = idObter2();
		excluirVariante.click();
		sleep(2000);
		waitExpectElement(fechar);
		sleep(2000);
		
		WebElement varianteExcluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div/div[@class=\"actions\"]"));
		
		varianteExcluir.click();
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		invisibilityOfElementOverlay();
		
		System.out.println("--------------------------------------Verficação Exclusão Variante------------------------------");
		int idExcluido = driver.findElements(By.xpath("//div[@data-id=\""+idRegistro+"\"]")).size();
		System.out.println(idExcluido);
		boolean sucesso = false;
		
		if (idExcluido == 0) {
			sucesso = true;
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	
	
	
	
	
	
	

}


