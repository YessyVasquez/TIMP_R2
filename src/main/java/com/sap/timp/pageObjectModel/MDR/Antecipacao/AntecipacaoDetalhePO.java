package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AntecipacaoDetalhePO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	// Datos detalhe
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement ativo;
	
	// Datos visualizar
	@FindBy(xpath = "//span[@id=\"COMPANY\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"UF\"]")
	public WebElement uf1;
	
	@FindBy(xpath = "//span[@id=\"BRANCH\"]")
	public WebElement filial1;
	
	@FindBy(xpath = "//span[@id=\"ANTICIPATION_PERIOD_START\"]")
	public WebElement periodo1;
	
	@FindBy(xpath = "//span[@id=\"ACTIVE\"]")
	public WebElement ativo1;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	public AntecipacaoDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhe() {
		sleep(2000);
		antecipacao.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("antecipacao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		// Obtenemos los datos de detalhe
		waitExpectElement(btnCerrar);
		String empresaString = empresa.getText();
		String ufString = uf.getText();
		String filialString = filial.getText();
		String periodoString = periodo.getText();
		String ativoString = ativo.getText();
		
		System.out.println("Datos detalhe");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Periodo: " + periodoString);
		System.out.println("Ativo: " + ativoString);
		
		btnCerrar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(btnUltimaPagina);
		sleep(2000);
		
		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(1000);
		menu.click();
		sleep(1000);
		açao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtenemos los datos de visualiar
		String empresaString1 = empresa1.getText();
		String ufString1 = uf1.getText();
		String filialString1 = filial1.getText();
		String periodoString1 = periodo1.getText();
		String ativoString1 = ativo1.getText();

		System.out.println("");
		System.out.println("Datos detalhe");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Periodo: " + periodoString1);
		System.out.println("Ativo: " + ativoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaString1.contains(empresaString));
		sucesso.add(ufString1.contains(ufString));
		sucesso.add(filialString1.contains(filialString));
		sucesso.add(filialString1.contains(filialString));
		sucesso.add(periodoString.contains(periodoString1));
		System.out.println(sucesso);
	
		return sucesso;
		
	}
}
