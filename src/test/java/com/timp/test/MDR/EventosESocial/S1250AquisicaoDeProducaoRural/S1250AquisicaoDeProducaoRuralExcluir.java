package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisicaoDeProducaoRuralExcluirPO;

public class S1250AquisicaoDeProducaoRuralExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisicaoDeProducaoRuralExcluirPO s1250AquisicaoDeProducaoRuralExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisicaoDeProducaoRuralExcluirPO = new S1250AquisicaoDeProducaoRuralExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250AquisicaoDeProducaoRuralExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
