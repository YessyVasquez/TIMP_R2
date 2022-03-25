package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1200RemuneracaoDeTrabalhadorDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"S1200 - Remuneração de Trabalhador Vinculado ao Regime Geral de Previdência Social\"]")
	public WebElement s1200;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement dadosbasicos;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement iddoevento; 
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement tipodeevento;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement versao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement status;

	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement versaodoprocesso;

	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement tipodeinscricao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement numerodeinscricao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement indicativoapuracao;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[14]/div/div")
	public WebElement data;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[15]/div/div")
	public WebElement processodeemissao;
	
	
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
	
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
	@FindBy(xpath = "//span[@id=\"idEvento\"]")
	public WebElement iddoeventovi; 
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	
	@FindBy(xpath = "//span[@id=\"eventType\"]")
	public WebElement tipodeeventovi;
	
	@FindBy(xpath = "//span[@id=\"versao\"]")
	public WebElement versaovi;
	
	@FindBy(xpath = "//span[@id=\"status\"]")
	public WebElement statusvi;

	@FindBy(xpath = "//span[@id=\"tpAmb\"]")
	public WebElement tipodeambientevi;
	
	@FindBy(xpath = "//span[@id=\"verProc\"]")
	public WebElement versaodoprocessovi;

	@FindBy(xpath = "//span[@id=\"tpInscEvt\"]")
	public WebElement tipodeinscricaovi;
	
	@FindBy(xpath = "//span[@id=\"nrInscEvt\"]")
	public WebElement numerodeinscricaovi;
	
	@FindBy(xpath = "//span[@id=\"indApur\"]")
	public WebElement indicativoapuracaovi;
	
	
	@FindBy(xpath = "//span[@id=\"perApur\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//span[@id=\"procEmi\"]")
	public WebElement processodeemissaovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public S1200RemuneracaoDeTrabalhadorDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s1200.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("S1200RemuneracaoDeTrabalhador");
		
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
		String iddetalhes = id.getText();
		String iddoeventodetalhes = iddoevento.getText();
		String empresadetalhes = empresa.getText();
		String tipodeeventodetalhes = tipodeevento.getText();
		String versaodetalhes = versao.getText();
		String statusdetalhes = status.getText();
		String tipodeambientedetalhes = tipodeambiente.getText();
		String versaodoprocessodetalhes = versaodoprocesso.getText();
		String tipodeinscricaodetalhes = tipodeinscricao.getText();
		String numerodeinscricaodetalhes = numerodeinscricao.getText();
		String indicativoapuracaodetalhes = indicativoapuracao.getText();
		String datadetalhes = data.getText();
		String processodeemissaodetalhes = processodeemissao.getText();
		
		System.out.println(iddetalhes);
		System.out.println(iddoeventodetalhes);
		System.out.println(empresadetalhes);
		System.out.println(tipodeeventodetalhes);
		System.out.println(versaodetalhes);
		System.out.println(statusdetalhes);
		System.out.println(tipodeambientedetalhes);
		System.out.println(versaodoprocessodetalhes);
		System.out.println(tipodeinscricaodetalhes);
		System.out.println(numerodeinscricaodetalhes);
		System.out.println(indicativoapuracaodetalhes);
		System.out.println(datadetalhes);
		System.out.println(processodeemissaodetalhes);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("S1200RemuneracaoDeTrabalhador");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		String idvisualizar = idvi.getText();
		String iddoeventovisualizar = iddoeventovi.getText();
		String empresavisualizar = empresavi.getText();
		String tipodeeventovisualizar = tipodeeventovi.getText();
		String versaovisualizar = versaovi.getText();
		String statusvisualizar = statusvi.getText();
		String tipodeambientevisualizar = tipodeambientevi.getText();
		String versaodoprocessovisualizar = versaodoprocessovi.getText();
		String tipodeinscricaovisualizar = tipodeinscricaovi.getText();
		String numerodeinscricaovisualizar = numerodeinscricaovi.getText();
		String indicativoapuracaovisualizar = indicativoapuracaovi.getText();
		String datavisualizar = datavi.getText();
		String processodeemissaovisualizar = processodeemissaovi.getText();
		
		System.out.println(idvisualizar);
		System.out.println(iddoeventovisualizar);
		System.out.println(empresavisualizar);
		System.out.println(tipodeeventovisualizar);
		System.out.println(versaovisualizar);
		System.out.println(statusvisualizar);
		System.out.println(tipodeambientevisualizar);
		System.out.println(versaodoprocessovisualizar);
		System.out.println(tipodeinscricaovisualizar);
		System.out.println(numerodeinscricaovisualizar);
		System.out.println(indicativoapuracaovisualizar);
		System.out.println(datavisualizar);
		System.out.println(processodeemissaovisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(iddoeventovisualizar.equals(iddoeventodetalhes));
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(tipodeeventovisualizar.equals(tipodeeventodetalhes));
		sucesso.add(versaovisualizar.equals(versaodetalhes));
		sucesso.add(statusvisualizar.equals(statusdetalhes));
		sucesso.add(tipodeambientevisualizar.equals(tipodeambientedetalhes));
		sucesso.add(versaodoprocessovisualizar.equals(versaodoprocessodetalhes));
		sucesso.add(tipodeinscricaovisualizar.equals(tipodeinscricaodetalhes));
		sucesso.add(numerodeinscricaovisualizar.equals(numerodeinscricaodetalhes));
		sucesso.add(indicativoapuracaovisualizar.equals(indicativoapuracaodetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		sucesso.add(processodeemissaovisualizar.equals(processodeemissaodetalhes));
		
		return sucesso;
	}
}
