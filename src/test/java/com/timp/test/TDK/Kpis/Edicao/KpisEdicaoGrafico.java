package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisEdicaoGraficoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisEdicaoGrafico extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisEdicaoGraficoPO kpisEdicaoGraficoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisEdicaoGraficoPO = new KpisEdicaoGraficoPO();
	}
	
	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Grafico() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		kpisEdicaoGraficoPO.Grafico();
	}
}
