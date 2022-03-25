package com.timp.test.MDR.TabelasApoioESocial.Tabela29;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoDeTreinamentoESimulacoesDeExerciciosExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeTreinamentoESimulacoesDeExerciciosExcluirPO codigoDeTreinamentoESimulacoesDeExerciciosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeTreinamentoESimulacoesDeExerciciosExcluirPO = new CodigoDeTreinamentoESimulacoesDeExerciciosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoDeTreinamentoESimulacoesDeExerciciosExcluirPO.excluir();
		assertTrue(sucesso, Criar);
	}

}
