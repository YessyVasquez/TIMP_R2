package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilExcluirEmMassaPO;

public class MapeamentoContabilExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoContabilExcluirEmMassaPO mapeamentoContabilExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoContabilExcluirEmMassaPO = new MapeamentoContabilExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
	//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = mapeamentoContabilExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void Excluir() {

		boolean sucesso2 = mapeamentoContabilExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
