package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Subperíodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SubperíodoVerPO extends TestBaseMassiel {
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Subperíodo\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[1]/div/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div[1]/div//div[1]/div[1]/div[1]")
	public WebElement estado;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"periodicity\"]/div/div[1]/div[1]/input")
	public WebElement periodicidade;
	
	@FindBy(xpath = "//div[@id=\"impact\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement impacto;
	
	@FindBy(xpath = "//div[@id=\"opening\"]/div/div[1]/div[1]/input")
	public WebElement aberturaPeiodo;
	
	@FindBy(xpath = "//div[@id=\"day-type\"]/div/div[1]/div[1]/input")
	public WebElement tipoDia;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div[1]/div[1]/input")
	public WebElement dia;

	@FindBy(xpath = "//div[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//div[@id=\"valid-to\"]/div/div[1]/input")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	public SubperíodoVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver() {
		
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("ConfiguraçõesSubperíodo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acao.click();
		sleep(2000);
		sleep(2000);

		String empresaVer = empresa.getText();
		String tributoVer = tributo.getAttribute("value");
		String estadoVer = estado.getText();
		String filialVer = filial.getText();
		String periodicidadeVer = periodicidade.getAttribute("value");
		String impactoVer = impacto.getText();
		String aberturaPeiodoVer = aberturaPeiodo.getAttribute("value");
		String tipoDiaVer = tipoDia.getAttribute("value");
		String diaVer = dia.getAttribute("value");
		String validadeDeVer = validadeDe.getAttribute("value");
		String validadeAteVer = validadeAte.getAttribute("value");
		
		System.out.println(empresaVer);
		System.out.println(tributoVer);
		System.out.println(estadoVer);
		System.out.println(filialVer);
		System.out.println(periodicidadeVer);
		System.out.println(impactoVer);
		System.out.println(aberturaPeiodoVer);
		System.out.println(tipoDiaVer);
		System.out.println(diaVer);
		System.out.println(validadeDeVer);
		System.out.println(validadeAteVer);
		
		sleep(2000);
		fechar.click();
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		acao1.click();
		sleep(8000);

		
		System.out.println("---------- Editar -----------");
		
		String empresaEditar = empresa.getText();
		String tributoEditar = tributo.getAttribute("value");
		String estadoEditar = estado.getText();
		String filialEditar = filial.getText();
		String periodicidadeEditar = periodicidade.getAttribute("value");
		String impactoEditar = impacto.getText();
		String aberturaPeiodoEditar = aberturaPeiodo.getAttribute("value");
		String tipoDiaEditar = tipoDia.getAttribute("value");
		String diaEditar = dia.getAttribute("value");
		String validadeDeEditar = validadeDe.getAttribute("value");
		String validadeAteEditar = validadeAte.getAttribute("value");
		
		System.out.println(empresaEditar);
		System.out.println(tributoEditar);
		System.out.println(estadoEditar);
		System.out.println(filialEditar);
		System.out.println(periodicidadeEditar);
		System.out.println(impactoEditar);
		System.out.println(aberturaPeiodoEditar);
		System.out.println(tipoDiaEditar);
		System.out.println(diaEditar);
		System.out.println(validadeDeEditar);
		System.out.println(validadeAteEditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaEditar.contains(empresaVer));
		sucesso.add(tributoEditar.contains(tributoVer));
		sucesso.add(estadoEditar.contains(estadoVer));
		sucesso.add(filialEditar.contains(filialVer));
		sucesso.add(periodicidadeEditar.contains(periodicidadeVer));
		sucesso.add(impactoEditar.contains(impactoVer));
		sucesso.add(aberturaPeiodoEditar.contains(aberturaPeiodoVer));
		sucesso.add(tipoDiaEditar.contains(tipoDiaVer));
		sucesso.add(diaEditar.contains(diaVer));
		sucesso.add(validadeDeEditar.contains(validadeDeVer));
		sucesso.add(validadeAteEditar.contains(validadeAteVer));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
