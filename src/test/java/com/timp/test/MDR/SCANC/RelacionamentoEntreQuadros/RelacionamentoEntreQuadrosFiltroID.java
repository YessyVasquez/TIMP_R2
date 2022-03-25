package com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosFiltroIdPO;

public class RelacionamentoEntreQuadrosFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RelacionamentoEntreQuadrosFiltroIdPO relacionamentoEntreQuadrosFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		relacionamentoEntreQuadrosFiltroIdPO = new RelacionamentoEntreQuadrosFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	 * @Test(priority = 0) public void login() { loginTC.login();
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void acessarMDR() {
	 * 
	 * acessarMDRPO.acessarMDR();
	 * 
	 * }
	 */

	@Test()
	public void filtro() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = relacionamentoEntreQuadrosFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);
	}
}
