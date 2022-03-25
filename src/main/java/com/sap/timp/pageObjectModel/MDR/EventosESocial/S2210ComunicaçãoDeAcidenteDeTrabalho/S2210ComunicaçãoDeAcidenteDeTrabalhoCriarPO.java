package com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoCriarPO  extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuEventosEsocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-communicationWorkAccident\"]")
	public WebElement subMenuComunicacaoDeAcidente;
	
	@FindBy(xpath = "//span[text()=\"Novo S2210 – Comunicação de Acidente de Trabalho\"]")
	public WebElement btnNovoRegistro;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@class= \"list-option\"][2]/div")
	public WebElement opcionCombo2;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\")][1]")
	public WebElement opcionCombo3;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\")][2]")
	public WebElement opcionCombo4;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	// Informações Gerais
	@FindBy(xpath = "//div[contains(@class, \"company\")]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@class, \"branch\")]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@class, \"registerType\")]/div/div[2]/div/div[2]")
	public WebElement tipoRegistro;
	
	@FindBy(xpath = "//div[contains(@class, \"registerNumber\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroRegistro;
	
	@FindBy(xpath = "//div[contains(@class, \"matricula\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement matricula;
	
	@FindBy(xpath = "//div[contains(@class, \"beneficiaryCpf\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement cpfDoBeneficiarioDoPagamento;
	
	@FindBy(xpath = "//div[contains(@class, \"nisCode\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inscricaoDoSegurado;
	
	@FindBy(xpath = "//div[contains(@class, \"accidentData \")]/div/div[1]/input")
	public WebElement dataDoAcidente;
	
	@FindBy(xpath = "//div[contains(@class, \"accidentHour\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement horaDoAccidente;
	
	@FindBy(xpath = "//div[contains(@class, \"accidentType\")]/div/div[2]/div/div[2]")
	public WebElement tipoDeAcidente;
	
	@FindBy(xpath = "//div[contains(@class, \"catType\")]/div/div[2]/div/div[2]")
	public WebElement tipoDoCAT;
	
	@FindBy(xpath = "//div[contains(@class, \"death\")]/div/div[2]/div/div[2]")
	public WebElement houveObito;
	
	@FindBy(xpath = "//div[contains(@class, \"deathDate\")]/div/div[1]/input")
	public WebElement dataDoObito;
	
	@FindBy(xpath = "//div[contains(@class, \"policialCommunication\")]/div/div[2]/div/div[2]")
	public WebElement houveComunicacaoAutPolicial;
	
	@FindBy(xpath = "//div[contains(@class, \"situationCode\")]/div/div[2]/div/div[2]")
	public WebElement codigoDaSituacaoGeradora;
	
	@FindBy(xpath = "//div[contains(@class, \"catEmission\")]/div/div[2]/div/div[2]")
	public WebElement catEmitidaPor;
	
	@FindBy(xpath = "//div[contains(@class, \"observation\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement observacao;
	
	@FindBy(xpath = "//div[contains(@class, \"probableDiagnosis\")]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement diagnosticoProvavel;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom \")]/div/div[1]/input")
	public WebElement validadeDe;

	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo \")]/div/div[1]/input")
	public WebElement validadeAte;
	
	// Local do Acidente
	@FindBy(xpath = "//div[contains(@class, \"localCnpj\")]/div/div[2]/div/div/div[2]/input")
	public WebElement cnpjDoLocal;
	
	@FindBy(xpath = "//div[contains(@class, \"localType\")]/div/div[2]/div/div[2]")
	public WebElement tipoDoLocal;
	
	@FindBy(xpath = "//div[contains(@class, \"localSpecification\")]/div/div[2]/div/div/div[2]/input")
	public WebElement especificacaoDoLocal;
	
	@FindBy(xpath = "//div[contains(@class, \"number\")]/div/div[2]/div/div/div[2]/input")
	public WebElement numerico;
	
	@FindBy(xpath = "//div[contains(@class, \"publicPlace\")]/div/div[2]/div/div/div[2]/input")
	public WebElement logradouro;
	
	@FindBy(xpath = "//div[contains(@class, \"uf\")]/div/div[2]/div/div/div[2]/input")
	public WebElement uf;
	
	@FindBy(xpath = "//div[contains(@class, \"countyCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoMunicipio;
	
	@FindBy(xpath = "//div[contains(@class, \"cep\")]/div/div[2]/div/div/div[2]/input")
	public WebElement cep;
	
	@FindBy(xpath = "//div[contains(@class, \"countryCode\")]/div/div[2]/div/div[2]")
	public WebElement codigoPais;
	
	// Partes Atingidas
	@FindBy(xpath = "//div[contains(@class, \"causerAgent\")]/div/div[2]/div/div[2]")
	public WebElement agenteCausador;
	
	// Atestado
	@FindBy(xpath = "//div[contains(@class, \"cnesCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoCNES;
	
	@FindBy(xpath = "//div[contains(@class, \"serviceDate \")]/div/div[1]/input")
	public WebElement dataDoAtendimento;
	
	@FindBy(xpath = "//div[contains(@class, \"serviceHour\")]/div/div[2]/div/div/div[2]/input")
	public WebElement horaDoAtendimiento;
	
	@FindBy(xpath = "//div[contains(@class, \"hospitalization\")]/div/div[2]/div/div[2]")
	public WebElement houveInternacao;
	
	@FindBy(xpath = "//div[contains(@class, \"treatmentDays\")]/div/div[2]/div/div/div[2]/input")
	public WebElement duracaoDoTratamentoEmDias;
	
	@FindBy(xpath = "//div[contains(@class, \"removal\")]/div/div[2]/div/div[2]")
	public WebElement afastamento;
	
	@FindBy(xpath = "//div[contains(@class, \"injuryNature\")]/div/div[2]/div/div[2]")
	public WebElement naturalezaDaLesao;
	
	@FindBy(xpath = "//div[contains(@class, \"injuryDescription\")]/div/div[2]/div/div/div[2]/input")
	public WebElement descricaoDaLesao;
	
	@FindBy(xpath = "//div[contains(@class, \"cidCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoCID;
	
	@FindBy(xpath = "//div[contains(@class, \"atestationObservation\")]/div/div[2]/div/div/div[2]/input")
	public WebElement observacaoAtestado;
	
	@FindBy(xpath = "//div[contains(@class, \"medicalObservations\")]/div/div[2]/div/div/div[2]/input")
	public WebElement observacoesMedicas;
	
	// Doctor
	@FindBy(xpath = "//div[contains(@class, \"name\")]/div/div[2]/div/div/div[2]/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[contains(@class, \"inscriptionNumber\")]/div/div[2]/div/div/div[2]/input")
	public WebElement numeroDeInscricao;
	
	@FindBy(xpath = "//div[contains(@class, \"organClass\")]/div/div[2]/div/div[2]")
	public WebElement orgaoClasse;
	
	@FindBy(xpath = "//div[contains(@class,\"organClassUf\")]/div/div[2]/div/div/div[2]/input")
	public WebElement ufDoctor;
	
	// CAT
	@FindBy(xpath = "//div[contains(@class, \"ctOriginDate\")]/div/div[2]/div/div/div[2]/input")
	public WebElement dataDaCATOrigem;
	
	@FindBy(xpath = "//div[contains(@class, \"catOriginNumber\")]/div/div[2]/div/div/div[2]/input")
	public WebElement numCATORigem;
	
	@FindBy(xpath = "//span[text()=\"Novo Partes Atingidas\"]")
	public WebElement btnNovoPartesAtingidas;
	
	@FindBy(xpath = "//div[@id=\"reachedPartCode\"]/div/div/div[2]")
	public WebElement codigoParteAtingida;
	
	@FindBy(xpath = "//div[@id=\"bodySide\"]/div/div/div[2]")
	public WebElement ladoDoCorpo;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public S2210ComunicaçãoDeAcidenteDeTrabalhoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		menuEventosEsocial.click();
		sleep(1000);

		subMenuComunicacaoDeAcidente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);			
		sleep(2000);

		btnNovoRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class, \"branch\")]/div/div[2]/div/div/div[2]/input", "class", "");
		filial.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		tipoRegistro.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(2000);
		
		numeroRegistro.click();
		sleep(1000);
		numeroRegistro.sendKeys("552345");
		sleep(2000);
		
		matricula.click();
		sleep(1000);
		matricula.sendKeys("F2F2F2");
		sleep(2000);
		
		cpfDoBeneficiarioDoPagamento.click();
		sleep(1000);
		cpfDoBeneficiarioDoPagamento.sendKeys("f1f1f1");
		sleep(2000);
		
		inscricaoDoSegurado.click();
		sleep(1000);
		inscricaoDoSegurado.sendKeys("f3f3f3");
		sleep(2000);
		
		dataDoAcidente.click();
		sleep(1000);
		dataDoAcidente.sendKeys(fechaActual());
		sleep(2000);
		
		horaDoAccidente.click();
		sleep(1000);
		horaDoAccidente.sendKeys("5 PM");
		sleep(2000);
		
		tipoDeAcidente.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		tipoDoCAT.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		houveObito.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		dataDoObito.click();
		sleep(1000);
		dataDoObito.sendKeys(fechaActual());
		sleep(2000);
		
		houveComunicacaoAutPolicial.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		codigoDaSituacaoGeradora.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		
		catEmitidaPor.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		observacao.click();
		sleep(1000);
		observacao.sendKeys("Ninguna");
		sleep(2000);
		
		diagnosticoProvavel.click();
		sleep(1000);
		diagnosticoProvavel.sendKeys("N/A");
		sleep(2000);
		
		validadeDe.click();
		sleep(1000);
		validadeDe.sendKeys(fechaActual());
		sleep(2000);
		
		validadeAte.click();
		sleep(1000);
		validadeAte.sendKeys(fechaActual());
		sleep(2000);
		
		cnpjDoLocal.click();
		sleep(1000);
		cnpjDoLocal.sendKeys("None");
		sleep(2000);
		
		tipoDoLocal.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(2000);
		
		especificacaoDoLocal.click();
		sleep(1000);
		especificacaoDoLocal.sendKeys("Ningun local");
		sleep(2000);
		
		numerico.click();
		sleep(1000);
		numerico.sendKeys("12345677");
		sleep(2000);
		
		logradouro.click();
		sleep(1000);
		logradouro.sendKeys("asfas");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		uf.sendKeys("ud asdas");
		sleep(2000);
		
		codigoMunicipio.click();
		sleep(1000);
		codigoMunicipio.sendKeys("0000001");
		sleep(2000);
		
		cep.click();
		sleep(1000);
		cep.sendKeys("tester dev");
		sleep(2000);
		
		codigoPais.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(2000);
		
		agenteCausador.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		body.click();
		sleep(2000);
		
		codigoCNES.click();
		sleep(1000);
		codigoCNES.sendKeys("0001");
		sleep(2000);
		
		dataDoAtendimento.click();
		sleep(1000);
		dataDoAtendimento.sendKeys(fechaActual());
		sleep(2000);
		
		horaDoAtendimiento.click();
		sleep(1000);
		horaDoAtendimiento.sendKeys("5 PM");
		sleep(2000);
		
		houveInternacao.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		duracaoDoTratamentoEmDias.click();
		sleep(1000);
		duracaoDoTratamentoEmDias.sendKeys("5");
		sleep(2000);
		
		afastamento.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		naturalezaDaLesao.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		descricaoDaLesao.click();
		sleep(1000);
		descricaoDaLesao.sendKeys("5fasfa sfsas");
		sleep(2000);
		
		codigoCID.click();
		sleep(1000);
		codigoCID.sendKeys("50000");
		sleep(2000);
		
		observacaoAtestado.click();
		sleep(1000);
		observacaoAtestado.sendKeys("Ninguna");
		sleep(2000);
		
		observacoesMedicas.click();
		sleep(1000);
		observacoesMedicas.sendKeys("Ninguna");
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("Tester doctor");
		sleep(2000);
		
		numeroDeInscricao.click();
		sleep(1000);
		numeroDeInscricao.sendKeys("0801 00");
		sleep(2000);
		
		orgaoClasse.click();
		sleep(1000);
		opcionCombo2.click();
		sleep(2000);
		
		ufDoctor.click();
		sleep(1000);
		ufDoctor.sendKeys("asd asd");
		sleep(2000);
		
		dataDaCATOrigem.click();
		sleep(1000);
		dataDaCATOrigem.sendKeys("asda  as");
		sleep(2000);
		
		numCATORigem.click();
		sleep(1000);
		numCATORigem.sendKeys("0001899");
		sleep(2000);
		
		btnNovoPartesAtingidas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigoParteAtingida.click();
		sleep(1000);
		opcionCombo3.click();
		sleep(2000);
		
		ladoDoCorpo.click();
		sleep(1000);
		opcionCombo4.click();
		sleep(2000);
		
		btnAceitar.click();
		sleep(2000);		
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("S2210ComunicaçãoDeAcidenteDeTrabalho",idB);

		sleep(2000);
		System.out.println(id);
		System.out.println(idB);

		double idD = Integer.valueOf(id);
		double idBD = Integer.valueOf(idB);

		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;

		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}

		return sucesso;
	}
}
