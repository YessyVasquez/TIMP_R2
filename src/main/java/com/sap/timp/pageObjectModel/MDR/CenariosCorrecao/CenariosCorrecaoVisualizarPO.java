package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CenariosCorrecaoVisualizarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"correction-object\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement objetoCorrecao;
	
	@FindBy(xpath = "//*[@id=\"web-service\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement servicoWeb;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"code\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"web-service\"]")
	public WebElement servicoWebV;
	@FindBy(xpath = "//span[@id=\"valid-from\"]")
	public WebElement dataVigenciaV;
	@FindBy(xpath = "//div[@data-id]/div/div")
	public WebElement campoV;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Serviço\")]")
	public WebElement servicoWebE;
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement dataVigenciaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"campo\")]")
	public WebElement campoE;
	
	

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public CenariosCorrecaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> cenariosCorrecaoVisualizar() {
		cenarios.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);	
			
		siguiente.click();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CenariosCorrecao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		visibilityOfElementXpath("//span[@id=\"tax\"]");
		sleep(1000);
		
		
		String tributoV1 = tributoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String servicoWebV1 = servicoWebV.getText();
		String campoV1 = campoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		System.out.println("Datos del Visualizar");
		System.out.println(tributoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(servicoWebV1);
		System.out.println(campoV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tributoE1 = tributoE.getAttribute("value");
		String codigoE1 = codigoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String servicoWebE1 = servicoWebE.getAttribute("value");
		String campoE1 = campoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		System.out.println("");
		System.out.println("Datos del Editar");
		System.out.println(tributoE1);
		System.out.println(codigoE1);
		System.out.println(descricaoE1);
		System.out.println(servicoWebE1);
		System.out.println(campoE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(campoE1.contains(campoV1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;
	}
}
