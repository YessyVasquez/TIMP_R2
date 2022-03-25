package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeDeTributacaoXFornecedorDetalhesPO extends TestBaseSteven{
	@FindBy(xpath = "//span[text()=\"Atividades para tributação\"]")
	public WebElement atividadesTributacao;
	
	@FindBy(xpath = "//span[text()=\"Atividade de Tributação x Fornecedor\"]")
	public WebElement atividadeTributacaoXFornecedor;
	
	@FindBy(xpath = "//span[text()=\"Novo  Modelo de Apuração TP\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement atividade;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement conta;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement centro;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement prestado;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
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
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	public AtividadeDeTributacaoXFornecedorDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
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
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String iddetalhes = id.getText();
		String atividadedetalhes = atividade.getText();
		String contadetalhes = conta.getText();
		String centrodetalhes = centro.getText();
		String prestadodetalhes = prestado.getText();
		String notafiscaldetalhes = notafiscal.getText();
		
		
		System.out.println(iddetalhes);
		System.out.println( atividadedetalhes);
		System.out.println(contadetalhes);
		System.out.println(centrodetalhes);
		System.out.println(prestadodetalhes);
		System.out.println(notafiscaldetalhes);
	
		
		
		fechar.click();
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
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String idvisualizar = idvi.getText();
		String atividadevisualizar = atividadevi.getText();
		String contavisualizar = contavi.getText();
		String centrovisualizar = centrovi.getText();
		String prestadovisualizar = prestadovi.getText();
		String notafiscalvisualizar = notafiscalvi.getText();
		
		
		System.out.println(idvisualizar);
		System.out.println( atividadevisualizar);
		System.out.println(contavisualizar);
		System.out.println(centrovisualizar);
		System.out.println(prestadovisualizar);
		System.out.println(notafiscalvisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(atividadevisualizar.equals(atividadedetalhes));
		sucesso.add(contavisualizar.equals(contadetalhes));
		sucesso.add( centrovisualizar.equals(centrodetalhes));
		sucesso.add(prestadovisualizar.equals(prestadodetalhes));
		sucesso.add(notafiscalvisualizar.equals(notafiscaldetalhes));
		System.out.println(sucesso);
		return sucesso;
	}


}
