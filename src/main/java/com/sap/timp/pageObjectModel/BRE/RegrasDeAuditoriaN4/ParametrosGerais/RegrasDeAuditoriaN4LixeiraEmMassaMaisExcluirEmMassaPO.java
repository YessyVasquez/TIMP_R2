package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN4LixeiraEmMassaMaisExcluirEmMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[contains(@class, \"ruletype-field\")]/div/div/div[2]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Auditoria Nvl 4\"][1]")
	public WebElement opcaotipoderegra;
	
	@FindBy(xpath = "//td[contains(@class, \"component-field\")]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componentetp1;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"DFG\"][1]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategoryReference-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	
	@FindBy(xpath = "//td[@class=\"datastructureReference-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategoryComparison-field\"]/div/div/div[2]")
	public WebElement grupodeestruturacomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestruturacomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturacomparacaotp1;
	
	@FindBy(xpath = "//td[@class=\"datastructureComparison-field\"]/div/div/div[2]")
	public WebElement estruturadedadoscomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedadoscomparacao;
	
	@FindBy(xpath = "//td[@class=\"layoutReference-field\"]/div/div/div[2]")
	public WebElement leiautereferencia;
	
	@FindBy(xpath = "//li[@id][text()=\"7519 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatq1;
	
	@FindBy(xpath = "//li[@id][text()=\"347 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatp1;
	
	@FindBy(xpath = "//li[@id][text()=\"141 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatc2;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionReference-field\"]/div/div/div[2]")
	public WebElement versaodoleiautereferencia;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"1.0\"][1]")
	public WebElement opcaoversaodoleiautereferencia;
	
	@FindBy(xpath = "//td[@class=\"layoutComparison-field\"]/div/div/div[2]")
	public WebElement leiautecomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"7520 - TA-TESTE  (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotq1;
	
	@FindBy(xpath = "//li[@id][text()=\"348 - TA-TESTE  (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotp1;
	
	@FindBy(xpath = "//li[@id][text()=\"143 - TA-TESTE (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotc2;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionComparison-field\"]/div/div/div[2]")
	public WebElement versaoleiautecomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"1.0\"]")
	public WebElement opcaoversaoleiautecomparacao;

	@FindBy(xpath = "//td[contains(@class, \"specialReference-field\")]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Toda a Obrigação\"][1]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[contains(@class, \"specialComparison-field\")]/div/div/div[2]")
	public WebElement caracteristicaespecialcomparacao;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Toda a Obrigação\"][1]")
	public WebElement opcaocaracteristicaespecialcomparacao;
	
	@FindBy(xpath = "//td[contains(@class, \"regulation-field\")]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"TA-TESTE\"][1]")
	public WebElement opcaoregulamento;
	
	@FindBy(xpath = "//td[contains(@class, \"EffectiveDateFrom\")]/div/div/input")
	public WebElement dataValidadeDe;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Não;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	
	public RegrasDeAuditoriaN4LixeiraEmMassaMaisExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regraAuditoriaN4.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println("Ultimo id Na biblioteca:"+id);
	
		novo.click();
		sleep(2000);
		
		
		//Primeiro registro
		
		sleep(1000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTEAUTOMATIZADO N4 1 - NÃO MEXER ");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcaotipoderegra.click();
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			componentetp1.click();
			sleep(1000);
		}else {
			componente.click();
			sleep(1000);
		}	 
		opcaocomponente.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		grupodeestrutura.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturatp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestrutura.click();
			sleep(1000);
		}	
				
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		grupodeestruturacomparacao.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturacomparacaotp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestruturacomparacao.click();
			sleep(1000);
		}
		
		estruturadedadoscomparacao.click();
		sleep(1000);
		opcaoestruturadedadoscomparacao.click();
		sleep(1000);
		
		waitExpectElement(leiautereferencia);
		leiautereferencia.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			opcaoleiautereferenciatc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq2")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautereferenciatp1.click();
			sleep(1000);
		}
		
		//attributeToBeXpath("//td[contains(@class, \"layoutVersion-field\")]/div", "class", "base-select required");
		versaodoleiautereferencia.click();
		sleep(1000);
		opcaoversaodoleiautereferencia.click();
		sleep(1000);
		
		leiautecomparacao.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			opcaoleiautecomparacaotc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq2")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautecomparacaotp1.click();
			sleep(1000);
		}
		
		sleep(1000);
		versaoleiautecomparacao.click();
		sleep(1000);
		opcaoversaoleiautecomparacao.click();
		sleep(1000);
		caracteristicaespecial.click();
		sleep(1000);
		opcaocaracteristicaespecial.click();
		sleep(1000);
		caracteristicaespecialcomparacao.click();
		sleep(1000);
		opcaocaracteristicaespecialcomparacao.click();
		sleep(1000);
		actionsMoveToElementXpath("//td[contains(@class, \"EffectiveDateTo\")]/div/div/input");
		regulamento.click();
		sleep(1000);
		opcaoregulamento.click();
		sleep(1000);
		
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(regraAuditoriaN4);
		sleep(2000);
		regraAuditoriaN4.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//-----------SEGUNDO----------------
		novo.click();
		sleep(2000);
		
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTEAUTOMATIZADO N4 2 - NÃO MEXER ");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcaotipoderegra.click();
		sleep(1000);
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			componentetp1.click();
			sleep(1000);
		}else {
			componente.click();
			sleep(1000);
		}	 
		opcaocomponente.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		grupodeestrutura.click();
		sleep(1000);
	
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturatp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestrutura.click();
			sleep(1000);
		}	
				
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		grupodeestruturacomparacao.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturacomparacaotp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestruturacomparacao.click();
			sleep(1000);
		}
		
		estruturadedadoscomparacao.click();
		sleep(1000);
		opcaoestruturadedadoscomparacao.click();
		sleep(1000);
		
		waitExpectElement(leiautereferencia);
		leiautereferencia.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			opcaoleiautereferenciatc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq2")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautereferenciatp1.click();
			sleep(1000);
		}
		
		//attributeToBeXpath("//td[contains(@class, \"layoutVersion-field\")]/div", "class", "base-select required");
		versaodoleiautereferencia.click();
		sleep(1000);
		opcaoversaodoleiautereferencia.click();
		sleep(1000);
		
		leiautecomparacao.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			opcaoleiautecomparacaotc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq2")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautecomparacaotp1.click();
			sleep(1000);
		}
		
		sleep(1000);
		versaoleiautecomparacao.click();
		sleep(1000);
		opcaoversaoleiautecomparacao.click();
		sleep(1000);
		caracteristicaespecial.click();
		sleep(1000);
		opcaocaracteristicaespecial.click();
		sleep(1000);
		caracteristicaespecialcomparacao.click();
		sleep(1000);
		opcaocaracteristicaespecialcomparacao.click();
		sleep(1000);
		actionsMoveToElementXpath("//td[contains(@class, \"EffectiveDateTo\")]/div/div/input");
		regulamento.click();
		sleep(1000);
		opcaoregulamento.click();
		sleep(1000);
		
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(regraAuditoriaN4);
		sleep(2000);
		regraAuditoriaN4.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		if(rows > 1) {
			rows = rows-1;
		}
		
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		boolean sucesso1 =false;
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			System.out.println("Sim são os ids criados nesse teste");
			sucesso1 = true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("Não são os ids criados nesse teste");
			sucesso1 = false;
			sucesso.add(sucesso1);
		}
		//Lixeira em massa
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check1.click();
		sleep(2000);
		
		if(rows1 > 1) {
			rows1 = rows1-1;
		}
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check2.click();
		sleep(2000);
		
		WebElement lixeiraemmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		lixeiraemmassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//--------------------------- excluir em massa ---------------------------------
		//waitExpectElement(mensagem);
		//sleep(2000);
		//waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		if(rows2 > 1) {
			rows2 = rows2-1;
		}
		
		String idRegistro2lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(idRegistro1lixeira);
		System.out.println(idRegistro2lixeira);
		
		double idRegistroD1lixeira = convertToDouble(idRegistro1lixeira);
		double idRegistroD2lixeira = convertToDouble(idRegistro2lixeira);

	
		boolean sucesso2 =false;
		if (idRegistroD1lixeira == idRegistroD1 && idRegistroD2lixeira == idRegistroD2) {
			System.out.println("São os mesmos id's que foram criado");
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("Não são os mesmos id's que foram criado");
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check3.click();
		sleep(2000);
		
		if(rows3 > 1) {
			rows3 = rows3-1;
		}
		
		WebElement check4 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check4.click();
		sleep(2000);
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(mensagem);
		//sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows4=driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows4+"]/div[3]/div")).getText();

		sleep(2000);
		
		System.out.println("Id do último item na lixeira: "+idB);
		
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso3 = false;
		if (idBD != idRegistroD1lixeira && idBD!=idRegistroD2lixeira) {
			System.out.println("Os ids não constam na biblioteca");
			sucesso3 = true;
			sucesso.add(sucesso3);
		}else {
			System.out.println("Os ids constam na biblioteca");
			sucesso3=false;
			sucesso.add(sucesso3);
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}

}
