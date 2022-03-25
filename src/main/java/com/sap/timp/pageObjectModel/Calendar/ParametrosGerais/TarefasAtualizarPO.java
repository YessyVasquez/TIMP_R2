package com.sap.timp.pageObjectModel.Calendar.ParametrosGerais;

import java.util.ArrayList;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;

public class TarefasAtualizarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-activator\"]")
	public WebElement ativador;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-activator\"]/ul/li//div/span[text()=\"Ativador de Processos\"]")
	public WebElement ativadorO;
	
	@FindBy(xpath = "//span[text()=\"Ativar Configuração\"]")
	public WebElement ativarConfiguracao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-openedSubperiods\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//span[text()=\"100 - Aberto\"]")
	public WebElement aberto100;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement inicio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"vencimento\")]")
	public WebElement vencimento;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\" and @tabindex=\"0\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Ativar\"]")
	public WebElement ativar;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement ar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id and@tabindex=\"0\"][1]/div/label/span")
	public WebElement flag;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	
	
	public TarefasAtualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean BPMA() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		
		if (url().contains("tc2")) {
			tc2 = true;
		}else if (url().contains("tp1")) {
			tp1 = true;
		}
		
		ativadorO.click();
		invisibilityOfElementOverlay();
		
		String procurar = "";
		
		if (tc2 == true) {
			procurar = "298";
		}else if (tp1 == true) {
			procurar = "744";
		}else {
			procurar = "29226";
		}
		
		pesquisar.sendKeys(procurar);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElementOverlay();
		
		WebElement menuBPMA = driver.findElement(By.xpath("//div[@data-id=\""+procurar+"\"]/div/div"));
		
		menuBPMA.click();
		sleep(1000);
		ativarConfiguracao.click();
		
		waitExpectXpath("//span[text()=\"Ativar\"]");
		sleep(2000);
		
		ativar.click();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElementOverlay();
		
		pesquisar.sendKeys(procurar);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElementOverlay();
		
		WebElement ativada = driver.findElement(By.xpath("//div[@data-id=\""+procurar+"\"]/div[3]/span"));
		
		actionsMoveToElementElement(ativada);
		sleep(1000);
		
		String ativadaS =ativada.getAttribute("aria-label");
		System.out.println("Aria label: " +ativadaS);
		
		boolean sucesso = ativadaS.contains("Configuração ativa");
		
		System.out.println(sucesso);
		

	
		
		
		return sucesso;
		
		
		
	}
	
	public boolean TFP() {
		
		AcessarTFPPO acessarTFPPO;
		
		acessarTFPPO = new AcessarTFPPO();
		
		actionsMoveToElementElement(home);
		sleep(1000);
		home.click();
		
		waitExpectXpath("//div[@class=\"dragger-pagination-right\"]");
		invisibilityOfElementOverlay();
		
		acessarTFPPO.acessarTFP();
		
		boolean tc2 = false;
		boolean tp1 = false;
		
		if (url().contains("tc2")) {
			tc2 = true;
		}else if (url().contains("tp1")) {
			tp1 = true;
		}
		
		subPeriodo.click();
		invisibilityOfElementOverlay();
		
		String procurar = "";
		
		if (tc2 == true) {
			procurar = "14094";
		}else if (tp1 == true) {
			procurar = "13079";
		}else {
			procurar = "16866";
		}
		
		pesquisar.sendKeys(procurar);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElementOverlay();
		
		WebElement menuTFP = driver.findElement(By.xpath("//div[@data-id=\""+procurar+"\"]/div/div"));
		
		menuTFP.click();
		sleep(1000);
		aberto100.click();
		invisibilityOfElementOverlay();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(1000);
		
		int alterado = rows("//span[contains(text(),\"O status foi alterado com sucesso\")]");
		
		boolean sucesso = false;
		
		if (alterado > 0) {
			sucesso = true;
		}
		
		
		return sucesso;
	}
	
	public void Calendar() {
		
		
		dobleClickElement(home);
		waitExpectXpath("//div[@class=\"dragger-pagination-right\"]");
		invisibilityOfElementOverlay();
		
		AcessarCalendarPO acessarCalendarPO;
		acessarCalendarPO = new AcessarCalendarPO();
		
		acessarCalendarPO.acessarCalendar();
		
		calendario.click();
		sleep(3000);
		waitExpectElement(ar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("LRIAN");
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElementOverlay();
		
		flag.click();
		sleep(1000);
		aceitar.click();
		invisibilityOfElementOverlay();
		
		
		
		
		
		
		
	}
	
}
