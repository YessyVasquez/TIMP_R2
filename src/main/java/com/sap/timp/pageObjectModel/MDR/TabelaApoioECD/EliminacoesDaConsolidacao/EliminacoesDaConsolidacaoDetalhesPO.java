package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.EliminacoesDaConsolidacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class EliminacoesDaConsolidacaoDetalhesPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Eliminações da Consolidação\"]")
	public WebElement eliminacoeDaConsolidacao;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	//*[@id="list"]/div/div/div[1]/div/div[3]/div/div[3]
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
		
	@FindBy(xpath = "//li/span[text()=\"Detalhes\"]")
	public WebElement detalhe;
	
	//DATOS DEL DETALLE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement areadeConsolidacaoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement sociedadeD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement itemD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement numParceiradeNegociosD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement valorPeriodicoenMonedaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tipoDocumentoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement competenciaD;
	
	
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
	
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	
	public EliminacoesDaConsolidacaoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalheElimacoeDaConsolidacao() {
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
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//IMPRIMIR VALORES DEL DETALLE
		String idValor = idD.getText();
		String areadeConsolidacaoValor = areadeConsolidacaoD.getText();
		String sociedadeValor = sociedadeD.getText();
		String itemValor = itemD.getText();
		String numSociedadePerceiraNegociosValor = numParceiradeNegociosD.getText();
		String valorPeriodicoenMonedaValor = valorPeriodicoenMonedaD.getText();
		String tipoDocumentoValor = tipoDocumentoD.getText();
		String competenciaValor = competenciaD.getText();
		
		
		System.out.println("******DATOS DEL DETALHE******");
		System.out.println("ID:" + idValor);
		System.out.println(" Área de Consolidação:" + areadeConsolidacaoValor);
		System.out.println(" Sociedade" + sociedadeValor);
		System.out.println(" Itemp:" + itemValor);
		System.out.println(" Nº sociedade parceira de negócios:" + numSociedadePerceiraNegociosValor);
		System.out.println(" Valor Periódico em moeda da Área:" + valorPeriodicoenMonedaValor);
		System.out.println(" Tipo de Documento:" + tipoDocumentoValor);
		System.out.println(" Competencia:" + competenciaValor);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
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
		//valorPeriodicoenMonedaValor1 = valorPeriodicoenMonedaValor1.replace("-", "");
		
		String tipoDocumentoValor1 = tipoDocumentoD1.getText();
		tipoDocumentoValor1 = tipoDocumentoValor1.replace("-", "");
		
		String competenciaValor1 = competenciaD1.getText();
		
		
		System.out.println("******DATOS DEL DETALHE******");
		System.out.println("ID:" + idValor1);
		System.out.println(" Área de Consolidação:" + areadeConsolidacaoValor1);
		System.out.println(" Sociedade" + sociedadeValor1);
		System.out.println(" Itemp:" + itemValor1);
		System.out.println(" Nº sociedade parceira de negócios:" + numSociedadePerceiraNegociosValor1);
		System.out.println(" Valor Periódico em moeda da Área:" + valorPeriodicoenMonedaValor1);
		System.out.println(" Tipo de Documento:" + tipoDocumentoValor1);
		System.out.println(" Competencia:" + competenciaValor1);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idValor1.equals(idValor));
		sucesso.add(areadeConsolidacaoValor1.equals(areadeConsolidacaoValor));
		sucesso.add(sociedadeValor1.equals(sociedadeValor));
		sucesso.add(itemValor1.equals(itemValor));
		sucesso.add(numSociedadePerceiraNegociosValor1.equals(numSociedadePerceiraNegociosValor));
		sucesso.add(valorPeriodicoenMonedaValor1.equals(valorPeriodicoenMonedaValor));
		sucesso.add(tipoDocumentoValor1.equals(tipoDocumentoValor));
		sucesso.add(competenciaValor1.equals(competenciaValor));
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
}
