package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeProdutosDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Produtos\"]")
	public WebElement tabeladeprodutos;
	
	@FindBy(xpath = "//span[text()=\"Nova Tabela de Produtos\"]")
	public WebElement novotabeladeprodutos;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement codigoproduto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement descricaoproduto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement codigoobrigacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement descricaoobrigacao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"productCode\"]")
	public WebElement codigoprodutovi;
	
	@FindBy(xpath = "//span[@id=\"productDescriptionAccessory\"]")
	public WebElement descricaoprodutovi;
	
	@FindBy(xpath = "//span[@id=\"productObligationCode\"]")
	public WebElement codigoobrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"productObligationDescription\"]")
	public WebElement descricaoobrigacaovi;
	
	public TabelaDeProdutosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladeprodutos.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeProdutos");
		
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
		String ufdetalhes = uf.getText();
		String obrigacaodetalhes = obrigacao.getText();
		String codigoprodutodetalhes = codigoproduto.getText();
		String descricaoprodutodetalhes = descricaoproduto.getText();
		String codigoobrigacaodetalhes = codigoobrigacao.getText();
		String descricaoobrigacaodetalhes = descricaoobrigacao.getText();
	
		
		System.out.println(ufdetalhes);
		System.out.println(obrigacaodetalhes);
		System.out.println(codigoprodutodetalhes);
		System.out.println(descricaoprodutodetalhes);
		System.out.println(codigoobrigacaodetalhes);
		System.out.println(descricaoobrigacaodetalhes);
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TabelaDeProdutos");
		
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
		
		String ufvisualizar = ufvi.getText();
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigoprodutovisualizar = codigoprodutovi.getText();
		String descricaoprodutovisualizar = descricaoprodutovi.getText();
		String codigoobrigacaovisualizar = codigoobrigacaovi.getText();
		String descricaoobrigacaovisualizar = descricaoobrigacaovi.getText();
		
		
		System.out.println(ufvisualizar);
		System.out.println(obrigacaovisualizar);
		System.out.println(codigoprodutovisualizar);
		System.out.println( descricaoprodutovisualizar);
		System.out.println( codigoobrigacaovisualizar);
		System.out.println(descricaoobrigacaovisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(ufvisualizar.equals(ufdetalhes));
		sucesso.add(obrigacaovisualizar.equals(obrigacaodetalhes));
		sucesso.add(codigoprodutovisualizar.equals(codigoprodutodetalhes));
		sucesso.add( descricaoprodutovisualizar.equals( descricaoprodutodetalhes));
		sucesso.add(codigoobrigacaovisualizar.equals(codigoobrigacaodetalhes));
		sucesso.add(descricaoobrigacaovisualizar.equals(descricaoobrigacaodetalhes));
		
		
		return sucesso;
	}

}
