package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1300;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1300VisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1300\"]")
	public WebElement registro1300;
	
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
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da retenção na Fonte \"]")
	public WebElement indicador;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do crédito a Descontar \"]")
	public WebElement valortotal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Retenção deduzida da Contribuição devida \"]")
	public WebElement valordeduzida;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Retenção utilizada mediante Pedido de Restitução \"]")
	public WebElement valorutilizada;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Retenção utilizada mendiante Declaração de Compensação \"]")
	public WebElement valorcompensacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Saldo de Retenção a utilizar em períodos de apuração futuros \"]")
	public WebElement saldoretencao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	

	
	public Registro1300VisualizarPO() {
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
		registro1300.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1300");
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
			System.out.println("entrei aqui");
			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filialtc2.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String indicadorvisualizar = indicador.getAttribute("value");
			String valortotalvisualizar = valortotal.getAttribute("value");
			String valordeduzidavisualizar = valordeduzida.getAttribute("value");
			String valorutilizadavisualizar = valorutilizada.getAttribute("value");
			String valorcompensacaovisualizar = valorcompensacao.getAttribute("value");
			String saldoretencaovisualizar = saldoretencao.getAttribute("value");
			
			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(indicadorvisualizar);
			System.out.println(valortotalvisualizar);
			System.out.println(valordeduzidavisualizar);
			System.out.println(valorutilizadavisualizar);
			System.out.println(valorcompensacaovisualizar);
			System.out.println(saldoretencaovisualizar);
			
			
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
			String indicadoreditar = indicador.getAttribute("value");
			String valortotaleditar = valortotal.getAttribute("value");
			String valordeduzidaeditar = valordeduzida.getAttribute("value");
			String valorutilizadaeditar = valorutilizada.getAttribute("value");
			String valorcompensacaoeditar = valorcompensacao.getAttribute("value");
			String saldoretencaoeditar = saldoretencao.getAttribute("value");
			
			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(indicadoreditar);
			System.out.println(valortotaleditar);
			System.out.println(valordeduzidaeditar);
			System.out.println(valorutilizadaeditar);
			System.out.println(valorcompensacaoeditar);
			System.out.println(saldoretencaoeditar);
			
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			
			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(indicadoreditar.contains(indicadorvisualizar));
			sucesso.add(valortotaleditar.contains(valortotalvisualizar));
			sucesso.add(valordeduzidaeditar.contains(valordeduzidavisualizar));
			sucesso.add(valorutilizadaeditar.contains(valorutilizadavisualizar));
			sucesso.add(valorcompensacaoeditar.contains(valorcompensacaovisualizar));
			sucesso.add(saldoretencaoeditar.contains(saldoretencaovisualizar));
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
		String indicadorvisualizar = indicador.getAttribute("value");
		String valortotalvisualizar = valortotal.getAttribute("value");
		String valordeduzidavisualizar = valordeduzida.getAttribute("value");
		String valorutilizadavisualizar = valorutilizada.getAttribute("value");
		String valorcompensacaovisualizar = valorcompensacao.getAttribute("value");
		String saldoretencaovisualizar = saldoretencao.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(indicadorvisualizar);
		System.out.println(valortotalvisualizar);
		System.out.println(valordeduzidavisualizar);
		System.out.println(valorutilizadavisualizar);
		System.out.println(valorcompensacaovisualizar);
		System.out.println(saldoretencaovisualizar);
		
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
		String indicadoreditar = indicador.getAttribute("value");
		String valortotaleditar = valortotal.getAttribute("value");
		String valordeduzidaeditar = valordeduzida.getAttribute("value");
		String valorutilizadaeditar = valorutilizada.getAttribute("value");
		String valorcompensacaoeditar = valorcompensacao.getAttribute("value");
		String saldoretencaoeditar = saldoretencao.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(indicadoreditar);
		System.out.println(valortotaleditar);
		System.out.println(valordeduzidaeditar);
		System.out.println(valorutilizadaeditar);
		System.out.println(valorcompensacaoeditar);
		System.out.println(saldoretencaoeditar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(ufeditar.contains(ufvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(indicadoreditar.contains(indicadorvisualizar));
		sucesso.add(valortotaleditar.contains(valortotalvisualizar));
		sucesso.add(valordeduzidaeditar.contains(valordeduzidavisualizar));
		sucesso.add(valorutilizadaeditar.contains(valorutilizadavisualizar));
		sucesso.add(valorcompensacaoeditar.contains(valorcompensacaovisualizar));
		sucesso.add(saldoretencaoeditar.contains(saldoretencaovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}

	}

}
