package com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DashboardParametrosGeraisExcecutarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
	@FindBy(xpath = "//span[text()=\"Dashboard\"]")
	public WebElement dashboards;
	
	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@data-gs-y=\"0\"]/div/div/div/div/p")
	public WebElement etiquetaIndicador;
	
	@FindBy(xpath = "//div[@class=\"left-toolbar-items\"]/ul/li[1]")
	public WebElement executar2;
	
	/*@FindBy(xpath = "//div[@id=\"container-fluid\"]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][2]/*[name()=\"g\"][1]/*[name()=\"g\"][4]/*[name()=\"rect\"]")
	public WebElement grafico;*/
	
//	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
//	public WebElement grafico;
	
	//SI FUNCIONA ESTE XPATH EN TQ1
	@FindBy(xpath = "//div[@id=\"UIComp_1\"]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][2]/*[name()=\"g\"][1]/*[name()=\"g\"][4]/*[name()=\"rect\"]")
	public WebElement grafico;
	
	@FindBy(xpath = "//div[@id=\"UIComp_5\"]/*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][1]/*[name()=\"g\"][2]/*[name()=\"g\"][1]/*[name()=\"g\"][4]/*[name()=\"rect\"]")
	public WebElement grafico11;
	
	
	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/*[1]/*[8]/*[1]/*[4]/*[1]/*[2]/*[1]/*[2]")
	public WebElement grafico2;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[1]/td[2]")
	public WebElement dimensao;
	
	@FindBy(xpath = "//div[@class=\"v-tooltip-mainDiv\"]/table/tr[2]/td[2]")
	public WebElement valoricms;
	
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
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//textarea[@class=\"base-textarea\"]")
	public WebElement textojustificativa;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sem anexo\"]")
	public WebElement semanexo;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	public DashboardParametrosGeraisExcecutarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Executar() {
		
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
		System.out.println(idultimoexecucoes);
		
		dashboards.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Editar --------- " );
		String idRegistro =idObter("dashboardsCriar");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		executar.click();
		sleep(4000);
		sleep(4000);
		
		String valor = etiquetaIndicador.getText();
		System.out.println(valor);
		
		fechar.click();
		
		sleep(2000);
		
		executar2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		waitExpectElement(etiquetaIndicador);
		
		fechar.click();
		sleep(3000);
		
		String valor2 = etiquetaIndicador.getText();
		System.out.println(valor2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int id1 = convertToInt(valor);
		int id2 = convertToInt(valor2);
		
		if (id1 != id2) {
			sucesso.add(true);
		}
		
		System.out.println(sucesso);
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		if (tq1 == true) {


			grafico.click();
			sleep(2000);

		}else if (tc2==true) {

			grafico2.click();
			sleep(2000);
		}else {
			
		}
			
		
		String dimensao1= dimensao.getText();
		String valoricms1=valoricms.getText();
		valoricms1=valoricms1.replace(".", "");
		valoricms1=valoricms1.replace(",", ".");
		System.out.println(dimensao1);
		System.out.println(valoricms1);
		
		sleep(8000);
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
		
		
		
		if (tq1 == true) {

			grafico11.click();
			sleep(2000);

		}else if (tc2==true) {

			grafico2.click();
			sleep(2000);
		}else {
			
			
		}
		
		String dimensao2= dimensao.getText();
		String valoricms2=valoricms.getText();
		valoricms2=valoricms2.replace(".", "");
		valoricms2=valoricms2.replace(",", ".");
		System.out.println(dimensao2);
		System.out.println(valoricms2);
		
		sucesso.add(dimensao1.contains(dimensao2));
		sucesso.add(valoricms1.contains(valoricms2));
		
		System.out.println(sucesso);
		
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
			idInserir("DashboardParametrosGeraisExecutar", idB);
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}
	
}
