package com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class AprovacaoDeDocumentosVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Armazenagem de Arquivos\"]")
	public WebElement armazenagemdearquivos;
	
	
	@FindBy(xpath = "//span[text()=\"Aprovação de Documentos\"]")
	public WebElement aprovacaodocumentos;
	
	
	
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	

	@FindBy(xpath = "//span[@id=\"docType\"]")
	public WebElement tipodedocumentovi;
	@FindBy(xpath = "//span[@id=\"docTypeDescription\"]")
	public WebElement descricaovi;
	@FindBy(xpath = "//span[@id=\"fileName\"]")
	public WebElement nomedoarquivovi;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	@FindBy(xpath = "//span[@id=\"status\"]")
	public WebElement statusvi;
	@FindBy(xpath = "//span[@id=\"classification\"]")
	public WebElement classificacaovi;
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement validadedevi;
	@FindBy(xpath = "//span[@id=\"validTo\"]")
	public WebElement validadeatevi;
	@FindBy(xpath = "//span[@id=\"comments\"]")
	public WebElement comentariovi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de documento \"]")
	public WebElement tipodedocumento;
	@FindBy(xpath = "//input[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Nome do arquivo\"]")
	public WebElement nomedoarquivo;
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"multipleControlerId-0001\"]")
	public WebElement filial;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Status\"]")
	public WebElement status;
	@FindBy(xpath = "//input[@placeholder=\"Classificação\"]")
	public WebElement classificacao;
	@FindBy(xpath = "//input[@placeholder=\"Validade De\"]")
	public WebElement validadede;
	@FindBy(xpath = "//input[@placeholder=\"Validade Até\"]")
	public WebElement validadeate;
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Comentários\"]")
	public WebElement comentario;

	
	
	public AprovacaoDeDocumentosVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		armazenagemdearquivos.click();
		sleep(2000);
		aprovacaodocumentos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AprovacaoDeDocumentosCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tipodedocumentovisualizar = tipodedocumentovi.getText();
		String descricaovisualizar = descricaovi.getText();
		String nomedoarquivovisualizar = nomedoarquivovi.getText();
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String statusvisualizar = statusvi.getText();
		String classificacaovisualizar = classificacaovi.getText();
		String validadedevisualizar = validadedevi.getText();
		String validadeatevisualizar = validadeatevi.getText();
		String comentariovisualizar = comentariovi.getText();
	
		System.out.println(tipodedocumentovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(nomedoarquivovisualizar);
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(statusvisualizar);
		System.out.println(classificacaovisualizar);
		System.out.println(validadedevisualizar);
		System.out.println(validadeatevisualizar);
		System.out.println(comentariovisualizar);
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("AprovacaoDeDocumentosCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	//    waitExpectElement(biblioteca);
	    sleep(25000);
	    sleep(25000);
	    sleep(16000);
	    System.out.println("-----------------------");
	    String tipodedocumentoeditar = tipodedocumento.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String nomedoarquivoeditar = nomedoarquivo.getAttribute("value");
		String empresaeditar = empresa.getText();
		//String filialeditar = filial.getText();
		String statuseditar = status.getAttribute("value");
		String classificacaoeditar = classificacao.getAttribute("value");
		String validadedeeditar = validadede.getAttribute("value");
		String validadeateeditar = validadeate.getAttribute("value");
		String comentarioeditar = comentario.getAttribute("value");
	
		System.out.println(tipodedocumentoeditar);
		System.out.println(descricaoeditar);
		System.out.println(nomedoarquivoeditar);
		System.out.println(empresaeditar);
		//System.out.println(filialeditar);
		System.out.println(statuseditar);
		System.out.println(classificacaoeditar);
		System.out.println(validadedeeditar);
		System.out.println(validadeateeditar);
		System.out.println(comentarioeditar);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tipodedocumentoeditar.contains(tipodedocumentovisualizar));
		sucesso.add(descricaoeditar.contains(descricaovisualizar));
		sucesso.add(nomedoarquivoeditar.contains(nomedoarquivovisualizar));
		sucesso.add(empresaeditar.contains(empresavisualizar));
	//	sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(statuseditar.contains(statusvisualizar));
		sucesso.add(classificacaoeditar.contains(classificacaovisualizar));
		sucesso.add(validadedeeditar.contains(validadedevisualizar));
		sucesso.add(validadeateeditar.contains(validadeatevisualizar));
		sucesso.add(comentarioeditar.contains(comentariovisualizar));
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}


}
