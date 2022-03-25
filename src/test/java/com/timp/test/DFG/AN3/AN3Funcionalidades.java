package com.timp.test.DFG.AN3;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.AN3.AN3FuncionalidadesPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesCriarPO;


public class AN3Funcionalidades extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	AN3FuncionalidadesPO an3FuncionalidadesPO;
	AcessarBREPO acessarBREPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		an3FuncionalidadesPO = new AN3FuncionalidadesPO();
		acessarBREPO = new AcessarBREPO();
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
		ArrayList<Boolean> sucesso =an3FuncionalidadesPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 3)
	public void BREEntrar() {
		acessarBREPO.acessarBRE();
	}
	@Test(priority = 4)
	public void BRE() {
		ArrayList<Boolean> sucesso =an3FuncionalidadesPO.BRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

	@Test(priority = 5)
	public void DFG() {
		ArrayList<Boolean> sucesso =an3FuncionalidadesPO.DFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

	
	@Test(priority = 6)
	public void ExecucaoDFG() {
		ArrayList<Boolean> sucesso =an3FuncionalidadesPO.execucao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 7)
	public void Arquivos() {
		ArrayList<Boolean> sucesso =an3FuncionalidadesPO.arquivos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	

	
	@Test(priority = 8)
	public void AN3() {
		
		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.DFGAN3();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	
	}

	@Test(priority = 9)
	public void publicoyPrivado() {
		
		boolean sucesso = an3FuncionalidadesPO.publicoYPrivado();

		assertTrue(sucesso, descompartilharB);

	
	}

	@Test(priority = 10)
	public void favorito() {
		
		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.favorito();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Favoritos);
		}

	
	}

	@Test(priority = 11)
	public void editar() {
		
		boolean sucesso = an3FuncionalidadesPO.editar();
		
		assertTrue(sucesso, Editar);

	
	}
	
	

	
	@Test(priority = 12)
	public void informacao() {
		
		boolean sucesso = an3FuncionalidadesPO.informacao();
		
		assertTrue(sucesso, Editar);

	
	}
	
	
	
	@Test(priority = 12)
	public void criarPastas() {
		
		boolean sucesso = an3FuncionalidadesPO.criarPasta();
		
		assertTrue(sucesso, Criar);

	
	}
	
	

	@Test(priority = 13)
	public void moverPasta() {
		
		boolean sucesso = an3FuncionalidadesPO.moverPasta();
		
		assertTrue(sucesso, Criar);

	
	}
	

	
	@Test(priority = 14)
	public void criarAN3Pasta2() {

		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.criarAN3Pasta2();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

	@Test(priority = 15)
	public void editarPasta() {
			
		boolean sucesso = an3FuncionalidadesPO.editarAN3Pasta2();
			
		assertTrue(sucesso, editado);

		
	}
	
	@Test(priority = 16)
	public void excluirPasta() {
			
		boolean sucesso = an3FuncionalidadesPO.excluirPasta();
			
		assertTrue(sucesso, Eliminado);

		
	}

	@Test(priority = 17)
	public void excluirDFGConf() {
		
		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.excluirDFGConf();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	
	}
	

	@Test(priority = 18)
	public void excluirDFG() {
		
		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.excluirDFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	

	@Test(priority = 19)
	public void excluirBRE() {
		
		ArrayList<Boolean> sucesso = an3FuncionalidadesPO.excluirBRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	
	}

	
}
