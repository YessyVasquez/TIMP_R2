package com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasdeAuditoriaN1EdiçãoSimulaPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N1\"]")
	public WebElement regrasdeauditorian1;
	
	@FindBy(xpath = "//span[text()=\"Simulação\"]")
	public WebElement simulacao;
	
	@FindBy(xpath = "//span[text()=\"Simular\"]")
	public WebElement simular;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement fil;
	
	@FindBy(xpath = "//button[text()=\"Associar Tabela\"]")
	public WebElement asociarTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione campo\"]")
	public WebElement inputSeleccionfiltro;
	
	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED) (ED)\"][1]")
	public WebElement seleccionFiltro;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//li[text()=\"Apresent. Treinamento 4\"]")
	public WebElement selectEstrutura;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[text()=\"≠\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div/div[2]/div[3]/div/div/input")
	public WebElement constatante;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[@class=\"graph-wrapper\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"][5]")
	public WebElement CFOP2;
	
	@FindBy(xpath = "//span[text()=\"Dados\"]")
	public WebElement dados;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//button[@id=\"delete-btn\"]")
	public WebElement excluirFil;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//p[@id=\"pie-text\"]")
	public WebElement grafico;
	
	@FindBy(xpath = "//span[text()=\"Configuração\"]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[text()=\"Selecionar todos\"]")
	public WebElement selectTodos;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	public RegrasdeAuditoriaN1EdiçãoSimulaPO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean editar() {
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	regrasdeauditorian1.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	String idRegistro = idObter("An1");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	waitExpectElement(simulacao);
	simulacao.click();
	sleep(4000);
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	
	
	waitExpectElement(CFOP);
	sleep(8000);
	CFOP.click();
	sleep(5000);
	
	dados.click();

	sleep(4000);
	
	ok.click();
	sleep(2000);
	
	fil.click();
	
	sleep(3000);
	
	inputSeleccionfiltro.click();
	sleep(3000);
	seleccionFiltro.click();
	sleep(3000);
	sleep(3000);
	
	operador.click();
	sleep(2000);
	opcOperador.click();
	sleep(4000);
	

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
	if(tq1 == true) {
		constatante.sendKeys("10");
		sleep(3000);
	}else {
		constatante.sendKeys("12");
		sleep(3000);
	}
	
	
	
	aplicar.click();
	
	sleep(4000);
	
	simular.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(3000);
	
	waitExpectElement(grafico);
	sleep(3000);
	
	String graf1 = grafico.getText();
	System.out.println("grafico 1: "+graf1);
	
	configuracao.click();
	sleep(3000);
	
	selectTodos.click();
	sleep(3000);
	
	dados.click();
	sleep(3000);
	
	ok.click();
	sleep(3000);
	
	fil.click();
	sleep(4000);
	
	excluirFil.click();
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	
	simular.click();
	sleep(3000);
	
	
	
	waitExpectElement(grafico);
	sleep(3000);
	
	String graf2 = grafico.getText();
	
	
	System.out.println("--------------------------------");
	System.out.println("grafico 2: "+graf2);
	

	
	boolean sucesso = true;
	System.out.println(sucesso);
	return sucesso;
}

}
