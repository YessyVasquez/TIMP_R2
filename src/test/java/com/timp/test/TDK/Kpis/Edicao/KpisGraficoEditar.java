package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisGraficoEditarPO;

public class KpisGraficoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisGraficoEditarPO kpisGraficoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisGraficoEditarPO = new KpisGraficoEditarPO();
	}
	
	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Grafico() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisGraficoEditarPO.Grafico();
		assertTrue(sucesso, Editar);
	}
}
