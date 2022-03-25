package com.sap.timp.pageObjectModel.MDR.RepresentantesLegais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RepresentantesLegaisVisualizarPO extends TestBaseSteven {
	
	
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
	

	
	@FindBy(xpath = "//span[@id=\"nome\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//span[@id=\"email\"]")
	public WebElement emailvi;
	
	@FindBy(xpath = "//span[@id=\"logradouro\"]")
	public WebElement logadourovi;
	
	@FindBy(xpath = "//span[@id=\"labelTipoRepresentante\"]")
	public WebElement tipovi;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o nome de Representante Legal\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o CEP\"]")
	public WebElement cep;
	
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"TIPO_REPRESENTANTE\"]/div/div/div[2]")
	public WebElement tipoderepresentante;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipoderepresentante;
	

	@FindBy(xpath = "//input[@placeholder=\"Introduzir o cargo\"]")
	public WebElement cargo;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o CPF\"]")
	public WebElement cpf;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o RG\"]")
	public WebElement rg;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o e-mail\"]")
	public WebElement email;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o DDD\"]")
	public WebElement ddd;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o número de telefone\"]")
	public WebElement numerodetelefone;
	

	public RepresentantesLegaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}	

	
	public ArrayList<Boolean> visualizar() {
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
		
		String nomevisualizar = nomevi.getText();
		String emailvisualizar = emailvi.getText();
	
		
		
		System.out.println(nomevisualizar);
		System.out.println(emailvisualizar);
	
	
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
		String idRegistro1 = idObter("RepresentantesLegais");
		
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
		
		String nomeeditar=nome.getAttribute("value");
		String emaileditar=email.getAttribute("value");
		;
	
	
		System.out.println( nomeeditar);
		System.out.println(emaileditar);
		

	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.equals(nomeeditar));
		sucesso.add(emailvisualizar.equals(emaileditar));
		System.out.println(sucesso);
		return sucesso;	

	
	}	
}
