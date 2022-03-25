package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralCriarPO;

public class S1250AquisicaoDeProducaoRuralCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisicaoDeProducaoRuralCriarPO s1250AquisicaoDeProducaoRuralCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisicaoDeProducaoRuralCriarPO = new S1250AquisicaoDeProducaoRuralCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250AquisicaoDeProducaoRuralCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
