package com.timp.test.MDR.Reinf.ProcessosAdmJudiciais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisCriarPO;

public class ProcessosAdmJudiciaisCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProcessosAdmJudiciaisCriarPO processosAdmJudiciaisCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		processosAdmJudiciaisCriarPO = new ProcessosAdmJudiciaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = processosAdmJudiciaisCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
