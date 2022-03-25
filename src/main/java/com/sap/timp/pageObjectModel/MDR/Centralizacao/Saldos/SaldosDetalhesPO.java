package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosDetalhesPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//DATOS DEL DETALHE
	
		@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
		public WebElement empresaD;
		@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
		public WebElement ufFilialD;
			@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
			public WebElement filial1D;
			@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[2]")
			public WebElement filial2D;
			@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[3]")
			public WebElement filial3D;
		@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
		public WebElement filialCentralizadoraD;
		@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
		public WebElement tributoD;
		@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
		public WebElement ativoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
		
	//DATOS DEL VISUALIZAR
		@FindBy(xpath = "//span[@id=\"company\"]")
		public WebElement empresaV;
		@FindBy(xpath = "//span[@id=\"uf\"]")
		public WebElement ufFilialV;
		@FindBy(xpath = "//span[@id=\"filials\"]")
		public WebElement filialV;
		@FindBy(xpath = "//span[@id=\"centralizadora\"]")
		public WebElement filialCentralizadoV;
		@FindBy(xpath = "//span[@id=\"tribute\"]")
		public WebElement tributoV;
		@FindBy(xpath = "//span[@id=\"active\"]")
		public WebElement ativoV;
		
		
	
	public SaldosDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idCentralizacaoSaldos");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		
		String empresaD1 = empresaD.getText();
		String ufFilialD1 = ufFilialD.getText();
		String filialD11 = filial1D.getText();
		String filialD22 = filial2D.getText();
		String filialD33 = filial3D.getText();
		String filialCentralizadoraD1 = filialCentralizadoraD.getText();
		String tributoD1 = tributoD.getText();
		String ativoD1 = ativoD.getText();

		System.out.println("*****DATOS DEL DETALHES****");
		System.out.println(empresaD1);
		System.out.println(ufFilialD1);
		System.out.println(filialD11);
		System.out.println(filialD22);
		System.out.println(filialD33);
		System.out.println(filialCentralizadoraD1);
		System.out.println(tributoD1);
		System.out.println(ativoD1);

		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		attributoNotToBeEmptyElement(empresaV, "textContent");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String empresaV1 = empresaV.getText();
		String ufFilialV1 = ufFilialV.getText();
		String filialV1 = filialV.getText();
		String filialCentralizadoV1 = filialCentralizadoV.getText();
		String tributoV1 = tributoV.getText();
		String ativoV1 = ativoV.getText();

		System.out.println();
		System.out.println("*****DATOS DEL VISUALIZAR****");
		System.out.println(empresaV1);
		System.out.println(ufFilialV1);
		System.out.println(filialV1);
		System.out.println(filialCentralizadoV1);
		System.out.println(tributoV1);
		System.out.println(ativoV1);



		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufFilialV1.contains(ufFilialD1));
		sucesso.add(filialV1.contains(filialD11));
		sucesso.add(filialV1.contains(filialD22));
		sucesso.add(filialV1.contains(filialD33));
		sucesso.add(filialCentralizadoV1.contains(filialCentralizadoraD1));
		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(ativoV1.contains(ativoD1));


		System.out.println(sucesso);

		return sucesso;
		
	}
}
