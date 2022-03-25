package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "Criar")
	public void Excluir() {

		sleep(1000);
		boolean sucesso2 = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
