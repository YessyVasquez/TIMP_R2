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

public class RegrasDeMensagensTabelasPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Mensagens\"]")
	public WebElement regrasdemensagens;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Tabelas\"]")
	public WebElement tabelas;
	
	@FindBy(xpath = "//button[@id=\"add-object\"]")
	public WebElement asociarTabela;

	@FindBy(xpath = "//div[@id=\"select-table\"]/div/div/div[2]")
	public WebElement tabela;
	
	@FindBy(xpath = "//li[text()=\"TA-TESTE NÃO MEXER\"]")
	//@FindBy(xpath = "//li[text()=\"TA_TESTE_VS2\"]")
	//@FindBy(xpath = "//li[text()=\"xxxAlíquota Interna\"]")
	public WebElement tabelaO;
	
	@FindBy(xpath = "//div[@id=\"main-icon\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED)\"]")
	public WebElement campoO;
	
	@FindBy(xpath = "//li[text()=\"Alíquota COFINS (ED)\"]")
	public WebElement campoO2;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div/div/div[1]/div/div/input")
	public WebElement nomeValor;
	
	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED)\"]")
	public WebElement nomeValorO;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div/div/div[4]/div/div/input")
	public WebElement nomeValor2;
	
	@FindBy(xpath = "//li[text()=\"TA-TESTE NÃO MEXER - ALIQUOTA_ICMS (VE)\"]")
	//@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED)\"]")
	public WebElement nomeValorO2;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acao;
	
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
	
	@FindBy(xpath = "//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = TA-TESTE NÃO MEXER -\")]")
	public WebElement regraAdicionada;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editarB;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirB;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]")
	public WebElement primeiraRegra;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement verificar;
	
	public RegrasDeMensagensTabelasPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> tabela() {
		
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
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelas.click();
		sleep(3000);
		asociarTabela.click();
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
		sleep(3000);
		
		adicionarCaminho.click();
		sleep(2000);
		
		nomeValor.sendKeys("Alíquota ICMS (ED)");
		sleep(1000);
		nomeValorO.click();
		sleep(1000);
		
		nomeValor2.sendKeys("TA-TESTE NÃO MEXER - ALIQUOTA_ICMS (VE)");
		sleep(2000);
		nomeValorO2.click();
		sleep(2000);
		
		acao.sendKeys("Alíquota RJ");
		acao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		aplicar.click();
		
		sleep(2000);
		
		int adicionada1 = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = TA-TESTE NÃO MEXER -\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		System.out.println(adicionada1 + " Verifcação de Caminho Adicionado 1");
		if (adicionada1>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		sleep(1000);
		
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
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int adicionada2 = driver.findElements(By.xpath("//*[name()=\"tspan\" and contains(text(),\" Alíquota ICMS = TA-TESTE NÃO MEXER -\")]")).size();
		
		System.out.println(adicionada2 + " Verifcação de Caminho Adicionado 2");
		if (adicionada2>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		sleep(1000);
		
		
		tabelas.click();
		sleep(3000);
		editarB.click();
		sleep(2000);
		campo.click();
		sleep(1000);
		campoO2.click();
		sleep(1000);
		aplicar.click();
		sleep(3000);
		fechar.click();
		sleep(3000);
		primeiraRegra.click();
		sleep(2000);
		remover.click();
		
		sleep(2000);
		
		tabelas.click();
		sleep(2000);
		excluirB.click();
		sleep(2000);
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
		
		String verificarT = verificar.getText();
		System.out.println(verificarT + "Gravado com sucesso");
		System.out.println(verificarT.contains("Regra atualizada com sucesso"));
		
		if (verificarT.contains("Regra atualizada com sucesso")) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}


}
