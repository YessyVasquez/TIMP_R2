package com.timp.test.MDR.Antecipacao;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoEliminarPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasViasualizarPO;

public class AntecipacaoEliminar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AntecipacaoEliminarPO antecipacaoEliminarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		antecipacaoEliminarPO = new AntecipacaoEliminarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = antecipacaoEliminarPO.eliminar();

		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
