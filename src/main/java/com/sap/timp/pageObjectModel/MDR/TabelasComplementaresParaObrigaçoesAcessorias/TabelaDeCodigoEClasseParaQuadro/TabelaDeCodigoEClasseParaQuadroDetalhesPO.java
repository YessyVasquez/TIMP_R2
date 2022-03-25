package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeCodigoEClasseParaQuadroDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Código e Classe para Quadro 12\"]")
	public WebElement tabeladecodigoeclasseparaquadro;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement origem;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement codigo12;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement classe;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement vencimento;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement data;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaovi;
	
	@FindBy(xpath = "//span[@id=\"dimeCode\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"origin\"]")
	public WebElement origemvi;
	
	@FindBy(xpath = "//span[@id=\"code12\"]")
	public WebElement codigo12vi;
	
	@FindBy(xpath="//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"class\"]")
	public WebElement classevi;
	
	@FindBy(xpath = "//span[@id=\"expiration\"]")
	public WebElement vencimentovi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	public TabelaDeCodigoEClasseParaQuadroDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladecodigoeclasseparaquadro.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeCodigoEClasseParaQuadro");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String obrigacaodetalhes = obrigacao.getText();
		String codigodetalhes = codigo.getText();
		String origemdetalhes = origem.getText();
		String codigo12detalhes = codigo12.getText();
		String descricaodetalhes = descricao.getText();
		String classedetalhes = classe.getText();
		String vencimentodetalhes = vencimento.getText();
		String datadetalhes = data.getText();
		
		
		System.out.println(obrigacaodetalhes);
		System.out.println(codigodetalhes);
		System.out.println(origemdetalhes);
		System.out.println(codigo12detalhes);
		System.out.println(descricaodetalhes);
		System.out.println(classedetalhes);
		System.out.println(vencimentodetalhes);
		System.out.println(datadetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String obrigacaovisualizar = obrigacaovi.getText();
		String codigovisualizar = codigovi.getText();
		String origemvisualizar = origemvi.getText();
		String codigo12visualizar = codigo12vi.getText();
		String descricaovisualizar = descricaovi.getText();
		String classevisualizar = classevi.getText();
		String vencimentovisualizar = vencimentovi.getText();
		String datavisualizar = datavi.getText();
		
		
		System.out.println(obrigacaovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(origemvisualizar);
		System.out.println(codigo12visualizar);
		System.out.println(descricaovisualizar);
		System.out.println(classevisualizar);
		System.out.println(vencimentovisualizar);
		System.out.println(datavisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacaovisualizar.equals(obrigacaodetalhes));
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(origemvisualizar.equals(origemdetalhes));
		sucesso.add(codigo12visualizar.equals(codigo12detalhes));
		sucesso.add(descricaovisualizar.equals(descricaodetalhes));
		sucesso.add(classevisualizar.equals(classedetalhes));
		sucesso.add(vencimentovisualizar.equals(vencimentodetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		
		return sucesso;
	}

}
