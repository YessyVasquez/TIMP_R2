package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTVisualizarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[@id=\"bookType\"]")
	public WebElement tipolvro;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"state\"]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"effectiveStartDate\"]")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//span[@id=\"effectiveEndDate\"]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//span[@id=\"branchMDRInformation\"]")
	public WebElement informacionMDRFilial;
	
	@FindBy(xpath = "//span[@id=\"branchStateSt\"]")
	public WebElement camposInformacaoMDRFilialUFST;
	
	@FindBy(xpath = "//span[@id=\"branchState\"]  ")
	public WebElement  camposInformacaoMDRFilialUF;
	
	@FindBy(xpath = "//span[@id=\"stRegistrationMDRInformation\"]")
	public WebElement  InformaçãoMDRInscriçãoST;
	
	@FindBy(xpath = "//span[@id=\"stRegistrationMDRInformationFields\"]")
	public WebElement  CampodeInformaçãoMDRInscriçãoST;
	
	@FindBy(xpath = "//span[@id=\"movementOriginInformation\"]")
	public WebElement  InformaçãoOrigemdoMovimento;
	
	@FindBy(xpath = "//span[@id=\"movementOriginState\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoUF;
	
	@FindBy(xpath = "//span[@id=\"movementOriginBranch\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoUFdoParceiro;
	
	@FindBy(xpath = "//span[@id=\"movementOriginTax\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoTributo;
	
	@FindBy(xpath = "//span[@id=\"adjustmentsInformation\"]")
	public WebElement  InformaçãodeAjustes;
	
	@FindBy(xpath = "//span[@id=\"adjustmentsInformationFields\"]")
	public WebElement  CamposdeInformaçãodeAjustes;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tipo de Livro\"]")
	public WebElement tipolvro1;
	
	@FindBy(xpath = "//div[contains(@class,\"companyId_0_0\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[contains(@class,\"stateId_0_1\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement ufFilial1;
	
	@FindBy(xpath = "//div[contains(@class,\"branchId_0_1\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tributo\"]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataInicio1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de fim de vigência\"]")
	public WebElement dataVigencia1;
	
	@FindBy(xpath = "//div[contains(@class,\"branchStructureHash_0_2\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement informacionMDRFilial1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação MDR Filial UF ST\"]")
	public WebElement camposInformacaoMDRFilialUFST1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação MDR Filial UF da Filial\"]")
	public WebElement  camposInformacaoMDRFilialUF1;
	
	@FindBy(xpath = "//div[contains(@class,\"stRegistrationStructureHash_0_5\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  InformaçãoMDRInscriçãoST1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação MDR Inscrição ST\"]")
	public WebElement  CampodeInformaçãoMDRInscriçãoST1;
	
	@FindBy(xpath = "//div[contains(@class,\"movementOriginStructureHash_0_6\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  InformaçãoOrigemdoMovimento1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação Origem do Movimento UF da Filial\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoUF1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação Origem do Movimento UF do Parceiro\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informação Origem do Movimento Tributo\"]")
	public WebElement  CamposdeInformaçãoOrigemdoMovimentoTributo1;
	
	@FindBy(xpath = "//div[contains(@class,\"adjustmentsStructureHash_0_8\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  InformaçãodeAjustes1;
	
	@FindBy(xpath = "//div[contains(@class,\"adjustmentsFields_0_8\")]/div/div[2]/div/div/div/div[1]")
	public WebElement  CamposdeInformaçãodeAjustes1;
	
	public  ParametrosParaLivroICMSSTVisualizarPO() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean> Visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		livrosfiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		parametrosparalivroicmsst.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =  idObter("ParametrosParaLivroICMSST");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textotipolvro = tipolvro.getText();
		String textoempresa = empresa.getText();
		String textoufFilial = ufFilial.getText();
		String textofilial = filial.getText();
		String textotributo = tributo.getText();
		String textodataInicio = dataInicio.getText();
		String textoinformacionMDRFilial = informacionMDRFilial.getText();
		
		
		String textocamposInformacaoMDRFilialUFST = camposInformacaoMDRFilialUFST.getText();
		textocamposInformacaoMDRFilialUFST = textocamposInformacaoMDRFilialUFST.toLowerCase();
		
		String textocamposInformacaoMDRFilialUF =  camposInformacaoMDRFilialUF.getText();
		textocamposInformacaoMDRFilialUF = textocamposInformacaoMDRFilialUF.toLowerCase();
		
		
		String textoInformaçãoMDRInscriçãoST = InformaçãoMDRInscriçãoST.getText();
		
		String textoCampodeInformaçãoMDRInscriçãoST = CampodeInformaçãoMDRInscriçãoST.getText();
		textoCampodeInformaçãoMDRInscriçãoST = textoCampodeInformaçãoMDRInscriçãoST.toLowerCase();
		
		String textoInformaçãoOrigemdoMovimento = InformaçãoOrigemdoMovimento.getText();
		String textoCamposdeInformaçãoOrigemdoMovimentoUF = CamposdeInformaçãoOrigemdoMovimentoUF.getText();
		textoCamposdeInformaçãoOrigemdoMovimentoUF = textoCamposdeInformaçãoOrigemdoMovimentoUF.toLowerCase();
		
		String textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro = CamposdeInformaçãoOrigemdoMovimentoUFdoParceiro.getText();
		textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro = textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro.toLowerCase();
		String textoCamposdeInformaçãoOrigemdoMovimentoTributo = CamposdeInformaçãoOrigemdoMovimentoTributo.getText();
		textoCamposdeInformaçãoOrigemdoMovimentoTributo = textoCamposdeInformaçãoOrigemdoMovimentoTributo.toLowerCase();
		String textoInformaçãodeAjustes = InformaçãodeAjustes.getText();
		textoInformaçãodeAjustes = textoInformaçãodeAjustes.toLowerCase();
		
		
		System.out.println("Tipo do Livro: " + textotipolvro);
		System.out.println("Empresa: " + textoempresa);
		System.out.println("UF da Filial: " + textoufFilial);
		System.out.println("Filial: " + textofilial );
		System.out.println("Tributo: " + textotributo);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio);
		System.out.println("Informação MDR Filial: " + textoinformacionMDRFilial);
		System.out.println("Campos de Informação de MDR de Filial - UF ST: " + textocamposInformacaoMDRFilialUFST);
		System.out.println("Campos de Informação de MDR de Filial - UF: " + textocamposInformacaoMDRFilialUF);
		System.out.println("Informação MDR Inscrição ST: " + textoInformaçãoMDRInscriçãoST);
		System.out.println("Campos de Informação MDR Inscrição ST: " + textoCampodeInformaçãoMDRInscriçãoST);
		System.out.println("Informação Origem do Movimento: " + textoInformaçãoOrigemdoMovimento);
		System.out.println("Campos de Informação Origem do Movimento - UF: " + textoCamposdeInformaçãoOrigemdoMovimentoUF);
		System.out.println("Campos de Informação Origem do Movimento - UF do Parceiro: " + textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro);
		System.out.println("Campos de Informação Origem do Movimento - Tributo: " + textoCamposdeInformaçãoOrigemdoMovimentoTributo);
		System.out.println("Informação de Ajustes: " + textoInformaçãodeAjustes);
		
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
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		//attributeToBeXpath("//div[@class=\"field-element adjustmentsFields_0_8\"]/div", "class", "input-element-wrapper");
		
		sleep(2000);
		String textotipolvro1 = tipolvro1.getAttribute("value");
		String textoempresa1 = empresa1.getText();
		String textoufFilial1 = ufFilial1.getText();
		String textofilial1 = filial1.getText();
		String textotributo1 = tributo1.getAttribute("value");
		String textodataInicio1 = dataInicio1.getAttribute("value");
		String textoinformacionMDRFilial1 = informacionMDRFilial1.getAttribute("value");
		
		
		String textocamposInformacaoMDRFilialUFST1 = camposInformacaoMDRFilialUFST1.getAttribute("value");
		textocamposInformacaoMDRFilialUFST1 = textocamposInformacaoMDRFilialUFST1.toLowerCase();
		String textocamposInformacaoMDRFilialUF1 =  camposInformacaoMDRFilialUF1.getAttribute("value");
		textocamposInformacaoMDRFilialUF1 = textocamposInformacaoMDRFilialUF1.toLowerCase();
		
		
		
		String textoInformaçãoMDRInscriçãoST1 = InformaçãoMDRInscriçãoST1.getAttribute("value");
		
		String textoCampodeInformaçãoMDRInscriçãoST1 = CampodeInformaçãoMDRInscriçãoST1.getAttribute("value");
		textoCampodeInformaçãoMDRInscriçãoST1 =textoCampodeInformaçãoMDRInscriçãoST1.toLowerCase();
		
		String textoInformaçãoOrigemdoMovimento1 = InformaçãoOrigemdoMovimento1.getAttribute("value");
		
		
		String textoCamposdeInformaçãoOrigemdoMovimentoUF1 = CamposdeInformaçãoOrigemdoMovimentoUF1.getAttribute("value");
		textoCamposdeInformaçãoOrigemdoMovimentoUF1= textoCamposdeInformaçãoOrigemdoMovimentoUF1.toLowerCase();
		
		String textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1 = CamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1.getAttribute("value");
		textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1 = textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1.toLowerCase();
		String textoCamposdeInformaçãoOrigemdoMovimentoTributo1 = CamposdeInformaçãoOrigemdoMovimentoTributo1.getAttribute("value");
		textoCamposdeInformaçãoOrigemdoMovimentoTributo1 = textoCamposdeInformaçãoOrigemdoMovimentoTributo1.toLowerCase();
		
		
		String textoInformaçãodeAjustes1 = InformaçãodeAjustes1.getAttribute("value");
		textoInformaçãodeAjustes1 = textoInformaçãodeAjustes1.toLowerCase();
		sleep(2000);
		//String textoCamposdeInformaçãodeAjustes1 =  CamposdeInformaçãodeAjustes1.getText();

		System.out.println("-------------------------------------------");
		System.out.println("Tipo do Livro: " + textotipolvro1);
		System.out.println("Empresa: " + textoempresa1);
		System.out.println("UF da Filial: " + textoufFilial1);
		System.out.println("Filial: " + textofilial1);
		System.out.println("Tributo: " + textotributo1);
		System.out.println("Data de Inicio de Vigência: " + textodataInicio1);
		System.out.println("Informação MDR Filial: " + textoinformacionMDRFilial1);
		System.out.println("Campos de Informação de MDR de Filial - UF ST: " + textocamposInformacaoMDRFilialUFST1);
		System.out.println("Campos de Informação de MDR de Filial - UF: " + textocamposInformacaoMDRFilialUF1);
		System.out.println("Informação MDR Inscrição ST: " + textoInformaçãoMDRInscriçãoST1);
		System.out.println("Campos de Informação MDR Inscrição ST: " + textoCampodeInformaçãoMDRInscriçãoST1);
		System.out.println("Informação Origem do Movimento: " + textoInformaçãoOrigemdoMovimento1);
		System.out.println("Campos de Informação Origem do Movimento - UF: " + textoCamposdeInformaçãoOrigemdoMovimentoUF1);
		System.out.println("Campos de Informação Origem do Movimento - UF do Parceiro: " + textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1);
		System.out.println("Campos de Informação Origem do Movimento - Tributo: " + textoCamposdeInformaçãoOrigemdoMovimentoTributo1);
		System.out.println("Informação de Ajustes: " + textoInformaçãodeAjustes1);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textotipolvro1.contains(textotipolvro));
	 	sucesso.add(textoempresa1.contains(textoempresa));
	 	sucesso.add(textoufFilial1.contains(textoufFilial));
		sucesso.add(textofilial1.contains(textofilial));
		sucesso.add(textotributo1.contains(textotributo));
		sucesso.add(textodataInicio1.contains(textodataInicio));
		sucesso.add(textoinformacionMDRFilial1.contains(textoinformacionMDRFilial));
		sucesso.add(textocamposInformacaoMDRFilialUFST1.contains(textocamposInformacaoMDRFilialUFST));
		sucesso.add(textocamposInformacaoMDRFilialUF1.contains(textocamposInformacaoMDRFilialUF));
		sucesso.add(textoInformaçãoMDRInscriçãoST1.contains(textoInformaçãoMDRInscriçãoST));
		sucesso.add(textoCampodeInformaçãoMDRInscriçãoST1.contains(textoCampodeInformaçãoMDRInscriçãoST));
		sucesso.add(textoInformaçãoOrigemdoMovimento1.contains(textoInformaçãoOrigemdoMovimento));
		sucesso.add(textoCamposdeInformaçãoOrigemdoMovimentoUF1.contains(textoCamposdeInformaçãoOrigemdoMovimentoUF));//aqui
		sucesso.add(textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro1.contains(textoCamposdeInformaçãoOrigemdoMovimentoUFdoParceiro));
		sucesso.add(textoCamposdeInformaçãoOrigemdoMovimentoTributo1.contains(textoCamposdeInformaçãoOrigemdoMovimentoTributo));
		sucesso.add(textoInformaçãodeAjustes1.contains(textoInformaçãodeAjustes));
		System.out.println(sucesso);
	     	
		return sucesso;
		
	}

}
