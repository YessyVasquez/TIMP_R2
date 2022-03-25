package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeDetalhamentosParaRegistro11VisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Detalhamentos para Registro 11\"]")
	public WebElement tabeladedetalhamentos11;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Obrigação \"]")
	public WebElement obrigacao;

	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Código de Detalhamento\"]")
	public WebElement codigododetalhamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descrição de Detalhamento\"]")
	public WebElement descricaodedetalhamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Tipo de Detalhamento\"]")
	public WebElement tipodedetalhamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descrição de Tipo de Detalhamento\"]")
	public WebElement descricaodetipodedetalhamento;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vigência de\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"detailingCode\"]")
	public WebElement codigododetalhamentovi;
	
	@FindBy(xpath = "//span[@id=\"detailingDescription\"]")
	public WebElement descricaodedetalhamentovi;
	
	@FindBy(xpath = "//span[@id=\"detailingType\"]")
	public WebElement tipodedetalhamentovi;
	
	@FindBy(xpath = "//span[@id=\"detailingTypeDescription\"]")
	public WebElement descricaodetipodedetalhamentovi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datavi;
	
	public TabelaDeDetalhamentosParaRegistro11VisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladedetalhamentos11.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeDetalhamentoParaRegistro11");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigododetalhamentovisualizar = codigododetalhamentovi.getText();
		String descricaodedetalhamentovisualizar = descricaodedetalhamentovi.getText();
		String tipodedetalhamentovisualizar = tipodedetalhamentovi.getText();
		String descricaodetipodedetalhamentovisualizar = descricaodetipodedetalhamentovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigododetalhamentovisualizar);
		System.out.println(descricaodedetalhamentovisualizar);
		System.out.println(tipodedetalhamentovisualizar);
		System.out.println(descricaodetipodedetalhamentovisualizar);
		System.out.println(datavisualizar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TabelaDeDetalhamentoParaRegistro11");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String obrigacaoeditar=obrigacao.getAttribute("value");
		String codigododetalhamentoeditar=codigododetalhamento.getAttribute("value");
		String descricaodedetalhamentoeditar = descricaodedetalhamento.getAttribute("value");
		String tipodedetalhamentoeditar = tipodedetalhamento.getAttribute("value");
		String descricaodetipodedetalhamentoeditar = descricaodetipodedetalhamento.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println( codigododetalhamentoeditar);
		System.out.println(descricaodedetalhamentoeditar);
		System.out.println(tipodedetalhamentoeditar);
		System.out.println(descricaodetipodedetalhamentoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(codigododetalhamentoeditar.equals(codigododetalhamentovisualizar));
		sucesso.add(descricaodedetalhamentoeditar.equals(descricaodedetalhamentovisualizar));
		sucesso.add(tipodedetalhamentovisualizar.equals(tipodedetalhamentoeditar));
		sucesso.add(descricaodetipodedetalhamentovisualizar.equals(descricaodetipodedetalhamentoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	


}
