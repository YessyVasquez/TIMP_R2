package com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EnquadramentoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Enquadramento\"]")
	public WebElement enquadramento;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Enquadramento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Enquadramento\"]")
	public WebElement codigodeenquadramento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código NBS \"]")
	public WebElement codigonbs;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador RC\"]")
	public WebElement indicatorrc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Módulo Venda\"]")
	public WebElement modulovenda;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Módulo Aquisição\"]")
	public WebElement moduloaquisicao;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"frameworkCode\"]")
	public WebElement codigodeenquadramentovi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"nbsCode\"]")
	public WebElement codigonbsvi;
	
	@FindBy(xpath = "//span[@id=\"indicatorRc\"]")
	public WebElement indicatorrcvi;
	
	@FindBy(xpath = "//span[@id=\"salesModule\"]")
	public WebElement modulovendavi;
	
	@FindBy(xpath = "//span[@id=\"acModule\"]")
	public WebElement moduloaquisicaovi;
	
	public EnquadramentoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		enquadramento.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("Enquadramento");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		waitExpectElement(codigodeenquadramentovi);
		sleep(2000);
	
		
		String codigodeenquadramentovisualizar = codigodeenquadramentovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String codigonbsvisualizar = codigonbsvi.getText();
		String indicadorrcvisualizar = indicatorrcvi.getText();
		String modulovendavisualizar = modulovendavi.getText();
		String moduloaquisicaovisualizar = moduloaquisicaovi.getText();
		
		
		
		System.out.println(codigodeenquadramentovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(codigonbsvisualizar);
		System.out.println(indicadorrcvisualizar);
		System.out.println(modulovendavisualizar);
		System.out.println(moduloaquisicaovisualizar);
		
	
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("Enquadramento");
		
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
		
		
		String codigodeenquadramentoeditar=codigodeenquadramento.getAttribute("value");
		String descricaoeditar=descricao.getAttribute("value");
		String codigonbseditar = codigonbs.getAttribute("value");
		String indicadorrceditar = indicatorrc.getAttribute("value");
		String modulovendaeditar = modulovenda.getAttribute("value");
		String moduloaquisicaoeditar = moduloaquisicao.getAttribute("value");
		
		System.out.println( codigodeenquadramentoeditar);
		System.out.println( descricaoeditar);
		System.out.println(codigonbseditar);
		System.out.println(indicadorrceditar);
		System.out.println(modulovendaeditar);
		System.out.println(moduloaquisicaoeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigodeenquadramentoeditar.equals(codigodeenquadramentovisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(codigonbseditar.equals(codigonbsvisualizar));
		sucesso.add(indicadorrceditar.equals(indicadorrcvisualizar));
		sucesso.add(modulovendaeditar.equals(modulovendavisualizar));
		sucesso.add(moduloaquisicaoeditar.equals(moduloaquisicaovisualizar));
		System.out.println(sucesso);
		return sucesso;	

	
	}	

}
