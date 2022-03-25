package com.sap.timp.pageObjectModel.DFG.SPED.ECF;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;



public class ECFFuncionalidadesPO extends TestBaseMassiel{

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[4]/span/span")
	public WebElement sped;

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[4]/div/span[2]")
	public WebElement ECF;

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement eCF;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[4]/ul/li[2]/div/span[2]")
	public WebElement blocos;

	@FindBy(xpath = "//span[text()=\"Novo ECF\"]")
	public WebElement nuevo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do ECF\"]")
	public WebElement nombre;

	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do ECF\"]")
	public WebElement descripcion;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[5]/div[2]/div/div[2]")
	public WebElement leiaute;

	@FindBy(xpath = "//li[@id=\"7562\"]")
	public WebElement leiauteOPC;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[6]/div[2]/div/div/div[2]")
	public WebElement versao;

	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoOPC;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[7]/div[2]/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoOPC;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[8]/div[2]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[text()=\"1000\"]")
	public WebElement empresaOPC;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[9]/div/div/div/div[2]")
	public WebElement uF;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement fecha;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement salvar;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement editar1;

	@FindBy(xpath = "//div[@id=\"detail-name\"]/div")
	public WebElement nombreI;

	@FindBy(xpath = "//div[@class=\"detail-content\"]/div[2]/div[1]/div[2]")
	public WebElement descripcionI;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[3]/div[2]/div/div/input")
	public WebElement nombreV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[4]/div[2]/div/textarea")
	public WebElement descripcionV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[5]/div[2]/div/div[1]/input")
	public WebElement leiauteV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[6]/div[2]/div/div/div[1]/input")
	public WebElement versaoLeiuteV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[7]/div[2]/div/div[1]/input")
	public WebElement tributoV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[8]/div[2]/div/div[1]/div/div[1]")
	public WebElement empresaV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[9]/div[2]/div/div[1]/div/div[1]")
	public WebElement ufV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div[2]/div/div[1]/div/div[1]")
	public WebElement filialV;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[12]/div[2]/div/div[1]/input")
	public WebElement fechaV;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement fecharV;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	public WebElement fecharE;

	String nomeInformacaoE ="";
	String DescripcionInformacaoE="";

	String DescripcionEditarE="";
	String NombreVisualizarE = "";
	String DescripcionVisualizarE = "";
	String LeiauteVisualizarE = "";
	String VersaoVisualizarE = "";
	String TributoVisualizarE = "";
	String EmpresaVisualizarE = "";
	String UFVisualizarE = "";
	String FilialVisualizarE = "";
	String DataVisualizarE = "";
	String SubperiodoE = "";

	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement estado;

	@FindBy(xpath = "//div[text()=\"SP\"]")
	public WebElement estadoOPC;

	@FindBy(xpath = "//*[@id=\"subPeriodPic\"]/div/div[1]/span")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div[1]/input")
	public WebElement subPeri;

	@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]")
	public WebElement flecha;

	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[3]/div[8]")
	public WebElement anio;

	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]")
	public WebElement mes;

	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/div/div[1]/span")
	public WebElement dia;

	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
	public WebElement centralizacao;

	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executar;

	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[4]/button/span[2]")
	public WebElement actualizar;

	@FindBy(xpath = "//*[@id=\"toolbarTop\"]/div/div/ul/li[2]/button/span[2]")
	public WebElement gravar;

	@FindBy(xpath = "//*[@id=\"toolbarTop\"]/div/div/ul/li[3]/button/span[2]")
	public WebElement visualizarAN3;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Arquivo\"]")
	public WebElement nomeAN3;

	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/table/tbody/tr[3]/td[2]/div/div/div[1]/div[2]")
	public WebElement regras;

	@FindBy(xpath = "//div[text()=\"ID2333-ECF - TA - NÃO MEXER\"]")
	public WebElement regrasOPC;

	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[2]")
	public WebElement criar;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	String  momento = " ";
	
	@FindBy(xpath = "//div[@id=\"create-file-dialog\"]/div[5]/div[2]/div/div[2]")
	public WebElement tributoExecutar;

	String momento1 = "";
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[6]")
	public WebElement siguiente1;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharVA;
	
	
	//------- ultimos 
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]/div/div[1]")
	public WebElement raizArquivos;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\")][1]")
	public WebElement primera;
	
	
	public ECFFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}

	public void iD() {

		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ECF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idECF = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação (ECF): " +idECF);
		idInserir1(idECF);

		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		int rows1 = rows("//div[@class=\"tr\" and @data-id]");

		String idBlocos = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows1+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação (Bloncos): " + idBlocos);

		idInserir2(idBlocos);
	}

	public boolean Criar() {

		System.out.println("---------- Criar --------- " );
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


		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nuevo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.sendKeys("Test");
		nombre.sendKeys(Keys.ENTER);

		descripcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		descripcion.sendKeys("12345");
		descripcion.sendKeys(Keys.ENTER);

		leiaute.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tq1 == true) {


			WebElement leiauteOPC = driver.findElement(By.xpath("//li[@id=\"7562\"]"));


			leiauteOPC .click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement leiauteOPC = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));


			leiauteOPC .click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {
			WebElement leiauteOPC = driver.findElement(By.xpath("//li[@id=\"option-12\"]"));


			leiauteOPC .click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}


		versao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		versaoOPC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		if (tq1 == true) {

			actionsMoveToElementXpath("//*[@id=\"00\"]");
			sleep(3000);

			WebElement tributoOPC = driver.findElement(By.xpath("//*[@id=\"00\"]"));


			tributoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			actionsMoveToElementXpath("//li[@id=\"option-7\"]");
			sleep(3000);

			WebElement tributoOPC = driver.findElement(By.xpath("//li[@id=\"option-7\"]"));


			tributoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);


		}else {

			actionsMoveToElementXpath("//li[@id=\"option-17\"]");
			sleep(3000);

			WebElement tributoOPC = driver.findElement(By.xpath("//li[@id=\"option-17\"]"));


			tributoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);


		}


		empresa.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresaOPC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		closeSelectTypeCheckbox(empresa);


		uF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		if (tc2 == true) {

			WebElement ufOPC = driver.findElement(By.xpath("//div[text()=\"AL\"]"));


			ufOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(uF);


		}else  {


			WebElement ufOPC = driver.findElement(By.xpath("//div[text()=\"SP\"]"));


			ufOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(uF);
		}

		filial.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		if (tc2 == true) {

			WebElement filialOPC = driver.findElement(By.xpath("//div[text()=\"1000 - 0008\"]"));


			filialOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(filial);



		}else  {


			WebElement filialOPC = driver.findElement(By.xpath("//div[text()=\"1000 - 0001\"]"));


			filialOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(filial);
		}



		fecha.sendKeys("01/01/2013");
		fecha.sendKeys(Keys.ENTER);

		closeSelectTypeCheckbox(fecha);


		salvar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		

		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idECF =idObter1();
		System.out.println("Id Antes da Criação (ECF): " +idECF);
		
		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id n da Criação (ECF): " +idNuevo);
		idInserir3(idNuevo);



		int idD = Integer.valueOf(idECF);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);

		return sucesso;
	}

	public boolean Editar() {

		System.out.println("---------- Editar --------- " );
		String idRegistro =idObter3();
		
		System.out.println("Registro a Editar " +idRegistro);
		
		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(4000);
		sleep(4000);

		String valor = descripcion.getAttribute("value");
		//System.out.println("valor actual: "+ valor);
		String enviar = "Massiel";

		sleep(1000);
		descripcion.clear();

		sleep(1000);
		descripcion.sendKeys(enviar);

		editar1.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar2.click();
		sleep(2000);
		attributoNotToBeEmptyElement(descripcion, "value");
		sleep(2000);

		this.DescripcionEditarE = descripcion.getAttribute("value");
		idInserir2(this.DescripcionEditarE);
		System.out.println(" Texto Actual: " + valor);
		System.out.println(" Texto nuevo: " + this.DescripcionEditarE);
		boolean sucesso = this.DescripcionEditarE.equals(enviar);
		System.out.println(sucesso);

		fecharE.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		return sucesso;
	}

	public ArrayList<Boolean> Informacao() {

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Informacao --------- " );
		String idRegistro =idObter3();

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement informação = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		informação.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		this.nomeInformacaoE = nombreI.getText();
		this.DescripcionInformacaoE = descripcionI.getText();

		System.out.println("Nome " + this.nomeInformacaoE);
		System.out.println("Descrição " + this.DescripcionInformacaoE );


		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);

		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		String NombreV = nombreV.getAttribute("value");
		String DescripcionV = descripcionV.getAttribute("value");

		System.out.println("Nome :" + NombreV);
		System.out.println("Descrição :" + DescripcionV);
		sleep(2000);

		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(this.nomeInformacaoE.equals(NombreV));
		sucesso.add(DescripcionV.contains(this.DescripcionInformacaoE));

		System.out.println(sucesso);
		return sucesso;

	}

	public ArrayList<Boolean> Visualizar() {

		System.out.println("---------- visualizar --------- " );

		this.NombreVisualizarE = nombreV.getAttribute("value");
		this.DescripcionVisualizarE = descripcionV.getAttribute("value");
		this.LeiauteVisualizarE = leiauteV.getAttribute("value");
		this.VersaoVisualizarE  = versaoLeiuteV.getAttribute("value");
		this.TributoVisualizarE = tributoV.getAttribute("value");
		this.EmpresaVisualizarE = empresaV.getText();
		this.UFVisualizarE = ufV.getText();
		this.FilialVisualizarE= filialV.getText();
		this.DataVisualizarE = fechaV.getAttribute("value");

		System.out.println("Nome: " + this.NombreVisualizarE);
		System.out.println("Descrição: " + this.DescripcionVisualizarE);
		System.out.println("Leiaute: " + this.LeiauteVisualizarE);
		System.out.println("Versão Leiaute: " + this.VersaoVisualizarE);
		System.out.println("Tributo: " + this.TributoVisualizarE);
		System.out.println("Empresa: " + this.EmpresaVisualizarE);
		System.out.println("UF: " + this.UFVisualizarE);
		System.out.println("Filial: " + this.FilialVisualizarE);
		System.out.println("Data de Inicio de Vigência : " + this.DataVisualizarE );

		sleep(2000);

		fecharV.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		eCF.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter3();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- --------- " );

		String NombreE = nombreV.getAttribute("value");
		String DescripcionE = descripcionV.getAttribute("value");
		String LeiauteE = leiauteV.getAttribute("value");
		String VersaoE = versaoLeiuteV.getAttribute("value");
		String TributoE = tributoV.getAttribute("value");
		String EmpresaE = empresaV.getText();
		String UFE = ufV.getText();
		String FilialE = filialV.getText();
		String DataE = fechaV.getAttribute("value");

		System.out.println("Nome: " + NombreE);
		System.out.println("Descrição: " + DescripcionE);
		System.out.println("Leiaute: " + LeiauteE);
		System.out.println("Versão Leiaute: " + VersaoE);
		System.out.println("Tributo: " + TributoE);
		System.out.println("Empresa: " + EmpresaE);
		System.out.println("UF: " + UFE);
		System.out.println("Filial: " + FilialE);
		System.out.println("Data de Inicio de Vigência : " + DataE);


		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(NombreE.equals(this.NombreVisualizarE));
		sucesso.add(DescripcionE.contains(this.DescripcionVisualizarE));
		sucesso.add(LeiauteE.contains(this.LeiauteVisualizarE));
		sucesso.add(VersaoE.contains(this.VersaoVisualizarE));
		sucesso.add(TributoE.contains(this.TributoVisualizarE));
		sucesso.add(EmpresaE.contains(this.EmpresaVisualizarE));
		sucesso.add(UFE.contains(this.UFVisualizarE));
		sucesso.add(FilialE.contains(this.FilialVisualizarE));
		sucesso.add(DataE.contains(this.DataVisualizarE));

		fecharE.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println(sucesso);
		return sucesso;
	}

	public ArrayList<Boolean>  CriarBlocos() {
		System.out.println("---------- CriarBlocos --------- " );


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String textIDE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[3]/div"))
				.getText();

		idInserir4(textIDE);
		System.out.println(textIDE);

		String textNombreE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[4]/div"))
				.getText();

		System.out.println(textNombreE);


		String textDescripcionE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[5]/div"))
				.getText();

		System.out.println(textDescripcionE);

		String textTipoE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[6]/div"))
				.getText();

		System.out.println(textTipoE);


		String textEmpresaE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[10]/div"))
				.getText();

		System.out.println(textEmpresaE);

		String textTributoE = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[11]/div"))
				.getText();

		System.out.println( textTributoE);

		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		//	String idblocos = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/div")).getText();

		System.out.println("---------------------- " );
		String textNombreB = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[4]/div"))
				.getText();

		System.out.println(textNombreB);


		String textDescripcionB = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[5]/div"))
				.getText();

		System.out.println(textDescripcionB);

		String textTipoB = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[6]/div"))
				.getText();

		System.out.println(textTipoB);


		String textEmpresaB = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[10]/div"))
				.getText();

		System.out.println(textEmpresaB);

		String textTributoB = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[11]/div"))
				.getText();

		System.out.println( textTributoB);


		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(textNombreB.equals(textNombreE));
		sucesso.add(textDescripcionB .contains(textDescripcionE));
		sucesso.add(textTipoB.contains(textTipoE));
		sucesso.add(textEmpresaB.contains(textEmpresaE));
		sucesso.add(textTributoB.contains(textTributoE));

		System.out.println(sucesso);
		return sucesso;
	}

	public ArrayList<Boolean> EditarBloco() {

		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Editar Bloco --------- " );

		System.out.println("valor editado en ECF :" + this.DescripcionEditarE);

		String idRegistro =idObter4();

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar2.click();
		sleep(2000);
		attributoNotToBeEmptyElement(descripcion, "value");
		sleep(2000);

		String valor = descripcion.getAttribute("value");
		System.out.println("valor en Blocos: " + valor);

		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(valor .equals(this.DescripcionEditarE));

		fecharE.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		System.out.println(sucesso);
		return sucesso;

	}

	public ArrayList<Boolean> InformacaoBloco() {

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Informacao Bloco --------- " );
		String idRegistro =idObter4();

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement informação = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		informação.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("Datos de Blocos ");
		String nomeB = nombreI.getText();
		String DescripcionB = descripcionI.getText();

		System.out.println("-- Datos de Blocos --");
		System.out.println("Nome " + nomeB);
		System.out.println("Descrição " + DescripcionB );

		System.out.println(" -- Datos de ECF --");
		System.out.println("Nome " + this.nomeInformacaoE);
		System.out.println("Descrição " + this.DescripcionInformacaoE );

		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomeB .equals(this.nomeInformacaoE));
		sucesso.add(DescripcionB.equals(this.DescripcionInformacaoE));

		System.out.println(sucesso);

		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		return sucesso;

	}

	public ArrayList<Boolean> VisualizarBloco() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Visualizar Bloco --------- " );
		String idRegistro =idObter4();

		System.out.println("Nome: " + this.NombreVisualizarE);
		System.out.println("Descrição: " + this.DescripcionVisualizarE);
		System.out.println("Leiaute: " + this.LeiauteVisualizarE);
		System.out.println("Versão Leiaute: " + this.VersaoVisualizarE);
		System.out.println("Tributo: " + this.TributoVisualizarE);
		System.out.println("Empresa: " + this.EmpresaVisualizarE);
		System.out.println("UF: " + this.UFVisualizarE);
		System.out.println("Filial: " + this.FilialVisualizarE);
		System.out.println("Data de Inicio de Vigência : " + this.DataVisualizarE );

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String NombreV = nombreV.getAttribute("value");
		String DescripcionV = descripcionV.getAttribute("value");
		String LeiauteV = leiauteV.getAttribute("value");
		String VersaoV = versaoLeiuteV.getAttribute("value");
		String TributoV = tributoV.getAttribute("value");
		String EmpresaV = empresaV.getText();
		String UFV = ufV.getText();
		String FilialV = filialV.getText();
		String DataV = fechaV.getAttribute("value");

		System.out.println("-----------");
		System.out.println("Nome: " + NombreV);
		System.out.println("Descrição: " + DescripcionV);
		System.out.println("Leiaute: " + LeiauteV);
		System.out.println("Versão Leiaute: " + VersaoV);
		System.out.println("Tributo: " + TributoV);
		System.out.println("Empresa: " + EmpresaV);
		System.out.println("UF: " + UFV);
		System.out.println("Filial: " + FilialV);
		System.out.println("Data de Inicio de Vigência : " + DataV);


		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(NombreV.equals(this.NombreVisualizarE));
		sucesso.add(DescripcionV.contains(this.DescripcionVisualizarE));
		sucesso.add(LeiauteV.contains(this.LeiauteVisualizarE));
		sucesso.add(VersaoV.contains(this.VersaoVisualizarE));
		sucesso.add(TributoV.contains(this.TributoVisualizarE));
		sucesso.add(EmpresaV.contains(this.EmpresaVisualizarE));
		sucesso.add(UFV.contains(this.UFVisualizarE));
		sucesso.add(FilialV.contains(this.FilialVisualizarE));
		sucesso.add(DataV.contains(this.DataVisualizarE));

		fecharV.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println(sucesso);
		return sucesso;

	}

	public void ExecutarBloco() {


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

		blocos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		primera.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Executar Bloco --------- " );
		String idRegistro =idObter4();

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		executar1 .click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		if (tq1 == true) {


			WebElement estadoOPC = driver.findElement(By.xpath("//div[text()=\"SP\"]"));


			estadoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(estado);

		}else if (tc2==true) {

			WebElement estadoOPC = driver.findElement(By.xpath("//div[text()=\"AL\"]"));


			estadoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(estado);
		}else {
			WebElement estadoOPC = driver.findElement(By.xpath("//div[text()=\"SP\"]"));


			estadoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(estado);

		}

		//------------------- Tributo------------------
		
		if (tc2==true) {
			tributoExecutar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			actionsMoveToElementXpath("//li[text()=\"ICMS\"]");
			sleep(3000);
			
			WebElement tributoOPC = driver.findElement(By.xpath("//li[text()=\"ICMS\"]"));
			
			tributoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else if (tp1==true) {
			tributoExecutar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			actionsMoveToElementXpath("//li[text()=\"ICMS\"]");
			sleep(3000);
			
			WebElement tributoOPC = driver.findElement(By.xpath("//li[text()=\"ICMS\"]"));
			
			tributoOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}

		calendar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		flecha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		anio.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		mes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		this.SubperiodoE = subPeri.getAttribute("value");
		System.out.println("Fecha  de SubPeriodo" + this.SubperiodoE);
		
		centralizacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		sleep(12000);
		sleep(12000);

		actualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	}

	public void visualizarAN3() {
		
		
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



		System.out.println("----------visualizar AN3 --------- " );

		visualizarAN3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		nomeAN3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		nomeAN3.sendKeys("TestMassiel");
		nomeAN3.sendKeys(Keys.ENTER);

		regras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		if (tq1 == true) {


			WebElement regrasOPC = driver.findElement(By.xpath("//div[text()=\"ID2333-ECF - TA - NÃO MEXER\"]"));


			regrasOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(regras);

		}else if (tc2==true) {

			WebElement regrasOPC = driver.findElement(By.xpath("//div[text()=\"ID1227-ECF - TA - NÃO MEXER\"]"));


			regrasOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(regras);
			
		}else {
			WebElement regrasOPC = driver.findElement(By.xpath("//div[text()=\"ID1043-ECF - TA - NÃO MEXER\"]"));


			regrasOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			closeSelectTypeCheckbox(regras);

		}


		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		Date  hoy = new Date();
		this.momento = hoy.getHours() + ":" + hoy.getMinutes();
		//this.momento = fechaActual();
		
		this.momento = this.momento.replace("0","");

		System.out.println("hora Actual " + this.momento );
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
	}
	
	public ArrayList<Boolean> VisualizarAtualizações() {
		
		System.out.println("---------- Visualizar Atualizações --------- " );

		String idRegistro =idObter4();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizarA = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar Atualizações\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		visualizarA.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dia1;
		String mes1;
		String anio1;
		
		Calendar c = Calendar.getInstance();
	    dia1 = Integer.toString(c.get(Calendar.DATE));
		mes1 = Integer.toString(c.get(Calendar.MONTH)+1);
		anio1 = Integer.toString(c.get(Calendar.YEAR));
		
		String fecha = dia1 + "/" + mes1 + "/" + anio1;
		fecha = fecha.replace("0","");
		System.out.println(fecha);
		

		
		
		int rows = rows("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]");
		int f = 1;
		System.out.println("--------------------------Verificação Modificações Bloco Apuração----------------------------------------");
		for (int i = 0; i < rows; i++) {
		
			String dataMod = driver
					.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"][" + f + "]/div[10]/div"))
					.getText();
			dataMod = dataMod.replace("0","");
			System.out.println(dataMod);
			
			
			sucesso.add(dataMod.contains(fecha));
		}
		
		System.out.println(sucesso);
		
		fecharVA.click();
		sleep(3000);
		return sucesso;
	}
	

	public ArrayList<Boolean> gravar() {
		
		home.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"dragger-pagination-right\"]");
		sleep(1000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		arquivos.click();
		invisibilityOfElementOverlay();
		
		raizArquivos.click();
		invisibilityOfElementOverlay();

		siguiente.click();
		invisibilityOfElementOverlay();
		
		System.out.println("------------------------- Verficacão de arquivos-------------------------------");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = rows("//div[@data-id and @class=\"tr\"]");
		String nome = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[7]/div")).getText();
		String descricao = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[8]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[10]/div")).getText();
		String uf = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[11]/div")).getText();
		String filial = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[12]/div")).getText();
		String ano = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[13]/div")).getText();
		String mes = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[14]/div")).getText();
		String periodo = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[15]/div")).getText();
		
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(periodo);
		
		sucesso.add(nome.contains(this.NombreVisualizarE));
		sucesso.add(this.DescripcionVisualizarE.contains(descricao));
		sucesso.add(empresa.contains(this.EmpresaVisualizarE));
		sucesso.add(uf.contains(this.UFVisualizarE));
		sucesso.add(this.FilialVisualizarE.contains(filial));
		sucesso.add(this.SubperiodoE.contains(ano));
		sucesso.add(this.SubperiodoE.contains(periodo));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}


