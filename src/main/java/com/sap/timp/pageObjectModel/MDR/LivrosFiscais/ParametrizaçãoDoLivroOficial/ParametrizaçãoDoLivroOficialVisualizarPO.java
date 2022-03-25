package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrizaçãoDoLivroOficialVisualizarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Livros Fiscais\"]")
	public WebElement menuLivrosFiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-officialFiscalBook\"]")
	public WebElement submenoParametrizacaoDoLivroOficial;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	//---------------visualizar
	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div/input")
	public WebElement tipoLibro;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div[1]")
	public WebElement filial;
	
	//------------ Estructura Nota Fiscal
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure\"]/div/div[1]/div[1]/input")
	public WebElement estructuraNotaFiscal;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc1;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc2;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc3;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc4;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc5;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc6;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc7;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc8;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure9\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc9;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure10\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc10;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure11\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc11;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure12\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc12;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure13\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc13;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteStructure14\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraNotaFiscalopc14;
	
	//------------------ Estructura Cabecalho
	
	@FindBy(xpath = "//div[@id=\"headerStructure\"]/div/div[1]/div[1]/input")
													
	public WebElement estructuraDeCabecalho;
	
	@FindBy(xpath = "//div[@id=\"headerStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho1;
	
	@FindBy(xpath = "//div[@id=\"headerStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho2;
	
	@FindBy(xpath = "//div[@id=\"headerStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho3;
	
	@FindBy(xpath = "//div[@id=\"headerStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho4;
	
	@FindBy(xpath = "//div[@id=\"headerStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho5;
	
	@FindBy(xpath = "//div[@id=\"headerStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho6;
	
	@FindBy(xpath = "//div[@id=\"headerStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho7;
	
	@FindBy(xpath = "//div[@id=\"headerStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeCabecalho8;
	
	//-------------Estructura de Ajuste
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure\"]/div/div[1]/div[1]/input")
	public WebElement estructuraDeAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste1;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste2;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste3;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste4;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste5;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste6;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste7;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste8;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure9\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste9;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure10\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste10;
	
	@FindBy(xpath = "//div[@id=\"adjustmentStructure11\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement estructuraDeAjuste11;
	
	//--------------------------- EDITAR 
	
		@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div/input")
		public WebElement tipoLibroE;
		
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div[1]")
		public WebElement empresaE;
		
		@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div[1]")
		public WebElement ufE;
		
		@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div[1]")
		public WebElement filialE;
		
		//------------ Estructura Nota Fiscal
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure\"]/div/div/div/input")
		public WebElement estructuraNotaFiscalE;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc1E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc2E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc3E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc4E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc5E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc6E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc7E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc8E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure9\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc9E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure10\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc10E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure11\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc11E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure12\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc12E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure13\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc13E;
		
		@FindBy(xpath = "//div[@id=\"fiscalNoteStructure14\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraNotaFiscalopc14E;
		
		//------------------ Estructura Cabecalho
		
		@FindBy(xpath = "//div[@id=\"headerStructure\"]/div/div/div/input")
		public WebElement estructuraDeCabecalhoE;
		
		@FindBy(xpath = "//div[@id=\"headerStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho1E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho2E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho3E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho4E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho5E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho6E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho7E;
		
		@FindBy(xpath = "//div[@id=\"headerStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeCabecalho8E;
		
		//-------------Estructura de Ajuste
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure\"]/div/div/div/input")
		public WebElement estructuraDeAjusteE;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure1\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste1E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure2\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste2E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure3\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste3E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure4\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste4E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure5\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste5E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure6\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste6E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure7\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste7E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure8\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste8E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure9\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste9E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure10\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste10E;
		
		@FindBy(xpath = "//div[@id=\"adjustmentStructure11\"]/div/div[1]/div[1]/div[1]/div/div[1]")
		public WebElement estructuraDeAjuste11E;
		
	public ParametrizaçãoDoLivroOficialVisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menuLivrosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		submenoParametrizacaoDoLivroOficial.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrizaçãoDoLivroOficial");
 
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);

		String textotipoLibro = tipoLibro.getAttribute("value");
		String textoempresa = empresa.getText();
		String textouf = uf.getText();
		String textofilial = filial.getText();
		
		String textoestructuraNotaFiscal = estructuraNotaFiscal.getAttribute("value");
		String textoestructuraNotaFiscalopc1 = estructuraNotaFiscalopc1.getText();
		String textoestructuraNotaFiscalopc2 = estructuraNotaFiscalopc2.getText();
		String textoestructuraNotaFiscalopc3 = estructuraNotaFiscalopc3.getText();
		String textoestructuraNotaFiscalopc4 = estructuraNotaFiscalopc4.getText();
		String textoestructuraNotaFiscalopc5 = estructuraNotaFiscalopc5.getText();
		String textoestructuraNotaFiscalopc6 = estructuraNotaFiscalopc6.getText();
		String textoestructuraNotaFiscalopc7 = estructuraNotaFiscalopc7.getText();
		String textoestructuraNotaFiscalopc8 = estructuraNotaFiscalopc8.getText();
		String textoestructuraNotaFiscalopc9 = estructuraNotaFiscalopc9.getText();
		String textoestructuraNotaFiscalopc10 = estructuraNotaFiscalopc10.getText();
		String textoestructuraNotaFiscalopc11 = estructuraNotaFiscalopc11.getText();
		String textoestructuraNotaFiscalopc12 = estructuraNotaFiscalopc12.getText();
		String textoestructuraNotaFiscalopc13 = estructuraNotaFiscalopc13.getText();
		String textoestructuraNotaFiscalopc14 = estructuraNotaFiscalopc14.getText();
		//-------------estructura  cabecaho
			String textoestructuraDeCabecalho = estructuraDeCabecalho.getAttribute("value");
		String textoestructuraDeCabecalho1 = estructuraDeCabecalho1.getText();
		String textoestructuraDeCabecalho2 = estructuraDeCabecalho2.getText();
		String textoestructuraDeCabecalho3 = estructuraDeCabecalho3.getText();
		String textoestructuraDeCabecalho4 = estructuraDeCabecalho4.getText();
		String textoestructuraDeCabecalho5 = estructuraDeCabecalho5.getText();
		String textoestructuraDeCabecalho6 = estructuraDeCabecalho6.getText();
		String textoestructuraDeCabecalho7 = estructuraDeCabecalho7.getText();
		String textoestructuraDeCabecalho8 = estructuraDeCabecalho8.getText();
		
			//-------------estructura  cabecaho
		String textoestructuraDeAjuste = estructuraDeAjuste.getAttribute("value");
		String textoestructuraDeAjuste1 = estructuraDeAjuste1.getText();
		String textoestructuraDeAjuste2 = estructuraDeAjuste2.getText();
		String textoestructuraDeAjuste3 = estructuraDeAjuste3.getText();
		String textoestructuraDeAjuste4 = estructuraDeAjuste4.getText();
		String textoestructuraDeAjuste5 = estructuraDeAjuste5.getText();
		String textoestructuraDeAjuste6 = estructuraDeAjuste6.getText();
		String textoestructuraDeAjuste7 = estructuraDeAjuste7.getText();
		String textoestructuraDeAjuste8 = estructuraDeAjuste8.getText();
		String textoestructuraDeAjuste9 = estructuraDeAjuste9.getText();
		String textoestructuraDeAjuste10 = estructuraDeAjuste10.getText();
		String textoestructuraDeAjuste11 = estructuraDeAjuste11.getText();
		
		System.out.println("Tipo Libro : " + textotipoLibro);
		System.out.println("Empresa: " + textoempresa);
		System.out.println("UF: " + textouf);
		System.out.println("Filial: " + textofilial);
		System.out.println("Estructura Nota Fiscal: " + textoestructuraNotaFiscal);
		System.out.println("Estructura Nota Fiscal 1: " + textoestructuraNotaFiscalopc1);
		System.out.println("Estructura Nota Fiscal 2: " + textoestructuraNotaFiscalopc2);
		System.out.println("Estructura Nota Fiscal 3: " + textoestructuraNotaFiscalopc3);
		System.out.println("Estructura Nota Fiscal 4: " + textoestructuraNotaFiscalopc4);
		System.out.println("Estructura Nota Fiscal 5: " + textoestructuraNotaFiscalopc5);
		System.out.println("Estructura Nota Fiscal 6: " + textoestructuraNotaFiscalopc6);
		System.out.println("Estructura Nota Fiscal 7: " + textoestructuraNotaFiscalopc7);
		System.out.println("Estructura Nota Fiscal 8: " + textoestructuraNotaFiscalopc8);
		System.out.println("Estructura Nota Fiscal 9: " + textoestructuraNotaFiscalopc9);
		System.out.println("Estructura Nota Fiscal 10: " + textoestructuraNotaFiscalopc10);
		System.out.println("Estructura Nota Fiscal 11: " + textoestructuraNotaFiscalopc11);
		System.out.println("Estructura Nota Fiscal 12: " + textoestructuraNotaFiscalopc12);
		System.out.println("Estructura Nota Fiscal 13: " + textoestructuraNotaFiscalopc13);
		System.out.println("Estructura Nota Fiscal 14: " + textoestructuraNotaFiscalopc14);
			
		
		System.out.println("Estrutura de cabeçalho: " + textoestructuraDeCabecalho);
		System.out.println("Estrutura de cabeçalho 1: " + textoestructuraDeCabecalho1);
		System.out.println("Estrutura de cabeçalho2 : " + textoestructuraDeCabecalho2);
		System.out.println("Estrutura de cabeçalho 3: " + textoestructuraDeCabecalho3);
		System.out.println("Estrutura de cabeçalho 4: " + textoestructuraDeCabecalho4);
		System.out.println("Estrutura de cabeçalho 5: " + textoestructuraDeCabecalho5);
		System.out.println("Estrutura de cabeçalho 6: " + textoestructuraDeCabecalho6);
		System.out.println("Estrutura de cabeçalho 7: " + textoestructuraDeCabecalho7);
		System.out.println("Estrutura de cabeçalho 8: " + textoestructuraDeCabecalho8);
		
				System.out.println("Estrutura de Ajuste: " + textoestructuraDeAjuste);
		System.out.println("Estrutura de Ajuste 1: " + textoestructuraDeAjuste1);
		System.out.println("Estrutura de Ajuste 2: " + textoestructuraDeAjuste2);
		System.out.println("Estrutura de Ajuste 3: " + textoestructuraDeAjuste3);
		System.out.println("Estrutura de Ajuste 4: " + textoestructuraDeAjuste4);
		System.out.println("Estrutura de Ajuste 5: " + textoestructuraDeAjuste5);
		System.out.println("Estrutura de Ajuste 6: " + textoestructuraDeAjuste6);
		System.out.println("Estrutura de Ajuste 7: " + textoestructuraDeAjuste7);
		System.out.println("Estrutura de Ajuste 8: " + textoestructuraDeAjuste8);
		System.out.println("Estrutura de Ajuste 9: " + textoestructuraDeAjuste9);
		System.out.println("Estrutura de Ajuste 10: " + textoestructuraDeAjuste10);
		System.out.println("Estrutura de Ajuste 11: " + textoestructuraDeAjuste11);

		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String textotipoLibroE = tipoLibroE.getAttribute("value");
		String textoempresaE = empresaE.getText();
		String textoufE = ufE.getText();
		String textofilialE = filialE.getText();
		String textoestructuraNotaFiscalE = estructuraNotaFiscalE.getAttribute("value");
		String textoestructuraNotaFiscalopc1E = estructuraNotaFiscalopc1E.getText();
		String textoestructuraNotaFiscalopc2E = estructuraNotaFiscalopc2E.getText();
		String textoestructuraNotaFiscalopc3E = estructuraNotaFiscalopc3E.getText();
		String textoestructuraNotaFiscalopc4E = estructuraNotaFiscalopc4E.getText();
		String textoestructuraNotaFiscalopc5E = estructuraNotaFiscalopc5E.getText();
		String textoestructuraNotaFiscalopc6E = estructuraNotaFiscalopc6E.getText();
		String textoestructuraNotaFiscalopc7E= estructuraNotaFiscalopc7E.getText();
		String textoestructuraNotaFiscalopc8E = estructuraNotaFiscalopc8E.getText();
		String textoestructuraNotaFiscalopc9E = estructuraNotaFiscalopc9E.getText();
		String textoestructuraNotaFiscalopc10E = estructuraNotaFiscalopc10E.getText();
		String textoestructuraNotaFiscalopc11E = estructuraNotaFiscalopc11E.getText();
		String textoestructuraNotaFiscalopc12E = estructuraNotaFiscalopc12E.getText();
		String textoestructuraNotaFiscalopc13E = estructuraNotaFiscalopc13E.getText();
		String textoestructuraNotaFiscalopc14E = estructuraNotaFiscalopc14E.getText();
				//-------------estructura  cabecaho
		String textoestructuraDeCabecalhoE = estructuraDeCabecalhoE.getAttribute("value");
		String textoestructuraDeCabecalho1E = estructuraDeCabecalho1E.getText();
		String textoestructuraDeCabecalho2E = estructuraDeCabecalho2E.getText();
		String textoestructuraDeCabecalho3E = estructuraDeCabecalho3E.getText();
		String textoestructuraDeCabecalho4E = estructuraDeCabecalho4E.getText();
		String textoestructuraDeCabecalho5E = estructuraDeCabecalho5E.getText();
		String textoestructuraDeCabecalho6E = estructuraDeCabecalho6E.getText();
		String textoestructuraDeCabecalho7E = estructuraDeCabecalho7E.getText();
		String textoestructuraDeCabecalho8E = estructuraDeCabecalho8E.getText();
		
			//-------------estructura  cabecaho
		String textoestructuraDeAjusteE = estructuraDeAjusteE.getAttribute("value");
		String textoestructuraDeAjuste1E = estructuraDeAjuste1E.getText();
		String textoestructuraDeAjuste2E = estructuraDeAjuste2E.getText();
		String textoestructuraDeAjuste3E = estructuraDeAjuste3E.getText();
		String textoestructuraDeAjuste4E = estructuraDeAjuste4E.getText();
		String textoestructuraDeAjuste5E = estructuraDeAjuste5E.getText();
		String textoestructuraDeAjuste6E = estructuraDeAjuste6E.getText();
		String textoestructuraDeAjuste7E = estructuraDeAjuste7E.getText();
		String textoestructuraDeAjuste8E = estructuraDeAjuste8E.getText();
		String textoestructuraDeAjuste9E = estructuraDeAjuste9E.getText();
		String textoestructuraDeAjuste10E = estructuraDeAjuste10E.getText();
		String textoestructuraDeAjuste11E = estructuraDeAjuste11E.getText();
	
		
		System.out.println("-------------------EDITAR--------------------- " );
		System.out.println("Tipo Libro : " + textotipoLibroE);
		System.out.println("Empresa: " + textoempresaE);
		System.out.println("UF: " + textoufE);
		System.out.println("Filial: " + textofilialE);
		System.out.println("Estructura Nota Fiscal: " + textoestructuraNotaFiscalE);
		System.out.println("Estructura Nota Fiscal 1: " + textoestructuraNotaFiscalopc1E);
		System.out.println("Estructura Nota Fiscal 2: " + textoestructuraNotaFiscalopc2E);
		System.out.println("Estructura Nota Fiscal 3: " + textoestructuraNotaFiscalopc3E);
		System.out.println("Estructura Nota Fiscal 4: " + textoestructuraNotaFiscalopc4E);
		System.out.println("Estructura Nota Fiscal 5: " + textoestructuraNotaFiscalopc5E);
		System.out.println("Estructura Nota Fiscal 6: " + textoestructuraNotaFiscalopc6E);
		System.out.println("Estructura Nota Fiscal 7: " + textoestructuraNotaFiscalopc7E);
		System.out.println("Estructura Nota Fiscal 8: " + textoestructuraNotaFiscalopc8E);
		System.out.println("Estructura Nota Fiscal 9: " + textoestructuraNotaFiscalopc9E);
		System.out.println("Estructura Nota Fiscal 10: " + textoestructuraNotaFiscalopc10E);
		System.out.println("Estructura Nota Fiscal 11: " + textoestructuraNotaFiscalopc11E);
		System.out.println("Estructura Nota Fiscal 12: " + textoestructuraNotaFiscalopc12E);
		System.out.println("Estructura Nota Fiscal 13: " + textoestructuraNotaFiscalopc13E);
		System.out.println("Estructura Nota Fiscal 14: " + textoestructuraNotaFiscalopc14E);
		
		
		System.out.println("Estrutura de cabeçalho: " + textoestructuraDeCabecalhoE);
		System.out.println("Estrutura de cabeçalho 1: " + textoestructuraDeCabecalho1E);
		System.out.println("Estrutura de cabeçalho 2 : " + textoestructuraDeCabecalho2E);
		System.out.println("Estrutura de cabeçalho 3: " + textoestructuraDeCabecalho3E);
		System.out.println("Estrutura de cabeçalho 4: " + textoestructuraDeCabecalho4E);
		System.out.println("Estrutura de cabeçalho 5: " + textoestructuraDeCabecalho5E);
		System.out.println("Estrutura de cabeçalho 6: " + textoestructuraDeCabecalho6E);
		System.out.println("Estrutura de cabeçalho 7: " + textoestructuraDeCabecalho7E);
		System.out.println("Estrutura de cabeçalho 8: " + textoestructuraDeCabecalho8E);
				
		System.out.println("Estrutura de Ajuste: " + textoestructuraDeAjusteE);
		System.out.println("Estrutura de Ajuste 1: " + textoestructuraDeAjuste1E);
		System.out.println("Estrutura de Ajuste 2: " + textoestructuraDeAjuste2E);
		System.out.println("Estrutura de Ajuste 3: " + textoestructuraDeAjuste3E);
		System.out.println("Estrutura de Ajuste 4: " + textoestructuraDeAjuste4E);
		System.out.println("Estrutura de Ajuste 5: " + textoestructuraDeAjuste5E);
		System.out.println("Estrutura de Ajuste 6: " + textoestructuraDeAjuste6E);
		System.out.println("Estrutura de Ajuste 7: " + textoestructuraDeAjuste7E);
		System.out.println("Estrutura de Ajuste 8: " + textoestructuraDeAjuste8E);
		System.out.println("Estrutura de Ajuste 9: " + textoestructuraDeAjuste9E);
		System.out.println("Estrutura de Ajuste 10: " + textoestructuraDeAjuste10E);
		System.out.println("Estrutura de Ajuste 11: " + textoestructuraDeAjuste11E);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textotipoLibroE.equals(textotipoLibro));
		sucesso.add(textoempresaE.equals(textoempresa));
		sucesso.add(textoufE.equals(textouf));
		sucesso.add(textofilialE.equals(textofilial));
		
		
		sucesso.add(textoestructuraNotaFiscalE.equals(textoestructuraNotaFiscal));
		sucesso.add(textoestructuraNotaFiscalopc1E.equals(textoestructuraNotaFiscalopc1));
		sucesso.add(textoestructuraNotaFiscalopc2E.equals(textoestructuraNotaFiscalopc2));
		sucesso.add(textoestructuraNotaFiscalopc2E.equals(textoestructuraNotaFiscalopc2));
		sucesso.add(textoestructuraNotaFiscalopc3E.equals(textoestructuraNotaFiscalopc3));
		sucesso.add(textoestructuraNotaFiscalopc4E.equals(textoestructuraNotaFiscalopc4));
		sucesso.add(textoestructuraNotaFiscalopc5E.equals(textoestructuraNotaFiscalopc5));
		sucesso.add(textoestructuraNotaFiscalopc6E.equals(textoestructuraNotaFiscalopc6));
		sucesso.add(textoestructuraNotaFiscalopc7E.equals(textoestructuraNotaFiscalopc7));
		sucesso.add(textoestructuraNotaFiscalopc8E.equals(textoestructuraNotaFiscalopc8));
		sucesso.add(textoestructuraNotaFiscalopc9E.equals(textoestructuraNotaFiscalopc9));
		sucesso.add(textoestructuraNotaFiscalopc10E.equals(textoestructuraNotaFiscalopc10));
		sucesso.add(textoestructuraNotaFiscalopc11E.equals(textoestructuraNotaFiscalopc11));
		sucesso.add(textoestructuraNotaFiscalopc12E.equals(textoestructuraNotaFiscalopc12));
		sucesso.add(textoestructuraNotaFiscalopc13E.equals(textoestructuraNotaFiscalopc13));
		sucesso.add(textoestructuraNotaFiscalopc14E.equals(textoestructuraNotaFiscalopc14));
		
			sucesso.add(textoestructuraDeCabecalhoE.equals(textoestructuraDeCabecalho));
		sucesso.add(textoestructuraDeCabecalho1E.equals(textoestructuraDeCabecalho1));
		sucesso.add(textoestructuraDeCabecalho2E.equals(textoestructuraDeCabecalho2));
		sucesso.add(textoestructuraDeCabecalho3E.equals(textoestructuraDeCabecalho3));
		sucesso.add(textoestructuraDeCabecalho4E.equals(textoestructuraDeCabecalho4));
		sucesso.add(textoestructuraDeCabecalho5E.equals(textoestructuraDeCabecalho5));
		sucesso.add(textoestructuraDeCabecalho6E.equals(textoestructuraDeCabecalho6));
		sucesso.add(textoestructuraDeCabecalho7E.equals(textoestructuraDeCabecalho7));
		sucesso.add(textoestructuraDeCabecalho8E.equals(textoestructuraDeCabecalho8));
		
		sucesso.add(textoestructuraDeAjusteE.equals(textoestructuraDeAjuste));
		sucesso.add(textoestructuraDeAjuste1E.equals(textoestructuraDeAjuste1));
		sucesso.add(textoestructuraDeAjuste2E.equals(textoestructuraDeAjuste2));
		sucesso.add(textoestructuraDeAjuste3E.equals(textoestructuraDeAjuste3));
		sucesso.add(textoestructuraDeAjuste4E.equals(textoestructuraDeAjuste4));
		sucesso.add(textoestructuraDeAjuste5E.equals(textoestructuraDeAjuste5));
		sucesso.add(textoestructuraDeAjuste6E.equals(textoestructuraDeAjuste6));
		sucesso.add(textoestructuraDeAjuste7E.equals(textoestructuraDeAjuste7));
		sucesso.add(textoestructuraDeAjuste8E.equals(textoestructuraDeAjuste8));
		sucesso.add(textoestructuraDeAjuste9E.equals(textoestructuraDeAjuste9));
		sucesso.add(textoestructuraDeAjuste10E.equals(textoestructuraDeAjuste10));
		sucesso.add(textoestructuraDeAjuste11E.equals(textoestructuraDeAjuste11));
		
		System.out.println(sucesso);
		return sucesso;
		
	}

}
