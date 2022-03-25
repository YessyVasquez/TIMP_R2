package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement menuActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/ul/li/div/span[text()=\"Associação de Atividade Fiscal\"]")
	public WebElement subMenuAssociaçãoActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"codFilial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"municipioExecutor\"]")
	public WebElement municipioExecutor;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//span[@id=\"codTributo\"]")
	public WebElement tributo;
	

	
	// Datos guardados en Editar
	@FindBy(xpath = "//div[contains(@class, \"codEmpresa\")]/div/div[2]/div/div/div/div/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[contains(@class, \"uf\")]/div/div[2]/div/div/div/div/div[1]")
	public WebElement uf1;
	
	@FindBy(xpath = "//div[contains(@class, \"codFilial\")]/div/div[2]/div/div/div/div/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[contains(@class, \"municipioExecutor\")]/div/div[2]/div/div/div[2]/input")
	public WebElement municipioExecutor1;
	
	@FindBy(xpath = "//div[contains(@class, \"codTributo\")]/div/div[2]/div/div/div/div/div[1]")
	public WebElement tributo1;
	

	
	public AssociaçãoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizarAssociação() {
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa = empresa.getText();
		String textoFilial = filial.getText();
		String textoMunicipioExecutor = municipioExecutor.getText();
		String textoUF = uf.getText();
		String textoTributo = tributo.getText();

		
		System.out.println(textoEmpresa);
		System.out.println(textoFilial);
		System.out.println(textoMunicipioExecutor);
		System.out.println(textoUF);
		System.out.println(textoTributo);

		
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
		
		String textoEmpresa1 = empresa1.getText();
		String textoFilial1 = filial1.getText();
		String textoMunicipioExecutor1 = municipioExecutor1.getAttribute("value");
		String textoUF1 = uf1.getText();
		String textoTributo1 = tributo1.getText();

		
		System.out.println("--------------------------------------------------");
		System.out.println(textoEmpresa1);
		System.out.println(textoFilial1);
		System.out.println(textoMunicipioExecutor1);
		System.out.println(textoUF1);
		System.out.println(textoTributo1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(textoEmpresa1.contains(textoEmpresa));
		sucesso.add(textoFilial1.contains(textoFilial));
		sucesso.add(textoMunicipioExecutor1.contains(textoMunicipioExecutor));
		sucesso.add(textoUF1.contains(textoUF));
		sucesso.add(textoTributo1.contains(textoTributo));


		System.out.println(sucesso);
	
		return sucesso;
	}
}
