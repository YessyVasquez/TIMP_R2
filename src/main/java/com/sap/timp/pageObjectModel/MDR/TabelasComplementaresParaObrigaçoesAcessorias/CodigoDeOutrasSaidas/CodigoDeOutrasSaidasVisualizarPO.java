package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoDeOutrasSaidasVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//div[@class=\"title\"]/span[text()=\"Código de Outras Saídas\"]")
	public WebElement codigodeoutrassaidas;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Obrigação \"]")
	public WebElement obrigacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Código de Outras Saídas\"]")
	public WebElement codigodesaidas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descrição de Outras Saídas\"]")
	public WebElement descricaodeoutrassaidas;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vigência de\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"otherOutputsCode\"]")
	public WebElement codigodesaidasvi;
	
	@FindBy(xpath = "//span[@id=\"otherOutputsDescription\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datavi;
	
	public CodigoDeOutrasSaidasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		codigodeoutrassaidas.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("CodigoDeOutrasSaidas");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigodesaidasvisualizar = codigodesaidasvi.getText();
		String descricaovisualizar = descricaovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigodesaidasvisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
	
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String obrigacaoeditar=obrigacao.getAttribute("value");
		String codigodesaidaseditar=codigodesaidas.getAttribute("value");
		String descricaoeditar = descricaodeoutrassaidas.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println(codigodesaidaseditar);
		System.out.println(descricaoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(codigodesaidasvisualizar.equals(codigodesaidaseditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	

}
