package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TabelaServicosVisualizarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Serviços\"]")
	public WebElement tabelaServicos;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUfV;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	
	@FindBy(xpath = "//span[@id=\"servicesCode\"]")
	public WebElement codigoServicioSistemaV;
	
	@FindBy(xpath = "//span[@id=\"servicesDescription\"]")
	public WebElement descripcionServicioSistemaV;

	@FindBy(xpath = "//span[@id=\"serviceObligationCode\"]")
	public WebElement codigoServicioObrigacaoV;
	
	@FindBy(xpath = "//span[@id=\"serviceObligationDescription\"]")
	public WebElement descripcionServicioObrigacaoV;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/input")
	public WebElement codigoUfD;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div/input")
	public WebElement obrigacaoD;
	
	@FindBy(xpath = "//div[@id=\"serviceCode\"]/div/div/div/input")
	public WebElement codigoServicioSistemaD;
	
	@FindBy(xpath = "//div[@id=\"serviceDescription\"]/div/div/div/input")
	public WebElement descripcionServicioSistemaD;
	
	@FindBy(xpath = "//div[@id=\"obligationCode\"]/div/div/input")
	public WebElement codigoServicioObrigacaoD;
	
	@FindBy(xpath = "//div[@id=\"obligationDescription\"]/div/div/input")
	public WebElement descripcionServicioObrigacaoD;
	
	public TabelaServicosVisualizarPO() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
	
		obrigacoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelaServicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("TabelaServicos");
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
		String textocodigoServicioSistemaV = codigoServicioSistemaV.getText();
		String textodescripcionServicioSistemaV = descripcionServicioSistemaV.getText();
		String textocodigoServicioObrigacaoV = codigoServicioObrigacaoV.getText();
		String textodescripcionServicioObrigacaoV = descripcionServicioObrigacaoV.getText();
		
		System.out.println("Código UF: " + textocodigoUfV);
		System.out.println("Obrigação: " + textoobrigacaoV);
		System.out.println("Código Serviço do Sistema: " + textocodigoServicioSistemaV);
		System.out.println("Descrição Serviço do Sistema: " + textodescripcionServicioSistemaV);
		System.out.println("Código Serviço Obrigação: " + textocodigoServicioObrigacaoV);
		System.out.println("Descrição Serviço Obrigação: " + textodescripcionServicioObrigacaoV);
		
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
		
		String textocodigoUfD =  codigoUfD.getAttribute("value");
		String textoobrigacaoD =  obrigacaoD.getAttribute("value");
		String textocodigoServicioSistemaD =  codigoServicioSistemaD.getAttribute("value");
		String textodescripcionServicioSistemaD =  descripcionServicioSistemaD.getAttribute("value");
		String textocodigoServicioObrigacaoD =  codigoServicioObrigacaoD.getAttribute("value");
		String textodescripcionServicioObrigacaoD =  descripcionServicioObrigacaoD.getAttribute("value");
		
		System.out.println("Código UF: " + textocodigoUfD);
		System.out.println("Obrigação: " + textoobrigacaoD);
		System.out.println("Código Serviço do Sistema: " + textocodigoServicioSistemaD);
		System.out.println("Descrição Serviço do Sistema: " + textodescripcionServicioSistemaD);
		System.out.println("Código Serviço Obrigação: " + textocodigoServicioObrigacaoD);
		System.out.println("Descrição Serviço Obrigação: " + textodescripcionServicioObrigacaoD);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(textocodigoUfD.equals(textocodigoUfV));
		sucesso.add(textoobrigacaoD.equals(textoobrigacaoV));
		sucesso.add(textocodigoServicioSistemaD.equals(textocodigoServicioSistemaV));
		sucesso.add(textodescripcionServicioSistemaD.equals(textodescripcionServicioSistemaV));
		sucesso.add(textocodigoServicioObrigacaoD.equals(textocodigoServicioObrigacaoV));
		sucesso.add(textodescripcionServicioObrigacaoD.equals(textodescripcionServicioObrigacaoV));
		System.out.println(sucesso);
		
		return sucesso;
	}

}
