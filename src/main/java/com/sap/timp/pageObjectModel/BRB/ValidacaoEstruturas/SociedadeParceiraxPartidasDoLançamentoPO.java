package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SociedadeParceiraxPartidasDoLançamentoPO extends TestBaseSteven{
	
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
	@FindBy(xpath = "//div[@data-column=\"12\" and not(@data-path or @aria-label)]/div")
	public WebElement valorDocumento;

	
	
	public SociedadeParceiraxPartidasDoLançamentoPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> verificar() {
		sleep(2000);
		ferramenta.sendKeys("8004546");
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
		//valor do documento
		System.out.println("Valor do Documento");
		String valorDocumentoS = valorDocumento.getText();
		valorDocumentoS = valorDocumentoS.replace(".", "");
		valorDocumentoS = valorDocumentoS.replace(",", ".");
		System.out.println(valorDocumentoS + " String");
		double valorDocumentoD = new Double(valorDocumentoS);
		System.out.println(valorDocumentoD + " Double");
		double esperadovalorDocumentoi = 0;
		System.out.println(esperadovalorDocumentoi + " Esperado");
		sucesso.add(diferenteDe(valorDocumentoD, esperadovalorDocumentoi));
		System.out.println(diferenteDe(valorDocumentoD, esperadovalorDocumentoi)+" peso bruto");
		
		System.out.println("-------------------------------------------------");

		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}

}
