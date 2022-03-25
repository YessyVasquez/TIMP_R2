package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class CodigoContribuiçaoSocialApuradaVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = " //li/div/span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelas;
	
	@FindBy(xpath = " //li/div/span[contains(text() ,\"4.3.5\")]")
	public WebElement codigoContri;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"socialContributionCode\"]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div/input")
	public WebElement validFrom;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//span[@id=\"socialContributionCode\"]")
	public WebElement codigoV;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement validFromV;
	
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	public CodigoContribuiçaoSocialApuradaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelas.click();
		sleep(2000);
		codigoContri.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("codigocontribucaosocialapurada");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String tributoV1 = tributoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataV1 = validFromV.getText();
		
		System.out.println(tributoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(dataV1);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String tributoE = tributo.getAttribute("value");
		String codigoE = codigo.getAttribute("value");
		String descricaoE = descricao.getAttribute("value");
		String dataE = validFrom.getAttribute("value");
		
		System.out.println(tributoE);
		System.out.println(codigoE);
		System.out.println(descricaoE);
		System.out.println(dataE);
				
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tributoV1.equals(tributoE));
		sucesso.add(codigoV1.equals(codigoE));
		sucesso.add(descricaoE.contains(descricaoV1));
		sucesso.add(dataV1.equals(dataE));
		
		System.out.println(sucesso);

		return sucesso;
		
		
		
	}
	

}
