package com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class ContribuiçõesFuncionalidadesPO extends TestBaseSteven{
	

	
	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")
	public WebElement fecharMensagem;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
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
	public WebElement componenteTC2;
	
	
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
	
	@FindBy(xpath = "//li[@id=\"option-17\"]")
	public WebElement grupoEstruturaROTC2;
	
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
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateTo\"]/div/div/input")
	public WebElement dataVigenciato;
	
	
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
	

	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	
	
	//DFG
	
	@FindBy(xpath = "//span[contains(@class,\"icon-gooddoc\")]")
	public WebElement sped;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[2]")
	public WebElement efd;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[2]/ul/li[1]")
	public WebElement efdO;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[2]/ul/li[2]/div/span[2]")
	public WebElement blocosApuracao;
	
	
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiauteE;
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoE;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoEO;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoE;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoEO;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaEO;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufEO;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
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
	
	//Bloco Apuração
	
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
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	
	@FindBy(xpath = "//table[@class=\"Contributions-form\"]/tbody/tr[10]/td/div/div/div[@id=\"select\"]")
	public WebElement tipoE;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement tiopEo;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div[2]")
	public WebElement filialDFG;
	
	@FindBy(xpath = "//div[@id=\"0001\"]/div/label/span")
	public WebElement filialDFGO;
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div[2]")
	public WebElement empresaDFG;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaDFGO;
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	public ContribuiçõesFuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
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
		System.out.println("Último Id antes da criação do registro (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado QA Cristhian");
		sleep(1000);
		actionsMoveToElementElement(versao);
		sleep(1000);
		tipo.click();
		sleep(1000);
		tipoO.click();
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

		while(!mapeamentoSPED.isDisplayed()) {
			buscarSeparadores.click();
			sleep(500);
		}
		
		mapeamentoSPED.click();
		sleep(3000);
		
		selecionarBloco.click();
		sleep(1000);
		selecionarBlocoO.click();
		sleep(1000);
		
		selecionarRegistro.click();
		sleep(1000);
		selecionarRegistroO.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int f = 1;
		for (int i = 0; i < 6; i++) {
			
			WebElement abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"]["+f+"]/div[1]/div/div[2]"));
			
			abrirComboBox.click();
			sleep(1000);
			selecionarEmpresa.click();
			sleep(1000);
			
			f++;
				
		}
		
		WebElement valorA = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][10]/div[1]/div/div[1]/input"));
		actionsMoveToElementElement(valorA);
		WebElement abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][7]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarFilial.click();
		
	
		abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][8]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarDataLancamento.click();
		
		
		abrirComboBox = driver.findElement(By.xpath("//div[@class=\"row-mapping\"][9]/div[1]/div/div[2]"));
		abrirComboBox.click();
		sleep(1000);
		selecionarValorAjuste.click();
		

		actionsMoveToElementElement(valorA);
		valorA.sendKeys("Valor");
		sleep(1000);
		valorA.sendKeys(Keys.ENTER);
		
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
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
	
		System.out.println(sucesso);
		
		return sucesso;

		
	}

	
	public boolean BRE() {
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}	
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		
		acessarBREPO.acessarBRE();
		
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
		
		nomeRegra.sendKeys("Teste Automatizado DFG Ken Prueba");
		sleep(1000);
		
		
		tipoRegra.click();
		sleep(1000);
		tipoRegraO.click();
		sleep(1000);
		
		if (tc2 == true) {
			componenteTC2.click();
			sleep(1000);
			componenteO.click();
			sleep(1000);
		}else if (tq1 == true) {
			componente.click();
			sleep(1000);
			componenteO.click();
			sleep(1000);
		}else if (tp1 == true){
			componenteTC2.click();
			sleep(1000);
			componenteO.click();
			sleep(1000);
		}
		
		
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
		
		if (tq1 == true) {
			
			actionsMoveToElementElement(grupoEstruturaROTC2);
			grupoEstruturaROTC2.click();
			
		}else if (tp1 == true) {
		
			grupoEstruturaROTP1.click();
			
		}else if (tc2 == true) {
			grupoEstruturaRO.click();
		}
		
		
		sleep(1000);
		
		estruturaR.click();
		sleep(1000);
		estruturaRO.click();
		sleep(1000);
		
		caracteristica.click();
		sleep(1000);
		caracterisiticaO.click();
		sleep(3000);
		actionsMoveToElementElement(dataVigenciaR);
		waitExpectElement(leiauteR);
		sleep(3000);
		
		leiauteR.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(1000);
		
		versaoLeiauteR.click();
		sleep(1000);
		versaoLeiauteRO.click();
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementElement(dataVigenciato);
		sleep(2000);
		
		dataVigenciaR.sendKeys("01/01/2013");
		sleep(2000);
		aplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
		
		acoes.sendKeys("TESTE");
		acoes.sendKeys(Keys.ENTER);
		sleep(1000);
		
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
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
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

		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		efd.click();
		sleep(2000);
		efdO.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String ultimoIdAC = "0";
		if(rows > 0) {
			ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id antes da criação (DFG SPED EFD): "+ ultimoIdAC);
		} 
		
		blocosApuracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		System.out.println("Dio click en primera pagina");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		System.out.println("Dio click en ultima pagina");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		String ultimoIdACB = "0";
		if(rows > 0) {
			ultimoIdACB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id antes da criação (DFG SPED Bloco): "+ ultimoIdACB);
		}  
		
		sleep(2000);
		efdO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		sleep(2000); 
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		leiauteE.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
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
		
		primeira.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação (DFG SPED EFD): "+ ultimoIdDC);
		idInserir4(ultimoIdDC);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		String tipo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[6]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[10]/div/li")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[11]/div/li")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[12]/div/li")).getText();
		String tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[13]/div/li")).getText();
		String dataVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[14]/div")).getText();
		
		System.out.println(nome);
		System.out.println(tipo);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(dataVigencia);
		
		
		//sucesso.add(nome.contains("Teste Automatizado"));
		//sucesso.add(tipo.contains("EFD ICMS / IPI"));
		sucesso.add(empresa.contains("1000"));
