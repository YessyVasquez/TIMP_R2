package com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FatorDeCreditamentoFiltrosAvançadosPO extends TestBaseSteven {
	

	@FindBy(xpath = "//span[text()=\"Fator de Creditamento\"]")
	public WebElement FatorDeCreditamento;

	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@class=\"company-filter\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@class=\"company-filter\"]/div/div/div/input")
	public WebElement empresaOPC;

	@FindBy(xpath = "//div[@class=\"uf-filter\"]/div/div/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//div[@class=\"uf-filter\"]/div/div/div/input")
	public WebElement ufOPC;

	@FindBy(xpath = "//div[@class=\"branch-filter\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"branch-filter\"]/div/div/div/input")
	public WebElement filialOPC;

	@FindBy(xpath = "//span[text()=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"search-container\"]/div/div/input")
	public WebElement pesquisarID;

	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;

	String textEmpresa = "";
	String textUf = "";
	String textFilial = "";

	public FatorDeCreditamentoFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean Filtros() {

		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		FatorDeCreditamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String rows =  driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]")).getText();

		pesquisarID.sendKeys(rows);
		sleep(1000);

		this.textEmpresa = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+rows+"\"]/div[3]/div"))
				.getText();

		System.out.println(this.textEmpresa);


		this.textFilial = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+rows+"\"]/div[4]/div"))
				.getText();

		System.out.println(this.textFilial);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		limpiar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		WebElement opcEmpresa = driver
				.findElement(By.xpath("//li[text()=\""+ this.textEmpresa + "\"]"));

		opcEmpresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tq1 == true) {

			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"SP\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
		

		}else if (tc2==true ) {
			
			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"RJ\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);

		
		}else {
			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"SP\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			
		}
		
		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement opcfilial = driver
				.findElement(By.xpath("//li[text()=\"0001\"]"));

		opcfilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textEmpresa = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+rows+"\"]/div[3]/div")).getText();

		System.out.println(this.textEmpresa);

//		Boolean existeElemento = true;
		Boolean sucesso= true;
//		if(existeElemento = driver.findElements(By.id(textEmpresa)).size() != 0){
		if(textEmpresa != ""){
			  System.out.println("Existe elemento");
			  sucesso= true;
		}else{//0, elemento no esta presente.
			   System.out.println("Elemento no existe");
			   sucesso= false;
		}
		System.out.println(sucesso);
		return sucesso;

	}

}
