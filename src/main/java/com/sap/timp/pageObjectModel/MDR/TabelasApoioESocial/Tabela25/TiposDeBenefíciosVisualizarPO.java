package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TiposDeBenefíciosVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 25 - Tipos de Benefícios\"]")
	public WebElement tabela25;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos Visualizar
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigo;
	
	@FindBy(xpath = "//td[@id=\"description\"]/span")
	public WebElement descricao;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateTo\"]/span")
	public WebElement validadeAte;
	
	// Datos editar
	@FindBy(xpath = "//div[contains(@class, \"code_0_0\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigo1;

	@FindBy(xpath = "//div[contains(@class, \"description_0_1\")]/div/textarea")
	public WebElement descricao1;

	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_2\")]/div/div/input")
	public WebElement validadeDe1;

	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement validadeAte1;
	
	
	public TiposDeBenefíciosVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar(){
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoString = codigo.getText();
		String descricaoString = descricao.getText();
		String validadeDeString = validadeDe.getText();
		String validadeAteString = validadeAte.getText();
		
		System.out.println("----------------DATOS VISUALIZAR----------------");
		System.out.println("Codigo: " + codigoString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Validade De: " + validadeDeString);
		System.out.println("Validade Ate: " + validadeAteString);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoString1 = codigo1.getAttribute("value");
		String descricaoString1 = descricao1.getAttribute("value");
		String validadeDeString1 = validadeDe1.getAttribute("value");
		String validadeAteString1 = validadeAte1.getAttribute("value");
		
		System.out.println("----------------DATOS EDITAR----------------");
		System.out.println("Codigo 1: " + codigoString1);
		System.out.println("Descricao 1: " + descricaoString1);
		System.out.println("Validade De 1: " + validadeDeString1);
		System.out.println("Validade Ate 1: " + validadeAteString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(codigoString1.equals(codigoString));
		sucesso.add(descricaoString1.equals(descricaoString));
		sucesso.add(validadeDeString1.equals(validadeDeString));
		sucesso.add(validadeAteString1.equals(validadeAteString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
