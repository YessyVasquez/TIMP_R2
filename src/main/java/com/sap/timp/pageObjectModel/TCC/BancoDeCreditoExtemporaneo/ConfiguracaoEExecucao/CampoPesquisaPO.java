package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CampoPesquisaPO extends TestBaseSteven {

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	

	public CampoPesquisaPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {

		String url = driver.getCurrentUrl();
	
		
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		configuracaoEExecucao.click();
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Id Registro a Pesquisar: " +idRegistro);
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElementOverlay();
		
		String idBusqueda = id.getText();
		System.out.println("Id da Busqueda: " +idBusqueda);
		boolean sucesso = idRegistro.equals(idBusqueda);
		
		System.out.println(sucesso);
		return sucesso;

	}

}
