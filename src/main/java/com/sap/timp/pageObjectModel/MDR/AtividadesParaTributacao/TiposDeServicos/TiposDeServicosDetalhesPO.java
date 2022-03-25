package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.TiposDeServicos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeServicosDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributação\"]")
	public WebElement atividadesparatributacao;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Serviços\"]")
	public WebElement tiposdeservicos;
	
	@FindBy(xpath = "//span[text()=\"Novo Tipos de Serviços\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigopais;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement atividade;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement descricao;
	
	
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
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"taxActivity\"]")
	public WebElement atividadevi;
	
	@FindBy(xpath = "//span[@id=\"groupTaxActivity\"]")
	public WebElement grupovi;
	
	@FindBy(xpath = "//span[@id=\"descriptionTaxActivity\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public TiposDeServicosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		atividadesparatributacao.click();
		sleep(2000);
		
		tiposdeservicos.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TiposDeServicio");
		
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
		String codigodetalhes = codigopais.getText();
		String atividadedetalhes = atividade.getText();
		String grupodetalhes = grupo.getText();
		String descricaodetalhes = descricao.getText();
		
		
		
		System.out.println(iddetalhes);
		System.out.println(codigodetalhes);
		System.out.println(atividadedetalhes);
		System.out.println(grupodetalhes);
		System.out.println(descricaodetalhes);
	;
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TiposDeServicio");
		
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
		String codigovisualizar = codigovi.getText();
		String atividadevisualizar = atividadevi.getText();
		String grupovisualizar = grupovi.getText();
		String descricaovisualizar = descricaovi.getText();
	
		
		
		System.out.println(idvisualizar);
		System.out.println(codigovisualizar);
		System.out.println(atividadevisualizar);
		System.out.println(grupovisualizar);
		System.out.println(descricaovisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(atividadevisualizar.equals(atividadedetalhes));
		sucesso.add(grupovisualizar.equals(grupodetalhes));
		sucesso.add(descricaovisualizar.equals(descricaodetalhes));
		
		
		return sucesso;
	}


}
