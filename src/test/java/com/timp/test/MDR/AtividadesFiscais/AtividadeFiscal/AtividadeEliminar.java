package com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;

public class AtividadeEliminar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeEliminarPO atividadeEliminarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeEliminarPO = new AtividadeEliminarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void eliminar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = atividadeEliminarPO.eliminar();

		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
