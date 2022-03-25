package com.sap.timp.pageObjectModel.MDR.TipoDeTributoContaContabil;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TipoDeTributoContaContabilEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tipo de Tributo x Conta Contábil\"]")
	public WebElement tipodetributocontacontabil;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"code\"]/div/div/input")
	public WebElement tributoGrupo;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/input")
	public WebElement tipoImposto;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"startDate\"]/div/div/input")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//span[text()=\"Cadastros PIS/COFINS\"]")
	public WebElement cadastroPisConfins;
	
	public TipoDeTributoContaContabilEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		sleep(2000);
		
		cadastroPisConfins.click();
		sleep(2000);
		
		tipodetributocontacontabil.click();
		sleep(2000);
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("tipodetributocontacontabil");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		// Valores uevos
		String tributoGrupoText = "Tributo Test";
		String tipoImpostoText = "Imposto";
		String descricaoText = "QA TEST";
		String dataVigenciaText = fechaAyer();
		
		tributoGrupo.clear();
		tributoGrupo.sendKeys(tributoGrupoText);
		
		sleep(1000);
		tipoImposto.clear();
		tipoImposto.sendKeys(tipoImpostoText);
		
		sleep(1000);
		descricao.clear();
		descricao.sendKeys(descricaoText);
		
		sleep(1000);
		dataInicioVigencia.clear();
		dataInicioVigencia.sendKeys(dataVigenciaText);
		
		System.out.println("------------------Datos Nuevos a enviar-------------");
		System.out.println("Tributo grupo: " + tributoGrupoText);
		System.out.println("Tipo imposto: " + tipoImpostoText);
		System.out.println("Descricao: " + descricaoText);
		System.out.println("Data Vigencia: " + dataVigenciaText);
		
		btnGravar.click();
		sleep(1000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnBiblioteca.click();
		
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String tributoGrupoModificado = tributoGrupo.getAttribute("value");
		String tipoImpostoMoficiado = tipoImposto.getAttribute("value");
		String descricaoModificado = descricao.getAttribute("value");
		String dataVigenciaModificado = dataInicioVigencia.getAttribute("value");
		
		System.out.println("");
		System.out.println("------------------Datos moficiados-------------");
		System.out.println("Tributo grupo: " + tributoGrupoModificado);
		System.out.println("Tipo imposto: " + tipoImpostoMoficiado);
		System.out.println("Descricao: " + descricaoModificado);
		System.out.println("Data Vigencia: " + dataVigenciaModificado);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tributoGrupoModificado.equals(tributoGrupoText));
		sucesso.add(tipoImpostoMoficiado.equals(tipoImpostoText));
		sucesso.add(descricaoModificado.equals(descricaoText));
		sucesso.add(dataVigenciaModificado.equals(dataVigenciaText));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
