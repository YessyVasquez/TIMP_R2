package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContratoIOFVisualizarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"]/div/div[3]/button[2]")
	//@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath = "//span[@id=\"contractNumber\"]")
	public WebElement contratovi;
	
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoreceitavi;
	
	@FindBy(xpath = "//span[@id=\"personType\"]")
	public WebElement tipopessoavi;
	
	@FindBy(xpath = "//span[@id=\"cpf\"]")
	public WebElement cpfvi;
	
	@FindBy(xpath = "//span[@id=\"variation\"]")
	public WebElement variacaovi;
	
	@FindBy(xpath = "//span[@id=\"socialReason\"]")
	public WebElement razaosocialvi;
	
	@FindBy(xpath = "//span[@id=\"periodicity\"]")
	public WebElement periodicidadevi;
	
	@FindBy(xpath = "//span[@id=\"coin\"]")
	public WebElement moedavi;
	
	@FindBy(xpath = "//span[@id=\"contractValue\"]")
	public WebElement valordecontratovi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"contractNumber\"]/div/div[1]/input")
	public WebElement contratoed;
	
	@FindBy(xpath = "//div[@id=\"revenueCode\"]/div/div[1]/div/input")
	public WebElement codigoreceitaed;
	
	@FindBy(xpath = "//div[@id=\"personType\"]/div/div[1]/div/input")
	public WebElement tipopessoaed;
	
	@FindBy(xpath = "//div[@id=\"cpf\"]/div/div/input")
	public WebElement cpfed;
	
	@FindBy(xpath = "//div[@id=\"variation\"]/div/div/input")
	public WebElement variacaoed;
	
	@FindBy(xpath = "//div[@id=\"socialReason\"]/div/div/input")
	public WebElement razaosocialed;
	
	@FindBy(xpath = "//div[@id=\"periodicity\"]/div/div/div[1]/input")
	public WebElement periodicidadeed;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div/input")
	public WebElement moedaed;
	
	@FindBy(xpath = "//div[@id=\"contractValue\"]/div/div/input")
	public WebElement valordecontratoed;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement dataed;

//	@FindBy(xpath ="//*[@id=\"table\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[2]/span[2]")
//	public WebElement visualizar;
	
	
	public ContratoIOFVisualizarPO() {
		PageFactory.initElements(driver, this);
	}	
	
	
	public ArrayList<Boolean> visualizar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("ContratoIOF");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		
		String contratovisualizar = contratovi.getText();
		String codigoreceitavisualizar = codigoreceitavi.getText();
		String tipopessoavisualizar = tipopessoavi.getText();
		String cpfvisualizar = cpfvi.getText();
		String variacaovisualizar =variacaovi.getText();
		String razaosocialvisualizar= razaosocialvi.getText();
		String periodicidadevisualizar = periodicidadevi.getText();
		String moedavisualizar = moedavi.getText();
		String valordecontratovisualizar = valordecontratovi.getText();
		String datavisualizar = datavi.getText();
				
		System.out.println(contratovisualizar);
		System.out.println(codigoreceitavisualizar);
		System.out.println(tipopessoavisualizar);
		System.out.println(cpfvisualizar);
		System.out.println(variacaovisualizar);
		System.out.println(razaosocialvisualizar);
		System.out.println(periodicidadevisualizar);
		System.out.println(moedavisualizar );
		System.out.println(valordecontratovisualizar);
		System.out.println(datavisualizar);
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ContratoIOF");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
	
		String contratoeditar = contratoed.getAttribute("value");
		String codigoreceitaeditar = codigoreceitaed.getAttribute("value");
		String tipopessoaeditar = tipopessoaed.getAttribute("value");
		String cpfeditar = cpfed.getAttribute("value");
		String variacaoeditar =variacaoed.getAttribute("value");
		String razaosocialeditar= razaosocialed.getAttribute("value");
		String periodicidadeeditar = periodicidadeed.getAttribute("value");
		String moedaeditar = moedaed.getAttribute("value");
		String valordecontratoeditar = valordecontratoed.getAttribute("value");
		String dataeditar = dataed.getAttribute("value");
		
		System.out.println("=========================================");
				
		System.out.println(contratoeditar);
		System.out.println(codigoreceitaeditar);
		System.out.println(tipopessoaeditar);
		System.out.println(cpfeditar);
		System.out.println(variacaoeditar);
		System.out.println(razaosocialeditar);
		System.out.println(periodicidadeeditar);
		System.out.println(moedaeditar);
		System.out.println(valordecontratoeditar);
		System.out.println(dataeditar);
	
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(contratoeditar.equals(contratovisualizar));
		sucesso.add(codigoreceitaeditar.equals(codigoreceitavisualizar));
		sucesso.add(tipopessoaeditar.equals(tipopessoavisualizar));
		sucesso.add(cpfeditar.equals(cpfvisualizar));
		sucesso.add(variacaoeditar.equals(variacaovisualizar));
		sucesso.add(razaosocialeditar.contains(razaosocialvisualizar));
		sucesso.add(periodicidadevisualizar.equals(periodicidadeeditar));
		sucesso.add(moedavisualizar.equals(moedaeditar));
		sucesso.add(valordecontratovisualizar.equals(valordecontratoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		
	
		//ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);	
		return sucesso;
	}
}
