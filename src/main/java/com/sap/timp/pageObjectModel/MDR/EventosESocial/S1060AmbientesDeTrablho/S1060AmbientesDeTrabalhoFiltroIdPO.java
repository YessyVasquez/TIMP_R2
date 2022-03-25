package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1060AmbientesDeTrabalhoFiltroIdPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"S1060 - Ambientes de Trabalho\"]")
	public WebElement s106ambientesdetrabalho;
	

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	


	public S1060AmbientesDeTrabalhoFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {


		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		s106ambientesdetrabalho.click();
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
