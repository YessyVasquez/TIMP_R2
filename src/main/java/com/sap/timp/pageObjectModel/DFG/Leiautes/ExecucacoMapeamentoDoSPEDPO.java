package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class ExecucacoMapeamentoDoSPEDPO extends TestBaseKenssy  {
 
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;
	@FindBy(xpath = "//li[contains(text(),\"SPED EFD/ICMS\")]")
	public WebElement opcTipo;
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][1]")
	public WebElement opcGrupoEstructura;
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][2]")
	public WebElement opcGrupoEstructura2;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEstrutura;
	@FindBy(xpath = "//*[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement dataVigencia;
	@FindBy(xpath = "//*[@id=\"inputLayoutVersion\"]/div/div[1]/input")
	public WebElement versaoLeiaute;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	//BLOCOS Y REGISTROS
	@FindBy(xpath = "//button/span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Bloco\"]")
	public WebElement nombreBloco;
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Registro\"]")
	public WebElement nombreRegistro;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement abaAjusteFiscais;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes\"][1]")
	public WebElement subAbaAjusteFiscais;
	
	//ELEMENTOS A ARRASTRAR
//	@FindBy(xpath = "//div/span[text()=\"Código da empresa (4)\"]")
//	public WebElement codigoEmpresa;
//	@FindBy(xpath = "//div/span[text()=\"Código da filial (4)\"]")
//	public WebElement codigoFilial;
//	@FindBy(xpath = "//div/span[text()=\"Data de lançamento (10)\"]")
//	public WebElement dataLanzamento;
//	@FindBy(xpath = "//div/span[text()=\"Valor do ajuste (34)\"]")
//	public WebElement valorAjuste;
	
	@FindBy(xpath = "//div/span[contains(text(),\"Código da empresa\")]")
	public WebElement codigoEmpresa;
	@FindBy(xpath = "//div/span[contains(text(),\"Código da filial\")]")
	public WebElement codigoFilial;
	@FindBy(xpath = "//div/span[contains(text(),\"Data de lançamento\")]")
	public WebElement dataLanzamento;
	@FindBy(xpath = "//li[14]/div/div/span[contains(text(),\"Valor do ajuste\")][1]")
	public WebElement valorAjuste;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	//
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button/span")
	public WebElement flecha;
	
	@FindBy(xpath = "//button/span[2][text()=\"Mapeamento do SPED\"]")
	public WebElement mapeamento;
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div/div[2]")
	public WebElement blocoSelect;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcBlocoSelect;
	@FindBy(xpath = "//div[@class=\"record-select\"]/div/div/div[2]")
	public WebElement registroSelect;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcRegistroSelect;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][1]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select1;
	@FindBy(xpath = "//li[contains(text(),\"Data de lançamento\")]")
	public WebElement opcSelect1; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][2]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select2;
	@FindBy(xpath = "//li[contains(text(),\"Código da empresa\")]")
	public WebElement opcSelect2;
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][3]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select3;
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSelect3;
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][4]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select4;
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSelect4; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][5]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select5;
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSelect5; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][6]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select6;
	@FindBy(xpath = "//li[contains(text(),\"Código da empresa\")]")
	public WebElement opcSelect6; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][7]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select7;
	@FindBy(xpath = "//li[contains(text(),\"Código da filial\")]")
	public WebElement opcSelect7; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][8]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select8;
	@FindBy(xpath = "//li[contains(text(),\"Data de lançamento\")]")
	public WebElement opcSelect8;
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][9]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select9;
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSelect9; 
	
	@FindBy(xpath = "//div[@class=\"row-mapping\"][10]/div[@class=\"column-layout-select\"]/div/div[2]")
	public WebElement select10;
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSelect10;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	//SPED
	
	@FindBy(xpath = "//div/span/span[contains(@class,\"icon-gooddoc\")]")
	public WebElement abaSPED;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-efd-icmsipi\"]")
	public WebElement abaEFDICMSIPI;
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi\"]")
	public WebElement subAbaEFDICMSIPI;
	
	@FindBy(xpath = "//button/span[text()=\"Novo EFD ICMS / IPI\"]")
	public WebElement novoSPED;
	@FindBy(xpath = "//input[contains(@placeholder,\"nome do EFD ICMS / IPI\")]")
	public WebElement nomeSPED;
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiaute;
	@FindBy(xpath = "//li[contains(text(),\"SPED EFD/ICMS\")]")
	public WebElement opcLeiaute;
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoSPED;
	@FindBy(xpath = "//li[contains(text(),\"1.0\")]")
	public WebElement opcversaoSPED;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoSPED;
	@FindBy(xpath = "//ul/li[text()=\"ICMS\"]")
	public WebElement opcTributoSPED;
	
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaSPED;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEmpresaSPED;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufSPED;
	@FindBy(xpath = "//div[@class=\"list-option\"]/div[@id=\"SP\"]/div/label/span")
	public WebElement opcUFSPED1;
	//cambiar para tc2
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcUFSPED2;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialSPED;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFilialSPED1;
	//cambiar para tc2
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFilialSPED2;
	
	
	@FindBy(xpath = "//*[@class=\"inputs valid-from-select\"]/div/div[1]/input")
	public WebElement dataVigenciaSPED;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi-calculationBlocks\"]")
	public WebElement abaBlocosApuracaoSPED;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primero;
	
	
	//EXECUTAR
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement estadoExecutar;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEstadoExecutar;
	
	@FindBy(xpath = "//div[@id=\"taxSelect\"]/div/div[2]")
	public WebElement tributoExecutar;
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcTributoExecutar;
	
	
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
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]//button/span[2][text()=\"Executar\"][1]")
	public WebElement execucao1;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executar2;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement flagCentralizacao;
	
	@FindBy(xpath = "//button/span[2][text()=\"Atualizar Estrutura\"]")
	public WebElement actualizarEstructuraB;
	
	@FindBy(xpath = "//div[@class=\"editable executarArquivo\"]")
	public WebElement cargarExecucao;
	
	
	//VISUALIZAR
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome do EFD ICMS / IPI\")]")
	public WebElement nomeSpedVisualizar;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Leiaute\")]")
	public WebElement leiauteSpedVisualizar;
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão Leiaute\")]")
	public WebElement versaoSpedVisualizar;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoSpedVisualizar;
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div/div/div/div[1]")
	public WebElement empresaSpedVisualizar;
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div/div/div/div[1]")
	public WebElement ufSpedVisualizar;
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div/div/div/div[1]")
	public WebElement filialSpedVisualizar;
	@FindBy(xpath = "//*[@class=\"inputs valid-from-select\"]/div/div[1]/input")
	public WebElement dataVigenciaSpedVisualizar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	//home
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div/span/span[contains(@class,\"icon-layout\")]")
	public WebElement abaLeiautes;
	
	
	@FindBy(xpath = "//div[contains(text(),\"Nenhum resultado\")]")
	public WebElement resultado;
	
	public ExecucacoMapeamentoDoSPEDPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarLeiaute() {
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
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idLeiaute = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();

		System.out.println(idLeiaute + "ultimo id Leiaute");
		
		
		System.out.println("");
		System.out.println("------------------------CRIAR LEIAUTE-------------------");
		System.out.println("");
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nome.getAttribute("value");
		System.out.println("nombreInicial "+nomeValor);
		
		tipo.click();
		sleep(1000);
		opcTipo.click();
		
		String tipoT = opcTipo.getText();
		System.out.println(tipoT);
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		
		if (tq1 == true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else if (tc2 ==true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcGrupoEstructura2.click();
			sleep(1000);
		}
		
		estrutura.click();
		sleep(1000);
		opcEstrutura.click();
		sleep(1000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		sleep(3000);
		//waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso\")]")).size();
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (mensaje > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		return sucesso;
	//}
	
	//public ArrayList<Boolean> blocosYregistros() {
		
		System.out.println("");
		System.out.println("------------------------BLOCOS Y REGISTROS-------------------");
		System.out.println("");
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		
		nombreBloco.sendKeys("1");
		sleep(2000);
		
		nombreRegistro.sendKeys("1200");
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		
		subAbaAjusteFiscais.click();
		sleep(2000);
		
		//ARRASTRAR ELEMENTOS
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
//		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso.\")]")).size();
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (mensaje > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		return sucesso;
//		
//	}
//	
//	
//	public ArrayList<Boolean> continuacionBlocosYRegistros() {
		
		//buscar mapeamento
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!mapeamento.isDisplayed()) {
			flecha.click();
			sleep(1000);
		}


		sleep(20000);
		
		mapeamento.click();
		sleep(1000);
		
		
		
		//llenar datos
		
		blocoSelect.click();
		sleep(2000);
		opcBlocoSelect.click();
		sleep(2000);
		
		registroSelect.click();
		sleep(2000);
		opcRegistroSelect.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		select1.click();
		sleep(2000);
		opcSelect1.click();
		sleep(2000);
		
		
		select2.click();
		sleep(2000);
		opcSelect2.click();
		sleep(2000);
		
		select3.click();
		sleep(2000);
		opcSelect3.click();
		sleep(2000);
		
		select4.click();
		sleep(2000);
		opcSelect4.click();
		sleep(2000);
		
		select5.click();
		sleep(2000);
		opcSelect5.click();
		sleep(2000);
		
		
		select6.click();
		sleep(2000);
		opcSelect6.click();
		sleep(2000);
		
		select7.click();
		sleep(2000);
		opcSelect7.click();
		sleep(2000);
		
		select8.click();
		sleep(2000);
		opcSelect8.click();
		sleep(2000);
		
		select9.click();
		sleep(2000);
		opcSelect9.click();
		sleep(2000);
		
		select10.click();
		sleep(2000);
		opcSelect10.click();
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		
//		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso.\")]")).size();
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (mensaje > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		return sucesso;
//	}
//	
//	
//	public ArrayList<Boolean> continuacionBlocosYRegistros() {
		
		biblioteca.click();
		sleep(12000);
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		siguiente.click();
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		

		String idLeiauteT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		String versaoT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[6]/div")).getText();
		String nomeT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[7]/div")).getText();
		String tipoTE = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[9]/div")).getText();
		
		idInserir1(idLeiauteT);
		System.out.println("ultimo id de Leiaute obter1:"+ idLeiauteT);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
//		int idLeiauteIA = convertToInt(idLeiaute);
//		int idLeiauteID= convertToInt(idLeiauteT);
//		
//		if (idLeiauteID > idLeiauteIA) {
//			sucesso.add(true);
//		}else {
//			sucesso.add(false);
//		}
		
		System.out.println("Versão: " + versaoT.equals("1.0"));
		System.out.println("Nome: " + nomeT.equals(nomeValor));
		System.out.println("Tipo: " + tipoTE.equals(tipoT));
		
		sucesso.add(versaoT.equals("1.0"));
		sucesso.add(nomeT.equals(nomeValor));
		sucesso.add(tipoTE.equals(tipoT));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> criarSPED() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		
		System.out.println("");
		System.out.println("------------------------ABA SPED-------------------");
		System.out.println("");
		
		abaSPED.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaEFDICMSIPI.click();
		sleep(3000);
		subAbaEFDICMSIPI.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primero.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rowsSPED = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idSPED = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[3]/div")).getText();
		
		System.out.println("ultimo id de SPED: "+idSPED);
		
		
		novoSPED.click();
		sleep(3000);
		waitExpectElement(nomeSPED);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeSPED.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nomeSPED.getAttribute("value");
		System.out.println("nombreInicial SPED "+nomeValor);
		sleep(9000);
		leiaute.click();
		sleep(2000);

		//WebElement opcLeiauteObter = driver.findElement(By.xpath("//li[@id="+idObter1()+"]"));
		WebElement opcLeiauteObter = driver.findElement(By.xpath("//li[contains(text(),\"ID"+idObter1()+"\")]"));
		
		System.out.println("Opcion Leiaute: "+ opcLeiauteObter);		
		
		//li[@id="7754"]
		waitExpectElement(opcLeiauteObter);
		opcLeiauteObter.click();
		sleep(2000);
		
		
		versaoSPED.click();
		sleep(1000);
		opcversaoSPED.click();
		sleep(1000);
//		opcversaoSPED.sendKeys(Keys.ESCAPE);
//		sleep(2000);
		
		actionsMoveToElementElement(dataVigenciaSPED);
		sleep(2000);
		
		tributoSPED.click();
		sleep(1000);
		opcTributoSPED.click();
		sleep(1000);
		
//		String tributoValor = opcTributoSPED.getText();
//		System.out.println("tributo SPED "+tributoValor);
		

		empresaSPED.click();
		sleep(1000);
		opcEmpresaSPED.click();
		sleep(1000);
		opcEmpresaSPED.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
//		String empresaValor = empresaSPED.getText();
//		System.out.println("empresa SPED "+empresaValor);
		
		
		actionsMoveToElementElement(dataVigenciaSPED);
		sleep(2000);
		
		
		ufSPED.click();
		sleep(1000);
		
		String ufValor1 ="";
		
		if (tc2==true) {
			//FALTAN OPCIONES
			opcUFSPED2.click();
			sleep(1000);
			opcUFSPED2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			opcUFSPED1.click();
			sleep(1000);
			opcUFSPED1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		//String ufValor = ufValor1;
		
		filialSPED.click();
		sleep(1000);
		if (tc2==true) {
			//COLOCAR XPATH CORRECTO
			opcFilialSPED2.click();
			sleep(1000);
			opcFilialSPED2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			opcFilialSPED1.click();
			sleep(1000);
			opcFilialSPED1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		dataVigenciaSPED.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		sleep(2000);
		waitExpectElement(abaBlocosApuracaoSPED);
		sleep(3000);
		
		
		abaBlocosApuracaoSPED.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primero.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		rowsSPED = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		

		String idSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[3]/div")).getText();
		String nomeSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[4]/div")).getText();
		String empresaSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[10]/div")).getText();
		String ufSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[11]/div")).getText();
		String tributoSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[12]/div")).getText();
		
		
		
		idInserir2(idSPEDT);
		System.out.println("ultimo id de Leiaute obter2:"+ idSPEDT);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
//		int idLeiauteIA = convertToInt(idLeiaute);
//		int idLeiauteID= convertToInt(idLeiauteT);
//		
//		if (idLeiauteID > idLeiauteIA) {
//			sucesso.add(true);
//		}else {
//			sucesso.add(false);
//		}
		
		System.out.println("Nome: " + nomeSPEDT.contains("Teste Automatizado"));
		//System.out.println("Empresa: " + empresaSPEDT.equals(empresaValor));
		if (tc2==true) {
			System.out.println("UF TC2: " + ufSPEDT.equals("AL"));
		}else {
			System.out.println("UF: " + ufSPEDT.equals("SP"));
		}
		
		//System.out.println("Tributo: " + tributoSPEDT.equals(tributoValor));
		
		sucesso.add(nomeSPEDT.contains("Teste Automatizado"));
//		sucesso.add(empresaSPEDT.equals(empresaValor));
		if (tc2==true) {
			sucesso.add(ufSPEDT.equals("AL"));
		}else {
			sucesso.add(ufSPEDT.equals("SP"));
		}
		
//		sucesso.add(tributoSPEDT.equals(tributoValor));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> executar() {
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
	
		sleep(2000);
		
		String idSPED = idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		executar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estadoExecutar.click();
		sleep(2000);
		opcEstadoExecutar.click();
		sleep(2000);
		opcEstadoExecutar.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		actionsMoveToElementElement(periodo);
		sleep(2000);
		
		
		if(tc2==true) {
			tributoExecutar.click();
			sleep(2000);
			opcTributoExecutar.click();
			sleep(2000);
		}else if (tp1==true) {
			tributoExecutar.click();
			sleep(2000);
			opcTributoExecutar.click();
			sleep(2000);
		}else {
			System.out.println("No se elije tributo");
		}
		
		
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
		
		flagCentralizacao.click();
		sleep(2000);
		
		execucao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(cargarExecucao);
		sleep(3000);
		
		actualizarEstructuraB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"Submetido com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//VISUALIZAR
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
	
		String nomeV = nomeSpedVisualizar.getAttribute("value");
		String leiauteV =  leiauteSpedVisualizar.getAttribute("value");
		String versaoV = versaoSpedVisualizar.getAttribute("value");
		String tributoV =  tributoSpedVisualizar.getAttribute("value");
		String empresaV = empresaSpedVisualizar.getText();
		String ufV =  ufSpedVisualizar.getText();
		String filialV = filialSpedVisualizar.getText();
		String dataV = dataVigenciaSpedVisualizar.getAttribute("value");
		
		System.out.println("-----Visualizar SPED----------");
		System.out.println("Nome Visualizar: "+ nomeV);
		System.out.println("Leiaute Visualizar: "+ leiauteV);
		System.out.println("Versao Visualizar: "+ versaoV);
		System.out.println("Tributo Visualizar:"+ tributoV);
		System.out.println("Empresa Visualizar: "+ empresaV);
		System.out.println("UF  Visualizar: "+ ufV);
		System.out.println("Filial Visualizar: "+ filialV );
		System.out.println("Data Vigencia Visualizar: "+ dataV );
		
		sucesso.add(nomeV.contains("Teste Automatizado"));
		sucesso.add(leiauteV.contains(leiauteV));
		sucesso.add(versaoV.contains("1.0"));
		sucesso.add(tributoV.contains("ICMS"));
		sucesso.add(empresaV.contains("1000"));
		if (tc2==true) {
			sucesso.add(ufV.contains("AL"));
		}else {
			sucesso.add(ufV.contains("SP"));
		}
		
		if (tc2==true) {
			sucesso.add(filialV.contains("1000 - 0008"));
		}else {
			sucesso.add(filialV.contains("1000 - 0001"));
		}
		
		sucesso.add(dataV.contains("01/01/2013"));
		
		sleep(8000);
		fechar.click();
		sleep(2000);
		waitExpectElement(home);
		sleep(3000);
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluir() {
		
		sleep(3000);
		
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idLeiaute2= idObter1();
		pesquisar.sendKeys(idLeiaute2);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute2+"\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"O arquivo foi movido a la lixeira com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(abaLeiautes);
		sleep(2000);
//		pesquisar.clear();
//		sleep(2000);
		
		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		pesquisar.sendKeys(idLeiaute2);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		if (resultado.isDisplayed()) {
			exclucao = driver.findElements(By.xpath("//div[@class=\"tr-no-data\"]/div[contains(text(),\"Nenhum resultado\")]")).size();
			////div[@class="tr-no-data" and not (@tabindex="0")]/div[contains(text(),"Nenhum resultado")]
		}
		
		System.out.println(exclucao);
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
}
