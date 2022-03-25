package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UnidadeDeMedidaFiltroCodigoPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Unidade de Medida\"]")
	public WebElement unidadeDeMedida;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")
	public WebElement codigo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public UnidadeDeMedidaFiltroCodigoPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {

		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		unidadeDeMedida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = codigo.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = codigo.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		boolean sucesso = idBusqueda.equals(idRegistro);

		return sucesso;

	}

}
