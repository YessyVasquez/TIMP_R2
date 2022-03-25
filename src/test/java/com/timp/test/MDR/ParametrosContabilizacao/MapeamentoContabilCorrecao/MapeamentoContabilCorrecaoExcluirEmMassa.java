package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoExcluirEmMassaPO;

public class MapeamentoContabilCorrecaoExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoContabilCorrecaoExcluirEmMassaPO mapeamentoContabilCorrecaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoContabilCorrecaoExcluirEmMassaPO = new MapeamentoContabilCorrecaoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = mapeamentoContabilCorrecaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "Criar")
	public void ExcluirMassa() {

		boolean sucesso2 = mapeamentoContabilCorrecaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
