package com.timp.test.MDR.TabelasApoioESocial.Tabela29;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO;

public class CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO = new CodigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = codigoDeTreinamentoESimulacoesDeExerciciosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
