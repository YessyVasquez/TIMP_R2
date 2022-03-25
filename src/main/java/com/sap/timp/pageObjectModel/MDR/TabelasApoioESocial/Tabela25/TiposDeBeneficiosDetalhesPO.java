package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class TiposDeBeneficiosDetalhesPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 25 - Tipos de Benefícios\"]")
	public WebElement tabela25;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//***** DATOS DEL DETALLES
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div[1]")
	public WebElement id;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement codigo;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement descricao;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement validadeDe;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div[1]")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	// Datos Visualizar
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigo1;
	@FindBy(xpath = "//td[@id=\"description\"]/span")
	public WebElement descricao1;
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeDe1;
	@FindBy(xpath = "//td[@id=\"effectiveDateTo\"]/span")
	public WebElement validadeAte1;
	
	public TiposDeBeneficiosDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes(){
		sleep(2000);
		tabelaApoio.click();
		
		sleep(2000);
		tabela25.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		String idRegistro = idObter("TiposDeBenefícios");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idD = id.getText();
		String codigoD = codigo.getText();		
		String descricaoD = descricao.getText();
		String validadeDeD = validadeDe.getText();
		String validadeAteD = validadeAte.getText();
		
		System.out.println("------------------Datos de Detalhe--------------------");
		System.out.println("ID: " + idD);
		System.out.println("Codigo: " + codigoD);
		System.out.println("Descricao: " + descricaoD);
		System.out.println("Validade De: " + validadeDeD);
		System.out.println("Validade Ate:" + validadeAteD);
		System.out.println("");
		
		btnCerrar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigo1.getText();
		String descricaoV1 = descricao1.getText();
		String validadeDeV1 = validadeDe1.getText();
		String validadeAteV1 = validadeAte1.getText();
		
		System.out.println("------------------Datos de Visualizar--------------------");
		System.out.println("Codigo: "+codigoV1);
		System.out.println("Descricao: "+descricaoV1);
		System.out.println("Validade De: "+validadeDeV1);
		System.out.println("Validade Ate: "+ validadeAteV1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(codigoD.contains(codigoV1));
			sucesso.add(descricaoD.contains(descricaoV1));
			sucesso.add(validadeDeD.contains(validadeDeV1));
			sucesso.add(validadeAteD.contains(validadeAteV1));


		System.out.println(sucesso);
	
		return sucesso;
		
		
	}
}
