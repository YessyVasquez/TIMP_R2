package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeAtribuicaoDeCodigoCFOPVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Atribuição de Código CFOP / Código de Ajuste para obrigação\"]")
	public WebElement tabeladeatribuicaodecodigocfop;
	
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Obrigação \"]")
	public WebElement obrigacaoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar CFOP\"]")
	public WebElement cfoped;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Ajuste\"]")
	public WebElement ajusteed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement dataed;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"cfop\"]")
	public WebElement cfopvi;
	
	@FindBy(xpath = "//span[@id=\"adjustments\"]")
	public WebElement ajustevi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	
	public TabelaDeAtribuicaoDeCodigoCFOPVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladeatribuicaodecodigocfop.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeAtribuicaoDeCodigoCFOP");
		
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
		String cfopvisualizar = cfopvi.getText();
		String datavisualizar = datavi.getText();
		String ajustevisualizar = ajustevi.getText();
	
		System.out.println(obrigacaovisualizar);
		System.out.println(cfopvisualizar);
		System.out.println(datavisualizar);
		System.out.println(ajustevisualizar);
	
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
		
		String obrigacaoeditar=obrigacaoed.getAttribute("value");
		String cfopeditar=cfoped.getAttribute("value");
		String ajusteeditar=ajusteed.getAttribute("value");
		String dataeditar=dataed.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println(cfopeditar);
		System.out.println(ajusteeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(cfopvisualizar.equals(cfopeditar));
		sucesso.add(ajustevisualizar.equals(ajusteeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	
}
