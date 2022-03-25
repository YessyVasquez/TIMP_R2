package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeParametrosDeEntradaVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Parâmetros de Entrada\"]")
	public WebElement mapeamento;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")

	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de dados \"]")
	public WebElement estruturavi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo \"]")
	public WebElement direcaomovimentovi;

	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de dados \"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo \"]")
	public WebElement direcaomovimento;

	
	
	public MapeamentoDeParametrosDeEntradaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);

		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String estruturavisualizar = estruturavi.getAttribute("value");
		String direcaomovimentovisualizar = direcaomovimentovi.getAttribute("value");
		
		
		System.out.println(estruturavisualizar);
		System.out.println(direcaomovimentovisualizar);
	
		aceitar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
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
	    
	  
	    String estruturaeditar = estrutura.getAttribute("value");
		String direcaomovimentoeditar = direcaomovimento.getAttribute("value");
		
		
		System.out.println(estruturaeditar);
		System.out.println(direcaomovimentoeditar);
	
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(estruturaeditar.contains(estruturavisualizar));
		sucesso.add(direcaomovimentoeditar.contains(direcaomovimentovisualizar));
		
		
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
