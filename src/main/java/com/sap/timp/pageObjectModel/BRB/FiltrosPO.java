package com.sap.timp.pageObjectModel.BRB;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class FiltrosPO  extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[2]/button")
	public WebElement filtros;
	
	@FindBy(xpath = "//*[@id=\"add-filter-btn\"]/button")
	public WebElement adicionar;
	
	@FindBy(xpath = "//*[@id=\"field-select-container\"]/div/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div[2]/div[4]/div/div/input")
	public WebElement empresaV;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/input")
	public WebElement ufFilial;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/button")
	public WebElement candadoUF;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/input")
	public WebElement filial;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[3]/div[1]/div[2]/div[1]/button")
	public WebElement candadoF;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[1]/div[1]/div/div[1]/input")
	public WebElement data;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[2]/div[1]/button")
	public WebElement candadoD;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/button")
	public WebElement mover;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[2]/div[2]/div/div[1]/div[2]")
	public WebElement opcion1;
	@FindBy(xpath = "/html/body/ul/li[16]")
	public WebElement seleccion1;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[2]/button")
	public WebElement condicion;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[3]/div[2]/div/div[1]/div[2]")
	public WebElement opcion2;
	@FindBy(xpath = "/html/body/ul/li[15]")
	public WebElement seleccion2;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]/div/div/div/span")
	public WebElement filtroE;
	@FindBy(xpath = "//*[@id=\"draggable-193\"]/div/div/div/span")
	public WebElement filtroU;
	@FindBy(xpath = "//*[@id=\"draggable-30\"]/div/div/div/span")
	public WebElement filtroF;
	@FindBy(xpath = "//*[@id=\"draggable-21\"]/div/div/div/span")
	public WebElement filtroD;
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execuçao;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div/ul/li[4]/button")
	public WebElement configuracion;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/div[4]/div/div/input")
	public WebElement uf;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[4]/div[2]/div[4]/div/div/input")
	public WebElement fi;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[5]/div[2]/div[4]/div/div/span[contains(@class,\"icon-calendar\")]")
	public WebElement d1;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"title\")][1]")
	public WebElement d1t;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"icon-leftmenu\")]")
	public WebElement paginaAnterior;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"year\")][text()=\"2016\"]")
	public WebElement ano2016;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"month\")][text()=\"Jan\"]")
	public WebElement jan;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"date\")][text()=\"1\"][1]")
	public WebElement fec1;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[5]/div[3]/div[4]/div/div/span[contains(@class,\"icon-calendar\")]")
	public WebElement d2;
	@FindBy(xpath = "//div[@tabindex=\"0\"][contains(@class,\"date weekend\")][text()=\"31\"]")
	public WebElement fec2;
	@FindBy(xpath = "//*[@id=\"settings-execute\"]/button")
	public WebElement exec;
	@FindBy(xpath = "//*[@id=\"table-data-wrapper\"]")
	public WebElement tabla;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[4]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	public WebElement nao1;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement executar;
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button")
	public WebElement editor;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/div/div/input")
	public WebElement ufValor;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[3]/div[1]/div[2]/div[4]/div/div/input")
	public WebElement fValor;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[2]/div[4]/div/div[1]/input")
	public WebElement mayor;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div/div/div[4]/div[1]/div[3]/div[4]/div/div[1]/input")
	public WebElement menor;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[text()=\"Relatórios\"]")
	public WebElement relatorios;
		
	@FindBy(xpath = "//div[@id=\"settings-close\"]/button")
	public WebElement fechar;
	
	public FiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void establecerValores() {
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2")) {
			amb = true;
		}else {
			amb =false;
		}
		
		
		
		sleep(2000);
		editor.click();
	//	waitExpectElement(nao1);
		sleep(1000);
	//	nao1.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		filtros.click();
		
		
		
		
		candadoUF.click();
		if (amb == false) {
			ufValor.sendKeys("SP");
		}else {
			ufValor.sendKeys("BA");
		}
		
		sleep(1000);
		
		candadoF.click();
		if (amb== false) {
			fValor.sendKeys("0001");
		}else {
			sleep(1000);
			fValor.sendKeys("0143");
		}
		
		sleep(1000);
		
		candadoD.click();
		
		if (amb == false) {
			mayor.sendKeys("01/01/2016");
			menor.sendKeys("31/01/2016");
		}else {
			mayor.sendKeys("01/01/2016");
			menor.sendKeys("31/01/2016");
		}
		
		
		aplicar.click();
		
		gravar.click();		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
	
				
	}
	
	
	
	public boolean AsignarFiltros() {
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2")) {
			amb = true;
		}else {
			amb =false;
		}
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		


		menu.click();
		sleep(1000);
		opcao.click();

		
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");		
		sleep(1000);
		
		filtros.click();	
		sleep(1000);
		
		adicionar.click();
		
		empresa.sendKeys("Empresa");
		empresa.sendKeys(Keys.ENTER);
		if (amb==false) {
			empresaV.sendKeys("1000");
			
		}else {
			empresaV.sendKeys("1000");
		}
		
		
		adicionar.click();
		
		ufFilial.sendKeys("UF da Filial");
		ufFilial.sendKeys(Keys.ENTER);
		candadoUF.click();
		
		adicionar.click();

		filial.sendKeys("Filial");
		filial.sendKeys(Keys.ENTER);
		candadoF.click();
		
		adicionar.click();
		
		data.sendKeys("Data lançamento doc. fiscal");
		data.sendKeys(Keys.ENTER);
		candadoD.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", mover);
		
		sleep(2000);
		
		opcion1.click();
		sleep(1000);
		seleccion1.click();
		
		condicion.click();
		
		js.executeScript("arguments[0].scrollIntoView();", mover);

		opcion2.click();
		seleccion2.click();
		
		aplicar.click();
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");	
		
		boolean mostrados = false;
		
		if (filtroE.isDisplayed() == true && filtroU.isDisplayed() == true &&filtroF.isDisplayed() && filtroD.isDisplayed()==true) {
			mostrados =true;
		}

		return mostrados;
	
		
	}
	
	public void aplicarEditor() {
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2")) {
			amb = true;
		}else {
			amb =false;
		}
		
		
		sleep(1000);
		
		execuçao.click();
		
		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		
		
		configuracion.click();
		sleep(3000);
		
		if (amb==false) {
			uf.sendKeys("SP");
			fi.sendKeys("0001");
			d1.sendKeys("01/01/2014");
			d2.sendKeys("31/01/2014");
		}else {
			uf.sendKeys("BA");
			sleep(1000);
			fi.sendKeys("0143");
		
			d1.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			paginaAnterior.click();
			sleep(2000);
			
			ano2016.click();
			sleep(2000);
			
			jan.click();
			sleep(2000);
			
			fec1.click();
			sleep(2000);
			
			
			d2.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			d1t.click();
			sleep(3000);
			
			paginaAnterior.click();
			sleep(3000);
			
			ano2016.click();
			sleep(2000);
			
			jan.click();
			sleep(2000);
			
			fec2.click();
			sleep(2000);
		}
		
		
		exec.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int fecharR = rows("//div[@class=\"overlap-right executor visible\"]");
		
		if (fecharR > 0) {
			fechar.click();
		}

	}
	
	public void aplicarBiblioteca() {
		
		sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2")) {
			amb = true;
		}else {
			amb =false;
		}
		
		
		biblioteca.click();
	//	waitExpectElement(nao1);
		sleep(1000);
	//	nao1.click();
		
		
		
		
		invisibilityOfElementOverlay();
		
		relatorios.click();


		invisibilityOfElementOverlay();
		
		
		menu.click();
		sleep(000);
		executar.click();	
		

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		sleep(2000);
		configuracion.click();
		sleep(1000);
		
		if (amb==false) {
			uf.sendKeys("SP");
			fi.sendKeys("0001");
			d1.sendKeys("01/01/2014");
			d2.sendKeys("31/01/2014");
		}else {
			uf.sendKeys("BA");
			sleep(1000);
			fi.sendKeys("0143");
			d1.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			paginaAnterior.click();
			sleep(2000);
			
			ano2016.click();
			sleep(2000);
			
			jan.click();
			sleep(2000);
			
			fec1.click();
			sleep(2000);
			
			
			d2.click();
			sleep(2000);
			
			d1t.click();
			sleep(2000);
			
			d1t.click();
			sleep(3000);
			
			paginaAnterior.click();
			sleep(3000);
			
			ano2016.click();
			sleep(2000);
			
			jan.click();
			sleep(2000);
			
			fec2.click();
			sleep(2000);
		}
		
		exec.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		int fecharR = rows("//div[@class=\"overlap-right executor visible\"]");

		if (fecharR > 0) {
			fechar.click();
		}

	}
	
	
	
	
	
	public List<String> empresa() {
		
		List<String> data = new ArrayList<String>();
		
		int rows = tabla.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();
		
		for (int i =1 ; i <= rows; i++) {
			
			String empresai = (driver.findElement(By.xpath("//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"28\" and contains(@aria-label, \"Linha: "+i+"\")]/div[contains(@style,\"text-overflow\")]")).getText());
			data.add(empresai);
		}
		
		return data;
		
	}
	
	public List<String> ufFilial() {

		List<String> data = new ArrayList<String>();

		int rows = tabla.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]"))
				.size();

		for (int i = 1; i <= rows; i++) {

			String ufFiliali = (driver.findElement(By.xpath(
					"//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"193\" and contains(@aria-label, \"Linha: "
							+ i + "\")]/div[contains(@style,\"text-overflow\")]"))
					.getText());
			data.add(ufFiliali);
		}

		return data;

	}
	
	public List<String> filial() {

		List<String> data = new ArrayList<String>();

		int rows = tabla.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();

		for (int i = 1; i <= rows; i++) {

			String filiali = (driver.findElement(By.xpath("//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"30\" and contains(@aria-label, \"Linha: "+i+"\")]/div[contains(@style,\"text-overflow\")]")).getText());
			data.add(filiali);
		}

		return data;

	}
	
	public List<Boolean> data() {
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2")) {
			amb = true;
		}else {
			amb =false;
		}

		List<Boolean> data = new ArrayList<Boolean>();

		int rows = tabla.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();

		for (int i = 1; i <= rows; i++) {

			String datal = (driver.findElement(By.xpath("//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"21\" and contains(@aria-label, \"Linha: "+i+"\")]/div[contains(@style,\"text-overflow\")]")).getText());
			
			try {
				String mayorString = "01/01/2016";
				String menorString = "31/01/2014";
				
				if (amb== false) {
					mayorString = "01/01/2014";
					menorString = "31/01/2014";
				}else {
					mayorString = "01/01/2016";
					menorString = "31/01/2016";
				}
				
				
				Date date= new SimpleDateFormat("dd/MM/yyyy").parse(datal);

				Date mayorDate = new SimpleDateFormat("dd/MM/yyy").parse(mayorString);
				Date menorDate = new SimpleDateFormat("dd/MM/yyy").parse(menorString);
				
				boolean fechaValida = false;
				
				if (date.after(mayorDate) || date.before(menorDate)){
					
				  	fechaValida = true;
				}
				
				data.add(fechaValida);
				
			} catch (Exception ex) {
				System.out.println(ex);
			}			

		}

		return data;

	}
	

	
	

}
