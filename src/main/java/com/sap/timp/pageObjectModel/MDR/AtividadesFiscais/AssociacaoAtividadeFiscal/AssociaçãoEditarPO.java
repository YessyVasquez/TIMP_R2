package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement menuActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/ul/li/div/span[text()=\"Associação de Atividade Fiscal\"]")
	public WebElement subMenuAssociaçãoActividadesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"atividadeFiscal\")]/div/div[2]/div/div[2]")
	public WebElement inputAtividadeFiscal;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opcionComboAtividadeFiscal;
	
	@FindBy(xpath = "//div[contains(@class, \"atividadeFiscal\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputOpcionAtividadeFiscal;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[contains(text(), \"Teste Atividade\")]")
	public WebElement opcionComboAtividadeFiscalOriginal;
	
	public AssociaçãoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editarAssociação() {
		sleep(2000);
		menuActividadesFiscais.click();
		
		sleep(2000);
		subMenuAssociaçãoActividadesFiscais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AssociacaoAtividadeFiscal");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputAtividadeFiscal);
		inputAtividadeFiscal.click();
		sleep(2000);
		waitExpectElement(opcionComboAtividadeFiscal);
		opcionComboAtividadeFiscal.click();
		sleep(2000);
		
		String textoOpcionAtividadeFiscal = inputOpcionAtividadeFiscal.getText();
		System.out.println(textoOpcionAtividadeFiscal);
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(inputOpcionAtividadeFiscal);
		String textoOpcionAtividadeFiscalEditado = inputOpcionAtividadeFiscal.getAttribute("value");
		System.out.println("----------------------------------------");
		System.out.println(textoOpcionAtividadeFiscalEditado);
		sleep(2000);
		
		boolean sucesso = false;
		//sucesso = textoOpcionAtividadeFiscalEditado.equals(textoOpcionAtividadeFiscal);
		
		if (textoOpcionAtividadeFiscal != textoOpcionAtividadeFiscalEditado) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		// Si no  hay error, devuelvo el valor original que tenia 
//		sleep(2000);
//		if(sucesso) {
//			waitExpectElement(inputAtividadeFiscal);
//			inputAtividadeFiscal.click();
//			sleep(2000);
//			opcionComboAtividadeFiscalOriginal.click();
//			sleep(2000);
//			btnGravar.click();
//			sleep(2000);
//			btnSim.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//		}
		
		
		return sucesso;
	}
}
