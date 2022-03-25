package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrizaçãoDoLivroOficialCriarPO extends TestBaseMassiel {
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustesCerrar;
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Livros Fiscais\"]")
	public WebElement menuLivrosFiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-officialFiscalBook\"]")
	public WebElement submenoParametrizacaoDoLivroOficial;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova configuração Livro Oficial\"]")
	public WebElement btnNovaConfigurazacaoDoLivroOficial;
	
	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div[2]")
	public WebElement tipoDoLibro;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure\"]/div/div/div[2]")
	public WebElement estructuraNotaFiscal;	
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure1\"]/div/div/div[2]")
	public WebElement docNum;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure2\"]/div/div/div[2]")
	public WebElement itemDocNum;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure3\"]/div/div/div[2]")
	public WebElement indicadorTipoDeOperacao;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure4\"]/div/div/div[2]")
	public WebElement statusDoDocumento;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure5\"]/div/div/div[2]")
	public WebElement codigoDoModeloDocFiscal;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure6\"]/div/div/div[2]")
	public WebElement classificaoDaNota;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure7\"]/div/div/div[2]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure8\"]/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure9\"]/div/div/div[2]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure10\"]/div/div/div[2]")
	public WebElement ufDoParceiro;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure11\"]/div/div/div[2]")
	public WebElement dataDeLancamento;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure12\"]/div/div/div[2]")
	public WebElement cancelado;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure13\"]/div/div/div[2]")
	public WebElement valorImposto;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure14\"]/div/div/div[2]")
	public WebElement valorFcp;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure\"]/div/div/div[2]")
	public WebElement estructuraDeAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure1\"]/div/div/div[2]")
	public WebElement codigoDaEmpresa;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure2\"]/div/div/div[2]")
	public WebElement ufOrigem;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure3\"]/div/div/div[2]")
	public WebElement codigoDaFilial;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure4\"]/div/div/div[2]")
	public WebElement ufDestino;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure5\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure6\"]/div/div/div[2]")
	public WebElement dataDeLancamento1;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure7\"]/div/div/div[2]")
	public WebElement valorDoAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure8\"]/div/div/div[2]")
	public WebElement statusAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure9\"]/div/div/div[2]")
	public WebElement linhaLivro;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure10\"]/div/div/div[2]")
	public WebElement descricaoPadrao;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure11\"]/div/div/div[2]")
	public WebElement idAjuste;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure15\"]/div/div/div[2]")
	public WebElement idAjuste11;
	
	@FindBy(xpath = "//div[@id=\"headerStructure\"]/div/div/div[2]")
	public WebElement estructuraDeCabecalho;
	
	@FindBy(xpath = "//div[@id=\"headerStructure1\"]/div/div/div[2]")
	public WebElement nomeDaEmpresa;
	
	@FindBy(xpath = "//div[@id=\"headerStructure2\"]/div/div/div[2]")
	public WebElement ufFilial2;
	
	@FindBy(xpath = "//div[@id=\"headerStructure3\"]/div/div/div[2]")
	public WebElement codigoDaFilial2;
	
	@FindBy(xpath = "//div[@id=\"headerStructure4\"]/div/div/div[2]")
	public WebElement inscricaoEstadualDaFilial;
	
	@FindBy(xpath = "//div[@id=\"headerStructure5\"]/div/div/div[2]")
	public WebElement cnpjDaEmpresa;
	
	@FindBy(xpath = "//div[@id=\"headerStructure6\"]/div/div/div[2]")
	public WebElement inscricaoST;
	
	@FindBy(xpath = "//div[@id=\"headerStructure7\"]/div/div/div[2]")
	public WebElement dataInicioVigenciaEmpresa;
	
	@FindBy(xpath = "//div[@id=\"headerStructure8\"]/div/div/div[2]")
	public WebElement dataFimVigenciaEmpresa;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public ParametrizaçãoDoLivroOficialCriarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(menuAjustesCerrar);
		sleep(2000);
		menuAjustesCerrar.click();
		sleep(2000);
		
		waitExpectElement(menuLivrosFiscais);
		menuLivrosFiscais.click();
		sleep(1000);
		
		submenoParametrizacaoDoLivroOficial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo ID: " + id);
		
		sleep(6000);
		btnNovaConfigurazacaoDoLivroOficial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoDoLibro.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);	
		
		empresa.click();
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"state\"]/div/div/div/div[2]/input", "class", "");
		uf.click();
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"state\"]/div/div/div/div[2]/input", "class", "");
		filial.click();
		sleep(2000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		estructuraNotaFiscal.click();
		sleep(2000);
		opcionCombo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure1\"]/div/div/div/div[2]/input", "class", "");
		docNum.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure2\"]/div/div/div/div[2]/input", "class", "");
		itemDocNum.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure3\"]/div/div/div/div[2]/input", "class", "");
		indicadorTipoDeOperacao.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure4\"]/div/div/div/div[2]/input", "class", "");
		statusDoDocumento.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure5\"]/div/div/div/div[2]/input", "class", "");
		codigoDoModeloDocFiscal.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure6\"]/div/div/div/div[2]/input", "class", "");
		classificaoDaNota.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure7\"]/div/div/div/div[2]/input", "class", "");
		empresa1.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure8\"]/div/div/div/div[2]/input", "class", "");
		ufFilial.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure9\"]/div/div/div/div[2]/input", "class", "");
		filial1.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure10\"]/div/div/div/div[2]/input", "class", "");
		ufDoParceiro.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure11\"]/div/div/div/div[2]/input", "class", "");
		dataDeLancamento.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure12\"]/div/div/div/div[2]/input", "class", "");
		cancelado.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure13\"]/div/div/div/div[2]/input", "class", "");
		valorImposto.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure14\"]/div/div/div/div[2]/input", "class", "");
		valorFcp.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"fiscalNoteStructure15\"]/div/div/div/div[2]/input", "class", "");
		idAjuste11.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
	
		estructuraDeAjuste.click();
		sleep(2000);
		opcionCombo.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure1\"]/div/div/div/div[2]/input", "class", "");
		codigoDaEmpresa.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure2\"]/div/div/div/div[2]/input", "class", "");
		ufOrigem.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure3\"]/div/div/div/div[2]/input", "class", "");
		codigoDaFilial.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure4\"]/div/div/div/div[2]/input", "class", "");
		ufDestino.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure5\"]/div/div/div/div[2]/input", "class", "");
		tributo.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure6\"]/div/div/div/div[2]/input", "class", "");
		dataDeLancamento1.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure7\"]/div/div/div/div[2]/input", "class", "");
		valorDoAjuste.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure8\"]/div/div/div/div[2]/input", "class", "");
		statusAjuste.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure9\"]/div/div/div/div[2]/input", "class", "");
		linhaLivro.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure10\"]/div/div/div/div[2]/input", "class", "");
		descricaoPadrao.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"adjustmentStructure11\"]/div/div/div/div[2]/input", "class", "");
		idAjuste.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
	
		
		actionsMoveToElementElement(estructuraDeCabecalho);
		estructuraDeCabecalho.click();
		sleep(2000);
		opcionCombo.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure1\"]/div/div/div/div[2]/input", "class", "");
		nomeDaEmpresa.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure2\"]/div/div/div/div[2]/input", "class", "");
		ufFilial2.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure3\"]/div/div/div/div[2]/input", "class", "");
		codigoDaFilial2.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure4\"]/div/div/div/div[2]/input", "class", "");
		inscricaoEstadualDaFilial.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure5\"]/div/div/div/div[2]/input", "class", "");
		cnpjDaEmpresa.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure6\"]/div/div/div/div[2]/input", "class", "");
		inscricaoST.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure7\"]/div/div/div/div[2]/input", "class", "");
		dataInicioVigenciaEmpresa.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"headerStructure8\"]/div/div/div/div[2]/input", "class", "");
		dataFimVigenciaEmpresa.click();
		sleep(2000);
		opcionCheckbox.click();
		sleep(1000);
		body.click();
		sleep(1000);
		
		sleep(1000);
		btnGravar.click();
		sleep(2000);
		sleep(9000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);	
		sleep(9000);

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
		idInserir("ParametrizaçãoDoLivroOficial",idB);
	
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado � realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
}
