package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialEditarPO;

public class S1250DetProcessoJudicialEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetProcessoJudicialEditarPO s1250DetProcessoJudicialEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetProcessoJudicialEditarPO = new S1250DetProcessoJudicialEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250DetProcessoJudicialEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
