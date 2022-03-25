package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Anexo VII\"]")
	public WebElement anexoVII;
	
	@FindBy(xpath = "//span[text()=\"Anexo XII\"]")
	public WebElement anexoXII;
	
	
	public RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosAvancadosNavisualizacao() {
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
			idRegistro = "26";
		}
		
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		WebElement btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"advanced-filters-btn\"]"));
		WebElement btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		WebElement btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"reset-filters-btn\"]"));
		
		btnFiltrosAvancadosElement.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso= new ArrayList<Boolean>();
		
		WebElement cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"ufDestRelatorio\"]/div/div[2]/div/div[2]"));
		
		cboUfDestinoProduto.click();
		sleep(1000);
		WebElement opcionUfDestinoProduto = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"BA\"]"));
		opcionUfDestinoProduto.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorAVerificarString = "BA";
		String valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"BA\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Uf Destino Produto...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro uf destino produto...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		
		cboCnpjEmitente.click();
		sleep(1000);
		WebElement opcionCnpjEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"33000167105639\"]"));
		opcionCnpjEmitente.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "33000167105639";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"33000167105639\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro CNPJ Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro CNPJ Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		
		cboRazaoSocialEmitente.click();
		sleep(1000);
		WebElement opcionRazaoSocialEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"Petróleo Brasileiro S.A.\"]"));
		opcionRazaoSocialEmitente.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "Petróleo Brasileiro S.A.";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"Petróleo Brasileiro S.A.\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Razao Social...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro Razao Social..");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboUFEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		
		cboUFEmitente.click();
		sleep(1000);
		WebElement opcionUfEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"SP\"]"));
		opcionUfEmitente.click();
		closeSelectTypeCheckbox(cboUFEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "SP";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"SP\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro UF Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro UF Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo VII
		System.out.println("");
		System.out.println("Anexo VII");
		anexoVII.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"advanced-filters-btn\"]"));
		btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"reset-filters-btn\"]"));
		
		btnFiltrosAvancadosElement.click();
		sleep(2000);
		
		cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"ufDestRelatorio\"]/div/div[2]/div/div[2]"));
		
		cboUfDestinoProduto.click();
		sleep(1000);
		opcionUfDestinoProduto = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"BA\"]"));
		opcionUfDestinoProduto.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "BA";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"BA\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Uf Destino Produto...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro uf destino produto...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		
		cboCnpjEmitente.click();
		sleep(1000);
		opcionCnpjEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"33000167105639\"]"));
		opcionCnpjEmitente.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "74544297000273";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"74544297000273\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro CNPJ Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro CNPJ Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		
		cboRazaoSocialEmitente.click();
		sleep(1000);
		opcionRazaoSocialEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"Petróleo Brasileiro S.A.\"]"));
		opcionRazaoSocialEmitente.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "Petróleo Brasileiro S.A.";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"Petróleo Brasileiro S.A.\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Razao Social...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro Razao Social..");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboUFEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		
		cboUFEmitente.click();
		sleep(1000);
		opcionUfEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"SP\"]"));
		opcionUfEmitente.click();
		closeSelectTypeCheckbox(cboUFEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "SP";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"SP\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro UF Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro UF Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo XII
		System.out.println("");
		System.out.println("Anexo XII");
		anexoXII.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"advanced-filters-btn\"]"));
		btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"reset-filters-btn\"]"));
		
		btnFiltrosAvancadosElement.click();
		sleep(2000);
		
		cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"ufDestRelatorio\"]/div/div[2]/div/div[2]"));
		
		cboUfDestinoProduto.click();
		sleep(1000);
		opcionUfDestinoProduto = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"BA\"]"));
		opcionUfDestinoProduto.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "BA";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"BA\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Uf Destino Produto...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro uf destino produto...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		
		cboCnpjEmitente.click();
		sleep(1000);
		opcionCnpjEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"74544297000192\"]"));
		opcionCnpjEmitente.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "74544297000192";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"74544297000192\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro CNPJ Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro CNPJ Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		
		cboRazaoSocialEmitente.click();
		sleep(1000);
		opcionRazaoSocialEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"PETROLEO BRASILEIRO S A PETROBRAS (A11Q2)\"]"));
		opcionRazaoSocialEmitente.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "PETROLEO BRASILEIRO S A PETROBRAS (A11Q2)";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"PETROLEO BRASILEIRO S A PETROBRAS (A11Q2)\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro Razao Social...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro Razao Social..");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboUFEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		
		cboUFEmitente.click();
		sleep(1000);
		opcionUfEmitente = driver.findElement(By.xpath("//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[2][text()=\"SP\"]"));
		opcionUfEmitente.click();
		closeSelectTypeCheckbox(cboUFEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAVerificarString = "SP";
		valorString = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[3]/div/div[1]/div/div/div[@class=\"annexe-section-column container-element\"]/div[text()=\"SP\"]")).getText();
		
		if(valorString.equals(valorAVerificarString)) {
			System.out.println("Verificado filtro UF Emitente...");
			sucesso.add(true);
		}else {
			System.out.println("No se confirmo filtro UF Emitente...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
