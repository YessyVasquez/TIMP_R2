package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

import net.bytebuddy.asm.Advice.Return;

public class SequenciaEditarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//*[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	
	public SequenciaEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean editar() {
		
		
		//Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequencia.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Sequencia");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"description\"]/div/div", "class", "base-input  required type1");
		//salva a descriçao do campo antes de apagar
		sleep(1000);
		String texto = descricao.getAttribute("value");
		//System.out.println(texto);
		sleep(1000);
		//limpa o campo
		descricao.clear();
		sleep(1000);
		//inseri novo texto no campo descriçao
		String enviar="detalhamento";
		descricao.sendKeys(enviar);
		//grava
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//recarrega a pagina
		driver.navigate().refresh();
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"description\"]/div/div", "class", "base-input  required type1");
		//verifica se o valor inserido consta no relatório
		String texto1 = descricao.getAttribute("value");
		boolean sucesso= texto1.contains(enviar);
		
		System.out.println(sucesso);
		sleep(1000);
		//volta com o campo modificado
		descricao.clear();
		descricao.sendKeys(texto);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		System.out.println(sucesso);
		return sucesso;
		
	}


}
