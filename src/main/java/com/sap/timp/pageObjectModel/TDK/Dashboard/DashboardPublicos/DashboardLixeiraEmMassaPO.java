package com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardPublicos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DashboardLixeiraEmMassaPO extends TestBaseMassiel{


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

	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item   \"][3]/button/span")
	public WebElement excluirMassa;

	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[3]/ul/li[3]")
	public WebElement lixeira;

	public DashboardLixeiraEmMassaPO() {
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
		nome.sendKeys("TESTEAUTOMATIZADO MASSIEL");
		sleep(2000);
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

		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);

		nome.click();
		sleep(1000);
		nome.sendKeys("TESTEAUTOMATIZADO MASSIEL");
		sleep(2000);
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

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();

		rows = rows-1;
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();

		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);

		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;

		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

	public boolean ExcluirMasas() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();

		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		idInserir("DashboardLixeiraEmMassa1",idRegistro1);

		check1.click();
		sleep(1000);

		rows = rows-1;

		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();

		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		idInserir("DashboardLixeiraEmMassa2",idRegistro2);

		check2.click();

		sleep(1000);

		excluirMassa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		driver.navigate().refresh();
		sleep(5000);
		waitExpectElement(dashboardspublicos);
		sleep(5000);



		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";

		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			System.out.println(id);
		}

		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);

		System.out.println("Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);

		boolean sucesso = false;

		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}

		return sucesso;
	}

	public boolean comparar() {

		String idRegistro11 =idObter("DashboardLixeiraEmMassa1");
		String idRegistro22 =idObter("DashboardLixeiraEmMassa2");

		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();

		rows = rows-1;

		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();


		boolean sucesso = false;

		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		double idRegistroD11 = convertToDouble(idRegistro11);
		double idRegistroD22 = convertToDouble(idRegistro22);

		if (idRegistroD1 == idRegistroD11 && idRegistroD2 == idRegistroD22) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);


		return sucesso;
	}
}
