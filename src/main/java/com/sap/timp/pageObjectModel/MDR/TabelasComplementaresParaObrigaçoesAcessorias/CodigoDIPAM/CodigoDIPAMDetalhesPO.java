package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoDIPAMDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//div[@class=\"title\"]/span[text()=\"Código DIPAM\"]")
	public WebElement codigodipam;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[2]/div/div")
	public WebElement obrigacaode;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[3]/div/div")
	public WebElement codigodipamde;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[4]/div/div")
	public WebElement cabeçalhode;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[5]/div/div")
	public WebElement descricaode;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[6]/div/div")
	public WebElement datade;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"dipamCodes\"]")
	public WebElement codigodipamvi;
	
	@FindBy(xpath = "//span[@id=\"header\"]")
	public WebElement cabecalhovi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public CodigoDIPAMDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		codigodipam.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("CodigoDIPAM");
		
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
		String codigodipamdetalhes = codigodipamde.getText();
		String cabecalhodetalhes = cabeçalhode.getText();
		String descricaodetalhes = descricaode.getText();
		String datadetalhes = datade.getText();
		
		System.out.println(obrigacaodetalhes);
		System.out.println(codigodipamdetalhes);
		System.out.println(cabecalhodetalhes);
		System.out.println(descricaodetalhes);
		System.out.println(datadetalhes);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigodipamvisualizar = codigodipamvi.getText();
		String cabecalhovisualizar = cabecalhovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigodipamvisualizar);
		System.out.println(cabecalhovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaodetalhes));
		sucesso.add(codigodipamvisualizar.equals(codigodipamdetalhes));
		sucesso.add(cabecalhovisualizar.equals(cabecalhodetalhes));
		sucesso.add(descricaovisualizar.equals(descricaodetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		
		return sucesso;
	}
}
