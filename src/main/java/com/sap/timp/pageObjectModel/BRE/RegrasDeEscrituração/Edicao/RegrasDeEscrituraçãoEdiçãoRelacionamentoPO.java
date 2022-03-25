package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoEdiçãoRelacionamentoPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Relacionamento\"]")
	public WebElement btnRelacionamento;
	
	@FindBy(xpath = "//div[contains(@class, \"field1\")]/div/div[2]")
	public WebElement cboCampoEstrutura1;	
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and text()=\"Código da empresa (ED)\"]")
	public WebElement opcionCampoEstrutura1;
	
	@FindBy(xpath = "//div[contains(@class, \"field2\")]/div/div[2]")
	public WebElement cboCampoEstrutura2;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and text()=\"Código da empresa (ED)\"]")
	public WebElement opcionCampoEstrutura2;
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement btnAdicionarCampos;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[contains(@class, \"field1\")]/div/div[2]")
	public WebElement cboCampoEstrutura3;	
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and text()=\"Bairro da empresa (ED)\"]")
	public WebElement opcionCampoEstrutura3;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[contains(@class, \"field2\")]/div/div[2]")
	public WebElement cboCampoEstrutura4;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and text()=\"Bairro da empresa (ED)\"]")
	public WebElement opcionCampoEstrutura4;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[@id=\"delete-icon\"]")
	public WebElement btnRemover;
	
	public RegrasDeEscrituraçãoEdiçãoRelacionamentoPO() {
		PageFactory.initElements(driver, this);
	}
		
	public boolean relacionamento() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regraDeEscrituracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("RegraDeEscrituracao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnRelacionamento);
		btnRelacionamento.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cboCampoEstrutura1);
		cboCampoEstrutura1.click();
		sleep(1000);
		opcionCampoEstrutura1.click();
		sleep(1000);
		
		cboCampoEstrutura2.click();
		sleep(1000);
		opcionCampoEstrutura2.click();
		sleep(2000);
		
		btnAdicionarCampos.click();
		sleep(2000);
		
		waitExpectElement(cboCampoEstrutura3);
		cboCampoEstrutura3.click();
		sleep(1000);
		opcionCampoEstrutura3.click();
		sleep(1000);
		
		cboCampoEstrutura4.click();
		sleep(1000);
		opcionCampoEstrutura4.click();
		sleep(2000);
		
		btnAplicar.click();
		sleep(2000);
		btnGravar.click();
		invisibilityOfElementOverlay();
		waitExpectElement(btnNao);
		btnNao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRelacionamento.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int cantidadDeCampos = driver.findElements(By.xpath("//div[@class=\"fieldRow-wrapper\"]")).size();
		System.out.println("");
		System.out.println("Cantidad de filas de registros: " + cantidadDeCampos);
		
		boolean sucesso = false;
		
		if(cantidadDeCampos > 1) {
			System.out.println("Si se encuentran los datos agregados...");
			sucesso = true;
		}else {
			System.out.println("No se crearon los registros...");
			return sucesso;
		}
		
		sleep(1000);
		btnRemover.click();
		sleep(2000);
		btnAplicar.click();
		sleep(2000);
		btnGravar.click();
		invisibilityOfElementOverlay();
		waitExpectElement(btnNao);
		btnNao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRelacionamento.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cantidadDeCampos = driver.findElements(By.xpath("//div[@class=\"fieldRow-wrapper\"]")).size();
		System.out.println("");
		System.out.println("Cantidad de filas de registros: " + cantidadDeCampos);
		
		if(cantidadDeCampos == 1) {
			System.out.println("Registro removido...");
			sucesso = true;
		}else {
			System.out.println("No se removieron los registros...");
			return sucesso = false;
		}
		
		cboCampoEstrutura2.click();
		sleep(1000);
		
		opcionCampoEstrutura2 = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @tabindex=\"0\" and text()=\"Código do parceiro (ED)\"]"));
		sleep(1000);
		opcionCampoEstrutura2.click();
		sleep(1000);
		
		btnAplicar.click();
		sleep(2000);
		btnGravar.click();
		invisibilityOfElementOverlay();
		waitExpectElement(btnNao);
		btnNao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRelacionamento.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cboCampoEstrutura2);
		String valorOpcionCampoEstrutura2 = driver.findElement(By.xpath("//div[contains(@class, \"field2\")]/div/div/input")).getAttribute("value").trim();
		System.out.println("");
		System.out.println("Valor campo de estrutura 2 editado: " + valorOpcionCampoEstrutura2);
		
		if(valorOpcionCampoEstrutura2.equals("Código do parceiro (ED)")) {
			System.out.println("");
			System.out.println("Campo editado correctamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("No se pudo editar el campo...");
			return sucesso = false;
		}
		
		btnRemover = driver.findElement(By.xpath("//div[@class=\"fieldRow-wrapper\"][1]/div/div[@id=\"delete-icon\"]"));
		sleep(1000);
		
		btnRemover.click();
		btnAplicar.click();
		sleep(2000);
		btnGravar.click();
		invisibilityOfElementOverlay();
		waitExpectElement(btnNao);
		btnNao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRelacionamento.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cboCampoEstrutura1);
		String valorOpcionCampoEstrutura1 = driver.findElement(By.xpath("//div[contains(@class, \"field1\")]/div/div/input")).getAttribute("value").trim();
		System.out.println("");
		System.out.println("Valor campo de estrutura 1 despues de removerlo: " + valorOpcionCampoEstrutura1);
		
		valorOpcionCampoEstrutura2 = driver.findElement(By.xpath("//div[contains(@class, \"field2\")]/div/div/input")).getAttribute("value").trim();
		System.out.println("");
		System.out.println("Valor campo de estrutura 2 despues de removerlo: " + valorOpcionCampoEstrutura2);
		
		if(!valorOpcionCampoEstrutura1.equals("Código da empresa (ED)") && !valorOpcionCampoEstrutura2.equals("Código do parceiro (ED)")) {
			System.out.println("");
			System.out.println("Datos removidos...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("No se pudo remover los campos...");
			sucesso = false;
		}
		
		return sucesso;
	}
}
