package com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MovimentoSCANCFiltroIdPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Movimento SCANC\"]")
	public WebElement movimentoScanc;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	


	public MovimentoSCANCFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {


		sleep(2000);
		scanc.click();
		sleep(2000);
		movimentoScanc.click();
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
		System.out.println(sucesso);
		return sucesso;

	}

}
