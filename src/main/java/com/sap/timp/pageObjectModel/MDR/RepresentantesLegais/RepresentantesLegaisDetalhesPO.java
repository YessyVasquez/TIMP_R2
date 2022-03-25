package com.sap.timp.pageObjectModel.MDR.RepresentantesLegais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RepresentantesLegaisDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Representantes Legais\"]")
	public WebElement representanteslegais;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"detail\"][2]/div/div")
	public WebElement nomede;
	
	@FindBy(xpath = "//div[@class=\"detail\"][3]/div/div")
	public WebElement emailde;
	
	@FindBy(xpath = "//div[@class=\"detail\"][4]/div/div")
	public WebElement logodourode;
	
	@FindBy(xpath = "///div[@class=\"detail\"][5]/div/div")
	public WebElement tipode;
	
	@FindBy(xpath = "//span[@id=\"nome\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//span[@id=\"email\"]")
	public WebElement emailvi;
	
	@FindBy(xpath = "//span[@id=\"logradouro\"]")
	public WebElement logadourovi;
	
	@FindBy(xpath = "//span[@id=\"labelTipoRepresentante\"]")
	public WebElement tipovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public RepresentantesLegaisDetalhesPO() {

		PageFactory.initElements(driver, this);
	}	
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		representanteslegais.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RepresentantesLegais");
		
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
		String nomedetalhes = nomede.getText();
		String emaildetalhes = emailde.getText();
		String logodourodetalhes = logodourode.getText();
		//String tipodetalhes = tipode.getText();
		
		System.out.println(nomedetalhes);
		System.out.println(emaildetalhes);
		System.out.println(logodourodetalhes);
		//System.out.println(tipodetalhes);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("RepresentantesLegais");
		
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
		
		String nomevisualizar = nomevi.getText();
		String emailvisualizar = emailvi.getText();
		String logadourovisualizar = logadourovi.getText();
		String tipovisualizar = tipovi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(emailvisualizar);
		System.out.println(logadourovisualizar);
		//System.out.println(tipovisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.equals(nomedetalhes));
		sucesso.add(emailvisualizar.equals(emaildetalhes));
		sucesso.add(logadourovisualizar.equals(logodourodetalhes));
		//sucesso.add(tipovisualizar.equals(tipodetalhes));
		System.out.println(sucesso);
		return sucesso;
	}

}
