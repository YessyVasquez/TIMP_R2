package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeEstruturasVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapeamentodeestruturas;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div/div/input")
	public WebElement estruturadedadosvi;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div/input")
	public WebElement empresavi;
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div/input")
	public WebElement uffiliavi;
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div/input")
	public WebElement filialvi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-DT_LANC\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributoicmsvi;
	

	@FindBy(xpath = "//div[contains(@class,\"taxMap\")]/div/div/div/div/div/div[@class=\"componentName\"]")

	public WebElement tributocofinsvi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainiciovi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafimvi;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div/div/input")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div/input")
	public WebElement empresa;
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div/input")
	public WebElement uffilia;
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div/input")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-DT_LANC\"]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributoicms;
	
	@FindBy(xpath = "//div[contains(@class,\"taxMap\")]/div/div/div/div/div/div[@class=\"componentName\"]")
	public WebElement tributocofins;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafim;
	
	
	public MapeamentoDeEstruturasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);

		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeEstruturasCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		String estruturadadosvisualizar = estruturadedadosvi.getAttribute("value");
		String empresavisualizar = empresavi.getAttribute("value");
		String uffilialvisualizar = uffiliavi.getAttribute("value");
		String filialvisualizar = filialvi.getAttribute("value");
		String datavisualizar = datavi.getText();
		String tributoicmsvisualizar = tributoicmsvi.getText();
		String tributocofinsvisualizar = tributocofinsvi.getText();
		String datainiciovisualizar = datainiciovi.getAttribute("value");
		String datafimvisualizar = datafimvi.getAttribute("value");
		
		System.out.println(estruturadadosvisualizar);
		System.out.println(empresavisualizar);
		System.out.println(uffilialvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(datavisualizar);
		System.out.println(tributoicmsvisualizar);
		System.out.println(tributocofinsvisualizar);
		System.out.println(datainiciovisualizar);
		System.out.println(datafimvisualizar);
		
		aceitar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("MapeamentoDeEstruturasCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

	    sleep(12000);

	    
	    String estruturadadoseditar = estruturadedados.getAttribute("value");
		String empresaeditar = empresa.getAttribute("value");
		String uffilialeditar = uffilia.getAttribute("value");
		String filialeditar = filial.getAttribute("value");
		String dataeditar = data.getText();
		String tributoicmseditar = tributoicms.getText();
		//String tributocofinseditar = tributocofins.getText();
		String datainicioeditar = datainicio.getAttribute("value");
		String datafimeditar = datafim.getAttribute("value");
		
		System.out.println(estruturadadoseditar);
		System.out.println(empresaeditar);
		System.out.println(uffilialeditar);
		System.out.println(filialeditar);
		System.out.println(dataeditar);
		System.out.println(tributoicmseditar);
	//	System.out.println(tributocofinseditar);
		System.out.println(datainicioeditar);
		System.out.println(datafimeditar);
	  
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(estruturadadoseditar.contains(estruturadadosvisualizar));
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(uffilialeditar.contains(uffilialvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(dataeditar.contains(datavisualizar));
		sucesso.add(tributoicmseditar.contains(tributoicmsvisualizar));
		//sucesso.add(tributocofinseditar.contains(tributocofinsvisualizar));
		sucesso.add(datainicioeditar.contains(datainiciovisualizar));
		sucesso.add(datafimeditar.contains(datafimvisualizar));

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}


}
