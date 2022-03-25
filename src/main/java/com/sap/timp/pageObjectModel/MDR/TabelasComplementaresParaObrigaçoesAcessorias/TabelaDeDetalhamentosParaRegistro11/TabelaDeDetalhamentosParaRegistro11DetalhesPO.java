package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeDetalhamentosParaRegistro11DetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Detalhamentos para Registro 11\"]")
	public WebElement tabeladedetalhamentos11;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement obrigacaode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement codigododetalhamentode;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement tipodedetalhamentode;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"detailingCode\"]")
	public WebElement codigododetalhamentovi;
	
	@FindBy(xpath = "//span[@id=\"detailingType\"]")
	public WebElement tipodedetalhamentovi;
	

	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	public TabelaDeDetalhamentosParaRegistro11DetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladedetalhamentos11.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeDetalhamentoParaRegistro11");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String obrigacaodetalhes = obrigacaode.getText();
		String codigododetalhamentodetalhes = codigododetalhamentode.getText();
		String tipodedetalhamentodetalhes = tipodedetalhamentode.getText();
	
		
		System.out.println(obrigacaodetalhes);
		System.out.println(codigododetalhamentodetalhes);
		System.out.println(tipodedetalhamentodetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TabelaDeDetalhamentoParaRegistro11");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigododetalhamentovisualizar = codigododetalhamentovi.getText();
		String tipodedetalhamentosvisualizar = tipodedetalhamentovi.getText();
	
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigododetalhamentovisualizar);
		System.out.println(tipodedetalhamentosvisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaodetalhes));
		sucesso.add(codigododetalhamentovisualizar.equals(codigododetalhamentodetalhes));
		sucesso.add(tipodedetalhamentosvisualizar.equals(tipodedetalhamentodetalhes));
		
		return sucesso;
	}


}
