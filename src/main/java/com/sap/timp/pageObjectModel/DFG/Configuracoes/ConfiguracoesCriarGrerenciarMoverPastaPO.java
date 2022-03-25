package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracoesCriarGrerenciarMoverPastaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-Display-and-Setting icon-setting padding-right \"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-File-and-Folders icon-addfolder\"]")
	public WebElement btnCriarPasta;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/table/tbody/tr[2]/td[2]/div/div/div/input")
	public WebElement nomePasta;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração\"]")
	public WebElement btnNovaConfiguracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Configuração\"]")
	public WebElement nomeConfiguracao;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement cboLeiautes;
	
	@FindBy(xpath = "//li[contains(text(),\"Teste Automatizado\")]")
	public WebElement opcionLeiautes;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text() =\"ICMS\" and @id]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versao;
	@FindBy(xpath = "//li[text() =\"1.0\" and @id]")
	public WebElement opcionVersao;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement uf;
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@id=\"1000SP0001\"]/div/label/span")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-folder\"]")
	public WebElement btnMoverPasta;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Pasta Destino\"]")
	public WebElement cboPara;
	
	@FindBy(xpath = "//li[text() =\"Pasta 1\" and @id]")
	public WebElement opcionPara;
	
	@FindBy(xpath = "//button[text()=\"Mover\"]")
	public WebElement btnMover;
	
	@FindBy(xpath = "//div[@class=\"pane\"]/div/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnExpandirPasta1;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-foldersetting\"]")
	public WebElement btnGerenciarPasta;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")
	public WebElement nomePasta2;
	
	@FindBy(xpath = "//button[text()=\"Atualizar\"]")
	public WebElement btnActualizar;
	
	@FindBy(xpath = "//button[text()=\"Excluir Pasta\"]")
	public WebElement btnExcluirPasta;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public ConfiguracoesCriarGrerenciarMoverPastaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarGerenciarMoverPasta() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		configuracoes.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(raiz2);
		raiz2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnCriarPasta.click();
		sleep(2000);
		
		waitExpectElement(nomePasta);
		nomePasta.click();
		sleep(1000);
		nomePasta.sendKeys("Pasta 1");
		sleep(1000);
		btnCriar.click();
		
		sleep(4000);
		btnCriarPasta.click();
		sleep(2000);
		
		waitExpectElement(nomePasta);
		nomePasta.click();
		sleep(1000);
		nomePasta.sendKeys("Pasta 2");
		sleep(1000);
		btnCriar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(6000);
		btnExpansaoPastaElement.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement pasta2 = driver.findElement(By.xpath("//span[text()=\"Pasta 2\"]"));
		waitExpectElement(pasta2);
		pasta2.click();
		
		btnNovaConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		waitExpectElement(nomeConfiguracao);
		nomeConfiguracao.sendKeys("Teste Automatizado");
		sleep(1000);
		
		cboLeiautes.click();
		sleep(1000);
		
		String idRegistro = idObter3();
		
	//	actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);
		
		attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
		versao.click();
		sleep(1000);
		opcionVersao.click();
		sleep(1000);
		
		actionsMoveToElementElement(dataVigencia);
		tributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectCompany\"]/div", "class", "base-MultipleSelect3 required");
		empresa.click();
		sleep(1000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectState\"]/div", "class", "base-MultipleSelect3 required");
		uf.click();
		sleep(1000);
		opcionUf.click();
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectFilial\"]/div", "class", "base-MultipleSelect3 required");
		filial.click();
		sleep(1000);
		opcionFilial.click();
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		actionsMoveToElementElement(dataVigencia);
		dataVigencia.sendKeys("01/01/2013");
		
		salvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		pasta2 = driver.findElement(By.xpath("//span[text()=\"Pasta 2\"]"));
		pasta2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String id = "0";

		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			System.out.println(id);
		}
		
		boolean sucesso = false;
		
		if(convertToInt(id) != 0) {
			System.out.println("Configuracao creado...");
			sucesso = true;
		}else {
			System.out.println("No se creo la configuracao...");
			return sucesso = false;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		btnMoverPasta.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboPara.click();
		sleep(1000);
		opcionPara.click();
		sleep(1000);
		btnMover.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(5000);
		
		btnExpandirPasta1.click();
		sleep(2000);
		
		WebElement pasta1 = driver.findElement(By.xpath("//span[text()=\"Pasta 1\"]"));
		//waitExpectElement(pasta1);
		pasta1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGerenciarPasta.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		//waitExpectElement(nomePasta2);
		nomePasta2.clear();
		nomePasta2.click();
		sleep(1000);
		nomePasta2.sendKeys("Pasta 3");
		
		sleep(1000);
		btnActualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(3000);
		
		WebElement pasta3 = driver.findElement(By.xpath("//span[text()=\"Pasta 3\"]"));
//		waitExpectElement(pasta3);
		pasta3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGerenciarPasta.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(btnExcluirPasta);
		btnExcluirPasta.click();
		
		sleep(1000);
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}