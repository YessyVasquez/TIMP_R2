package com.timp.test.MDR.ThinCapitalization.Emprestimos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Emprestimos.EmprestimosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EmprestimosEditar extends TestBaseKenssy {
   
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	EmprestimosEditarPO emprestimosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		emprestimosEditarPO = new EmprestimosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarEmprestimos() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = emprestimosEditarPO.editarEmprestimos();
		assertTrue(sucesso, Editar);
	}

}
