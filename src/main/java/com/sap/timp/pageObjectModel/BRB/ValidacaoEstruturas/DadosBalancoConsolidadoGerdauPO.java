package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DadosBalancoConsolidadoGerdauPO extends TestBaseSteven{
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement execucao;
	@FindBy(xpath = "//button[@tabindex=\"0\"]/span[text()=\"Executar\"]")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"total-record\"]/span[@class=\"value cell\"]")
	public WebElement totalLinhas;
	@FindBy(xpath = "//div[@data-column=\"4\" and not(@data-path or @aria-label)]/div")
	public WebElement cmg;
	@FindBy(xpath = "//div[@data-column=\"7\" and not(@data-path or @aria-label)]/div")
	public WebElement cgsa;
	@FindBy(xpath = "//div[@data-column=\"13\" and not(@data-path or @aria-label)]/div")
	public WebElement hmac;
	
	@FindBy(xpath = "//div[@data-column=\"14\" and not(@data-path or @aria-label)]/div")
	public WebElement macs;
	@FindBy(xpath = "//div[@data-column=\"18\" and not(@data-path or @aria-label)]/div")
	public WebElement sjk;
	@FindBy(xpath = "//div[@data-column=\"33\" and not(@data-path or @aria-label)]/div")
	public WebElement cgi;
	
	
	public DadosBalancoConsolidadoGerdauPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public ArrayList<Boolean> verificar() {
		
		sleep(2000);
		ferramenta.sendKeys("8004411");
		ferramenta.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(1000);
		execucao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//total de linhas
		
		System.out.println("-------------------------------------------------");
		System.out.println("total de linhas");
		String totalLinhasS = totalLinhas.getText();
		System.out.println(totalLinhasS);
		int totalLinhasI = Integer.valueOf(totalLinhasS);
		int esperadoLinhas = 0;
		System.out.println(esperadoLinhas);
		sucesso.add(mayorQue(totalLinhasI, esperadoLinhas));
		System.out.println(mayorQue(totalLinhasI, esperadoLinhas)+" numero linhas");
		
		System.out.println("-------------------------------------------------");
		//CMG
		System.out.println("peso bruto");
		String cmgS = cmg.getText();
		cmgS = cmgS.replace(".", "");
		cmgS = cmgS.replace(",", ".");
		System.out.println(cmgS + " String");
		double cmgD = new Double(cmgS);
		System.out.println(cmgD + " Double");
		double esperadocmg = 0;
		System.out.println(esperadocmg + " Esperado");
		sucesso.add(diferenteDe(cmgD, esperadocmg));
		System.out.println(diferenteDe(cmgD, esperadocmg)+" peso bruto");
		
		System.out.println("-------------------------------------------------");
		//CGSA
		System.out.println("CGSA");
		String cgsaS = cgsa.getText();
		cgsaS = cgsaS.replace(".", "");
		cgsaS = cgsaS.replace(",", ".");
		System.out.println(cgsaS+ " String");
		double cgsaD = new Double(cgsaS);
		System.out.println(cgsaD + " Double");
		double esperadocgsa = 0;
		System.out.println(esperadocgsa + " Esperado");
		sucesso.add(diferenteDe(cgsaD, esperadocgsa));
		System.out.println(diferenteDe(cgsaD, esperadocgsa)+" peso Liquido");
		
		System.out.println("-------------------------------------------------");
		//US79(HMAC)
		System.out.println("US79(HMAC)");
		String hmacS = hmac.getText();
		hmacS = hmacS.replace(",", ".");
		System.out.println(hmacS + " String");
		double hmacD = new Double(hmacS);
		System.out.println(hmacD + " Double");
		double esperadohmac = 0;
		System.out.println(esperadohmac + " Esperado");
		sucesso.add(mayorQue(hmacD, esperadohmac));
		System.out.println(mayorQue(hmacD, esperadohmac) +" Valor Doc Fiscal");
		
		System.out.println("-------------------------------------------------");

		// US22(MACS)
		System.out.println("US22(MACS)");
		String macsS = macs.getText();
		macsS = macsS.replace(",", ".");
		System.out.println(macsS + " String");
		double macsD = new Double(macsS);
		System.out.println(macsD + " Double");
		double esperadomacs = 0;
		System.out.println(esperadomacs + " Esperado");
		sucesso.add(diferenteDe(macsD, esperadomacs));
		System.out.println(sucesso.get(4) + " Valor oper. ICMS ( BC+ISENT+OUT)");
		
		System.out.println("-------------------------------------------------");
		
		
		// N10(SJK)
		System.out.println("N10(SJK)");
		String sjkS = sjk.getText();
		sjkS = sjkS.replace(",", ".");
		System.out.println(sjkS+" String");
		double sjkD = new Double(sjkS);
		System.out.println(sjkD + " Double");
		double esperadosjk = 0;
		System.out.println(esperadosjk + " Esperado");
		sucesso.add(mayorQue(sjkD, esperadosjk));
		System.out.println(mayorQue(sjkD, esperadosjk) + " Valor Liquido");
		System.out.println("-------------------------------------------------");
		
		//CGI
		System.out.println("CGI");
		String cgiS = cgi.getText();
		cgiS = cgiS.replace(".", "");
		cgiS = cgiS.replace(",", ".");
		System.out.println(cgiS+" String");
		double cgiD = new Double(cgiS);
		System.out.println(cgiD + " Double");
		double esperadocgi = 0;
		sucesso.add(diferenteDe(cgiD, esperadocgi));
		System.out.println(esperadocgi + " Esperado");
		System.out.println(diferenteDe(cgiD, esperadocgi) +" Valor Total Doc Fiscal");

		
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	

	
}
	


