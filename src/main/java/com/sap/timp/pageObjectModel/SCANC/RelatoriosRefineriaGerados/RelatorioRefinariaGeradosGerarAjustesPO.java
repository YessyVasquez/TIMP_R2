package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;

public class RelatorioRefinariaGeradosGerarAjustesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Executar Ajustes\"]")
	public WebElement btnExecutarAjustes;
	
	@FindBy(xpath = "//button[text()=\"Criar/Atualizar\"]")
	public WebElement btnCriarActualizar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"][2]/div/div/button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"][1]/div/div/button[text()=\"Fechar\"]")
	public WebElement btnFechar2;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement btnHome;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-tax_01\"]")
	public WebElement icmsST;
	
	@FindBy(xpath = "//button[@id=\"advancedFiltersBtn\"]")
	public WebElement btnFiltrosAvancados;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div[2]")
	public WebElement cboUsuarioDeCriacao;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item visible\" and text()=\"TESTE AUTOMATIZADO\"]")
	public WebElement opcionUsuarioCriacao;
	
	@FindBy(xpath = "//div[@id=\"creationDate\"]/div/div[1]/span")
	public WebElement inputDataDeCriacao;
	
	@FindBy(xpath = "//body/div[@class=\"range-popup-wrapper large\"]/div[2]/div[@class=\"footer-wrapper\"]/div[@class=\"button-wrapper\"]/button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement btnFiltrosAvancadosAjustes;
	
	@FindBy(xpath = "//span[text()=\"Aplicar Filtros\"]")
	public WebElement btnAplicarFiltros;
	
	@FindBy(xpath = "//div[@id=\"limitSelect\"]/div/div/div/input")
	public WebElement inputValorLimitador;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/div/div/button[@id=\"advanced-filters-btn\"]")
	public WebElement btnFiltrosAvancadodsAnexoVI;
	
	@FindBy(xpath = "//div[@id=\"ufDestRelatorio\"]/div/div[2]/div/div[2]")
	public WebElement cboUfDestRelatorio;
	
	@FindBy(xpath = "//div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboCnpjEmitente;

	@FindBy(xpath = "//div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboRazaoSocialEmitente;
	
	@FindBy(xpath = "//div[@id=\"ufEmit\"]/div/div[2]/div/div[2]")
	public WebElement cboUfEmitente;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/div/div/button[@id=\"advanced-filters-btn-apply\"]")
	public WebElement btnAplicarFiltrosAnexoVI;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	public RelatorioRefinariaGeradosGerarAjustesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> gerarAjustes() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "9";
		}
		
		System.out.println("ID: " + idRegistro);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement marcarCheckBox = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[2]/label/span"));
		marcarCheckBox.click();
		sleep(5000);
		
		btnExecutarAjustes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]/div[@class=\"base-loader-container\"]/div/div");
		sleep(3000);
		
		btnCriarActualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]/div[@class=\"base-loader-container\"]/div/div");
		sleep(3000);
		
		waitExpectElement(btnFechar);
		btnFechar.click();
		sleep(1000);
		btnFechar2.click();
		sleep(1000);
		
		btnHome.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		AcessarTAAPO acessarTAA = new AcessarTAAPO();
		acessarTAA.acessarTAA();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		icmsST.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnFiltrosAvancados.click();
		sleep(2000);
		
		cboUsuarioDeCriacao.click();
		sleep(1000);
		
		if (url.contains("tc2")) {
			opcionUsuarioCriacao =  driver.findElement(By.xpath("//li[@tabindex=\"0\" and @id and contains(@class, \"list-item\") and text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]"));
		}
		opcionUsuarioCriacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		Calendar c1 = Calendar.getInstance();
		String dia = Integer.toString(c1.get(Calendar.DATE));
		System.out.println("DIA ACTUAL: " + dia);
		
		inputDataDeCriacao.click();
		sleep(1000);
		
		WebElement fecha1 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[@class=\"dates-wrapper\"]/div[@class= \"date\" and @tabindex=\"0\" and text()=\""+dia+"\"]"));
		fecha1.click();
		
		WebElement fecha2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[@class=\"dates-wrapper\"]/div[@class= \"date specialSelected\" and @tabindex=\"0\" and text()=\""+dia+"\"]"));
		fecha2.click();
		
		btnAplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows Filtro Status: " + rows);
		
		String subperiodo = "01/2016, 1M";
		String subperiodoString = "";
		
		int j = 1;
		for(int i = 0; i < rows; i++) {
			subperiodoString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id]["+j+"]/div[14]/div")).getText();			
			sucesso.add(subperiodoString.equals(subperiodo));
		}
		
		// Guardamos los datos del registro segun el ambiente
		String idRegistroTAA = "0";
		
		if(url.contains("tq1")) {
			idRegistroTAA = "613";
		}
		
		if(url.contains("tc2")) {
			idRegistroTAA = "236";
		}
		
		sleep(3000);
		
		String valorAjuste = driver.findElement(By.xpath("//div[@data-id and contains(@class, \"tr\") and contains(@aria-label, \"ID Associação Cod Ajuste: "+idRegistroTAA+"\")]/div[12]/div")).getText();
		System.out.println("");
		System.out.println("Valor Ajuste: " + valorAjuste);
				
		btnHome.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		AcessarSCANCPO acessarSCANCPO = new AcessarSCANCPO();
		acessarSCANCPO.acessarSCANC();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnAjuste.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnFiltrosAvancadosAjustes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		WebElement dataMoficicacao = driver.findElement(By.xpath("//div[@id=\"dateModification\"]/div/div/input"));
		dataMoficicacao.sendKeys(fechaActual());
		
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idRegistroAjuste = "0";
		
		if(url.contains("tq1")) {
			idRegistroAjuste = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistroAjuste = "13";
		}
		
		System.out.println("");
		System.out.println("ID AJUSTE:" + idRegistroAjuste);
		
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistroAjuste+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistroAjuste+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorCampoSaidaVerificar = "A6Q1L116";
		String valorLimitadorVerificar = "1.1.2";
		
		System.out.println("");
		System.out.println("Valor campo saida a confirmar: " + valorCampoSaidaVerificar);
		System.out.println("Valor limitador a confirmar: " + valorLimitadorVerificar);
		
		String valorCampoSaidaString = driver.findElement(By.xpath("//div[@id=\"outputSelect\"]/div/div/div/input")).getAttribute("value").replace(".", "");
		
		waitExpectElement(inputValorLimitador);
		attributoNotToBeEmptyElement(inputValorLimitador, "value");
		String valorCampoLimitadorString = inputValorLimitador.getAttribute("value");
		
		System.out.println("");
		System.out.println("Valor campo saida: " + valorCampoSaidaString);
		System.out.println("Valor limitador: " + valorCampoLimitadorString);
		
		sucesso.add(valorCampoSaidaString.equals(valorCampoSaidaVerificar));
		sucesso.add(valorCampoLimitadorString.contains(valorLimitadorVerificar));
		
		
		sleep(1000);
		btnFechar.click();
		sleep(1000);
		btnFechar2.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnFiltrosAvancadodsAnexoVI);
		btnFiltrosAvancadodsAnexoVI.click();
		sleep(2000);
		
		cboUfDestRelatorio.click();
		WebElement opcionUfDestRelatorio;
		
		if(url.contains("tq1")) {
			opcionUfDestRelatorio = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"MS\"]"));
			opcionUfDestRelatorio.click();
		}
		
		if(url.contains("tc2")) {
			opcionUfDestRelatorio = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"BA\"]"));
			opcionUfDestRelatorio.click();
		}
		
		sleep(1000);
		closeSelectTypeCheckbox(cboUfDestRelatorio);
		
		cboCnpjEmitente.click();
		WebElement opcionCnpj;
		
		if(url.contains("tq1")) {
			opcionCnpj = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"74544297000192\"]"));
			opcionCnpj.click();
			sleep(1000);
			closeSelectTypeCheckbox(cboCnpjEmitente);
		}
		
		if(url.contains("tc2")) {			
			WebElement inputCnpjFiltro = driver.findElement(By.xpath("//div[@id=\"cnpjEmit\"]/div/div[2]/div/div/div[2]/input"));
			inputCnpjFiltro.sendKeys("33000167014323");
			inputCnpjFiltro.sendKeys(Keys.ENTER);
		}
		
		sleep(1000);
		cboRazaoSocialEmitente.click();
		WebElement opcionRazaoSocial;
		
		if(url.contains("tq1")) {
			opcionRazaoSocial = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"PETROLEO BRASILEIRO S/A(A3Q2)\"]"));
			opcionRazaoSocial.click();
		}
		
		if(url.contains("tc2")) {
			opcionRazaoSocial = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"PETROLEO BRASILEIRO S A PETROBRAS\"]"));
			opcionRazaoSocial.click();
		}
		
		sleep(1000);
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		
		cboUfEmitente.click();
		WebElement opcionUfEmitente;
		
		if(url.contains("tq1")) {
			opcionUfEmitente = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"SP\"]"));
			opcionUfEmitente.click();
		}
		
		if(url.contains("tc2")) {
			opcionUfEmitente = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"BA\"]"));
			opcionUfEmitente.click();
		}
		
		sleep(1000);
		closeSelectTypeCheckbox(cboUfEmitente);
		sleep(2000);
		btnAplicarFiltrosAnexoVI.click();
		sleep(2000);
		
		
		String valor = driver.findElement(By.xpath("//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[9]/div/div[2]")).getText();
		System.out.println("valor del final: "+valor);
		sucesso.add(valor.equals(valorAjuste));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
