package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200.Executados1200EditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Executados1200Editar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Executados1200EditarPO executados1200EditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		executados1200EditarPO = new Executados1200EditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = executados1200EditarPO.editar();
		assertTrue(sucesso, Criar);
	}

}
