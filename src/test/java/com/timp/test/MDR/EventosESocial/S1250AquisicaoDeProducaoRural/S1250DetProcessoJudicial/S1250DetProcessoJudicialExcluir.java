package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetProcessoJudicial.S1250DetProcessoJudicialExcluirPO;

public class S1250DetProcessoJudicialExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetProcessoJudicialExcluirPO s1250DetProcessoJudicialExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetProcessoJudicialExcluirPO = new S1250DetProcessoJudicialExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250DetProcessoJudicialExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
