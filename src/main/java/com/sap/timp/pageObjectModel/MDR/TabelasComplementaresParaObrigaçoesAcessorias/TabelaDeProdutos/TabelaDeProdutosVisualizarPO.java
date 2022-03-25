package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TabelaDeProdutosVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Produtos\"]")
	public WebElement tabeladeprodutos;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUfV;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	
	@FindBy(xpath = "//span[@id=\"productCode\"]")
	public WebElement codigoProductoSistemaV;
	
	@FindBy(xpath = "//span[@id=\"productDescriptionAccessory\"]")
	public WebElement descripcionProductoSistemaV;

	@FindBy(xpath = "//span[@id=\"productObligationCode\"]")
	public WebElement codigoProductoObrigacaoV;
	
	@FindBy(xpath = "//span[@id=\"productObligationDescription\"]")
	public WebElement descripcionProductoObrigacaoV;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/input")
	public WebElement codigoUfD;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div/input")
	public WebElement obrigacaoD;
	
	@FindBy(xpath = "//div[@id=\"productCode\"]/div/div/div/input")
	public WebElement codigoProductoSistemaD;
	
	@FindBy(xpath = "//div[@id=\"productDescription\"]/div/div/div/input")
	public WebElement descripcionProductoSistemaD;

	@FindBy(xpath = "//div[@id=\"obligationCode\"]/div/div/input")
	public WebElement codigoProductoObrigacaoD;
	
	@FindBy(xpath = "//div[@id=\"obligationDescription\"]/div/div/input")
	public WebElement descripcionProductoObrigacaoD;
	
	public TabelaDeProdutosVisualizarPO() {
		
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		
		obrigacoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabeladeprodutos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("TabelaDeProdutos");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textocodigoUfV = codigoUfV.getText();
		String textoobrigacaoV = obrigacaoV.getText();
		String textocodigoProductoSistemaV = codigoProductoSistemaV.getText();
		String textodescripcionProductoSistemaV = descripcionProductoSistemaV.getText();
		String textocodigoProductoObrigacaoV = codigoProductoObrigacaoV.getText();
		String textodescripcionProductoObrigacaoV = descripcionProductoObrigacaoV.getText();
		
		System.out.println("Código UF: " + textocodigoUfV);
		System.out.println("Obrigação: " + textoobrigacaoV);
		System.out.println("Código Produto do Sistema: " + textocodigoProductoSistemaV );
		System.out.println("Descrição Produto do Sistema: " + textodescripcionProductoSistemaV);
		System.out.println("Código Produto Obrigação: " + textocodigoProductoObrigacaoV );
		System.out.println("Descrição Produto Obrigação: " + textodescripcionProductoObrigacaoV);
		
		
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		sleep(2000);
		sleep(2000);
		
		
		String textocodigoUfD = codigoUfD.getAttribute("value");
		String textoobrigacaoD = obrigacaoD.getAttribute("value");
		String textocodigoProductoSistemaD = codigoProductoSistemaD.getAttribute("value");
		String textodescripcionProductoSistemaD = descripcionProductoSistemaD.getAttribute("value");
		String textocodigoProductoObrigacaoD = codigoProductoObrigacaoD.getAttribute("value");
		String textodescripcionProductoObrigacaoD = descripcionProductoObrigacaoD.getAttribute("value");
		
		System.out.println("Código UF: " + textocodigoUfD);
		System.out.println("Obrigação: " + textoobrigacaoD);
		System.out.println("Código Produto do Sistema: " + textocodigoProductoSistemaD );
		System.out.println("Descrição Produto do Sistema: " + textodescripcionProductoSistemaD);
		System.out.println("Código Produto Obrigação: " + textocodigoProductoObrigacaoD );
		System.out.println("Descrição Produto Obrigação: " + textodescripcionProductoObrigacaoD);
		
		
ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(textocodigoUfD.equals(textocodigoUfV));
		sucesso.add(textoobrigacaoD.equals(textoobrigacaoV));
		sucesso.add(textocodigoProductoSistemaD.equals(textocodigoProductoSistemaV));
		sucesso.add(textodescripcionProductoSistemaD.equals(textodescripcionProductoSistemaV));
		sucesso.add(textocodigoProductoObrigacaoD.equals(textocodigoProductoObrigacaoV));
		sucesso.add(textodescripcionProductoObrigacaoD.equals(textodescripcionProductoObrigacaoV));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
