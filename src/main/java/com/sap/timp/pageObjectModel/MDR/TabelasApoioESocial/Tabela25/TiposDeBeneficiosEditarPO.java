package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TiposDeBeneficiosEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 25 - Tipos de Benefícios\"]")
	public WebElement tabela25;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement validadeAte;
	
	public TiposDeBeneficiosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoio.click();
		
		sleep(2000);
		tabela25.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		String idRegistro = idObter("TiposDeBenefícios");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(validadeAte);
		attributoNotToBeEmptyElement(validadeAte, "value");
		String validadeAteNuevo = fechaManana();
		System.out.println("Validade Ate Nuevo: " + validadeAteNuevo);
		
		sleep(2000);
		validadeAte.click();
		validadeAte.clear();
		sleep(1000);
		validadeAte.sendKeys(validadeAteNuevo);
		sleep(2000);
		
		sleep(1000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		driver.navigate().refresh();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		waitExpectElement(validadeAte);
		attributoNotToBeEmptyElement(validadeAte, "value");
		String validadeAteEditado = validadeAte.getAttribute("value");
		
		System.out.println("----------------------------------------");
		System.out.println("Validade Ate Editado: " + validadeAteEditado);
		sleep(1000);
		
		boolean sucesso = false;
		sucesso = validadeAteEditado.equals(validadeAteNuevo);
		
		return sucesso;
	}
}
