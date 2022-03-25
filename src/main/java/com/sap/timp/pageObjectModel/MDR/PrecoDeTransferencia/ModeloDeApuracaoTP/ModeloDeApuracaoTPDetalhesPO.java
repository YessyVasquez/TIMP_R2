package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ModeloDeApuracaoTPDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Modelo de Apuração TP\"]")
	public WebElement modelodeapuracao;
	
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
	
	//DATOS DEL DETALLE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement modelo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement tipo;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement respaldo;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement datainicial;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
	@FindBy(xpath = "//span[@id=\"model\"]")
	public WebElement modelovi;
	
	@FindBy(xpath = "//span[@id=\"type\"]")
	public WebElement tipovi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"legalSupport\"]")
	public WebElement respaldovi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	public ModeloDeApuracaoTPDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		modelodeapuracao.click();
		
		sleep(2000);
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ModeloDeApuracaoTP");
		
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
		String modelodetalhes = modelo.getText();
		String tipodetalhes = tipo.getText();
		String descricaodetalhes = descricao.getText();
		String respaldodetalhes = respaldo.getText();
		String datadetalhes = datainicial.getText();
		
		
		System.out.println(iddetalhes);
		System.out.println( modelodetalhes);
		System.out.println(tipodetalhes);
		System.out.println(descricaodetalhes);
		System.out.println(respaldodetalhes);
		System.out.println(datadetalhes);
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ModeloDeApuracaoTP");
		
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
		String modelovisualizar = modelovi.getText();
		String tipovisualizar = tipovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String respaldovisualizar = respaldovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println( idvisualizar);
		System.out.println(modelovisualizar);
		System.out.println(tipovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println( respaldovisualizar);
		System.out.println( datavisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(modelovisualizar.equals(modelodetalhes));
		sucesso.add(tipovisualizar.equals(tipodetalhes));
		sucesso.add( descricaovisualizar.equals(descricaodetalhes));
		sucesso.add(respaldovisualizar.equals(respaldodetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		return sucesso;
	}


}
