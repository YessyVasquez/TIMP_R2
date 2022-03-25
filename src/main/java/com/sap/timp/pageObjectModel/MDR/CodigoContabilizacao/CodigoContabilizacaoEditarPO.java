package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoContabilizacaoEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
		

	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	

	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement tipolancamento;
	
	@FindBy(xpath = "//li[@class=\"list-item selected visible\"]")
	public WebElement opcaotipolancamento;

	@FindBy(xpath = "//*[@id=\"standard-description\"]/div/div/input")
	public WebElement descricaopadrao;
	
	@FindBy(xpath = "//div[@class=\"icon main-icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//*[@id=\"start-date\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div[2]")
	public WebElement tipotributo;
	
	//@FindBy(xpath = "//div[@class=\"base-autocomplete-box show\"]/ul/li[2]")
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public CodigoContabilizacaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean editar() {
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Pega o ultimo id
		siguiente.click();
		//setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CodigoContabilizacao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		
		descricaopadrao.clear();
		
		String enviar = "Teste automatizado";
		
		descricaopadrao.sendKeys(enviar);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(butaosim);
		sleep(1000);
		nao.click();
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);
		
		refresh();
		
		waitExpectElement(descricaopadrao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		
		String textoCampo = descricaopadrao.getAttribute("value");
		System.out.println("Texto Campo: " +textoCampo);
		System.out.println("Texto Esperado: " +enviar);
		
		boolean sucesso = textoCampo.equals(enviar);
		System.out.println("Texto Modificado: " +sucesso);
		
		
		return sucesso;
		
    }
	

}