//		sucesso.add(uf.contains("SP"));
//		sucesso.add(filial.contains("0001"));
		sucesso.add(tributo.contains("ICMS"));
		//sucesso.add(dataVigencia.contains("01/01/2013"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	
	public boolean editarDFG() {
		
		String idRegistro = idObter4();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editarR = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editarR.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		descricao.clear();
		sleep(1000);
		String enviar = "Teste Editar";
		descricao.sendKeys(enviar);
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String editado = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[5]/div")).getText();
		System.out.println("Edição do Campo: " + editado);
		boolean sucesso = editado.equals(enviar);
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
		
	}
	
	public ArrayList<Boolean> informacao() {
		
		String idRegistro = idObter4();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String descricaoI1 = descricaoI.getText();
		System.out.println(descricaoI1);
		
		fecharInformacoes.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("----------------------Visualizações----------------------------------");
		String descricaoV1 = descricao.getAttribute("value");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(descricaoI1.equals(descricaoV1));
		System.out.println("Verificação Informação - Visualização: " + sucesso);
		
		String nomeV1 = nomeV.getAttribute("value");
		String descricaoV11 = descricaoV.getAttribute("value");
		String leiauteV1 = leiauteV.getAttribute("value");
		String versaoV1 = versaoV.getAttribute("value");
		String tributoV1 = tributoV.getAttribute("value");
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String dataVigenciaV1 = dataVigenciaV.getAttribute("value");
		
		
		System.out.println(nomeV1);
		System.out.println(descricaoV11);
		System.out.println(leiauteV1);
		System.out.println(versaoV1);
		System.out.println(tributoV1);
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(dataVigenciaV1);
		
		sucesso.add(nomeV1.equals("Teste Automatizado"));
		sucesso.add(descricaoV11.equals("Teste Editar"));
		sucesso.add(leiauteV1.contains("Teste Automatizado"));
		sucesso.add(versaoV1.contains("1.0"));
		sucesso.add(tributoV1.equals("ICMS"));
		sucesso.add(empresaV1.equals("1000"));
		sucesso.add(ufV1.equals("SP"));
		sucesso.add(filialV1.contains("0001"));
		sucesso.add(dataVigenciaV1.equals("01/01/2013"));
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editarR = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editarR.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("----------------------Edição----------------------------------");
		String nomeE1 = nomeV.getAttribute("value");
		String descricaoE1 = descricaoV.getAttribute("value");
		String leiauteE1 = leiauteV.getAttribute("value");
		String versaoE1 = versaoV.getAttribute("value");
		String tributoE1 = tributoV.getAttribute("value");
		String empresaE1 = empresaV.getText();
		String ufE1 = ufV.getText();
		String filialE1 = filialV.getText();
		String dataVigenciaE1 = dataVigenciaV.getAttribute("value");
		
		
		sucesso.add(nomeV1.equals(nomeE1));
		sucesso.add(descricaoV11.equals(descricaoE1));
		sucesso.add(leiauteV1.contains(leiauteE1));
		sucesso.add(versaoV1.contains(versaoE1));
		sucesso.add(tributoV1.equals(tributoE1));
		sucesso.add(empresaV1.equals(empresaE1));
		sucesso.add(ufV1.equals(ufE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(dataVigenciaV1.equals(dataVigenciaE1));
		
		System.out.println(sucesso);
		
		fechar.click();
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> blocoApuracao() {
		
		blocosApuracao.click();
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
		
		String idRegistro = idObter4();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String descricaoI1 = descricaoI.getText();
		System.out.println(descricaoI1);
		
		fecharInformacoes.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("----------------------Visualizações----------------------------------");
		String descricaoV1 = descricao.getAttribute("value");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(descricaoI1.equals(descricaoV1));
		System.out.println("Verificação Informação - Visualização: " + sucesso);
		
		String nomeV1 = nomeV.getAttribute("value");
		String descricaoV11 = descricaoV.getAttribute("value");
		String leiauteV1 = leiauteV.getAttribute("value");
		String versaoV1 = versaoV.getAttribute("value");
		String tributoV1 = tributoV.getAttribute("value");
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String dataVigenciaV1 = dataVigenciaV.getAttribute("value");
		
		
		System.out.println(nomeV1);
		System.out.println(descricaoV11);
		System.out.println(leiauteV1);
		System.out.println(versaoV1);
		System.out.println(tributoV1);
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(dataVigenciaV1);
		
		sucesso.add(nomeV1.equals("Teste Automatizado"));
		sucesso.add(descricaoV11.equals("Teste Editar"));
		sucesso.add(leiauteV1.contains("Teste Automatizado"));
		sucesso.add(versaoV1.contains("1.0"));
		sucesso.add(tributoV1.equals("ICMS"));
		sucesso.add(empresaV1.equals("1000"));
		sucesso.add(ufV1.equals("SP"));
		sucesso.add(filialV1.contains("0001"));
		sucesso.add(dataVigenciaV1.equals("01/01/2013"));
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editarR = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editarR.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("----------------------Edição----------------------------------");
		String nomeE1 = nomeV.getAttribute("value");
		String descricaoE1 = descricaoV.getAttribute("value");
		String leiauteE1 = leiauteV.getAttribute("value");
		String versaoE1 = versaoV.getAttribute("value");
		String tributoE1 = tributoV.getAttribute("value");
		String empresaE1 = empresaV.getText();
		String ufE1 = ufV.getText();
		String filialE1 = filialV.getText();
		String dataVigenciaE1 = dataVigenciaV.getAttribute("value");
		
		
		sucesso.add(nomeV1.equals(nomeE1));
		sucesso.add(descricaoV11.equals(descricaoE1));
		sucesso.add(leiauteV1.contains(leiauteE1));
		sucesso.add(versaoV1.contains(versaoE1));
		sucesso.add(tributoV1.equals(tributoE1));
		sucesso.add(empresaV1.equals(empresaE1));
		sucesso.add(ufV1.equals(ufE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(dataVigenciaV1.equals(dataVigenciaE1));
		
		System.out.println(sucesso);
		
		fechar.click();
		
		return sucesso;
		
		
		
		
		
	}
	
	public ArrayList<Boolean> execucao() {
		
		String idRegistro = idObter4();
		String idRegra = idObter3();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectElement(executar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
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
		sleep(3000);
		executarConf.click();
		sleep(3000);
		
		
		waitExpectXpath("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int aparece = rows("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		if (aparece > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		
		atualizarEstrutura.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		visualizarAN3.click();
		sleep(2000);
		waitExpectElement(criar);
		sleep(2000);
		
		nomeR.sendKeys("Teste Automatizado Regra DFG");
		sleep(100);
		regra.click();
		sleep(1000);
		
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
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(driver.findElement(By.xpath("//span[text()=\"Aprovar\"]")).isDisplayed());
		System.out.println(sucesso);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar Atualizações\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(2000);
		waitExpectElement(atualizar);
		sleep(2000);
		String fechaHoy = fechaActual();
		int rows = rows("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]");
		int f=1;
		System.out.println("--------------------------Verificação Modificações----------------------------------------");
		for (int i = 0; i < rows; i++) {
			
			String dataMod = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+f+"]/div[10]/div")).getText();
			System.out.println(dataMod);
			sucesso.add(dataMod.equals(fechaHoy));
		}
		
		System.out.println(sucesso);
		
		fechar.click();
		sleep(3000);
		
		return sucesso;


		
	}
	
	public ArrayList<Boolean> arquivos() {
		
		String idRegistro = idObter4();
		arquivos.click();
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
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int presente = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]")).size();
		if (presente == 1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}

		System.out.println("Verificação do Registro em Arquivos: " +sucesso);
		
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		efd.click();
		sleep(2000);
		efdO.click();
		
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
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		empresaDFG.click();
		sleep(1000);
		empresaDFGO.click();
		sleep(1000);
		
		tipoE.click();
		sleep(1000);
		tiopEo.click();
		sleep(1000);
		
//		filialDFG.click();
//		sleep(1000);
//		filialDFGO.click();
//		sleep(1000);
//		filialDFGO.sendKeys(Keys.ESCAPE);
//		sleep(1000);
		
		
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
		sleep(3000);
		executarDFG.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(visualizarArquivos);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		visualizarArquivos.click();
		System.out.println("dio clic en visualizar");
		sleep(2000);
		waitExpectElement(atualizar);
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]");
		int f=1;
		System.out.println("--------------------------Verificação Visualização----------------------------------------");
	
			
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+rows+"]/div[5]/div")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+rows+"]/div[6]/div")).getText();
		String dataInicial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+rows+"]/div[9]/div")).getText();
		String dataFinal = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+rows+"]/div[10]/div")).getText();
		
		System.out.println(empresa);
		System.out.println(filial);
		System.out.println(dataInicial);
		System.out.println(dataFinal);
		
		sucesso.add(empresa.equals("1000"));
		sucesso.add(filial.equals("0001"));
		sucesso.add(dataInicial.equals("20160101"));
		sucesso.add(dataFinal.equals("20160131"));
		
		
		System.out.println(sucesso);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(visualizarArquivos);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		return sucesso;
		
		
		
	}
	
	public ArrayList<Boolean> excluirDFG() {
		
		String idRegistro = idObter2();
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
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
