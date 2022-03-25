package com.sap.timp.pageObjectModel.TFP.Periodos.Periodos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PeriodosAlterarSubPeriodoEmMassaPO extends TestBaseKenssy{

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
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Subperíodo\"]")
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
	
	//TRIBUTO
		@FindBy(xpath = "//tr[@class=\"tax-wrapper\"]//div[@id=\"tax\"]/div/div/div[2]")
		public WebElement tributoAS;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"00\"]/div/label/span")
		public WebElement opcTributoAS;	
		
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
	
	@FindBy(xpath = "//div[@class=\"items\"]//div/div[2]/div/div/label[@for=\"0_0\"]/span")
	public WebElement alterarStatusPara200Prefechamento;
	//div[contains(@class,"baseTabs-view -view-wrapper")]/div[@class="wrapper-element"]/div[@class="items"]/div[2]/div/div/label/span

	
	@FindBy(xpath = "//button[text()=\"Alterar status\"]")
	public WebElement alterarStatusBtn;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharSub;
	
	@FindBy(xpath = "//div[@class=\"items\"]//div/div[2]/div/div/label/span")
	public WebElement alterarStatusPara100Aberto;
	
	public PeriodosAlterarSubPeriodoEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarSubPeriodoEmMassa() {
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
		
		
		tributoAS.click();
		sleep(2000);
		opcTributoAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		
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
		
		
		
		//CLICK AL MENU
		
		if(tq1 == true) {
			idFiltro2 = "159420";
			sleep(2000);
		}else if(tc2 == true) {
			idFiltro2 = "41097";
			sleep(2000);
		}else {
			idFiltro2 = "36022";
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf = driver.findElement(By.xpath("//div[@data-id="+idFiltro2+"]/div[1]/div"));
		WebElement subperiodoFiscais = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltro2 + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf.click();
		sleep(2000);
		subperiodoFiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		System.out.println("----Status 2do registro = 200 - Pre fechamento ----");
		int rows = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("200 - Pré-Fechamento"));

			f = f + 1;
		}
		
		
		fecharSub.click();
		sleep(2000);
		
		
		
		if(tq1 == true) {
			idFiltro1 = "159418";
			sleep(2000);
		}else if(tc2 == true) {
			idFiltro1  = "41095";
			sleep(2000);
		}else {
			idFiltro1 = "36020";
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf2 = driver.findElement(By.xpath("//div[@data-id="+idFiltro1+"]/div[1]/div"));
		WebElement subperiodoFiscais2 = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltro1 + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf2.click();
		sleep(2000);
		subperiodoFiscais2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso = new ArrayList<Boolean>();
		
		System.out.println("");
		System.out.println("----Status 1er registro = 200 - Pre fechamento ----");
		int rows2 = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int g = 1;
		for (int i = 0; i < rows2; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows2 + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("200 - Pré-Fechamento"));

			g = g + 1;
		}
		
		
		fecharSub.click();
		sleep(2000);
		
		//de nuevo alterar a 100 ABERTO
		
//		sleep(2000);
//		 resultFiltrado1 = driver.findElement(By.xpath("//div[@data-id="+idFiltro1+"]/div[contains(@class,\"checkbox\")]/label/span"));
//		 resultFiltrado2 = driver.findElement(By.xpath("//div[@data-id="+idFiltro2+"]/div[contains(@class,\"checkbox\")]/label/span"));
//		sleep(2000);
//		
//		resultFiltrado1.click();
//		sleep(2000);
//		resultFiltrado2.click();
//		sleep(2000);
		
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
		
		
		tributoAS.click();
		sleep(2000);
		opcTributoAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		
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
		
		alterarStatusPara100Aberto.click();
		sleep(2000);
		
		alterarStatusBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		if(tq1 == true) {
			idFiltro2 = "159420";
			sleep(2000);
		}else if(tc2 == true) {
			idFiltro2 = "41097";
			sleep(2000);
		}else {
			idFiltro2 = "36022";
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf3 = driver.findElement(By.xpath("//div[@data-id="+idFiltro2+"]/div[1]/div"));
		WebElement subperiodoFiscais3 = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltro2 + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf3.click();
		sleep(2000);
		subperiodoFiscais3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso = new ArrayList<Boolean>();
		
		System.out.println(" ");
		System.out.println("----Status 2do registro = 100 - Aberto ----");
		int rows3 = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int h = 1;
		for (int i = 0; i < rows3; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows3 + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("100 - Aberto"));

			h = h + 1;
		}
		
		
		fecharSub.click();
		sleep(2000);
		
		
		
		if(tq1 == true) {
			idFiltro1 = "159418";
			sleep(2000);
		}else if(tc2 == true) {
			idFiltro1  = "41095";
			sleep(2000);
		}else {
			idFiltro1 = "36020";
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf4 = driver.findElement(By.xpath("//div[@data-id="+idFiltro1+"]/div[1]/div"));
		WebElement subperiodoFiscais4 = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltro1 + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf4.click();
		sleep(2000);
		subperiodoFiscais4.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso = new ArrayList<Boolean>();
		
		System.out.println("");
		System.out.println("----Status 1er registro = 100 - Aberto ----");
		
		int rows4 = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int j = 1;
		for (int i = 0; i < rows4; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows4 + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("100 - Aberto"));

			j = j + 1;
		}
		
		
		fecharSub.click();
		sleep(2000);
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
}
