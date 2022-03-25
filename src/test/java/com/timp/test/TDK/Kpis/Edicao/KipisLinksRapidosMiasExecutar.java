package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisLinksRapidosMaisExecutarPO;

public class KipisLinksRapidosMiasExecutar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLinksRapidosMaisExecutarPO kpisLinksRapidosMaisExecutarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLinksRapidosMaisExecutarPO = new KpisLinksRapidosMaisExecutarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void linksrapidos() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = kpisLinksRapidosMaisExecutarPO.linksrapidos();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Não foi possível adicionar o link rápido");
		}
	}
}
