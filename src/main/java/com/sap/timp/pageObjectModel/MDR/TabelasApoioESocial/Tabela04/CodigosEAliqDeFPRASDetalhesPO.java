package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigosEAliqDeFPRASDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 04 - Códigos e Alíq. de FPAS\"]")
	public WebElement tabela04;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	String url = driver.getCurrentUrl();
	
	public CodigosEAliqDeFPRASDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelaApoio.click();
		sleep(1000);
		
		tabela04.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = idObter("CodigosEAliqDeFPRAS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement accion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		sleep(1000);
		menu.click();
		sleep(1000);
		accion.click();
		sleep(2000);
		
		// Datos de Dealhes
		String codigoFPAS = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[2]/div/div")).getText().trim();
		String descricaoDasAtividades = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[3]/div/div")).getText().trim();
		String baseDeCalculo = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[4]/div/div")).getText().trim();
		String entidade = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[5]/div/div")).getText().trim();
		String situacaoDoContribuinte = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[6]/div/div")).getText().trim();
		String combinacaoDeDosCodigos = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[7]/div/div")).getText().trim();
		String codigoDeTerceiros = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[8]/div/div")).getText().trim();
		String aliquota = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[9]/div/div")).getText().trim();
		String validadeDe = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[10]/div/div")).getText().trim();
		String historicoCriacao = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[12]/div/div[1]")).getText().trim();
		String historicoEdicao = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[12]/div/div[1]")).getText().trim();
		
		System.out.println("------------------------DATOS DE DETALHES-------------------------");
		System.out.println("Codigo FPAS: " + codigoFPAS);
		System.out.println("Descricao das Atividades: " + descricaoDasAtividades);
		System.out.println("Base de Calculo: " + baseDeCalculo);
		System.out.println("Entidade: " + entidade);
		System.out.println("Situação do Contribuinte: " + situacaoDoContribuinte);
		System.out.println("Combinação de dos Códigos de Terceiros: " + combinacaoDeDosCodigos);
		System.out.println("Codigo de Terceiros: " + codigoDeTerceiros);
		System.out.println("Validade De: " + validadeDe);
		System.out.println("Historico criacao: " + historicoCriacao);
		System.out.println("Historico edicao: " + historicoEdicao);
		System.out.println("");
		
		String verificarHistoricoCriacao = "";
		String verificarHistoricoEdicao = "";
		
		if(url.contains("tp1") || url.contains("tc2")) {
			verificarHistoricoCriacao = "TESTEAUTOMATIZADO TESTEAUTOMATIZADO, " + fechaActual();
			verificarHistoricoEdicao = "TESTEAUTOMATIZADO TESTEAUTOMATIZADO, " + fechaActual();
		}else {
			verificarHistoricoCriacao = "TESTE AUTOMATIZADO, " + fechaActual();
			verificarHistoricoEdicao = "TESTE AUTOMATIZADO, " + fechaActual();
		}
		
		System.out.println("Verificar historico criacao: " + verificarHistoricoCriacao);		
		System.out.println("Verificar historico edicao: " + verificarHistoricoEdicao);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(historicoCriacao.contains(verificarHistoricoCriacao) && historicoEdicao.contains(verificarHistoricoEdicao)) {
			System.out.println("Historifco verificado...");
			sucesso.add(true);
		}else {
			System.out.println("No se pudo verificar el historico....");
			sucesso.add(false);
			
			return sucesso;
		}
		
		btnCerrar.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		accion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(1000);
		menu.click();
		sleep(1000);
		accion.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Visualizar
		String codigoFPAS1 = driver.findElement(By.xpath("//td[@id=\"fpasCode\"]/span")).getText().trim();
		String descricaoDasAtividades1 = driver.findElement(By.xpath("//td[@id=\"activityDescription\"]/span")).getText().trim();
		String baseDeCalculo1 = driver.findElement(By.xpath("//td[@id=\"calculationBase\"]/span")).getText().trim();
		String entidade1 = driver.findElement(By.xpath("//td[@id=\"entity\"]/span")).getText().trim();
		String situacaoDoContribuinte1 = driver.findElement(By.xpath("//td[@id=\"contributorStatus\"]/span")).getText().trim();
		String combinacaoDeDosCodigos1 = driver.findElement(By.xpath("//td[@id=\"combinationCodes\"]/span")).getText().trim();
		String codigoDeTerceiros1 = driver.findElement(By.xpath("//td[@id=\"thirdCodes\"]/span")).getText().trim();
		String aliquota1 = driver.findElement(By.xpath("//td[@id=\"aliquota\"]/span")).getText().trim();
		String validadeDe1 = driver.findElement(By.xpath("//td[@id=\"effectiveDateFrom\"]/span")).getText().trim();
		
		System.out.println("------------------------DATOS DE VISUALIZAR-------------------------");
		System.out.println("Codigo FPAS: " + codigoFPAS1);
		System.out.println("Descricao das Atividades: " + descricaoDasAtividades1);
		System.out.println("Base de Calculo: " + baseDeCalculo1);
		System.out.println("Entidade: " + entidade1);
		System.out.println("Situação do Contribuinte: " + situacaoDoContribuinte1);
		System.out.println("Combinação de dos Códigos de Terceiros: " + combinacaoDeDosCodigos1);
		System.out.println("Codigo de Terceiros: " + codigoDeTerceiros1);
		System.out.println("Validade De: " + validadeDe1);
		System.out.println("");
		System.out.println("");
		
		sucesso.add(codigoFPAS1.equals(codigoFPAS));
		sucesso.add(descricaoDasAtividades1.equals(descricaoDasAtividades));
		sucesso.add(baseDeCalculo1.equals(baseDeCalculo));
		sucesso.add(entidade1.equals(entidade));
		sucesso.add(situacaoDoContribuinte1.equals(situacaoDoContribuinte));
		sucesso.add(combinacaoDeDosCodigos1.equals(combinacaoDeDosCodigos));
		sucesso.add(codigoDeTerceiros1.equals(codigoDeTerceiros));
		sucesso.add(aliquota1.equals(aliquota));
		sucesso.add(validadeDe1.equals(validadeDe));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
