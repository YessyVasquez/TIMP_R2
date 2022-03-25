package com.sap.timp.pageObjectModel.TBD.Configuracao.TipoDeDocumento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TipoDeDocumentoVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Configuração de TBD\"]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tipo de Documento\"]")
	public WebElement configuracaodetipodedocumento;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;

	
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	

	@FindBy(xpath = "//span[@id=\"docType\"]")
	public WebElement tipodedocumentovi;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	@FindBy(xpath = "//span[@id=\"numberRange\"]")
	public WebElement intervalonumericovi;
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement validadedevi;
	@FindBy(xpath = "//span[@id=\"validTo\"]")
	public WebElement validadeatevi;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo de documento\"]")
	public WebElement tipodedocumento;
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Intervalo numérico \"]")
	public WebElement intervalonumerico;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validadeate;
	

	
	
	public TipoDeDocumentoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		configuracao.click();
		sleep(2000);
		configuracaodetipodedocumento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tipodedocumentovisualizar = tipodedocumentovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String intervalonumericovisualizar = intervalonumericovi.getText();
		String validadedevisualizar = validadedevi.getText();
		String validadeatevisualizar = validadeatevi.getText();
		

	
		System.out.println(tipodedocumentovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(intervalonumericovisualizar);
		System.out.println(validadedevisualizar);
		System.out.println(validadeatevisualizar);
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(tipodedocumento);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	    attributoNotToBeEmptyXpath("//input[@placeholder=\"Selecionar Validade De\"]", "value");
		sleep(2000);
		String tipodedocumentoeditar = tipodedocumento.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String intervalonumericoeditar = intervalonumerico.getAttribute("value");
		String validadedeeditar = validadede.getAttribute("value");
		String validadeateeditar = validadeate.getAttribute("value");
		
	

		
		
		
		System.out.println(tipodedocumentoeditar);
		System.out.println(descricaoeditar);
		System.out.println(intervalonumericoeditar);
		System.out.println(validadedeeditar);
		System.out.println(validadeateeditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tipodedocumentoeditar.contains(tipodedocumentovisualizar));
		sucesso.add(descricaoeditar.contains(descricaovisualizar));
		sucesso.add(intervalonumericoeditar.contains(intervalonumericovisualizar));
		sucesso.add(validadedeeditar.contains(validadedevisualizar));
		sucesso.add(validadeateeditar.contains(validadeatevisualizar));
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
