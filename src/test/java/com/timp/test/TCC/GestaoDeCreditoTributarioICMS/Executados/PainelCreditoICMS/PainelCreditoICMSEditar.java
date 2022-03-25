package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS.PainelCreditoICMSEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class PainelCreditoICMSEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelCreditoICMSEditarPO painelCreditoICMSEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelCreditoICMSEditarPO = new PainelCreditoICMSEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = painelCreditoICMSEditarPO.editar();
		assertTrue(sucesso, Criar);
	}
}
