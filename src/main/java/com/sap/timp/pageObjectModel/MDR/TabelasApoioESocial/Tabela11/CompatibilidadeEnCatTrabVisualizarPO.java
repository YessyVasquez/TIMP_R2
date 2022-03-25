package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela11;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CompatibilidadeEnCatTrabVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 11 - Compatibilidade en Cat. Trab.\"]")
	public WebElement tabela11;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos visualizar
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigo;
	
	@FindBy(xpath = "//td[@id=\"classificationTax\"]/span")
	public WebElement clasificacaoTributaria;
	
	@FindBy(xpath = "//tr[4]/td[1]/span")
	public WebElement tipo01;
	
	@FindBy(xpath = "//tr[5]/td[1]/span")
	public WebElement tipo02;
	
	@FindBy(xpath = "//tr[6]/td[1]/span")
	public WebElement tipo03;
	
	@FindBy(xpath = "//tr[7]/td[1]/span")
	public WebElement tipo04;
	
	@FindBy(xpath = "//tr[8]/td[1]/span")
	public WebElement tipo05;
	
	@FindBy(xpath = "//tr[9]/td[1]/span")
	public WebElement tipo06;
	
	@FindBy(xpath = "//tr[10]/td[1]/span")
	public WebElement tipo07;
	
	@FindBy(xpath = "//tr[11]/td[1]/span")
	public WebElement tipo08;
	
	@FindBy(xpath = "//tr[12]/td[1]/span")
	public WebElement tipo09;
	
	@FindBy(xpath = "//tr[13]/td[1]/span")
	public WebElement tipo10;
	
	@FindBy(xpath = "//tr[14]/td[1]/span")
	public WebElement tipo21;
	
	@FindBy(xpath = "//tr[15]/td[1]/span")
	public WebElement tipo24;
	
	@FindBy(xpath = "//tr[16]/td[1]/span")
	public WebElement tipo90;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateTo\"]/span")
	public WebElement validadeAte;
	
	// Datos visualizar
	@FindBy(xpath = "//div[contains(@class, \"code_0_0\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigo1;
	
	@FindBy(xpath = "//div[contains(@class, \"classificationTax_0_1\")]/div/div[2]/div/div/div[2]/input")
	public WebElement clasificacaoTributaria1;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType01_0_3\")]/div/div/input")
	public WebElement tipo011;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType02_0_4\")]/div/div/input")
	public WebElement tipo021;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType03_0_5\")]/div/div/input")
	public WebElement tipo031;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType04_0_6\")]/div/div/input")
	public WebElement tipo041;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType05_0_7\")]/div/div/input")
	public WebElement tipo051;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType06_0_8\")]/div/div/input")
	public WebElement tipo061;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType07_0_9\")]/div/div/input")
	public WebElement tipo071;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType08_0_10\")]/div/div/input")
	public WebElement tipo081;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType09_0_11\")]/div/div/input")
	public WebElement tipo091;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType10_0_12\")]/div/div/input")
	public WebElement tipo101;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType21_0_13\")]/div/div/input")
	public WebElement tipo211;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType24_0_14\")]/div/div/input")
	public WebElement tipo241;
	
	@FindBy(xpath = "//div[contains(@class, \"taxCreditType90_0_15\")]/div/div/input")
	public WebElement tipo901;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_17\")]/div/div/input")
	public WebElement validadeDe1;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_18\")]/div/div/input")
	public WebElement validadeAte1;
	
	public CompatibilidadeEnCatTrabVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoio.click();
		
		sleep(2000);
		tabela11.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CompatibilidadeEnCatTrab");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoString = codigo.getText();
		String classificacaoTributariaString = clasificacaoTributaria.getText();
		String tipo01String = tipo01.getText();
		String tipo02String = tipo02.getText();
		String tipo03String = tipo03.getText();
		String tipo04String = tipo04.getText();
		String tipo05String = tipo05.getText();
		String tipo06String = tipo06.getText();
		String tipo07String = tipo07.getText();
		String tipo08String = tipo08.getText();
		String tipo09String = tipo09.getText();
		String tipo10String = tipo10.getText();
		String tipo21String = tipo21.getText();
		String tipo24String = tipo24.getText();
		String tipo90String = tipo90.getText();
		String validadeDeString = validadeDe.getText();
		String validadeAteString = validadeAte.getText();
		
		System.out.println("----------------DATOS DE VISUALIZAR-------------");
		System.out.println("Código: " + codigoString);
		System.out.println("Classificação Tributária: " + classificacaoTributariaString);
		System.out.println("Tipo 01: " + tipo01String);
		System.out.println("Tipo 02: " + tipo02String);
		System.out.println("Tipo 03: " + tipo03String);
		System.out.println("Tipo 04: " + tipo04String);
		System.out.println("Tipo 05: " + tipo05String);
		System.out.println("Tipo 06: " + tipo06String);
		System.out.println("Tipo 07: " + tipo07String);
		System.out.println("Tipo 08: " + tipo08String);
		System.out.println("Tipo 09: " + tipo09String);
		System.out.println("Tipo 10: " + tipo10String);
		System.out.println("Tipo 21: " + tipo21String);
		System.out.println("Tipo 24: " + tipo24String);
		System.out.println("Tipo 90: " + tipo90String);
		System.out.println("Validade De: " + validadeDeString);
		System.out.println("Validade Até: " + validadeAteString);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String codigoString1 = codigo1.getAttribute("value");
		String classificacaoTributariaString1 = clasificacaoTributaria1.getAttribute("value");
		String tipo01String1 = tipo011.isSelected() ? "Sim" : "Não";
		String tipo02String1 = tipo021.isSelected() ? "Sim" : "Não";
		String tipo03String1 = tipo031.isSelected() ? "Sim" : "Não";
		String tipo04String1 = tipo041.isSelected() ? "Sim" : "Não";
		String tipo05String1 = tipo051.isSelected() ? "Sim" : "Não";
		String tipo06String1 = tipo061.isSelected() ? "Sim" : "Não";
		String tipo07String1 = tipo071.isSelected() ? "Sim" : "Não";
		String tipo08String1 = tipo081.isSelected() ? "Sim" : "Não";
		String tipo09String1= tipo091.isSelected() ? "Sim" : "Não";
		String tipo10String1 = tipo101.isSelected() ? "Sim" : "Não";
		String tipo21String1 = tipo211.isSelected() ? "Sim" : "Não";
		String tipo24String1 = tipo241.isSelected() ? "Sim" : "Não";
		String tipo90String1 = tipo901.isSelected() ? "Sim" : "Não";
		String validadeDeString1 = validadeDe1.getAttribute("value");
		String validadeAteString1 = validadeAte1.getAttribute("value");
		
		System.out.println("");
		System.out.println("----------------DATOS DE EDITAR-------------");
		System.out.println("Código 1: " + codigoString1);
		System.out.println("Classificação Tributária 1: " + classificacaoTributariaString1);
		System.out.println("Tipo 01 1: " + tipo01String1);
		System.out.println("Tipo 02 1: " + tipo02String1);
		System.out.println("Tipo 03 1: " + tipo03String1);
		System.out.println("Tipo 04 1: " + tipo04String1);
		System.out.println("Tipo 05 1: " + tipo05String1);
		System.out.println("Tipo 06 1: " + tipo06String1);
		System.out.println("Tipo 07 1: " + tipo07String1);
		System.out.println("Tipo 08 1: " + tipo08String1);
		System.out.println("Tipo 09 1: " + tipo09String1);
		System.out.println("Tipo 10 1: " + tipo10String1);
		System.out.println("Tipo 21 1: " + tipo21String1);
		System.out.println("Tipo 24 1: " + tipo24String1);
		System.out.println("Tipo 90 1: " + tipo90String1);
		System.out.println("Validade De 1: " + validadeDeString1);
		System.out.println("Validade Até 1: " + validadeAteString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(codigoString1.equals(codigoString));
		sucesso.add(classificacaoTributariaString1.equals(classificacaoTributariaString));
		sucesso.add(tipo01String1.equals(tipo01String));
		sucesso.add(tipo02String1.equals(tipo02String));
		sucesso.add(tipo03String1.equals(tipo03String));
		sucesso.add(tipo04String1.equals(tipo04String));
		sucesso.add(tipo05String1.equals(tipo05String));
		sucesso.add(tipo06String1.equals(tipo06String));
		sucesso.add(tipo07String1.equals(tipo07String));
		sucesso.add(tipo08String1.equals(tipo08String));
		sucesso.add(tipo09String1.equals(tipo09String));
		sucesso.add(tipo10String1.equals(tipo10String));
		sucesso.add(tipo21String1.equals(tipo21String));
		sucesso.add(tipo24String1.equals(tipo24String));
		sucesso.add(tipo90String1.equals(tipo90String));
		sucesso.add(validadeDeString1.equals(validadeDeString));
		sucesso.add(validadeAteString1.equals(validadeAteString));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
