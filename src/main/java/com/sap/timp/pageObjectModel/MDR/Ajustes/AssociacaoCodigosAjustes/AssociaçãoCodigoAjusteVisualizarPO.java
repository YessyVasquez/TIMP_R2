package com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AssociaçãoCodigoAjusteVisualizarPO extends TestBaseFernando{
	String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-codeAssoc\"]")
	public WebElement subMenuAjustesAssociacaoCodigoAjuste;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos de visualizar	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"ufOrigin\"]")
	public WebElement ufOrigem;
	
	@FindBy(xpath = "//span[@id=\"filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"adjustCode\"]")
	public WebElement codigoDeAjuste;

	@FindBy(xpath = "//span[@id=\"officialDesc\"]")
	public WebElement descriçãoOficial;	
	
	@FindBy(xpath = "//span[@id=\"officialCode\"]")
	public WebElement codigoOficial;
	
	@FindBy(xpath = "//span[@id=\"spedRegister\"]")
	public WebElement codigoRegistroSPED;
	
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//span[@id=\"ativo\"]")
	public WebElement activo;
	
	@FindBy(xpath = "//span[@id=\"book\"]")
	public WebElement linhaDoLivro;
	
	@FindBy(xpath = "//span[@id=\"tableType\"]")
	public WebElement tipoTabela;
	
	@FindBy(xpath = "//span[@id=\"accCode\"]")
	public WebElement codigosDeContabilização;
	
	@FindBy(xpath = "//span[@id=\"uffDestiny\"]")
	public WebElement ufDestino;
	
	@FindBy(xpath = "//span[@id=\"padrao\"]")
	public WebElement descriçãoPadrão;
	
	@FindBy(xpath = "//span[@id=\"adjustType\"]")
	public WebElement tipoDeAjuste;	
	
	@FindBy(xpath = "//span[@id=\"release\"]")
	public WebElement tipoDeLançamento;
	
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"tributeType\"]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//span[@id=\"devolutionField\"]")
	public WebElement devolução;
	
	// Datos de editar
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"ufOrigin\"]/div/div/div/input")
	public WebElement ufOrigem1;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div/div/div/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[@id=\"adjustCode\"]/div/div/div/div/div/input")
	public WebElement codigoDeAjuste1;
	
	@FindBy(xpath = "//div[@id=\"officialCode\"]/div/div/div/input")
	public WebElement codigoOficial1;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição Oficial\"]")
	public WebElement descriçãoOficial1;
	
	@FindBy(xpath = "//div[@id=\"spedRegister\"]/div/div/div/input")
	public WebElement codigoDeRegistroSPED1;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataInicioVigencia1;
	
	@FindBy(xpath = "//div[@class=\"switch\"]/div/input")
	public WebElement activo1;
	
	@FindBy(xpath = "//div[@id=\"book\"]/div/div/input")
	public WebElement linhaDoLivro1;
	
	@FindBy(xpath = "//div[@id=\"tableType\"]/div/div/input")
	public WebElement tipoTabela1;
	
	@FindBy(xpath = "//div[@id=\"accCode\"]/div/div/input")
	public WebElement codigosDeContabilização1;
	
	@FindBy(xpath = "//div[@id=\"ufDestiny\"]/div/div/div/div/div/div[1]")
	public WebElement ufDestino1;
	
	@FindBy(xpath = "//div[@id=\"padrao\"]/div/textarea")
	public WebElement descriçãoPadrão1;
	
	@FindBy(xpath = "//div[@id=\"adjustType\"]/div/div/input")
	public WebElement tipoDeAjuste1;
	
	@FindBy(xpath = "//div[@id=\"release\"]/div/div/input")
	public WebElement tipoDeLançamento1;
	
	@FindBy(xpath = "//div[@id=\"tribute\"]/div/div/input")
	public WebElement tributo1;
	
	@FindBy(xpath = "//div[@id=\"tributeType\"]/div/div/input")
	public WebElement tipoTributo1;
	
	@FindBy(xpath = "//input[@id=\"devolution_btn\"]")
	public WebElement devolução1;
	
	public AssociaçãoCodigoAjusteVisualizarPO(){
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizarAssociaçãoCodigoAjuste() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("td1") || URL.contains("tq1")) {
			waitExpectElement(menuAjustes);
			menuAjustes.click();		
			sleep(2000);
		}		
		
		subMenuAjustesAssociacaoCodigoAjuste.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AssociaçãoCodigoAjuste");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa = empresa.getText();
		String textoUFOrigem = ufOrigem.getText();
		String textoFilial = filial.getText();
		String textoCodigoDeAjuste = codigoDeAjuste.getText();
		String textoCodigoOFicial = codigoOficial.getText();
		String textodescriçãoOficial = descriçãoOficial.getText();
		textodescriçãoOficial = capitalize(textodescriçãoOficial);
		String textoCodigoRegistroSPED = codigoRegistroSPED.getText();
		String textoDataInicioVigencia = dataInicioVigencia.getText();
		String textoActivo = activo.getText();
		String textoLinhaDoLivro = linhaDoLivro.getText();
		String textoTipoTabela = tipoTabela.getText();
		String textoCodigosDeContabilização = codigosDeContabilização.getText();
		String textoUFDestino = ufDestino.getText();
		String textoDescriçãoPadrão = descriçãoPadrão.getText();
		String textoTipoAjuste = tipoDeAjuste.getText();
		String textoTipoDeLançamento = tipoDeLançamento.getText();
		String textoTributo = tributo.getText();
		String textoTipoTributo = tipoTributo.getText();
		String textoDevolução = devolução.getText();
		
		System.out.println("Empresa: " + textoEmpresa);
		System.out.println("UF Origem: " + textoUFOrigem);
		System.out.println("Filial: " + textoFilial);
		System.out.println("Codigo de Ajuste: " + textoCodigoDeAjuste);
		System.out.println("Codigo Oficial: " + textoCodigoOFicial);
		System.out.println("Descricao Oficial: " + textodescriçãoOficial);
		System.out.println("Codigo Registro SPED: " + textoCodigoRegistroSPED);
		System.out.println("Data inicio Vigencia: " + textoDataInicioVigencia);
		System.out.println("Activo: " + textoActivo);
		System.out.println("Linha do Livro: " + textoLinhaDoLivro);
		System.out.println("Tipo tabela: " + textoTipoTabela);
		System.out.println("Codigo de contabilizacao: " + textoCodigosDeContabilização);
		System.out.println("UF Destino: " + textoUFDestino);
		System.out.println("Descricao Padracao: " + textoDescriçãoPadrão);
		System.out.println("Tipo ajuste: " + textoTipoAjuste);
		System.out.println("Tipo de Lancamento: " + textoTipoDeLançamento);
		System.out.println("Tributo: " + textoTributo);
		System.out.println("Tipo tributo: " + textoTipoTributo);
		System.out.println("Devolucao: " + textoDevolução);
		
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
		String textoUFOrigem1 = ufOrigem1.getAttribute("value");
		
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		String textoFilial1 = filial1.getText();
		textoFilial1 = textoFilial1.replace(" ", ""); // Reemplazo los espacios por nada para que quedee igual en visualizar y editar
		
		String textoCodigoDeAjuste1 = codigoDeAjuste1.getAttribute("value");
		String textoCodigoOFicial1 = codigoOficial1.getAttribute("value");
		String textodescriçãoOficial1 = descriçãoOficial1.getAttribute("value");
		textodescriçãoOficial1 = capitalize(textodescriçãoOficial1);
		String textoCodigoRegistroSPED1 = codigoDeRegistroSPED1.getAttribute("value");
		String textoDataInicioVigencia1 = dataInicioVigencia1.getAttribute("value");
		String textoActivo1 = activo1.isSelected() ? "Sim" : "Não";
		String textoLinhaDoLivro1 = linhaDoLivro1.getAttribute("value");
		String textoTipoTabela1 = tipoTabela1.getAttribute("value");
		String textoCodigosDeContabilização1 = codigosDeContabilização1.getAttribute("value");
		String textoUFDestino1 = ufDestino1.getText();
		String textoDescriçãoPadrão1 = descriçãoPadrão1.getAttribute("value");
		String textoTipoAjuste1 = tipoDeAjuste1.getAttribute("value");
		String textoTipoDeLançamento1 = tipoDeLançamento1.getAttribute("value");
		String textoTributo1 = tributo1.getAttribute("value");
		String textoTipoTributo1 = tipoTributo1.getAttribute("value");
		String textoDevolução1 = devolução1.isSelected() ? "Sim" : "Não";
		
		System.out.println("-------------------------------------------");
		System.out.println("Empresa1: " + textoEmpresa1);
		System.out.println("UF Origem1: " + textoUFOrigem1);
		System.out.println("Filial 1: " + textoFilial1);
		System.out.println("Codigo de Ajuste 1: " + textoCodigoDeAjuste1);
		System.out.println("Codigo OFicial 1: " + textoCodigoOFicial1);
		System.out.println("Descricao Oficial 1: " + textodescriçãoOficial1);
		System.out.println("Codigo Registro SPED 1: " + textoCodigoRegistroSPED1);
		System.out.println("Data Inicio Vigencia 1: " + textoDataInicioVigencia1);
		System.out.println("Activo 1: " + textoActivo1);
		System.out.println("Linha do Livro 1: " + textoLinhaDoLivro1);
		System.out.println("Tipo tabela 1: " + textoTipoTabela1);
		System.out.println("Codigos de Contabilizacao 1: " + textoCodigosDeContabilização1);
		System.out.println("UF Destino 1: " + textoUFDestino1);
		System.out.println("Descricao Padrao 1: " + textoDescriçãoPadrão1);
		System.out.println("Tipo ajuste 1: " + textoTipoAjuste1);
		System.out.println("Tipo de Lancamento 1: " + textoTipoDeLançamento1);
		System.out.println("Tributo 1: " + textoTributo1);
		System.out.println("Tipo tributo 1: " + textoTipoTributo1);
		System.out.println("Devolucao 1: " + textoDevolução1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoUFOrigem1.equals(textoUFOrigem));
		sucesso.add(textoFilial1.contains(textoFilial));
		sucesso.add(textoCodigoDeAjuste1.equals(textoCodigoDeAjuste));
		sucesso.add(textoCodigoOFicial1.contains(textoCodigoOFicial));
		sucesso.add(textodescriçãoOficial.contains(textodescriçãoOficial1));
		sucesso.add(textoCodigoRegistroSPED1.equals(textoCodigoRegistroSPED));
		sucesso.add(textoDataInicioVigencia1.equals(textoDataInicioVigencia1));
		sucesso.add(textoActivo1.equals(textoActivo1));
		sucesso.add(textoLinhaDoLivro1.equals(textoLinhaDoLivro));
		sucesso.add(textoTipoTabela1.equals(textoTipoTabela));
		sucesso.add(textoCodigosDeContabilização.contains(textoCodigosDeContabilização1));
		sucesso.add(textoUFDestino1.equals(textoUFDestino));
		sucesso.add(textoDescriçãoPadrão1.equals(textoDescriçãoPadrão));
		sucesso.add(textoTipoAjuste1.equals(textoTipoAjuste));
		sucesso.add(textoTipoDeLançamento1.equals(textoTipoDeLançamento));
		sucesso.add(textoTributo1.equals(textoTributo));
		sucesso.add(textoTipoTributo1.equals(textoTipoTributo));
		sucesso.add(textoDevolução1.equals(textoDevolução));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
