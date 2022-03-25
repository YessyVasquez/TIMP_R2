package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasParteBLALUR;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasParteBLALURFiltroIDPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastrosIRPJCSLL;
	
	@FindBy(xpath = "//span[text()=\"Contas Parte B LALUR/LACS\"]")
	public WebElement contasParteBLALURLACS;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public ContasParteBLALURFiltroIDPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {
		
		sleep(2000);
		cadastrosIRPJCSLL.click();
		sleep(2000);
		
		contasParteBLALURLACS.click();
		
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
		
		
		System.out.println(sucesso);

		return sucesso;

	}

}
