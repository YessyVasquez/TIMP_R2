package com.sap.timp.pageObjectModel.SCANC.ArquivosImportados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ArquivosImportadosNaVisualizacaoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Arquivos Importados\"]")
	public WebElement arquivosImportados;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//span[text()=\"Anexo V\"]")
	public WebElement anexoV;
	
	@FindBy(xpath = "//span[text()=\"Anexo XI\"]")
	public WebElement anexoXI;
	
	public ArquivosImportadosNaVisualizacaoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void filtrosAvancadosVisualizacao() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		arquivosImportados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "13";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "32";
		}
		
		System.out.println("ID Registro do Ambiente: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo III
		WebElement btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"advanced-filters-btn\"]"));
		WebElement btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		WebElement btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div/button[@id=\"reset-filters-btn\"]"));
		
		btnFiltrosAvancadosElement.click();
		sleep(2000);
		
		
		WebElement cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"ufDestProd\"]/div/div[2]/div/div[2]"));
		
		cboUfDestinoProduto.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		cboCnpjEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		cboRazaoSocialEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboUfEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		cboUfEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboCnpjSijPassivo = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"cnpjPassivo\"]/div/div[2]/div/div[2]"));
		cboCnpjSijPassivo.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjSijPassivo);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboFilial = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][1]/div/div[2]/div[@id=\"filial\"]/div/div[2]/div/div[2]"));
		cboFilial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo V
		anexoV.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"advanced-filters-btn\"]"));
		btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div/button[@id=\"reset-filters-btn\"]"));

		btnFiltrosAvancadosElement.click();
		sleep(2000);


		cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"ufDestProd\"]/div/div[2]/div/div[2]"));

		cboUfDestinoProduto.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		cboCnpjEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		cboRazaoSocialEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboUfEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		cboUfEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboCnpjSijPassivo = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"cnpjPassivo\"]/div/div[2]/div/div[2]"));
		cboCnpjSijPassivo.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjSijPassivo);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboFilial = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][2]/div/div[2]/div[@id=\"filial\"]/div/div[2]/div/div[2]"));
		cboFilial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Anexo XI
		anexoXI.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnFiltrosAvancadosElement = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"advanced-filters-btn\"]"));
		btnAplicarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"advanced-filters-btn-apply\"]"));
		btnLimpiarFiltros = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div/button[@id=\"reset-filters-btn\"]"));

		btnFiltrosAvancadosElement.click();
		sleep(2000);


		cboUfDestinoProduto = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"ufDestProd\"]/div/div[2]/div/div[2]"));

		cboUfDestinoProduto.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfDestinoProduto);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboCnpjEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"cnpjEmit\"]/div/div[2]/div/div[2]"));
		cboCnpjEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboRazaoSocialEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"socialReasonEmit\"]/div/div[2]/div/div[2]"));
		cboRazaoSocialEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboRazaoSocialEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboUfEmitente = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"ufEmit\"]/div/div[2]/div/div[2]"));
		cboUfEmitente.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboUfEmitente);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboCnpjSijPassivo = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"cnpjPassivo\"]/div/div[2]/div/div[2]"));
		cboCnpjSijPassivo.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboCnpjSijPassivo);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cboFilial = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper\")][3]/div/div[2]/div[@id=\"filial\"]/div/div[2]/div/div[2]"));
		cboFilial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		btnAplicarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
}
