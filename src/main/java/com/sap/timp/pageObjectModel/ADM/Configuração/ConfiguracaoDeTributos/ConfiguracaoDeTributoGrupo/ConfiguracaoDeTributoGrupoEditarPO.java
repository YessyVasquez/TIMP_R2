package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoDeTributoGrupoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;

	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;

	@FindBy(xpath = "//span[text()=\"Configuração de Tributo Grupo\"]")
	public WebElement configuracaotributogrupo;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código grupo\"]")
	public WebElement codigogrupo;

	

	public ConfiguracaoDeTributoGrupoEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotributogrupo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter1();
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		codigogrupo.clear();
		codigogrupo.sendKeys("R8");
		
		String codigogrupootexto= codigogrupo.getAttribute("value");
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String codigogrupoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		
		boolean sucesso = false;
		sucesso= codigogrupootexto.contains(codigogrupoString);
		System.out.println(sucesso);

		return sucesso;

	}


}
