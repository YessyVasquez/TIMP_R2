package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS.PainelCreditoICMSExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelCreditoICMSExcluir extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelCreditoICMSExcluirPO painelCreditoICMSExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelCreditoICMSExcluirPO = new PainelCreditoICMSExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void excluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> sucesso = painelCreditoICMSExcluirPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}

}
