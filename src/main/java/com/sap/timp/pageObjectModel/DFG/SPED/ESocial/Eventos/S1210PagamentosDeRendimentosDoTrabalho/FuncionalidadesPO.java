package com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1210PagamentosDeRendimentosDoTrabalho;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class FuncionalidadesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-gooddoc padding-right \"]")
	public WebElement sped;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-e-social\"]")
	public WebElement eSocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-events\"]")
	public WebElement eventos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1210\"]")
	public WebElement s1210agamentosDeRendimentosDoTrabalho;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1210\"]/ul/li[@identifier=\"accordion-item-scanc-calculationBlocks\"]/div/span[text()=\"Alterar Dados do Evento\"]")
	public WebElement alterarDadosDoEvento;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1210\"]/ul/li[@identifier=\"accordion-item-scanc-calculationBlocks\"]/div/span[text()=\"Gerar Dados do Evento\"]")
	public WebElement geradosDoEvento;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Evento S1210\"]")
	public WebElement btnNovoEvento;
	
	@FindBy(xpath = "//div[contains(@class, \"name-input\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"textareaDescription\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[contains(@class,\"layout-select\")]/div/div[2]")
	public WebElement cboLeiaute;
	
	@FindBy(xpath = "//div[contains(@class,\"version-select\")]/div/div/div[2]")
	public WebElement cboVersaoLeiaute;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[contains(@class,\"tax-select\")]/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item visible\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[contains(@class, \"company-select\")]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[contains(@class, \"uf-select\")]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[contains(@class, \"branch-select\")]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 - 0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[contains(@class,\"valid-from-select\")]/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement btnSalvar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarPanelInformacao;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement btnEditar;
	
	public FuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarNovoEvento() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sped.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		eSocial.click();
		sleep(1000);
		eventos.click();
		sleep(1000);
		s1210agamentosDeRendimentosDoTrabalho.click();
		sleep(1000);
		actionsMoveToElementElement(alterarDadosDoEvento);
		alterarDadosDoEvento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}	
		
		System.out.println("ID: " + id);			
		sleep(2000);
		
		btnNovoEvento.click();
		sleep(1000);
		
		waitExpectElement(nome);
		nome.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		
		descricao.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		
		cboLeiaute.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboVersaoLeiaute.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		actionsMoveToElementElement(inputDataInicioVigencia);
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"company-select\")]/div", "class", "base-MultipleSelect3 required");
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"uf-select\")]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class, \"branch-select\")]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		opcionFilial.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);		
		
		inputDataInicioVigencia.click();
		inputDataInicioVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		btnSalvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir4(idB);
		  
		sleep(2000); 
		System.out.println("ID Primer registro: " + id); 
		System.out.println("ID Ultimo registro: " + idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
	
	public ArrayList<Boolean> informacao() {
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos informacao
		String nomeInformacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div[2]/div")).getText(); 
		String descricaoInformacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText(); 
		
		System.out.println("");
		System.out.println("----DATOS INFORMACAO");
		System.out.println("Nome: " + nomeInformacao);
		System.out.println("Descricao: " + descricaoInformacao);
		
		sleep(1000);
		btnCerrarPanelInformacao.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos Visualizar
		String nomeVisualizar = nome.getAttribute("value");
		String descricacoVisualizar = descricao.getAttribute("value");
		
		System.out.println("");
		System.out.println("----DATOS VISUALIZAR");
		System.out.println("Nome: " + nomeVisualizar);
		System.out.println("Descricao: " + descricacoVisualizar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeVisualizar.equals(nomeInformacao));
		sucesso.add(descricacoVisualizar.equals(descricaoInformacao));
		
		btnFechar.click();
		
		return sucesso;
	}
	
	public ArrayList<Boolean> visualizar() {
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos Visualizar
		String nomeString = nome.getAttribute("value"); 
		String descricaoString = descricao.getAttribute("value"); 
		String leiauteString = driver.findElement(By.xpath("//div[contains(@class, \"layout-select\")]/div/div/input")).getAttribute("value");
		String versaoLeiauteString = driver.findElement(By.xpath("//div[contains(@class, \"version-select\")]/div/div/div/input")).getAttribute("value");
		String tributoString = driver.findElement(By.xpath("//div[contains(@class, \"tax-select\")]/div/div/input")).getAttribute("value");
		String empresaString = driver.findElement(By.xpath("//div[contains(@class, \"company-select\")]/div/div/div/div/div/div[1]")).getText();
		String ufString = driver.findElement(By.xpath("//div[contains(@class, \"uf-select\")]/div/div/div/div/div/div[1]")).getText();
		String filialString = driver.findElement(By.xpath("//div[contains(@class, \"branch-select\")]/div/div/div/div/div/div[1]")).getText();
		String dataInicioVigenciaString = driver.findElement(By.xpath("//div[contains(@class, \"valid-from-select\")]/div/div/input")).getAttribute("value");
		
		System.out.println("");
		System.out.println("----DATOS VISUALIZAR");
		System.out.println("Nome: " + nomeString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Leiaute: " + leiauteString);
		System.out.println("Versao Leiaute: " + versaoLeiauteString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Data dee inicio de vigencia: " + dataInicioVigenciaString);
		
		sleep(2000);
		btnFechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
				
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos Edittar
		String nomeString1 = nome.getAttribute("value"); 
		String descricaoString1 = descricao.getAttribute("value"); 
		String leiauteString1 = driver.findElement(By.xpath("//div[contains(@class, \"layout-select\")]/div/div/input")).getAttribute("value");
		String versaoLeiauteString1 = driver.findElement(By.xpath("//div[contains(@class, \"version-select\")]/div/div/div/input")).getAttribute("value");
		String tributoString1 = driver.findElement(By.xpath("//div[contains(@class, \"tax-select\")]/div/div/input")).getAttribute("value");
		String empresaString1 = driver.findElement(By.xpath("//div[contains(@class, \"company-select\")]/div/div/div/div/div/div[1]")).getText();
		String ufString1 = driver.findElement(By.xpath("//div[contains(@class, \"uf-select\")]/div/div/div/div/div/div[1]")).getText();
		String filialString1 = driver.findElement(By.xpath("//div[contains(@class, \"branch-select\")]/div/div/div/div/div/div[1]")).getText();
		String dataInicioVigenciaString1 = driver.findElement(By.xpath("//div[contains(@class, \"valid-from-select\")]/div/div/input")).getAttribute("value");
		
		System.out.println("");
		System.out.println("----DATOS EDITAR");
		System.out.println("Nome: " + nomeString1);
		System.out.println("Descricao: " + descricaoString1);
		System.out.println("Leiaute: " + leiauteString1);
		System.out.println("Versao Leiaute: " + versaoLeiauteString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Data dee inicio de vigencia: " + dataInicioVigenciaString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeString1.equals(nomeString1));
		sucesso.add(descricaoString1.equals(descricaoString));
		sucesso.add(leiauteString1.equals(leiauteString));
		sucesso.add(versaoLeiauteString1.equals(versaoLeiauteString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(dataInicioVigenciaString1.equals(dataInicioVigenciaString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		btnFechar.click();
		
		return sucesso;
	}
}
