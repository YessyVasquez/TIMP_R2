package com.timp.test.TDK.Kpis.Lixeira;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Lixeira.LixeiraFiltroPorIDPO;

public class LixeiraFiltroPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	LixeiraFiltroPorIDPO lixeiraFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		lixeiraFiltroPorIDPO = new LixeiraFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = lixeiraFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
