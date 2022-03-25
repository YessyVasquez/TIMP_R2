package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1200VisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisRegister1200\"]")
	public WebElement registro1200;
	
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
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Natureza da Contribuição a Recolher \"]")
	public WebElement natureza;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribuição Apurada \"]")
	public WebElement valorcontribuicaoapurada;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor de Crédito de PIS/PASEP a Descontar da Contribuição Social Extemporânea \"]")
	public WebElement valordecredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribuição Social Extemporânea Devida \"]")
	public WebElement valorcontribuicaosocial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor de Outras Deduções \"]")
	public WebElement valordeoutras;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribuição Social Extemporânea a Pagar \"]")
	public WebElement valorextemporaneo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Multa \"]")
	public WebElement valormulta;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor dos Juros \"]")
	public WebElement valorjuros;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data de Recolhimento\"]")
	public WebElement data;
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	

	
	public Registro1200VisualizarPO() {
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
		registro1200.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1200");
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
		
		
		if(tc2 ==true) {
			
			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filialtc2.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String naturezavisualizar = natureza.getAttribute("value");
			String valorcontribuicaoapuradavisualizar = valorcontribuicaoapurada.getAttribute("value");
			String valordecreditovisualizar = valordecredito.getAttribute("value");
			String valorcontribuicaosocialvisualizar = valorcontribuicaosocial.getAttribute("value");
			String valordeoutrasvisualizar = valordeoutras.getAttribute("value");
			String valorextemporaneovisualizar = valorextemporaneo.getAttribute("value");
			String valormultavisualizar = valormulta.getAttribute("value");
			String valorjurosvisualizar = valorjuros.getAttribute("value");
			String datavisualizar = data.getAttribute("value");
			
			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(naturezavisualizar);
			System.out.println(valorcontribuicaoapuradavisualizar);
			System.out.println(valordecreditovisualizar);
			System.out.println(valorcontribuicaosocialvisualizar);
			System.out.println(valordeoutrasvisualizar);
			System.out.println(valorextemporaneovisualizar);
			System.out.println(valormultavisualizar);
			System.out.println(valorjurosvisualizar);
			System.out.println(datavisualizar);
			
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
			String naturezaeditar = natureza.getAttribute("value");
			String valorcontribuicaoapuradaeditar = valorcontribuicaoapurada.getAttribute("value");
			String valordecreditoeditar = valordecredito.getAttribute("value");
			String valorcontribuicaosocialeditar = valorcontribuicaosocial.getAttribute("value");
			String valordeoutraseditar = valordeoutras.getAttribute("value");
			String valorextemporaneoeditar = valorextemporaneo.getAttribute("value");
			String valormultaeditar = valormulta.getAttribute("value");
			String valorjuroseditar = valorjuros.getAttribute("value");
			String dataeditar = data.getAttribute("value");
			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(naturezaeditar);
			System.out.println(valorcontribuicaoapuradaeditar);
			System.out.println(valordecreditoeditar);
			System.out.println(valorcontribuicaosocialeditar);
			System.out.println(valordeoutraseditar);
			System.out.println(valorextemporaneoeditar);
			System.out.println(valormultaeditar);
			System.out.println(valorjuroseditar);
			System.out.println(dataeditar);
			
			
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			
			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(naturezaeditar.contains(naturezavisualizar));
			sucesso.add(valorcontribuicaoapuradaeditar.contains(valorcontribuicaoapuradavisualizar));
			sucesso.add(valordecreditoeditar.contains(valordecreditovisualizar));
			sucesso.add(valorcontribuicaosocialeditar.contains(valorcontribuicaosocialvisualizar));
			sucesso.add(valordeoutraseditar.contains(valordeoutrasvisualizar));
			sucesso.add(valorextemporaneoeditar.contains(valorextemporaneovisualizar));
			sucesso.add(valormultaeditar.contains(valormultavisualizar));
			sucesso.add(valorjuroseditar.contains(valorjurosvisualizar));
			sucesso.add(dataeditar.contains(datavisualizar));
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
		String naturezavisualizar = natureza.getAttribute("value");
		String valorcontribuicaoapuradavisualizar = valorcontribuicaoapurada.getAttribute("value");
		String valordecreditovisualizar = valordecredito.getAttribute("value");
		String valorcontribuicaosocialvisualizar = valorcontribuicaosocial.getAttribute("value");
		String valordeoutrasvisualizar = valordeoutras.getAttribute("value");
		String valorextemporaneovisualizar = valorextemporaneo.getAttribute("value");
		String valormultavisualizar = valormulta.getAttribute("value");
		String valorjurosvisualizar = valorjuros.getAttribute("value");
		String datavisualizar = data.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(naturezavisualizar);
		System.out.println(valorcontribuicaoapuradavisualizar);
		System.out.println(valordecreditovisualizar);
		System.out.println(valorcontribuicaosocialvisualizar);
		System.out.println(valordeoutrasvisualizar);
		System.out.println(valorextemporaneovisualizar);
		System.out.println(valormultavisualizar);
		System.out.println(valorjurosvisualizar);
		System.out.println(datavisualizar);
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
		String naturezaeditar = natureza.getAttribute("value");
		String valorcontribuicaoapuradaeditar = valorcontribuicaoapurada.getAttribute("value");
		String valordecreditoeditar = valordecredito.getAttribute("value");
		String valorcontribuicaosocialeditar = valorcontribuicaosocial.getAttribute("value");
		String valordeoutraseditar = valordeoutras.getAttribute("value");
		String valorextemporaneoeditar = valorextemporaneo.getAttribute("value");
		String valormultaeditar = valormulta.getAttribute("value");
		String valorjuroseditar = valorjuros.getAttribute("value");
		String dataeditar = data.getAttribute("value");
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(naturezaeditar);
		System.out.println(valorcontribuicaoapuradaeditar);
		System.out.println(valordecreditoeditar);
		System.out.println(valorcontribuicaosocialeditar);
		System.out.println(valordeoutraseditar);
		System.out.println(valorextemporaneoeditar);
		System.out.println(valormultaeditar);
		System.out.println(valorjuroseditar);
		System.out.println(dataeditar);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(ufeditar.contains(ufvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(naturezaeditar.contains(naturezavisualizar));
		sucesso.add(valorcontribuicaoapuradaeditar.contains(valorcontribuicaoapuradavisualizar));
		sucesso.add(valordecreditoeditar.contains(valordecreditovisualizar));
		sucesso.add(valorcontribuicaosocialeditar.contains(valorcontribuicaosocialvisualizar));
		sucesso.add(valordeoutraseditar.contains(valordeoutrasvisualizar));
		sucesso.add(valorextemporaneoeditar.contains(valorextemporaneovisualizar));
		sucesso.add(valormultaeditar.contains(valormultavisualizar));
		sucesso.add(valorjuroseditar.contains(valorjurosvisualizar));
		sucesso.add(dataeditar.contains(datavisualizar));
		System.out.println(sucesso);
		return sucesso;
	}

	}


}
