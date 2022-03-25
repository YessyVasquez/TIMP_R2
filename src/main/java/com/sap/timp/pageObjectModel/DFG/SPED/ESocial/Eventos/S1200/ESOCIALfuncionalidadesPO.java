package com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ESOCIALfuncionalidadesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-gooddoc padding-right \"]")
	public WebElement sped;
	
	@FindBy(xpath = "//span[text()=\"E-SOCIAL\"]")
	public WebElement ESocial;
	
	@FindBy(xpath = "//span[text()=\"Eventos\"]")
	public WebElement Evento;
	
	@FindBy(xpath = "//span[text()=\"S1200 Remuneração do Trabalhador Vinculado ao Regime Geral de Prev. Social\"]")
	public WebElement S1200;
	
	@FindBy(xpath = "//span[text()=\"Excluir Dados do Evento\"]")
	public WebElement ExcluirDadosEvento;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[2]/div/span[2]")
	public WebElement blocosApuracao;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement R1070;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Insert\"]")
	public WebElement R1070Insert;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[2]/div/div[1]")
	public WebElement antes;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//textarea[@id=\"textarea-id\"]")
	public WebElement descripcion;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Leiaute \"]")
	public WebElement Leiaute;
	
	@FindBy(xpath = "//li[text()=\"ID7591-E-SOCIAL(EXCLUIR S1200) - TA - NÃO MEXER\"]")
	public WebElement leiauteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Versão Leiaute\"]")
	public WebElement versãoLeiaute;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement opcVersãoLeiaute;
	
	@FindBy(xpath = "//input[@placeholder=\"Tributo \"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id=\"00\"]")
	public WebElement opcTributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement filialOpc;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresaV;
	
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

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
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement nomeI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement descricaoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement tipoI;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Estado\"]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement estadoOpc;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Time-and-Date icon-calendar\"]")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement atrasCalendar;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement calendar2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement calendarEnero;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement calendar1M;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
	public WebElement movimiento;
	
	@FindBy(xpath = "//*[@id=\"settings-execute\"]/button/span[2]")
	public WebElement executa;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement AEstrutura;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement AN3;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Arquivo\"]")
	public WebElement AN3nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Regras\"]")
	public WebElement AN3regras;
	
	@FindBy(xpath = "//div[@id=\"2364\"]/div/label/span")
	public WebElement AN3regrasOpc;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[text()=\"DFG\"]")
	public WebElement dfg;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-docversion padding-right \"]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[1]")
	public WebElement arquivosRaiz;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement arquivosO;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[4]/div[2]/label/span")
	public WebElement flagEnviar;
	
	@FindBy(xpath = "//span[text()=\"Enviar selecionado\"]")
	public WebElement enviarSeleccionado;
	
	@FindBy(xpath = "//span[text()=\"Enviar pendências\"]")
	public WebElement enviarPendencias;
	
	public ESOCIALfuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id antes da criação do registro (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado QA");
		sleep(1000);
		
		descripcion.sendKeys("Descipcion Teste Automatizado QA 4");
		sleep(2000);
		
		Leiaute.sendKeys("ID7591-E-SOCIAL(EXCLUIR S1200) - TA - NÃO MEXER");
		sleep(2000);
		leiauteOpc.click();
		sleep(2000);
		
		versãoLeiaute.click();
		sleep(3000);
		opcVersãoLeiaute.click();
		sleep(3000);
		
		tributo.sendKeys("ICMS");
		sleep(2000);
		opcTributo.click();
		sleep(2000);
		
		empresa.click();;
		sleep(2000);
		empresaOpc.click();
		sleep(2000);
		empresaOpc.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		uf.click();;
		sleep(2000);
		ufOpc.click();
		sleep(2000);
		ufOpc.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		filial.click();;
		sleep(2000);
		filialOpc.click();
		sleep(2000);
		filialOpc.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id após da criação do registro: " + ultimoIdDC);
		idInserir2(ultimoIdDC);

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
		System.out.println(idObter2());
		System.out.println(idObter3());
		
		
		
	
		System.out.println(sucesso);
		
		return sucesso;
	}

	
	public boolean editar() {
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editarR = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editarR.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		descripcion.clear();
		sleep(1000);
		String enviar = "Teste Editar";
		descripcion.sendKeys(enviar);
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String editado = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[5]/div")).getText();
		System.out.println("Edição do Campo: " + editado);
		
		boolean sucesso = editado.equals(enviar);
		System.out.println(sucesso);
		
		
		return sucesso;

	}

	public ArrayList<Boolean> informacao() {
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));	
		System.out.println(idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoNomeString = nomeI.getText();
		String textoDescricaoString = descricaoI.getText();


		
		System.out.println("NOME: " + textoNomeString);
		System.out.println("Descricao: " + textoDescricaoString);
	
	
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoNomeString1 = nome.getAttribute("value");
		String textoDescripciontring1 = descripcion.getAttribute("value");

		sleep(3000);
		fechar.click();
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("NOME: " + textoNomeString1);
		System.out.println("Descricao: " + textoDescripciontring1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoNomeString1.equals(textoNomeString));
		sucesso.add(textoDescripciontring1.equals(textoDescricaoString));

		System.out.println(sucesso);
		
		return sucesso;
	}

	public ArrayList<Boolean> visualizar() {
		
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String idRegistro = idObter2();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String textoNomeString1 = nome.getAttribute("value");
		String textoDescripciontring1 = descripcion.getAttribute("value");
		String textoLeiauteString1 = Leiaute.getAttribute("value");
		String textoVersãotring1 = versãoLeiaute.getAttribute("value");
		String textoTributoString1 = tributo.getAttribute("value");
		String textoEmpresaString1 = empresaV.getAttribute("value");
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("NOME: " + textoNomeString1);
		System.out.println("Descricao: " + textoDescripciontring1);
		System.out.println("Leiaute: " + textoLeiauteString1);
		System.out.println("Leiaute Versão : " + textoVersãotring1);
		System.out.println("tributo: " + textoTributoString1);
		System.out.println("empresa: " + textoEmpresaString1);
		sleep(6000);
		fechar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoNomeString2 = nome.getAttribute("value");
		String textoDescripciontring2 = descripcion.getAttribute("value");
		String textoLeiauteString2 = Leiaute.getAttribute("value");
		String textoVersãotring2 = versãoLeiaute.getAttribute("value");
		String textoTributoString2 = tributo.getAttribute("value");
		String textoEmpresaString2 = empresaV.getAttribute("value");

		sleep(3000);
		fechar.click();
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("NOME: " + textoNomeString2);
		System.out.println("Descricao: " + textoDescripciontring2);
		System.out.println("Leiaute: " + textoLeiauteString2);
		System.out.println("Leiaute Versão : " + textoVersãotring2);
		System.out.println("tributo: " + textoTributoString2);
		System.out.println("empresa: " + textoEmpresaString2);

		

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(textoNomeString2.contains(textoNomeString1));
		sucesso.add(textoDescripciontring2.contains(textoDescripciontring1));
		sucesso.add(textoLeiauteString2.contains(textoLeiauteString1));
		sucesso.add(textoVersãotring2.contains(textoVersãotring1));
		sucesso.add(textoTributoString2.contains(textoTributoString1));
		sucesso.add(textoEmpresaString2.contains(textoEmpresaString1));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public boolean executar() {
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		executar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estado.click();;
		sleep(2000);
		estadoOpc.click();
		sleep(2000);
		estadoOpc.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		calendar.click();
		sleep(3000);
		atrasCalendar.click();
		sleep(3000);
		calendar2016.click();
		sleep(6000);
		calendarEnero.click();
		sleep(6000);
		calendar1M.click();
		sleep(3000);
		
		movimiento.click();
		sleep(4000);
		
		executa.click();
		sleep(30000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		
		sleep(3000);
		
		AN3.click();
		
		sleep(2000);
		AN3nome.sendKeys("Arquivo Teste QA");
		sleep(2000);
		
		AN3regras.click();
		sleep(3000);
		AN3regrasOpc.click();
		sleep(2000);
		AN3regrasOpc.sendKeys(Keys.ESCAPE);
		sleep(1000);
		criar.click();
		sleep(18000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);

		home.click();
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!dfg.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		dfg.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		sleep(3000);
		
		arquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		System.out.println("111");
		arquivosO.click();
		sleep(3000);
		System.out.println("222");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("A");
		arquivosRaiz.click();
		System.out.println("D");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("333");
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro: " + ultimoIdDC);
		
		
		idInserir3(ultimoIdDC);
		
		
		sleep(3000);
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ESocial.click();
		sleep(3000);
		Evento.click();
		sleep(3000);
		S1200.click();
		sleep(3000);
		ExcluirDadosEvento.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		flagEnviar.click();
		sleep(3000);
		enviarSeleccionado.click();
		sleep(4000);
		enviarPendencias.click();
		sleep(4000);
		
		
		
		
		boolean sucesso = editado.equals(true);
		System.out.println(sucesso);
		
		
		return sucesso;
	}

}
