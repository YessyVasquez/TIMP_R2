package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1210PagamentosDeRendimientosDoTrabalhoDetalhePO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-paymentsIncomeFromWork\"]")
	public WebElement subMenuPagamentosDeRendimientosDoTrabalho;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	// Datos detalhe
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement idEvento;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement tipoEvento;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement versao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement status;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement logSys;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement tipoAmbiente;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement versaoDoProcesso;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]/div")
	public WebElement inscTipoEvento;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][10]/div[2]/div")
	public WebElement nrInscEvent;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][11]/div[2]/div")
	public WebElement nrRecibo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][12]/div[2]/div")
	public WebElement indicativoApuracao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][13]/div[2]/div")
	public WebElement periodoDeApuracao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][14]/div[2]/div")
	public WebElement processoDeEmissao;
	
	// Datos visualizar
	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[2]/td/span[1]")
	public WebElement idEvento1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[2]/td/span[2]")
	public WebElement empresa1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[3]/td/span[1]")
	public WebElement tipoEvento1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[3]/td/span[2]")
	public WebElement versao1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[4]/td/span[1]")
	public WebElement status1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[4]/td/span[2]")
	public WebElement logSys1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[5]/td/span[1]")
	public WebElement tipoAmbiente1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[5]/td/span[2]")
	public WebElement versaoDoProcesso1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[6]/td/span[1]")
	public WebElement inscTipoEvento1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[6]/td/span[2]")
	public WebElement nrInscEvent1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[7]/td/span[1]")
	public WebElement nrRecibo1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[7]/td/span[2]")
	public WebElement indicativoApuracao1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[8]/td/span[1]")
	public WebElement periodoDeApuracao1;

	@FindBy(xpath = "//tbody[@id=\"multiFields\"]//tr[8]/td/span[2]")
	public WebElement processoDeEmissao1;
	
	public S1210PagamentosDeRendimientosDoTrabalhoDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhe() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);
		
		subMenuPagamentosDeRendimientosDoTrabalho.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1210PagamentosDeRendimientosDoTrabalho");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		System.out.println(idRegistro); // Primer registro que es el que se crea con la automatizacion
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idEventoString = idEvento.getText();
		String empresaString = empresa.getText();
		String tipoEventoString = tipoEvento.getText();
		String versaoString = versao.getText();
		String statuString = status.getText();
		String logSyString = logSys.getText();
		String tipoAmbiendeString = tipoAmbiente.getText();
		String versaoDoProcessoString = versaoDoProcesso.getText();
		String inscTipoEventoString = inscTipoEvento.getText();
		String nrInscEventString = nrInscEvent.getText();
		String nrReciboString = nrRecibo.getText();
		String indicativoApuracaoString = indicativoApuracao.getText();
		String periodoDeApuracaoString = periodoDeApuracao.getText();
		String processoDeEmissaoString = processoDeEmissao.getText();
		
		System.out.println("Id Evento: " + idEventoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("Tipo Evento: " + tipoEventoString);
		System.out.println("Versao: " + versaoString);
		System.out.println("Status: " + statuString);
		System.out.println("LogSys: " + logSyString);
		System.out.println("Tipo Ambiente: " + tipoAmbiendeString);
		System.out.println("Versao do Processo: " + versaoDoProcessoString);
		System.out.println("Insc Tipo Evento: " + inscTipoEventoString);
		System.out.println("Nr Insc Event: " + nrInscEventString);
		System.out.println("Nr Recibo: " + nrReciboString);
		System.out.println("Indicativo Apuracao: " + indicativoApuracaoString);
		System.out.println("Periodo de Apuracao: " + periodoDeApuracaoString);
		System.out.println("Processo de Emissao: " + processoDeEmissaoString);
				
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idEventoString1 = idEvento1.getText();
		String empresaString1 = empresa1.getText();
		String tipoEventoString1 = tipoEvento1.getText();
		String versaoString1 = versao1.getText();
		String statuString1 = status1.getText();
		String logSyString1 = logSys1.getText();
		String tipoAmbiendeString1 = tipoAmbiente1.getText();
		String versaoDoProcessoString1 = versaoDoProcesso1.getText();
		String inscTipoEventoString1 = inscTipoEvento1.getText();
		String nrInscEventString1 = nrInscEvent1.getText();
		String nrReciboString1 = nrRecibo1.getText();
		String indicativoApuracaoString1 = indicativoApuracao1.getText();
		String periodoDeApuracaoString1 = periodoDeApuracao1.getText();
		String processoDeEmissaoString1 = processoDeEmissao1.getText();
		
		System.out.println("---------------------------------------------------");
		System.out.println("Id Evento 1: " + idEventoString1);
		System.out.println("Empresa 1: " + empresaString1);
		System.out.println("Tipo Evento 1: " + tipoEventoString1);
		System.out.println("Versao 1: " + versaoString1);
		System.out.println("Status 1: " + statuString1);
		System.out.println("LogSys 1: " + logSyString1);
		System.out.println("Tipo Ambiente 1: " + tipoAmbiendeString1);
		System.out.println("Versao do Processo 1: " + versaoDoProcessoString1);
		System.out.println("Insc Tipo Evento 1: " + inscTipoEventoString1);
		System.out.println("Nr Insc Event 1: " + nrInscEventString1);
		System.out.println("Nr Recibo 1: " + nrReciboString1);
		System.out.println("Indicativo Apuracao 1: " + indicativoApuracaoString1);
		System.out.println("Periodo de Apuracao 1: " + periodoDeApuracaoString1);
		System.out.println("Processo de Emissao 1: " + processoDeEmissaoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idEventoString1.equals(idEventoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(tipoEventoString1.equals(tipoEventoString));
		sucesso.add(versaoString1.equals(versaoString));
		sucesso.add(statuString1.equals(statuString));
		sucesso.add(logSyString1.equals(logSyString));
		sucesso.add(tipoAmbiendeString1.equals(tipoAmbiendeString));
		sucesso.add(versaoDoProcessoString1.equals(versaoDoProcessoString));
		sucesso.add(inscTipoEventoString1.equals(inscTipoEventoString));
		sucesso.add(nrInscEventString1.equals(nrInscEventString));
		sucesso.add(nrReciboString1.equals(nrReciboString));
		sucesso.add(indicativoApuracaoString1.equals(indicativoApuracaoString));
		sucesso.add(periodoDeApuracaoString1.equals(periodoDeApuracaoString));
		sucesso.add(processoDeEmissaoString1.equals(processoDeEmissaoString));
		System.out.println(sucesso);
		return sucesso;
	}
}
