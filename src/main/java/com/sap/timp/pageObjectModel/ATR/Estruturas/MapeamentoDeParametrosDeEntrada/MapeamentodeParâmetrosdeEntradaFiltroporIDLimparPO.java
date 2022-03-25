package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapamentoEstruturas;
	

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {
		
		sleep(2000);
		mapamentoEstruturas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		boolean sucesso = idRegistro.equals(idBusqueda);
		
		limpar.click();
		sleep(3000);
		System.out.println(sucesso);

		return sucesso;

	}

}
