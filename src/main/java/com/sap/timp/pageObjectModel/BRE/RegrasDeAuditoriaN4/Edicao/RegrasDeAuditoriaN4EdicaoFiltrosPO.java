package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.Edicao;

import org.apache.maven.artifact.resolver.filter.AndArtifactFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class RegrasDeAuditoriaN4EdicaoFiltrosPO extends TestBaseKenssy  {

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	//IZQUIERDA
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[3]/div/div/div[@id=\"report-search\"]/div/div/input")
	public WebElement pesquisar1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-number\"]")
	public WebElement camposNumeros1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-string\"]")
	public WebElement camposTexto1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-calendar\"]")
	public WebElement camposData1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-all\"]")
	public WebElement all1;
	
	
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"ID_COMPANY\"]")
	public WebElement codEmpresa1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement numero1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"ID_BRANCH\"]")
	public WebElement texto1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"DT_LANC\"]")
	public WebElement data1;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul")
	public WebElement todos1;
	
	
	
	//DERECHA
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[3]/div/div/div[@id=\"report-search\"]/div/div/input")
	public WebElement pesquisar2;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-number\"]")
	public WebElement camposNumeros2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-string\"]")
	public WebElement camposTexto2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-calendar\"]")
	public WebElement camposData2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[3]/div[2]/button[@id=\"filter-btn-all\"]")
	public WebElement all2;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"ID_COMPANY\"]")
	public WebElement codEmpresa2;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement numero2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"ID_BRANCH\"]")
	public WebElement texto2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"DT_LANC\"]")
	public WebElement data2;
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul")
	public WebElement todos2;
	
	
	//div[@class="left-wrapper"]/div/div/div/div[3]/div[2]/button[@id="filter-btn-number"]
	
	public RegrasDeAuditoriaN4EdicaoFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtros() {
		boolean sucesso = false;
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		regraAuditoriaN4.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		String idRegradeAuditoria = idObter("idAn4");
		//String idRegradeAuditoria = idObter2();
		//1304
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegradeAuditoria+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegradeAuditoria+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar1.sendKeys("código da empresa");
		sleep(3000);
		waitExpectElement(codEmpresa1);
		sleep(2000);
		
		if (codEmpresa1.isDisplayed()) {
			System.out.println("SI SE DESPLEGO");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		pesquisar1.clear();
		sleep(3000);
		pesquisar1.sendKeys(" ");
		sleep(3000);
		waitExpectElement(todos1);
		sleep(3000);
		
		if (todos1.isDisplayed()) {
			System.out.println("SI SE DESPLEGO TODOS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		
		//COMPARAR LO QUE SE DESPLEGO ABAJO DE REGISTRO 1
		
		camposNumeros1.click();
		sleep(2000);
		waitExpectElement(numero1);
		sleep(2000);
		if (numero1.isDisplayed()) {
			System.out.println("SI SE DESPLEGO CAMPOS NUMEROS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		camposTexto1.click();
		sleep(2000);
		waitExpectElement(texto1);
		sleep(2000);
		if (codEmpresa1.isDisplayed() && texto1.isDisplayed() ) {
			System.out.println("SI SE DESPLEGO CAMPOS TEXTO");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		camposData1.click();
		sleep(2000);
		waitExpectElement(data1);
		sleep(2000);
		if (data1.isDisplayed()) {
			System.out.println("SI SE DESPLEGO CAMPOS DATA");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		all1.click();
		sleep(2000);
		waitExpectElement(todos1);
		sleep(2000);
		if (todos1.isDisplayed()) {
			System.out.println("SI SE DESPLEGO TODOS LOS CAMPOS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		
	
		
		
		//DERECHA
		pesquisar2.sendKeys("código da empresa");
		sleep(3000);
		waitExpectElement(codEmpresa2);
		sleep(2000);
		
		if (codEmpresa2.isDisplayed()) {
			System.out.println("SI SE DESPLEGO");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		pesquisar2.clear();
		sleep(3000);
		pesquisar2.sendKeys(" ");
		sleep(3000);
		waitExpectElement(todos2);
		sleep(3000);
		
		if (todos2.isDisplayed()) {
			System.out.println("SI SE DESPLEGO TODOS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		
		//COMPARAR LO QUE SE DESPLEGO ABAJO DE REGISTRO 1
		
		camposNumeros2.click();
		sleep(2000);
		waitExpectElement(numero2);
		sleep(2000);
		if (numero2.isDisplayed()) {
			System.out.println("SI SE DESPLEGO CAMPOS NUMEROS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		camposTexto2.click();
		sleep(2000);
		waitExpectElement(texto2);
		sleep(2000);
		if (codEmpresa2.isDisplayed() && texto2.isDisplayed() ) {
			System.out.println("SI SE DESPLEGO CAMPOS TEXTO");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		camposData2.click();
		sleep(2000);
		waitExpectElement(data2);
		sleep(2000);
		if (data2.isDisplayed()) {
			System.out.println("SI SE DESPLEGO CAMPOS DATA");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		all2.click();
		sleep(2000);
		waitExpectElement(todos2);
		sleep(2000);
		if (todos2.isDisplayed()) {
			System.out.println("SI SE DESPLEGO TODOS LOS CAMPOS");
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
//		pesquisar2.sendKeys("código da empresa");
//		pesquisar2.sendKeys(Keys.ENTER);
//		pesquisar2.clear();
//		sleep(2000);
//		
//		//COMPARAR LO QUE SE DESPLEGO ABAJO DE REGISTRO 1
//		
//		camposNumeros2.click();
//		sleep(2000);
//		
//		camposTexto2.click();
//		sleep(2000);
//		
//		camposData2.click();
//		sleep(2000);
//		
//		all2.click();
//		sleep(2000);
		
		
		System.out.println(sucesso);
		return sucesso;
	}
}
