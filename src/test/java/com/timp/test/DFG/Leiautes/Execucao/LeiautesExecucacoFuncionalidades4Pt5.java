package com.timp.test.DFG.Leiautes.Execucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt4PO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt5PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LeiautesExecucacoFuncionalidades4Pt5 extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucacoFuncionalidades4Pt5PO leiautesExecucacoFuncionalidades4Pt5PO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucacoFuncionalidades4Pt5PO = new LeiautesExecucacoFuncionalidades4Pt5PO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();
	}
	
/*	@Test(priority = 2)
	public void criar() {
		ArrayList<Boolean> sucesso =leiautesExecucacoFuncionalidades4Pt5PO.criarLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 2)
	public void separadores() {
		leiautesExecucacoFuncionalidades4Pt5PO.separadores();
	}
	
	@Test(priority = 3)
	public void dataInicialDeReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.dataInicialDeReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 4)
	public void saltodeLinha() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.saltodeLinha();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 5)
	public void dataFinalDeReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.dataFinalDeReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 6)
	public void versao() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.versao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 7)
	public void horaDaExecucao() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.horaDaExecucao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 8)
	public void dataDaExecucao() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.dataDaExecucao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 9)
	public void periodoDaReferencia() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.periodoDaReferencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	
	
	
	
	@Test(priority = 10)
	public void campoFixo() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.campoFixo();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 11)
	public void campoFixoManual() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.campoFixoManual();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 12)
	public void sequencia() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.sequencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 13)
	public void sequenciaDeItemPorDocumento() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.sequenciaDeItemPorDocumento();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
*/	
	@Test(priority = 14)
	public void distinto() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.distinto();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 15)
	public void comparar() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.comparar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 16)
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.criarConfiguracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	

	@Test(priority = 17)
	public void executar() {
		leiautesExecucacoFuncionalidades4Pt5PO.executar();
//		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.executar();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Criar);
//		}
	}
	
	@Test(priority = 18)
	public void verBloco1() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.verBloco1();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 19)
	public void verBloco2() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.verBloco2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 20)
	public void verBloco3() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.verBloco3();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 21)
	public void verBloco4() {
		leiautesExecucacoFuncionalidades4Pt5PO.verBloco4();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.verBloco4();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 22)
	public void verBloco5() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.verBloco5();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 23)
	public void excluirConfiguracao() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.excluirConfiguracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 24)
	public void excluirLeiaute() {
		//leiautesExecucacoFuncionalidades4Pt5PO.verSaltoLinha();
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.excluirLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

}
