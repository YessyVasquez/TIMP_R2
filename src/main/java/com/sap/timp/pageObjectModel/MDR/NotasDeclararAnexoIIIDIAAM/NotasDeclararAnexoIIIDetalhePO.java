package com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class NotasDeclararAnexoIIIDetalhePO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/div/span[text()=\"Notas a Declarar Anexo III DIA-AM\"]")
	public WebElement menuNotasDeclararAnexo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	// Datos detalhe	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement inscricaoEstadual;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement anoApresentacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement mesApresentacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement numeroDeNotas;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement reconheceNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement numeroOrdenNota;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement dataApresentacaoDoDANFE;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement chaveNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement numeroItensNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement codigoSituacaoTributariaDoItem;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[14]/div/div")
	public WebElement numeroDoItemNotaFFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[15]/div/div")
	public WebElement codigoProductoDaNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[16]/div/div")
	public WebElement descricaoProducto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[17]/div/div")
	public WebElement codigoEAN;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[18]/div/div")
	public WebElement codigoNCMDoProducto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[19]/div/div")
	public WebElement valorItemNotaFiscalElectronica;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[20]/div/div")
	public WebElement codigoGeralProducto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[21]/div/div")
	public WebElement codigoInternoProducto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[22]/div/div")
	public WebElement codigoTributacaoDoProducto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[23]/div/div")
	public WebElement valorMultiplicador;
	
	// Datos detalhe	
	@FindBy(xpath = "//span[@id=\"ieDeclarantTaxpayer\"]")
	public WebElement inscricaoEstadual1;
	
	@FindBy(xpath = "//span[@id=\"presentationYear\"]")
	public WebElement anoApresentacao1;
	
	@FindBy(xpath = "//span[@id=\"presentationMonth\"]")
	public WebElement mesApresentacao1;
	
	@FindBy(xpath = "//span[@id=\"notesNumber\"]")
	public WebElement numeroDeNotas1;
	
	@FindBy(xpath = "//span[@id=\"idCompany\"]")
	public WebElement codigoEmpresa1;
	
	@FindBy(xpath = "//span[@id=\"idBranch\"]")
	public WebElement codigoFilial1;
	
	@FindBy(xpath = "//span[@id=\"recNFe\"]")
	public WebElement reconheceNotaFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"orderNoteNumber\"]")
	public WebElement numeroOrdenNota1;
	
	@FindBy(xpath = "//span[@id=\"presentationDanfeDate\"]")
	public WebElement dataApresentacaoDoDANFE1;
	
	@FindBy(xpath = "//span[@id=\"NFeKey\"]")
	public WebElement chaveNotaFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"itemsNumber\"]")
	public WebElement numeroItensNotaFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"cst\"]")
	public WebElement codigoSituacaoTributariaDoItem1;
	
	@FindBy(xpath = "//span[@id=\"NFeItemNumber\"]")
	public WebElement numeroDoItemNotaFFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"NFeProductCod\"]")
	public WebElement codigoProductoDaNotaFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"productDesc\"]")
	public WebElement descricaoProducto1;
	
	@FindBy(xpath = "//span[@id=\"codEAN\"]")
	public WebElement codigoEAN1;
	
	@FindBy(xpath = "//span[@id=\"codNCM\"]")
	public WebElement codigoNCMDoProducto1;
	
	@FindBy(xpath = "//span[@id=\"NFeItemValue\"]")
	public WebElement valorItemNotaFiscalElectronica1;
	
	@FindBy(xpath = "//span[@id=\"codGeProduct\"]")
	public WebElement codigoGeralProducto1;
	
	@FindBy(xpath = "//span[@id=\"codIntProduct\"]")
	public WebElement codigoInternoProducto1;
	
	@FindBy(xpath = "//span[@id=\"codTribProduct\"]")
	public WebElement codigoTributacaoDoProducto1;
	
	@FindBy(xpath = "//span[@id=\"valueMult\"]")
	public WebElement valorMultiplicador1;
	
	public NotasDeclararAnexoIIIDetalhePO() {
		PageFactory.initElements(driver,  this);
	}
	
	public ArrayList<Boolean> detalhe() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuNotasDeclararAnexo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("NotasDeclararAnexoIII");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoInscricaoEstadual = inscricaoEstadual.getText();
		String textoAnoApresentacaoString = anoApresentacao.getText();
		String textoMesApresentacaoString = mesApresentacao.getText();
		String textoNumeroNotaString = numeroDeNotas.getText();
		String textoCodigoEmpresaString = codigoEmpresa.getText();
		String textoCodigoFilialString = codigoFilial.getText();
		String textoReconheceNotaFiscalElectronicaString = reconheceNotaFiscalElectronica.getText();
		String textoNumeroOrdenNotaString = numeroOrdenNota.getText();
		String textoDataApresentacaoDoDANFEString = dataApresentacaoDoDANFE.getText();
		String textoChaveDaNotaFiscalElectronicaString = chaveNotaFiscalElectronica.getText();
		String textoNumeroItensDaNotaFiscalElectronicaString = numeroItensNotaFiscalElectronica.getText();
		String textoCodigoSituacaoTributariiaDoItemString = codigoSituacaoTributariaDoItem.getText();
		String textoNumeroItemNotaFiscalElectronicaString = numeroDoItemNotaFFiscalElectronica.getText();
		String textoCodigoProductoNotaFiscalElectronicaString = codigoProductoDaNotaFiscalElectronica.getText();
		String textoDescricaoDoProductoString = descricaoProducto.getText();
		String textoCodigoEANString = codigoEAN.getText();
		String textoCodigoNCMProductoString = codigoNCMDoProducto.getText();
		String textoValorDoItemDaNotaFiscalElectronicaString = valorItemNotaFiscalElectronica.getText();
		String textoCodigoGeralProductoString = codigoGeralProducto.getText();
		String textoCodigoInternoProductoString = codigoInternoProducto.getText();
		String textoCodigoTributacaoProductoString = codigoTributacaoDoProducto.getText();
		String textoValorMultiplicadorString = valorMultiplicador.getText();
		
		System.out.println("Inscrição Estadual do Contribuinte Declarante: " + textoInscricaoEstadual);
		System.out.println("Ano de Apresentação: " + textoAnoApresentacaoString);
		System.out.println("Mês Apresentação: " + textoMesApresentacaoString);
		System.out.println("Número de Notas: " + textoNumeroNotaString);
		System.out.println("Código da empresa: " + textoCodigoEmpresaString);
		System.out.println("Código de Filial: " + textoCodigoFilialString);
		System.out.println("Reconhece Nota Fiscal Eletrônica: " + textoReconheceNotaFiscalElectronicaString);
		System.out.println("Número de Ordem da Nota: " + textoNumeroOrdenNotaString);
		System.out.println("Data de Apresentação do DANFE: " + textoDataApresentacaoDoDANFEString);
		System.out.println("Chave da Nota Fiscal Electrónica: " + textoChaveDaNotaFiscalElectronicaString);
		System.out.println("Número de Itens da Nota Fiscal Eletrônica: " + textoNumeroItensDaNotaFiscalElectronicaString);
		System.out.println("Código de Situação Tributária do Item: " + textoCodigoSituacaoTributariiaDoItemString);
		System.out.println("Número do Item da Nota Fiscal Eletrônica: " + textoNumeroItemNotaFiscalElectronicaString);
		System.out.println("Código do Produto da Nota Fiscal Eletrônica: " + textoCodigoProductoNotaFiscalElectronicaString);
		System.out.println("Descrição do Produto: " + textoDescricaoDoProductoString);
		System.out.println("Código EAN: " + textoCodigoEANString);
		System.out.println("Código NCM do Produto: " + textoCodigoNCMProductoString);
		System.out.println("Valor do Item da Nota Fiscal Eletrônica: " + textoValorDoItemDaNotaFiscalElectronicaString);
		System.out.println("Código Geral do Produto: " + textoCodigoGeralProductoString);
		System.out.println("Código Interno do Produto: " + textoCodigoInternoProductoString);
		System.out.println("Código de Tributação do Produto: " + textoCodigoTributacaoProductoString);
		System.out.println("Valor Multiplicador: " + textoValorMultiplicadorString);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoInscricaoEstadual1 = inscricaoEstadual1.getText();
		String textoAnoApresentacaoString1 = anoApresentacao1.getText();
		String textoMesApresentacaoString1 = mesApresentacao1.getText();
		String textoNumeroNotaString1 = numeroDeNotas1.getText();
		String textoCodigoEmpresaString1 = codigoEmpresa1.getText();
		String textoCodigoFilialString1 = codigoFilial1.getText();
		String textoReconheceNotaFiscalElectronicaString1 = reconheceNotaFiscalElectronica1.getText();
		String textoNumeroOrdenNotaString1 = numeroOrdenNota1.getText();
		String textoDataApresentacaoDoDANFEString1 = dataApresentacaoDoDANFE1.getText();
		String textoChaveDaNotaFiscalElectronicaString1 = chaveNotaFiscalElectronica1.getText();
		String textoNumeroItensDaNotaFiscalElectronicaString1 = numeroItensNotaFiscalElectronica1.getText();
		String textoCodigoSituacaoTributariiaDoItemString1 = codigoSituacaoTributariaDoItem1.getText();
		String textoNumeroItemNotaFiscalElectronicaString1 = numeroDoItemNotaFFiscalElectronica1.getText();
		String textoCodigoProductoNotaFiscalElectronicaString1 = codigoProductoDaNotaFiscalElectronica1.getText();
		String textoDescricaoDoProductoString1 = descricaoProducto1.getText();
		String textoCodigoEANString1 = codigoEAN1.getText();
		String textoCodigoNCMProductoString1 = codigoNCMDoProducto1.getText();
		String textoValorDoItemDaNotaFiscalElectronicaString1 = valorItemNotaFiscalElectronica1.getText();
		String textoCodigoGeralProductoString1 = codigoGeralProducto1.getText();
		String textoCodigoInternoProductoString1 = codigoInternoProducto1.getText();
		String textoCodigoTributacaoProductoString1 = codigoTributacaoDoProducto1.getText();
		String textoValorMultiplicadorString1 = valorMultiplicador1.getText();
		
		System.out.println("");
		System.out.println("Inscrição Estadual do Contribuinte Declarante 1: " + textoInscricaoEstadual1);
		System.out.println("Ano de Apresentação 1: " + textoAnoApresentacaoString1);
		System.out.println("Mês Apresentação 1: " + textoMesApresentacaoString1);
		System.out.println("Número de Notas 1: " + textoNumeroNotaString1);
		System.out.println("Código da empresa 1: " + textoCodigoEmpresaString1);
		System.out.println("Código de Filial 1: " + textoCodigoFilialString1);
		System.out.println("Reconhece Nota Fiscal Eletrônica 1: " + textoReconheceNotaFiscalElectronicaString1);
		System.out.println("Número de Ordem da Nota 1: " + textoNumeroOrdenNotaString1);
		System.out.println("Data de Apresentação do DANFE 1: " + textoDataApresentacaoDoDANFEString1);
		System.out.println("Chave da Nota Fiscal Electrónica 1: " + textoChaveDaNotaFiscalElectronicaString1);
		System.out.println("Número de Itens da Nota Fiscal Eletrônica 1: " + textoNumeroItensDaNotaFiscalElectronicaString1);
		System.out.println("Código de Situação Tributária do Item 1: " + textoCodigoSituacaoTributariiaDoItemString1);
		System.out.println("Número do Item da Nota Fiscal Eletrônica 1: " + textoNumeroItemNotaFiscalElectronicaString1);
		System.out.println("Código do Produto da Nota Fiscal Eletrônica 1: " + textoCodigoProductoNotaFiscalElectronicaString1);
		System.out.println("Descrição do Produto 1: " + textoDescricaoDoProductoString1);
		System.out.println("Código EAN 1: " + textoCodigoEANString1);
		System.out.println("Código NCM do Produto 1: " + textoCodigoNCMProductoString1);
		System.out.println("Valor do Item da Nota Fiscal Eletrônica 1: " + textoValorDoItemDaNotaFiscalElectronicaString1);
		System.out.println("Código Geral do Produto 1: " + textoCodigoGeralProductoString1);
		System.out.println("Código Interno do Produto 1: " + textoCodigoInternoProductoString1);
		System.out.println("Código de Tributação do Produto 1: " + textoCodigoTributacaoProductoString1);
		System.out.println("Valor Multiplicador 1: " + textoValorMultiplicadorString1);
		
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoInscricaoEstadual1.equals(textoInscricaoEstadual));
		sucesso.add(textoAnoApresentacaoString1.equals(textoAnoApresentacaoString));
		sucesso.add(textoMesApresentacaoString1.equals(textoMesApresentacaoString));
		sucesso.add(textoNumeroNotaString1.equals(textoNumeroNotaString));
		sucesso.add(textoCodigoEmpresaString1.equals(textoCodigoEmpresaString));
		sucesso.add(textoCodigoFilialString1.equals(textoCodigoFilialString));
		sucesso.add(textoReconheceNotaFiscalElectronicaString1.equals(textoReconheceNotaFiscalElectronicaString));
		sucesso.add(textoNumeroOrdenNotaString1.equals(textoNumeroOrdenNotaString));
		sucesso.add(textoDataApresentacaoDoDANFEString1.equals(textoDataApresentacaoDoDANFEString));
		sucesso.add(textoChaveDaNotaFiscalElectronicaString1.equals(textoChaveDaNotaFiscalElectronicaString));
		sucesso.add(textoNumeroItensDaNotaFiscalElectronicaString1.equals(textoNumeroItensDaNotaFiscalElectronicaString));
		sucesso.add(textoCodigoSituacaoTributariiaDoItemString1.equals(textoCodigoSituacaoTributariiaDoItemString));
		sucesso.add(textoNumeroItemNotaFiscalElectronicaString1.equals(textoNumeroItemNotaFiscalElectronicaString));
		sucesso.add(textoCodigoProductoNotaFiscalElectronicaString1.equals(textoCodigoProductoNotaFiscalElectronicaString));
		sucesso.add(textoDescricaoDoProductoString1.equals(textoDescricaoDoProductoString));
		sucesso.add(textoCodigoEANString1.equals(textoCodigoEANString));
		sucesso.add(textoCodigoNCMProductoString1.equals(textoCodigoNCMProductoString));
		sucesso.add(textoValorDoItemDaNotaFiscalElectronicaString1.equals(textoValorDoItemDaNotaFiscalElectronicaString));
		sucesso.add(textoCodigoGeralProductoString1.equals(textoCodigoGeralProductoString));
		sucesso.add(textoCodigoInternoProductoString1.equals(textoCodigoInternoProductoString));
		sucesso.add(textoCodigoTributacaoProductoString1.equals(textoCodigoTributacaoProductoString));
		sucesso.add(textoValorMultiplicadorString1.equals(textoValorMultiplicadorString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
