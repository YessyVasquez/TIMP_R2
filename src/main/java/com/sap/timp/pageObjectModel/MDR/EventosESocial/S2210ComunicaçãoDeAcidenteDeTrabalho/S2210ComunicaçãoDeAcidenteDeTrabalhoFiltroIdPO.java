package com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroIdPO extends TestBaseSteven {

	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-communicationWorkAccident\"]")
	public WebElement subMenuComunicacaoDeAcidente;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	


	public S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {


		sleep(2000);
		menuEventosEsocial.click();
		sleep(2000);
		subMenuComunicacaoDeAcidente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = id.getText();

		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();

		boolean sucesso = idRegistro.equals(idBusqueda);

		return sucesso;

	}

}
