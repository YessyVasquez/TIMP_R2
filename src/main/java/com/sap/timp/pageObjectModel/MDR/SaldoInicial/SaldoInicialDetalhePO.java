package com.sap.timp.pageObjectModel.MDR.SaldoInicial;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldoInicialDetalhePO extends TestBaseKenssy {
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-saldos\")]/div/span[2]")
	public WebElement saldoInicial;
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	//DATOS DEL DETALHE
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[1]")
	public WebElement referencia;
	
//	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
//	public WebElement data;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[2]")
	public WebElement dc;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[3]")
	public WebElement saldo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement ativo;
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	
	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//span[@id=\"razaoSocial\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"nomeFantasia\"]")
	public WebElement filial1;
	
	@FindBy(xpath = "//span[@id=\"tributo\"]")
	public WebElement tributo1;
	
//	@FindBy(xpath = "//span[@id=\"taxType\"]")
//	public WebElement tipoImposto;
	
//	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
//	public WebElement detalheTipoTributo;
	
	@FindBy(xpath = "//span[@id=\"labelReferencia\"]")
	public WebElement referencia1;
	
//	@FindBy(xpath = "//span[@id=\"anioMes\"]")
//	public WebElement data;
	
	@FindBy(xpath = "//span[@id=\"labelDebCred\"]")
	public WebElement dc1;
	
	@FindBy(xpath = "//span[@id=\"saldo\"]")
	public WebElement saldo1;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativo1;
	
	
	public SaldoInicialDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> DetalheSaldoInicial() {
		sleep(2000);
		saldoInicial.click();
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("SaldoInicial");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//IMPRIMIR VALORES DEL DETALLE

		String empresaValor = empresa.getText();
		String filialValor = filial.getText();
		String tributoValor = tributo.getText();
		String referenciaValor= referencia.getText();
		String dcValor = dc.getText();
		String saldoValor = saldo.getText();
		String ativoValor = ativo.getText();
		
		System.out.println("Empresa:" +empresaValor);
		System.out.println("Filial:" +filialValor);
		System.out.println("Tributo:" +tributoValor);
		System.out.println("Referencia:" +referenciaValor);
		System.out.println("D/C:" +dcValor);
		System.out.println("Saldo:" +saldoValor);
		System.out.println("Ativo:" +ativoValor);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//IMPRIMIR VALORES DEL VISUALIZAR
		String empresaValor1 = empresa1.getText();
		String filialValor1 = filial1.getText();
		String tributoValor1 = tributo1.getText();
		String referenciaValor1 = referencia1.getText();
		String dcValor1 = dc1.getText();
		String saldoValor1 = saldo1.getText();
		saldoValor1 = saldoValor1.replace(" ", ""); // Reemplazo los espacios por nada para que quedee igual en visualizar y editar
		saldoValor1 = saldoValor1.replace(".", "");
		saldoValor1 = saldoValor1.replace(",00", "");
		
		String ativoValor1 = ativo1.getText();
		
		System.out.println("----------------------------");
		System.out.println("Empresa1:" +empresaValor1);
		System.out.println("Filial1:" +filialValor1);
		System.out.println("Tributo1:" +tributoValor1);
		System.out.println("Referencia1:" +referenciaValor1);
		System.out.println("D/C1:" +dcValor1);
		System.out.println("Saldo1:" +saldoValor1);
		System.out.println("Ativo1:" +ativoValor1);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaValor1.equals(empresaValor));
		sucesso.add(filialValor1.equals(filialValor));
		sucesso.add(tributoValor1.equals(tributoValor));
		sucesso.add(referenciaValor1.equals(referenciaValor));
		sucesso.add(dcValor1.equals(dcValor));
		sucesso.add(saldoValor1.equals(saldoValor));
		sucesso.add(ativoValor1.equals(ativoValor));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
