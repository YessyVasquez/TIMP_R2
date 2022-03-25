package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DEPARAContasContábeisEditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastro;
	
	//submenu
	@FindBy(xpath = "//span[text()=\" DE-PARA  Contas  Contábeis\"]")
	public WebElement subItem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Plano de Contas\"]")
	public WebElement planoContais;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	public DEPARAContasContábeisEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cadastro.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subItem.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("DePARAContasContabeis");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		attributoNotToBeEmptyElement(planoContais, "value");
	  	sleep(2000);
		
	  	String valor = planoContais.getAttribute("value");
		System.out.println(valor);
		String enviar = "Massiel";
		
		sleep(1000);
		planoContais.clear();

		sleep(1000);
		planoContais.sendKeys(enviar);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
		attributoNotToBeEmptyElement(planoContais, "value");
	  	sleep(2000);
		
	  	String enviar1 = planoContais.getAttribute("value");
		System.out.println(enviar1);
		
		String nuevoTexto = planoContais.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar1);
		System.out.println(sucesso);
		
		planoContais.clear();
		sleep(2000);
		
		sleep(1000);
		planoContais.sendKeys(valor);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			 
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
