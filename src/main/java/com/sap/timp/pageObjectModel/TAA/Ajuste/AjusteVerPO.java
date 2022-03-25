package com.sap.timp.pageObjectModel.TAA.Ajuste;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AjusteVerPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[@id=\"idCompany\"]/div/div/input")
	public WebElement empresaV;
	
	@FindBy(xpath = "//div[@id=\"ufOrig\"]/div/div/input")
	public WebElement ufOrigemV;
	
	@FindBy(xpath = "//div[@id=\"idBranch\"]/div/div/input")
	public WebElement filialV;
	
	@FindBy(xpath = "//div[@id=\"codAjuste\"]/div/div/input")
	public WebElement codigoV;
	
	@FindBy(xpath = "//div[@id=\"descPadrao\"]/div/div/input")
	public WebElement descripcaoV;
	
	@FindBy(xpath = "//div[@id=\"tipoAjuste\"]/div/div/input")
	public WebElement tipoAjusteV;
	
	@FindBy(xpath = "//div[@id=\"tpLanc\"]/div/div/input")
	public WebElement tipoLancamientoV;
	
	@FindBy(xpath = "//div[@id=\"idTax\"]/div/div/input")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@id=\"tpTributo\"]/div/div/input")
	public WebElement tipoTributoV;
	
	@FindBy(xpath = "//div[@id=\"utilization\"]/div/div/input")
	public WebElement utilizableV;
	
	@FindBy(xpath = "//div[@id=\"bookLine\"]/div/div/input")
	public WebElement linhaV;
	
	@FindBy(xpath = "//div[@id=\"tipoTabela\"]/div/div/input")
	public WebElement tipoTableV;
	
	@FindBy(xpath = "//div[@id=\"ufDest\"]/div/div/input")
	public WebElement ufDestinoV;
	
	@FindBy(xpath = "//div[@id=\"codOfficial\"]/div/div/input")
	public WebElement codigoOficialV;
	
	@FindBy(xpath = "//div[@id=\"descOfficial\"]/div/div/input")
	public WebElement descricaoOficialV;
	
	@FindBy(xpath = "//div[@id=\"tpContab\"]/div/div/input")
	public WebElement codigoContabilizacaoV;
	
	@FindBy(xpath = "//div[@id=\"codSped\"]/div/div/input")
	public WebElement codigoRegistroV;
	
	@FindBy(xpath = "//div[@id=\"dtlCodSped\"]/div/div/input")
	public WebElement detalharCodV;
	
	@FindBy(xpath = "//div[@id=\"ajusteValue\"]/div/div/input")
	public WebElement valorAjusteV;
	
	@FindBy(xpath = "//div[@id=\"status\"]/div/div/input")
	public WebElement statusAjusteV;
	
	@FindBy(xpath = "//div[@id=\"subPeriod\"]/div/div/input")
	public WebElement subPeriodoV;
	
	@FindBy(xpath = "//div[@id=\"dtLanc\"]/div/div/input")
	public WebElement dataV;
	
	@FindBy(xpath = "//div[@id=\"originComponent\"]/div/div/input")
	public WebElement componenteV;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public   AjusteVerPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  ver(){
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[1]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[15]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		}
		String idRegistro = idObter("Ajuste");
		System.out.println(idRegistro );
				
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		ver .click();
		sleep(10000);
		sleep(10000);
		sleep(10000);
		
		
		String textoEmpresaV = empresaV.getAttribute("value");
		String textoufOrigemV = ufOrigemV.getAttribute("value");
		String textofilialV = filialV.getAttribute("value");
		String textocodigoV = codigoV.getAttribute("value");
		String textodescripcaoV  =  descripcaoV.getAttribute("value");
		String textotipoAjusteV  = tipoAjusteV.getAttribute("value");
		String textotipoLancamientoV  = tipoLancamientoV.getAttribute("value");
		String textotributoV  = tributoV.getAttribute("value");
		String textotipoTributoV = tipoTributoV.getAttribute("value");
		String textoutilizableV = utilizableV.getAttribute("value");
		String textolinhaV = linhaV.getAttribute("value");
		String textotipoTableV = tipoTableV.getAttribute("value");
		String textoufDestinoV = ufDestinoV.getAttribute("value");
		String textocodigoOficialV = codigoOficialV.getAttribute("value");
		String textodescricaoOficialV = descricaoOficialV.getAttribute("value");
		String textocodigoContabilizacaoV = codigoContabilizacaoV.getAttribute("value");
		String textocodigoRegistroV = codigoRegistroV.getAttribute("value");
		String textodetalharCodV =  detalharCodV.getAttribute("value");
		String textovalorAjusteV = valorAjusteV.getAttribute("value");
		String textostatusAjusteV = statusAjusteV.getAttribute("value");
		String textosubPeriodoV = subPeriodoV.getAttribute("value");
		String textodataV = dataV.getAttribute("value");
		String textocomponenteV = componenteV.getAttribute("value");
		
		System.out.println("Empresa: "+textoEmpresaV);
		System.out.println("Uf origem: "+textoufOrigemV );
		System.out.println("Filial: "+ textofilialV);
		System.out.println("Código Ajuste Alltax: "+textocodigoV );
		System.out.println("Descrição Padrão: "+textodescripcaoV );
		System.out.println ("Tipo ajuste: "+textotipoAjusteV);
		System.out.println ("Tipo lançamento: "+textotipoLancamientoV);
		System.out.println ("Tributo: "+textotributoV);
		System.out.println ("Tipo Tributo: "+textotipoTributoV);
		System.out.println ("Utilização: "+textoutilizableV );
		System.out.println ("Linha do livro: "+textolinhaV);
		System.out.println ("Tipo Tabela: "+textotipoTableV);
		System.out.println ("Uf destino: "+textoufDestinoV);
		System.out.println ("Código oficial: "+textocodigoOficialV );
		System.out.println ("Descrição Oficial: "+textodescricaoOficialV);
		System.out.println ("Código de contabilização"+textocodigoContabilizacaoV);
		System.out.println ("Código Registro SPED: "+ textocodigoRegistroV);
		System.out.println ("Detalhar Cod. Reg SPED: "+textodetalharCodV);
		System.out.println ("Valor Ajuste:"+textovalorAjusteV);
		System.out.println ("Status Ajuste: "+textostatusAjusteV);
		System.out.println ("Subperíodo: "+textosubPeriodoV);
		System.out.println ("Data de lançamento: "+textodataV);
		System.out.println ("Componente Origem: "+textocomponenteV);
		sleep(16000);
		sleep(16000);
		sleep(16000);
		sleep(5000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[1]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
		
		}
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar .click();
		sleep(16000);
		
		String textoEmpresa = empresaV.getAttribute("value");
		String textoufOrigem = ufOrigemV.getAttribute("value");
		String textofilial = filialV.getAttribute("value");
		String textocodigo = codigoV.getAttribute("value");
		String textodescripcao =  descripcaoV.getAttribute("value");
		String textotipoAjuste  = tipoAjusteV.getAttribute("value");
		String textotipoLancamiento  = tipoLancamientoV.getAttribute("value");
		String textotributo  = tributoV.getAttribute("value");
		String textotipoTributo= tipoTributoV.getAttribute("value");
		String textoutilizable = utilizableV.getAttribute("value");
		String textolinha = linhaV.getAttribute("value");
		String textotipoTable = tipoTableV.getAttribute("value");
		String textoufDestino = ufDestinoV.getAttribute("value");
		String textocodigoOficial = codigoOficialV.getAttribute("value");
		String textodescricaoOficial = descricaoOficialV.getAttribute("value");
		String textocodigoContabilizacao = codigoContabilizacaoV.getAttribute("value");
		String textocodigoRegistro = codigoRegistroV.getAttribute("value");
		String textodetalharCod =  detalharCodV.getAttribute("value");
		String textovalorAjuste = valorAjusteV.getAttribute("value");
		String textostatusAjuste = statusAjusteV.getAttribute("value");
		String textosubPeriodo = subPeriodoV.getAttribute("value");
		String textodata = dataV.getAttribute("value");
		String textocomponente = componenteV.getAttribute("value");
		
		System.out.println("Empresa: "+textoEmpresa);
		System.out.println("Uf origem: "+textoufOrigem );
		System.out.println("Filial: "+ textofilial);
		System.out.println("Código Ajuste Alltax: "+textocodigo );
		System.out.println("Descrição Padrão: "+textodescripcao );
		System.out.println ("Tipo ajuste: "+textotipoAjuste);
		System.out.println ("Tipo lançamento: "+textotipoLancamiento);
		System.out.println ("Tributo: "+textotributo);
		System.out.println ("Tipo Tributo: "+textotipoTributo);
		System.out.println ("Utilização: "+textoutilizable );
		System.out.println ("Linha do livro: "+textolinha);
		System.out.println ("Tipo Tabela: "+textotipoTable);
		System.out.println ("Uf destino: "+textoufDestino);
		System.out.println ("Código oficial: "+textocodigoOficial);
		System.out.println ("Descrição Oficial: "+textodescricaoOficial);
		System.out.println ("Código de contabilização"+textocodigoContabilizacao);
		System.out.println ("Código Registro SPED: "+ textocodigoRegistro);
		System.out.println ("Detalhar Cod. Reg SPED: "+textodetalharCod);
		System.out.println ("Valor Ajuste:"+textovalorAjuste);
		System.out.println ("Status Ajuste: "+textostatusAjuste);
		System.out.println ("Subperíodo: "+textosubPeriodo);
		System.out.println ("Data de lançamento: "+textodata);
		System.out.println ("Componente Origem: "+textocomponente);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(textoEmpresa.contains(textoEmpresaV));
		sucesso.add(textoufOrigem.contains(textoufOrigemV));
		sucesso.add(textofilial.contains(textofilialV));
		sucesso.add(textocodigo.contains(textocodigoV));
		sucesso.add(textodescripcao.contains(textodescripcaoV));
		sucesso.add(textotipoAjuste.contains(textotipoAjusteV));
		sucesso.add(textotipoLancamiento.contains(textotipoLancamiento));
		sucesso.add(textotributo.contains(textotributoV));
		sucesso.add(textotipoTributo.contains(textotipoTributoV));
		sucesso.add(textoutilizable.contains(textoutilizableV));
		sucesso.add(textolinha.contains(textolinhaV));
		sucesso.add(textotipoTable.contains(textotipoTableV));
		sucesso.add(textoufDestino.contains(textoufDestinoV));
		sucesso.add(textocodigoOficial.contains(textocodigoOficialV));
		sucesso.add(textodescricaoOficial.contains(textodescricaoOficialV));
		sucesso.add(textocodigoContabilizacao.contains(textocodigoContabilizacaoV));
		sucesso.add(textocodigoRegistro.contains(textocodigoRegistroV));
		sucesso.add(textodetalharCod.contains(textodetalharCodV));
		sucesso.add(textovalorAjuste.contains(textovalorAjusteV));
		sucesso.add(textostatusAjuste.contains(textostatusAjusteV));
		sucesso.add(textosubPeriodo.contains(textosubPeriodoV));
		sucesso.add(textodata.contains(textodataV));
		sucesso.add(textocomponente.contains(textocomponenteV));
		
		
	


		System.out.println(sucesso);
	
		return sucesso;

	}
}
