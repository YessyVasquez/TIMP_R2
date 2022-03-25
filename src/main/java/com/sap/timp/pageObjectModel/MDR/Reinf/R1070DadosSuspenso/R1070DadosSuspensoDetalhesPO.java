package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class R1070DadosSuspensoDetalhesPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados de Suspensão\"]")
	public WebElement R1070DadosSuspenso;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	//DATOS DEL DETALLE
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
		public WebElement idD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
		public WebElement empresaD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
		public WebElement tipoProcesoD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
		public WebElement numeroProcesoD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
		public WebElement codigoSuspensaoD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
		public WebElement validadeDeD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
		public WebElement validadeAteD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
		public WebElement dataDesisaoD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
		public WebElement indicadorDeSuspensaoD;
		@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
		public WebElement indicativoDeDepositoIntegralD;
	
		@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
		public WebElement fechar;
		
	//DATOS DE VISUALIZAR
		@FindBy(xpath = "//span[@id=\"company\"]")
		public WebElement empresaD1;
		@FindBy(xpath = "//span[@id=\"processType\"]")
		public WebElement tipoProcesoD1;
		@FindBy(xpath = "//span[@id=\"processNumber\"]")
		public WebElement numeroProcesoD1;
		@FindBy(xpath = "//span[@id=\"suspensionCode\"]")
		public WebElement codigoSuspensaoD1;
		
		@FindBy(xpath = "//span[@id=\"validFrom\"]")
		public WebElement validadeDeD1;
		@FindBy(xpath = "//span[@id=\"validTo\"]")
		public WebElement validadeAteD1;
		@FindBy(xpath = "//span[@id=\"decisionDate\"]")
		public WebElement dataDesisaoD1;
		@FindBy(xpath = "//span[@id=\"suspensionIndicator\"]")
		public WebElement indicadorDeSuspensaoD1;
		@FindBy(xpath = "//span[@id=\"wholeDepositIndicator\"]")
		public WebElement indicativoDeDepositoIntegralD1;
		
	
	public R1070DadosSuspensoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		Reinf.click();
		sleep(4000);
		R1070DadosSuspenso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("DatosSuspensoCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
				
		//DATOS DEL DETALHES
		String empresadetalhes = empresaD.getText();
		String numeroProcesodetalhes =  numeroProcesoD.getText();
		String codigoSuspensaodetalhes =  codigoSuspensaoD.getText();
		String validadeDedetalhes =  validadeDeD.getText();
		String validadeAtedetalhes =  validadeAteD.getText();
		validadeAtedetalhes = validadeAtedetalhes.replace("--","");
		
		String datadaDesisãodetalhes =  dataDesisaoD.getText();
		String indicadordeSuspensãodetalhes =  indicadorDeSuspensaoD.getText();
		String indicativoDeDepositoIntegraldetalhes =  indicativoDeDepositoIntegralD.getText();
		
		System.out.println("----------DATOS DEL DETALHES-----------");
		System.out.println(empresadetalhes);
		System.out.println(numeroProcesodetalhes);
		System.out.println(codigoSuspensaodetalhes);
		System.out.println(validadeDedetalhes);
		System.out.println(validadeAtedetalhes);
		System.out.println(datadaDesisãodetalhes);
		System.out.println(indicadordeSuspensãodetalhes);
		System.out.println(indicativoDeDepositoIntegraldetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//DATOS DEL VISUALIZAR
		String empresadetalhes1 = empresaD1.getText();
		String numeroProcesodetalhes1 =  numeroProcesoD1.getText();
		String codigoSuspensaodetalhes1 =  codigoSuspensaoD1.getText();
		String validadeDedetalhes1 =  validadeDeD1.getText();
		String validadeAtedetalhes1 =  validadeAteD1.getText();
		String datadaDesisãodetalhes1 =  dataDesisaoD1.getText();
		String indicadordeSuspensãodetalhes1 =  indicadorDeSuspensaoD1.getText();
		String indicativoDeDepositoIntegraldetalhes1 =  indicativoDeDepositoIntegralD1.getText();
		
		System.out.println("----------DATOS DEL VISUALIZAR-----------");
		System.out.println(empresadetalhes1);
		System.out.println(numeroProcesodetalhes1);
		System.out.println(codigoSuspensaodetalhes1);
		System.out.println(validadeDedetalhes1);
		System.out.println(validadeAtedetalhes1);
		System.out.println(datadaDesisãodetalhes1);
		System.out.println(indicadordeSuspensãodetalhes1);
		System.out.println(indicativoDeDepositoIntegraldetalhes1);
				
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
			sucesso.add(empresadetalhes1.equals(empresadetalhes));
			sucesso.add(numeroProcesodetalhes1.equals(numeroProcesodetalhes));
			sucesso.add(codigoSuspensaodetalhes1.equals(codigoSuspensaodetalhes));
			sucesso.add(validadeDedetalhes1.equals(validadeDedetalhes));
			sucesso.add(datadaDesisãodetalhes1.equals(datadaDesisãodetalhes));
			sucesso.add(indicadordeSuspensãodetalhes1.equals(indicadordeSuspensãodetalhes));
			sucesso.add(indicativoDeDepositoIntegraldetalhes1.equals(indicativoDeDepositoIntegraldetalhes));
	
		System.out.println(sucesso);
		return sucesso;
	}
}
