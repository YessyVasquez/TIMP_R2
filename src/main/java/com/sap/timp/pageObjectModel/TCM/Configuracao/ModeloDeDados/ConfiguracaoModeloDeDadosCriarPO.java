package com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguracaoModeloDeDadosCriarPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]/span/span[contains(text(),\"Configuração\")]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[contains(text(),\"Modelos de dados\")]")
	public WebElement modeloDados;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	//DATOS
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"create-component\"]/div/div/div[2]")
	public WebElement selectComponent;
	
	@FindBy(xpath = "//div[@id=\"create-name\"]/div/div/div[2]")
	public WebElement selectNome;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\")][2]")
	public WebElement opc;
	@FindBy(xpath = "//li[contains(@class,\"list-item\")][3]")
	public WebElement opc1;
	
	@FindBy(xpath = "//input[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[contains(@class,\"create-instance\")]/div[@id=\"create-preview\"]/div/div/div/div[2]")
	public WebElement selectCampoPrevisualizacion;
	
	@FindBy(xpath = "//div[contains(@class,\"list-option\")][2]/div/div/label/span")
	public WebElement opcCampoPrevisualizacion;
	
	@FindBy(xpath = "//input[@placeholder=\"Serviço de importação\"]")
	public WebElement servicioImportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Serviço de exportação\"]")
	public WebElement servicioExportacao;
	
	@FindBy(xpath = "//div[@id=\"create-includes\"]/div/div/label/span")
	public WebElement permitirTransporte;
	
	@FindBy(xpath = "//div[@id=\"transport-file\"]/div/label/span")
	public WebElement transportarArquivos;
	
	@FindBy(xpath = "//div[@id=\"create-onIgnore\"]/div/div/label/span")
	public WebElement ignoreImportacion;
	
	@FindBy(xpath = "//div[@id=\"create-hasCache\"]/div/div/label/span")
	public WebElement temCache;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	String URL = driver.getCurrentUrl();
	
	public ConfiguracaoModeloDeDadosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		
		configuracao.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		
		btnNovo.click();
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		
		selectComponent.click();
		sleep(1000);
		
		if (tc2) {
			opc1.click();
			sleep(1000);
		}else {
			opc.click();
			sleep(1000);
		}
		
		
		
		selectNome.click();
		sleep(1000);
		opc.click();
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		descricao.sendKeys("Teste Automatizado");
		sleep(2000);
		
		selectCampoPrevisualizacion.click();
		sleep(1000);
		opcCampoPrevisualizacion.click();
		closeSelectTypeCheckbox(selectCampoPrevisualizacion);
		sleep(1000);
		
		servicioImportacao.sendKeys("Teste SImp");
		sleep(2000);
		
		servicioExportacao.sendKeys("Teste SExp");
		sleep(2000);
		
		permitirTransporte.click();
		sleep(1000);
		
		transportarArquivos.click();
		sleep(1000);
		
		ignoreImportacion.click();
		sleep(1000);
		
		temCache.click();
		sleep(1000);
		
	//	btnGravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroNuevo = "0"; // Ultimo ID despues de crear un registro
		
		if(rows > 0) {
			idRegistroNuevo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro despues de crear: " + idRegistroNuevo);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistroNuevo);
		
		if(id2 > id1) {
			System.out.println("Registro creado satisfactoriamente...");
			sucesso = true;
			idInserir("idConfModeloDeDados",idRegistroNuevo);
		}else {
			System.out.println("No se pudo crear el registro...");
		}
		
		return sucesso;	
	}
}
