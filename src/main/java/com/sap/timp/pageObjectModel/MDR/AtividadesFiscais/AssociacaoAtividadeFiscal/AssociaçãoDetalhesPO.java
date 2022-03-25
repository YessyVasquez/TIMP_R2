package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement menuActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/ul/li/div/span[text()=\"Associação de Atividade Fiscal\"]")
	public WebElement subMenuAssociaçãoActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idDetalhe;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement associacaoAtividadeFiscal;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement municipioExecutor;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tributo;
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"codFilial\"]")
	public WebElement filial1;
	
	@FindBy(xpath = "//span[@id=\"municipioExecutor\"]")
	public WebElement municipioExecutor1;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf1;
	
	@FindBy(xpath = "//span[@id=\"codTributo\"]")
	public WebElement tributo1;
	

	public AssociaçãoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalheAssociação() {
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoIdDetalhe = idDetalhe.getText();
		String textoAssociacaoAtividadeFiscal = associacaoAtividadeFiscal.getText();
		String textoEmpresa = empresa.getText();
		String textoFilial = filial.getText();
		String textoUFS = uf.getText();
		String textoMunicipioExecutor = municipioExecutor.getText();
		String textoTributo = tributo.getText();

		
		System.out.println(textoIdDetalhe);
		System.out.println(textoAssociacaoAtividadeFiscal);
		System.out.println(textoEmpresa);
		System.out.println(textoFilial);
		System.out.println(textoUFS);
		System.out.println(textoMunicipioExecutor);
		System.out.println(textoTributo);

		
		btnCerrar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(btnUltimaPagina);
		sleep(2000);
		
		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(1000);
		menu.click();
		sleep(1000);
		açao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa1 = empresa1.getText();
		String textoFilial1 = filial1.getText();
		String textoMunicipioExecutor1 = municipioExecutor1.getText();
		String textoUF1 = uf1.getText();
		String textoTributo1 = tributo1.getText();

		
		System.out.println("------------------------------------------------");
		System.out.println(textoEmpresa1);
		System.out.println(textoFilial1);
		System.out.println(textoMunicipioExecutor1);
		System.out.println(textoUF1);
		System.out.println(textoTributo1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(textoEmpresa.contains(textoEmpresa1));
		sucesso.add(textoFilial.contains(textoFilial1));
		sucesso.add(textoMunicipioExecutor.contains(textoMunicipioExecutor1));
		sucesso.add(textoUFS.contains(textoUF1));
		sucesso.add(textoTributo.contains(textoTributo1));


		System.out.println(sucesso);
	
		return sucesso;
	}
}
