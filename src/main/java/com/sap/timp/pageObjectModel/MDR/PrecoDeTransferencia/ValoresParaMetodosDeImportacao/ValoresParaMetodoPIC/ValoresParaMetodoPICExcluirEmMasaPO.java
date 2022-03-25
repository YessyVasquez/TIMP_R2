package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ValoresParaMetodoPICExcluirEmMasaPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos de Importação\"]")
	public WebElement valoresparametodosdeimportacao;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PIC\"]")
	public WebElement valorespic;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PIC\"]")
	public WebElement novo;
	
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"material\"]/div/div/div[2]")
	public WebElement material;
	
	@FindBy(xpath = "//div[@id=\"model\"]/div/div/div[2]")
	public WebElement modelo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Data Conversão\"]")
	public WebElement dataconversao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Cotação Convertida\"]")
	public WebElement cotacaoconvertida;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Médio\"]")
	public WebElement precomedio;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Margem Divergência\"]")
	public WebElement margemdivergencia;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado CMV\"]")
	public WebElement precopraticadocmv;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado Dep\"]")
	public WebElement precopraticadodep;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro CMV\"]")
	public WebElement precoparametrocmv;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro Dep\"]")
	public WebElement precoparametrodep;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde CMV\"]")
	public WebElement qtdecmv;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Dep\"]")
	public WebElement qtdedep;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement addmateriais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	
	public ValoresParaMetodoPICExcluirEmMasaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodosdeimportacao.click();
		
		sleep(2000);
		
		valorespic.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroInicial = "0";
		
		if(rows > 0) {
			//conta o numero de linhas
			idRegistroInicial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			
//			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
//			String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			
			System.out.println("Primer registro de la tabla: "+idRegistroInicial);
		}
		
		
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//for (int i = 0; i < 2; i++) {
			empresa.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			addmateriais.click();
			
			sleep(2000);
			if(tc2 == true){
			descricao.sendKeys("O.DIESEL ROD. INT. S2000");
			}else if(tp1 == true) {
			descricao.sendKeys("O.DIESEL ROD. INT. S2000");
			}else {
				descricao.sendKeys("Material Teste Inventário");
			}
			sleep(2000);
			
			sim.click();
			
			sleep(2000);
			
			attributeToBeXpath("//div[@id=\"material\"]/div", "class", "base-select required");
			sleep(3000);
			
			material.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			modelo.click();
			
			sleep(2000);
			
			opcao.click();
			
			sleep(2000);
			
			dataconversao.sendKeys(fechaActual());
			
			sleep(2000);
			
			cotacaoconvertida.sendKeys("1000");
			
			sleep(2000);
			
			precomedio.sendKeys("1000");
			
			sleep(2000);
			
			margemdivergencia.sendKeys("1000");
			
			sleep(2000);
			
			precopraticadocmv.sendKeys("10000");
			
			sleep(2000);
			
			precopraticadodep.sendKeys("10000");
			
			sleep(2000);
			
			precoparametrocmv.sendKeys("10000");
			
			sleep(2000);
			
			precoparametrodep.sendKeys("1000");
			
			sleep(2000);
			
			qtdecmv.sendKeys("100");
			
			sleep(2000);
			
			qtdedep.sendKeys("100");
			
			
			String data = fechaActual();
			datainicial.sendKeys(data);
			
			gravareNovo.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			sim.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			gravareNovo.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			sim.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		//}
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		//rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		
		
//		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
//		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		sleep(2000);
		System.out.println(idRegistroInicial);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(idRegistroInicial);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
	}
	
	public boolean excluirEmMasaValoresParaMetodoPIC() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroInicial3 = "0";
		
		if(rows > 0) {
			//conta o numero de linhas
			idRegistroInicial3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][3]/div[3]/div")).getText();
			System.out.println("Primer registro de la tabla: "+idRegistroInicial3);
		}
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(primeira);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
		
		
		
		int id1 = convertToInt(idRegistroInicial3);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
	
		return sucesso;
		
	}
}
