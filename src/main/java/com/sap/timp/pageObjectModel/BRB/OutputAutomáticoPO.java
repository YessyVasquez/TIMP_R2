package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class OutputAutomáticoPO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[6]/button/span")				
	public WebElement btnDuplicidade;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")				
	public WebElement btnCancelar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Campo de Período\"]")				
	public WebElement inputPerido;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")				
	public WebElement opcPeriodo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div/div/label/span")				
	public WebElement flag;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/span")				
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[1]/div[3]/div[13]")				
	public WebElement seleccionCalendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/button[2]")				
	public WebElement aplicar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")				
	public WebElement aplicar2;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Coluna do relatório\"]")				
	public WebElement campos;
	
	@FindBy(xpath = "//*[@id=\"COD_NAT\"]/div[1]/label/span")				
	public WebElement opcCampos;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button/span[2]")				
	public WebElement btnExecucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")				
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button/span[2]")				
	public WebElement btnEdicao;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div/label/span")				
	public WebElement flagExcluir;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[contains(@class,\"add-column\")]/div/div/div")
	public WebElement agregar;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div")
	public WebElement regraC;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement atribuirRegra;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement selecionRegra;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement proximo;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//span[text()=\"Edição\"]")
	public WebElement edicao;
	
	@FindBy(xpath = "//li[@column-id=\"n0\"]/div/div/div/span[@class=\"dropdown-arrow icon icon-font-Sign-and-Symbols icon-down\"]")
	public WebElement seleccionarRegla;
	
	@FindBy(xpath = "//span[text()=\"Remover Coluna\"]")
	public WebElement removerRegla;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnsim;
	
	public OutputAutomáticoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean outputAutomatico() {
		WebDriverWait wait = new WebDriverWait(driver, 7000);
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		if (tc2==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("2342");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else if (tq1==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("8005253");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("1769");
			ferramenta.sendKeys(Keys.ENTER);			
		}		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cfopOpciones = driver.findElement(By.xpath("//li[@column-name=\"CFOP\"]/div/div/div[@id=\"chead\"]/span"));
		cfopOpciones.click();
		
		sleep(2000);
		
		WebElement opcOutputDeReferencia = driver.findElement(By.xpath("//span[text()=\"Adicionar o campo de output automática\"]"));
		opcOutputDeReferencia.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		WebElement cboCampoReferencia = driver.findElement(By.xpath("//div[@id=\"reference-field\"]/div/div[2]"));
//		cboCampoReferencia.click();
//		sleep(1000);
//		
//		WebElement opcionCampoReferencia = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and text()=\"CFOP\"]"));
//		opcionCampoReferencia.click();
//		sleep(1000);
		
	//	btnsim.click();
		sleep(6000);
		btnAplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		waitExpectElement(nao);
		sleep(3000);
		nao.click();
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucao.click();
		sleep(19000);
	//	waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		executar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		edicao.click();
		sleep(3000);
		
	//	waitExpectElement(nao);
	//	nao.click();
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cfopOpciones = driver.findElement(By.xpath("//li[@column-name=\"CFOP\"]/div/div/div[@id=\"chead\"]/span"));
		cfopOpciones.click();
		sleep(1000);
		
		WebElement excluirOutputReferencia = driver.findElement(By.xpath("//span[text()=\"Excluir campo de output automática\"]"));
		excluirOutputReferencia.click();
		sleep(1000);
		
		waitExpectElement(btnsim);
		btnsim.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorConfirmar = "O campo de saída foi excluído com sucesso";
		String confirmado = driver.findElement(By.xpath("//ul[@class=\"base-toast-list\"]/li/div/span[2]/span")).getText().trim();
		
		boolean sucesso = true;
		
		if(confirmado.equals(valorConfirmar)) {
			sucesso = true;
			System.out.println("Output de referencia removido correctamente...");
		} else {
			System.out.println("No se ha removido el output de referencia...");
		}		
		
		gravar.click();
		sleep(2000);
		
		nao.click();
		sleep(2000);	
		
		return sucesso;		
	}	
}
