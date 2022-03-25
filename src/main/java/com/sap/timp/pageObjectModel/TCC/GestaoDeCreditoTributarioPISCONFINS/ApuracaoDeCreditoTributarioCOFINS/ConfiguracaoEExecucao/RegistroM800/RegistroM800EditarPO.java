package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM800;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM800EditarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM800\"]")
	public WebElement registrom800;


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

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Situação Tributária referente ao COFINS\"]")
	public WebElement codigo;

	public RegistroM800EditarPO() {

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
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom800.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM800");
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

		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		sleep(2000);
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		sleep(2000);

		codigo.clear();
		sleep(2000);
		codigo.sendKeys("R8");
		sleep(2000);
		String codigotexto = codigo.getAttribute("value");
		System.out.println("Codigo antes de atualizar:" + codigotexto);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();

		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		sleep(2000);
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		sleep(2000);


		String codigoatualizado = codigo.getAttribute("value");
		System.out.println(" Codigo pós atualizar:" + codigoatualizado);
		boolean sucesso = false;
		sucesso = codigoatualizado.contains(codigotexto);

		System.out.println(sucesso);

		return sucesso;

	}

}
