package com.timp.test.TDK.Kpis.Lixeira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraExcluirPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisLixeiraExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraExcluirPO kpisLixeiraExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraExcluirPO = new KpisLixeiraExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void lixeira() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisLixeiraExcluirPO.lixeira();
		assertTrue(sucesso, Eliminado);
	}
}
