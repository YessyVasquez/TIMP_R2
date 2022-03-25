package com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.sap.timp.base.TestBaseKenssy;

public class FatorDeCreditamentoDetalhesPO extends TestBaseKenssy{

	@FindBy(xpath = "//li[contains(@identifier,\"accordion-item-creditFactor\")]")
	public WebElement fatorCreditamento;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div")
	public WebElement abrirDetalhe;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrarPanel;
	
	//DATOS DEL PRIMER RESULTADO DE LA TABLA
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")
	public WebElement idT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement empresaT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")
	public WebElement ufT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")
	public WebElement filialT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")
	public WebElement periodoT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[7]/div")
	public WebElement vendasT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")
	public WebElement totalVendasT;
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")
	public WebElement fatorCreditamentoT;
	
	
	//DETALHE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement periodoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement vendasD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement totalVendasD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement fatorCreditamentoD;
	

	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public FatorDeCreditamentoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		fatorCreditamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//DATOS DEL PRIMER DATO ENCONTRADO EN LA TABLA
		String idT1 = idT.getText();
		String empresaT1 = empresaT.getText();
		String ufT1 = ufT.getText();
		String filialT1 = filialT.getText();
		String periodoT1 = periodoT.getText();
		String vendasT1 = vendasT.getText();
		String totalVendasT1 = totalVendasT.getText();
		String fatorCreditamentoT1 = fatorCreditamentoT.getText();
		
		
		System.out.println("--------- Datos del primer registro de la tabla ---------");
		System.out.println("Id: " +idT1);
		System.out.println("Empresa: " +empresaT1);
		System.out.println("UF: " +ufT1);
		System.out.println("Filial: " +filialT1);
		System.out.println("Periodo: " +periodoT1);
		System.out.println("Vendas: " +vendasT1);
		System.out.println("Total Vendas: " +totalVendasT1);
		System.out.println("Fator Creditamento: " +fatorCreditamentoT1);
		
		
		abrirDetalhe.click();
		sleep(2000);
		
		//DATOS DEL DETALHE
		String idD1 = idD.getText();
		String empresaD1 = empresaD.getText();
		String ufD1 = ufD.getText();
		String filialD1 = filialD.getText();
		String periodoD1 = periodoD.getText();
		String vendasD1 = vendasD.getText();
		String totalVendasD1 = totalVendasD.getText();
		String fatorCreditamentoD1 = fatorCreditamentoD.getText();
		
		System.out.println("--------- Datos del Detalhe ---------");
		System.out.println("Id: " +idD1);
		System.out.println("Empresa: " +empresaD1);
		System.out.println("UF: " +ufD1);
		System.out.println("Filial: " +filialD1);
		System.out.println("Periodo: " +periodoD1);
		System.out.println("Vendas: " +vendasD1);
		System.out.println("Total Vendas: " +totalVendasD1);
		System.out.println("Fator Creditamento: " +fatorCreditamentoD1);
		
		cerrarPanel.click();
		sleep(2000);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(idT1.contains(idD1));
			sucesso.add(empresaT1.contains(empresaD1));
			sucesso.add(ufT1.contains(ufD1));
			sucesso.add(filialT1.contains(filialD1));
			sucesso.add(periodoT1.contains(periodoD1));
			sucesso.add(vendasT1.contains(vendasD1));
			sucesso.add(totalVendasT1.contains(totalVendasD1));
			sucesso.add(fatorCreditamentoT1.contains(fatorCreditamentoD1));

		System.out.println(sucesso);
	
		return sucesso;		
	}
}
