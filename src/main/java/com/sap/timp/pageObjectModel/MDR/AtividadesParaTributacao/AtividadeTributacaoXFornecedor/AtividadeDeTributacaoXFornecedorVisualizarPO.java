package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeDeTributacaoXFornecedorVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributação\"]")
	public WebElement atividadesTributacao;
	
	@FindBy(xpath = "//span[text()=\"Atividade de Tributação x Fornecedor\"]")
	public WebElement atividadeTributacaoXFornecedor;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Enquadramento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Atividade para tributação\"]")
	public WebElement atividade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nº conta do fornecedor\"]")
	public WebElement conta;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Centro\"]")
	public WebElement centro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Prestado dentro do município\"]")
	public WebElement prestado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Ctg. de nota fiscal\"]")
	public WebElement notafiscal;
	
	
	
	
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
	
	@FindBy(xpath = "//span[@id=\"taxActivity\"]")
	public WebElement atividadevi;
	
	@FindBy(xpath = "//span[@id=\"supplier\"]")
	public WebElement contavi;
	
	@FindBy(xpath = "//span[@id=\"center\"]")
	public WebElement centrovi;
	
	@FindBy(xpath = "//span[@id=\"providedInMunicipality\"]")
	public WebElement prestadovi;
	
	@FindBy(xpath = "//span[@id=\"fiscalNoteCategory\"]")
	public WebElement notafiscalvi;
	
	
	public AtividadeDeTributacaoXFornecedorVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		atividadesTributacao.click();
		sleep(2000);
		
		atividadeTributacaoXFornecedor.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AtividadeDeTributacaoXFornecedor");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar

		
		String atividadevisualizar = atividadevi.getText();
		String contavisualizar = contavi.getText();
		String centrovisualizar = centrovi.getText();
		String prestadovisualizar = prestadovi.getText();
		String notafiscalvisualizar = notafiscalvi.getText();
		
		
		
		System.out.println( atividadevisualizar);
		System.out.println(contavisualizar);
		System.out.println(centrovisualizar);
		System.out.println(prestadovisualizar);
		System.out.println(notafiscalvisualizar);
		
		
	
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
		String idRegistro1 = idObter("AtividadeDeTributacaoXFornecedor");
		
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
		waitExpectElement(biblioteca);
		sleep(2000);
		
		//editar
		
		String atividadeeditar = atividade.getAttribute("value");
		String contaeditar = conta.getAttribute("value");
		String centroeditar = centro.getAttribute("value");
		String prestadoeditar = prestado.getAttribute("value");
		String notafiscaleditar = notafiscal.getAttribute("value");
		
		
		
		System.out.println( atividadeeditar);
		System.out.println(contaeditar);
		System.out.println(centroeditar);
		System.out.println(prestadoeditar);
		System.out.println(notafiscaleditar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(atividadeeditar.equals(atividadevisualizar));
		sucesso.add(contaeditar.equals(contavisualizar));
		sucesso.add(centroeditar.equals(centrovisualizar));
		sucesso.add(prestadoeditar.equals(prestadovisualizar));
		sucesso.add(notafiscaleditar.equals(notafiscalvisualizar));
		
		System.out.println(sucesso);
		return sucesso;	

	
	}	


}
