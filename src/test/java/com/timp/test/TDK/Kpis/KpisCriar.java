package com.timp.test.TDK.Kpis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class KpisCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCriarPO kpisCriarP;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCriarP = new KpisCriarPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisCriarP.Criar();
		assertTrue(sucesso, Criar);
	}
}
