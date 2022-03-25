package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CorreçãoManualPO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[12]/button")				
	public WebElement ativarCorrecao;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")				
	public WebElement gravarExecura;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/button[2]")				
	public WebElement aplicar;
	
	@FindBy(xpath = "//ul[@class=\"addcolumn-ul\"]/li/div/div/div/div/div/span")				
	public WebElement agregar;
	
	@FindBy(xpath = "//li[@id=\"draggable-n0\"]/div/div/div/span[@class=\"dropdown-arrow icon icon-font-Sign-and-Symbols icon-down\"]")				
	public WebElement inputColumna;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]/div/span")				
	public WebElement opcColumna;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//div[@class=\"rules-header\"]/div[@class=\"rules-header-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[86]/div[1]/label/span")
	public WebElement flagSeleccionTQ1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[40]/div[1]/label/span")
	public WebElement flagSeleccionTP1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[56]/div[1]/label/span")
	public WebElement flagSeleccionTC2;
	
	@FindBy(xpath = "//button[text()=\"Próximo\"]")
	public WebElement btnProximo;
	
	@FindBy(xpath = "//button[text()=\"Aplicar Regra\"]")
	public WebElement aRegra;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button/span[2]")				
	public WebElement btnExecucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")				
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button/span[2]")				
	public WebElement btnEdicao;
	
	@FindBy(xpath = "//span[text()=\"Remover Coluna\"]")				
	public WebElement removerColumna;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label/span")
	public WebElement flagExecutar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[15]/button/span")
	public WebElement correcao;
	
	@FindBy(xpath = "//*[@id=\"bsc-correction-toolbar\"]/div/ul/li[3]/button/span[2]")
	public WebElement novaInstrucao;
	
	@FindBy(xpath = "//*[@id=\"bsc-correction-toolbar\"]/div/ul/li[3]/button/span[2]")
	public WebElement inputValor;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[14]/button/span")
	public WebElement enviarCorrecao;
	
	public CorreçãoManualPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
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
			ferramenta.sendKeys("2278");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else if (tq1==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("8005134");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("1745");
			ferramenta.sendKeys(Keys.ENTER);
			
		}
		
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		
		actionsMoveToElementElement(agregar);
		
		agregar.click();
		sleep(2000);
		actionsMoveToElementElement(agregar);
		
		inputColumna.click();
		sleep(2000);
		
		opcColumna.click();
		sleep(7000);
		
		if (tc2==true) {
			pesquisar.sendKeys("882");
			flagSeleccionTC2.click();
			sleep(2000);
		}else if (tq1==true) {
			pesquisar.sendKeys("1190");
			flagSeleccionTQ1.click();
			sleep(2000);
			
		}else {
			pesquisar.sendKeys("653");
			flagSeleccionTP1.click();
			sleep(2000);
			
		}
		
		sleep(4000);
		
		btnProximo.click();
		sleep(8000);
		btnProximo.click();
		sleep(6000);
		aRegra.click();
		sleep(2000);
			
		ativarCorrecao.click();
		sleep(2000);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		btnExecutar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		flagExecutar.click();
		sleep(4000);

		
		enviarCorrecao.click();
		sleep(2000);
		
		
		
		
		
		
		btnEdicao.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		inputColumna.click();
		sleep(2000);
		
		removerColumna.click();
		sleep(2000);
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		boolean sucesso = true;
		
		
		return sucesso;
		
		
		}
}
