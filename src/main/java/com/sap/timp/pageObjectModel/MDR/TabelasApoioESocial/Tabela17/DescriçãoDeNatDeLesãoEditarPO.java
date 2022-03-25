package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class DescriçãoDeNatDeLesãoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoioESocial;
	
	@FindBy(xpath = "//span[text()=\"Tabela 17 - Descrição de Nat. de Lesão\"]")
	public WebElement submenudescricaoNatLesao;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement inputValidadeAte;
	
	public DescriçãoDeNatDeLesãoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioESocial.click();
		
		sleep(2000);
		submenudescricaoNatLesao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DescriçãoDeNatDeLesão");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputValidadeAte.clear();
		String fechaNuevaString = fechaManana();
		inputValidadeAte.sendKeys(fechaNuevaString);
		System.out.println(fechaActual());
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputValidadeAte);
		String fechaEditada = inputValidadeAte.getAttribute("value");
		System.out.println(fechaEditada);
		
		boolean sucesso = false;
		sucesso = fechaEditada.equals(fechaNuevaString); // Si es igual significa que si fue editado y que se mantiene el valor al actualizar la pagina
		
		return sucesso;
	}
}
