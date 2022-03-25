package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class R1070DadosSuspensoEditarPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados de Suspensão\"]")
	public WebElement R1070DadosSuspenso;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"field-element processNumber\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroProcesso;
	
	@FindBy(xpath = "//div[@class=\"field-element processNumber\"]/div/div[2]/div/div[2]")
	public WebElement numeroProcessoSelect;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div")
	public WebElement opc2;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"field-element validFrom\"]/div/div[2]/div/div[2]")
	public WebElement ValidadeDe;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opc;
	
	public R1070DadosSuspensoEditarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean editar() {
		
		sleep(2000);
		
		Reinf.click();
		sleep(4000);
		R1070DadosSuspenso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DatosSuspensoCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = numeroProcesso.getAttribute("value");
		System.out.println("dato antes editar: "+valor);
		sleep(2000);
		
		numeroProcessoSelect.click();
		sleep(2000);
		opc2.click();
		sleep(2000);
		String enviar = numeroProcesso.getAttribute("value");
		System.out.println("dato a editar: "+valor);
		sleep(2000);
		
		ValidadeDe.click();
		sleep(3000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		waitExpectElement(numeroProcesso);
		sleep(2000);
	
		
		String novoTexto=numeroProcesso.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}
}
