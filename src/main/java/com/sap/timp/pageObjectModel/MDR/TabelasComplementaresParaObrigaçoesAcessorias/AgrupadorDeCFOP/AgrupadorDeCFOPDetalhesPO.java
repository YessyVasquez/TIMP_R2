package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AgrupadorDeCFOPDetalhesPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[2]/div/div")
	public WebElement obrigacaode;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[3]/div/div")
	public WebElement codigodeagrupamentode;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[4]/div/div")
	public WebElement agrupadordecfopde;
	
	@FindBy(xpath = "//div[ @class=\"detail-data\"]/div[5]/div/div")
	public WebElement datade;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"grouperCode\"]")
	public WebElement codigodeagrupamentovi;
	
	@FindBy(xpath = "//span[@id=\"cfopGrouper\"]")
	public WebElement agrupadordecfopvi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	public AgrupadorDeCFOPDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
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
		String codigodeagrupamentodetalhes = codigodeagrupamentode.getText();
		String agrupadordecfopdetalhes = agrupadordecfopde.getText();
		String datadetalhes = datade.getText();
		
		System.out.println(obrigacaodetalhes);
		System.out.println(codigodeagrupamentodetalhes);
		System.out.println(agrupadordecfopdetalhes);
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
		String codigodeagrupamentovisualizar = codigodeagrupamentovi.getText();
		String agrupadordecfopvisualizar = agrupadordecfopvi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigodeagrupamentovisualizar);
		System.out.println(agrupadordecfopvisualizar);
		System.out.println(datavisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaodetalhes));
		sucesso.add(codigodeagrupamentovisualizar.equals(codigodeagrupamentodetalhes));
		sucesso.add(agrupadordecfopvisualizar.equals(agrupadordecfopdetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		
		return sucesso;
	}
}
