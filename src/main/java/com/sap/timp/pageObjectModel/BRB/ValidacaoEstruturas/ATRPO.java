package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ATRPO extends TestBaseSteven{
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement execucao;
	@FindBy(xpath = "//button[@tabindex=\"0\"]/span[text()=\"Executar\"]")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"total-record\"]/span[@class=\"value cell\"]")
	public WebElement totalLinhas;
	@FindBy(xpath = "//div[@data-column=\"46\" and not(@data-path or @aria-label)]/div")
	public WebElement pesoBruto;
	@FindBy(xpath = "//div[@data-column=\"47\" and not(@data-path or @aria-label)]/div")
	public WebElement pesoLiquido;
	@FindBy(xpath = "//div[@data-column=\"79\" and not(@data-path or @aria-label)]/div")
	public WebElement valorDocFiscal;
	
	@FindBy(xpath = "//div[@data-column=\"174\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOperICMS;
	@FindBy(xpath = "//div[@data-column=\"175\" and not(@data-path or @aria-label)]/div")
	public WebElement valorLiquido;
	@FindBy(xpath = "//div[@data-column=\"250\" and not(@data-path or @aria-label)]/div")
	public WebElement valorTotalDocFiscal;
	@FindBy(xpath = "//div[@data-column=\"77\" and not(@data-path or @aria-label)]/div")
	public WebElement valorMercadoriasServicos;
	
	@FindBy(xpath = "//div[@data-column=\"132\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidade;
	@FindBy(xpath = "//div[@data-column=\"133\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidadeBCCOFINS;
	@FindBy(xpath = "//div[@data-column=\"138\" and not(@data-path or @aria-label)]/div")
	public WebElement valorItem;
	@FindBy(xpath = "//div[@data-column=\"139\" and not(@data-path or @aria-label)]/div")
	public WebElement valorUnitarioLiquido;
	@FindBy(xpath = "//div[@data-column=\"187\" and not(@data-path or @aria-label)]/div")
	public WebElement valorUnitarioComImposto;
	@FindBy(xpath = "//div[@data-column=\"4\" and not(@data-path or @aria-label)]/div")
	public WebElement bcPis;
	@FindBy(xpath = "//div[@data-column=\"5\" and not(@data-path or @aria-label)]/div")
	public WebElement bcICMS;
	@FindBy(xpath = "//div[@data-column=\"6\" and not(@data-path or @aria-label)]/div")
	public WebElement bcICMSST;
	@FindBy(xpath = "//div[@data-column=\"60\" and not(@data-path or @aria-label)]/div")
	public WebElement bcCofins;
	@FindBy(xpath = "//div[@data-column=\"61\" and not(@data-path or @aria-label)]/div")
	public WebElement bcDifal;
	@FindBy(xpath = "//div[@data-column=\"66\" and not(@data-path or @aria-label)]/div")
	public WebElement valorICMS;
	@FindBy(xpath = "//div[@data-column=\"67\" and not(@data-path or @aria-label)]/div")
	public WebElement valorICMSST;
	
	@FindBy(xpath = "//div[@data-column=\"73\" and not(@data-path or @aria-label)]/div")
	public WebElement valorCofins;
	@FindBy(xpath = "//div[@data-column=\"76\" and not(@data-path or @aria-label)]/div")
	public WebElement valorDifal;
	@FindBy(xpath = "//div[@data-column=\"81\" and not(@data-path or @aria-label)]/div")
	public WebElement valorPis;
	@FindBy(xpath = "//div[@data-column=\"178\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasICMS;
	@FindBy(xpath = "//div[@data-column=\"182\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasIPI;
	@FindBy(xpath = "//div[@data-column=\"184\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasDIFAL;
	@FindBy(xpath = "//div[@data-column=\"202\" and not(@data-path or @aria-label)]/div")
	public WebElement qtdBCPIS;
	@FindBy(xpath = "//div[@data-column=\"365\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOutrasDIFAL;
	@FindBy(xpath = "//div[@data-column=\"363\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOutrasICMS;
	@FindBy(xpath = "//div[@data-column=\"367\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaICMS;
	@FindBy(xpath = "//div[@data-column=\"433\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaICMSST;
	@FindBy(xpath = "//div[@data-column=\"434\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaDifal;
	

	
	public ATRPO() {
		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> verificar() {
		
		sleep(2000);
		ferramenta.sendKeys("8004408");
		ferramenta.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(1000);
		execucao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		//total de linhas
		
		System.out.println("-------------------------------------------------");
		System.out.println("total de linhas");
		String totalLinhasS = totalLinhas.getText();
		System.out.println(totalLinhasS);
		int totalLinhasI = Integer.valueOf(totalLinhasS);
		int esperadoLinhas = 0;
		System.out.println(esperadoLinhas);
		sucesso.add(mayorQue(totalLinhasI, esperadoLinhas));
		System.out.println(mayorQue(totalLinhasI, esperadoLinhas)+" numero linhas");
		
		
		System.out.println("-------------------------------------------------");
		//peso bruto
		System.out.println("peso bruto");
		String pesoBrutoS = pesoBruto.getText();
		pesoBrutoS = pesoBrutoS.replace(",", ".");
		System.out.println(pesoBrutoS + " String");
		double pesoBrutoD = new Double(pesoBrutoS);
		System.out.println(pesoBrutoD + " Double");
		double esperadoPesoBruto = 0;
		System.out.println(esperadoPesoBruto + " Esperado");
		sucesso.add(mayorQue(pesoBrutoD, esperadoPesoBruto));
		System.out.println(mayorQue(pesoBrutoD, esperadoPesoBruto)+" peso bruto");
		
		System.out.println("-------------------------------------------------");
		//peso liquido
		System.out.println("peso liquido");
		String pesoLiquidoS = pesoLiquido.getText();
		pesoLiquidoS = pesoLiquidoS.replace(",", ".");
		System.out.println(pesoLiquidoS+ " String");
		double pesoLiquidoD = new Double(pesoLiquidoS);
		System.out.println(pesoLiquidoD + " Double");
		double esperadoPesoLiquido = 0;
		System.out.println(esperadoPesoLiquido + " Esperado");
		sucesso.add(mayorQue(pesoLiquidoD, esperadoPesoLiquido));
		System.out.println(mayorQue(pesoLiquidoD, esperadoPesoLiquido)+" peso Liquido");
		
		System.out.println("-------------------------------------------------");
		//valor Doc Fiscal
		System.out.println("valor Doc Fiscal");
		String valorDocFiscalS = valorDocFiscal.getText();
		valorDocFiscalS = valorDocFiscalS.replace(".", "");
		valorDocFiscalS = valorDocFiscalS.replace(",", ".");
		System.out.println(valorDocFiscalS + " String");
		double valorDocFiscalD = new Double(valorDocFiscalS);
		System.out.println(valorDocFiscalD + " Double");
		double esperadoValorDocFiscal = 0;
		System.out.println(esperadoValorDocFiscal + " Esperado");
		sucesso.add(mayorQue(valorDocFiscalD, esperadoValorDocFiscal));
		System.out.println(mayorQue(valorDocFiscalD, esperadoValorDocFiscal) +" Valor Doc Fiscal");
		
		System.out.println("-------------------------------------------------");
		// Totalizador de "Valor de Mercadorias e Serviços"
		System.out.println("Totalizador de \"Valor Mercadorias e Serviços");
		String valorMercadoriasServicosS = valorMercadoriasServicos.getText();
		valorMercadoriasServicosS = valorMercadoriasServicosS.replace(".", "");
		valorMercadoriasServicosS = valorMercadoriasServicosS.replace(",", ".");
		System.out.println(valorMercadoriasServicosS+" String");
		double valorMercadoriasServicosD = new Double(valorMercadoriasServicosS);
		System.out.println(valorMercadoriasServicosD + " Double");
		double esperadovalorMercadoriasServicos = 0;
		System.out.println(esperadovalorMercadoriasServicos + " Esperado");
		sucesso.add(mayorQue(valorMercadoriasServicosD, esperadovalorMercadoriasServicos));
		System.out.println(mayorQue(valorMercadoriasServicosD, esperadovalorMercadoriasServicos) + " Totalizador de Valor Mercadorias e Serviços");
		
		System.out.println("-------------------------------------------------");
		// Quantidade
		System.out.println("Quantidade");
		String quantidadeS = quantidade.getText();
		quantidadeS = quantidadeS.replace(",", ".");
		System.out.println(quantidadeS +" String");
		double quantidadeD = new Double(quantidadeS);
		System.out.println(quantidadeD + " Double");
		double esperadoquantidade = 0;
		System.out.println(esperadoquantidade + " Esperado");
		sucesso.add(mayorQue(quantidadeD, esperadoquantidade));
		System.out.println(mayorQue(quantidadeD, esperadoquantidade) + " Quantidade");
		
		System.out.println("-------------------------------------------------");
		
		// Quantidade BC COFINS
		System.out.println(" Quantidade BC COFINS");
		String quantidadeBCCOFINSS = quantidadeBCCOFINS.getText();
		quantidadeBCCOFINSS = quantidadeBCCOFINSS.replace(",", ".");
		System.out.println(quantidadeBCCOFINSS +" String");
		double quantidadeBCCOFINSD = new Double(quantidadeBCCOFINSS);
		System.out.println(quantidadeBCCOFINSD + " Double");
		double esperadoquantidadeBCCOFINS = 0;
		System.out.println(esperadoquantidadeBCCOFINS + " Esperando");
		sucesso.add(mayorQue(quantidadeBCCOFINSD, esperadoquantidadeBCCOFINS));
		System.out.println(mayorQue(quantidadeBCCOFINSD, esperadoquantidadeBCCOFINS) + " quantidade BC COFINS");
		
		System.out.println("-------------------------------------------------");
		// Valor do Item
		System.out.println("Valor do Item");
		String valorItemS = valorItem.getText();
		valorItemS = valorItemS.replace(".", "");
		valorItemS = valorItemS.replace(",", ".");
		System.out.println(valorItemS + " String");
		double valorItemD = new Double(valorItemS);
		System.out.println(valorItemD + " Double");
		double esperadovalorItem = 0;
		System.out.println(esperadovalorItem + " Esperado");
		sucesso.add(mayorQue(valorItemD, esperadovalorItem));
		System.out.println(mayorQue(valorItemD, esperadovalorItem) + " Valor do Item");
		
		System.out.println("-------------------------------------------------");
		// Valor Unitário Líquido
		System.out.println("Valor Unitário Líquido");
		String valorUnitarioLiquidoS = valorUnitarioLiquido.getText();
		valorUnitarioLiquidoS = valorUnitarioLiquidoS.replace(".", "");
		valorUnitarioLiquidoS = valorUnitarioLiquidoS.replace(",", ".");
		System.out.println(valorUnitarioLiquidoS+ " String");
		double valorUnitarioLiquidoD = new Double(valorUnitarioLiquidoS);
		System.out.println(valorUnitarioLiquidoD + " Double");
		double esperadovalorUnitarioLiquido = 0;
		System.out.println(esperadovalorUnitarioLiquido + " Esperado");
		sucesso.add(mayorQue(valorUnitarioLiquidoD, esperadovalorUnitarioLiquido));
		System.out.println(mayorQue(valorUnitarioLiquidoD, esperadovalorUnitarioLiquido) + " Valor Unitário Líquido");
		
		System.out.println("-------------------------------------------------");
		
		// Valor Unitário com Imposto
		System.out.println("Valor Unitário com Imposto");
		String valorUnitarioComImpostoS = valorUnitarioComImposto.getText();
		valorUnitarioComImpostoS = valorUnitarioComImpostoS.replace(".", "");
		valorUnitarioComImpostoS = valorUnitarioComImpostoS.replace(",", ".");
		System.out.println(valorUnitarioComImpostoS + " String");
		double valorUnitarioComImpostoD = new Double(valorUnitarioComImpostoS);
		System.out.println(valorUnitarioComImpostoD + " Double");
		double esperadovalorUnitarioComImposto = 0;
		System.out.println(esperadovalorUnitarioComImposto + " Esperado");
		sucesso.add(mayorQue(valorUnitarioComImpostoD, esperadovalorUnitarioComImposto));
		System.out.println(mayorQue(valorUnitarioComImpostoD, esperadovalorUnitarioComImposto) + " Valor Unitário com Imposto");
		
		
		System.out.println("-------------------------------------------------");
		// BC ICMS ST
		System.out.println("BC ICMS ST");
		String bcICMSSTS = bcICMSST.getText();
		bcICMSSTS = bcICMSSTS.replace(".", "");
		bcICMSSTS = bcICMSSTS.replace(",", ".");
		System.out.println(bcICMSSTS+" String");
		double bcICMSSTD = new Double(bcICMSSTS);
		System.out.println(bcICMSSTD + " Double");
		double esperadobcICMSST = 0;
		System.out.println(esperadobcICMSST + " Esperado");
		sucesso.add(mayorQue(bcICMSSTD, esperadobcICMSST));
		System.out.println(mayorQue(bcICMSSTD, esperadobcICMSST) + " BC ICMS ST");
		
		/*
		System.out.println("-------------------------------------------------");
		// BC Difal
		System.out.println("BC Difal");
		String bcDifalS = bcDifal.getText();
		bcDifalS= bcDifalS.replace(".", "");
		bcDifalS= bcDifalS.replace(",", ".");
		System.out.println(bcDifalS+ " String");
		double bcDifalD = new Double(bcDifalS);
		System.out.println(bcDifalD + " Double");
		double esperadobcDifal = 0;
		System.out.println(esperadobcDifal + " Esperado");
		sucesso.add(mayorQue(bcDifalD, esperadobcDifal));
		System.out.println(mayorQue(bcDifalD, esperadobcDifal) + " BC Difal");
		*/
		
		System.out.println("-------------------------------------------------");
		// Valor ICMS ST
		System.out.println("Valor ICMS ST");
		String valorICMSSTS = valorICMSST.getText();
		valorICMSSTS = valorICMSSTS.replace(".", "");
		valorICMSSTS = valorICMSSTS.replace(",", ".");
		System.out.println(valorICMSSTS+ " String");
		double valorICMSSTD = new Double(valorICMSSTS);
		System.out.println(valorICMSSTD + " Double");
		double esperadovalorICMSST = 0;
		System.out.println(esperadovalorICMSST+ " Esperado");
		sucesso.add(mayorQue(valorICMSSTD, esperadovalorICMSST));
		System.out.println(mayorQue(valorICMSSTD, esperadovalorICMSST) + " Valor ICMS ST");
		/*
		System.out.println("-------------------------------------------------");
		// Valor Difal
		System.out.println("Valor Difal");
		String valorDifalS = valorDifal.getText();
		valorDifalS = valorDifalS.replace(".", "");
		valorDifalS = valorDifalS.replace(",", ".");
		System.out.println(valorDifalS+ " String");
		double valorDifalD = new Double(valorDifalS);
		System.out.println(valorDifalD + " Double");
		double esperadovalorDifal = 0;
		System.out.println(esperadovalorDifal + " Esperado");
		sucesso.add(mayorQue(valorDifalD, esperadovalorDifal));
		System.out.println(mayorQue(valorDifalD, esperadovalorDifal) + " Valor Difal");
		*/
		System.out.println("-------------------------------------------------");
		
		// BC Outras IPI
		System.out.println("BC Outras IPI");
		String bcOutrasIPIS = bcOutrasIPI.getText();
		bcOutrasIPIS = bcOutrasIPIS.replace(".", "");
		bcOutrasIPIS = bcOutrasIPIS.replace(",", ".");
		System.out.println(bcOutrasIPIS+ " String");
		double bcOutrasIPID = new Double(bcOutrasIPIS);
		System.out.println(bcOutrasIPID + " Double");
		double esperadobcOutrasIPI = 0;
		System.out.println(esperadobcOutrasIPI + " Esperado");
		sucesso.add(mayorQue(bcOutrasIPID, esperadobcOutrasIPI));
		System.out.println(mayorQue(bcOutrasIPID, esperadobcOutrasIPI) + " BC Outras IPI");
		
		System.out.println("-------------------------------------------------");
		// QTD. BC PIS
		System.out.println("QTD. BC PIS");
		String qtdBCPISS = qtdBCPIS.getText();
		qtdBCPISS = qtdBCPISS.replace(",", ".");
		System.out.println(qtdBCPISS + "String");
		double qtdBCPISD = new Double(qtdBCPISS);
		System.out.println(qtdBCPISD + " Double");
		double esperadoqtdBCPIS = 0;
		System.out.println(esperadoqtdBCPIS + " Esperado");
		sucesso.add(mayorQue(qtdBCPISD, esperadoqtdBCPIS));
		System.out.println(mayorQue(qtdBCPISD, esperadoqtdBCPIS) + " QTD. BC PIS");
		
		System.out.println("-------------------------------------------------");
		
		// Valor Conta ICMS ST
		System.out.println(" Valor Conta ICMS ST");
		String valorContaICMSSTS = valorContaICMSST.getText();
		valorContaICMSSTS = valorContaICMSSTS.replace(".", "");
		valorContaICMSSTS = valorContaICMSSTS.replace(",", ".");
		System.out.println(valorContaICMSSTS + " String");
		double valorContaICMSSTD = new Double(valorContaICMSSTS);
		System.out.println(valorContaICMSSTD + " Double");
		double esperadovalorContaICMSST = 0;
		System.out.println(esperadovalorContaICMSST + " Esperado");
		sucesso.add(mayorQue(valorContaICMSSTD, esperadovalorContaICMSST));
		System.out.println(mayorQue(valorContaICMSSTD, esperadovalorContaICMSST) + " Valor Conta ICMS ST");
		/*
		System.out.println("-------------------------------------------------");
		// Valor Conta Difal
		System.out.println("Valor Conta Difal");
		String valorContaDifalS = valorContaDifal.getText();
		valorContaDifalS = valorContaDifalS.replace(".", "");
		valorContaDifalS = valorContaDifalS.replace(",", ".");
		System.out.println(valorContaDifalS+ " String");
		double valorContaDifalD = new Double(valorContaDifalS);
		System.out.println(valorContaDifalD + " Double");
		double esperadovalorContaDifal = 0;
		System.out.println(esperadovalorContaDifal + " Double");
		sucesso.add(mayorQue(valorContaDifalD, esperadovalorContaDifal));
		System.out.println(mayorQue(valorContaDifalD, esperadovalorContaDifal) + " Valor Conta Difal");
		System.out.println("-------------------------------------------------");
		*/
		System.out.println(sucesso);
		
		return sucesso;
	}
}
