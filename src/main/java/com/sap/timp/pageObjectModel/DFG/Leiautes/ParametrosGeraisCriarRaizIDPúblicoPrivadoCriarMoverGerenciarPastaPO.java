package com.sap.timp.pageObjectModel.DFG.Leiautes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-File-and-Folders icon-addfolder\"]")
	public WebElement btnCriarPasta;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/table/tbody/tr[2]/td[2]/div/div/div/input")
	public WebElement nomePasta;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
	public WebElement versaoLeiaute;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement filtrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"mes\"]/div/div/div[2]")
	public WebElement mes;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement mesO;
	
	@FindBy(xpath = "//div[@id=\"recorrenciaFeriado\"]/div/div/div[2]")
	public WebElement recorrencia;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement recorrenciaO;
	
	@FindBy(xpath = "//*[@id=\"vigencia1-activities\"]/div/div[1]/input")
	public WebElement data;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-folder\"]")
	public WebElement btnMoverPasta;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Pasta Destino\"]")
	public WebElement cboPara;
	
	@FindBy(xpath = "//li[text() =\"Pasta 1 - edit\" and @id]")
	public WebElement opcionPara;
	
	@FindBy(xpath = "//button[text()=\"Mover\"]")
	public WebElement btnMover;
	
	@FindBy(xpath = "//div[@class=\"pane\"]/div/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnExpandirPasta1;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-foldersetting\"]")
	public WebElement btnGerenciarPasta;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")
	public WebElement nomePasta2;
	
	@FindBy(xpath = "//button[text()=\"Atualizar\"]")
	public WebElement btnActualizar;
	
	@FindBy(xpath = "//button[text()=\"Excluir Pasta\"]")
	public WebElement btnExcluirPasta;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarGerenciarMoverPasta() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(raiz);
		raiz.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnCriarPasta.click();
		sleep(2000);
		
		waitExpectElement(nomePasta);
		nomePasta.click();
		sleep(1000);
		nomePasta.sendKeys("Pasta 1");
		sleep(1000);
		btnCriar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		WebElement btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(7000);
		
		WebElement pasta1 = driver.findElement(By.xpath("//span[text()=\"Pasta 1\"]"));
		sleep(8000);
		//waitExpectElement(pasta1);
		pasta1.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGerenciarPasta.click();
		sleep(2000);
		attributoNotToBeEmptyElement(nomePasta2, "value");
		nomePasta2.clear();
		nomePasta2.click();
		sleep(1000);
		nomePasta2.sendKeys("Pasta 1 - edit");
		
		sleep(1000);
		btnActualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(7000);
		
		pasta1 = driver.findElement(By.xpath("//span[text()=\"Pasta 1 - edit\"]"));
		
		if(pasta1.isDisplayed()) {
			System.out.println("Pasta alterada con sucesso...");
		}else {
			System.out.println("Pasta nao alteradad con sucesso...");
		}
		
		sleep(2000);
		waitExpectElement(raiz);
		raiz.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnCriarPasta.click();
		sleep(2000);
		
		waitExpectElement(nomePasta);
		nomePasta.click();
		sleep(1000);
		nomePasta.sendKeys("Pasta 2");
		sleep(1000);
		btnCriar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]");
		sleep(2000);
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(4000);
		
		WebElement pasta2 = driver.findElement(By.xpath("//span[text()=\"Pasta 2\"]"));
		waitExpectElement(pasta2);
		pasta2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnMoverPasta.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboPara.click();
		sleep(1000);
		opcionPara.click();
		sleep(1000);
		btnMover.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]");
		sleep(2000);
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(4000);
		
		btnExpandirPasta1.click();
		sleep(3000);
		
		pasta2 = driver.findElement(By.xpath("//span[text()=\"Pasta 2\"]"));
		
		boolean sucesso = false;
		
		if(pasta2.isDisplayed()) {
			System.out.println("Pasta movida con sucesso...");
			sucesso = true;
		}else {
			System.out.println("Pasta nao movida con sucesso...");
			return sucesso = false;
		}
		
		sleep(1000);
		pasta2.click();
		sleep(2000);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		opcao.click();
		String tipoT = opcao.getText();
		System.out.println(tipoT);
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		grupoEstrutura.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		estrutura.click();
		sleep(1000);


		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		
		sleep(3000);
		waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String id = "0";

		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			System.out.println(id);
		}
		
		if(convertToInt(id) != 0) {
			System.out.println("Leiaute creado...");
			sucesso = true;
		}else {
			System.out.println("No se creo el Leiaute...");
			return sucesso = false;
		}
		
		sleep(2000);
		waitExpectElement(raiz);
		raiz.click();
		
		btnExpansaoPastaElement = driver.findElement(By.xpath("//div[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]"));
		
		sleep(1000);
		btnExpansaoPastaElement.click();
		sleep(4000);
		
		pasta1 = driver.findElement(By.xpath("//span[text()=\"Pasta 1 - edit\"]"));
		
		waitExpectElement(pasta1);
		pasta1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGerenciarPasta.click();
		sleep(1000);
		
		waitExpectElement(btnExcluirPasta);
		btnExcluirPasta.click();
		
		sleep(1000);
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
