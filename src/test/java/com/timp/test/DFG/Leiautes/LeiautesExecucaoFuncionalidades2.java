package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.AN3.AN3FuncionalidadesPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesCriarPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecucaoFuncionalidades2PO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;



public class LeiautesExecucaoFuncionalidades2 extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucaoFuncionalidades2PO leiautesExecucaoFuncionalidades2PO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucaoFuncionalidades2PO = new LeiautesExecucaoFuncionalidades2PO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		ArrayList<Boolean> sucesso =leiautesExecucaoFuncionalidades2PO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

	@Test(priority = 3)
	public void BRE() {
		ArrayList<Boolean> sucesso =leiautesExecucaoFuncionalidades2PO.BRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
		
	@Test(priority = 3)
	public void EditarDFG() {
		
		leiautesExecucaoFuncionalidades2PO.DFGEditar();
		
	
	}
	
	@Test(priority = 4)
	public void regraOcultacao() {
		
		leiautesExecucaoFuncionalidades2PO.regrasDeOcultacao();
		
	
	}
	
	@Test(priority = 5)
	public void totalDeBloco() {
		
		leiautesExecucaoFuncionalidades2PO.totalDeBloco();
		
	
	}
	
	
	@Test(priority = 6)
	public void totalDeRegistro() {
		
		leiautesExecucaoFuncionalidades2PO.totalDeRegistro();
		
	
	}
	
	
	@Test(priority = 7)
	public void totalDeForma() {
		
		leiautesExecucaoFuncionalidades2PO.totalDeForma();
		
	
	}
	
	
	@Test(priority = 8)
	public void concatenacao() {
		
		leiautesExecucaoFuncionalidades2PO.concatenacao();
		
	
	}
	
	
	@Test(priority = 9)
	public void contadorDeRegistro() {
		
		leiautesExecucaoFuncionalidades2PO.contadorRegistro();
		
	
	}
	

	@Test(priority = 10)
	public void criarConfiguracao() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.configuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	
	}
		

	@Test(priority = 11)
	public void execucao() {
		
		leiautesExecucaoFuncionalidades2PO.execucao();
		
	
	}
	
	
	@Test(priority = 12)
	public void verificacaoBloco1() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco1();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		
	
	}

	@Test(priority = 13)
	public void verificacaoBloco2() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertFalse(sucesso.get(i), Filtros);
		}
		
	
	}
	
	
	@Test(priority = 14)
	public void verificacaoBloco3() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco3();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		
	
	}
	
	@Test(priority = 15)
	public void verificacaoBloco4() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco4();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		
	
	}
	
	
	@Test(priority = 16)
	public void verificacaoBloco5() {
		
		boolean sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco5();

		assertTrue(sucesso, Filtros);
	
		
	
	}
		
	@Test(priority = 17)
	public void verificacaoBloco6() {
		
		boolean sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco6();

		assertTrue(sucesso, Filtros);
	
		
	
	}
	
	@Test(priority = 18)
	public void verificacaoBloco7() {
		
		boolean sucesso = leiautesExecucaoFuncionalidades2PO.verificaoDadosBloco7();

		assertTrue(sucesso, Filtros);
	
		
	
	}
	
	
	@Test(priority = 19)
	public void excluirConfiguracao() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.excluirDFGConf();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
	
	}
	
	@Test(priority = 20)
	public void excluirDFG() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.excluirDFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
	
	}
	
	@Test(priority = 21)
	public void excluirBRE() {
		
		ArrayList<Boolean> sucesso = leiautesExecucaoFuncionalidades2PO.excluirBRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
	
	}
	
}