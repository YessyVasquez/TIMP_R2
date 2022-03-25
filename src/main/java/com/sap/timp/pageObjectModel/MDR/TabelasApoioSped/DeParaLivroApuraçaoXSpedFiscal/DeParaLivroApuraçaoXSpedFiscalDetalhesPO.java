package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeParaLivroApuraçaoXSpedFiscalDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement livroapuracao;
	
	@FindBy(xpath = "//span[text()=\"Novo DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement novolivroapuracao;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"line\"]/div/div/div[2]")
	public WebElement linha;

	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaolinha;
	

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
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy (xpath = "//*[@id=\"detail-description\"]/div[2]/div[1]")
	public WebElement tributode;
	
	@FindBy (xpath = "//*[@id=\"detail-description\"]/div[2]/div[2]")
	public WebElement tipotributode;
	
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"tipoTributo\"]")
	public WebElement tipotributovi;
	
	
	public DeParaLivroApuraçaoXSpedFiscalDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		livroapuracao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("deparalivroapuracaoxspedfiscal");
		
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
		String tributodetalhe = tributode.getText();
		String tipotributodetalhe = tipotributode.getText();
		
		System.out.println(tributodetalhe);
		System.out.println(tipotributodetalhe);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("deparalivroapuracaoxspedfiscal");
		
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
		
		String tributovisualizar = tributovi.getText();
		String tipotributovisualizar= tipotributovi.getText();
		
		System.out.println(tributovisualizar);
		System.out.println(tipotributovisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tributovisualizar.equals(tributodetalhe));
		sucesso.add(tipotributovisualizar.equals(tipotributodetalhe));
		
		return sucesso;
	
	}		
}
