package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.EliminacoesDaConsolidacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class EliminacoesDaConsolidacaVisualizarPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Eliminações da Consolidação\"]")
	public WebElement eliminacoeDaConsolidacao;
	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idD1;
	@FindBy(xpath = "//span[@id=\"consolidationArea\"]")
	public WebElement areadeConsolidacaoD1;
	@FindBy(xpath = "//span[@id=\"society\"]")
	public WebElement sociedadeD1;
	@FindBy(xpath = "//span[@id=\"item\"]")
	public WebElement itemD1;
	@FindBy(xpath = "//span[@id=\"numBusinessPartnerSociety\"]")
	public WebElement numParceiradeNegociosD1;
	@FindBy(xpath = "//span[@id=\"periodicValueInCurrencyArea\"]")
	public WebElement valorPeriodicoenMonedaD1;
	@FindBy(xpath = "//span[@id=\"documentType\"]")
	public WebElement tipoDocumentoD1;
	@FindBy(xpath = "//span[@id=\"competence\"]")
	public WebElement competenciaD1;
	
	
	//DATOS DEL EDITAR
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idD2;
	@FindBy(xpath = "//div[@id=\"consolidationArea\"]/div/div/input")
	public WebElement areadeConsolidacaoD2;
	@FindBy(xpath = "//div[@id=\"society\"]/div/div/input")
	public WebElement sociedadeD2;
	@FindBy(xpath = "//div[@id=\"item\"]/div/div/input")
	public WebElement itemD2;
	@FindBy(xpath = "//div[@id=\"numBusinessPartnerSociety\"]/div/div/input")
	public WebElement numParceiradeNegociosD2;
	@FindBy(xpath = "//div[@id=\"periodicValueInCurrencyArea\"]/div/div/input")
	public WebElement valorPeriodicoenMonedaD2;
	@FindBy(xpath = "//div[@id=\"documentType\"]/div/div/input")
	public WebElement tipoDocumentoD2;
	@FindBy(xpath = "//div[@id=\"competence\"]/div/div/input")
	public WebElement competenciaD2;	
		
		

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public EliminacoesDaConsolidacaVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizarElimacoeDaConsolidacao() {
		
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		eliminacoeDaConsolidacao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//IMPRIMIR VALORES DEL VISUALIZAR
		String idValor1 = idD1.getText();
		String areadeConsolidacaoValor1 = areadeConsolidacaoD1.getText();
		areadeConsolidacaoValor1 = areadeConsolidacaoValor1.replace("-", ""); // Reemplazo los espacios por nada para que quedee igual en visualizar y editar
		
		String sociedadeValor1 = sociedadeD1.getText();
		sociedadeValor1 = sociedadeValor1.replace("-", "");
		
		String itemValor1 = itemD1.getText();
		itemValor1 = itemValor1.replace("-", "");
		
		String numSociedadePerceiraNegociosValor1 = numParceiradeNegociosD1.getText();
		numSociedadePerceiraNegociosValor1 = numSociedadePerceiraNegociosValor1.replace("-", "");
		
		String valorPeriodicoenMonedaValor1 = valorPeriodicoenMonedaD1.getText();
		valorPeriodicoenMonedaValor1 = valorPeriodicoenMonedaValor1.replace("-", "");
		
		String tipoDocumentoValor1 = tipoDocumentoD1.getText();
		tipoDocumentoValor1 = tipoDocumentoValor1.replace("-", "");
		
		String competenciaValor1 = competenciaD1.getText();
		
		
		System.out.println("******DATOS DEL Visualizar******");
		System.out.println("ID:" + idValor1);
		System.out.println(" Área de Consolidação:" + areadeConsolidacaoValor1);
		System.out.println(" Sociedade" + sociedadeValor1);
		System.out.println(" Itemp:" + itemValor1);
		System.out.println(" Nº sociedade parceira de negócios:" + numSociedadePerceiraNegociosValor1);
		System.out.println(" Valor Periódico em moeda da Área:" + valorPeriodicoenMonedaValor1);
		System.out.println(" Tipo de Documento:" + tipoDocumentoValor1);
		System.out.println(" Competencia:" + competenciaValor1);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//IMPRIMIR VALORES DEL EDITAR
		//String idValor = idD2.getText();
		String areadeConsolidacaoValor = areadeConsolidacaoD2.getAttribute("value");
		String sociedadeValor = sociedadeD2.getAttribute("value");
		String itemValor = itemD2.getAttribute("value");
		String numSociedadePerceiraNegociosValor = numParceiradeNegociosD2.getAttribute("value");
		String valorPeriodicoenMonedaValor = valorPeriodicoenMonedaD2.getAttribute("value");
		String tipoDocumentoValor = tipoDocumentoD2.getAttribute("value");
		String competenciaValor = competenciaD2.getAttribute("value");
		
		System.out.println("");
		System.out.println("******DATOS DEL EDITAR******");
		//System.out.println("ID:" + idValor);
		System.out.println(" Área de Consolidação:" + areadeConsolidacaoValor);
		System.out.println(" Sociedade" + sociedadeValor);
		System.out.println(" Itemp:" + itemValor);
		System.out.println(" Nº sociedade parceira de negócios:" + numSociedadePerceiraNegociosValor);
		System.out.println(" Valor Periódico em moeda da Área:" + valorPeriodicoenMonedaValor);
		System.out.println(" Tipo de Documento:" + tipoDocumentoValor);
		System.out.println(" Competencia:" + competenciaValor);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//sucesso.add(idValor.equals(idValor1));
		sucesso.add(areadeConsolidacaoValor.equals(areadeConsolidacaoValor1));
		sucesso.add(sociedadeValor.equals(sociedadeValor1));
		sucesso.add(itemValor.equals(itemValor1));
		sucesso.add(numSociedadePerceiraNegociosValor.equals(numSociedadePerceiraNegociosValor1));
		sucesso.add(valorPeriodicoenMonedaValor.equals(valorPeriodicoenMonedaValor1));
		sucesso.add(tipoDocumentoValor.equals(tipoDocumentoValor1));
		sucesso.add(competenciaValor.equals(competenciaValor1));
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
}
