package com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.ArmazenarArquivo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ArmazenarArquivoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Armazenagem de Arquivos\"]")
	public WebElement armazenagemdearquivos;
	
	@FindBy(xpath = "//span[text()=\"Armazenar Arquivo\"]")
	public WebElement armazenaraarquivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Tipo de Documento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de documento \"]")
	public WebElement tipodocumento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"numberRange\"]/div/div[2]")
	public WebElement intervalonumerico;
	
	@FindBy(xpath = "//li[@id][text()=\"02\"]")
	public WebElement opcaotq1;
	
	@FindBy(xpath = "//li[@id][text()=\"02\"]")
	public WebElement opcaotp1;
	
	
	@FindBy(xpath = "//li[@id][text()=\"10000\"]")
	public WebElement opcaotc2;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validadeate;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public ArmazenarArquivoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		armazenagemdearquivos.click();
		
		sleep(2000);
		
		armazenaraarquivo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		/*ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		String URL = driver.getCurrentUrl();
		//String idRegistro = idObter1();
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			
			pesquisar.sendKeys("49");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			pesquisar.sendKeys("241");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			pesquisar.sendKeys("39");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
	
	
		
		
		String enviar = "01/01/2013";
		validadede.clear();
		sleep(2000);
		validadede.sendKeys(enviar);
		sleep(1000);
		
		Gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		armazenagemdearquivos.click();
		sleep(2000);
		armazenaraarquivo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		if(URL.contains("tc2")) {
			// opcao para TC2
			pesquisar.sendKeys("49");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			pesquisar.sendKeys("241");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			pesquisar.sendKeys("39");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		String data = validadede.getAttribute("value");
		System.out.println(data);

		boolean sucesso = data.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}

}
