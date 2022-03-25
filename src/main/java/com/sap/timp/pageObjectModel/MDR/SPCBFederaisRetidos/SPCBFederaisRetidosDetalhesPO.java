package com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SPCBFederaisRetidosDetalhesPO extends TestBaseKenssy {

	@FindBy(xpath = "//span[text()=\"SPCB - Federais Retidos\"]")
	public WebElement SPGB;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//DATOS DEL DETALLAR
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresaD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement mesAnioD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement areaD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement beneficiarioD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement cpfD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement codNaturalezaD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement centroCustoD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement valorTributaelD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement valorNaoTributaelD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement pensaoJudificialD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement irD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement insencaoIRD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[14]/div/div")
	public WebElement qdtDependentesD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[15]/div/div")
	public WebElement dtInsencaoD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[16]/div/div")
	public WebElement motivoInsencacoD;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[17]/div/div")
	public WebElement rendaLiquidaD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//span[@id=\"mesAno\"]")
	public WebElement mesAnioV;
	
	@FindBy(xpath = "//span[@id=\"area\"]")
	public WebElement areaV;
	
	@FindBy(xpath = "//span[@id=\"nomeBenefic\"]")
	public WebElement beneficiarioV;
	
	@FindBy(xpath = "//span[@id=\"cpfBenefic\"]")
	public WebElement cpfV;
	
	@FindBy(xpath = "//span[@id=\"natuRend\"]")
	public WebElement codNaturalezaV;
	
	@FindBy(xpath = "//span[@id=\"cCusto\"]")
	public WebElement centroCustoV;
	
	@FindBy(xpath = "//span[@id=\"vlrTribut\"]")
	public WebElement valorTributaelV;
	
	@FindBy(xpath = "//span[@id=\"vlrNTribut\"]")
	public WebElement valorNaoTributaelV;
	
	@FindBy(xpath = "//span[@id=\"vlrPensao\"]")
	public WebElement pensaoJudificialV;
	
	@FindBy(xpath = "//span[@id=\"vlrIr\"]")
	public WebElement irV;
	
	@FindBy(xpath = "//span[@id=\"indIsento\"]")
	public WebElement insencaoIRV;
	
	@FindBy(xpath = "//span[@id=\"qtdeDepend\"]")
	public WebElement qdtDependentesV;
	
	@FindBy(xpath = "//span[@id=\"dataIsento\"]")
	public WebElement dtInsencaoV;
	
	@FindBy(xpath = "//span[@id=\"obsIsento\"]")
	public WebElement motivoInsencacoV;
	
	@FindBy(xpath = "//span[@id=\"vlrLiquido\"]")
	public WebElement rendaLiquidaV;
	
	public SPCBFederaisRetidosDetalhesPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhe() {
		sleep(2000);
		SPGB.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("SPCBFederaisRetidos");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//IMPRIMIR VALORES DEL DETALLE
		//String idValor = idD.getText();
		String empresaValor = empresaD.getText();
		String mesAnioValor = mesAnioD.getText();
		String area = areaD.getText();
		String beneficiarioValor = beneficiarioD.getText();
		String cpfValor = cpfD.getText();
		String codNaturalezaValor = codNaturalezaD.getText();
		String centroCustoValor = centroCustoD.getText();
		String valorTributaleValor = valorTributaelD.getText();
		String valorNaoTributaelValor = valorNaoTributaelD.getText();
		valorNaoTributaelValor = valorNaoTributaelValor.replace("0", "");
		
		String pensaoJudificialValor = pensaoJudificialD.getText();
		pensaoJudificialValor = pensaoJudificialValor.replace("0", "");
		
		String irValor = irD.getText();
		irValor = irValor.replace("0", "");
		
		String insencaoIRValor = insencaoIRD.getText();
		String qdtDependentesValor = qdtDependentesD.getText();
		String dtInsencaoValor = dtInsencaoD.getText();
		String motivoInsencaoValor = motivoInsencacoD.getText();
		String rendaLiquidaValor = rendaLiquidaD.getText();
		
		
		System.out.println("******DATOS DEL DETALHE******");
		//System.out.println("ID: "+ idValor);
		System.out.println("Empresa: "+  empresaValor);
		System.out.println("Mes/Anio: "+ mesAnioValor );
		System.out.println("Area: "+ area );
		System.out.println("Beneficiario:"+ beneficiarioValor);
		System.out.println("CPF: "+ cpfValor);
		System.out.println("Cod Naturaleza: "+ codNaturalezaValor);
		System.out.println("Centro Custo: "+ centroCustoValor);
		System.out.println("Valor Tributal: "+ valorTributaleValor);
		System.out.println("Valor Nao Tributal: "+ valorNaoTributaelValor);
		System.out.println("Pensao Judificial: "+ pensaoJudificialValor);
		System.out.println("IR: "+ irValor);
		System.out.println("InsencaoIR: "+ insencaoIRValor);
		System.out.println("QDT Dependentes: "+ qdtDependentesValor);
		System.out.println("DT Insencao: "+ dtInsencaoValor);
		System.out.println("Motivo Insencao: "+ motivoInsencaoValor);
		System.out.println("Rendal Liquida:"+ rendaLiquidaValor);
		
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		
		//IMPRIMIR VALORES DEL VISUALIZAR
		//String idValor1 = idV.getText();
		String empresaValor1 = empresaV.getText();
		String mesAnioValor1 = mesAnioV.getText();
		String area1 = areaV.getText();
		String beneficiarioValor1 = beneficiarioV.getText();
		String cpfValor1 = cpfV.getText();
		cpfValor1 = cpfValor1.replace("-", "");
		
		String codNaturalezaValor1 = codNaturalezaV.getText();
		codNaturalezaValor1 = codNaturalezaValor1.replace("-", "");
		
		String centroCustoValor1 = centroCustoV.getText();
		centroCustoValor1 = centroCustoValor1.replace("-", "");
		
		String valorTributaleValor1 = valorTributaelV.getText();
		valorTributaleValor1 = valorTributaleValor1.replace("-", "");
		
		String valorNaoTributaelValor1 = valorNaoTributaelV.getText();
		valorNaoTributaelValor1 = valorNaoTributaelValor1.replace("-", "");
		valorNaoTributaelValor1 = valorNaoTributaelValor1.replace("0", "");
		
		String pensaoJudificialValor1 = pensaoJudificialV.getText();
		pensaoJudificialValor1 = pensaoJudificialValor1.replace("-", "");
		pensaoJudificialValor1 = pensaoJudificialValor1.replace("0", "");
		
		String irValor1 = irV.getText();
		irValor1 = irValor1.replace("-", "");
		irValor1 = irValor1.replace("0", "");
		
		String insencaoIRValor1 = insencaoIRV.getText();
		insencaoIRValor1 = insencaoIRValor1.replace("-", "");
		
		String qdtDependentesValor1 = qdtDependentesV.getText();
		qdtDependentesValor1 = qdtDependentesValor1.replace("-", "");
		
		String dtInsencaoValor1 = dtInsencaoV.getText();
		dtInsencaoValor1 = dtInsencaoValor1.replace("-", "");
		
		String motivoInsencaoValor1 = motivoInsencacoV.getText();
		motivoInsencaoValor1 = motivoInsencaoValor1.replace("-", "");
		
		String rendaLiquidaValor1 = rendaLiquidaV.getText();
		rendaLiquidaValor1 = rendaLiquidaValor1.replace("-", "");
		
		
		System.out.println("******DATOS DEL VISUALIZAR******");
		//System.out.println("ID: "+ idValor);
		System.out.println("Empresa: "+  empresaValor1);
		System.out.println("Mes/Anio: "+ mesAnioValor1 );
		System.out.println("Area: "+ area1 );
		System.out.println("Beneficiario:"+ beneficiarioValor1);
		System.out.println("CPF: "+ cpfValor1);
		System.out.println("Cod Naturaleza: "+ codNaturalezaValor1);
		System.out.println("Centro Custo: "+ centroCustoValor1);
		System.out.println("Valor Tributal: "+ valorTributaleValor1);
		System.out.println("Valor Nao Tributal: "+ valorNaoTributaelValor1);
		System.out.println("Pensao Judificial: "+ pensaoJudificialValor1);
		System.out.println("IR: "+ irValor1);
		System.out.println("InsencaoIR: "+ insencaoIRValor1);
		System.out.println("QDT Dependentes: "+ qdtDependentesValor1);
		System.out.println("DT Insencao: "+ dtInsencaoValor1);
		System.out.println("Motivo Insencao: "+ motivoInsencaoValor1);
		System.out.println("Rendal Liquida:"+ rendaLiquidaValor1);
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaValor1.equals(empresaValor));
		sucesso.add(mesAnioValor1.equals(mesAnioValor));
		sucesso.add(area1.equals(area));
		sucesso.add(beneficiarioValor1.equals(beneficiarioValor));
		sucesso.add(cpfValor1.equals(cpfValor));
		sucesso.add(codNaturalezaValor1.equals(codNaturalezaValor));
		sucesso.add(centroCustoValor1.equals(centroCustoValor));
		sucesso.add(valorTributaleValor1.equals(valorTributaleValor));
		
		sucesso.add(valorNaoTributaelValor1.equals(valorNaoTributaelValor));
		sucesso.add(pensaoJudificialValor1.equals(pensaoJudificialValor));
		sucesso.add(irValor1.equals(irValor));
		sucesso.add(insencaoIRValor1.equals(insencaoIRValor));
		sucesso.add(qdtDependentesValor1.equals(qdtDependentesValor));
		sucesso.add(dtInsencaoValor1.equals(dtInsencaoValor));
		sucesso.add(motivoInsencaoValor1.equals(motivoInsencaoValor));
		sucesso.add(rendaLiquidaValor1.equals(rendaLiquidaValor));
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
		
	}
}
