package com.sap.timp.pageObjectModel.TDK.Kpis;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseSteven;

public class KpisExecutarAtualizarJutisficativaGravarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;
	
	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupotp1;
	
	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement colunas;
	
	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;
	
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"indicator-card-container\"]")
	public WebElement cartaoindicador;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	@FindBy(xpath = "//span[text()=\"Atualização\"]")
	public WebElement atualizacao;
	
	@FindBy(xpath = "//div[@class=\"widgets actualizate-select\"]/div/div/div[2]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div[2]")
	public WebElement opcaonome;
	
	@FindBy(xpath = "//div[@class=\"timeType actualizate-select\"]/div/div/div[2]")
	public WebElement tipo;
	
	@FindBy(xpath = "//li[@id][text()=\"Segundos\"]")
	public WebElement opcaotipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a Periodicidade\"]")
	public WebElement periodicidade;
	
	@FindBy(xpath = "//span[text()=\"Pare a Atualização\"]")
	public WebElement pararatualizacao;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//textarea[@class=\"base-textarea\"]")
	public WebElement textojustificativa;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	//@FindBy(xpath = "//div[@id=\"UIComp_1\"]/*[1]/*[8]/*[1]/*/*/*[2]/*/*[2]")
	//@FindBy(xpath = "//div[@data-gs-height=\"5\"]/div[1]/div/div[2]/div/div/div/div/div/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[2]")
	//@FindBy(xpath = "//div[contains(@id,\"UIComp_\")]//*[1]/*[8]/*[1]/*/*/*[2]/*/*[2]")
	//@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
	@FindBy(xpath = "//*[name()=\"g\" and @class=\"v-datapoint-group\"]/*[name()=\"g\"]/*[name()=\"g\" and @data-id][4]")
	public WebElement quartacolunagrafico;
	
	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
	public WebElement quartocolunagraficotc2;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[1]/td[2]")
	public WebElement dimensao;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[2]/td[2]")
	public WebElement valoricms;
	
	@FindBy(xpath = "//button[text()=\"Sem anexo\"]")
	public WebElement semanexo;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	public KpisExecutarAtualizarJutisficativaGravarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> executar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		String idultimoexecucoes = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("KpisCriar");
	
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	//	waitExpectElement(cartaoindicador);
		sleep(10000);
		
		fechar.click();
		
		sleep(2000);
		
		//String valorcartãoindicador= driver.findElement(By.xpath("//div[@id=\"indicator-card-container\"]/div/p")).getText();
		executarElement.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		fechar.click();
		sleep(2000);
		//String valorcartãoindicadorposexecutar= driver.findElement(By.xpath("//div[@id=\"indicator-card-container\"]/div/p")).getText();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		quartacolunagrafico.click();
		sleep(2000);
		
		String dimensao1= dimensao.getText();
		String valoricms1=valoricms.getText();
		valoricms1=valoricms1.replace(".", "");
		valoricms1=valoricms1.replace(",", ".");
		System.out.println(dimensao1);
		System.out.println(valoricms1);
		
		
		sleep(2000);
		atualizacao.click();
		
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		nome.click();
		sleep(2000);
		opcaonome.click();
		sleep(2000);
		closeSelectTypeCheckbox(nome);
		tipo.click();
		sleep(2000);
		opcaotipo.click();
		sleep(2000);
		periodicidade.sendKeys("15");
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		pararatualizacao.click();
		sleep(2000);
		waitExpectElement(mensagem);
		sleep(2000);
		quartacolunagrafico.click();
		sleep(2000);
		
		String dimensao2= dimensao.getText();
		String valoricms2=valoricms.getText();
		valoricms2=valoricms2.replace(".", "");
		valoricms2=valoricms2.replace(",", ".");
		System.out.println(dimensao2);
		System.out.println(valoricms2);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(dimensao1.contains(dimensao2));
		sucesso.add(valoricms1.contains(valoricms2));
		
		justificativa.click();
		
		sleep(2000);
		
		textojustificativa.sendKeys("Testeautomatizado");
		
		sleep(2000);
		
		waitExpectElement(Aceitar);
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		Gravar.click();
		sleep(2000);
		waitExpectElement(semanexo);
		sleep(2000);
		semanexo.click();
		sleep(2000);
		waitExpectElement(confirmar);
		sleep(2000);
		confirmar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(executarElement);
		sleep(2000);
		
		int mensagem = driver.findElements(By.xpath("//span[@id=\"textLabel\"]")).size();
		
		
		
		if (mensagem > 0) {
			System.out.println("Execução salva com sucesso");
			sucesso.add(true);
			
		}else {
			System.out.println("Execução não salva com sucesso");
			sucesso.add(false);
		}
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
	

		System.out.println(idultimoexecucoes);
		System.out.println(idB);
		double idD = convertToDouble(idultimoexecucoes);
		double idBD = convertToDouble(idB);
		
		
		if (idBD > idD) {
			idInserir("KpisExecutarAtualizarJustificativaGravar", idB);
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
