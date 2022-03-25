package com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class FatorDeCreditamentoFiltroPorIdPO extends TestBaseKenssy{
	@FindBy(xpath = "//li[contains(@identifier,\"accordion-item-creditFactor\")]")
	public WebElement fatorCreditamento;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public FatorDeCreditamentoFiltroPorIdPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtroPorId() {

		sleep(2000);
		fatorCreditamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = id.getText();
		System.out.println(" Id Registro a buscar: " + idRegistro );
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(" Id encontrado: " + idBusqueda );
		
		boolean sucesso = idRegistro.equals(idBusqueda);
		System.out.println(sucesso);

		return sucesso;

	}
}
