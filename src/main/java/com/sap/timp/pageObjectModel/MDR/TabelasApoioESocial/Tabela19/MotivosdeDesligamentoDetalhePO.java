package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class MotivosdeDesligamentoDetalhePO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 19 - Motivos de Desligamento\"]")
	public WebElement tabela19;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	String url = driver.getCurrentUrl();
	
	public MotivosdeDesligamentoDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelaApoio.click();
		sleep(1000);
		
		tabela19.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = idObter("MotivosdeDesligamento");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement accion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		sleep(1000);
		menu.click();
		sleep(1000);
		accion.click();
		sleep(2000);
		
		// Datos de Dealhes
		String codigo = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[2]/div/div")).getText().trim();
		String descricao = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[3]/div/div")).getText().trim();
		String validadeDe = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[4]/div/div")).getText().trim();
		String historicoCriacao = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[6]/div/div[1]")).getText().trim();
		String historicoEdicao = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[6]/div/div[1]")).getText().trim();
		
		System.out.println("------------------------DATOS DE DETALHES-------------------------");
		System.out.println("Codigo: " + codigo);
		System.out.println("Descricao: " + descricao);
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
		String codigo1 = driver.findElement(By.xpath("//td[@id=\"code\"]/span")).getText().trim();
		String descricao1 = driver.findElement(By.xpath("//td[@id=\"description\"]/span")).getText().trim();
		String validadeDe1 = driver.findElement(By.xpath("//td[@id=\"effectiveDateFrom\"]/span")).getText().trim();
		
		System.out.println("------------------------DATOS DE VISUALIZAR-------------------------");
		System.out.println("Codigo: " + codigo1);
		System.out.println("Descricao: " + descricao1);
		System.out.println("Validade De: " + validadeDe1);
		System.out.println("");
		
		sucesso.add(codigo1.equals(codigo));
		sucesso.add(descricao1.equals(descricao));
		sucesso.add(validadeDe1.equals(validadeDe));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
