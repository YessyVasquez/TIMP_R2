package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosCriarCampoDeSaidaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Campos Saída \"]")
	public WebElement camposSaida;
	
	@FindBy(xpath = "//button[text()=\"Adicionar campo de saída\"]")
	public WebElement adicionarCampoDeSaida;
	
	@FindBy(xpath = "//div[@id=\"create-adjustment\"]/div/div/div[2]")
	public WebElement cboAjuste;
	
	@FindBy(xpath = "//div[@id=\"create-annexe-type\"]/div/div/div[2]")
	public WebElement cboTipoAnexo;
	
	@FindBy(xpath = "//div[@id=\"create-annexe\"]/div/div/div[2]")
	public WebElement cboAnexo;
	
	@FindBy(xpath = "//div[@id=\"create-group\"]/div/div/div[2]")
	public WebElement cboQuadro;
	
	@FindBy(xpath = "//div[@id=\"create-line\"]/div/div/div[2]")
	public WebElement cboLinha;
	
	@FindBy(xpath = "//div[@id=\"create-name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"create-description\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	public RelatorioRefinariaGeradosCriarCampoDeSaidaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarCampoDeSaida() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		camposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String ultimoId = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println("Ultimo ID: " + ultimoId);
		
		adicionarCampoDeSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cboAjuste.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboTipoAnexo.click();
		sleep(1000);
		opcionCombo.click();
		sleep(3000);
		
		cboAnexo.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboQuadro.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboLinha.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		nome.click();
		sleep(1000);
		String nomeString = "TESTE AUTOMATIZADO";
		nome.sendKeys(nomeString);
		sleep(1000);
		
		descricao.click();
		sleep(1000);
		String descricaoString = "TESTE AUTOMATIZADO";
		descricao.sendKeys(descricaoString);
		sleep(1000);
		
		// Obtener los datos ingresados
		String ajusteString = driver.findElement(By.xpath("//div[@id=\"create-adjustment\"]/div/div/div[1]/input")).getAttribute("value");
		String tipoAnexoString = driver.findElement(By.xpath("//div[@id=\"create-annexe-type\"]/div/div/div[1]/input")).getAttribute("value");
		String anexoString = driver.findElement(By.xpath("//div[@id=\"create-annexe\"]/div/div/div[1]/input")).getAttribute("value");
		String quadroString = driver.findElement(By.xpath("//div[@id=\"create-group\"]/div/div/div[1]/input")).getAttribute("value");
		String linhaString = driver.findElement(By.xpath("//div[@id=\"create-line\"]/div/div/div[1]/input")).getAttribute("value");
		
		System.out.println("Datos ingresados");
		System.out.println("Ajuste: " + ajusteString);
		System.out.println("Tipo Anexo: " + tipoAnexoString);
		System.out.println("Anexo: " + anexoString);
		System.out.println("Quadro: " + quadroString);
		System.out.println("Linha: " + linhaString);
		System.out.println("Nome: " + nomeString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("");
		
		btnCriar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String ultimoIdAgregado = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println("Ultimo ID: " + ultimoIdAgregado);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int idViejo = convertToInt(ultimoId);
		int idNuevo = convertToInt(ultimoIdAgregado);
		
		System.out.println("");
		System.out.println("ID Viejo: " + idViejo);
		System.out.println("ID Nuevo: " + idNuevo);
		
		if(idNuevo > idViejo) {
			sucesso.add(true);
			System.out.println("Se creo el registro...");
			idInserir4(ultimoIdAgregado);
		}else {
			System.out.println("No se creo el registro...");
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
