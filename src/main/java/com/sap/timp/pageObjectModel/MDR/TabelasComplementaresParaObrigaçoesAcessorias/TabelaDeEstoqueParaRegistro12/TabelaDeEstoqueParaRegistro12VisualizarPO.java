package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeEstoqueParaRegistro12VisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Estoque para Registro 12\"]")
	public WebElement tabelaestoqueregistro12;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Obrigação \"]")
	public WebElement obrigacao;

	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Tipo de Estoque Obrigação\"]")
	public WebElement tipodeestoque;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descrição de Natureza Obrigação\"]")
	public WebElement descricaodenatureza;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Tipo de Detalhamento\"]")
	public WebElement tipodedetalhamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Tipo de Material\"]")
	public WebElement tipomaterial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descrição do Tipo de Material\"]")
	public WebElement descricaodotipodematerial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vigência de\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"inventoryObligationType\"]")
	public WebElement tipodeestoquevi;
	
	@FindBy(xpath = "//span[@id=\"inventoryObligationDescription\"]")
	public WebElement descricaodenaturezavi;
	
	@FindBy(xpath = "//span[@id=\"inventoryMaterialTypeDescription\"]")
	public WebElement descricaodotipodematerialvi;
	
	@FindBy(xpath = "//span[@id=\"inventoryMaterialType\"]")
	public WebElement tipodematerialvi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datavi;
	

	public TabelaDeEstoqueParaRegistro12VisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabelaestoqueregistro12.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeDetalhamentoParaRegistro12");
		
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
		String tipodeestoquevisualizar = tipodeestoquevi.getText();
		String descricaodenaturezavisualizar = descricaodenaturezavi.getText();
		String tipodematerialvisualizar = tipodematerialvi.getText();
		String descricaodotipodematerialvisualizar = descricaodotipodematerialvi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println(obrigacaovisualizar);
		System.out.println(tipodeestoquevisualizar);
		System.out.println(descricaodenaturezavisualizar);
		System.out.println(tipodematerialvisualizar);
		System.out.println(descricaodotipodematerialvisualizar);
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
		String idRegistro1 = idObter("TabelaDeDetalhamentoParaRegistro12");
		
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
		String tipodeestoqueeditar=tipodeestoque.getAttribute("value");
		String descricaodenaturezaeditar = descricaodenatureza.getAttribute("value");
		String tipodematerialeditar = tipomaterial.getAttribute("value");
		String descricaodotipodematerialeditar = descricaodotipodematerial.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println( tipodeestoqueeditar);
		System.out.println(descricaodenaturezaeditar);
		System.out.println(tipodematerialeditar);
		System.out.println(descricaodotipodematerialeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(tipodeestoquevisualizar.equals(tipodeestoqueeditar));
		sucesso.add(descricaodenaturezavisualizar.equals(descricaodenaturezaeditar));
		sucesso.add(tipodematerialvisualizar.equals(tipodematerialeditar));
		sucesso.add(descricaodotipodematerialvisualizar.equals(descricaodotipodematerialeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		return sucesso;	

	
	}	

}
