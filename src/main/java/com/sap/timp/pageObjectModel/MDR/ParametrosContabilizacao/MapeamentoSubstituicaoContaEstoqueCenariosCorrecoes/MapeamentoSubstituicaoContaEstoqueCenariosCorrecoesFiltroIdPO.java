package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//li/div/span[contains(text(),\"Mapeamento para Substituição\")]")
	public WebElement contabil;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;

	public MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {

		
		sleep(2000);
		parametro.click();
		sleep(1000);
		contabil.click();
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
