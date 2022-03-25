package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial.S1250InfProcJudicialEditarPO;

public class S1250InfProcJudicialEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250InfProcJudicialEditarPO s1250InfProcJudicialEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250InfProcJudicialEditarPO = new S1250InfProcJudicialEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250InfProcJudicialEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
