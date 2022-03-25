package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DetalheEditarPO extends TestBaseSteven {

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/textarea")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificacion;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	
	public DetalheEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {

		detalhe.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DetalheTipoTributo");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"select\"]/div[1]/input");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(1000);
		
		String valor = campo.getAttribute("value");

		
		String enviar = "Prueba";
		
		campo.clear();
		campo.sendKeys(enviar);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		sim.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		justificacion.sendKeys("TestMassiel");
		justificacion.sendKeys(Keys.ENTER);

		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		sim.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);
		 
		
		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"select\"]/div[1]/input");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(1000);
		
		String nuevoTexto = campo.getAttribute("value");

		boolean sucesso = nuevoTexto.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		sim.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		justificacion.sendKeys("TestMassiel");
		justificacion.sendKeys(Keys.ENTER);

		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		sim.click();
		sleep(2000);
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;


	}
}
