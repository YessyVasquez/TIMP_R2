package com.timp.test.DFG.LeiautesExecução;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.LeiautesExecução.LeiautesExecuçãoFuncionalidades3PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LeiautesExecuçãoFuncionalidades3 extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecuçãoFuncionalidades3PO leiautesExecuçãoFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecuçãoFuncionalidadesPO = new  LeiautesExecuçãoFuncionalidades3PO();
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
	public void DFGEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void RaizID() {
		leiautesExecuçãoFuncionalidadesPO.ID();

	}

	@Test(priority = 3)
	public void CriarLeiaute() {

		ArrayList<Boolean> sucesso =  leiautesExecuçãoFuncionalidadesPO.Criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
	}

	@Test(priority = 4)
	public void bloco() {

		ArrayList<Boolean> sucesso =  leiautesExecuçãoFuncionalidadesPO.bloco();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}


	}

	@Test(priority = 5)
	public void relaciona() {

		ArrayList<Boolean> sucesso =  leiautesExecuçãoFuncionalidadesPO.Relacionamento();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}

	}
	
	
	@Test(priority = 6)
	public void ListarRegistros() {

		ArrayList<Boolean> sucesso =  leiautesExecuçãoFuncionalidadesPO.ListarRegistros();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}

	}
	
	@Test(priority = 7)
	public void TotaldeLinhasAgrupadas() {

		leiautesExecuçãoFuncionalidadesPO.TotaldeLinhasAgrupadas();
		/*ArrayList<Boolean> sucesso =  leiautesExecuçãoFuncionalidadesPO.TotaldeLinhasAgrupadas();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}*/

	}


}
