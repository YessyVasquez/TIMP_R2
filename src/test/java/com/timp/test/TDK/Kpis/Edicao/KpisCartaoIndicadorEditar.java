package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisCartaoIndicadorEditarPO;

public class KpisCartaoIndicadorEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCartaoIndicadorEditarPO kpisCartaoIndicadorEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCartaoIndicadorEditarPO = new KpisCartaoIndicadorEditarPO();
	}
	
	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void CartaoIndicador() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisCartaoIndicadorEditarPO.CartaoIndicador();
		assertTrue(sucesso, Editar);
	}
}
