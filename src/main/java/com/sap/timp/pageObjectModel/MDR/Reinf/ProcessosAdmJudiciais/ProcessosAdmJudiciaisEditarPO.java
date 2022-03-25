package com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ProcessosAdmJudiciaisEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Processos Adm. / Judiciais\"]")
	public WebElement processosadmjudiciais;
	
	@FindBy(xpath = "//span[text()=\"Novo Processo Reinf Adm/Judicial\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"field-element company\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]/div")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@class=\"field-element processType\"]/div/div/div/div[2]")
	public WebElement tipodoprocesso;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]/div")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Numero do Processo\"]")
	public WebElement numerodoprocesso;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement data1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement data2;
	
	@FindBy(xpath = "//div[@class=\"field-element uf\"]/div/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"field-element countyCode\"]/div/div/div/div[2]")
	public WebElement codigomunicipio;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Vara Judicial\"]")
	public WebElement varajudicial;
	
	@FindBy(xpath = "//div[@class=\"field-element authorshipType\"]/div/div/div/div[2]")
	public WebElement tipodeautoria;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public ProcessosAdmJudiciaisEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		reinf.click();
		sleep(2000);
		
		processosadmjudiciais.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ProcessosAdmJudiciais");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = numerodoprocesso.getAttribute("value");

		String enviar = "888";

		numerodoprocesso.clear();
		sleep(2000);
		numerodoprocesso.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		waitExpectElement(numerodoprocesso);
		sleep(2000);
	
		
		String novoTexto=numerodoprocesso.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		numerodoprocesso.clear();

		sleep(2000);
		numerodoprocesso.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	


}
