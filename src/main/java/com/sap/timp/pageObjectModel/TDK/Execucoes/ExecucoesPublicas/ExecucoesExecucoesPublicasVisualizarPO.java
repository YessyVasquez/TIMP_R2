package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ExecucoesExecucoesPublicasVisualizarPO extends TestBaseSteven {
	
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
	
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
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
	
	//@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
	@FindBy(xpath = "//*[name()=\"g\" and @class=\"v-datapoint-group\"]/*[name()=\"g\"]/*[name()=\"g\" and @data-id][4]")
	public WebElement quartacolunagrafico;
	
	@FindBy(xpath = "//div[@id=\"indicator-card-container\"]")
	public WebElement cartaoindicador;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[1]/td[2]")
	public WebElement dimensao;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[2]/td[2]")
	public WebElement valoricms;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	public ExecucoesExecucoesPublicasVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
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
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		
		waitExpectElement(cartaoindicador);
		sleep(2000);
		
		quartacolunagrafico.click();
		sleep(2000);
		String dimensao1= dimensao.getText();
		String valoricms1=valoricms.getText();
		valoricms1=valoricms1.replace(".", "");
		valoricms1=valoricms1.replace(",", ".");
		System.out.println(dimensao1);
		System.out.println(valoricms1);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
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
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cartaoindicador);
		sleep(2000);
		
		fechar.click();
		sleep(2000);
		
		executarElement.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		
		quartacolunagrafico.click();
		sleep(2000);
		
		String dimensao2= dimensao.getText();
		String valoricms2=valoricms.getText();
		valoricms2=valoricms2.replace(".", "");
		valoricms2=valoricms2.replace(",", ".");
		System.out.println(dimensao2);
		System.out.println(valoricms2);
		
		//String valorcartãoindicador= driver.findElement(By.xpath("//div[@id=\"indicator-card-container\"]/div/p")).getText();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(dimensao1.contains(dimensao2));
		sucesso.add(valoricms1.contains(valoricms2));
		
		System.out.println(sucesso);
		return sucesso;
	}

}
