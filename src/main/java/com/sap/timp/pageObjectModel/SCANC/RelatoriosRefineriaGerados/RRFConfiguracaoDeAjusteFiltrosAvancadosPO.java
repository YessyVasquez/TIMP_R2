package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RRFConfiguracaoDeAjusteFiltrosAvancadosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatoriosRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement btnFiltrosAvancados;
	
	@FindBy(xpath = "//button[@id=\"apply-filters-btn\"]")
	public WebElement btnAplicarFiltros;
	
	@FindBy(xpath = "//button[@id=\"reset-filters-btn\"]")
	public WebElement btnLimpiarFiltros;
	
	@FindBy(xpath = "//div[@id=\"idAssociation\"]/div/div/div[2]")
	public WebElement cboIdAssociacao;
	
	@FindBy(xpath = "//div[@id=\"codAdjustment\"]/div/div/div[2]")
	public WebElement cboCodigoDeAjuste;
	
	@FindBy(xpath = "//div[@id=\"fieldOutput\"]/div/div/div[2]")
	public WebElement cboCamposSaida;
	
	@FindBy(xpath = "//div[@id=\"stateOrigin\"]/div/div/div[2]")
	public WebElement cboUfOrigem;
	
	@FindBy(xpath = "//div[@id=\"stateDestiny\"]/div/div/div[2]")
	public WebElement cboUfDestino;
	
	@FindBy(xpath = "//div[@id=\"userModification\"]/div/div/div[2]")
	public WebElement cboUsuarioDeModificacao;
	
	@FindBy(xpath = "//div[@id=\"dateModification\"]/div/div/input")
	public WebElement inputDataDeModificacao;
	
	@FindBy(xpath = "//div[@id=\"launchDate\"]/div/div/input")
	public WebElement inputDataDeLancamento;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	public RRFConfiguracaoDeAjusteFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosAvancados() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvancados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		// Filtro Id de Associacao de Ajuste
		cboIdAssociacao.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboIdAssociacao);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows Filtro Id de Associacao: " + rows);
		
		String valorSeleccionadoIdAssociacao = driver.findElement(By.xpath("//div[@id=\"idAssociation\"]/div/div/div/div/div/div[1]")).getText();
		System.out.println("Valor seleccionado filtro Id Associacao: " + valorSeleccionadoIdAssociacao);
		
		String idAssociacaoString = "";
		
		for(int i = 0; i < rows; i++) {
			idAssociacaoString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();			
			sucesso.add(idAssociacaoString.contains(valorSeleccionadoIdAssociacao));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro Codigo de Ajuste
		cboCodigoDeAjuste.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboCodigoDeAjuste);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows Filtro Codigo de Ajuste: " + rows);
		
		String valorSeleccionadoCodigoDeAjuste = driver.findElement(By.xpath("//div[@id=\"codAdjustment\"]/div/div/div/div/div/div[1]")).getText();		
		System.out.println("Valor seleccionado filtro Codigo de Ajuste: " + valorSeleccionadoCodigoDeAjuste);
		
		String codigoDeAjusteString= "";
		
		for(int i = 0; i < rows; i++) {
			codigoDeAjusteString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();			
			sucesso.add(codigoDeAjusteString.contains(valorSeleccionadoCodigoDeAjuste));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro Camapos Saida
		cboCamposSaida.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboCamposSaida);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows Filtro Campos saida: " + rows);
		
		String valorSeleccionadoCampoSaida = driver.findElement(By.xpath("//div[@id=\"fieldOutput\"]/div/div/div/div/div/div[1]")).getText();		
		System.out.println("Valor seleccionado filtro Campos saida: " + valorSeleccionadoCampoSaida);
		
		String campoSaidatring= "";
		
		for(int i = 0; i < rows; i++) {
			campoSaidatring = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();			
			sucesso.add(campoSaidatring.contains(valorSeleccionadoCampoSaida));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro UF Origem
		cboUfOrigem.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboUfOrigem);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows Filtro Uf Origem: " + rows);
		
		String valorSeleccionadoUfOrigem = driver.findElement(By.xpath("//div[@id=\"stateOrigin\"]/div/div/div/div/div/div[1]")).getText();		
		System.out.println("Valor seleccionado filtro Uf Origem: " + valorSeleccionadoUfOrigem);
		
		String ufORigemtring= "";
		
		for(int i = 0; i < rows; i++) {
			ufORigemtring = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();			
			sucesso.add(ufORigemtring.contains(valorSeleccionadoUfOrigem));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro UF Destino
		cboUfDestino.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboUfDestino);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows Filtro Uf  Destino: " + rows);
		
		String valorSeleccionadoUfDestino = driver.findElement(By.xpath("//div[@id=\"stateDestiny\"]/div/div/div/div/div/div[1]")).getText();		
		System.out.println("Valor seleccionado filtro Uf Destino: " + valorSeleccionadoUfDestino);
		
		String ufDestinoString= "";
		
		for(int i = 0; i < rows; i++) {
			ufDestinoString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();			
			sucesso.add(ufDestinoString.contains(valorSeleccionadoUfDestino));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro Usuario de Modificacao
		cboUsuarioDeModificacao.click();
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboUsuarioDeModificacao);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows Filtro Usuario modificacao: " + rows);
		
		String valorSeleccionadoUsuarioModificacao = driver.findElement(By.xpath("//div[@id=\"userModification\"]/div/div/div/div/div/div[1]")).getText();		
		System.out.println("Valor seleccionado filtro Usuario modificacao: " + valorSeleccionadoUfDestino);
		
		String usuarioModificacaoString= "";
		
		for(int i = 0; i < rows; i++) {
			usuarioModificacaoString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[9]/div")).getText();			
			sucesso.add(usuarioModificacaoString.contains(valorSeleccionadoUsuarioModificacao));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro Data de modificao
		String dataModificacao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[10]/div")).getText();	
		System.out.println("");
		System.out.println("Valor enviado Data de Modificacao " + dataModificacao);
		
		inputDataDeModificacao.click();
		inputDataDeModificacao.sendKeys(dataModificacao);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows Filtro Data de Modificacao: " + rows);
			
		String dataModificacaoString = "";
		
		for(int i = 0; i < rows; i++) {
			dataModificacaoString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[10]/div")).getText();			
			sucesso.add(dataModificacaoString.contains(dataModificacao));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Filtro Data de lancamento
		String dataLancamento = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[8]/div")).getText();	
		System.out.println("");
		System.out.println("Valor enviado Data de Lancamento " + dataLancamento);
		
		inputDataDeLancamento.click();
		inputDataDeLancamento.sendKeys(dataLancamento);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]")).size();
		System.out.println("Rows Filtro Data de Lancamento: " + rows);
		
		String dataLancamentoString = "";
		
		for(int i = 0; i < rows; i++) {
			dataLancamentoString = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id]["+rows+"]/div[8]/div")).getText();			
			sucesso.add(dataLancamentoString.contains(dataLancamento));
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFechar.click();
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
