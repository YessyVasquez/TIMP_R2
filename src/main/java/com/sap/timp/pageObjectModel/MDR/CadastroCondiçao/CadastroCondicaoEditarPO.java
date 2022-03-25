package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroCondicaoEditarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement setafinal;

	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]/span[2]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//*[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy (xpath = "//input [@placeholder=\"Selecionar  uma  Sequência de Acesso\"]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opcaosequenciaacesso2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"1000_SP_0002\"]/div[1]/label/span")
	public WebElement opcaofilial2;
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement vigenciade;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Empresa\"]")
	public WebElement empresa;
	public CadastroCondicaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean editar() {
		
		
String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		cadastrocondicao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		setafinal.click();
	
		//setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);

		String idRegistro = idObter("CadastroCondicao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//attributeToBeXpath("//*[@id=\"select\"]", "class", "base-select-wrapper");
		attributoNotToBeEmptyXpath("//div[ @id=\"validFrom\"]/div/div/input", "value");
		//sleep(15000);
		sleep(2000);
		
		String texto = vigenciade.getAttribute("value");
		System.out.println(texto);
		sleep(1000);
		String enviar = fechaAyer();
		
		sleep(2000);
		vigenciade.clear();
		//inseri um novo campo em vigencia de
		vigenciade.sendKeys(enviar);
		
		
		//grava
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.sendKeys(Keys.ENTER);;
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//recarrega a pagina
		driver.navigate().refresh();
		attributeToBeXpath("//*[@id=\"select\"]", "class", "base-select-wrapper");
		//attributoNotToBeEmptyElement(empresa, "value");
		//sleep(15000);
		attributoNotToBeEmptyXpath("//div[ @id=\"validFrom\"]/div/div/input", "value");
		sleep(2000);
		//verifica se o valor inserido consta no relatório
		String texto1 = vigenciade.getAttribute("value");
		System.out.println(texto1);
		boolean sucesso= texto1.contains(enviar);
		System.out.println(sucesso);
		sleep(1000);
		
		//volta com o campo modificado
		vigenciade.clear();
		vigenciade.sendKeys(texto);
	
		//grava de novo
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
	}
	

}
