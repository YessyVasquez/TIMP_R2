package com.timp.test.TDK.Kpis.MeusRelatoriosKpis.MeusFavoritos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.MeusRelatoriosKpis.MeusFavoritos.KpisMeusFavoritosFiltroPorIDPO;

public class KpisMeusFavoritosFiltroPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisMeusFavoritosFiltroPorIDPO kpisMeusFavoritosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisMeusFavoritosFiltroPorIDPO = new KpisMeusFavoritosFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = kpisMeusFavoritosFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
