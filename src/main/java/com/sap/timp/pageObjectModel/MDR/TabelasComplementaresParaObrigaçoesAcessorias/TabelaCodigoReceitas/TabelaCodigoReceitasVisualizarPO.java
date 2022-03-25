package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TabelaCodigoReceitasVisualizarPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Código da Receitas\"]")
	public WebElement rabelacodigoReceita;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUfV;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoReceitaV;
	
	@FindBy(xpath = "//span[@id=\"revenueDescription\"]")
	public WebElement descripcionReceitaV;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/input")
	public WebElement codigoUfD;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div/div/input")
	public WebElement obrigacaoD;
	
	@FindBy(xpath = "//div[@id=\"revenueCode\"]/div/div/input")
	public WebElement codigoReceitaD;
	
	@FindBy(xpath = "//div[@id=\"revenueDescription\"]/div/div/input")
	public WebElement descripcionReceitaD;
	
	public TabelaCodigoReceitasVisualizarPO() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  visualizar() {
		
		obrigacoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rabelacodigoReceita.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("TabelaCodigoReceitas");
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
		String textocodigoReceitaV = codigoReceitaV.getText();
		String textodescripcionReceitaV = descripcionReceitaV.getText();
		
		System.out.println("Código UF: " + textocodigoUfV);
		System.out.println("Obrigação: " + textoobrigacaoV);
		System.out.println("Código da Receita: " + textocodigoReceitaV );
		System.out.println("Descrição Código da Receita: " + textodescripcionReceitaV);
		
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
		String textocodigoReceitaD = codigoReceitaD.getAttribute("value");
		String textodescripcionReceitaD = descripcionReceitaD.getAttribute("value");
		
		System.out.println("Código UF: " + textocodigoUfD);
		System.out.println("Obrigação: " + textoobrigacaoD);
		System.out.println("Código da Receita: " + textocodigoReceitaD );
		System.out.println("Descrição Código da Receita: " + textodescripcionReceitaD);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(textocodigoUfD.equals(textocodigoUfV));
		sucesso.add(textoobrigacaoD.equals(textoobrigacaoV));
		sucesso.add(textocodigoReceitaD.equals(textocodigoReceitaV));
		sucesso.add(textodescripcionReceitaD.equals(textodescripcionReceitaV));
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
