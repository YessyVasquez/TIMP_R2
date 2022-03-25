package com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PaisMoedaDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"País/Moeda\"]")
	public WebElement paismoeda;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement pais;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement moeda;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement ativo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de País\"]")
	public WebElement codigodepais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Moeda\"]")
	public WebElement codigodemoeda;
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"country\"]")
	public WebElement paisvi;
	
	@FindBy(xpath = "//span[@id=\"coin\"]")
	public WebElement moedavi;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativovi;
	
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement codigodepaisvi;
	
	@FindBy(xpath = "//span[@id=\"coinCode\"]")
	public WebElement codigodemoedavi;
	
	public PaisMoedaDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		paismoeda.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("PaisMoeda");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		
		//detalhes
		//String iddetalhes = id.getText();
		String paisdetalhes = pais.getText();
		String moedadetalhes =moeda.getText();
		String ativodetalhes = ativo.getText();
		
		
		//System.out.println(iddetalhes);
		System.out.println(paisdetalhes);
		System.out.println(moedadetalhes);
		System.out.println(ativodetalhes);
		
		
		fechar.click();
		
		
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("PaisMoeda");
		
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
		waitExpectElement(paisvi);
		sleep(2000);
		String paisvisualizar = paisvi.getText();
		String moedavisualizar = moedavi.getText();
		String ativovisualizar = ativovi.getText();
		
		
		System.out.println(paisvisualizar);
		System.out.println(moedavisualizar);
		System.out.println(ativovisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(paisvisualizar.equals(paisdetalhes));
		sucesso.add(moedavisualizar.equals(moedadetalhes));
		sucesso.add(ativovisualizar.equals(ativodetalhes));
		
		return sucesso;
	}
}
