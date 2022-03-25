package com.sap.timp.pageObjectModel.MDR.SaldoInicial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldoInicialEditarPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-saldos\")]/div/span[2]")
	public WebElement saldoInicial;
	
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//div[@id=\"MES\"]/div/div/div/input[1]")
	public WebElement campo;
	//div[@id="MES"]/div/div/div/input
	
	
	@FindBy(xpath="//div[@id=\"MES\"]/div/div/div[2]")
	public WebElement mes;
	
		@FindBy(xpath="//li[@id][2]")
		public WebElement opcMes;
	
	@FindBy(xpath = "//div[@id=\"MES\"]/div/div/div/input[1]")
	public WebElement mes1;
	
	@FindBy(xpath = "//div[@id=\"YEAR\"]/div/div/div/input[1]")
	public WebElement year1;
	
	//campo de des en VISUALIZAR
	@FindBy(xpath = "//span[@id=\"anioMes\"]")
	public WebElement data;
	
		
	public SaldoInicialEditarPO() {
		PageFactory.initElements(driver, this);
	}


	public boolean editarSaldoInicial() {
		
		sleep(2000);
		saldoInicial.click();
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("SaldoInicial");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		String valor = campo.getAttribute("value");
		//System.out.println("mes que trae 1:" +valor);
		
		String anio = year1.getAttribute("value");
		System.out.println("mes que trae 1:" +valor +"/"+ anio);
		
		
		String mesEditar2= campo.getAttribute("value");
		String yearEditar2 = year1.getAttribute("value");
		
		String fechaString2 = getCodeMonthByMonth(mesEditar2)+"/"+yearEditar2;
		System.out.println("FECHA INICIAL: "+fechaString2);

		mes.click();
		opcMes.click();
		opcMes.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		String mesEditar = campo.getAttribute("value");
		String yearEditar = year1.getAttribute("value");
		
		String fechaString = getCodeMonthByMonth(mesEditar)+"/"+yearEditar;
		System.out.println("FECHA DESPUES:"+fechaString);
		
		//campo.clear();
		//sleep(1000);
		//campo.sendKeys(enviar);
		//sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		//sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		
		//despues de editar
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		//opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		//String data1 = data.getText();
		
		//waitExpectElement(campo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


//		String mesEditar = mes1.getAttribute("value");
//		String yearEditar = year1.getAttribute("value");
//		
//		String fechaString = getCodeMonthByMonth(mesEditar)+"/"+yearEditar;
		
		String nuevoTexto = data.getText();

		System.out.println("valor que traia antes: "+valor);
		System.out.println("valor que traia despues: "+nuevoTexto);
		boolean sucesso = nuevoTexto.equals(fechaString);
		System.out.println(sucesso);

//		sleep(1000);
//		campo.clear();
//
//		sleep(1000);
//		campo.sendKeys(valor);
//
//		gravar.click();
//		sleep(2000);
//		waitExpectElement(sim);
//		sleep(2000);
//		sim.click();
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;
		
	}
}
