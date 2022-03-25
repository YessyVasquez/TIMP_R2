package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeNegocioVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regrasdenegocio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1viprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo1visegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[6]/*/*[1]")
	public WebElement r2vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]/*/*[1]")
	public WebElement campo2viprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]/*/*[2]")
	public WebElement campo2visegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[5]/*/*[1]")
	public WebElement segundocampo2vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[9]/*/*[1]")
	public WebElement r3vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*[1]")
	public WebElement campo3viprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*[2]")
	public WebElement campo3visegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[8]/*/*[1]")
	public WebElement segundocampo3vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[12]/*/*[1]")
	public WebElement r3vicopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[10]/*/*[1]")
	public WebElement campo3viprimeiracopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[10]/*/*[2]")
	public WebElement campo3visegundacopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[11]/*/*[1]")
	public WebElement segundocampo3copiavi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[16]/*/*[1]")
	public WebElement r4vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[14]/*/*[1]")
	public WebElement campo4viprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[14]/*/*[2]")
	public WebElement campo4visegunda;
	
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[13]/*/*[1]")
	public WebElement campo4viprimeiracaixa;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[13]/*/*[2]")
	public WebElement campo4visegundacaixa;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[15]/*/*[1]")
	public WebElement segundocampo4vi;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomeed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1edprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo1edsegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*[1]")
	public WebElement segundocampo1ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[6]/*/*[1]")
	public WebElement r2ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]/*/*[1]")
	public WebElement campo2edprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]/*/*[2]")
	public WebElement campo2edsegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[5]/*/*[1]")
	public WebElement segundocampo2ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[9]/*/*[1]")
	public WebElement r3ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*[1]")
	public WebElement campo3edprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*[2]")
	public WebElement campo3edsegunda;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[8]/*/*[1]")
	public WebElement segundocampo3ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[12]/*/*[1]")
	public WebElement r3edcopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[10]/*/*[1]")
	public WebElement campo3edprimeiracopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[10]/*/*[2]")
	public WebElement campo3edsegundacopia;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[11]/*/*[1]")
	public WebElement segundocampo3copiaed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[16]/*/*[1]")
	public WebElement r4ed;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[14]/*/*[1]")
	public WebElement campo4edprimeira;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[14]/*/*[2]")
	public WebElement campo4edsegunda;
	
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[13]/*/*[1]")
	public WebElement campo4edprimeiracaixa;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[13]/*/*[2]")
	public WebElement campo4edsegundacaixa;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[15]/*/*[1]")
	public WebElement segundocampo4ed;
	
	public RegrasDeNegocioVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RegrasDeNegocioCriar");
		
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
		
		//detalhes
		String nomevisualizar =nomevi.getText();
		String r1visualizar=r1vi.getText();
		String primeirocampo1= campo1viprimeira.getText();
		String segundocampo1= campo1visegunda.getText();
		String stringsjuntascampo1visualizar = primeirocampo1.concat(segundocampo1);
		String segundocampo1visualizar= segundocampo1vi.getText();
		
		String r2visualizar=r2vi.getText();
		String primeirocampo2= campo2viprimeira.getText();
		String segundocampo2= campo2visegunda.getText();
		String stringsjuntascampo2visualizar = primeirocampo2.concat(segundocampo2);
		String segundocampo2visualizar= segundocampo2vi.getText();
		
		String r3visualizar=r3vi.getText();
		String primeirocampo3= campo3viprimeira.getText();
		String segundocampo3= campo3visegunda.getText();
		String stringsjuntascampo3visualizar = primeirocampo3.concat(segundocampo3);
		String segundocampo3visualizar= segundocampo3vi.getText();
		
		String r3copiavisualizar=r3vicopia.getText();
		String primeirocampo3copia= campo3viprimeiracopia.getText();
		String segundocampo3copia= campo3visegundacopia.getText();
		String stringsjuntascampo3copiavisualizar = primeirocampo3copia.concat(segundocampo3copia);
		String segundocampo3copiavisualizar= segundocampo3copiavi.getText();
		
		String r4visualizar=r4vi.getText();
		String primeirocampo4= campo4viprimeira.getText();
		String segundocampo4= campo4visegunda.getText();
		String stringsjuntascampo4visualizar = primeirocampo4.concat(segundocampo4);
		String segundocampo4visualizar= segundocampo4vi.getText();
		
		
		
		//String campo2visualizar = campo2vi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(r1visualizar);
		System.out.println(stringsjuntascampo1visualizar);
		System.out.println(segundocampo1visualizar);
		
		System.out.println(r2visualizar);
		System.out.println(stringsjuntascampo2visualizar);
		System.out.println(segundocampo2visualizar);
		
		System.out.println(r3visualizar);
		System.out.println(stringsjuntascampo3visualizar);
		System.out.println(segundocampo3visualizar);
		
		System.out.println(r3copiavisualizar);
		System.out.println(stringsjuntascampo3copiavisualizar);
		System.out.println(segundocampo3copiavisualizar);
		
		System.out.println(r4visualizar);
		System.out.println(stringsjuntascampo4visualizar);
		System.out.println(segundocampo4visualizar);
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
		String primeirocampo1editar= campo1edprimeira.getText();
		String segundocampo1editar= campo1edsegunda.getText();
		String stringsjuntascampo1editar = primeirocampo1editar.concat(segundocampo1editar);
		String segundocampo1editar1= segundocampo1ed.getText();
		
		String r2editar=r2ed.getText();
		String primeirocampo2editar= campo2edprimeira.getText();
		String segundocampo2editar= campo2edsegunda.getText();
		String stringsjuntascampo2editar = primeirocampo2editar.concat(segundocampo2editar);
		String segundocampo2editar2= segundocampo2ed.getText();
		
		String r3editar=r3ed.getText();
		String primeirocampo3editar= campo3edprimeira.getText();
		String segundocampo3editar= campo3edsegunda.getText();
		String stringsjuntascampo3editar = primeirocampo3editar.concat(segundocampo3editar);
		String segundocampo3editar3= segundocampo3ed.getText();
		
		String r3copiaeditar=r3edcopia.getText();
		String primeirocampo3copiaeditar= campo3edprimeiracopia.getText();
		String segundocampo3copiaeditar= campo3edsegundacopia.getText();
		String stringsjuntascampo3copiaeditar = primeirocampo3copiaeditar.concat(segundocampo3copiaeditar);
		String segundocampo3copiaeditar3= segundocampo3copiavi.getText();
		
		String r4editar=r4ed.getText();
		String primeirocampo4editar= campo4edprimeira.getText();
		String segundocampo4editar= campo4edsegunda.getText();
		String stringsjuntascampo4editar = primeirocampo4editar.concat(segundocampo4editar);
		String segundocampo4editar4= segundocampo4ed.getText();
		
		
		System.out.println(nomevisualizar);
		System.out.println(r1editar);
		System.out.println(stringsjuntascampo1editar);
		System.out.println(segundocampo1editar1);
		
		System.out.println(r2editar);
		System.out.println(stringsjuntascampo2editar);
		System.out.println(segundocampo2editar2);
		
		System.out.println(r3editar);
		System.out.println(stringsjuntascampo3editar);
		System.out.println(segundocampo3editar3);
		
		System.out.println(r3copiaeditar);
		System.out.println(stringsjuntascampo3copiaeditar);
		System.out.println(segundocampo3copiaeditar3);
		
		System.out.println(r4editar);
		System.out.println(stringsjuntascampo4editar);
		System.out.println(segundocampo4editar4);
		//System.out.println(campo2visualizar);
	
		
		
	
		
	
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeeditar.contains(nomevisualizar));
		
		sucesso.add(r1editar.contains(r1visualizar));
		sucesso.add(stringsjuntascampo1visualizar.contains(stringsjuntascampo1editar));
		sucesso.add(segundocampo1visualizar.contains(segundocampo1editar1));
		
		sucesso.add(r2editar.contains(r2visualizar));
		sucesso.add(stringsjuntascampo2visualizar.contains(stringsjuntascampo2editar));
		sucesso.add(segundocampo2visualizar.contains(segundocampo2editar2));
		
		sucesso.add(r3editar.contains(r3visualizar));
		sucesso.add(stringsjuntascampo3visualizar.contains(stringsjuntascampo3editar));
		sucesso.add(segundocampo3visualizar.contains(segundocampo3editar3));
		
		sucesso.add(r3editar.contains(r3copiavisualizar));
		sucesso.add(stringsjuntascampo3copiavisualizar.contains(stringsjuntascampo3copiaeditar));
		sucesso.add(segundocampo3copiavisualizar.contains(segundocampo3copiaeditar3));
		
		sucesso.add(r4editar.contains(r4visualizar));
		sucesso.add(stringsjuntascampo4visualizar.contains(stringsjuntascampo4editar));
		sucesso.add(segundocampo4visualizar.contains(segundocampo4editar4));
		
		System.out.println(sucesso);
	
		return sucesso;
	}

}
