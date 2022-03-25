package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ExecucoesExecucoesPublicasDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[1]/span")
	public WebElement datacriado1;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[2]/span")
	public WebElement dataeditar1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement modelo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div")
	public WebElement classificacao1;
	
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[1]/span")
	public WebElement datacriado2;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[2]/span")
	public WebElement dataeditar2;
	
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement modelo2;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div")
	public WebElement classificacao2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	public ExecucoesExecucoesPublicasDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro1 =idObter1();

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		detalhes.click();
		sleep(2000);
		
		
		String modelodetalhes1 =modelo1.getText();
		String classificacaodetalhes1 =classificacao1.getText();
		String datacriacaodetalhes1= datacriado1.getText();
		String dataedicaodetalhes1=dataeditar1.getText();
		
		System.out.println(modelodetalhes1);
		System.out.println(classificacaodetalhes1);
		System.out.println(datacriacaodetalhes1);
		System.out.println(dataedicaodetalhes1);
		
		fechar.click();
		sleep(2000);
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter2();
	
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		detalhes1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String modelodetalhes2 =modelo2.getText();
		String classificacaodetalhes2 =classificacao2.getText();
		String datacriacaodetalhes2= datacriado2.getText();
		String dataedicaodetalhes2=dataeditar2.getText();
		
		System.out.println(modelodetalhes2);
		System.out.println(classificacaodetalhes2);
		System.out.println(datacriacaodetalhes2);
		System.out.println(dataedicaodetalhes2);
		
		fechar.click();
		
		sleep(2000);
		
		//String valorcartãoindicador= driver.findElement(By.xpath("//div[@id=\"indicator-card-container\"]/div/p")).getText();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(modelodetalhes2.contains(modelodetalhes1));
		sucesso.add(classificacaodetalhes2.contains(classificacaodetalhes1));
		sucesso.add(datacriacaodetalhes2.contains(datacriacaodetalhes1));
		sucesso.add(dataedicaodetalhes2.contains(dataedicaodetalhes1));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	
}
