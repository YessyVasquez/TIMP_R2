package com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1070ProcessosAdmJudiciaisExcluirEmMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1070ProcessosAdmJudiciaisExcluirEmMassaPO s1070ProcessosAdmJudiciaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1070ProcessosAdmJudiciaisExcluirEmMassaPO = new S1070ProcessosAdmJudiciaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = s1070ProcessosAdmJudiciaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = s1070ProcessosAdmJudiciaisExcluirEmMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
