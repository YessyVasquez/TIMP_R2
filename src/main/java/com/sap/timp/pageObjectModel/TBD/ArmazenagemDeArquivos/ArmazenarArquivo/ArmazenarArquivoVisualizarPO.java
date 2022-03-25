package com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.ArmazenarArquivo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ArmazenarArquivoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Armazenagem de Arquivos\"]")
	public WebElement armazenagemdearquivos;
	
	@FindBy(xpath = "//span[text()=\"Armazenar Arquivo\"]")
	public WebElement armazenaraarquivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Tipo de Documento\"]")
	public WebElement novo;
	
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;

	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"docType\"]")
	public WebElement tipodedocumentovi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"status\"]")
	public WebElement statusvi;
	
	@FindBy(xpath = "//span[@id=\"classification\"]")
	public WebElement classificacaovi;
	
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement validadedevi;
	
	@FindBy(xpath = "//span[@id=\"validTo\"]")
	public WebElement validadeatevi;
	
	@FindBy(xpath = "//span[@id=\"keyField\"]")
	public WebElement camposchavevi;
	
	@FindBy(xpath = "//span[@id=\"relationshipType\"]")
	public WebElement tipoderelacionamentovi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de documento \"]")
	public WebElement tipodedocumento;
	
	@FindBy(xpath = "//input[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Classificação\"]")
	public WebElement classificacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validadeate;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campos Chaves \"]")
	public WebElement camposchave;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Relacionamento \"]")
	public WebElement tipoderelacionamento;
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	public ArmazenarArquivoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		armazenagemdearquivos.click();
		
		sleep(2000);
		
		armazenaraarquivo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		/*ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		String URL = driver.getCurrentUrl();
		//String idRegistro = idObter1();
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			pesquisar.sendKeys("49");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div"));
			WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			visualizar.click();
			sleep(2000);
			//waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			pesquisar.sendKeys("241");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div"));
			WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			visualizar.click();
			sleep(2000);
			//waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			pesquisar.sendKeys("39");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div"));
			WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			visualizar.click();
			sleep(2000);
		//	waitExpectElement(tipodocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		waitExpectElement(empresavi);
		sleep(2000);
		String empresavisualizar = empresavi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar=tributovi.getText();
		String tipodedocumentovisualizar=tipodedocumentovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String statusvisualizar = statusvi.getText();
		String classificacaovisualizar = classificacaovi.getText();
		String validadedevisualizar = validadedevi.getText();
		String validadeatevisualizar = validadeatevi.getText();
		String camposchavevisualizar = camposchavevi.getText();
		String tipoderelacionamentovisualizar = tipoderelacionamentovi.getText();
		

		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(tipodedocumentovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(statusvisualizar);
		System.out.println(classificacaovisualizar);
		System.out.println(validadedevisualizar);
		System.out.println(validadeatevisualizar);
		System.out.println(camposchavevisualizar);
		System.out.println(tipoderelacionamentovisualizar);
		
		
		
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		armazenagemdearquivos.click();
		sleep(2000);
		armazenaraarquivo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		if(URL.contains("tc2")) {
			// opcao para TC2
			pesquisar.sendKeys("49");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"49\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodedocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(15000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			pesquisar.sendKeys("241");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"241\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodedocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			pesquisar.sendKeys("39");
			pesquisar.sendKeys(Keys.ENTER);
			sleep(4000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"39\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);

			menu.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			waitExpectElement(tipodedocumento);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
		}
		
		//String empresaeditar = empresa.getText();
		//String ufeditar = uf.getText();
		//String filialeditar = filial.getText();
		//String tributoeditar=tributo.getText();
		String tipodedocumentoeditar=tipodedocumento.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String statuseditar = status.getAttribute("value");
		String classificacaoeditar = classificacao.getAttribute("value");
		String validadedeeditar = validadede.getAttribute("value");
		String validadeateeditar = validadeate.getAttribute("value");
		String camposchaveeditar = camposchave.getAttribute("value");
		String tipoderelacionamentoeditar = tipoderelacionamento.getAttribute("value");
		

		//System.out.println(empresaeditar);
		//System.out.println(ufeditar);
		//System.out.println(filialeditar);
		//System.out.println(tributoeditar);
		System.out.println(tipodedocumentoeditar);
		System.out.println(descricaoeditar);
		System.out.println(statuseditar);
		System.out.println(classificacaoeditar);
		System.out.println(validadedeeditar);
		System.out.println(validadeateeditar);
		System.out.println(camposchaveeditar);
		System.out.println(tipoderelacionamentoeditar);
		
		
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//sucesso.add(empresaeditar.contains(empresavisualizar));
		//sucesso.add(ufeditar.contains(ufvisualizar));
		//sucesso.add(filialeditar.contains(filialvisualizar));
		//sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(tipodedocumentoeditar.contains(tipodedocumentovisualizar));
		sucesso.add(descricaoeditar.contains(descricaovisualizar));
		sucesso.add(statuseditar.contains(statusvisualizar));
		sucesso.add(classificacaoeditar.contains(classificacaovisualizar));
		sucesso.add(validadedeeditar.contains(validadedevisualizar));
		sucesso.add(validadeateeditar.contains(validadeatevisualizar));
		sucesso.add(camposchaveeditar.contains(camposchavevisualizar));
		sucesso.add(tipoderelacionamentoeditar.contains(tipoderelacionamentovisualizar));
		
		System.out.println(sucesso);
		
		return sucesso;
	}

}
