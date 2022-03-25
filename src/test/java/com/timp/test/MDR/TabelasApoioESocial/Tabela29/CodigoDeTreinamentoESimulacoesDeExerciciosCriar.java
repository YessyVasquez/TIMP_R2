package com.timp.test.MDR.TabelasApoioESocial.Tabela29;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosCriarPO;

public class CodigoDeTreinamentoESimulacoesDeExerciciosCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeTreinamentoESimulacoesDeExerciciosCriarPO codigoDeTreinamentoESimulacoesDeExerciciosCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeTreinamentoESimulacoesDeExerciciosCriarPO = new CodigoDeTreinamentoESimulacoesDeExerciciosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoDeTreinamentoESimulacoesDeExerciciosCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
