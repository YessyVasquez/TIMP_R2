package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEstruturasCriarComCopiaPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement grupo1O;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement estrutura1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estrutura1O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement campoEstrutura1;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura1O;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	
	//segunda
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement grupo2;

	@FindBy(xpath = "//li[text()=\"Empresa/Filial 1\"][1]")
	public WebElement grupo2OTQ1;
	
	@FindBy(xpath = "//li[text()=\"Empresa Filial\"][1]")
	public WebElement grupo2O;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement estrutura2;
	
	@FindBy(xpath = "//li[text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement estrutura2O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement campoEstrutura2;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura2O;
	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[2]")
	public WebElement campoEstruturaE;
	
	@FindBy(xpath = "//li[text()=\"Código da empresa\"]")
	public WebElement campoEstruturaO;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[2]")
	public WebElement campoEstruturaE2;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[1]/input")
	public WebElement campoEstruturaI1;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[1]/input")
	public WebElement campoEstruturaI2;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[@id=\"delete-icon\"]")
	public WebElement excluir;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Fim\")]")
	public WebElement dataFim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public RelacionamentoEstruturasCriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Cópia\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		/*sleep(2000);
		waitExpectElement(grupo1);
		invisibilityOfElementOverlay();*/
		sleep(371400);
		
		sleep(12000);
		excluir.click();
		sleep(2000);
		
		dataVigencia.clear();
		dataVigencia.sendKeys("02/01/1976");
		sleep(1000);
		
		dataFim.clear();
		dataFim.sendKeys("01/01/1977");
		sleep(1000);
		
		gravar.click();
		
		sleep(4000);
		
		relacionamentoEstruturas.click();
		
		sleep(8000);
		
		siguiente.click();
		
		sleep(4000);
		
        int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir("RelacionamentoEstruturasCriarCopia",idDC);
		
		int idACI = convertToInt(idObter("RelacionamentoEstruturasCriar"));
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
		String estrutura2S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		String dataVigenciaS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();
		String dataFimS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();
		
		System.out.println(estrutura1S);
		System.out.println(estrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));
		sucesso.add(estrutura2S.equals("Dados de Empresa/Filial"));
		sucesso.add(dataVigenciaS.equals("02/01/1976"));
		sucesso.add(dataFimS.equals("01/01/1977"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> editar() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriarCopia");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(371400);
		/*sleep(2000);
		waitExpectElement(grupo1);
		invisibilityOfElementOverlay();*/

		int linhaAdicionada = rows("//div[@class=\"fieldRow-wrapper\"][3]");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (linhaAdicionada ==0) {
			
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		

		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		System.out.println("Linha excluida: " +sucesso.get(0));
		
		String dataVigenciaS = dataVigencia.getAttribute("value");
		String dataFimS = dataFim.getAttribute("value");
	
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);

		sucesso.add(dataVigenciaS.equals("02/01/1976"));
		sucesso.add(dataFimS.equals("01/01/1977"));
		
		sleep(2000);
		cancelar.click();
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public boolean excluir() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriarCopia");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		System.out.println("---------------------------Exclução da Cópia-------------------------------------------");
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		invisibilityOfElementOverlay();

		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
        int rows = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		System.out.println(rows);
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		
		System.out.println("Registro Eliminado Com Sucesso: "+sucesso);
		return sucesso;
		
	}
	
	
	
	
	
}
