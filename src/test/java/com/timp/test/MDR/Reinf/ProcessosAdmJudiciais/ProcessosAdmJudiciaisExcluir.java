package com.timp.test.MDR.Reinf.ProcessosAdmJudiciais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluirPO;

public class ProcessosAdmJudiciaisExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProcessosAdmJudiciaisExcluirPO processosAdmJudiciaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		processosAdmJudiciaisExcluirPO = new ProcessosAdmJudiciaisExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = processosAdmJudiciaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
