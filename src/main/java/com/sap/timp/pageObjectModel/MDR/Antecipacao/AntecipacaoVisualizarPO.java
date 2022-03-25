package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AntecipacaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[@id=\"COMPANY\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"UF\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"BRANCH\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"TRIBUTE\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"TRIBUTE_TYPE\"]")
	public WebElement tipoTributoV;
	@FindBy(xpath = "//span[@id=\"ANTICIPATION_PERCENTAGE\"]")
	public WebElement antecipacaoV;
	@FindBy(xpath = "//span[@id=\"ANTICIPATION_PARCEL\"]")
	public WebElement parcelaV;
	
	@FindBy(xpath = "//div[@id=\"empresa\"]/div/div/div/div/div/div")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div/div/div/div")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"um  Tributo\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione um  Tipo de Tributo\")]")
	public WebElement tipoTributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"% Antecipação\")]")
	public WebElement antecipacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Parcela\")]")
	public WebElement parcelaE;

	
	public AntecipacaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		
		antecipacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("antecipacao");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String tipoTributoV1 = tipoTributoV.getText();
		String antecipacaoV1 = antecipacaoV.getText();
		antecipacaoV1.replace("%", "");
		String parcelaV1 = parcelaV.getText();
		
		
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(tipoTributoV1);
		System.out.println(antecipacaoV1);
		System.out.println(parcelaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
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

		sleep(10000);

		
		String empresaE1 = empresaE.getText();
		String ufE1 = ufE.getText();
		String filialE1 = filialE.getText();
		String tributoE1 = tributoE.getAttribute("value");
		String tipoTributoE1 = tipoTributoE.getAttribute("value");
		String antecipacaoE1 = antecipacaoE.getAttribute("value");
		String parcelaE1 = parcelaE.getAttribute("value");
		
		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(tipoTributoE1);
		System.out.println(antecipacaoE1);
		System.out.println(parcelaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(ufV1.contains(ufE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(tipoTributoV1.contains(tipoTributoE1));
		sucesso.add(antecipacaoV1.contains(antecipacaoE1));
		sucesso.add(parcelaV1.contains(parcelaE1));
		
		System.out.println(sucesso);

	
		
		return sucesso;
		
		
		
		
	}
}
