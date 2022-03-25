package com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisCriarProcesoRecorrentePO  extends TestBaseKenssy {
	

	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement procesoNegocio;
	
	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;
	
	@FindBy(xpath = "//span[text()=\"Novo Processo\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Processo\"]")
	public WebElement nombre;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Processo\"]")
	public WebElement descripcion;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//div[text()=\"Ponto de Início\"]")
	public WebElement inicio;
	
	@FindBy(xpath = "//div[text()=\"Ponto Final\"]")
	public WebElement fin;
	
	@FindBy(xpath = "//div[text()=\"Operação\"]")
	public WebElement operacao;
	
	@FindBy(xpath = "//div[text()=\"Nova Operação\"][2]")
	public WebElement NovoOperacao;
	
	@FindBy(xpath = "//div[text()=\"Atividade\"]")
	public WebElement actividad;
	
	@FindBy(xpath = "//div[text()=\"Nova Atividade\"][2]")
	public WebElement NovoActividad;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement justi;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[text()=\"Tarefa\"]")
	public WebElement tarefa;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicarJustificativa;
	
	
	
	public ParametrosGeraisCriarProcesoRecorrentePO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		
		procesos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(id); 
		
		sleep(2000);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.sendKeys("PRUEBA TESTEAUTOMATIZADO");
		nombre.sendKeys(Keys.ENTER);
		String txtnombre = nombre.getText();
		System.out.println(txtnombre);
		
		descripcion.sendKeys("PRUEBA TESTEAUTOMATIZADO KENSSY");
		descripcion.sendKeys(Keys.ENTER);
		String txtdescripcion = nombre.getText();
		System.out.println(txtdescripcion);
		sleep(2000);
		
		criar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(operacao, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
	/*	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(inicio, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		*/
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(actividad, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		justificativa.sendKeys("JUSTIFICATIVA TESTE AUTOMATIZADO");
		sleep(2000);
		aplicarJustificativa.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		procesos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(idB);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		//boolean sucesso1 = (Boolean) null;
		if (idBD > idD) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
		
	}
}
