package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AgrupadorDeCFOPVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Agrupador de CFOP\"]")
	public WebElement agrupadordecfop;
	
	@FindBy(xpath = "//span[text()=\"Novo Agrupador de CFOP\"]")
	public WebElement novoagrupadordecfop;
	

	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"grouperCode\"]")
	public WebElement codigodeagrupamentovi;
	
	@FindBy(xpath = "//span[@id=\"cfopGrouper\"]")
	public WebElement agrupadordecfopvi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Agrupamento\"]")
	public WebElement codigodeagrupamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupador de CFOP\"]")
	public WebElement agrupadorcfop;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Obrigação \"]")
	public WebElement obrigacaoed;
	
	public AgrupadorDeCFOPVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		agrupadordecfop.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AgrupadorDeCFOP");
		
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
		String codigodeagrupamentovisualizar = codigodeagrupamentovi.getText();
		String agrupadordecfopvisualizar = agrupadordecfopvi.getText();
		String datavisualizar = datavi.getText();
				
		System.out.println(obrigacaovisualizar);
		System.out.println(codigodeagrupamentovisualizar);
		System.out.println(agrupadordecfopvisualizar);
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
		
		String obrigacaoeditar=obrigacaoed.getAttribute("value");
		String codigodeagrupamentoeditar=codigodeagrupamento.getAttribute("value");
		String agrupadordecfopeditar=agrupadorcfop.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println(codigodeagrupamentoeditar);
		System.out.println(agrupadordecfopeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(codigodeagrupamentovisualizar.equals(codigodeagrupamentoeditar));
		sucesso.add(agrupadordecfopvisualizar.equals(agrupadordecfopeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	
}
