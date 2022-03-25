package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;

public class CodigosDeLotacaoEditarPO extends TestBaseSteven {
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 27 - Códigos de Lotação\"]")
	public WebElement tabela27;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher Código para a lotação trib.\")]")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public CodigosDeLotacaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela27.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CodigosDeLotacao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(campo);
		sleep(2000);
		
		String valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "5555";

		campo.clear();
		sleep(2000);
		
		campo.sendKeys(enviar);
		sleep(19000);
		
		gravar.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(campo);
		sleep(3000);
		
		
		//attributoNotToBeEmptyElement(campo, "value");
		
		String nuevoTexto = campo.getAttribute("value");

		System.out.println("Nuevo Valor: "+ nuevoTexto);
		System.out.println("Valor Anterior: " + valor);
		sleep(1000);
		
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);


		return sucesso;
		
	}

}
