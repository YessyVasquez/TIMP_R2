package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PainelBCEExecutadosEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//span[text()=\"Painel BCE\"]")
	public WebElement painelbce;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement Executar;
	
	@FindBy(xpath = "//td[@id=\"companyInput\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//td[@id=\"stateInput\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcaoestado;
	
	@FindBy(xpath = "//td[@id=\"subInput\"]/div/div/span")
	public WebElement subperiodo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div[2]")
	public WebElement leiaute;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoleiaute;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement arinicio;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executar1;
	
	@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelExecution\"]")
	public WebElement executados;
	String URL = driver.getCurrentUrl();
	
	public PainelBCEExecutadosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelbce.click();
		sleep(2000);
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucacoExecutados");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(periodo);
		sleep(2000);
		
		Executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(empresa);
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		estado.click();
		sleep(1000);
		opcaoestado.click();
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		subperiodo.click();
		sleep(1000);
		
		int element2018 = driver.findElements(By.xpath("//div[@class=\"content-wrapper\"]/div[3]/div[text()=\"2016\"]")).size();
		
		sleep(2000);
		
		if(element2018 == 0) {
			arinicio.click();
			sleep(2000);
		}		
		WebElement ano2016=  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div[3]/div[text()=\"2016\"]"));
		ano2016.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement mes2016 =  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div[2]/div[text()=\"Fev\"]"));
		mes2016.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement m1 =  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div/div/div[1]"));
		m1.click();
		
		executar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Gravar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(periodo);
		sleep(2000);
		
		String texto = "02/2016 - 1M";
		String periodotexto= periodo.getText();
		System.out.println(periodotexto);
		boolean sucesso = false;
		
		sucesso= periodotexto.contains(texto);
		
		System.out.println(sucesso);
		return sucesso;
	}


}
