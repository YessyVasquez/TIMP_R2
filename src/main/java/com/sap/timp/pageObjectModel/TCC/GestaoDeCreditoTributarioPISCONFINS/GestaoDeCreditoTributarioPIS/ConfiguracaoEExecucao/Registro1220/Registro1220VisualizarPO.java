package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1220;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1220VisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1220\"]")
	public WebElement registro1220;
	
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Origem do Crédito \"]")
	public WebElement origemcredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do crédito a Descontar \"]")
	public WebElement valorcredito;
	
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	

	
	public Registro1220VisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1220.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1220");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		/*attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		*/
		/*attributoNotToBeEmptyXpath("//div[@id=\"uf\"]/div", "value");
		sleep(2000);
		attributoNotToBeEmptyXpath("//div[@id=\"branch\"]/div", "value");
		sleep(2000);
		*/
		if(tc2 ==true) {
			
			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filialtc2.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String origemcreditovisualizar = origemcredito.getAttribute("value");
			String valorcreditovisualizar = valorcredito.getAttribute("value");
			
			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(origemcreditovisualizar);
			System.out.println(valorcreditovisualizar);
			
			biblioteca.click();
			
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(nao);
			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(ultimaPagina);
			sleep(2000);
			
			ultimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElementElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);
			
			String empresaeditar = empresa.getAttribute("value");
			String ufeditar = uf.getText();
			String filialeditar = filialtc2.getText();
			String tributoeditar = tributo.getAttribute("value");
			String origemcreditoeditar = origemcredito.getAttribute("value");
			String valorcreditoeditar = valorcredito.getAttribute("value");
			
			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(origemcreditoeditar);
			System.out.println(valorcreditoeditar);
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			
			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(origemcreditoeditar.contains(origemcreditovisualizar));
			sucesso.add(valorcreditoeditar.contains(valorcreditovisualizar));
			
			System.out.println(sucesso);
			return sucesso;
			
		}else {
			
		
		waitExpectElement(uf);
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String tributovisualizar = tributo.getAttribute("value");
		String origemcreditovisualizar = origemcredito.getAttribute("value");
		String valorcreditovisualizar = valorcredito.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(origemcreditovisualizar);
		System.out.println(valorcreditovisualizar);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(nao);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimaPagina);
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(uf);
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		
		String empresaeditar = empresa.getAttribute("value");
		String ufeditar = uf.getText();
		String filialeditar = filial.getText();
		String tributoeditar = tributo.getAttribute("value");
		String origemcreditoeditar = origemcredito.getAttribute("value");
		String valorcreditoeditar = valorcredito.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(origemcreditoeditar);
		System.out.println(valorcreditoeditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(ufeditar.contains(ufvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(origemcreditoeditar.contains(origemcreditovisualizar));
		sucesso.add(valorcreditoeditar.contains(valorcreditovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}

	}
}
