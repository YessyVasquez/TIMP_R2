package com.sap.timp.pageObjectModel.DFG.AN3;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import javax.net.ssl.SSLKeyException;

import org.apache.commons.exec.ExecuteWatchdog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class AN3FuncionalidadesPO extends TestBaseSteven{
	
	
	
	
	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")
	public WebElement fecharMensagem;
	
	@FindBy(xpath = "//div[@class=\"layoutsFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\") and @tabindex=\"0\"][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//li[text()=\"ALTER E-SOCIAL S1200\"]")
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
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão do Leiaute\")]")
	public WebElement versao;
	
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
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button")
	public WebElement buscarSeparadores;
	
	@FindBy(xpath = "//span[text()=\"Separadores\"]")
	public WebElement separadores;
	
	@FindBy(xpath = "//input[@placeholder=\"Sem separador\"]")
	public WebElement separador;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement incluirInicio;
	
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement incluirFinal;
	
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Bloco\")]")
	public WebElement nomeBloco;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Registro\")]")
	public WebElement nomeRegistro;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajustesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"][1]")
	public WebElement ajustes;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_COMPANY\"]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_BRANCH\"]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//li[@data-hananame=\"DT_LANC\"]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//li[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento do SPED\"]")
	public WebElement mapeamentoSPED;
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div/div[2]")
	public WebElement selecionarBloco;
	
	@FindBy(xpath = "//li[text()=\"Bloco 1\"]")
	public WebElement selecionarBlocoO;
	
	@FindBy(xpath = "//div[@class=\"record-select\"]/div/div/div[2]")
	public WebElement selecionarRegistro;
	
	@FindBy(xpath = "//li[text()=\"1200\"]")
	public WebElement selecionarRegistroO;
	
	@FindBy(xpath = "//li[contains(text(),\"empresa\")]")
	public WebElement selecionarEmpresa;
	
	@FindBy(xpath = "//li[contains(text(),\"filial\")]")
	public WebElement selecionarFilial;
	
	@FindBy(xpath = "//li[contains(text(),\"lançamento\")]")
	public WebElement selecionarDataLancamento;
	
	@FindBy(xpath = "//li[contains(text(),\"ajuste\")]")
	public WebElement selecionarValorAjuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	
	//BRE
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nomeRegra;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tipoRegra;
	
	@FindBy(xpath = "//li[text()=\"Auditoria Nvl 3\"]")
	public WebElement tipoRegraO;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componenteTQ1;
	
	@FindBy(xpath = "//li[text()=\"DFG\"]")
	public WebElement componenteO;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupoEstruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaRO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaROTP1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estruturaRO;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristica;
	
	@FindBy(xpath = "//li[text()=\"Toda a Obrigação\"]")
	public WebElement caracterisiticaO;
	
	@FindBy(xpath = "//td[@class=\"layout-field\"]/div/div/div[2]")
	public WebElement leiauteR;
	
	@FindBy(xpath = "//td[@class=\"layoutVersion-field\"]/div/div/div[2]")
	public WebElement versaoLeiauteR;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoLeiauteRO;
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div/input")
	public WebElement dataVigenciaR;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//input[@placeholder=\"Código\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Embasamento\"]")
	public WebElement embasamento;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement condicao1;
	
	@FindBy(xpath = "//li[contains(text(),\"Código da empresa\")]")
	public WebElement condicao1O;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div/div/div[2]")
	public WebElement condicao2;
	
	@FindBy(xpath = "//div[contains(text(),\"≠\")]")
	public WebElement condicao2O;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement condicao3;
	
	@FindBy(xpath = "//li[contains(text(),\"Código da filial\")]")
	public WebElement condicao3O;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div[2]/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div[2]/div[2]/div/div[1]/div/div/div/div/div/input")
	public WebElement acoesTQ1;
	
	
	

	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	
	
	//DFG
	
	@FindBy(xpath = "//span[contains(@class,\"icon-setting\")]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raizArquivos;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raizConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi-calculationBlocks\"]")
	public WebElement blocosApuracao;
	
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement leiauteE;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versaoE;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributoE;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[contains(@id,\"0001\")]/div/label/span")
	public WebElement filialEO;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaE;
	
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
	
	//DFG AN3
	
	@FindBy(xpath = "//div[@id=\"executarArquivo\"]/div[3]/div[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement ufFilialB;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufFilialBO;
	
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
	
	@FindBy(xpath = "//ul[@class=\"library-toolbar-items\"]/li[1]/button")
	public WebElement executarB;
	
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
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div[2]")
	public WebElement empresaDFG;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaDFGO;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div[2]")
	public WebElement filialDFG;
	
	@FindBy(xpath = "//div[@id=\"0001\"]/div/label/span")
	public WebElement filialDFGO;
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
	public WebElement lixeiraDFGConf;
	
	
	
	//DFG AN3
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][5]")
	public WebElement dfgAN3;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeAN3;
	
	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement dfgAN3Raiz;
	
	@FindBy(xpath = "//div[@class=\"inputs layout-dfg-select\"]/div/div/div[2]")
	public WebElement leiauteAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs setting-dfg-select\"]/div/div/div[2]")
	public WebElement configuracaoAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs rule-select\"]/div/div/div[2]")
	public WebElement regraAN3;
	
	@FindBy(xpath = "//div[@id=\"inputfile\"]/div/div/div[2]")
	public WebElement arquivoAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-an3\"]")
	public WebElement publicosAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-an3\"]")
	public WebElement meusAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-favorite-an3\"]")
	public WebElement meusFavoritos;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-addfolder\")]")
	public WebElement criarPasta;
	
	@FindBy(xpath = "//div[@class=\"folder-name\"]/div/div/input")
	public WebElement nomePasta;

	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div/div/div[1]")
	public WebElement expandirPasta;
	
	@FindBy(xpath = "//span[text()=\"Pasta 2\"]")
	public WebElement pasta2;
	
	@FindBy(xpath = "//span[text()=\"Pasta 1\"]")
	public WebElement pasta1;
	
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-folder\"]")
	public WebElement moverPasta;
	
	@FindBy(xpath = "//button[text()=\"Mover\"]")
	public WebElement mover;
	
	@FindBy(xpath = "//div[@class=\"folder-to\"]/div/div/div[2]")
	public WebElement moverPara;
	
	@FindBy(xpath = "//li[text()=\"Pasta 1\"]")
	public WebElement pasta1O;
	
	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div/div[2]/div/div[1]/div[1]")
	public WebElement expandirPasta1;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-foldersetting\")]")
	public WebElement gerenciarPasta;
	
	
	@FindBy(xpath = "//button[text()=\"Atualizar\"]")
	public WebElement atualizarB;
	
	@FindBy(xpath = "//button[text()=\"Excluir Pasta\"]")
	public WebElement excluirPasta;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-layout\")]")
	public WebElement leiauteAba;
	
	@FindBy(xpath = "//li[text()=\"DCTF\"]")
	public WebElement tipoOTC2;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	
	
	public AN3FuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2 = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro DFG (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado AN3");
		sleep(1000);
		actionsMoveToElementElement(versao);
		sleep(1000);
		tipo.click();
		sleep(1000);
		if (tc2 == true) {
			tipoOTC2.click();
		}else {
			tipoO.click();
		}
		
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaTP1O.click();
		}else {
			grupoEstruturaO.click();
		}
		
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		estruturaO.click();
		sleep(1000);
		estruturaO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versao.sendKeys("1");
		sleep(1000);
		salvar.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(gravar);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		while(!separadores.isDisplayed()) {
			buscarSeparadores.click();
		}
		
		separadores.click();
		sleep(2000);
		waitExpectElement(aplicar);
		sleep(2000);
		separador.sendKeys("|");
		sleep(1000);
		
		incluirInicio.click();
		sleep(1000);
		incluirFinal.click();
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		waitExpectElement(adicionarRegistro);
		sleep(1000);
		adicionarRegistro.click();
		sleep(2000);
		
		nomeBloco.sendKeys("Bloco 1");
		sleep(1000);
		nomeRegistro.sendKeys("1200");
		sleep(1000);
		
		
		ajustesFiscais.click();
		sleep(2000);
		ajustes.click();
		sleep(2000);
		
		moveToElement(codigoEmpresa,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		moveToElement(codigoFilial,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		actionsMoveToElementElement(dataLancamento);
		sleep(500);
		moveToElement(dataLancamento,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(500);
		actionsMoveToElementElement(valorAjuste);
		moveToElement(valorAjuste,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro (Raiz): " + ultimoIdDC);
		
		
		idInserir2(ultimoIdDC);

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verificaçãõ da criação do registro: " +sucesso.get(0));
		
		String versao = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[6]/div")).getText();
		String nome = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[7]/div")).getText();;
		String tipoS = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[9]/div")).getText();;
		
		System.out.println("----------------------Verficação das informações do registro ---------------------------");
		System.out.println("Versão: " +versao);
		System.out.println("Nome: " +nome);
		System.out.println("Tipo: " +tipoS);
		
		sucesso.add(versao.equals("1.0"));
		sucesso.add(nome.equals("Teste Automatizado AN3"));
		
		if(tc2) {			
			sucesso.add(tipoS.equals("DCTF"));
		}else {
			sucesso.add(tipoS.equals("ALTER E-SOCIAL S1200"));
		}		
		
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		System.out.println(sucesso);
		
		return sucesso;

		
	}
	
	
	
	public ArrayList<Boolean> BRE() {
	
		
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
		
		
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id antes da criação do registro (BRE): " + ultimoIdAC);
		idInserir1(ultimoIdAC);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nomeRegra);
		sleep(2000);
		
		nomeRegra.sendKeys("Teste Automatizado DFG AN3");
		sleep(1000);
		
		
		tipoRegra.click();
		sleep(1000);
		tipoRegraO.click();
		sleep(2000);
		
		
		if (tc2 == true) {
			componenteTQ1.click();
		}else if (tp1==true ) {
			componente.click();
		}else {
			componenteTQ1.click();
		}
		
		sleep(1000);
		componenteO.click();
		sleep(1000);
		
		actionsMoveToElementElement(dataVigenciaR);
		
		sleep(1000);
		
		tributo.click();
		sleep(1000);
		tributoO.click();
		sleep(1000);
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		grupoEstruturaR.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaROTP1.click();
		}else {
			grupoEstruturaRO.click();
		}
		
		
		sleep(1000);
		
		estruturaR.click();
		sleep(1000);
		estruturaRO.click();
		sleep(8000);
		
		caracteristica.click();
		sleep(1000);
		caracterisiticaO.click();
		sleep(3000);
		actionsMoveToElementElement(dataVigenciaR);
		sleep(1000);
		
		waitExpectElement(leiauteR);
		leiauteR.click();
		sleep(1000);
		actionsMoveToElementXpath("//li[contains(text(),\""+idObter2()+"\")]");
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(1000);
		
		versaoLeiauteR.click();
		sleep(1000);
		versaoLeiauteRO.click();
		sleep(9000);
		
		dataVigenciaR.sendKeys("01/01/2013");
		sleep(6000);
		aplicar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(adicionarCaminho);
		sleep(20000);
		
		
		adicionarCaminho.click();
		sleep(3000);
		waitExpectElement(codigo);
		sleep(2000);
		
		codigo.sendKeys("R1");
		sleep(1000);
		embasamento.sendKeys("1");
		sleep(1000);
		
		condicao1.click();
		sleep(1000);
		condicao1O.click();
		sleep(1000);
		
		condicao2.click();
		sleep(1000);
		condicao2O.click();
		sleep(1000);
		
		condicao3.click();
		sleep(1000);
		condicao3O.click();
		sleep(1000);
		
		if (tq1 == true) {
			acoesTQ1.sendKeys("TESTE");
			acoesTQ1.sendKeys(Keys.ENTER);
			sleep(1000);
		}else {
			acoes.sendKeys("TESTE");
			acoes.sendKeys(Keys.ENTER);
			sleep(1000);
		}

		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id após da criação do registro (BRE): " + ultimoIdDC);
		idInserir3(ultimoIdDC);
		
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}
		
		System.out.println("Verificaçãõ da criação do registro BRE: " +sucesso.get(0));
		
		String titulo = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[4]/div")).getText();
		String tipoRegra = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[6]/div")).getText();;
		String tributoS = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[7]/div")).getText();;
		
		System.out.println("----------------------Verficação das informações do registro ---------------------------");
		System.out.println("Título: " +titulo);
		System.out.println("Tipo Regra: " +tipoRegra);
		System.out.println("Tributo: " +tributoS);
		
		sucesso.add(titulo.equals("Teste Automatizado DFG AN3"));
		sucesso.add(tipoRegra.equals("AN3"));
		sucesso.add(tributoS.equals("ICMS"));
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
	}
	
	
	
	public ArrayList<Boolean> DFG() {
		
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		sleep(2000);

		arquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raizArquivos.click();
		
		
		invisibilityOfElementOverlay();

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdArquivosAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Ultimo ID (Arquivos): "+ ultimoIdArquivosAC);
		
		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdConfiguracoesAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id antes da criação (configuracoes): "+ ultimoIdConfiguracoesAC);

		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		nome.sendKeys("Teste Automatizado Conf AN3");
		sleep(2000);
		
		leiauteE.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
		sleep(1000);
		
		versaoE.click();
		sleep(1000);
		versaoEO.click();
		sleep(1000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		tributoE.click();
		sleep(1000);
		tributoEO.click();
		sleep(1000);
		
		empresaE.click();
		sleep(1000);
		empresaEO.click();
		sleep(1000);
		empresaEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		ufE.click();
		sleep(1000);
		ufEO.click();
		sleep(1000);
		ufEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		filialE.click();
		sleep(1000);
		filialEO.click();
		sleep(1000);
		filialEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigenciaE.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id após da criação (DFG Configuracoes): "+ ultimoIdDC);
		idInserir4(ultimoIdDC);
		
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdConfiguracoesAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}
		
		System.out.println("Verificaçãõ da criação do registro BRE: " +sucesso.get(0));
		
		System.out.println("---------------------Verificações das Informações---------------------------------");
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[6]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[9]/div/li")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[10]/div/li")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[11]/div/li")).getText();
		String tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[12]/div/li")).getText();
		String dataVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[13]/div")).getText();
		
		System.out.println(nome);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(dataVigencia);
		
		
		sucesso.add(nome.contains("Teste Automatizado"));
		sucesso.add(empresa.contains("1000"));
		sucesso.add(uf.contains("SP"));
		sucesso.add(filial.contains("0001"));
		sucesso.add(tributo.contains("ICMS"));
		sucesso.add(dataVigencia.contains("01/01/2013"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	

	
	public ArrayList<Boolean> execucao() {
		
		String idRegistro = idObter4();
		String idRegra = idObter3();
		/*
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		//hasta aqui
		*/
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectElement(executar);
		sleep(2000);
		
		ufFilialB.click();
		sleep(1000);
		ufFilialBO.click();
		sleep(1000);
		ufFilialBO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		centralizacao.click();
		sleep(1000);
		
		calendario.click();
		sleep(3000);
		sleep(2000);
		atras.click();
		sleep(1000);
		ano2016.click();
		sleep(2000);
		sleep(2000);
		jan.click();
		sleep(2000);sleep(2000);
		m1.click();
		sleep(3000);
		executarConf.click();
		sleep(3000);
		
		
		waitExpectXpath("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		
		int aparece = rows("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		if (aparece > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		sleep(2000);
		
	//	no.click();
		sleep(8000);
		
		executarB.click();
		sleep(2000);
		no.click();
		sleep(2000);
		waitExpectXpath("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aparece = rows("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		if (aparece > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		sleep(2000);
		
		int linhas = rows("//ul[@class=\"ul\"]/li");
		System.out.println(linhas);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (linhas > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verficação linhas: " +sucesso.get(0));
		
		gravar.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		int enviado = rows("//span[contains(text(),\"Arquivo emitido com sucesso\")]");
		System.out.println(enviado);

		
		if (enviado > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println("Verficação mensagem: " +sucesso.get(1));
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		return sucesso;


		
	}
	
	
	public ArrayList<Boolean> arquivos() {
		/*
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		//hasta aqui
		*/
		
		String idRegistro = idObter4();
		arquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raizArquivos.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		int f=1;
		System.out.println("--------------------------Verificação Visualização----------------------------------------");
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Ultimo Id (Arquivos): " + id);
		idInserir5(id);
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();	
		String tipo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[9]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[10]/div")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[11]/div")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[12]/div")).getText();
		String ano = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[13]/div")).getText();
		String mes = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[14]/div")).getText();
		String periodo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[15]/div")).getText();
		
		
		System.out.println(nome);
		System.out.println(tipo);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(periodo);
		
		sucesso.add(nome.contains("Teste Automatizado Conf AN3"));
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("tc2")){
			sucesso.add(tipo.equals("DCTF"));
		}else {
			sucesso.add(tipo.equals("ALTER E-SOCIAL S1200"));
		}
		
		sucesso.add(empresa.equals("1000"));
		sucesso.add(uf.equals("SP"));
		sucesso.add(filial.equals("0001"));
		sucesso.add(ano.equals("2016"));
		sucesso.add(mes.equals("12,01"));
		sucesso.add(periodo.equals("1M"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
	}
	
	public ArrayList<Boolean> DFGAN3() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		String idRegistro = idObter2();
		/*
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		//hasta aqui
		*/
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		dfgAN3Raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAN3AC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id DFG AN3 antes da criação: " +idAN3AC);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nomeAN3);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		nomeAN3.sendKeys("Teste Automatizado DFG AN3");
		sleep(1000);
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		if (tc2 == true) {
			tipoOTC2.click();
		}else {
			tipoO.click();
		}
		sleep(1000);
		
		sleep(1000);
		
		attributeToBeXpath("//div[@class=\"inputs layout-dfg-select\"]/div", "class", "base-select required");
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		sleep(1000);
		
		
		leiauteAN3.click();
		sleep(1000);
		WebElement leiauteAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));
		leiauteAN3O.click();
		
		sleep(1000);
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		sleep(2000);
		
		versaoAN3.click();
		sleep(1000);
		versaoEO.click();
		
		sleep(1000);
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		attributeToBeXpath("//div[@class=\"inputs setting-dfg-select\"]/div", "class", "base-select ");
		sleep(2000);
		
		configuracaoAN3.click();
		sleep(1000);
		WebElement confAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idObter4()+"\")]"));
		confAN3O.click();
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		sleep(2000);
		
		regraAN3.click();
		sleep(1000);
		WebElement regraAN3O = driver.findElement(By.xpath("//div[@id=\""+idObter3()+"\"]/div/label/span"));
		regraAN3O.click();
		sleep(1000);
		regraAN3O.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementXpath("//div[@id=\"inputfile\"]/div/div/div[2]");
		sleep(2000);
		
		arquivoAN3.click();
		sleep(1000);
		WebElement arquivoAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idObter5()+"\")]"));
		arquivoAN3O.click();
		sleep(1000);
		
		criar.click();
		
		
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		dfgAN3Raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAN3DC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id DFG AN3 antes da criação: " +idAN3DC);
		idInserir6(idAN3DC);
		System.out.println("-----------------------------------Verificação da criação--------------------------------");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int idAN3ACI = convertToInt(idAN3AC);
		int idAN3DCI = convertToInt(idAN3DC);
		
		
		if (idAN3ACI < idAN3DCI ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println("Verfificão do ultimo ID: " + sucesso.get(0));
		
		System.out.println("-----------------------------------Verificação das informações--------------------------------");
		
		
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();	
		String origem = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[8]/div")).getText();
		String arquivos = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[9]/div")).getText();
		String regras = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[11]/div/li")).getText();

		
		System.out.println(nome);
		System.out.println(origem);
		System.out.println(arquivos);
		System.out.println(regras);

		
		sucesso.add(nome.contains("Teste Automatizado DFG AN3"));
		sucesso.add(origem.equals("Digital File Generator"));
		sucesso.add(arquivos.contains("Teste Automatizado Conf AN3"));
		sucesso.add(regras.equals("Teste Automatizado DFG AN3"));

		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}
	
	
	public boolean publicoYPrivado() {
		
		String idRegistro = idObter6();
		
		/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		dfgAN3Raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		//hasta aqui
		*/
		
		sleep(2000);
		
		WebElement publico = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[4]/span"));
		
		sleep(1000);
		
		publico.click();
		sleep(1000);
		waitExpectElement(aplicar);
		sleep(1000);
		aplicar.click();
		invisibilityOfElementOverlay();
		
		publicosAN3.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int presente = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		
		System.out.println(presente);
		boolean sucesso = false;
		
		
		if (presente ==1) {
			sucesso = true;
		}
		
		
		return sucesso;
	}
	
	
	public ArrayList<Boolean> favorito() {
		
		String idRegistro = idObter6();
		
/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		dfgAN3Raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
	
		
		publicosAN3.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		//hasta aqui
		*/
		sleep(2000);
		
		WebElement favorito = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[3]/span"));
		
		sleep(1000);
		
		favorito.click();
		
		invisibilityOfElementOverlay();
		
		int enviadoFavorito = rows("//span[contains(text(),\"O arquivo foi marcado como favorito com sucesso\")]");
		System.out.println("----------------------------Verificacion enviado a Favorito------------------------------");
		System.out.println("Enviado a favoritos: " +enviadoFavorito);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		if (enviadoFavorito ==1) {
			
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println("Enviado Favorito: " +sucesso.get(0));
		
		
		
		meusAN3.click();
		sleep(1000);
		
		meusFavoritos.click();
		
		invisibilityOfElementOverlay();
		
		pesquisar.sendKeys(idObter6());
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		int presente = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		System.out.println("Verificação Pasta Favorito: " +presente);
		
		
		if (presente ==1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println("Verificação Pasta Favorito: " +sucesso.get(1));
		
		return sucesso;
		
	}
	
	
	public boolean editar() {
		
		String idRegistro = idObter6();
		/*

		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		meusAN3.click();
		sleep(1000);
		
		meusFavoritos.click();
		
		invisibilityOfElementOverlay();
		
		pesquisar.sendKeys(idObter6());
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		//hasta aqui
		*/
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editarM = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		sleep(1000);
		
		menu.click();
		sleep(1000);
		editarM.click();

		waitExpectElement(descricao);
		invisibilityOfElementOverlay();
		
		String enviar = "Teste Editar";
		descricao.clear();
		descricao.sendKeys(enviar);
		sleep(1000);
		
		editar.click();
		
		invisibilityOfElementOverlay();
		
		pesquisar.clear();
		pesquisar.sendKeys(idObter6());
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		editarM = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
		sleep(1000);
			
		menu.click();
		sleep(1000);
		editarM.click();
		
		waitExpectElement(descricao);
		invisibilityOfElementOverlay();
		
		System.out.println("-----------------------------Verificacão do texto após a Edicação");
		String textoCampo = descricao.getAttribute("value");
		System.out.println("Texto do campo:" + textoCampo);
		
		boolean sucesso = textoCampo.equals(enviar);
		
		System.out.println("Campo Editado: " + sucesso);
		fechar.click();
		sleep(2000);
		return sucesso;
		
		
		
	}
	
	public boolean informacao() {
		
		String idRegistro = idObter6();
		/*

		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		meusAN3.click();
		sleep(1000);
		
		meusFavoritos.click();
		
		invisibilityOfElementOverlay();
		
		pesquisar.sendKeys(idObter6());
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		//hasta aqui
		*/
		
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement informacao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		sleep(1000);
		
		menu.click();
		sleep(1000);
		informacao.click();
		
		invisibilityOfElementOverlay();
		System.out.println("----------------------------Verificação Informações--------------------------");
		String textoInformacao = descricaoI.getText();
		System.out.println("Descrição Informação: " +textoInformacao);
		
		boolean sucesso = textoInformacao.equals("Teste Editar");
		System.out.println("Descrição Igual: " + sucesso);
		
		
		
		fecharInformacoes.click();
		sleep(2000);
		
		
		return sucesso;
		
		
		
	}
	
	public boolean criarPasta() {
		

/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		//hasta aqui
		*/
		
		dfgAN3Raiz.click();
		
		invisibilityOfElementOverlay();
		
		criarPasta.click();
		sleep(1000);
		waitExpectElement(nomePasta);
		sleep(2000);
		
		nomePasta.sendKeys("Pasta 1");
		sleep(1000);
		
		criar.click();
		
		invisibilityOfElementOverlay();
		
		expandirPasta.click();
		sleep(2000);
		
		dfgAN3Raiz.click();
		
		invisibilityOfElementOverlay();
		
		criarPasta.click();
		sleep(1000);
		waitExpectElement(nomePasta);
		sleep(2000);
		
		nomePasta.sendKeys("Pasta 2");
		sleep(1000);
		
		criar.click();
		
		invisibilityOfElementOverlay();
		
		expandirPasta.click();
		sleep(2000);
		System.out.println("---------------------------Verficiação Criação das Pastas-----------------------");
		int pasta1 = rows("//span[text()=\"Pasta 1\"]");
		int pasta2 = rows("//span[text()=\"Pasta 2\"]");
		System.out.println("Pasta 1: " + pasta1);
		System.out.println("Pasta 2: " + pasta2);
		boolean sucesso = false;
		
		if (pasta1 == 1 && pasta2== 1) {
			sucesso = true;
		}
		
		System.out.println("Pastas criadas: " +sucesso);
		return sucesso;
		
		
		
	}
	
	public boolean moverPasta() {
		

/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		//hasta aqui
		
		
		expandirPasta.click();
		sleep(2000);
		*/
		pasta2.click();
		invisibilityOfElementOverlay();
		
		moverPasta.click();
		sleep(1000);
		waitExpectElement(mover);
		sleep(2000);
		
		moverPara.click();
		sleep(1000);
		pasta1O.click();
		sleep(1000);
		
		mover.click();
		
		invisibilityOfElementOverlay();
		
		int movido = rows("//span[contains(text(),\"Pasta movida com sucesso\")]");
		boolean sucesso = false;
		System.out.println("-------------------------------Verificação da pasta movida----------------------");
		System.out.println("Pasta movida: " + movido);
		
		if(movido == 1) {
			sucesso = true;
		}
		
		System.out.println("Pasta foi movida: " + sucesso);
		return sucesso;
		
		
		
		
		
		
	}
	
	
	public ArrayList<Boolean> criarAN3Pasta2() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		//hasta aqui
		
		
		expandirPasta.click();
		sleep(2000);
		expandirPasta1.click();
		sleep(2000);
		
		
		pasta2.click();
		invisibilityOfElementOverlay();
		
		novo.click();
		sleep(3000);
		waitExpectElement(nomeAN3);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		nomeAN3.sendKeys("Teste Automatizado DFG AN3");
		sleep(1000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Origem\"]");
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		if (tc2 == true) {
			tipoOTC2.click();
		}else {
			tipoO.click();
		}
		sleep(1000);
		
		sleep(1000);
		attributeToBeXpath("//div[@class=\"inputs layout-dfg-select\"]/div", "class", "base-select required");
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Origem\"]");

		sleep(1000);
		
		
		leiauteAN3.click();
		sleep(1000);
		WebElement leiauteAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		actionsMoveToElementElement(leiauteAN3O);
		leiauteAN3O.click();
		sleep(1000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Origem\"]");
		sleep(1000);
		
		versaoAN3.click();
		sleep(1000);
		versaoEO.click();
		
		sleep(1000);
		attributeToBeXpath("//div[@class=\"inputs setting-dfg-select\"]/div", "class", "base-select ");
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Origem\"]");
		sleep(2000);
		
		configuracaoAN3.click();
		sleep(1000);
		WebElement confAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idObter4()+"\")]"));
		confAN3O.click();
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Origem\"]");
		sleep(1000);
		
		regraAN3.click();
		sleep(1000);
		WebElement regraAN3O = driver.findElement(By.xpath("//div[@id=\""+idObter3()+"\"]/div/label/span"));
		regraAN3O.click();
		sleep(1000);
		regraAN3O.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Arquivo Digital\"]");
		sleep(1000);
		
		arquivoAN3.click();
		sleep(1000);
		WebElement arquivoAN3O = driver.findElement(By.xpath("//li[contains(text(),\""+idObter5()+"\")]"));
		arquivoAN3O.click();
		sleep(1000);
		
		criar.click();
		
		invisibilityOfElementOverlay();
		
		pasta2.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		
		System.out.println("-----------------------------------Verificação das informações--------------------------------");
		
		
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();	
		String origem = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[8]/div")).getText();
		String arquivos = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[9]/div")).getText();
		String regras = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[11]/div/li")).getText();

		
		System.out.println(nome);
		System.out.println(origem);
		System.out.println(arquivos);
		System.out.println(regras);

		
		sucesso.add(nome.contains("Teste Automatizado DFG AN3"));
		sucesso.add(origem.equals("Digital File Generator"));
		sucesso.add(arquivos.contains("Teste Automatizado Conf AN3"));
		sucesso.add(regras.equals("Teste Automatizado DFG AN3"));

		System.out.println(sucesso);
		
		
		return sucesso;
		
		
		
		
	}
	
	
	public boolean editarAN3Pasta2() {
		/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		
		
		expandirPasta.click();
		sleep(2000);
		expandirPasta1.click();
		sleep(2000);
		
		
		pasta2.click();
		invisibilityOfElementOverlay();
		//hasta aqui
		*/
		gerenciarPasta.click();
		sleep(1000);
		waitExpectElement(nomePasta);
		sleep(2000);
		
		nomePasta.clear();
		nomePasta.sendKeys("Pasta Teste");
		
		atualizarB.click();
		
		invisibilityOfElementOverlay();
		
		expandirPasta.click();
		sleep(2000);
		expandirPasta1.click();
		sleep(2000);
		
		System.out.println("----------------------------Verificação da Edição da Pasta");
		int pasta2 = rows("//span[text()=\"Pasta Teste\"]");
		System.out.println("Verificação da Edição da Pasta: "+pasta2);
		boolean sucesso = false;
		if (pasta2 == 1) {
			sucesso = true;
		}
		
		return sucesso;
		
		
		
	}
	
	
	
	public boolean excluirPasta() {
	/*
		sleep(2000);
		dfgAN3.click();
		
		invisibilityOfElementOverlay();
		
		expandirPasta.click();
		sleep(2000);
		
		//hasta aqui
		*/
		pasta1.click();
		invisibilityOfElementOverlay();

		
		gerenciarPasta.click();
		sleep(1000);
		waitExpectElement(nomePasta);
		sleep(2000);
		
		excluirPasta.click();
		sleep(1000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"an3Folders-wrapper\"]/div/div/div/div[1]/div");
		System.out.println("----------------------------Verficação da Exclusão da Pasta-------------------------");
		System.out.println("Verificação da Exclusão da pasta: " + rows);
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso = true;
		}
		
		System.out.println("Pasta Excluida: "+sucesso);
		
		return sucesso;
		
		
		
		
		
	}
	
	

	
	public ArrayList<Boolean> excluirDFGConf() {
		
		String idRegistro = idObter4();
		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		
		raizConfiguracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraDFGConf.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement excluir = driver.findElement(By.xpath("//li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		lixeiraDFGConf.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> excluirDFG() {
		
		String idRegistro = idObter2();
		
		
		leiauteAba.click();
		
		invisibilityOfElementOverlay();
		
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement lixeira = driver.findElement(By.xpath("//li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraDFG.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement excluir = driver.findElement(By.xpath("//li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lixeiraDFG.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> excluirBRE() {
		
		String idRegistro = idObter3();
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		
		acessarBREPO.acessarBRE();
		
		sleep(2000);
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter3());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement lixeira = driver.findElement(By.xpath("//li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraBRE.click();
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
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lixeiraBRE.click();
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
		
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	
}
