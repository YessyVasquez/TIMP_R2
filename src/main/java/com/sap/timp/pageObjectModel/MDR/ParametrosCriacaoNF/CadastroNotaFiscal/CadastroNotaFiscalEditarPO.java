package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroNotaFiscalEditarPO extends TestBaseSteven {


	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Nota Fiscal\"]")
	public WebElement cadastroNotaFiscal;


	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[contains(@placeholder,\"Taxa de Imposto\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public CadastroNotaFiscalEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();
		
		
		
		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);
		
		if(url.contains("td1")) {
			cadastroNotaFiscal.click();
			sleep(2000);
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CadastroNotaFiscal");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//attributoNotToBeEmptyElement(campo, "value");
		sleep(2000);
		actionsMoveToElementElement(campo);
		sleep(2000);
		
		String valor = campo.getAttribute("value");

		String enviar = "30";

		campo.clear();
		sleep(2000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		

		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(campo);
		sleep(2000);
		actionsMoveToElementElement(campo);
		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(2000);
		campo.clear();

		sleep(2000);
		campo.sendKeys(valor);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;

	}

}
