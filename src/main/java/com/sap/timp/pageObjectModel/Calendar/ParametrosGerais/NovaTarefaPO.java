package com.sap.timp.pageObjectModel.Calendar.ParametrosGerais;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NovaTarefaPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement ar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[text()=\"Nova Tarefa\"]")
	public WebElement novaTarefa;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement inicio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"vencimento\")]")
	public WebElement vencimento;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement excluir;

	public NovaTarefaPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> criar() {
		
		
		siguiente.click();
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da criação: " +idAC);
		
		
		
		novaTarefa.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		descricao.sendKeys("Teste");
		sleep(1000);
		
		inicio.sendKeys(fechaAyer());
		sleep(1000);
		
		vencimento.sendKeys(fechaActual());
		sleep(1000);
		
		gravar.click();
		
		invisibilityOfElementOverlay();
		
		refresh();
		
		waitExpectElement(siguiente);
		
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		String dataID = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println("Id antes da criação: " +idDC);
		idInserir4(dataID);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int idDCI = convertToInt(idDC);
		int idACI = convertToInt(idAC);
		
		if (idACI < idDCI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		String nomeB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		String inicioB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[17]/div")).getText();
		String vencimentoB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[18]/div")).getText();
		
		System.out.println("Nombre: " + nomeB);
		System.out.println("Inicio: " + inicioB);
		System.out.println("Vencimiento: "+vencimentoB);
		
		
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}
	
	public boolean excluir() {
		
		
		String idRegistro = idObter4();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id="+idRegistro+"]/div[2]/div"));
		WebElement excluirB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id="+idRegistro+"]/div[2]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		excluirB.click();
		sleep(1000);
		waitExpectElement(excluir);
		sleep(2000);
		excluir.click();
		invisibilityOfElementOverlay();
		refresh();
		
		waitExpectElement(siguiente);
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();

		
		int registro = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id="+idRegistro+"]")).size();
		
		boolean sucesso = false;
		
		if (registro == 0) {
			sucesso = true;
		}
		System.out.println(registro);
		System.out.println("Elemento Excluido: "+sucesso);
		
		return sucesso;
		
	}
	
}
