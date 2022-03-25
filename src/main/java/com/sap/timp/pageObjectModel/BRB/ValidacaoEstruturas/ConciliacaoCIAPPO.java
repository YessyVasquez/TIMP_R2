package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConciliacaoCIAPPO extends TestBaseSteven{
	
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
	@FindBy(xpath = "//div[@data-column=\"93\" and not(@data-path or @aria-label)]/div")
	public WebElement montanteMoedaLocal;
	@FindBy(xpath = "//div[@data-column=\"124\" and not(@data-path or @aria-label)]/div")
	public WebElement montanteMoedaLocalNaoAbsoluto;
	
	
	public ConciliacaoCIAPPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> verificar() {
		sleep(2000);
		ferramenta.sendKeys("8004410");
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
		//Montante em Moeda Local
		System.out.println("Montante em Moeda Local");
		String montanteMoedaLocalS = montanteMoedaLocal.getText();
		montanteMoedaLocalS = montanteMoedaLocalS.replace(".", "");
		montanteMoedaLocalS = montanteMoedaLocalS.replace(",", ".");
		System.out.println(montanteMoedaLocalS + " String");
		double montanteMoedaLocalD = new Double(montanteMoedaLocalS);
		System.out.println(montanteMoedaLocalD + " Double");
		double esperadomontanteMoedaLocal = 0;
		System.out.println(esperadomontanteMoedaLocal + " Esperado");
		sucesso.add(mayorQue(montanteMoedaLocalD, esperadomontanteMoedaLocal));
		System.out.println(mayorQue(montanteMoedaLocalD, esperadomontanteMoedaLocal)+" peso bruto");
		
		System.out.println("-------------------------------------------------");
		//Montante em moeda local (não absoluto)
		System.out.println("Montante em moeda local (não absoluto)");
		String montanteMoedaLocalNaoAbsolutoS = montanteMoedaLocalNaoAbsoluto.getText();
		montanteMoedaLocalNaoAbsolutoS = montanteMoedaLocalNaoAbsolutoS.replace(".", "");
		montanteMoedaLocalNaoAbsolutoS = montanteMoedaLocalNaoAbsolutoS.replace(",", ".");
		System.out.println(montanteMoedaLocalNaoAbsolutoS+ " String");
		double montanteMoedaLocalNaoAbsolutoD = new Double(montanteMoedaLocalNaoAbsolutoS);
		System.out.println(montanteMoedaLocalNaoAbsolutoD + " Double");
		double esperadomontanteMoedaLocalNaoAbsoluto = 0;
		System.out.println(esperadomontanteMoedaLocalNaoAbsoluto + " Esperado");
		sucesso.add(diferenteDe(montanteMoedaLocalNaoAbsolutoD, esperadomontanteMoedaLocalNaoAbsoluto));
		System.out.println(diferenteDe(montanteMoedaLocalNaoAbsolutoD, esperadomontanteMoedaLocalNaoAbsoluto)+" peso Liquido");
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}

}
