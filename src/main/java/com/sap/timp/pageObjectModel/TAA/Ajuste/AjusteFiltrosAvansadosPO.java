package com.sap.timp.pageObjectModel.TAA.Ajuste;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AjusteFiltrosAvansadosPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	 
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;

	@FindBy(xpath = "//div[@id=\"codAdjustment\"]/div/div/div[2]")
	public WebElement CodAjuste;
	
	@FindBy(xpath = "//div[@id=\"status\"]/div/div/div[2]")
	public WebElement status;
	
	@FindBy(xpath = "//div[@id=\"modificationUser\"]/div/div[2]")
	public WebElement usuarioModificado;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"subPeriods\"]/div/div/div[2]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//div[@id=\"modificationDate\"]/div/div/div[2]")
	public WebElement dataModificado;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div[2]")
	public WebElement usuarioCreado;
	
	@FindBy(xpath = "//div[@id=\"codAdjustmentAssociation\"]/div/div/div[2]")
	public WebElement codigoAjusteAssociacion;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"creationDate\"]/div/div[1]/span[1]")
	public WebElement dataCreacion;
	
	
	String textCodigoAjuste = "";
	String textStatus = "";
	String textUsuarioModificado = "";
	String textEmpresa = "";
	String textSubPeriodo = "";
	String textDataModificado = "";
	String textUF = "";
	String textUsuarioCriado = "";
	String textCodigoAjusteAsso = "";
	String textFilial= "";
	String textDataCriado = "";
	
	public   AjusteFiltrosAvansadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void Filtros(){
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[1]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[15]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		String idRegistro = idObter("Ajuste");
		System.out.println(idRegistro );
		
		pesquisar.click();
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(8000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));

		this.textCodigoAjuste = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[5]/div"))
				.getText();
		System.out.println(this.textCodigoAjuste);
		
		this.textStatus = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[13]/div"))
				.getText();
		System.out.println(this.textStatus);
		
		this.textUsuarioModificado = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[17]/div"))
				.getText();
		System.out.println(this.textUsuarioModificado);
		
		this.textEmpresa = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[8]/div"))
				.getText();
		System.out.println(this.textEmpresa);
		
		this.textSubPeriodo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[14]/div"))
				.getText();
		System.out.println(this.textSubPeriodo);
		
		this.textDataModificado = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[18]/div"))
				.getText();
		System.out.println(this.textDataModificado);
		
		this.textUF = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[9]/div"))
				.getText();
		System.out.println(this. textUF);
		
		this.textUsuarioCriado = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[15]/div"))
				.getText();
		System.out.println(this. textUsuarioCriado);
		
		this.textCodigoAjusteAsso  = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[4]/div"))
				.getText();
		System.out.println(this. textCodigoAjusteAsso );
		
		this.textFilial  = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[10]/div"))
				.getText();
		System.out.println(this.textFilial );
		
		this.textDataCriado  = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[16]/div"))
				.getText();
		System.out.println(this.textDataCriado );
		
		
	}
	
	public ArrayList<Boolean> CodigoAjuste() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		CodAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textCodigoAjuste + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + " codigo de Ajuste");
			sucesso.add(this.textCodigoAjuste.equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> status() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textStatus + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[13]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + " status");
			sucesso.add(this.textStatus.equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> usuarioModificado() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioModificado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textUsuarioModificado + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[17]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + " usuario Modificado");
			sucesso.add(this.textUsuarioModificado.equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Empresa() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textEmpresa + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[8]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "empresa");
			sucesso.add( this.textEmpresa .equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> subPeriodo() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textSubPeriodo + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[14]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "Sub Periodo");
			sucesso.add( this.textSubPeriodo .equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
		
	public ArrayList<Boolean> dataModificado() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dataModificado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textDataModificado + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[18]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "Data Modificado");
			sucesso.add( this.textDataModificado .equals(textcodigoAjuste));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> UF() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textUF + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "uf");
			sucesso.add( this.textUF  .equals(textcodigoAjuste));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> usuarioCriado() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioCreado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textUsuarioCriado + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[15]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "usuario Creado ");
			sucesso.add( this.textUsuarioCriado  .equals(textcodigoAjuste));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
	public ArrayList<Boolean> codigoAjusteAssociacao() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigoAjusteAssociacion.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textCodigoAjusteAsso + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "Codigo Ajuste Asociacado ");
			sucesso.add( this.textCodigoAjusteAsso  .equals(textcodigoAjuste));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filial() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textFilial + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[10]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "filial ");
			sucesso.add( this.textFilial.equals(textcodigoAjuste));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> dataCriado() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dataCreacion.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ this.textDataCriado + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textcodigoAjuste = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[16]/div"))
					.getText();
			System.out.println( textcodigoAjuste  + "filial");
			sucesso.add( this.textDataCriado.equals(textcodigoAjuste));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
}
