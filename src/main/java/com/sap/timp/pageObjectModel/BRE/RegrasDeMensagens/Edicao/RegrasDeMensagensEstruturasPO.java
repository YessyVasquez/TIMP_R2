package com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RegrasDeMensagensEstruturasPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Mensagens\"]")
	public WebElement regrasdemensagens;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Estruturas\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//button[text()=\"Create estructuras associadas\"]")
	public WebElement crearEstruturas;

	@FindBy(xpath = "//div[@id=\"select-associatedStructure\"]/div/div/div[2]")
	public WebElement tabela;
	
	//@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement tabelaO;
	
	@FindBy(xpath = "//div[@id=\"main-icon\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED)\"]")
	public WebElement campoO;
	
	@FindBy(xpath = "//div[@class=\"has-list\"]/div/div/div")
	public WebElement regraAplicada;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editarB;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirB;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"campo\")]")
	public WebElement campoE;
	
	@FindBy(xpath = "//li[text()=\"ID ajuste (ED)\"]")
	public WebElement campoEO;
	
	@FindBy(xpath = "//div[@class=\"no-list\"]")
	public WebElement noList;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//li[contains(@class,\"toast-success\")]/div/span[3]")
	public WebElement fecharSuccess;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	

	
	public RegrasDeMensagensEstruturasPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> estrutura() {
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("RegraDeMensagens");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		sleep(3000);
		crearEstruturas.click();
		sleep(3000);
		
		tabela.click();
		sleep(1000);
		tabelaO.click();
		sleep(1000);
		
		campo.click();
		sleep(1000);
		campoO.click();
		sleep(1000);
		
		
		aplicar.click();
		sleep(3000);
		fechar.click();
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		sleep(3000);
		int visible = driver.findElements(By.xpath("//div[@class=\"has-list\"]/div/div/div")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String reglaAplicadaS = regraAplicada.getText();
		System.out.println(reglaAplicadaS);
		if (visible > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		if (reglaAplicadaS.equals("Ajustes Fiscais")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		
		System.out.println(sucesso);

		sleep(3000);
		editarB.click();
		sleep(3000);
		campoE.clear();
		sleep(1000);
		campoE.sendKeys("ID");
		sleep(1000);
		campoEO.click();
		sleep(1000);
		aplicar.click();
		sleep(3000);
		fechar.click();
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(1000);
		
		
		
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		sleep(3000);
		editarB.click();
		sleep(3000);
		String campoT = campoE.getAttribute("value");
		sleep(1000);
		System.out.println(campoT);
		sleep(1000);
		
	    System.out.println(campoT.equals("ID ajuste (ED)")  + " Verificação após edição");
	    aplicar.click();
	    sleep(2000);
	    excluirB.click();
	    sleep(2000);
	    waitExpectElement(ok);
	    sleep(1000);
	    ok.click();
	    sleep(2000);
	    fechar.click();
	    sleep(2000);
	    gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(1000);

		
		
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		sleep(3000);
		
		String noListT = noList.getText();
		System.out.println(noListT);
		System.out.println(noListT.equals("A regra ainda não tem estructuras associadas") + " Apos Exclusão Estritura");
		
		if (noListT.equals("A regra ainda não tem estructuras associadas")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		

		
		
	}


}
