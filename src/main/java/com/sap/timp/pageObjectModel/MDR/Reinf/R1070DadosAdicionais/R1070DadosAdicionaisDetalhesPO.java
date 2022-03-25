package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class R1070DadosAdicionaisDetalhesPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados Adicionais\"]")
	public WebElement R1070DadosAdicionais;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	//DATOS DEL DETALLE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement dataD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement tipoProcesoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement numeroProcesoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement codigoSuspensaoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement tipoIncricaoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement numeroIncricaoD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement codigoActividadeEconomicaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement indicadorComercializacaoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement valorRetencaoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement adicionalD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[14]/div/div")
	public WebElement valorCPSuspensaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[15]/div/div")
	public WebElement valorRATSuspensaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[16]/div/div")
	public WebElement valorSENARSuspensaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[17]/div/div")
	public WebElement valorCPRBSuspensaD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	//DATOS VISUALIZAR

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaD1;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialD1;
	@FindBy(xpath = "//span[@id=\"date\"]")
	public WebElement dataD1;
	
	@FindBy(xpath = "//span[@id=\"processType\"]")
	public WebElement tipoProcesoD1;
	
	@FindBy(xpath = "//span[@id=\"processNumber\"]")
	public WebElement numeroProcesoD1;
	
	@FindBy(xpath = "//span[@id=\"suspensionCode\"]")
	public WebElement codigoSuspensaoD1;
	
	@FindBy(xpath = "//span[@id=\"inscriptionType\"]")
	public WebElement tipoIncricaoD1;
	
	@FindBy(xpath = "//span[@id=\"inscriptionNumber\"]")
	public WebElement numeroIncricaoD1;
	
	@FindBy(xpath = "//span[@id=\"economicActivityCode\"]")
	public WebElement codigoActividadeEconomicaD1;
	
	@FindBy(xpath = "//span[@id=\"commercializationIndicator\"]")
	public WebElement indicadorComercializacaoD1;
	
	@FindBy(xpath = "//span[@id=\"retentionAmount\"]")
	public WebElement valorRetencaoD1;
	
	@FindBy(xpath = "//span[@id=\"additional\"]")
	public WebElement adicionalD1;
	
	@FindBy(xpath = "//span[@id=\"suspendedCPValue\"]")
	public WebElement valorCPSuspensaD1;
	
	@FindBy(xpath = "//span[@id=\"suspendedRATValue\"]")
	public WebElement valorRATSuspensaD1;
	
	@FindBy(xpath = "//span[@id=\"suspendedSENARValue\"]")
	public WebElement valorSENARSuspensaD1;
	
	@FindBy(xpath = "//span[@id=\"suspendedCPRBValue\"]")
	public WebElement valorCPRBSuspensaD1;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public R1070DadosAdicionaisDetalhesPO() {
		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		
		Reinf.click();
		sleep(4000);
		R1070DadosAdicionais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("DadosAdicionais");
		
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
		String Filialdetalhes = filialD.getText();
		String Datadetalhes = dataD.getText();
		String TipodoProcesodetalhes =  tipoProcesoD.getText();
		String numeroProcesodetalhes =  numeroProcesoD.getText();
		String codigoSuspensaodetalhes =  codigoSuspensaoD.getText();
		String tipoIncricaodetalhes =  tipoIncricaoD.getText();
		String numeroIncricaodetalhes =  numeroIncricaoD.getText();
		
		String codigoActividadeEconomicadetalhes =  codigoActividadeEconomicaD.getText();
		codigoActividadeEconomicadetalhes = codigoActividadeEconomicadetalhes.replace("--","");
		
		String indicadorComercializacaodetalhes =  indicadorComercializacaoD.getText();
		indicadorComercializacaodetalhes = indicadorComercializacaodetalhes.replace("--","");
		
		String valorRetencaodetalhes =  valorRetencaoD.getText();
		String adicionaldetalhes =  adicionalD.getText();
		String valorCPSuspensadetalhes =  valorCPSuspensaD.getText();
		String valorRATSuspensadetalhes =  valorRATSuspensaD.getText();
		String valorSENARSuspensadetalhes =  valorSENARSuspensaD.getText();
		String valorCPRBSuspensadetalhes =  valorCPRBSuspensaD.getText();
		
		
		System.out.println("----------DATOS DEL DETALHES-----------");
		System.out.println(empresadetalhes);
		System.out.println(Filialdetalhes);
		System.out.println(Datadetalhes);
		System.out.println(TipodoProcesodetalhes);
		System.out.println(numeroProcesodetalhes);
		System.out.println(codigoSuspensaodetalhes);
		System.out.println(tipoIncricaodetalhes);
		System.out.println(numeroIncricaodetalhes);
		System.out.println(codigoActividadeEconomicadetalhes);
		System.out.println(indicadorComercializacaodetalhes);
		System.out.println(valorRetencaodetalhes);
		System.out.println(adicionaldetalhes);
		System.out.println(valorCPSuspensadetalhes);
		System.out.println(valorRATSuspensadetalhes);
		System.out.println(valorSENARSuspensadetalhes);
		System.out.println(valorCPRBSuspensadetalhes);
		
		
		
		
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
		String Filialdetalhes1 = filialD1.getText();
		String Datadetalhes1 = dataD1.getText();
		String TipodoProcesodetalhes1 =  tipoProcesoD1.getText();
		String numeroProcesodetalhes1 =  numeroProcesoD1.getText();
		String codigoSuspensaodetalhes1 =  codigoSuspensaoD1.getText();
		String tipoIncricaodetalhes1 =  tipoIncricaoD1.getText();
		String numeroIncricaodetalhes1 =  numeroIncricaoD1.getText();
		String codigoActividadeEconomicadetalhes1 =  codigoActividadeEconomicaD1.getText();
		String indicadorComercializacaodetalhes1 =  indicadorComercializacaoD1.getText();
		String valorRetencaodetalhes1 =  valorRetencaoD1.getText();
		String adicionaldetalhes1 =  adicionalD1.getText();
		String valorCPSuspensadetalhes1 =  valorCPSuspensaD1.getText();
		String valorRATSuspensadetalhes1 =  valorRATSuspensaD1.getText();
		String valorSENARSuspensadetalhes1 =  valorSENARSuspensaD1.getText();
		String valorCPRBSuspensadetalhes1 =  valorCPRBSuspensaD1.getText();
		
		
		System.out.println("");
		System.out.println("----------DATOS DEL VISUALIZAR-----------");
		System.out.println(empresadetalhes1);
		System.out.println(Filialdetalhes1);
		System.out.println(Datadetalhes1);
		System.out.println(TipodoProcesodetalhes1);
		System.out.println(numeroProcesodetalhes1);
		System.out.println(codigoSuspensaodetalhes1);
		System.out.println(tipoIncricaodetalhes1);
		System.out.println(numeroIncricaodetalhes1);
		System.out.println(codigoActividadeEconomicadetalhes1);
		System.out.println(indicadorComercializacaodetalhes1);
		System.out.println(valorRetencaodetalhes1);
		System.out.println(adicionaldetalhes1);
		System.out.println(valorCPSuspensadetalhes1);
		System.out.println(valorRATSuspensadetalhes1);
		System.out.println(valorSENARSuspensadetalhes1);
		System.out.println(valorCPRBSuspensadetalhes1);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
			sucesso.add(empresadetalhes1.equals(empresadetalhes));
			sucesso.add(Filialdetalhes1.equals(Filialdetalhes));
			sucesso.add(Datadetalhes1.equals(Datadetalhes));
			sucesso.add(TipodoProcesodetalhes1.equals(TipodoProcesodetalhes));
			sucesso.add(numeroProcesodetalhes1.equals(numeroProcesodetalhes));
			sucesso.add(codigoSuspensaodetalhes1.equals(codigoSuspensaodetalhes));
			sucesso.add(tipoIncricaodetalhes1.equals(tipoIncricaodetalhes));
			sucesso.add(numeroIncricaodetalhes1.equals(numeroIncricaodetalhes));
			sucesso.add(codigoActividadeEconomicadetalhes1.equals(codigoActividadeEconomicadetalhes));
			sucesso.add(indicadorComercializacaodetalhes1.equals(indicadorComercializacaodetalhes));
			sucesso.add(valorRetencaodetalhes1.equals(valorRetencaodetalhes));
			sucesso.add(adicionaldetalhes1.equals(adicionaldetalhes));
			sucesso.add(valorCPSuspensadetalhes1.equals(valorCPSuspensadetalhes));
			sucesso.add(valorRATSuspensadetalhes1.equals(valorRATSuspensadetalhes));
			sucesso.add(valorSENARSuspensadetalhes1.equals(valorSENARSuspensadetalhes));
			sucesso.add(valorCPRBSuspensadetalhes1.equals(valorCPRBSuspensadetalhes));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
