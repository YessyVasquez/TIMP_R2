package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivaçaoParaMunicipioDestalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Ativação para Município\"]")
	public WebElement ativaçaoparamunicipio;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement novomunicipio;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement razaosocial;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement filialcentralizadora;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement municipio;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement filiaiscentralizadora;

	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement nomefantasia;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement cnpj;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"corporateName\"]")
	public WebElement razaosocialvi;
	
	
	@FindBy(xpath = "//span[@id=\"centralizingBranch\"]")
	public WebElement filialcentralizadoravi;
	
	
	@FindBy(xpath = "//span[@id=\"county\"]")
	public WebElement municipiovi;
	
	
	@FindBy(xpath = "//span[@id=\"centralizedBranch\"]")
	public WebElement filiaiscentralizadoravi;

	@FindBy(xpath = "//span[@id=\"fantasyName\"]")
	public WebElement nomefantasiavi;
	
	@FindBy(xpath = "//span[@id=\"cnpj\"]")
	public WebElement cnpjvi;
	
	


	public AtivaçaoParaMunicipioDestalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		ativaçaoparamunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//pega o ultimo id que foi gerado no criar
				String idRegistro = idObter("AtivacaoParaMunicipio");
				
				WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
				WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
				
				actionsMoveToElementElement(menu);
				sleep(2000);
				menu.click();
				sleep(1000);
				detalhes.click();
				sleep(2000);
				
				String iddetalhes = id.getText();
				String empresadetalhes = empresa.getText();
				String razaosocialdetalhes = razaosocial.getText();
				String municipiodetalhes = municipio.getText();
				String filialdetalhes = filialcentralizadora.getText();
				String filiaisdetalhes = filiaiscentralizadora.getText();
				String nomefantasiadetalhes = nomefantasia.getText();
				String cnpjdetalhes = cnpj.getText();
				


				System.out.println(iddetalhes);
				System.out.println(empresadetalhes);
				System.out.println(razaosocialdetalhes);
				System.out.println(municipiodetalhes);
				System.out.println(filialdetalhes);
				System.out.println(filiaisdetalhes);
				System.out.println(nomefantasiadetalhes);
				System.out.println(cnpjdetalhes);
				
				fechar.click();
				sleep(2000);
				
				/*waitExpectElement(siguiente);
				sleep(2000);
				siguiente.click();
				*/
				
				//pega o ultimo id que foi gerado no criar
				String idRegistro1 = idObter("AtivacaoParaMunicipio");
				
				WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
				WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				actionsMoveToElementElement(menu1);
				sleep(2000);
				menu1.click();
				sleep(1000);
				
				visualizar.click();
				sleep(2000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				
				String idvisualizar = idvi.getText();
				String empresavisualizar = empresavi.getText();
				String razaosocialvisualizar = razaosocialvi.getText();
				String municipiovisualizar = municipiovi.getText();
				String filialvisualizar = filialcentralizadoravi.getText();
				String filiaisvisualizar = filiaiscentralizadoravi.getText();
				String nomefantasiavisualizar = nomefantasiavi.getText();
				String cnpjvisuazizar= cnpjvi.getText();
				


				System.out.println(idvisualizar);
				System.out.println(empresavisualizar);
				System.out.println(razaosocialvisualizar);
				System.out.println(municipiovisualizar);
				System.out.println(filialvisualizar);
				System.out.println(filiaisvisualizar);
				System.out.println(nomefantasiavisualizar);
				System.out.println(cnpjvisuazizar);
				
				ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


				sucesso.add(idvisualizar.contains(iddetalhes));
				sucesso.add(empresavisualizar.contains(empresadetalhes));
				sucesso.add(razaosocialvisualizar.contains(razaosocialdetalhes));
				sucesso.add(municipiovisualizar.contains(municipiodetalhes));
				sucesso.add(filialvisualizar.contains(filiaisdetalhes));
				sucesso.add(filiaisvisualizar.contains(filialdetalhes));
				sucesso.add(nomefantasiavisualizar.contains(nomefantasiadetalhes));
				sucesso.add(cnpjvisuazizar.contains(cnpjdetalhes));
				
				
				
				//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
				
				
				System.out.println(sucesso);	
				return sucesso;	
		
	}

}
