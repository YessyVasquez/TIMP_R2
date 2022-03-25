package com.timp.test.TDK.Kpis.ParâmetrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraPO;

public class KpisLixeira extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraPO kpisLixeiraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraPO = new KpisLixeiraPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void lixeira() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisLixeiraPO.lixeira();
		assertTrue(sucesso, Eliminado);
	}
}
