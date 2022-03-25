package com.timp.test.BFB.Leiautes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BFB.AcessarBFBPO;
import com.sap.timp.pageObjectModel.BFB.Leiautes.ExecucaoDaConfiguracaoGeralFuncionalidadesPO;

public class ExecucaoDaConfiguracaoGeralFuncionalidades extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBFBPO acessarBFBPO;
	ExecucaoDaConfiguracaoGeralFuncionalidadesPO execucaoDaConfiguracaoGeralFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBFBPO = new AcessarBFBPO();
		execucaoDaConfiguracaoGeralFuncionalidadesPO = new ExecucaoDaConfiguracaoGeralFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBFBPO.acessarBFB();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}

	@Test(priority = 2)
	public void leiaute() {
		execucaoDaConfiguracaoGeralFuncionalidadesPO.leiautes();
	}
	
	@Test(priority = 3)
	public void criarLeiaute() {
		execucaoDaConfiguracaoGeralFuncionalidadesPO.criarLeiaute();
	}
	
	@Test(priority = 4)
	public void copiarEditarPublicoPrivadoFavoritosLixeiraRestaurarExcluir() {		
		ArrayList<Boolean> sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.copiarEditarPublicoPrivadoFavoritoLixeiraRestaurarExcluir();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
	}
	
	@Test(priority = 5)
	public void etiquetaComTexto() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.etiquetaComTexto();		
	}
	
	@Test(priority = 6)
	public void etiquetaCampoEstrutura() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.etiquetaCampoEstrutura();		
	}
	
	@Test(priority = 7)
	public void etiquetaOutputOutros() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.etiquetaOutputOutros();		
	}
	
	@Test(priority = 8)
	public void etiquetaDeParagrafo() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.etiquetaDeParagrafo();		
	}
	
	@Test(priority = 9)
	public void formato() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.formato();		
	}
	
	@Test(priority = 10)
	public void tabelaRepetitiva() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.tabelaRepetitiva();		
	}
	
	@Test(priority = 11)
	public void data() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.data();		
	}
	
	@Test(priority = 12)
	public void saidaSemantica() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.saidaSemantica();		
	}
	
	@Test(priority = 13)
	public void formula() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.formula();		
	}
	
	@Test(priority = 14)
	public void filtroObjetoDeDatos() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.filtroObjetoDeDatos();		
	}
	
	@Test(priority = 15)
	public void datoDeReferencia() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.datoDeReferencia();		
	}
	
	@Test(priority = 16)
	public void centralizacao() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.centralizacao();		
	}
	
	@Test(priority = 17)
	public void relacionamento() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.relacionamento();		
	}
	
	@Test(priority = 18)
	public void filtrosAvancados() {			
		ArrayList<Boolean> sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.filtrosAvancados();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
	
	@Test(priority = 19)
	public void criarConfiguracao() {		
		execucaoDaConfiguracaoGeralFuncionalidadesPO.criarConfiguracao();		
	}
	
	@Test(priority = 20)
	public void executar() {		
		boolean sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.executar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 21)
	public void numeroDePagina() {			
		ArrayList<Boolean> sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.numeroDePagina();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
	
	@Test(priority = 23)
	public void gravarExecucao() {			
		boolean sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.gravarExecucao();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 24)
	public void visualizar() {			
		ArrayList<Boolean> sucesso = execucaoDaConfiguracaoGeralFuncionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
