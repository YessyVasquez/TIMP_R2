package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN3VisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo2vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[3]")
	public WebElement campo3vi;

	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1vi;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomeed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo2ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[3]")
	public WebElement campo3ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1ed;
	
	
	
	public RegrasDeAuditoriaN3VisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("An3");
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo do registro que foi criado: " + idRegistro);
	
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		waitExpectElement(r1vi);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		String nomevisualizar =nomevi.getText();
		String r1visualizar=r1vi.getText();
		String primeirocampo1 = campo1vi.getText();
		String segundocampo1 = campo2vi.getText();
		String terceirocampo1 = campo3vi.getText();
		String primeirosegundocampo1 = primeirocampo1.concat(segundocampo1);
		String campo1visualizar = primeirosegundocampo1.concat(terceirocampo1);
		String segundocampo1visualizar = segundocampo1vi.getText();
	
		
		
		
		//String campo2visualizar = campo2vi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(r1visualizar);
		System.out.println(campo1visualizar);
		System.out.println(segundocampo1visualizar);
		
		//System.out.println(campo2visualizar);
	
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//editar
		waitExpectElement(r1ed);
		sleep(2000);
		String nomeeditar = nomeed.getText();
		String r1editar=r1ed.getText();
		
		String primeirocampo1ed = campo1ed.getText();
		String segundocampo1ed1 = campo2ed.getText();
		String terceirocampo1ed = campo3ed.getText();
		String primeirosegundocampo1ed = primeirocampo1ed.concat(segundocampo1ed1);
		String campo1editar = primeirosegundocampo1ed.concat(terceirocampo1ed);
		String segundocampo1editar1= segundocampo1ed.getText();
		
		
		
		System.out.println(nomeeditar);
		System.out.println(r1editar);
		System.out.println(campo1editar);
		System.out.println(segundocampo1editar1);
		
		
		//System.out.println(campo2visualizar);
	
		
		
	
		
	
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeeditar.contains(nomevisualizar));
		
		sucesso.add(r1editar.contains(r1visualizar));
		sucesso.add(campo1visualizar.contains(campo1editar));
		sucesso.add(segundocampo1visualizar.contains(segundocampo1editar1));
		
	
		
		System.out.println(sucesso);
	
		return sucesso;
	}




}
