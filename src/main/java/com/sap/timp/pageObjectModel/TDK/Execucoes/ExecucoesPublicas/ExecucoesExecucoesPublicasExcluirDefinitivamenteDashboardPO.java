package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;

public class ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO extends TestBaseKenssy{
	
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
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement classificacaodeacesso;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[1]/td[2]")
	public WebElement dimensao;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[2]/td[2]")
	public WebElement valoricms;
	
	//@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div/div[1]")
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div[1]/div[1]/div")
	public WebElement raiz;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-execution\"]/div/span[2]")
	public WebElement lixeiraelElement;
	public ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		
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
		
		String idRegistro1 =idObter("DashboardParametrosGeraisExecutar");
		System.out.println("Id Execuções"+idRegistro1);
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		Lixeira.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		lixeiraelElement.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println(id);
		System.out.println(idRegistro1);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idRegistro1);
		ArrayList<Boolean> sucesso =new ArrayList<Boolean>();
		
		if (idBD == idD) {
			System.out.println("É o mesmo id ");
			sucesso.add(true);
		}else {
			System.out.println("Não é o mesmo id");
			sucesso.add(false);
		}
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int idlixeira = driver.findElements(By.xpath("//div[@data-id=\"" + idRegistro1 + "\"]/div[5]/div")).size();
		if (idlixeira == 0) {
			System.out.println("Não se encontra na biblioteca lixeira");
			sucesso.add(true);
			
		}else {
			System.out.println("Encontra sim na biblioteca");
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}

}
