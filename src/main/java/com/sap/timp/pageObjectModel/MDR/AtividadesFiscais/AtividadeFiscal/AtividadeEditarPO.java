package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"name-activities\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[1]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[1]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public AtividadeEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {

		String url = driver.getCurrentUrl();

		atividades.click();
		sleep(2000);
		atividadesO.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("AtividadeFiscal");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String valor = campo.getAttribute("value");

		
		String enviar = "Prueba editar 2";
		
		campo.clear();
		campo.sendKeys(enviar);
		sleep(2000);
		
		gravar.click();
		sleep(1000);
		//waitExpectElement(sim);
		sleep(2000);
	
		sim.click();

	 
	
		sleep(8000);

		biblioteca.click();
		waitExpectElement(sim);
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);



		idRegistro = idObter("AtividadeFiscal");
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(campo);
		sleep(3000);
		
		
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(nuevoTexto);
		System.out.println(valor);
		System.out.println(nuevoTexto.equals(enviar));

		boolean sucesso = nuevoTexto.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;

	}

}
