package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracoesExecutarPO  extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[3]/span/span")
	public WebElement artiquivos;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement raizArtiquivos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement aba;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement raizAba;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosAbansados;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement idFiltro;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement opcEstado;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Subperiodo\"]")
	public WebElement subPeriodo1;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]")
	public WebElement atras;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[3]/div[8]")
	public WebElement J2016;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]")
	public WebElement enero;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/div/div[1]/span")
	public WebElement m;
	
	@FindBy(xpath = "//div[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
	public WebElement cheke;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executar1;
	
	@FindBy(xpath = "//div[@class=\"digitalFile-wrapper\"]/div/ul/li/span")
	public WebElement dato;
	
	@FindBy(xpath = "//span[text()=\"Exportar\"]")
	public WebElement exportar;
	
	@FindBy(xpath = "//button[text()=\"Exportar\"]")
	public WebElement btnExportar;
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/ul/li[2]/button")
	public WebElement flecha;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Dados\"]")
	public WebElement btnVisualizarDatos;
	
	@FindBy(xpath = "//div[@class=\"tr-content\"]/div/div")
	public WebElement campoEstatico;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]/div/div/div[2]")
	public WebElement visualizarDatos;
	
	@FindBy(xpath = "//div[@class=\"field-element campoEstatico1_0_0\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement campoEstatico1;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public ConfiguracoesExecutarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Executar() {

		artiquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		raizArtiquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println( " Ultimo Id de Lista :" + idUltimo);	
		
		
		aba.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		raizAba.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		/*filtrosAbansados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);*/

		idFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		String idRegistro =  idObter2();
		
		System.out.println(" Id Registro Busqueda :" + idRegistro  );
		
		idFiltro.sendKeys(idRegistro);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idFiltro.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String nombreE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[6]/div")).getText();
		System.out.println("Nome :" +  nombreE );	
		
		String empresaE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[9]/div")).getText();
		System.out.println("Empresa :" +  empresaE );	
		
		String ufE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[10]/div")).getText();
		System.out.println("Uf :" +  ufE );	
		
		String filialE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[11]/div")).getText();
		System.out.println("Filial :" +  filialE );	
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		executar.click();
		sleep(3000);
		sleep(9000);
		
		estado.click();
		sleep(3000);
	
		opcEstado.click();
		sleep(3000);

		closeSelectTypeCheckbox(estado);
	
		
		subPeriodo.click();
		sleep(3000);
		
		atras.click();
		sleep(3000);
		
		J2016.click();
		sleep(3000);
		
		enero.click();
		sleep(3000);
		
		m.click();
		sleep(3000);
		sleep(3000);
		
		String subperiodoE = subPeriodo1.getAttribute("value");
		System.out.println(subperiodoE);
		
		cheke.click();
		sleep(3000);
		sleep(6000);
		
		executar1.click();
		waitExpectElement(dato);
		sleep(25000);
		sleep(9000);
		sleep(12000);
		sleep(12000);
		sleep(12000);
		sleep(12000);
		String valorTC = "1000";
		String nuevoTexto = dato.getText();
		
		boolean sucesso = nuevoTexto.equals(valorTC);
		System.out.println(nuevoTexto);
		System.out.println(sucesso + " Dato ejecutado Igual al Presentado");
		sleep(9000);
		sleep(3000);
		
		exportar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExportar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!btnVisualizarDatos.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		
		btnVisualizarDatos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto1 = campoEstatico.getText();
		System.out.println(nuevoTexto1);
		
		boolean sucesso1 = nuevoTexto1.equals(valorTC);
		System.out.println(sucesso1 + " Dato campo estatico igual al dato TC");
		sleep(9000);
		sleep(3000);
		
		visualizarDatos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		String nuevoTexto2 = campoEstatico1.getAttribute("value");
//		System.out.println(nuevoTexto2);
//		
//		boolean sucesso2 = nuevoTexto2.equals(valorTC);
//		System.out.println(sucesso2 + " Dato campo estatico igual al dato TC");
//		sleep(9000);
//		sleep(3000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		artiquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		raizArtiquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String idUltimo1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[5]/div")).getText();
		System.out.println(idUltimo1 + " Ultimo Id de Lista");	
		
		String nombre = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[7]/div")).getText();
		System.out.println("Nome :" +  nombre );
		
		String empresa = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[10]/div")).getText();
		System.out.println("Empresa :" +  empresa );	
		
		String uf = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[11]/div")).getText();
		System.out.println("Uf :" +  uf );	
		
		String filial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[12]/div")).getText();
		System.out.println("Filial :" +  filial );	
		
		String M = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[15]/div")).getText();
		System.out.println("Periodo :" +  M );	
		
		sleep(2000);
		
		int idD = Integer.valueOf(idUltimo);
		int id2D = Integer.valueOf(idUltimo1);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso3 = false;
		if (idD < id2D) {
			sucesso3 = true;
		}
		
		
		System.out.println(sucesso3 + " ultimo Id de la lista mayor que anterior Guardado ");
		sleep(2000);
		
		System.out.println("-----------------");
		
		ArrayList<Boolean> sucesso4  = new ArrayList<Boolean>();
		sucesso4.add(nombre.contains(nombreE));
		sucesso4.add(subperiodoE.contains(M));
		sucesso4.add(empresaE.equals(empresa));
		sucesso4.add(ufE.equals(uf));
		sucesso4.add(filialE.equals(filial));
		System.out.println(sucesso4 + " Datos enviados igual a executados ");
		
		return sucesso4;
	}
}
