package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Subperíodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SubperíodoCopiarPO extends TestBaseMassiel  {
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Subperíodo\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div[2]")
	public WebElement dia;
	
	@FindBy(xpath = "//li[@id=\"option-4\"]")
	public WebElement diaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement validadeDE;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div[1]/div[1]/input")
	public WebElement diaInput;

	@FindBy(xpath = "//div[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement validadeDeInput;
	
	@FindBy(xpath = "//div[@id=\"valid-to\"]/div/div[1]/input")
	public WebElement validadeAteInput;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	public SubperíodoCopiarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> copiar() {
		
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
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acao.click();
		sleep(2000);
		sleep(12000);
		
		dia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		diaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		validadeDE.clear();
		sleep(2000);
		
		validadeDE.sendKeys("01/01/1973");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		validadeAte.clear();
		sleep(2000);
		
		validadeAte.sendKeys("31/12/1974");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		String diaCopiar = diaInput.getAttribute("value");
		String validadeDeCopiar = validadeDeInput.getAttribute("value");
		String validadeAteCopiar = validadeAteInput.getAttribute("value");
		
		System.out.println(diaCopiar);
		System.out.println(validadeDeCopiar);
		System.out.println(validadeAteCopiar);
		
		aplicar.click();
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
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id2);
		
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(id2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idBD > idD) {
			sucesso.add(true);
			
		}else {
			
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+id2+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+id2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(12000);
		
		String diaVer = diaInput.getAttribute("value");
		String validadeDeVer = validadeDeInput.getAttribute("value");
		String validadeAteVer = validadeAteInput.getAttribute("value");
		
		System.out.println(diaVer);
		System.out.println(validadeDeVer);
		System.out.println(validadeAteVer);
		
		sucesso.add(diaCopiar.equals(diaVer));
		sucesso.add(validadeDeCopiar.equals(validadeDeVer));
		sucesso.add(validadeAteCopiar.equals(validadeAteVer));
		
		System.out.println(sucesso);
		sleep(6000);
		cancelar.click();
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

		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+id2+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+id2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu2);
		sleep(2000);
		menu2.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
		sleep(2000);
		
		aplicar.click();
		sleep(4000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		int idc = convertToInt(id);
		int idb = convertToInt(id2);
		int ide = convertToInt(idRegistro);
		
			if(idc!= idb && idc == ide) {
			System.out.println("Sim são diferente");
			sucesso.add(true);
		}else {
			System.out.println("Não, são iguais");
			sucesso.add(false);
		}
			
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
