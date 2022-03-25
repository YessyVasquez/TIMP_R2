package com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParâmetrosParaEnvioDeMensagensVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class,\"accordion-container\")]/ul/li/div/span[text()=\"Parâmetros para Envio de Mensagens\"]")
	public WebElement menuParametrosParaEnvioDeMensagens;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimerPagina;
	
	// Datos de Visualizar 
	
	@FindBy(xpath = "//span[@id=\"registerType\"]")
	public WebElement tipoDeRegistro;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"sourceEmailDefinition\"]")
	public WebElement definicaoDoEmailOrigem;
	
	@FindBy(xpath = "//span[@id=\"destinyEmailDefinition\"]")
	public WebElement definicaoDoEmailDestino;
	
	@FindBy(xpath = "//span[@id=\"subjectTypeDefinition\"]")
	public WebElement definicaoDeTipoDeAssunto;
	
	@FindBy(xpath = "//span[@id=\"termDefinition\"]")
	public WebElement definicaoDePrazo;	

	@FindBy(xpath = "//span[@id=\"repetitionDefinition\"]")
	public WebElement definicaoDeRepeticao;
	
	@FindBy(xpath = "//span[@id=\"emailText\"]")
	public WebElement mensagemDoEmail;
	
	@FindBy(xpath = "//span[@id=\"component\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//span[@id=\"initialValidity\"]")
	public WebElement inicioDaValidade;	
	
	// Datos de Editar
	@FindBy(xpath = "//div[@id=\"registerType\"]/div/div/div/input")
	public WebElement tipoDeRegistro1;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao1;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[1]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[1]")
	public WebElement uf1;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[@id=\"sourceEmailDefinition\"]/div/div/div/input")
	public WebElement definicaoDoEmailOrigem1;
	
	@FindBy(xpath = "//div[@id=\"destinyEmailDefinition\"]/div/div/div/input")
	public WebElement definicaoDoEmailDestino1;
	
	@FindBy(xpath = "//div[@id=\"subjectTypeDefinition\"]/div/div/div/input")
	public WebElement definicaoDeTipoDeAssunto1;
	
	@FindBy(xpath = "//div[@id=\"termDefinition\"]/div/div/div/input")
	public WebElement definicaoDePrazo1;	

	@FindBy(xpath = "//div[@id=\"repetitionDefinition\"]/div/div/div/input")
	public WebElement definicaoDeRepeticao1;
	
	@FindBy(xpath = "//div[@id=\"emailText\"]/div/div/input")
	public WebElement mensagemDoEmail1;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div/input")
	public WebElement componente1;
	
	@FindBy(xpath = "//div[@id=\"initialValidity\"]/div/div/input")
	public WebElement inicioDaValidade1;	
	
	public ParâmetrosParaEnvioDeMensagensVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuParametrosParaEnvioDeMensagens.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParâmetrosParaEnvioDeMensagens");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tipoDeRegistroString = tipoDeRegistro.getText();
		String descricaoString = descricao.getText();
		String empresaString = empresa.getText();
		String tributoString = tributo.getText();
		String ufString = uf.getText();
		String filialString = filial.getText();
		String definicaoDoEmailOrigemString = definicaoDoEmailOrigem.getText();
		String definicaoDoEmailDestinoString = definicaoDoEmailDestino.getText();
		String definicaoDeTipoDeAssuntoString = definicaoDeTipoDeAssunto.getText();
		String definicaoDePrazoString = definicaoDePrazo.getText();
		String definicaoDeRepeticaoString = definicaoDeRepeticao.getText();
		String mensagemDoEmailString = mensagemDoEmail.getText();
		String componenteString = componente.getText();
		String inicioDaValidadeString = inicioDaValidade.getText();
		
		System.out.println("------------------Datos de visualizar--------------------");
		System.out.println("Tipop de Registro: " + tipoDeRegistroString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Definição do Email Origem: " + definicaoDoEmailOrigemString);
		System.out.println("Definição do Email Destino: " + definicaoDoEmailDestinoString);
		System.out.println("Definição de Tipo de Assunto: " + definicaoDeTipoDeAssuntoString);
		System.out.println("Definição de Prazo: " + definicaoDePrazoString);
		System.out.println("Definição de Repetição: " + definicaoDeRepeticaoString);
		System.out.println("Mensagem do Email: " + mensagemDoEmailString);
		System.out.println("Componente: " + componenteString);
		System.out.println("Início da validade: " + inicioDaValidadeString);
		
		sleep(2000);
		btnBiblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnPrimerPagina.click();
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
		
		String tipoDeRegistroString1 = tipoDeRegistro1.getAttribute("value");
		String descricaoString1 = descricao1.getAttribute("value");
		String empresaString1 = empresa1.getText();
		String tributoString1 = tributo1.getText();
		String ufString1 = uf1.getText();
		String filialString1 = filial1.getText();
		String definicaoDoEmailOrigemString1 = definicaoDoEmailOrigem1.getAttribute("value");
		String definicaoDoEmailDestinoString1 = definicaoDoEmailDestino1.getAttribute("value");
		String definicaoDeTipoDeAssuntoString1 = definicaoDeTipoDeAssunto1.getAttribute("value");
		String definicaoDePrazoString1 = definicaoDePrazo1.getAttribute("value");
		String definicaoDeRepeticaoString1 = definicaoDeRepeticao1.getAttribute("value");
		String mensagemDoEmailString1 = mensagemDoEmail1.getAttribute("value");
		String componenteString1 = componente1.getAttribute("value");
		String inicioDaValidadeString1 = inicioDaValidade1.getAttribute("value");
		System.out.println("");
		
		System.out.println("------------------Datos de visualizar--------------------");
		System.out.println("Tipop de Registro: " + tipoDeRegistroString1);
		System.out.println("Descricao: " + descricaoString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Definição do Email Origem: " + definicaoDoEmailOrigemString1);
		System.out.println("Definição do Email Destino: " + definicaoDoEmailDestinoString1);
		System.out.println("Definição de Tipo de Assunto: " + definicaoDeTipoDeAssuntoString1);
		System.out.println("Definição de Prazo: " + definicaoDePrazoString1);
		System.out.println("Definição de Repetição: " + definicaoDeRepeticaoString1);
		System.out.println("Mensagem do Email: " + mensagemDoEmailString1);
		System.out.println("Componente: " + componenteString1);
		System.out.println("Início da validade: " + inicioDaValidadeString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(tipoDeRegistroString1.contains(tipoDeRegistroString));
		sucesso.add(descricaoString1.equals(descricaoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(definicaoDoEmailOrigemString1.equals(definicaoDoEmailOrigemString));
		sucesso.add(definicaoDoEmailDestinoString1.equals(definicaoDoEmailDestinoString));
		sucesso.add(definicaoDeTipoDeAssuntoString1.equals(definicaoDeTipoDeAssuntoString));
		sucesso.add(definicaoDePrazoString1.equals(definicaoDePrazoString));
		sucesso.add(definicaoDeRepeticaoString1.equals(definicaoDeRepeticaoString));
		sucesso.add(mensagemDoEmailString1.equals(mensagemDoEmailString));
		sucesso.add(componenteString1.equals(componenteString));
		sucesso.add(inicioDaValidadeString1.equals(inicioDaValidadeString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
