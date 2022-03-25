package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentodeEstruturasExcluirMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement estruturaDados;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcEstruturaDados;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"Código da empresa\"][1]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//div[@class=\"input ufMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement UF;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement opcUF;
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//*[@id=\"createMapping\"]/div/div[2]/div[9]/div[2]/div/div[1]/div[1]/div[2]/input")
	public WebElement data;
	
	@FindBy(xpath = "//*[@id=\"DT_LANC\"]/div[1]/label/span")
	public WebElement opcData;
	

	@FindBy(xpath = "//div[@class=\"input taxMap\"]/div/div/div[2]")

	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement opctributo;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[1]/label/span")
	public WebElement opctributodos;
	
	@FindBy(xpath = "//*[@id=\"05\"]/div[1]/label/span")
	public WebElement opctributodosTC2;
	

	@FindBy(xpath = "//*[@id=\"createMapping\"]/div/div[2]/div[14]/div[2]/div/div[1]/input")

	public WebElement dataInicio;
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement adicionar;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement dataFim;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement finalPagina;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public MapeamentodeEstruturasExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {	
		
		mapamentoEstruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da criação: " + idAC);
	
		
		novo.click();
		sleep(3000);
		waitExpectElement(estruturaDados);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturaDados.click();
		sleep(1000);
		opcEstruturaDados.click();
		sleep(1000);

		
		empresa.click();
		sleep(1000);
		opcEmpresa.click();
		sleep(1000);
		
		UF.click();
		sleep(1000);
		opcUF.click();
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcFilial.click();
		sleep(1000);

		
		data.click();
		sleep(1000);
		opcData.click();
		sleep(1000);
		data.sendKeys(Keys. ESCAPE);
		sleep(5000);
		
		tributo.click();
		sleep(2000);
		opctributo.click();

		sleep(5000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
	

		
		dataInicio.sendKeys("02/01/1978");
		sleep(2000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(5000);
		
		gravar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		novo.click();
		sleep(2000);
		waitExpectElement(estruturaDados);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturaDados.click();
		sleep(1000);
		opcEstruturaDados.click();
		sleep(1000);

		
		empresa.click();
		sleep(1000);
		opcEmpresa.click();
		sleep(1000);
		
		UF.click();
		sleep(1000);
		opcUF.click();
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcFilial.click();
		sleep(1000);

		
		data.click();
		sleep(1000);
		opcData.click();
		sleep(1000);
		data.sendKeys(Keys. ESCAPE);
		sleep(1000);
		
		tributo.click();
		sleep(4000);
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (tc2==true) {
			opctributodosTC2.click();
			closeSelectTypeCheckbox(tributo);
			sleep(1000);
			
		}else {
			opctributodos.click();
			closeSelectTypeCheckbox(tributo);
			sleep(1000);
		}
		

	
		
		dataInicio.sendKeys("02/01/1978");
		sleep(1000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(5000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir1(idDC);
		
		int idACI = convertToInt(idAC);
		int idADI = convertToInt(idDC);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idACI < idADI) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}
		
		System.out.println("Id criado com sucesso: " +sucesso.get(0));
		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		String estrutura1S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
	

		
		System.out.println(estrutura1S);
		

		
		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));
		
	
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
	  public boolean excluirMasaMotivosDesligamento() {
	  
	  int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	  
	  String idRegistro1 = driver.findElement(By.	  xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	  WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span")); 
	  
	  check1.click();
	  sleep(1000);
	  rows = rows-1;
	  
	  String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	  WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
	  
	  check2.click();
	  
	  sleep(1000);
	  
	  excluirMassa.click();
	  sleep(1000);
	  waitExpectElement(aceitar);
	  sleep(1000);
	  aceitar.click();
	  sleep(3000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  sleep(3000);
	  
	  driver.navigate().refresh(); 
	  sleep(3000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  waitExpectElement(finalPagina); 
	  sleep(2000);
	  
	  mapamentoEstruturas.click();
	  sleep(2000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  sleep(2000);
	  
	  finalPagina.click(); 
	  sleep(2000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
	  sleep(2000);
	  
	  rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size(); 
	  String id = "0";
	  
	  if(rows > 0) { 
		  id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		  System.out.println(id); 
	  }
	  
//	  rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();  
//	  String id4 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" +rows+"]/div[3]/div")).getText();
	  
	  int id1 = convertToInt(id); 
	  int id2 = convertToInt(idRegistro1); 
	  int id3 = convertToInt(idRegistro2);
	  
	  System.out.println(" Id Ultimo Registro: "+ id1);
	  System.out.println("Id Excluir Registro 1: " + id2);
	  System.out.println("Id Excluir Registro 2: " + id3);
	  
	  boolean sucesso = false;
	  
	  if (id1 != id2 && id1!=id3) { sucesso = true; }else { sucesso=false; }
	  
	  return sucesso;
	  
	  }
	 
}
