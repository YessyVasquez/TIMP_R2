package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeCodigoEClasseParaQuadroVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Código e Classe para Quadro 12\"]")
	public WebElement tabeladecodigoeclasseparaquadro;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"dimeCode\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"origin\"]")
	public WebElement origemvi;
	
	@FindBy(xpath = "//span[@id=\"code12\"]")
	public WebElement codigo12vi;
	
	@FindBy(xpath="//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"class\"]")
	public WebElement classevi;
	
	@FindBy(xpath = "//span[@id=\"expiration\"]")
	public WebElement vencimentovi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Obrigação \"]")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Quadro DIME\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Origem\"]")
	public WebElement origem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código Quadro 12\"]")
	public WebElement codigo12;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Classe\"]")
	public WebElement classe;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Vencimiento\"]")
	public WebElement vencimento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement datainicial;
	
	public TabelaDeCodigoEClasseParaQuadroVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladecodigoeclasseparaquadro.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeCodigoEClasseParaQuadro");
		
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
		String codigovisualizar = codigovi.getText();
		String origemvisualizar = origemvi.getText();
		String codigo12visualizar = codigo12vi.getText();
		String descricaovisualizar = descricaovi.getText();
		String classevisualizar = classevi.getText();
		String vencimentovisualizar = vencimentovi.getText();
		String datavisualizar = datavi.getText();
		
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(origemvisualizar);
		System.out.println(codigo12visualizar);
		System.out.println(descricaovisualizar);
		System.out.println(classevisualizar);
		System.out.println(vencimentovisualizar);
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
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String obrigacaoeditar=obrigacao.getAttribute("value");
		String codigoeditar=codigo.getAttribute("value");
		String origemeditar = origem.getAttribute("value");
		String codigo12editar = codigo12.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String classeeditar = classe.getAttribute("value");
		String vencimentoeditar = vencimento.getAttribute("value");
		String dataeditar=datainicial.getAttribute("value");
	
		System.out.println( obrigacaoeditar);
		System.out.println( codigoeditar);
		System.out.println(origemeditar);
		System.out.println(codigo12editar);
		System.out.println(descricaoeditar);
		System.out.println(classeeditar);
		System.out.println(vencimentoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaoeditar));
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(origemvisualizar.equals(origemeditar));
		sucesso.add(codigo12visualizar.equals(codigo12editar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(classevisualizar.equals(classeeditar));
		sucesso.add(vencimentovisualizar.equals(vencimentoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		
		return sucesso;	

	
	}	

}
