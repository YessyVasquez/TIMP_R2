package com.sap.timp.pageObjectModel.TDK.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;


public class DashboardCriarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;

	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//span[text()=\"Novo Dashboard\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Dashboard\"]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement classificacao;

	@FindBy(xpath = "//li[@id][text()=\"Relatorios Gerenciais\"]")
	public WebElement opcaoclassificacao;

	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement classificacaoacesso;

	@FindBy(xpath = "//li[@id][text()=\"1 - Público\"]")
	public WebElement opcaoclassificacaoacesso;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Nao;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;

	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	public DashboardCriarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println("Ultimo registro: " + id);

		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);

		nome.click();
		sleep(1000);
		nome.sendKeys("Dashboard 1 - NÃO MEXER ");
		sleep(1000);
		attributeToBeXpath("//div[@id=\"classification\"]/div", "class", "base-select required");
		sleep(4000);
		classificacao.click();
		sleep(1000);
		opcaoclassificacao.click();
		sleep(1000);

		classificacaoacesso.click();
		sleep(1000);
		opcaoclassificacaoacesso.click();
		sleep(1000);

		gravar.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		idInserir("dashboardsCriar",idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);

		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;

	}
	

}
