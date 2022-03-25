package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosManutencaoCriarLancamentoVisualizacaoAnexoPO extends TestBaseFernando{
	String url = driver.getCurrentUrl();
	
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\" Criar/Editar Lançamento\"]")
	public WebElement abaCriarEditarLancamento;
	
	@FindBy(xpath = "//span[text()=\"Lançamentos Realizados\"]")
	public WebElement abaLancamentoo;
	
	// Datos TQ1
	@FindBy(xpath = "//div[@id=\"annexe\"]/div/div[2]")
	public WebElement cboAnexo;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Anexo 6\"]")
	public WebElement opcionAnexo;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div[2]")
	public WebElement cboFilialOrigem;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"0001 - SP\"]")
	public WebElement opcionFilialOrigem;
	
	@FindBy(xpath = "//div[@id=\"uf-origin\"]/div/div[2]")
	public WebElement cboUfRelatorio;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"SP\"]")
	public WebElement opcionUfRelatorio;
	
	@FindBy(xpath = "//div[@id=\"cnpj\"]/div/div[2]")
	public WebElement cboCNJP;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"00209895000250 - REJAILE DISTRIBUIDORA DE PETROLEO LTDA\"]")
	public WebElement opcionCNJP;
	
	@FindBy(xpath = "//div[@id=\"communique\"]/div/div/input")
	public WebElement comunicado;
	
	@FindBy(xpath = "//div[@id=\"frame\"]/div/div[2]")
	public WebElement cboQuadro;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Quadros 4.1 > 7.1\"]")
	public WebElement opcionQuadro;
	
	@FindBy(xpath = "//div[@id=\"uf-dest-report\"]/div/div[2]")
	public WebElement cboUfRelatorioDestino;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"SP\"]")
	public WebElement opcionUfRelatorioDestino;
	
	@FindBy(xpath = "//div[@id=\"operation-value\"]/div/div/input")
	public WebElement valorOperacao;
	
	@FindBy(xpath = "//span[text()=\" Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement btnExcluir;
	
	// Datos TC2
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"0088 - RJ\"]")
	public WebElement opcionFilialOrigem1;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"RJ\"]")
	public WebElement opcionUfRelatorio1;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"RJ\"]")
	public WebElement opcionUfRelatorioDestino1;
	
	// Filtros avanzados
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[contains(@class, \"branch_0_0\")]/div/div[2]/div/div[2]")
	public WebElement cboFilialFiltro;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"0001 - SP\"]")
	public WebElement opcionFilialFiltro;
	
	@FindBy(xpath = "//div[contains(@class,\"branch_0_0\")]/div/div[2]/div/div/div/input")
	public WebElement inputFilialFiltro;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"0088 - RJ\"]")
	public WebElement opcionFilialFiltro1;
	
	@FindBy(xpath = "//div[contains(@class, \"stateDestiny_0_0\")]/div/div[2]/div/div[2]")
	public WebElement cboUfDestinoRelatorioFiltro;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"SP\"]")
	public WebElement opcionUfDestinoRelatorioFiltro;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"RJ\"]")
	public WebElement opcionUfDestinoRelatorioFiltro1;
	
	@FindBy(xpath = "//div[contains(@class, \"cnpj_0_1\")]/div/div[2]/div/div/div[2]/input")
	public WebElement inputCNPJ;
	
	@FindBy(xpath = "//div[contains(@class, \"socialReason_0_1\")]/div/div[2]/div/div/div[2]/input")
	public WebElement inputRazaoSocial;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement Filtros;
	
	@FindBy(xpath = "//span[text()=\"Aplicar Filtros\"]")
	public WebElement btnAplicarFiltros;
	@FindBy(xpath = "//span[text()=\"Visualizar anexos\"]")
	public WebElement btnVisualizarAnexos;
	
	// Filtros Anexo
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/div/div/button[@id=\"advanced-filters-btn\"]")
	public WebElement btnFiltrosAvanzados2;
	
	@FindBy(xpath = "//div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboFiltroRazaoSocial;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"PETROLEO BRASILEIRO S/A(A3Q2)\"]")
	public WebElement opcionFiltroRazaoSocial;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"PETROLEO BRASILEIRO S.A\"]")
	public WebElement opcionFiltroRazaoSocial1;
	
	@FindBy(xpath = "//div[@id=\"ufDestRelatorio\"]/div/div[2]/div/div[2]")
	public WebElement cboFiltroUFRelatorioDestino;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"SP\"]")
	public WebElement opcionFiltroUFRelatorioDestino;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"RJ\"]")
	public WebElement opcionFiltroUFRelatorioDestino1;
	
	@FindBy(xpath = "//div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboFiltroCNPJEmitente;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"74544297000192\"]")
	public WebElement opcionFiltroCNPJEmitente;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"33000167008862\"]")
	public WebElement opcionFiltroCNPJEmitente1;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/div/div/button[@id=\"advanced-filters-btn-apply\"]")
	public WebElement btnAplicarFiltros2;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/div/div/button[@id=\"reset-filters-btn\"]")
	public WebElement btnFiltros2;
	
	@FindBy(xpath = "//div[@id=\"ufEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboFiltroUFEmitente;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"SP\"]")
	public WebElement opcionFiltroUFEmitente;
	
	@FindBy(xpath = "//div[@class=\"list-item\"  and @id]/div[text()=\"RJ\"]")
	public WebElement opcionFiltroUFEmitente1;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement cboEmpre;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcionEmpre;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	int idRegistro = 0;
	String parentG = "";
	
	public RelatorioRefinariaGeradosManutencaoCriarLancamentoVisualizacaoAnexoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> llenarDatosTQ1() {
		idRegistro = 24;
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Manutenção \"]"));
		String periodo = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[7]/div")).getText();
		System.out.println("Periodo: " + periodo);
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String periodoManutencaoString = driver.findElement(By.xpath("//div[@id=\"period\"]/div/div/input")).getAttribute("value");
		System.out.println("Periodo manutencao: " + periodoManutencaoString);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(periodoManutencaoString.equals(periodo)) {
			System.out.println("Periodo iguales");
			sucesso.add(true);
		}else {
			System.out.println("Periodos no son iguales");
			sucesso.add(false);
			return sucesso;
		}
		
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		cboAnexo.click();
		sleep(1000);
		opcionAnexo.click();
		sleep(1000);
		
		cboQuadro.click();
		sleep(1000);
		opcionQuadro.click();
		sleep(1000);
		
		cboFilialOrigem.click();
		sleep(1000);
		opcionFilialOrigem.click();
		sleep(1000);
		
		cboUfRelatorio.click();
		sleep(1000);
		opcionUfRelatorio.click();
		sleep(1000);
		
		cboUfRelatorioDestino.click();
		sleep(1000);
		opcionUfRelatorioDestino.click();
		sleep(1000);
		
		cboCNJP.click();
		sleep(1000);
		opcionCNJP.click();
		sleep(1000);
		
		comunicado.click();
		sleep(1000);
		comunicado.sendKeys("Teste Automatizado");
		sleep(1000);
		
		valorOperacao.click();
		sleep(1000);
		valorOperacao.sendKeys("1.000,00");
		sleep(1000);
		
		// Obtener los datos ingresados
		String anexoString = driver.findElement(By.xpath("//div[@id=\"annexe\"]/div/div/input")).getAttribute("value");
		String quadroString = driver.findElement(By.xpath("//div[@id=\"frame\"]/div/div/input")).getAttribute("value").split(">")[0];
		String filialOrigenString = driver.findElement(By.xpath("//div[@id=\"filial\"]/div/div/input")).getAttribute("value");
		String ufRelatorio = driver.findElement(By.xpath("//div[@id=\"uf-origin\"]/div/div/input")).getAttribute("value");
		String cnpjOrigemString = driver.findElement(By.xpath("//div[@id=\"cnpj\"]/div/div/input")).getAttribute("value").split("-")[0].trim();
		String razaoSocialString = driver.findElement(By.xpath("//div[@id=\"cnpj\"]/div/div/input")).getAttribute("value").split("-")[1].trim();
		String quadroString2 = "Quadros" + driver.findElement(By.xpath("//div[@id=\"frame\"]/div/div/input")).getAttribute("value").split(">")[1];
		String filialDestinoString = driver.findElement(By.xpath("//div[@id=\"branch-destiny\"]/div/div/input")).getAttribute("value");
		String ufDestinoRelatorioString = driver.findElement(By.xpath("//div[@id=\"uf-dest-report\"]/div/div/input")).getAttribute("value");
		String valorOperacaoString = driver.findElement(By.xpath("//div[@id=\"operation-value\"]/div/div/input")).getAttribute("value");
		String periodoString = driver.findElement(By.xpath("//div[@id=\"period\"]/div/div/input")).getAttribute("value");
		String comunicadoString = driver.findElement(By.xpath("//div[@id=\"communique\"]/div/div/input")).getAttribute("value");
		
		System.out.println("");
		System.out.println("Datos ingresados");
		System.out.println("Anexo: " + anexoString);
		System.out.println("Quadro  1: " + quadroString);
		System.out.println("Filial Origem: " + filialOrigenString);
		System.out.println("UF Relatorio: " + ufRelatorio);
		System.out.println("CNPJ Origem: " + cnpjOrigemString);
		System.out.println("Razao Social: " + razaoSocialString);
		System.out.println("Quadro 2: " + quadroString2);
		System.out.println("Filial Destino: " + filialDestinoString);
		System.out.println("UF Destino Relatorio: " + ufDestinoRelatorioString);
		System.out.println("Valor operacao: " + valorOperacaoString);
		System.out.println("Periodo: " + periodoString);
		System.out.println("Comunicado: " + comunicadoString);
		System.out.println("");
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div/span[2]"));
		acoe = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExcluir.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		actionsMoveToElementElement(btnGravar);
		btnGravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnFiltrosAvanzados.click();
		sleep(1000);
		
		cboFilialFiltro.click();
		sleep(1000);
		opcionFilialFiltro.click();
		sleep(1000);
		
		cboUfDestinoRelatorioFiltro.click();
		sleep(1000);
		opcionUfDestinoRelatorioFiltro.click();
		sleep(1000);
		
		inputCNPJ.sendKeys(cnpjOrigemString);
		sleep(1000);
		
		inputRazaoSocial.sendKeys(razaoSocialString);
		sleep(1000);
		
		btnAplicarFiltros.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows busqueda: " + rows);
		String cnpjDestinoString = "";
		
		if(rows > 0) {
			System.out.println("");
			System.out.println("Datos confirmados...");
			cnpjDestinoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[11]/div")).getText();
			
			sucesso.add(true);
		}else {
			System.out.println("");
			System.out.println("No se pudieron confirmar los datos en la busqueda...");
			sucesso.add(false);
			return sucesso;
		}
		
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Segunda pestania en el navegador
		String parent = driver.getWindowHandle();
		parentG = parent;
		
		System.out.println("Parent Window Id: " + parent);
		
		btnVisualizarAnexos.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		sleep(1000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		waitExpectElement(btnFiltrosAvanzados2);
		btnFiltrosAvanzados2.click();
		sleep(2000);
		
		cboFiltroUFRelatorioDestino.click();
		sleep(1000);
		opcionFiltroUFRelatorioDestino.click();
		closeSelectTypeCheckbox(cboFiltroUFRelatorioDestino);
		sleep(1000);
		
		cboFiltroCNPJEmitente.click();
		sleep(1000);
		opcionFiltroCNPJEmitente.click();
		closeSelectTypeCheckbox(cboFiltroCNPJEmitente);
		sleep(1000);
		
		cboFiltroRazaoSocial.click();
		sleep(1000);
		opcionFiltroRazaoSocial.click();
		closeSelectTypeCheckbox(cboFiltroRazaoSocial);
		sleep(1000);
		
		cboFiltroUFEmitente.click();
		sleep(1000);
		opcionFiltroUFEmitente.click();
		closeSelectTypeCheckbox(cboFiltroUFEmitente);
		sleep(1000);
		
		btnAplicarFiltros2.click();		
		sleep(3000);
		
		// Datos de vissualizar Quadro 4
		actionsMoveToElementXpath("//div[@class=\"report-wrapper\"][5]/div[2]/div[4]/div/div[2]");
		String unidadeFederadaDeOrigemString = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div[4]/div/div[2]")).getText();
		
		if(unidadeFederadaDeOrigemString.equals("SP")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
			return sucesso;
		}		
		
		String codigoCNPJVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+cnpjOrigemString+"\"]")).getText();
		String razaoSocialVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+razaoSocialString+"\"]")).getText();
		String icmsRepassarCNPJVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+valorOperacaoString+"\"]")).getText();
		
		System.out.println("");
		System.out.println("Datos de documento visualizado - Quadro 4");
		System.out.println("Codigo CNPJ: " + codigoCNPJVisualizar);
		System.out.println("Razao Social: " + razaoSocialVisualizar);
		System.out.println("ICMS a Repassar: " + icmsRepassarCNPJVisualizar);
		System.out.println();
		
		sucesso.add(codigoCNPJVisualizar.equals(cnpjOrigemString));
		sucesso.add(razaoSocialVisualizar.equals(razaoSocialString));
		sucesso.add(icmsRepassarCNPJVisualizar.equals(valorOperacaoString));
		
		// Datos de vissualizar Quadro 7		
		actionsMoveToElementXpath("//div[@class=\"report-wrapper\"][8]/div[2]/div[4]/div/div[2]");
		String unidadeFederadaDeOrigemString1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][8]/div[2]/div/div/div[text()=\"SP\"]")).getText();
		
		if(unidadeFederadaDeOrigemString1.equals("SP")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
			return sucesso;
		}
				
		String codigoCNPJVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][8]/div[2]/div/div/div[text()=\""+cnpjOrigemString+"\"]")).getText();
		String razaoSocialVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][8]/div[2]/div/div/div[text()=\""+razaoSocialString+"\"]")).getText();
		String icmsRepassarCNPJVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][8]/div[2]/div/div/div[text()=\""+valorOperacaoString+"\"]")).getText();
		
		System.out.println("");
		System.out.println("Datos de documento visualizado - Quadro 7");
		System.out.println("Codigo CNPJ: " + codigoCNPJVisualizar1);
		System.out.println("Razao Social: " + razaoSocialVisualizar1);
		System.out.println("ICMS a Repassar: " + icmsRepassarCNPJVisualizar1);
		System.out.println();
		
		sucesso.add(codigoCNPJVisualizar.equals(cnpjOrigemString));
		sucesso.add(razaoSocialVisualizar.equals(razaoSocialString));
		sucesso.add(icmsRepassarCNPJVisualizar.equals(valorOperacaoString));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> llenarDatosTC2() {
		idRegistro = 26;
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Manutenção \"]"));
		String periodo = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[7]/div")).getText();
		System.out.println("Periodo: " + periodo);
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String periodoManutencaoString = driver.findElement(By.xpath("//div[@id=\"period\"]/div/div/input")).getAttribute("value");
		System.out.println("Periodo manutencao: " + periodoManutencaoString);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(periodoManutencaoString.equals(periodo)) {
			System.out.println("Periodo iguales");
			sucesso.add(true);
		}else {
			System.out.println("Periodos no son iguales");
			sucesso.add(false);
			return sucesso;
		}
		
		sleep(3000);
		
		cboEmpre.click();
		sleep(1000);
		opcionEmpre.click();
		sleep(5000);
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		cboAnexo.click();
		sleep(1000);
		opcionAnexo.click();
		sleep(1000);
		
		cboQuadro.click();
		sleep(1000);
		opcionQuadro.click();
		sleep(5000);
		
		cboFilialOrigem.click();
		sleep(1000);
		opcionFilialOrigem1.click();
		sleep(1000);
		
		cboUfRelatorio.click();
		sleep(1000);
		opcionUfRelatorio1.click();
		sleep(1000);
		
		cboUfRelatorioDestino.click();
		sleep(1000);
		opcionUfRelatorioDestino1.click();
		sleep(1000);
		
		cboCNJP.click();
		sleep(1000);
		opcionCNJP.click();
		sleep(1000);
		
		comunicado.click();
		sleep(1000);
		comunicado.sendKeys("Teste Automatizado");
		sleep(1000);
		
		valorOperacao.click();
		sleep(1000);
		valorOperacao.sendKeys("1.000,00");
		sleep(1000);
		
		// Obtener los datos ingresados
		String anexoString = driver.findElement(By.xpath("//div[@id=\"annexe\"]/div/div/input")).getAttribute("value");
		String quadroString = driver.findElement(By.xpath("//div[@id=\"frame\"]/div/div/input")).getAttribute("value").split(">")[0];
		String filialOrigenString = driver.findElement(By.xpath("//div[@id=\"filial\"]/div/div/input")).getAttribute("value");
		String ufRelatorio = driver.findElement(By.xpath("//div[@id=\"uf-origin\"]/div/div/input")).getAttribute("value");
		String cnpjOrigemString = driver.findElement(By.xpath("//div[@id=\"cnpj\"]/div/div/input")).getAttribute("value").split("-")[0].trim();
		String razaoSocialString = driver.findElement(By.xpath("//div[@id=\"cnpj\"]/div/div/input")).getAttribute("value").split("-")[1].trim();
		String quadroString2 = "Quadros" + driver.findElement(By.xpath("//div[@id=\"frame\"]/div/div/input")).getAttribute("value").split(">")[1];
		String filialDestinoString = driver.findElement(By.xpath("//div[@id=\"branch-destiny\"]/div/div/input")).getAttribute("value");
		String ufDestinoRelatorioString = driver.findElement(By.xpath("//div[@id=\"uf-dest-report\"]/div/div/input")).getAttribute("value");
		String valorOperacaoString = driver.findElement(By.xpath("//div[@id=\"operation-value\"]/div/div/input")).getAttribute("value");
		String periodoString = driver.findElement(By.xpath("//div[@id=\"period\"]/div/div/input")).getAttribute("value");
		String comunicadoString = driver.findElement(By.xpath("//div[@id=\"communique\"]/div/div/input")).getAttribute("value");
		
		System.out.println("");
		System.out.println("Datos ingresados");
		System.out.println("Anexo: " + anexoString);
		System.out.println("Quadro  1: " + quadroString);
		System.out.println("Filial Origem: " + filialOrigenString);
		System.out.println("UF Relatorio: " + ufRelatorio);
		System.out.println("CNPJ Origem: " + cnpjOrigemString);
		System.out.println("Razao Social: " + razaoSocialString);
		System.out.println("Quadro 2: " + quadroString2);
		System.out.println("Filial Destino: " + filialDestinoString);
		System.out.println("UF Destino Relatorio: " + ufDestinoRelatorioString);
		System.out.println("Valor operacao: " + valorOperacaoString);
		System.out.println("Periodo: " + periodoString);
		System.out.println("Comunicado: " + comunicadoString);
		System.out.println("");
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div/span[2]"));
		acoe = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExcluir.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		actionsMoveToElementElement(btnGravar);
		btnGravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnFiltrosAvanzados.click();
		sleep(1000);
		
		cboFilialFiltro.click();
		sleep(1000);
		inputFilialFiltro.sendKeys("0088 - RJ");
		sleep(1000);
		opcionFilialFiltro1.click();
		sleep(1000);
		
		cboUfDestinoRelatorioFiltro.click();
		sleep(1000);
		opcionUfDestinoRelatorioFiltro1.click();
		sleep(1000);
		
		inputCNPJ.sendKeys(cnpjOrigemString);
		sleep(1000);
		
		inputRazaoSocial.sendKeys(razaoSocialString);
		sleep(1000);
		
		btnAplicarFiltros.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		Filtros.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows busqueda: " + rows);
		String cnpjDestinoString = "";
		
		if(rows > 0) {
			System.out.println("");
			System.out.println("Datos confirmados...");
			cnpjDestinoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[11]/div")).getText();
			
			sucesso.add(true);
		}else {
			System.out.println("");
			System.out.println("No se pudieron confirmar los datos en la busqueda...");
			sucesso.add(false);
			return sucesso;
		}
		
		abaCriarEditarLancamento.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Segunda pestania en el navegador
		String parent = driver.getWindowHandle();
		parentG = parent;
		
		System.out.println("Parent Window Id: " + parent);
		
		btnVisualizarAnexos.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		sleep(1000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		waitExpectElement(btnFiltrosAvanzados2);
		btnFiltrosAvanzados2.click();
		sleep(2000);
		
		cboFiltroUFRelatorioDestino.click();
		sleep(1000);
		opcionFiltroUFRelatorioDestino1.click();
		closeSelectTypeCheckbox(cboFiltroUFRelatorioDestino);
		sleep(1000);
		
		cboFiltroCNPJEmitente.click();
		sleep(1000);
		opcionFiltroCNPJEmitente1.click();
		closeSelectTypeCheckbox(cboFiltroCNPJEmitente);
		sleep(1000);
		
		cboFiltroRazaoSocial.click();
		sleep(1000);
		opcionFiltroRazaoSocial1.click();
		closeSelectTypeCheckbox(cboFiltroRazaoSocial);
		sleep(1000);
		
		cboFiltroUFEmitente.click();
		sleep(1000);
		opcionFiltroUFEmitente1.click();
		closeSelectTypeCheckbox(cboFiltroUFEmitente);
		sleep(1000);
		
		btnAplicarFiltros2.click();		
		sleep(3000);
		
		btnFiltros2.click();		
		sleep(3000);
		
		// Datos de vissualizar Quadro 4
		actionsMoveToElementXpath("//div[text()=\"4.2 - OPERAÇÕES COM IMPOSTO RETIDO POR OUTROS CONTRIBUINTES\"]");
		String unidadeFederadaDeOrigemString = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div[4]/div/div[2]")).getText();
		
		if(unidadeFederadaDeOrigemString.equals("RJ")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
			return sucesso;
		}		
		
		String codigoCNPJVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+cnpjOrigemString+"\"]")).getText();
		String razaoSocialVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+razaoSocialString+"\"]")).getText();
		String icmsRepassarCNPJVisualizar = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][5]/div[2]/div/div/div[text()=\""+valorOperacaoString+"\"]")).getText();
		
		System.out.println("");
		System.out.println("Datos de documento visualizado - Quadro 4");
		System.out.println("Codigo CNPJ: " + codigoCNPJVisualizar);
		System.out.println("Razao Social: " + razaoSocialVisualizar);
		System.out.println("ICMS a Repassar: " + icmsRepassarCNPJVisualizar);
		System.out.println();
		
		sucesso.add(codigoCNPJVisualizar.equals(cnpjOrigemString));
		sucesso.add(razaoSocialVisualizar.equals(razaoSocialString));
		sucesso.add(icmsRepassarCNPJVisualizar.equals(valorOperacaoString));
		
		// Datos de vissualizar Quadro 7		
		actionsMoveToElementXpath("//div[@class=\"report-wrapper\"][11]/div[2]/div[13]/div/div[text()=\"1.000,00\"]");
		String unidadeFederadaDeOrigemString1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][11]/div[2]/div[7]/div/div[text()=\"RJ\"]")).getText();
		
		if(unidadeFederadaDeOrigemString1.equals("RJ")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
			return sucesso;
		}
				
		String codigoCNPJVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][11]/div[2]/div[13]/div/div[text()=\""+cnpjOrigemString+"\"]")).getText();
		String razaoSocialVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][11]/div[2]/div[13]/div/div[text()=\""+razaoSocialString+"\"]")).getText();
		String icmsRepassarCNPJVisualizar1 = driver.findElement(By.xpath("//div[@class=\"report-wrapper\"][11]/div[2]/div[13]/div/div[text()=\""+valorOperacaoString+"\"]")).getText();
		
		System.out.println("");
		System.out.println("Datos de documento visualizado - Quadro 7");
		System.out.println("Codigo CNPJ: " + codigoCNPJVisualizar1);
		System.out.println("Razao Social: " + razaoSocialVisualizar1);
		System.out.println("ICMS a Repassar: " + icmsRepassarCNPJVisualizar1);
		System.out.println();
		
		sucesso.add(codigoCNPJVisualizar.equals(cnpjOrigemString));
		sucesso.add(razaoSocialVisualizar.equals(razaoSocialString));
		sucesso.add(icmsRepassarCNPJVisualizar.equals(valorOperacaoString));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> manutencaoCriarLancamentoVisualizacaoAnexo() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(url.contains("tq1")) {
			sucesso = llenarDatosTQ1();
		}
		
		if(url.contains("tc2")) {
			sucesso = llenarDatosTC2();
		}
		
		return sucesso;
	}
}
