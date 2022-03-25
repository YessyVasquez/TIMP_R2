package com.sap.timp.pageObjectModel.BCB.Formula.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PercentualPO extends TestBaseKenssy {
	
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
		
		@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
		public WebElement justificativa;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicarJustificativa;

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
		//@FindBy(xpath = "//div[contains(@id,\"1000_DF_0013\")]/div/label/span")
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
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
	
	// primer subnivel
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement primerNivel;	
		
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha1;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO1;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCB;
	
	@FindBy(xpath = "//li[text()=\"954 - (BCB com campo de Output) TA\"]")
	public WebElement selectBCB1;
	
	//@FindBy(xpath = "//li[text()=\"328 - (BCB com campo de Output) TA\"]")
	@FindBy(xpath = "//li[@id][text()=\"326 - (BCB com campo de Output) TA\"]")
	public WebElement selectBCB2;
	
	//este es para tc2, pendiente de ver
		@FindBy(xpath = "//li[text()=\"393 - (BCB com campo de Output) TA\"]")
		public WebElement selectBCB3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida1;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida11;
	
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida11;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida1;
	
		
	// SEGUNGO subnivel
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha2;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida2;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida2;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida22;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida22;
	
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
	public WebElement segundoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"check-accumulated\"]/div/label/span")
	public WebElement subPeriodosAcumulados;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"accumulated-periods\"]/div/div/div[2]")
	public WebElement cantSubPeriodosAcumulados;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCantSubPeriodosAcumulados;
	
	
	//TERCER SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"3\"]")
	public WebElement tercerNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha3;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida3;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida33;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida33;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"check-previous\"]/div/label/span")
	public WebElement subPeriodosAnteriores3;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div/div[@id=\"previous-periods\"]/div/div/div[2]")
	public WebElement cantSubPeriodosAnteriores3;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcCantSubPeriodosAnteriores3;

	
	//CUARTO SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"4\"]")
	public WebElement cuartoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha4;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO4;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub4;
	
	//div[@class="subLevel"][2]//div[@id="zero-value"]/div/div/div[2]
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida4;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida4;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida44;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida44;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
	public WebElement zerado;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][4]//div[@id=\"zero-value\"]/div/div/div[2]")
	public WebElement condicaoZerado;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcZerado;
	
	
	//QUINTO SUBNIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"5\"]")
	public WebElement quintoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha5;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO5;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub5;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida5;
	@FindBy(xpath = "//li[text()=\"Campo de Saída 2\"][1]")
	public WebElement opcCampoSaida5tc2;
	@FindBy(xpath = "//li[@id][text()=\"Campo de saída 2\"][1]")
	public WebElement opcCampoSaida5;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida55;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcCampoSaida55;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div/div[@id=\"check-zero-value\"]/div/label/span")
	public WebElement zerado5;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][5]//div[@id=\"zero-value\"]/div/div/div[2]")
	public WebElement condicaoZerado5;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcZerado5;
	
	
	//SEXTO NIVEL
	@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"6\"]")
	public WebElement sextoNivel;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha6;
	@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
	public WebElement campoLinhaO6;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement selectBCBsub6;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"value\"]/div/div[2]")
	public WebElement campoSaida6;
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcCampoSaida6;
	
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"version\"]/div/div[2]")
	public WebElement campoSaida66;
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcCampoSaida66;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div/div[@id=\"check-negative\"]/div/label/span")
	public WebElement negativo6;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executar;

	@FindBy(xpath = "//button[text()=\"Executar\"]")
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
	
//	@FindBy(xpath = "//div[@class=\"hdr hdr-0\"]")
//	public WebElement aba1;
//	@FindBy(xpath = "//div[@class=\"hdr hdr-1\"]")
//	public WebElement hierarquia1;
//	@FindBy(xpath = "//div[@class=\"hdr hdr-2\"]")
//	public WebElement grupo1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel1;
	@FindBy(xpath = "//div[@class=\"ctn ctn-3\"]/div/div[1]/div[2]")
	public WebElement verCampoSaidaSubNivel1;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel2;
	//TQ1 Y TP1
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[1]/div[2]")
	public WebElement periodoTiempo2;
	
	
	//TQ1 Y TP1
//	@FindBy(xpath = "//tr[@class=\"cell hdr-4\"][1]/td[1]/span[1]")
//	public WebElement periodoTiempo21;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel3;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel3;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[1]/div[2]")
	public WebElement periodoTiempo3;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel4;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel4;
	
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel5;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel5;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[5]/div[1]/div[2]")
	public WebElement totalizadorSubNivel5;
	
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][6]/div[1]/div[1]/div[1]/div[1]")
	public WebElement subnivel6;
	@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][6]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement verCampoSaidaSubNivel6;
	@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[6]/div[1]/div[2]")
	public WebElement totalizadorSubNivel6;
	
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
	
	@FindBy(xpath = "//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")
	public WebElement mensagem;
	
	public PercentualPO() {
		PageFactory.initElements(driver, this);
	}
	

	public ArrayList<Boolean>  ingresarDeUnSolo() {
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
		
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numero = "";
		
		if (tc2==true) {
			numero = "643";
			sleep(1000);
		}else if(tq1==true) {
			numero = "1352";
			sleep(1000);
		}else {
			numero = "420";
			sleep(1000);
		}
		
		pesquisar.sendKeys(numero);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id="+numero+"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and  @data-id="+numero+"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		//driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro2+"\")]"));
		sleep(2000);
	
	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(calculator);
		sleep(2000);
	
		executar.click();
		sleep(3000);
		waitExpectElement(executarN);
		
		
		
		periodo.click();
		sleep(2000);
		
		paginaAnterior.click();
		sleep(2000);
		
		ano2016.click();

		sleep(5000);

		
		jan.click();
		sleep(4000);
		
		a1.click();
		sleep(4000);
		
		
	//	execucaoAnalitica.click();
		sleep(5000);
		
		executarN.click();
		
		sleep(15000);
		
		
	
		//waitExpectElement(aba1);
		sleep(15000);
		
		aba1.click();
		sleep(2000);
		hierarquia1.click();
		sleep(2000);
		grupo1.click();
		sleep(2000);
				
				
		
		System.out.println("---------------------------------Abrir SubNivel 1-------------------------------------");
		sleep(8000);
		
		subnivel1.click();
		sleep(2000);

		String valorCampoSaidaSubNivel1 = verCampoSaidaSubNivel1.getText();
		System.out.println("Campo Saida Subnivel1: "+ valorCampoSaidaSubNivel1);
		
		subnivel1.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorCampoSaidaSubNivel1.equals("10,00%"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
