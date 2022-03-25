package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais;

import java.util.ArrayList;

//import org.omg.DynamicAny.NameDynAnyPair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoEditarPO extends TestBaseFernando {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path-start\")]")
	public WebElement caminho;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//input[@placeholder=\"Descrição\"]")
	public WebElement descricao;

	@FindBy(xpath = "//input[@placeholder=\"Código\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div/div/div[2]")
	public WebElement operador;

	@FindBy(xpath = "//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = BC ICMS\")]")
	public WebElement caixaCopia;

	@FindBy(xpath = "//textarea")
	public WebElement descricaoConf;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement salvarComoCopia;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[text()=\"=\"]")
	public WebElement opcaoO;


	public RegrasDeEscrituraçãoEditarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> editar() {

		String url = driver.getCurrentUrl();

		boolean tp1 = false;

		if (url.contains("tp1")) {
			tp1 = true;
		}

		invisibilityOfElementOverlay();
		
		regraDeEscrituracao.click();

		invisibilityOfElementOverlay();

		btnUltimaPagina.click();
		
		invisibilityOfElementOverlay();

		String idRegistro = idObter("RegraDeEscrituracao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(caminho);
		sleep(3000);
		
		caminho.click();
		sleep(2000);
		descricao.sendKeys("teste");
		sleep(1000);
		modificar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int descricao = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\"teste\")]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (descricao > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(descricao);
		System.out.println("Modificacao Caminho: " + sucesso.get(0));
		
		
		caminho.click();
		invisibilityOfElementOverlay();

		codigo.clear();
		sleep(1000);
		codigo.sendKeys("r2");
		sleep(1000);

		operador.click();
		sleep(1000);
		opcaoO.click();
		sleep(1000);
		
		salvarComoCopia.click();
		sleep(3000);
		
		int copia = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = BC ICMS\")]")).size();
		
		if (copia == 1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(copia);
		System.out.println("Criação Cópia: " + sucesso.get(1));
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(300);
		waitExpectElement(caminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		copia = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = BC ICMS\")]")).size();
		
		if (copia == 1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(copia);
		System.out.println("Verificação Cópia: " + sucesso.get(2));
		
		caixaCopia.click();

		invisibilityOfElementOverlay();
		
		remover.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(300);
		waitExpectElement(caminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		copia = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = BC ICMS\")]")).size();
		
		if (copia == 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(copia);
		System.out.println("Verificação exclusão Cópia: " + sucesso.get(3));
		
		configuracoes.click();
		
		waitExpectElement(descricaoConf);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		
		String enviar = "Teste Editar";
		descricaoConf.clear();
		sleep(1000);
		descricaoConf.sendKeys(enviar);
		sleep(2000);
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(300);
		waitExpectElement(caminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		configuracoes.click();
		waitExpectElement(descricaoConf);
		invisibilityOfElementOverlay();
		
		sleep(2000);
		
		String texto = descricaoConf.getAttribute("value");
		
		
		if (texto.equals(enviar)) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(texto + " Texto obtido após edição");
		System.out.println("Verificação Modificação Configuração: " +sucesso.get(4));
		
		return sucesso;

	}

}
