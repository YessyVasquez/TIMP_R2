package com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class LeiautesExecucacoFuncionalidades4Pt2PO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
	public WebElement verLeiautes;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
		
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement btnAdicionarBloco;
	
	@FindBy(xpath = "//button/span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro2;
	
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco2;
	
	@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro2;
	
	@FindBy(xpath = "//span[text()=\"Campos Especiais\"]")
	public WebElement btnCamposEspeciais;
	
	@FindBy(xpath = "//div/span[text()=\"Campos Especiais\"][1]")
	public WebElement abaCamposEspeciais;
	
	@FindBy(xpath = "//li[@data-id=\"fxf\"]/div/div/span[contains(text(),\"Campo Fixo\")][1]")
	public WebElement camposFijoDaRegistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha Nome do Campo Fixo\"]")
	public WebElement nomeCampoFixo;
	
	@FindBy(xpath = "//div[@class=\"type-field fixed-field-property\"]/div/div/div[2]")
	public WebElement tipoCampoFixo;
	
	@FindBy(xpath = "//li[contains(text(),\"Texto\")]")
	public WebElement opcTipoCampoFixo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha Comprimento do Campo Fixo\"]")
	public WebElement comprimento;
	
	@FindBy(xpath = "//button[@class=\"btn addOption\"]")
	public WebElement adicionarOpcoes;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Preencha Valor da Opção\")]")
	public WebElement valorOpcoes;
	
	@FindBy(xpath = "//li[@data-id=\"fmf\"]/div/div/span[contains(text(),\"Campo Fixo Manual\")][1]")
	public WebElement camposFijoManualDaRegistro;
	
	@FindBy(xpath = "//div[@class=\"envolve\"]/span[contains(@class,\"icon-plussign\")]")
	public WebElement addOpcao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement abaAjusteFiscais;
	
	public LeiautesExecucacoFuncionalidades4Pt2PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> campoFixo() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter1();
		System.out.println("");
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro2.click();
		sleep(2000);
		
		nombreBloco2.sendKeys("2");
		sleep(2000);
		
		nombreRegistro2.sendKeys("1");
		sleep(2000);
		
		
		abaCamposEspeciais.click();
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		

		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[2]/div[3]/div/div[5]");
		sleep(2000);
		
		moveToElement(camposFijoDaRegistro, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		nomeCampoFixo.sendKeys("Campo Fixo");
		sleep(2000);
		
		tipoCampoFixo.click();
		sleep(2000);
		opcTipoCampoFixo.click();
		sleep(2000);
		
		comprimento.sendKeys("10");
		sleep(2000);
		
		adicionarOpcoes.click();
		sleep(2000);
		
		valorOpcoes.sendKeys("TESTE");
		sleep(2000);
		
		btnAplicar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(3000);
		waitExpectElement(btnNao);
		sleep(2000);
		
		btnNao.click();
		sleep(2000);
		waitExpectElement(btnSim);
		sleep(2000);
		
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}

	public ArrayList<Boolean> campoFixoManual() {		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(camposFijoManualDaRegistro, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);

		nomeCampoFixo.sendKeys("Campo Fixo Manual");
		sleep(2000);

		valorOpcoes.sendKeys("TESTE 1");
		sleep(2000);

		addOpcao.click();
		sleep(2000);

		btnAplicar.click();
		sleep(2000);

		btnGravar.click();
		sleep(3000);
		waitExpectElement(btnNao);
		sleep(2000);

		btnNao.click();
		sleep(2000);
		waitExpectElement(btnSim);
		sleep(2000);

		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		if (mensaje > 0) {
			sucesso.add(true);

		}else {
			sucesso.add(false);
		}

		return sucesso;		
	}
}
