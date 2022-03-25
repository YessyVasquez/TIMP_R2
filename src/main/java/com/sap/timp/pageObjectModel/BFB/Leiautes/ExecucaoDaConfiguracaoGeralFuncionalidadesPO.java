package com.sap.timp.pageObjectModel.BFB.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ExecucaoDaConfiguracaoGeralFuncionalidadesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class= \"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"filename\"]/div/div/input")
	public WebElement inputNome;
	
	@FindBy(xpath = "//div[@id=\"effectiveDateFrom\"]/div/div/input")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//div[@id=\"filetype\"]/div/div/div[2]")
	public WebElement cboTipoLeiaute;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Conteúdo\"]")
	public WebElement opcionTipoLeiaute;
	
	@FindBy(xpath = "//div[@id=\"datastructure\"]/div/div/div[2]")
	public WebElement cboGrupoEstrutura;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Ajuste\"][1]")
	public WebElement opcionGrupoEstrutura;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Ajustes\"][1]")
	public WebElement opcionGrupoEstrutura2;
	
	@FindBy(xpath = "//div[@id=\"sub-structure\"]/div/div/div[2]")
	public WebElement cboEstruturaDeDatos;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstruturaDeDatos;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button/span[text()=\"Voltar\"]")
	public WebElement btnVoltar;
	
	@FindBy(xpath = "//button/span[text()=\"Configurações\"]")
	public WebElement btnConfiguraciones;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement btnCancelar;
	
	@FindBy(xpath = "//span[text()=\"Leiautes Públicos\"]")
	public WebElement leiautesPublicos;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-favorite-layout\"]")
	public WebElement meusFavoritos;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltro;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement inputSubperiodo;
	
	String url = driver.getCurrentUrl();
	
	public ExecucaoDaConfiguracaoGeralFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void leiautes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroLeiaute = "0";
		
		if(rows > 0) {
			idRegistroLeiaute = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		System.out.println("Id Registro Leiaute: " + idRegistroLeiaute);
		System.out.println("");
		
		idInserir("BFBLeiauteID", idRegistroLeiaute);
		
		// Para probar en TC2 y TP1 si falla el metoddo de copiarEditarPublicoPrivadoFavoritoLixeiraRestaurarExcluir, agregar el Id de Leiaute Creado  manualmente aqui y descomentar la siguiente linea
		// Comentar los metodos de Criar leiaute y copiarEditarPublicoPrivadoFavoritoLixeiraRestaurarExcluir para que continue con etiquetaComTexto
//		idInserir("BFBLeiauteIdCreado", "380");
	}
	
	public void criarLeiaute() {
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputNome.sendKeys("TESTE AUTOMATIZADO - QA");
		sleep(1000);
		
		dataInicio.sendKeys("01/01/2013");
		sleep(1000);
		
		cboTipoLeiaute.click();
		sleep(1000);
		opcionTipoLeiaute.click();
		sleep(1000);
		
		actionsMoveToElementElement(cboEstruturaDeDatos);
		cboGrupoEstrutura.click();
		sleep(1000);
		if(url.contains("tp1")) {
			opcionGrupoEstrutura2.click();
		}else {
			opcionGrupoEstrutura.click();
		}
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"sub-structure\"]/div", "class", "base-select required");
		cboEstruturaDeDatos.click();
		sleep(1000);
		opcionEstruturaDeDatos.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public ArrayList<Boolean> copiarEditarPublicoPrivadoFavoritoLixeiraRestaurarExcluir() {
		btnVoltar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroLeiauteCreado = "0";
		
		if(rows > 0) {
			idRegistroLeiauteCreado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		System.out.println("ID Registro Leiaute creado: " + idRegistroLeiauteCreado);
		System.out.println("");
		
		idInserir("BFBLeiauteIdCreado", idRegistroLeiauteCreado);
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroLeiauteCreado + "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroLeiauteCreado + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		btnGravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		btnConfiguraciones.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorNuevo = "Cópia de TESTE AUTOMATIZADO - QA - Editado";
		String valorOriginal = inputNome.getAttribute("value");
		
		System.out.println("-----------Configuracoes do Arquivo------------");
		System.out.println("Nome Valor nuevo a enviar: " + valorNuevo);
		System.out.println("Nome Valor Original: " + valorOriginal);
		System.out.println("");
		
		inputNome.clear();
		inputNome.sendKeys(valorNuevo);
		
		WebElement btnAplicar = driver.findElement(By.xpath("//button[text()=\"Aplicar\"]"));
		btnAplicar.click();
		
		WebElement btnGravarConfiguracoes = driver.findElement(By.xpath("//button/span[text()=\"Gravar\"]"));
		btnGravarConfiguracoes.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		/*btnConfiguraciones.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		
		String valorEditado = inputNome.getAttribute("value");
		System.out.println("Nome valor ya editado: " + valorEditado);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorEditado.equals(valorNuevo));
		
		System.out.println("Edicion: " + sucesso);
		System.err.println("");
		
		btnCancelar.click();
		
		btnVoltar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistroCopiado = "0";
		
		if(rows > 0) {
			idRegistroCopiado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		System.out.println("ID Registro Leiaute copiado: " + idRegistroCopiado);
		System.out.println("");
		
		if(Integer.parseInt(idRegistroCopiado) > Integer.parseInt(idRegistroLeiauteCreado)) {
			sucesso.add(true);
			System.out.println("Se creo la copia del registro...");
		}else {
			sucesso.add(false);
			System.out.println("No se creo la copia del registro...");
		}
		
		idInserir("BFBLeiauteRegistroCopia", idRegistroCopiado);
		
		// Publico Privado
		WebElement btnPublicoPrivado = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[4]/span"));
		btnPublicoPrivado.click();
		sleep(5000);
		
		WebElement btnAplicarPubliicoPrivado = driver.findElement(By.xpath("//div[@id=\"base-shareBuilder-wrapper\"]/div[3]/button[text()=\"Aplicar\"]"));
		btnAplicarPubliicoPrivado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		leiautesPublicos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputPesquisar.sendKeys(idRegistroCopiado);
		inputPesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Verificar si se puso publico
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		if(rows > 0) {
			sucesso.add(true);
			System.out.println("Publico creado");
			System.out.println("");
		}else {
			sucesso.add(false);
			System.out.println("Publico no se creo...");
			System.out.println("");
		}
		
		// Marcar favorito
		WebElement favorito = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[3]/span"));
		
		favorito.click();		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		meusFavoritos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputPesquisar.clear();
		inputPesquisar.sendKeys(idRegistroCopiado);
		inputPesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Verificar si se puso favorito
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		if(rows > 0) {
			sucesso.add(true);
			System.out.println("Favorito creado...");
			System.out.println("");
		}else {
			sucesso.add(false);
			System.out.println("Favorito no se creo...");
			System.out.println("");
		}
		
		menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Restaurar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnSim = driver.findElement(By.xpath("//button[text()=\"Sim\"]"));
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		leiautesPublicos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputPesquisar.clear();
		inputPesquisar.sendKeys(idRegistroCopiado);
		inputPesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistroCopiado + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
	
	public void etiquetaComTexto() {
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("BFBLeiauteIdCreado");
		System.out.println("Id Registro Leiaute: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		// Enviamos un texto al input
		WebElement inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.sendKeys("TESTE AUTOMATIZADO - QA");
		inputEtiqueta.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void etiquetaCampoEstrutura() {		
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
			
		WebElement abaObjetoDeDados = driver.findElement(By.xpath("//span[text()=\"Objeto de Dados\"]"));
		abaObjetoDeDados.click();
		
		WebElement ajustesFiscais = driver.findElement(By.xpath("//li[@data-id=\"18\"]"));
		ajustesFiscais.click();
		
		sleep(1000);
		WebElement ajustes = driver.findElement(By.xpath("//li[@data-id=\"18_0\"]"));
		ajustes.click();
		
		sleep(2000);
		WebElement codigoDaEmpresa = driver.findElement(By.xpath("//span[text()=\"Código da empresa\"]"));
		WebElement contenedorEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div"));		
		
		moveToElement(codigoDaEmpresa, contenedorEtiqueta);
		
		WebElement inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void etiquetaOutputOutros() {		
		WebElement abaFerramenta = driver.findElement(By.xpath("//div[@class=\"container-tabs\"]/div/span/span[text()=\"Ferramentas\"]"));
		abaFerramenta.click();
		
		sleep(1000);
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		sleep(1000);
		
		WebElement inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.click();
		
		Actions  actions = new Actions(driver);
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcEditarFormular = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Editar Fórmula\"]"));
		opcEditarFormular.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(text(), \"Campos de Saída BCB\")]");
		WebElement camposDeSaidaBFB = driver.findElement(By.xpath("//div[contains(text(), \"Campos de Saída BFB\")]"));
		camposDeSaidaBFB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(text(), \"Campos de Saída BCB\")]");
		camposDeSaidaBFB = driver.findElement(By.xpath("//div[contains(text(), \"Campos de Saída BFB\")]"));
		camposDeSaidaBFB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcValores = driver.findElement(By.xpath("//div[@class=\"list-item\" and @tabindex=\"0\" and contains(text(), \"ID45670\")]"));
		opcValores.click();
		
		sleep(2000);
		WebElement opcDescricaco = driver.findElement(By.xpath("//div[@class=\"outputListElement list-item\" and contains(text(), \"12960\")]"));
		actions.doubleClick(opcDescricaco).perform();
		
		sleep(1000);
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void etiquetaDeParagrafo() {		
		WebElement etiquetaParagrafo = driver.findElement(By.xpath("//li[@id=\"AUXLABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiquetaParagrafo, contenedor);
		
		WebElement textAreaParagrado = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/textarea"));
		textAreaParagrado.click();
		textAreaParagrado.sendKeys("TESTE");
		textAreaParagrado.sendKeys(Keys.ENTER);
		textAreaParagrado.sendKeys("AUTOMATIZADO");
		textAreaParagrado.sendKeys(Keys.ENTER);
		textAreaParagrado.sendKeys("QA");
		textAreaParagrado.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void formato() {		
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		WebElement inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.click();
		
		sleep(1000);
		WebElement cboTipoLetra = driver.findElement(By.xpath("//div[@class=\"font-type-wrapper\"]/div/div[1]/div[2]"));
		cboTipoLetra.click();
		
		WebElement opcTipoLetra =driver.findElement(By.xpath("//li[@class=\"list-item\" and @tabindex=\"0\" and text()=\"Arial\"]"));
		opcTipoLetra.click();
		
		sleep(1000);
		WebElement cboTamanioLetra = driver.findElement(By.xpath("//li[@class=\"rightButton library-toolbar-item\"]/div[@class=\"font-size-wrapper\"]/div/div/div[2]"));
		cboTamanioLetra.click();
		
		sleep(1000);
		WebElement opcTamanioLetra =driver.findElement(By.xpath("//li[@class=\"list-item\" and @tabindex=\"0\" and text()=\"32\"]"));
		opcTamanioLetra.click();
		
		
		WebElement btnNegrita = driver.findElement(By.xpath("//button/span[@class=\"button-icon icon-font-Formatting-and-Tool icon-bold\"]"));
		btnNegrita.click();
		
		sleep(1000);
		WebElement opcNegrita = driver.findElement(By.xpath("//span[text()=\"Negrito\"]"));
		opcNegrita.click();
		
		WebElement body = driver.findElement(By.xpath("//body"));
		body.click();
		
		sleep(1000);
		inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.click();
		inputEtiqueta.sendKeys("TESTE");
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void tabelaRepetitiva() {		
		WebElement tabela = driver.findElement(By.xpath("//li[@id=\"TABLE\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(tabela, contenedor);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement inputCantidade = driver.findElement(By.xpath("//div[@id=\"qty-input\"]/div/div/input"));
		inputCantidade.clear();
		inputCantidade.sendKeys("5"); // Se crean 5 para poder colocar bien las columnas
		
		sleep(1000);
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		
		sleep(2000);
		WebElement abaObjetoDeDados = driver.findElement(By.xpath("//span[text()=\"Objeto de Dados\"]"));
		abaObjetoDeDados.click();
		
		WebElement ajustesFiscais = driver.findElement(By.xpath("//li[@data-id=\"18\"]"));
		ajustesFiscais.click();
		
		sleep(1000);
		WebElement ajustes = driver.findElement(By.xpath("//li[@data-id=\"18_0\"]"));
		ajustes.click();
		
		sleep(1000);
		WebElement codigoDaEmpresa = driver.findElement(By.xpath("//span[text()=\"Código da empresa\"]"));
		codigoDaEmpresa.click();
		
		WebElement contenedorColumna1 = driver.findElement(By.xpath("//td[contains(@class, \"table-column ui-droppable\")][1]"));
		contenedorColumna1.click();
		
		actionsMoveToElementElement(codigoDaEmpresa);
		moveToElement(codigoDaEmpresa, contenedorColumna1);
		
		sleep(1000);
		WebElement codigoDaFilial = driver.findElement(By.xpath("//span[text()=\"Código da filial\"]"));
		codigoDaFilial.click();
		
		WebElement contenedorColumna2 = driver.findElement(By.xpath("//td[contains(@class, \"table-column ui-droppable\")][2]"));
		
		actionsMoveToElementElement(codigoDaFilial);
		moveToElement(codigoDaFilial, contenedorColumna2);
		
		sleep(1000);
		WebElement dataDeLancamento = driver.findElement(By.xpath("//span[text()=\"Data de lançamento\"]"));
		dataDeLancamento.click();
		
		WebElement contenedorColumna3 = driver.findElement(By.xpath("//td[contains(@class, \"table-column ui-droppable\")][3]"));
		
		actionsMoveToElementElement(dataDeLancamento);
		moveToElement(dataDeLancamento, contenedorColumna3);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboDia = driver.findElement(By.xpath("//div[@class=\"format select1\"]/div/div/div[2]"));
		cboDia.click();
		
		sleep(1000);
		WebElement opcDia = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"DD\"]"));
		opcDia.click();
		
		WebElement cboMes = driver.findElement(By.xpath("//div[@class=\"format select2\"]/div/div/div[2]"));
		cboMes.click();
		
		sleep(1000);
		WebElement opcMes = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"MM\"]"));
		opcMes.click();
		
		WebElement cboAnio = driver.findElement(By.xpath("//div[@class=\"format select3\"]/div/div/div[2]"));
		cboAnio.click();
		
		sleep(1000);
		WebElement opcAnio = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"AAAA\"]"));
		opcAnio.click();
		
		btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		
		sleep(1000);
		WebElement valorDeAjuste = driver.findElement(By.xpath("//span[text()=\"Valor do ajuste\"]"));
		valorDeAjuste.click();
		
		WebElement contenedorColumna4 = driver.findElement(By.xpath("//td[contains(@class, \"table-column ui-droppable\")][4]"));
		
		actionsMoveToElementElement(valorDeAjuste);
		moveToElement(valorDeAjuste, contenedorColumna4);
		
		sleep(1000);
		WebElement btnOpcionesColunma1 = driver.findElement(By.xpath("//tr[@class=\"primal-row\"]/td[1]/div[2]"));
		btnOpcionesColunma1.click();
		
		sleep(1000);
		WebElement opcRemoverColumna = driver.findElement(By.xpath("//span[text()=\"Remover Coluna\"]"));
		opcRemoverColumna.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void data() {
		WebElement abaFerramenta = driver.findElement(By.xpath("//div[@class=\"container-tabs\"]/div/span/span[text()=\"Ferramentas\"]"));
		abaFerramenta.click();
		
		sleep(1000);
		WebElement data = driver.findElement(By.xpath("//li[@id=\"FORMATDATE\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(data, contenedor);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement dataElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		dataElement.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void saidaSemantica() {
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		WebElement etiquetaElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		etiquetaElement.click();
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcSaida = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Saída automática\"]"));
		opcSaida.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement inputNome = driver.findElement(By.xpath("//div[@id=\"create-name\"]/div/div/input"));
		inputNome.sendKeys("TESTE AUTOMATIZADO - QA");	
				
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		etiquetaElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		etiquetaElement.click();
		
		sleep(1000);
		btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void formula() {	
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		sleep(1000);
		
		WebElement inputEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input"));
		inputEtiqueta.click();
		
		Actions  actions = new Actions(driver);
		
		sleep(1000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcEditarFormular = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Editar Fórmula\"]"));
		opcEditarFormular.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(text(), \"Campos de Saída BCB\")]");
		WebElement camposDeSaidaBFB = driver.findElement(By.xpath("//div[contains(text(), \"Campos de Saída BFB\")]"));
		camposDeSaidaBFB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//div[contains(text(), \"Campos de Saída BCB\")]");
		camposDeSaidaBFB = driver.findElement(By.xpath("//div[contains(text(), \"Campos de Saída BFB\")]"));
		camposDeSaidaBFB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcValores = driver.findElement(By.xpath("//div[@class=\"list-item\" and @tabindex=\"0\" and contains(text(), \"ID45917\")]"));
		opcValores.click();
		
		sleep(2000);
		WebElement opcDescricaco = driver.findElement(By.xpath("//div[@class=\"outputListElement list-item\" and contains(text(), \"12973\")]"));
		actions.doubleClick(opcDescricaco).perform();	
				
		sleep(1000);
		WebElement cajaFormula = driver.findElement(By.xpath("//div[@id=\"formula-Box\"]/div/textarea"));
		actionsMoveToElementElement(cajaFormula);
		cajaFormula.sendKeys("/2");
		
		sleep(1000);
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		
		sleep(3000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void filtroObjetoDeDatos() {
		WebElement btnFiltro = driver.findElement(By.xpath("//span[text()=\"Filtro\"]"));
		btnFiltro.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnBloquear =  driver.findElement(By.xpath("//span[@class=\"icon icon-font-Sign-and-Symbols icon-unlocked icon-btn btn flat trans\"]"));
		btnBloquear.click();
		
		sleep(1000);
		WebElement cboCampo = driver.findElement(By.xpath("//div[@class=\"left-field\"]/div/div[2]"));
		cboCampo.click();
		
		sleep(1000);
		WebElement opcCampo = driver.findElement(By.xpath("//li[contains(@class, \"list-item\") and @id and @tabindex=\"0\" and text()=\"Valor do ajuste\"]"));
		opcCampo.click();
		
		sleep(1000);
		WebElement cboOperador = driver.findElement(By.xpath("//div[@class=\"logic-operator\"]/div/div/div[2]"));
		cboOperador.click();
		
		sleep(1000);		
		WebElement opcOperador = driver.findElement(By.xpath("//li[@class=\"list-item\" and @id and @tabindex=\"0\" and text()=\"<\"]"));
		opcOperador.click();
		
		sleep(1000);
		WebElement cboValor = driver.findElement(By.xpath("//div[@class=\"right-field\"]/div/div/input"));
		cboValor.sendKeys("10000");
		
		sleep(1000);
		WebElement body = driver.findElement(By.xpath("//body"));
		body.click();
		
		sleep(1000);
		WebElement cboTipo = driver.findElement(By.xpath("//div[@class=\"right-field-type\"]/div/div/div[2]"));
		cboTipo.click();
		
		sleep(1000);
		WebElement opcTipo = driver.findElement(By.xpath("//li[@class=\"list-item\" and @id and @tabindex=\"0\" and text()=\"Numérico\"]"));
		opcTipo.click();	
				
		sleep(1000);	
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aceitar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public void datoDeReferencia() {	
		WebElement datoDeReferencia = driver.findElement(By.xpath("//li[@id=\"REFERENCEDATA\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(datoDeReferencia, contenedor);
		
		WebElement abaObjetoDeDados = driver.findElement(By.xpath("//span[text()=\"Objeto de Dados\"]"));
		abaObjetoDeDados.click();
		
		WebElement ajustesFiscais = driver.findElement(By.xpath("//li[@data-id=\"18\"]"));
		ajustesFiscais.click();
		
		sleep(1000);
		WebElement ajustes = driver.findElement(By.xpath("//li[@data-id=\"18_0\"]"));
		ajustes.click();
		
		WebElement codigoDaEmpresa = driver.findElement(By.xpath("//span[text()=\"Código da empresa\"]"));
		WebElement contenedorDatoDeReferencia = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div"));		
		
		moveToElement(codigoDaEmpresa, contenedorDatoDeReferencia);
		
		WebElement datoDeReferenciaElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		datoDeReferenciaElement.click();
		
		sleep(3000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void centralizacao() {	
		WebElement abaFerramenta = driver.findElement(By.xpath("//div[@class=\"container-tabs\"]/div/span/span[text()=\"Ferramentas\"]"));
		abaFerramenta.click();
		
		sleep(1000);
		WebElement etiqueta = driver.findElement(By.xpath("//li[@id=\"LABEL\"]"));
		WebElement contenedor = driver.findElement(By.xpath("//div[@id=\"panel\"]"));
		
		moveToElement(etiqueta, contenedor);
		
		WebElement abaObjetoDeDados = driver.findElement(By.xpath("//span[text()=\"Objeto de Dados\"]"));
		abaObjetoDeDados.click();
		
		WebElement ajustesFiscais = driver.findElement(By.xpath("//li[@data-id=\"18\"]"));
		ajustesFiscais.click();
		
		sleep(1000);
		WebElement ajustes = driver.findElement(By.xpath("//li[@data-id=\"18_0\"]"));
		ajustes.click();
		
		WebElement codigoDaEmpresa = driver.findElement(By.xpath("//span[text()=\"Código da empresa\"]"));
		WebElement contenedorEtiqueta = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div"));		
		
		moveToElement(codigoDaEmpresa, contenedorEtiqueta);
		
		WebElement etiquetaElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		etiquetaElement.click();
		
		sleep(3000);
		WebElement btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		//WebElement opcCentralizacao = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Centralização\"]"));
		WebElement opcionesCentralizacao = driver.findElement(By.xpath("//li[@class=\"option\"][9]/div"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'display:block')", opcionesCentralizacao);
		
		sleep(1000);
		WebElement btnSim = driver.findElement(By.xpath("//span[text()=\"Sim\"]"));
		btnSim.click();
		
		etiquetaElement = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]"));
		etiquetaElement.click();
		
		sleep(3000);
		btnLapiz = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[2]/span"));
		btnLapiz.click();
		
		sleep(1000);
		WebElement opcExcluir = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div[3]/ul/li/span[text()=\"Excluir\"]"));
		opcExcluir.click();
	}
	
	public void relacionamento() {	
		WebElement btnRelacionamento = driver.findElement(By.xpath("//span[text()=\"Relacionamento\"]"));
		btnRelacionamento.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cbpRelacionamento = driver.findElement(By.xpath("//div[@class=\"relation-select\"]/div/div/div[2]"));
		cbpRelacionamento.click();
		
		if(url.contains("tc2") || url.contains("tp1")) {
			WebElement opcRelacionamento = driver.findElement(By.xpath("//li[@class=\"list-item\" and @tabindex=\"0\" and text()=\"Empresa/Filial\"]"));
			opcRelacionamento.click();
		}else {
			WebElement opcRelacionamento = driver.findElement(By.xpath("//li[@class=\"list-item\" and @tabindex=\"0\" and text()=\"Empresa / Filial\"]"));
			opcRelacionamento.click();
		}		
			
		sleep(1000);	
		WebElement btnAceitar = driver.findElement(By.xpath("//button[text()=\"Aplicar\"]"));
		btnAceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public ArrayList<Boolean> filtrosAvancados() {	
		btnVoltar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnNao = driver.findElement(By.xpath("//button[text()=\"Não\"]"));
		btnNao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement inputPesquisar = driver.findElement(By.xpath("//input[@placeholder=\"Pesquisar\"]"));
		inputPesquisar.sendKeys("TESTE AUTOMATIZADO - QA");
		inputPesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos...");
			sucesso.add(true);
		}
		
		WebElement btnFiltrosAvancados = driver.findElement(By.xpath("//button[@id=\"advanced-filters-btn\"]"));
		btnFiltrosAvancados.click();
		
		sleep(2000);
		
		WebElement cboTipo = driver.findElement(By.xpath("//div[@id=\"filter-type\"]/div//div/div[2]"));
		cboTipo.click();
		
		WebElement opcTipo = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Conteúdo\"]"));
		opcTipo.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por tipo...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por tipo...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboGrupoEstrutura = driver.findElement(By.xpath("//div[@id=\"filter-structureGroup\"]/div//div/div[2]"));
		cboGrupoEstrutura.click();
		
		WebElement opcGrupoEstrutura = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]"));
		opcGrupoEstrutura.click();
		
		attributeToBeXpath("//div[@id=\"filter-structure\"]/div", "class", "base-select ");
		WebElement cboEstrutura = driver.findElement(By.xpath("//div[@id=\"filter-structure\"]/div//div/div[2]"));
		cboEstrutura.click();	
		
		WebElement opcEstrutura = driver.findElement(By.xpath("//li[@class=\"list-item\"][1]"));
		opcEstrutura.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por Grupo de estrutura y estrutura...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por Grupo de estrutura y estrutura...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboUusarioCriacao = driver.findElement(By.xpath("//div[@id=\"filter-creation-user\"]/div//div/div[2]"));
		cboUusarioCriacao.click();	
		
		if(url.contains("tp1")) {
			WebElement opcUsuarioCriacao = driver.findElement(By.xpath("//li[@class=\"list-item\" and contains(text(), \"TESTEAUTOMATIZADO\")][1]"));
			opcUsuarioCriacao.click();
		}else {
			WebElement opcUsuarioCriacao = driver.findElement(By.xpath("//li[@class=\"list-item\" and contains(text(), \"TESTE AUTOMATIZADO\")][1]"));
			opcUsuarioCriacao.click();
		}
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por Usuario de criacao...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por Usuario de criacao...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement inputDataCriacao = driver.findElement(By.xpath("//div[@id=\"filter-created\"]/div/div/input"));
		inputDataCriacao.sendKeys("05/03/2021");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por Data de criacao...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por Data de criacao...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement cboUusarioModificacao = driver.findElement(By.xpath("//div[@id=\"filter-modification-user\"]/div//div/div[2]"));
		cboUusarioModificacao.click();	
		
		if(url.contains("tp1")) {
			WebElement opcUsuarioModificaco = driver.findElement(By.xpath("//li[@class=\"list-item\" and contains(text(), \"TESTEAUTOMATIZADO\")][1]"));
			opcUsuarioModificaco.click();
		}else {
			WebElement opcUsuarioModificaco = driver.findElement(By.xpath("//li[@class=\"list-item\" and contains(text(), \"TESTE AUTOMATIZADO\")][1]"));
			opcUsuarioModificaco.click();
		}
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por Usuario de moficacao...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por Usuario de moficacao...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement inputDataModificao = driver.findElement(By.xpath("//div[@id=\"filter-modified\"]/div/div/input"));
		inputDataModificao.sendKeys("05/03/2021");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		if(rows == 0) {
			System.out.println("No hay resultado de busqueda por Data de modificacao...");
			sucesso.add(false);
			return sucesso;
		}else {
			System.out.println("Resultados de busqueda obtenidos por Data de modificacao...");
			sucesso.add(true);
		}

		btnLimpiarFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
	
	public void criarConfiguracao() {
		WebElement abaConfiguracao = driver.findElement(By.xpath("//span[text()=\"Configurações\"]"));
		abaConfiguracao.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistroConfiguracao = "0";
		
		if(rows > 0) {
			idUltimoRegistroConfiguracao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		System.out.println("Id Ultimo Registro Configuracao: " + idUltimoRegistroConfiguracao);
		System.out.println("");
		
		WebElement btnNuevaConfiguracao = driver.findElement(By.xpath("//span[text()=\"Nova Configuração\"]"));
		btnNuevaConfiguracao.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement nome = driver.findElement(By.xpath("//div[@id=\"filename\"]/div/div[2]/div/div/div[2]/input"));
		nome.sendKeys("Configuracao TESTE AUTOMATIZADO");
		
		sleep(1000);
		
		WebElement cboLeiaute = driver.findElement(By.xpath("//div[@id=\"filelayout\"]/div/div[2]"));
		cboLeiaute.click();
		
		WebElement opcLeiaute = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and contains(text(), \"46874\")]"));
		opcLeiaute.click();
		
		sleep(1000);
		
		WebElement cboTributo = driver.findElement(By.xpath("//div[@id=\"filetax\"]/div/div[2]"));
		cboTributo.click();
		
		WebElement opcTributo = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and text()=\"ICMS\"]"));
		opcTributo.click();
		
		sleep(1000);
		
		actionsMoveToElementXpath("//div[@id=\"filebranch\"]/div/div[2]");
		WebElement cboEmpresa = driver.findElement(By.xpath("//div[@id=\"filecompany\"]/div/div/div[2]"));
		cboEmpresa.click();
		
		WebElement opcEmpresa = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"1000\"]"));
		opcEmpresa.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboEmpresa);
		
		sleep(1000);
		
		WebElement cboEstado = driver.findElement(By.xpath("//div[@id=\"filestate\"]/div/div/div[2]"));
		cboEstado.click();
		
		WebElement opcEstado = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"1000-SP\"]"));
		opcEstado.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboEstado);
		
		sleep(1000);
		
		actionsMoveToElementXpath("//div[@id=\"validFrom\"]/div/div/input");
		sleep(5000);
		WebElement cboFilial = driver.findElement(By.xpath("//div[@id=\"filebranch\"]/div/div/div[2]"));
		cboFilial.click();
		
		WebElement opcFilial = driver.findElement(By.xpath("//div[@class=\"list-item-text\"][1]"));
		opcFilial.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboFilial);
		
		sleep(1000);
		WebElement validadeDe = driver.findElement(By.xpath("//div[@id=\"validFrom\"]/div/div/input"));
		validadeDe.sendKeys("01/01/2013");
		
		WebElement btnGravar = driver.findElement(By.xpath("//button[text()=\"Gravar\"]"));
		btnGravar.click();
	}
	
	public boolean executar() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement abaConfiguracao = driver.findElement(By.xpath("//span[text()=\"Configurações\"]"));
		abaConfiguracao.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement raiz = driver.findElement(By.xpath("//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div/div[@class=\"base-tree\"]/div/div/div/div[3]/span"));
		raiz.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		WebElement inputPesquisar = driver.findElement(By.xpath("//input[@placeholder=\"Pesquisar\"]"));
		inputPesquisar.sendKeys(idRegistro);
		inputPesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		//String idRegistro = "1045";
		
		if(rows == 0) {
			System.out.println("No se encontro el registro...");
			return false;
		}
		
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnExecutar = driver.findElement(By.xpath("//ul[@class=\"library-toolbar-items\"]/li/button/span[text()=\"Executar\"]"));
		btnExecutar.click();
		
		WebElement cboFilial = driver.findElement(By.xpath("//div[@id=\"inputBranch\"]/div/div/div[2]"));
		cboFilial.click();
		
		sleep(1000);
		WebElement opcFilial = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"0001\"]"));
		opcFilial.click();
		
		inputSubperiodo.click();
		sleep(2000);

		WebElement flechaAtrasCalendario = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaAtrasCalendario.click();

		String anio = "2013";

		WebElement anioCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"" + anio + "\"]"));
		anioCalendar.click();
		sleep(3000);

		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendar.click();
		sleep(3000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);
		
		WebElement btnExecutar2 = driver.findElement(By.xpath("//div[@id=\"settings-execute\"]/button/span[text()=\"Executar\"]"));
		btnExecutar2.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		boolean sucesso = false;
		
		try {
			WebElement msgExito = driver.findElement(By.xpath("//li[@class=\"base-toast  toast-success   \"]"));		
			
			if(msgExito.isDisplayed()) {
				System.out.println("Executado con exito...");
				sucesso = true;
			}
		} catch (Exception e) {
			System.out.println("No se executo con exito...");
			sucesso = false;
		}		
		
		return sucesso;
	}
	
	public ArrayList<Boolean> numeroDePagina() {
		String valorPrincipal = driver.findElement(By.xpath("//div[@id=\"table-wrapper\"]/table/tbody/tr/td[4]/div/span")).getText();
		System.out.println("Valor principal a comparar pagina 1: " + valorPrincipal);
		System.out.println("");
		
		WebElement pagina2 = driver.findElement(By.xpath("//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]"));
		pagina2.click();		
		sleep(2000);
		
		String valorPrincipal2 = driver.findElement(By.xpath("//div[@id=\"table-wrapper\"]/table/tbody/tr/td[4]/div/span")).getText();
		System.out.println("Valor principal a comparar pagina 2: " + valorPrincipal2);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(!valorPrincipal2.equals(valorPrincipal)) {
			sucesso.add(true);
			System.out.println("Los valores son diferentes, exito...");
		}else {
			sucesso.add(false);
			System.out.println("Los valores son iguales, verificar si cambiaron los valores o es el mismo de la pagina 1.");
		}
		
		sleep(2000);
		WebElement paginaSiguiente = driver.findElement(By.xpath("//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-rightmenu\"]"));
		paginaSiguiente.click();
		
		String valorSiguiente = driver.findElement(By.xpath("//div[@id=\"table-wrapper\"]/table/tbody/tr/td[4]/div/span")).getText();
		System.out.println("Valor principal a comparar pagina siguiente: " + valorSiguiente);
		System.out.println("");
		
		if(!valorSiguiente.equals(valorPrincipal2)) {
			sucesso.add(true);
			System.out.println("Los valores son diferentes, exito...");
		}else {
			sucesso.add(false);
			System.out.println("Los valores son iguales, verificar si cambiaron los valores o es el mismo de la pagina 2.");
		}
		
		sleep(3000);
		
		WebElement ultimaPagina = driver.findElement(By.xpath("//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]"));
		ultimaPagina.click();
		
		String valorUltimaPagina = driver.findElement(By.xpath("//div[@id=\"table-wrapper\"]/table/tbody/tr/td[4]/div/span")).getText();
		System.out.println("Valor principal a comparar ultima pagina: " + valorUltimaPagina);
		System.out.println("");
		
		if(!valorUltimaPagina.equals(valorSiguiente)) {
			sucesso.add(true);
			System.out.println("Los valores son diferentes, exito...");
		}else {
			sucesso.add(false);
			System.out.println("Los valores son iguales, verificar si cambiaron los valores o es el mismo de la pagina anterior.");
		}
		
		return sucesso;
	}
	
	public boolean gravarExecucao() {
		WebElement btnGravar = driver.findElement(By.xpath("//button/span[text()=\"Gravar\"]"));
		btnGravar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		WebElement inputNome = driver.findElement(By.xpath("//div[@id=\"filename\"]/div/div/input"));
		inputNome.sendKeys("Execucao TESTE AUTOMATIZADO");
		
		sleep(1000);
		WebElement btnCriar = driver.findElement(By.xpath("//button[text()=\" Criar\"]"));
		btnCriar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		boolean sucesso = false;
		
		try {
			WebElement msgExito = driver.findElement(By.xpath("//li[@class=\"base-toast  toast-success         \"]"));		
			
			if(msgExito.isDisplayed()) {
				System.out.println("Executado guardada con exito...");
				sucesso = true;
			}
		} catch (Exception e) {
			System.out.println("No se guardo la execusion con exito...");
			sucesso = false;
		}		
		
		return sucesso;
	}
	
	public ArrayList<Boolean> visualizar() {
		WebElement btnVoltar = driver.findElement(By.xpath("//span[text()=\"Voltar\"]"));
		btnVoltar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistro = "46874";
		
		if(rows == 0) {
			System.out.println("No se encontro el registro...");
			sucesso.add(false);
			return sucesso;
		}
		
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de visualizar
		String valor1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input")).getAttribute("value").trim();
		String valor2 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[2]/div/div/input")).getAttribute("value").trim();
		String valor3 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[3]/div/div/input")).getAttribute("value").trim();
		String valor4 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[4]/div/div/textarea")).getAttribute("value").trim();
		String valor5 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[5]/div/div/input")).getAttribute("value").trim();
		String columna1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[1]/span")).getText().trim();
		String columna2 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[2]/span")).getText().trim();
		String columna3 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[3]/span")).getText().trim();
		String columna4 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[4]/span")).getText().trim();
		String valor6 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[7]/div/div/span")).getText().trim();
		String valor7 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[8]/div/div/input")).getAttribute("value").trim();
		String valor8 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[9]/div/div/input")).getAttribute("value").trim();
		String valor9 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[10]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("--------------------------------DATOS DE VISUALIZAR-------------------------------------");
		System.out.println("Valor 1: " + valor1);
		System.out.println("Valor 2: " + valor2);
		System.out.println("Valor 3: " + valor3);
		System.out.println("Valor 4: " + valor4);
		System.out.println("Valor 5: " + valor5);
		System.out.println("Valor columna 1: " + columna1);
		System.out.println("Valor columna 2: " + columna2);
		System.out.println("Valor columna 3: " + columna3);
		System.out.println("Valor columna 4: " + columna4);
		System.out.println("Valor 6: " + valor6);
		System.out.println("Valor 7: " + valor7);
		System.out.println("Valor 8: " + valor8);
		System.out.println("Valor 9: " + valor9);
		System.out.println("");
		
		btnVoltar = driver.findElement(By.xpath("//span[text()=\"Voltar\"]"));
		btnVoltar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: " + idRegistro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Editar
		String valor1_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[1]/div/div/input")).getAttribute("value").trim();
		String valor2_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[2]/div/div/input")).getAttribute("value").trim();
		String valor3_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[3]/div/div/input")).getAttribute("value").trim();
		String valor4_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[4]/div/div/textarea")).getAttribute("value").trim();
		String valor5_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[5]/div/div/input")).getAttribute("value").trim();
		String columna1_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[1]/span")).getText().trim();
		String columna2_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[2]/span")).getText().trim();
		String columna3_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[3]/span")).getText().trim();
		String columna4_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[6]/div/div/table/tbody/tr/td[4]/span")).getText().trim();
		String valor6_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[7]/div/div/span")).getText().trim();
		String valor7_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[8]/div/div/input")).getAttribute("value").trim();
		String valor8_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[9]/div/div/input")).getAttribute("value").trim();
		String valor9_1 = driver.findElement(By.xpath("//div[@id=\"panel\"]/div[10]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("--------------------------------DATOS DE Editar-------------------------------------");
		System.out.println("Valor 1: " + valor1_1);
		System.out.println("Valor 2: " + valor2_1);
		System.out.println("Valor 3: " + valor3_1);
		System.out.println("Valor 4: " + valor4_1);
		System.out.println("Valor 5: " + valor5_1);
		System.out.println("Valor columna 1: " + columna1_1);
		System.out.println("Valor columna 2: " + columna2_1);
		System.out.println("Valor columna 3: " + columna3_1);
		System.out.println("Valor columna 4: " + columna4_1);
		System.out.println("Valor 6: " + valor6_1);
		System.out.println("Valor 7: " + valor7_1);
		System.out.println("Valor 8: " + valor8_1);
		System.out.println("Valor 9: " + valor9_1);
		System.out.println("");
		
		sucesso.add(valor1_1.equals(valor1));
		sucesso.add(valor2_1.equals(valor2));
		sucesso.add(valor3_1.equals(valor3));
		sucesso.add(valor4_1.equals(valor4));
		sucesso.add(valor5_1.equals(valor5));
		sucesso.add(columna1_1.equals(columna1));
		sucesso.add(columna2_1.equals(columna2));
		sucesso.add(columna3_1.equals(columna3));
		sucesso.add(columna4_1.equals(columna4));
		sucesso.add(valor6_1.equals(valor6));
		sucesso.add(valor7_1.equals(valor7));
		sucesso.add(valor8_1.equals(valor8));
		sucesso.add(valor9_1.equals(valor9));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
