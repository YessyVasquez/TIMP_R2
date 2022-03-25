package com.sap.timp.pageObjectModel.MDR.SaldoInicial;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldoInicialVisualizarPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-saldos\")]/div/span[2]")
	public WebElement saldoInicial;
	
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//DATOS
	@FindBy(xpath = "//span[@id=\"razaoSocial\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"nomeFantasia\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoImposto;
	
	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
	public WebElement detalheTipoTributo;
	
	@FindBy(xpath = "//span[@id=\"labelReferencia\"]")
	public WebElement referencia;
	
	@FindBy(xpath = "//span[@id=\"anioMes\"]")
	public WebElement data;
	
	@FindBy(xpath = "//span[@id=\"labelDebCred\"]")
	public WebElement dc;
	
	@FindBy(xpath = "//span[@id=\"saldo\"]")
	public WebElement saldo;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativo;
	//span[@id="razaoSocial"]
	
	
	
	//VALORES TRAIDOS
	@FindBy(xpath="//div[@id=\"empresa\"]/div/div/div[1]/input")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div[1]/div/div/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[@id=\"tributo\"]/div/div/div/input[1]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div/input[1]")
	public WebElement tipoImposto1;
	
	@FindBy(xpath = "//div[@id=\"taxTypeDetail\"]/div/div/div/input[1]")
	public WebElement detalheTipoTributo1;
	
	@FindBy(xpath = "//div[@id=\"REFERENCIA_SALDO\"]/div/div/div/input[1]")
	public WebElement referencia1;
	
	@FindBy(xpath = "//div[@id=\"MES\"]/div/div/div/input[1]")
	public WebElement mes1;
	
	@FindBy(xpath = "//div[@id=\"YEAR\"]/div/div/div/input[1]")
	public WebElement year1;
	
	@FindBy(xpath = "//div[@id=\"saldo\"]/div/div/input")
	public WebElement saldo1;
	
	@FindBy(xpath = "//div[@id=\"DEBITO_CREDITO\"]/div/div/div/input[1]")
	public WebElement dc1;
	
	@FindBy(xpath = "//div[@id=\"switcher\"]/input")
	public WebElement ativo1;
	
	public SaldoInicialVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> VisualizarSaldoInicial() {
		sleep(2000);
		saldoInicial.click();
		
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("SaldoInicial");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		opcion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//visualizar
		
		String empresaValor = empresa.getText();
		String filialValor = filial.getText();
		String tributoValor = tributo.getText();
		String tipoImpostoValor = tipoImposto.getText();
		String detalheTipoTributoValor = detalheTipoTributo.getText();
		String referenciaValor = referencia.getText();
		String dataValor = data.getText();
		String dcValor = dc.getText();
		String saldoValor = saldo.getText();
		String ativoValor = ativo.getText();
		
		
		System.out.println("empresa Valor1:" +empresaValor);
		System.out.println("filiar Valor1:" +filialValor);
		System.out.println("tributo Valor1:" +tributoValor);
		System.out.println("tipoImposto Valor1:" +tipoImpostoValor);
		System.out.println("detalheTipoTributo Valor1:" +detalheTipoTributoValor);
		System.out.println("referencia Valor1:" +referenciaValor);
		System.out.println("data Valor1:" +dataValor);
		System.out.println("dc Valor1:" +dcValor);
		System.out.println("saldo Valor1:" +saldoValor);
		System.out.println("ativo Valor1:" +ativoValor);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(irFinalPagina);
		sleep(2000);
		irFinalPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("SaldoInicial");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		opcion.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//EDITAR
		
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//attributeToBeXpath("//div[@id=\"taxTypeDetail\"]/div", "class", "base-select required");
		//sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaEditar = empresa1.getAttribute("value");
		String filialEditar = filial1.getText();
		String tributoEditar = tributo1.getAttribute("value");
		String tipoImpostoEditar = tipoImposto1.getAttribute("value");
		String detalheTipoTributoEditar = detalheTipoTributo1.getAttribute("value");
		String referenciaEditar = referencia1.getAttribute("value");
		
		String mesEditar = mes1.getAttribute("value");
		String yearEditar = year1.getAttribute("value");
		
		String fechaString = getCodeMonthByMonth(mesEditar)+"/"+yearEditar;
		
		//String dataEditar = data1.getAttribute("value");
		String dcEditar = dc1.getAttribute("value");
		String saldoEditar = saldo1.getAttribute("value");
		String ativoEditar = ativo1.isSelected() ? "Sim" : "Não" ;
	
		System.out.println("-------------- ");
		System.out.println("empresa editar:" + empresaEditar);
		System.out.println("filial editar:" +filialEditar);
		System.out.println("tributo editar:" +tributoEditar);
		System.out.println("tipoImposto editar:" +tipoImpostoEditar);
		System.out.println("detalheTipoTributo editar:" +detalheTipoTributoEditar);
		System.out.println("referencia editar:" +referenciaEditar);
		System.out.println("data editar:" +fechaString);
		System.out.println("dc editar:" +dcEditar);
		System.out.println("saldo editar:" +saldoEditar);
		System.out.println("ativo editar:" +ativoEditar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaValor.equals(empresaEditar));
		sucesso.add(filialValor.equals(filialEditar));
		sucesso.add(tributoValor.equals(tributoEditar));
		sucesso.add(tipoImpostoValor.equals(tipoImpostoEditar));
		sucesso.add(detalheTipoTributoValor.equals(detalheTipoTributoEditar));
		sucesso.add(referenciaValor.equals(referenciaEditar));
		
		sucesso.add(dataValor.equals(fechaString));
		sucesso.add(dcValor.equals(dcEditar));
		sucesso.add(saldoValor.contains(saldoEditar));
		sucesso.add(ativoValor.equals(ativoEditar));
//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		System.out.println(sucesso);
		return sucesso;
		
	}

}
