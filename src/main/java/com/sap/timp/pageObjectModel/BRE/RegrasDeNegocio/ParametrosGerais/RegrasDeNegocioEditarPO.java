package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeNegocioEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regrasdenegocio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaregra;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Mensagens\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][text()=\"TAA\"]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Abas\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"tab-field\"]/div/div/div[2]")
	public WebElement abas;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement opcaoabas;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"]")
	public WebElement opcaoRegulamento;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	//@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div/input")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Tributo- (aba:Dados Lançamento) (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"<\"]")
	public WebElement opcaoOperador;
	
	//@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div/input")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	//@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/div[2]")
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	//@FindBy(xpath = "//div[@id=\"T1\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Dados Lançamento\"]")
	public WebElement opcaoacoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*/*[name()=\"tspan\"][1]")
	public WebElement primeiracaixar1editado;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*/*[name()=\"tspan\"][1]")
	public WebElement parte1string;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*/*[name()=\"tspan\"][2]")
	public WebElement parte2string;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement salvarcomocopia;
	
	//@FindBy(xpath = "//*[name()=\"g\"][@transform=\"translate(491.3333435058594,34)\"]/*/*[name()=\"tspan\"]")
	@FindBy(xpath = "//*[name()=\"g\"][@height=\"24\"][6]")
	public WebElement r2;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*/*[name()=\"tspan\"]")
	public WebElement primeiracaixar2;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//div[@class=\"tabAction-obligatory\"]/div/label/span")
	public WebElement preenchementoobrigatorio;
	
	@FindBy(xpath = "//*[name()=\"g\"][contains(@class,\"path-start\")][1]")
	public WebElement primeiracaixar1;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]")
	public WebElement primeiracaixar5;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start edited\"]/*/*[2]")
	public WebElement texto;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[19]")
	public WebElement r5;
	public RegrasDeNegocioEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> editar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String idRegistro = idObter("RegrasDeNegocioCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeiracaixar1.click();
		sleep(1000);
		preenchementoobrigatorio.click();
		sleep(1000);
		modificar.click();
		sleep(1000);
		gravar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		nao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(46000);
		
		primeiracaixar1.click();
		sleep(4000);
		
	         WebElement elementopreenchimentoobrigatorio = driver.findElement(By.xpath("//div[@class=\"tabAction-obligatory\"]/div/input"));

		if (!elementopreenchimentoobrigatorio.isSelected())
		{
			boolean sucesso1 =true;
		   System.out.println("O preechimento obrigatorio não está selecionado");
		   sucesso.add(sucesso1);
		}
		codigo.clear();
		sleep(1000);
		codigo.sendKeys("r5");
		sleep(1000);
		NomeDoValor.clear();
		sleep(1000);
		NomeDoValor.sendKeys("COFINS");
		sleep(1000);
		NomeDoValor.sendKeys(Keys.ESCAPE);
		sleep(1000);
		salvarcomocopia.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(r5.isDisplayed())
		{
			System.out.println("r5 consta na pagina de edição");
			boolean sucesso2 = true;
			sucesso.add(sucesso2);
		}
		/*String enviar="COFINS";
		String texto1=texto.getText();
		
		boolean sucesso2 = texto1.contains(enviar);
		sucesso.add(sucesso2);
		*/
	//	waitExpectElement(primeiracaixar5);
		sleep(28000);
		
		primeiracaixar5.click();
		sleep(1000);
		remover.click();
		sleep(2000);
		gravar.click();
		sleep(2000);
		nao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(configuracoes);
		sleep(26000);
		configuracoes.click();
		sleep(2000);
		String nome1 = "TESTE AUTOMATIZADO 007 - NAO MEXER";
		
		nome.clear();
		sleep(1000);
		nome.sendKeys(nome1);
		sleep(6000);
		aplicar.click();
		sleep(3000);
		gravar.click();
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracoes.click();
		sleep(1000);
		String verficarnome = nome.getAttribute("value");
		sleep(2000);
		System.out.println(verficarnome);
		
		sucesso.add(verficarnome.contains(nome1));
		System.out.println(sucesso);
		return sucesso;

	}

}
