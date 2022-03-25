package com.sap.timp.pageObjectModel.TDK.Kpis.KpisPublicos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class KpisPublicosDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement abaKpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpisPublicos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public KpisPublicosDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaKpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpisPublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = "0";
		String url = driver.getCurrentUrl();
		
		if(url.contains("tq1")) {
			idRegistro = "818";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "207";
		}
		
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		
	
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(6000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos informacao
		String nome = driver.findElement(By.xpath("//div[@id=\"detail-name\"]/div")).getText().trim();
		String descricao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]/div/div")).getText().trim();
		String classificacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText().trim();
		String criadoPor = driver.findElement(By.xpath("//div[@id=\"detail-history\"][1]/div/div[1]")).getText().trim().replace(",", "");
		criadoPor = criadoPor.split(" ")[2] + " " + criadoPor.split(" ")[3];
		String dataCriacao = driver.findElement(By.xpath("//div[@id=\"detail-history\"][1]/div/div[1]/span")).getText().trim();
		String modificadoPor = driver.findElement(By.xpath("//div[@id=\"detail-history\"][1]/div/div[2]")).getText().trim().replace(",", "");
		modificadoPor = modificadoPor.split(" ")[3] + " " + modificadoPor.split(" ")[4];
		String dataModificao = driver.findElement(By.xpath("//div[@id=\"detail-history\"][1]/div/div[2]/span")).getText().trim();
		
		System.out.println("DATOS INFORMACAO");
		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
		System.out.println("Classificacao: " + classificacao);
		System.out.println("Criado por: " + criadoPor);
		System.out.println("Data criacao: " + dataCriacao);
		System.out.println("Modificado por: " + modificadoPor);
		System.out.println("Data modificaco: " + dataModificao);
		System.out.println("");
		
		btnCerrar.click();
		
		// Datos del registro de la tabla
		String nome1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[6]/div")).getText().trim();
		String descricao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[7]/div")).getText().trim();
		String classificacao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[8]/div")).getText().trim();
		String criadoPor1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[14]/div")).getText().trim();
		String dataCriacao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[15]/div")).getText().trim();
		String modificadoPor1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[16]/div")).getText().trim();
		String dataModificao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[17]/div")).getText().trim();
		
		System.out.println("DATOS DEL REGISTRO DE LA TABLA");
		System.out.println("Nome: " + nome1);
		System.out.println("Descricao: " + descricao1);
		System.out.println("Classificaco: " + classificacao1);
		System.out.println("Criado por: " + criadoPor1);
		System.out.println("Data criacao: " + dataCriacao1);
		System.out.println("Modificado por: " + modificadoPor1);
		System.out.println("Data modificaco: " + dataModificao1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(nome1.equals(nome));
		sucesso.add(descricao1.equals(descricao));
		sucesso.add(classificacao1.equals(classificacao));
		sucesso.add(criadoPor1.equals(criadoPor));
		sucesso.add(dataCriacao1.equals(dataCriacao1));
		sucesso.add(modificadoPor1.equals(modificadoPor));
		sucesso.add(dataModificao1.equals(dataModificao));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
