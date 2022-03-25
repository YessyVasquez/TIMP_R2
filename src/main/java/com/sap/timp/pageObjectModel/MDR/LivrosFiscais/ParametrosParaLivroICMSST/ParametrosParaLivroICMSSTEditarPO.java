package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTEditarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	public ParametrosParaLivroICMSSTEditarPO() {

		PageFactory.initElements(driver, this);
	}
	public boolean Editar() {
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		livrosfiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		parametrosparalivroicmsst.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParametrosParaLivroICMSST");
		
		System.out.println(idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		attributoNotToBeEmptyElement(fecha, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  	sleep(8000);

		
	  	String valor = fecha.getAttribute("value");
		System.out.println(valor);
		String enviar = fechaAyer();

		
		sleep(1000);
		fecha.clear();

		sleep(1000);
		fecha.sendKeys(enviar);
		sleep(1000);

		Gravar.click();
		sleep(3000);
		waitExpectElement(Sim);
		Sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		attributoNotToBeEmptyElement(fecha, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		String nuevoTexto = fecha.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		fecha.clear();
		sleep(2000);
		
		sleep(1000);
		fecha.sendKeys(valor);

	
		
		Gravar.click();
		sleep(3000);
		waitExpectElement(Sim);
		Sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
