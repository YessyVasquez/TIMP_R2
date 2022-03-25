package com.sap.timp.pageObjectModel.TFP.Periodos.Periodos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PeriodosAlterarPeriodosEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Períodos\"]")
	public WebElement periodos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-period\"]")
	public WebElement periodosMenu;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	
	@FindBy(xpath = "//body")
	public WebElement clickAfuera;
	
	//DATOS A FILTRAR
	//EMPRESA
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresa;
		
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"6000\"]/div/label/span")
		public WebElement opcEmpresaTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaTP1;
		
	//AÑO
		@FindBy(xpath = "//div[@id=\"year-f\"]/div/div/div[2]")
		public WebElement anio;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"2012\"]/div/label/span")
		public WebElement opcAnio;
	
	
	@FindBy(xpath = "//button/span[text()=\"Alterar status Período/Sub Período\"]")
	public WebElement alterarStatus;	
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div[2]")
	public WebElement selecAlterarStatus;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Período\"]")
	public WebElement opcSelecAlterarStatus;
	
	//DATOS A ALTERAR EN STATUS
	//EMPRESA
		@FindBy(xpath = "//tr[@class=\"company-wrapper\"]//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresaAS;
		
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"6000\"]/div/label/span")
		public WebElement opcEmpresaASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaASTP1;
	//ESTADO
		@FindBy(xpath = "//tr[@class=\"uf-wrapper\"]//div[@id=\"uf\"]/div/div/div[2]")
		public WebElement estadoAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement opcEstadoASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"RJ\"]/div/label/span")
		public WebElement opcEstadoASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement opcEstadoASTP1;
		
	//FILIAL
		@FindBy(xpath = "//tr[@class=\"branch-wrapper\"]//div[@id=\"branch\"]/div/div/div[2]")
		public WebElement filialAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0031\"]/div/label/span")
		public WebElement opcFilialASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0001\"]/div/label/span")
		public WebElement opcFilialASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0031\"]/div/label/span")
		public WebElement opcFilialASTP1;
		
	//ANIO
		@FindBy(xpath = "//tr[@class=\"year-wrapper\"]//div[@id=\"year\"]/div/div/div[2]")
		public WebElement anioAS;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"2012\"]/div/label/span")
		public WebElement opcAnioAS;
		
	//FILIAL
		@FindBy(xpath = "//tr[@class=\"month-wrapper\"]//div[@id=\"month\"]/div/div/div[2]")
		public WebElement mesAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"03\"]/div/label/span")
		public WebElement opcMesAS1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"04\"]/div/label/span")
		public WebElement opcMesAS2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"05\"]/div/label/span")
		public WebElement opcMesAS3;	
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[@class=\"items\"]/div[2]/div/div/label/span")
	public WebElement alterarStatusPara200Prefechamento;
	//div[contains(@class,"baseTabs-view -view-wrapper")]/div[@class="wrapper-element"]/div[@class="items"]/div[2]/div/div/label/span

	
	@FindBy(xpath = "//button[text()=\"Alterar status\"]")
	public WebElement alterarStatusBtn;
	
	@FindBy(xpath = "//div[@class=\"items\"]/div[1]/div/div/label/span")
	public WebElement alterarStatusPara100Alberto;
	
	public PeriodosAlterarPeriodosEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarPeriodoEmMassa() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		periodosMenu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEmpresaTQ1.click();
			sleep(1000);
			clickAfuera.click();
			sleep(1000);
		}else if (tc2 == true) {
			opcEmpresaTC2.click();
			sleep(1000);
			clickAfuera.click();
			sleep(1000);
		}else {
			opcEmpresaTP1.click();
			sleep(1000);
			clickAfuera.click();
			sleep(1000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		anio.click();
		sleep(1000);
		opcAnio.click();
		sleep(1000);
		clickAfuera.click();
		sleep(1000);
		
		
		String idFiltro1 = "";
		String idFiltro2 = "";
		if(tq1 == true) {
			idFiltro1 = "159418";
			sleep(2000);
			idFiltro2 = "159420";
			sleep(2000);
		}else if(tc2 == true) {
			idFiltro1  = "41095";
			sleep(2000);
			idFiltro2 = "41097";
			sleep(2000);
		}else {
			idFiltro1 = "36020";
			sleep(2000);
			idFiltro2 = "36022";
			sleep(2000);
		}
		
		sleep(2000);
		WebElement resultFiltrado1 = driver.findElement(By.xpath("//div[@data-id="+idFiltro1+"]/div[contains(@class,\"checkbox\")]/label/span"));
		WebElement resultFiltrado2 = driver.findElement(By.xpath("//div[@data-id="+idFiltro2+"]/div[contains(@class,\"checkbox\")]/label/span"));
		sleep(2000);
		
		resultFiltrado1.click();
		sleep(2000);
		resultFiltrado2.click();
		sleep(2000);
		
		
		alterarStatus.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		selecAlterarStatus.click();
		sleep(2000);
		opcSelecAlterarStatus.click();
		sleep(2000);
		
		empresaAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEmpresaASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEmpresaASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else {
			opcEmpresaASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}
		
		estadoAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEstadoASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEstadoASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else {
			opcEstadoASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}
		
		filialAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcFilialASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcFilialASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else {
			opcFilialASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}
		
		
		anioAS.click();
		sleep(2000);
		opcAnioAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		mesAS.click();
		sleep(2000);
			opcMesAS1.click();
			sleep(2000);
			opcMesAS2.click();
			sleep(2000);
			opcMesAS3.click();
			sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		alterarStatusPara200Prefechamento.click();
		sleep(2000);
		
		alterarStatusBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		System.out.println("----- Cod Status: 200 - Status: Prefamento -----");
		String codstatus1 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro1+")]/div[8]/div")).getText();
		System.out.println("Cod status 1: "+codstatus1);
		sleep(2000);
		
		String codstatus2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro2+")]/div[8]/div")).getText();
		System.out.println("Cod status 2: "+codstatus2);
		sleep(2000);
		
		String status1 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro1+")]/div[9]/div")).getText();
		System.out.println("Status 1: "+status1);
		sleep(2000);
		
		String status2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro2+")]/div[9]/div")).getText();
		System.out.println("Status 2: "+status2);
		sleep(2000);
		
		
		//VALIDACION
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(codstatus1.contains("200"));
			sucesso.add(status1.contains("Pré-Fechamento"));
			sucesso.add(codstatus2.contains("200"));
			sucesso.add(status2.contains("Pré-Fechamento"));
		
		
		sleep(2000);
		 resultFiltrado1 = driver.findElement(By.xpath("//div[@data-id="+idFiltro1+"]/div[contains(@class,\"checkbox\")]/label/span"));
		 resultFiltrado2 = driver.findElement(By.xpath("//div[@data-id="+idFiltro2+"]/div[contains(@class,\"checkbox\")]/label/span"));
		sleep(2000);
		
		resultFiltrado1.click();
		sleep(2000);
		resultFiltrado2.click();
		sleep(2000);
		
		
		alterarStatus.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		selecAlterarStatus.click();
		sleep(2000);
		opcSelecAlterarStatus.click();
		sleep(2000);
		
		empresaAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEmpresaASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEmpresaASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else {
			opcEmpresaASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}
		
		estadoAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEstadoASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEstadoASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else {
			opcEstadoASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}
		
		filialAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcFilialASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcFilialASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else {
			opcFilialASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}
		
		
		anioAS.click();
		sleep(2000);
		opcAnioAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		mesAS.click();
		sleep(2000);
			opcMesAS1.click();
			sleep(2000);
			opcMesAS2.click();
			sleep(2000);
			opcMesAS3.click();
			sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		alterarStatusPara100Alberto.click();
		sleep(2000);
		
		alterarStatusBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		System.out.println(" ");
		System.out.println("----- Cod Status: 100 - Status: Aberto -----");
		String codstatus11 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro1+")]/div[8]/div")).getText();
		System.out.println("Cod status 1: "+codstatus11);
		sleep(2000);
		
		String codstatus22 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro2+")]/div[8]/div")).getText();
		System.out.println("Cod status 2: "+codstatus22);
		sleep(2000);
		
		String status11 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro1+")]/div[9]/div")).getText();
		System.out.println("Status 1: "+status11);
		sleep(2000);
		
		String status22 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro2+")]/div[9]/div")).getText();
		System.out.println("Status 2: "+status22);
		sleep(2000);
		
			sucesso.add(codstatus11.contains("100"));
			sucesso.add(status11.contains("Aberto"));
			sucesso.add(codstatus22.contains("100"));
			sucesso.add(status22.contains("Aberto"));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
