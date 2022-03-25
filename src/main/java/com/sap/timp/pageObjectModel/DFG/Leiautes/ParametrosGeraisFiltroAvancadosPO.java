package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosGeraisFiltroAvancadosPO extends TestBaseMassiel{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Id\"]")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Versão:\"]")
	public WebElement versao;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo\"]")
	public WebElement tipo;

	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement tipoOpc;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Usuário de Criação\"]")
	public WebElement usuarioCriado;

	@FindBy(xpath = "//li[@id=\"option-212\"]")
	public WebElement usuarioCriadoOpc;

	@FindBy(xpath = "//li[@id=\"option-168\"]")
	public WebElement usuarioCriadoOpc2;
	
	@FindBy(xpath = "//li[@id=\"option-180\"]")
	public WebElement usuarioCriadoOpc3;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de criação a partir\"]")
	public WebElement FechaUsuarioCriado;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Usuário de Modificação\"]")
	public WebElement usuarioModificado;

	@FindBy(xpath = "//li[@id=\"option-212\"]")
	public WebElement usuarioModificadoOpc;

	@FindBy(xpath = "//li[@id=\"option-168\"]")
	public WebElement usuarioModificadoOpc2;
	
	@FindBy(xpath = "//li[@id=\"option-180\"]")
	public WebElement usuarioModificadoOpc3;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de modificação a partir\"]")
	public WebElement FechaUsuarioModificado;

	@FindBy(xpath = "// body")
	public WebElement body;

	public ParametrosGeraisFiltroAvancadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	String idRegistro = idObter1();
	String textId = idRegistro;

//	private String textnome;
	//String textVersao = null ;
//	String textNome = null;
//	String textTipo = null;
	//String textUsuarioCriado = "TESTEAUTOMATIZADO TESTEAUTOMATIZADO";
//	String textFechaCriado = "27/11/2020";
//	String textUsuarioModificado = "TESTEAUTOMATIZADO TESTEAUTOMATIZADO";
//	String textFechaModificado= "27/11/2020";

	public final String  Filtro() {
		String textnome = "";
		String url = driver.getCurrentUrl();

		sleep(2000);
		leiautePublico.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));

		textnome = driver

				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[7]/div"))
				.getText();
		System.out.println(textnome);
		
		String textVersao = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[6]"))
				.getText();
		System.out.println(textVersao);


		String textTipo = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[9]/div"))
				.getText();
		System.out.println(textTipo);

		String textUsuarioCriado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[10]/div"))
				.getText();
		System.out.println(textUsuarioCriado);

		String textFechaCriado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[11]/div"))
				.getText();
		System.out.println(textFechaCriado);

		String textUsuarioModificado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[12]/div"))
				.getText();
		System.out.println(textUsuarioModificado);

		String textFechaModificado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[13]/div"))
				.getText();
		System.out.println(textFechaModificado);

		
		return textnome;


	}



	public ArrayList<Boolean> FiltroNome() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textNome = Filtro();
		
		System.out.println(textNome);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(textNome);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroNombre = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\""+f+"\"]/div	[7]/div"))
					.getText();
			System.out.println(textFiltroNombre + " Nombre  Filtro");

			sucesso.add((textNome).equals(textFiltroNombre));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroId() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter1();

		sleep(2000);
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		id.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		id.sendKeys(textId);
		id.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[5]/div"))
					.getText();
			System.out.println(textFiltroid + " Id Filtro");

			sucesso.add((textId).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroVersao() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));

		String textVersao = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[6]"))
				.getText();
		System.out.println(textVersao);
		
		versao.sendKeys(textVersao);
		versao.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[6]/div"))
					.getText();
			System.out.println(textFiltroid + " Versao  Filtro");

			sucesso.add((textVersao).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroTipo() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		System.out.println(idRegistro);
		
		tipo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));

		String textTipo = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[9]/div"))
				.getText();
		System.out.println(textTipo);
		textTipo = tipoOpc.getText();
		tipoOpc.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[9]/div"))
					.getText();
			System.out.println(textFiltroid + " Tipo Filtro");

			sucesso.add((textTipo).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}


	public ArrayList<Boolean> FiltroUsuarioCriado() {
		String url = driver.getCurrentUrl();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		
		String textUsuarioCriado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[10]/div"))
				.getText();
		System.out.println(textUsuarioCriado);

		
		usuarioCriado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		if (url.contains("tc2")==true )  {

			textUsuarioCriado = usuarioCriadoOpc.getText();
			usuarioCriadoOpc.click();
			sleep(1000);

		}else if (url.contains("tp1")==true){

			textUsuarioCriado = usuarioCriadoOpc2.getText();
			usuarioCriadoOpc2.click();
			sleep(1000);
		}else if (url.contains("tq1")==true) {
			textUsuarioCriado = usuarioCriadoOpc3.getText();
			usuarioCriadoOpc3.click();
			sleep(1000);
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[10]/div"))
					.getText();
			System.out.println(textFiltroid + " Usuario Criado Filtro");

			sucesso.add((textUsuarioCriado).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroFechaUsuarioCriado() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		
		String textFechaCriado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[11]/div"))
				.getText();
		
		System.out.println(textFechaCriado);

		FechaUsuarioCriado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		FechaUsuarioCriado.sendKeys(textFechaCriado);
		sleep(2000);
		FechaUsuarioCriado.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		body.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
 

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[11]/div"))
					.getText();
			System.out.println(textFiltroid + " Fecha Usuario Criado  Filtro");

			sucesso.add((textFechaCriado).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroUsuarioModicado() {

		String url = driver.getCurrentUrl();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textUsuarioModificado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[12]/div"))
				.getText();
		System.out.println(textUsuarioModificado);

		usuarioModificado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (url.contains("tc2")==true )  {

			textUsuarioModificado = usuarioModificadoOpc.getText();
			usuarioModificadoOpc.click();
			sleep(2000);

		}else if (url.contains("tp1")==true){

			textUsuarioModificado = usuarioModificadoOpc2.getText();
			usuarioModificadoOpc2.click();
			sleep(2000);
		}else if (url.contains("tq1")==true){
			textUsuarioModificado = usuarioModificadoOpc3.getText();
			usuarioModificadoOpc3.click();
			sleep(2000);
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[10]/div"))
					.getText();
			System.out.println(textFiltroid + " Usuario Modificado Filtro");

			sucesso.add((textUsuarioModificado).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}

	public ArrayList<Boolean> FiltroFechaUsuarioModificado() {


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textFechaModificado = driver
				.findElement(By.xpath("//div[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[@data-id=\""+idRegistro+"\"]/div[13]/div"))
				.getText();
		System.out.println(textFechaModificado);
		
		FechaUsuarioModificado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		FechaUsuarioModificado.sendKeys(textFechaModificado);
		sleep(2000);
		FechaUsuarioModificado.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		body.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroid = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[11]/div"))
					.getText();
			System.out.println(textFiltroid + " Fecha Usuario Modificado  Filtro");

			sucesso.add((textFechaModificado).equals(textFiltroid));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;


	}


}

