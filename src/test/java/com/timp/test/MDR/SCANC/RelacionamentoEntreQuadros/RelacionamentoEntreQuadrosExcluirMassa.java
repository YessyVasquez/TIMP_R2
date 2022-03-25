package com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RelacionamentoEntreQuadrosExcluirMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RelacionamentoEntreQuadrosExcluirMassaPO relacionamentoEntreQuadrosExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		relacionamentoEntreQuadrosExcluirMassaPO = new RelacionamentoEntreQuadrosExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = relacionamentoEntreQuadrosExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);

		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = relacionamentoEntreQuadrosExcluirMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
